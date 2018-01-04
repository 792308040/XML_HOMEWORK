<?xml version="1.0" encoding="ISO-8859-1"?>

<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template match="/">
<html>
<body>
<h2>XSLT_LX</h2>
<table border="1">
<tr bgcolor="#9acd32">
<th>Empno</th>
<th>Name</th>
<th>Designation</th>
</tr>
<xsl:for-each select="Team">
<tr>

<xsl:for-each select="TeamMember/Empno">

<td>
<xsl:value-of select="@value"/>
</td>
</xsl:for-each>

<xsl:for-each select="TeamMember/Name">
<td>
<xsl:value-of select="@value"/>
</td>
</xsl:for-each>

<xsl:for-each select="TeamMember/Designation">
<td>
<xsl:value-of select="@value"/>
</td>
</xsl:for-each>

</tr>

</xsl:for-each>
</table>
</body>
</html>
</xsl:template>

</xsl:stylesheet> 