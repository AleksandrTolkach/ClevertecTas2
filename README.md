# Task2. Gradle

## Основная задача

- Установить Gradle
- Проект должен быть совместим с java 17
- Создать файл.jar, например, `utils-1.3.5.jar`
- Манифест файл должен содержать имя и версию вашего .jar файла 
- В вашем .jar файле должен быть class `StringUtils` с методом boolean `isPositiveNumber(String str)`
- Написать один unit test для проверки этого метода (использовать JUnit 5).

## Дополнительная задача  

- Сделать gradle плагин, который также опубликовать и подключить к проекту, например плагин по формированию отчёта
- Создать мульти-модульный проект с двумя модулями: `core`, `api`
- В модуле core должен быть class `Utils` с методом boolean `isAllPositiveNumbers(String… str)`
- Использовать `utils-1.3.5.jar`сделанный на предыдущих этапах, для возможности переиспользовать метод boolean isPositiveNumber(String str) в модуле core
- В модуле `api` должен быть class `App` с методом `main`. 
- Из модуля `api` в методе main вызвать `Utils.isAllPositiveNumbers("12", "79")`
- Написать один unit test для проверки этого метода `boolean isAllPositiveNumbers(String… str)` (использовать JUnit 5).

## Запуск приложения  

Для запуска приложения в корне проекта необходимо запустить команду `./gradlew build`.  
После чего выполнить команду `java -jar build/libs/basic-1.0.1.jar`.