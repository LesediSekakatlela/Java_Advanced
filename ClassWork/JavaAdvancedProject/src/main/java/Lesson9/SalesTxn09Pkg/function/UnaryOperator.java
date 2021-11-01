package Lesson9.SalesTxn09Pkg.function;

public interface UnaryOperator<T> extends Function<T,T> {
    @Override
    public T apply(T t);
}