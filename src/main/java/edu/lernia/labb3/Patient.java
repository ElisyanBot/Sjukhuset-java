package edu.lernia.labb3;

class Patient {
  String name;
  String sickness;

  Patient(String name) {
    this.name = name;
  }

  Patient(String name, String sickness) {
    this.name = name;
    this.sickness = sickness;
  }

  String getName() {
    return this.name;
  };

  String getSickness() {
    return this.sickness;
  };

  Boolean isSick() {
    if(this.sickness == null) {
      return false;
    } else {
      return true;
    }
  }

  void takeMedication(Medicine m) {
    if(this.sickness == m.getTreatmentName()){
      this.sickness = null;
    }
  }
}
