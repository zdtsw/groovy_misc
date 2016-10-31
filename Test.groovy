class Test {     
  // look up xml file from URL
  // return components' service value
  static compLookUp(String componentName) 
  {         
            // Use Test.xml as input from same dir or with real URL
	    def components = new XmlParser().parse("file:///Test.xml")
            return components.component.find { com ->
		  com.name.text() == componentName }.service.text()
  } 

  
  // Main method  
  static main(args) 
  {
	println compLookUp("componentA")
  }
}

