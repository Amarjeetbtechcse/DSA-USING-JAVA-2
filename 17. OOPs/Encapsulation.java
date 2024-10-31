public class Encapsulation {
    class Car {
        private String model; // private variable
    
        public String getModel() { // getter
            return model;
        }
    
        public void setModel(String model) { // setter
            this.model = model;
        }
    }
    
}
// Encapsulation is an OOP principle that bundles data (variables) and methods (functions) into a single unit (class) and restricts direct access to them. It helps protect data by allowing access only through controlled methods, like getters and setters. Encapsulation improves security, maintainability, and modularity by hiding the internal implementation details from other parts of the program