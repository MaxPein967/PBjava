class AmountException extends RuntimeException {
    public AmountException(int error) {
        super();
        switch (error) {
            case -1 -> System.out.println("Exception:Вы ввели меньше данных, чем нужно.");
            case -3 -> System.out.println("Exception:Вы ввели больше данных, чем нужно.");
        }
    }
}
