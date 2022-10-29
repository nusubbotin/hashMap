package multiplication;

import java.util.Objects;

public class multiplicationElement {
    private int operandA;
    private int operandB;

    public multiplicationElement(int operandA, int operandB) {
        this.operandA = operandA;
        this.operandB = operandB;
    }

    public int getOperandA() {
        return operandA;
    }

    public int getOperandB() {
        return operandB;
    }

    @Override
    public String toString() {
        return operandA + " * " + operandB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        multiplicationElement that = (multiplicationElement) o;
        return operandA == that.operandA && operandB == that.operandB;
    }

    @Override
    public int hashCode() {
        return Objects.hash(operandA, operandB);
    }
}
