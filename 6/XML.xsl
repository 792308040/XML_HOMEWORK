<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:template match="/">
<html>
<body>
<h2>XSLT_LX</h2>
<xsl:apply-templates/>
</body>
</html>
</xsl:template>
<xsl:template match="Root">
<p>
<xsl:apply-templates select="First"/>
<xsl:apply-templates select="Second"/>
</p>
</xsl:template>
<xsl:template match="First">
First: 
<span style="color:#FF00FF">
<xsl:value-of select="."/>
</span>
<br/>
</xsl:template>
<xsl:template match="Second">
Second: 
<span style="color:#4B0082">
<xsl:value-of select="."/>
</span>
<br/>
</xsl:template>
</xsl:stylesheet>