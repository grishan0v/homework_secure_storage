# Secure Storage

OTUS Репозиторий домашней работы по безопасности

### Задание 1. Реализуйте безопасное хранение auth token:

1. Обязательно реализуйте шифрование полученного токена авторизации `AES` алгоритмом
2. Предусмотрите безопасное хранение ключа
3. Обеспечьте поддержку API < 23

###### _Дополнительно_
4. Используйте максимально безопастный режим шифрование (не `ECB`)

### Задание 2. Реализуйте вход используя биометрию:

1. Обязательно реализуйте метод onMeasure и учтите все возможные MeasureSpecs
2. Реализуйте механизм сохранения состояния внутри View
3. В качестве данных для визуализации используйте файл `payload.json`

###### _Дополнительно_
4. Реализовывать масштабирование/скроллинг/обработку тач евентов не нужно

Материаы, которыми можно пользоваться:

[otus_security](https://github.com/vitalyraevsky/otus_security)

[Документация по KeyStore](https://developer.android.com/training/articles/keystore)
