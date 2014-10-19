<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"  
"http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
<title><tiles:insertAttribute name="title" ignore="true" />  
</title>  
<script type="text/javascript" src="./js/jquery-1.11.1.js"></script>
<link rel="stylesheet" href="http://code.jquery.com/ui/1.11.2/themes/smoothness/jquery-ui.css" />
<script src="http://code.jquery.com/ui/1.11.2/jquery-ui.js"></script>
</head>  
<body>  
    <table cellspacing="2" align="center" width="1100" height="600" style="border:1px solid gray">  
        <tr>  
            <td height="20%" width="100%" colspan="2" style="border-bottom:1px solid gray; background-color: #1947D1"><tiles:insertAttribute name="header" />  
            </td>  
        </tr>  
        <tr>  
            <td height="60%" width="15%" ><tiles:insertAttribute name="menu" />  
            </td>  
            <td width="80%" style="border-left:1px solid gray"><tiles:insertAttribute name="body" />  
            </td>  
        </tr>  
        <tr>  
            <td height="20%" width="100%" colspan="2" style="border-top:1px solid gray"><tiles:insertAttribute name="footer" />  
            </td>  
        </tr>  
    </table>  
</body>  
</html>  