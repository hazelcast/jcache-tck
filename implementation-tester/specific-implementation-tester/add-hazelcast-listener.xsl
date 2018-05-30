<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet 
   xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
   xmlns:p="http://maven.apache.org/POM/4.0.0"
   version="1.0">

    <xsl:template match="@*|node()">
        <xsl:copy>
            <xsl:apply-templates select="@*|node()"/>
        </xsl:copy>
    </xsl:template>

   <xsl:template match="/p:project/p:build/p:plugins/p:plugin[p:artifactId='maven-surefire-plugin']/p:configuration">
      <xsl:copy>
         <xsl:apply-templates select="@*|node()"/>
         <properties>
            <property>
               <name>listener</name>
               <value>org.jsr107.tck.testutil.HazelcastClientRunListener</value>
            </property>
         </properties>
      </xsl:copy>
   </xsl:template>
</xsl:stylesheet>
