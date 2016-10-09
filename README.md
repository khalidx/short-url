# short-url
A url shortener implementation using Java and the Spring Boot framework.

## Support
Please contact kzoabi@outlook.com for questions or suggestions.
You may also make changes yourself and open a pull request to have your changes merged.

## Generating a short url
### Request
POST / { "longUrl": "http://example.com/example/example-content/content.html" }
### Response
"http://example.com/cb29b3e9"

## Accessing the long url via the generated short url
### Request
GET /cb29b3e9
### Response
HTTP REDIRECT to http://example.com/example/example-content/content.html
