class allException extends NumberFormatException {
    public allException(int error) {
        super();
        switch (error) {
            case -0 -> System.out.println("Exception!");
            case -1 ->
                    System.out.println("Exception:В ФИО должны быть только буквенные значения.");
            case -2 ->
                    System.out.println("Exception:При вводе номера телефона должны быть 10 цифр.");
            case -3 ->
                    System.out.println("Exception:Дата должна быть в формате: dd.mm.yyyy");
            case -4 ->
                    System.out.println("Exception:Необходимо ввести либо f, либо m.");
        }
    }
}

