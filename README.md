# The Not Very Secure Mysql Cleartext Password Plugin

As it says on the tin, it's **not very secure**: it allows you to use the
cleartext password plugin without SSL. For obvious reasons you shouldn't use this
plugin unless the connection is encrypted at another layer, eg. through a VPN.

Note: this plugin depends on version 6.0.6 of Connector/J, which can be downloaded from Maven Central:
https://repo1.maven.org/maven2/mysql/mysql-connector-java/6.0.6/

To build, simply run `gradle build jar` in the top level directory.

## Use with IntelliJ

To use with IntelliJ, please use Connector/J 6.0.6 (you may need to load it through the 'Additional Files' dialog)
and then append the built jar file:

![IntelliJ screenshot](https://i.imgur.com/qqShQXZ.png)

Then, in the advanced settings tab of the connection you want to use this on,
set the plugin list and default plugin:

```
authenticationPlugins=com.nelsonjrodrigues.mysql.NotVerySecureMysqlClearPasswordPlugin
defaultAuthenticationPlugin=com.nelsonjrodrigues.mysql.NotVerySecureMysqlClearPasswordPlugin
```
