# myPom
maven-module结构项目demo

#maven-module多模块依赖项目在eclipse中搭建与开发

##一、Maven-module多模块依赖项目说明
Maven-module项目可以把较大的项目按照功能或者层次进行横向与纵向的模块化分割。项目结构是父项目–子模块的结构进行组织。整个项目以pom型项目进行组织，其模块可以是jar项目，也可以是war项目，也可以pom项目。合理的使用maven-module项目，可以是项目结构分明，同时提高了代码的复用性。

##二、Maven-module项目示例结构
本文以maven插件官方示例（具体地址请查看附录）为素材，进行了项目搭建、运行与打包。项目代码压缩包请查看附录。

Maven project structure

pom.xml          (top level pom with packaging pom)

my-api/pom.xml     (api project with packaging jar)

my-api-impl/pom.xml  (api implementation project with packaging jar)

my-webapp/pom.xml  	(webapp project with packaging war)

##三、Maven-module项目eclipse下使用tomcat启动
