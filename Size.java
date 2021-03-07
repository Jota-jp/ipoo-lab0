

public enum Size {

 SMALL(32, 36, "Pequeno",'S'),
 MEDIUM(37, 44, "Médio",'M'),
 LARGE(45, 52, "Grande",'L');
 private final String description;
 private final int minValue;
 private final int maxValue;
 private final char code;

 private Size(int minValue, int maxValue, String description, char code){
 this.description=description;
 this.minValue=minValue;
 this.maxValue=maxValue;
 this.code=code;
 }
 @Override
 public String toString() {
 return this.description;
 }
 //retornar descrição
 public String getDescription() {
 return description;
 }
 //retornar valor mínimo
 public int getMinValue() {
 return minValue;
 }
 //retornar valor máximo
 public int getMaxValue() {
 return maxValue;
 }
 //retornar Letra de Código
 public char getCode() {
 return code;
 }

}
