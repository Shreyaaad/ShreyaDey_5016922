package BuilderPatternExample;

public class Computer {
    
    private String CPU;
    private String RAM;

   
    private String storage;
    private String graphicsCard;
    private String powerSupply;
    private String coolingSystem;
    private String caseType;

    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.powerSupply = builder.powerSupply;
        this.coolingSystem = builder.coolingSystem;
        this.caseType = builder.caseType;
    }

    public static class Builder {
      
        private String CPU;
        private String RAM;

  
        private String storage;
        private String graphicsCard;
        private String powerSupply;
        private String coolingSystem;
        private String caseType;

        public Builder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Builder setPowerSupply(String powerSupply) {
            this.powerSupply = powerSupply;
            return this;
        }

        public Builder setCoolingSystem(String coolingSystem) {
            this.coolingSystem = coolingSystem;
            return this;
        }

        public Builder setCaseType(String caseType) {
            this.caseType = caseType;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", storage=" + storage + 
               ", graphicsCard=" + graphicsCard + ", powerSupply=" + powerSupply + 
               ", coolingSystem=" + coolingSystem + ", caseType=" + caseType + "]";
    }
}
