# `spring-security-5.x`

## Exploring the spring security version 5.x (5.2.6.RELEASE).

# `basic-web-app`

### This is a basic web application following the layered application standard.

# `Spring dependencies Dependencies`

**To apply security in our application we will be needing Spring dependencies.**

## Core Dependencies:

`spring-security-core`: The core module of Spring Security that provides basic security features.

## Web Dependencies:

`spring-security-web`: Includes web-specific security features, such as authentication filters & support for handling HTTP security.

`spring-security-config`: Provides configuration support for web-based security. This module also used to use the Spring Security XML namespace.

## Authentication Dependencies:

`spring-security-ldap`: Enables integration with LDAP (Lightweight Directory Access Protocol) for authentication.

`spring-security-oauth2`: Adds support for OAuth2 authentication and authorization.

`spring-security-oauth2-client`: Enables OAuth2 client support.

`spring-security-oauth2-resource-server`: Supports OAuth2 resource server capabilities.

## Test Dependencies:

`spring-security-test`: Provides testing utilities for Spring Security applications.

## Additional Dependencies:

`spring-security-crypto`: Provides cryptographic utility classes.

`spring-security-jwt`: Adds support for JSON Web Tokens (JWT) in Spring Security.

# `Configuring Security Dependencies`

When working with Spring Security, it's essential to ensure that we use compatible versions of Spring Security & other Spring modules to avoid potential compatibility issues.

**security release/dependencies is not sync with other spring module**

```xml
<dependencies>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>5.2.6.RELEASE</version>
        </dependency>
        <dependency>
            <groupId>org.springframework.security</groupId>
            <artifactId>spring-security-web</artifactId>
            <version>5.3.3.RELEASE</version>
        </dependency>
        <dependency>
            <groupId>org.springframework.security</groupId>
            <artifactId>spring-security-config</artifactId>
            <version>5.3.3.RELEASE</version>
        </dependency>
</dependencies>
```

Here i'm using spring security version `5.3.3.RELEASE` , but using the webmvc version of 5.2.6.RELEASE. Because spring-security internally using spring 5.2.6.RELEASE version.

# web-security-setup-check

1. Added required dependencies
2. Registered SpringSecurityFilterChain
3. Get the default sign in form
