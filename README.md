# Multithreading
- в приложение должно быть реализовано два потока:
первый поток считывает введённые с клавиатуры числительные на английском языке
(от one до nine thousand nine hundred ninety nine) и помещает их в память,
второй поток обращается к памяти один раз в пять секунд, извлекает (удаляет его из
памяти) самое маленькое из записанных чисел и выводит его на экран;
- задачу запрещается решать с помощью потокобезопасных коллекций как из стандартного пакета,
так и от сторонних разработчиков.
## Запуск приложения
Данная программа писалась в Intellij Idea.
* Значения вводятся английскими строчными буквами (допустимые значения можно посмотреть в классе Number);
* Каждые 5 секунд происходит сравнение введенных значений и выводится наименьшее из них;
* Для остановки введите "stop" - так же строчными буквами;

***Советую использовать git clone, чтобы скачать репозиторий целиком***
