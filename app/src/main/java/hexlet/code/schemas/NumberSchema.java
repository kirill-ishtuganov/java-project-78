package hexlet.code.schemas;

public class NumberSchema extends BaseSchema<Integer> {

    public final NumberSchema positive() {
        addValidation("positive", input -> input == null || input > 0);
        return this;
    }

    public final NumberSchema range(int min, int max) {
        addValidation("range", input -> input == null || min <= input && input <= max);
        return this;
    }
}
