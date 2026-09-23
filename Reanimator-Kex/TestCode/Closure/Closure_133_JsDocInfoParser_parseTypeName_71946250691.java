package com.google.javascript.jscomp.parsing;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.parsing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.lang.String;

public class JsDocInfoParser_parseTypeName_71946250691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16923;
     Object enum196;

    public JsDocInfoParser_parseTypeName_71946250691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term16979 = new ArrayList();
        ((ArrayList) term16979).add((Object)null);
        ((ArrayList) term16979).add((Object)null);
        ((ArrayList) term16979).add((Object)null);
        ((ArrayList) term16979).add((Object)null);
        ((ArrayList) term16979).add((Object)null);
        ((ArrayList) term16979).add((Object)null);
        ((ArrayList) term16979).add((Object)null);
        ((ArrayList) term16979).add((Object)null);
        ArrayList term16982 = new ArrayList();
        ((ArrayList) term16982).add((Object)null);
        ((ArrayList) term16982).add((Object)null);
        HashMap term16985 = new HashMap();
        ArrayList term16990 = new ArrayList();
        ((ArrayList) term16990).add((Object)null);
        ((ArrayList) term16990).add((Object)null);
        ((ArrayList) term16990).add((Object)null);
        ((ArrayList) term16990).add((Object)null);
        Class<? extends Object> term113912 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term113911 = ((Class) term113912).getDeclaredField((String) "PUBLIC");
        ((Field) term113911).setAccessible(true);
        Object enum195 = ((Field) term113911).get((Object) null);
        term16923 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term16924 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term16937 = (char[]) newCharArray(3);
        int[] term16942 = (int[]) newIntArray(7);
        Object term16975 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term16976 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term16977 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term16978 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term16994 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term16995 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16997 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17000 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17003 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17011 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term17012 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17016 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term17017 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17024 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term17025 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term17030 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        setField(term16924, term16924.getClass(), "string", "llRfwANcVF");
        setCharElement(term16937, 0, 'J');
        setCharElement(term16937, 1, 'M');
        setCharElement(term16937, 2, 'x');
        setField(term16924, term16924.getClass(), "stringBuffer", term16937);
        setIntField(term16924, term16924.getClass(), "stringBufferTop", 1010721666);
        setIntElement(term16942, 0, 27043781);
        setIntElement(term16942, 1, -1367122405);
        setIntElement(term16942, 2, -1703625118);
        setIntElement(term16942, 3, 1104108112);
        setIntElement(term16942, 4, 1648665618);
        setIntElement(term16942, 5, 633765954);
        setIntElement(term16942, 6, 269110087);
        setField(term16924, term16924.getClass(), "ungetBuffer", term16942);
        setIntField(term16924, term16924.getClass(), "ungetCursor", 1545119095);
        setBooleanField(term16924, term16924.getClass(), "hitEOF", false);
        setIntField(term16924, term16924.getClass(), "lineStart", 1671229683);
        setIntField(term16924, term16924.getClass(), "lineEndChar", 34167717);
        setIntField(term16924, term16924.getClass(), "lineno", -514195141);
        setIntField(term16924, term16924.getClass(), "charno", -297946422);
        setIntField(term16924, term16924.getClass(), "initCharno", 385463636);
        setIntField(term16924, term16924.getClass(), "initLineno", -1677599962);
        setField(term16924, term16924.getClass(), "sourceString", "sUEeHQTWkA");
        setIntField(term16924, term16924.getClass(), "sourceEnd", -1790275458);
        setIntField(term16924, term16924.getClass(), "sourceCursor", -497534255);
        setIntField(term16924, term16924.getClass(), "cursor", 1588942911);
        setIntField(term16924, term16924.getClass(), "tokenBeg", -2129828854);
        setIntField(term16924, term16924.getClass(), "tokenEnd", -47438786);
        setField(term16923, term16923.getClass(), "stream", term16924);
        setField(term16978, term16978.getClass(), "root", null);
        setField(term16978, term16978.getClass(), "sourceName", null);
        setField(term16977, term16977.getClass(), "baseType", term16978);
        setField(term16977, term16977.getClass(), "extendedInterfaces", term16979);
        setField(term16977, term16977.getClass(), "implementedInterfaces", term16982);
        setField(term16977, term16977.getClass(), "parameters", term16985);
        setField(term16977, term16977.getClass(), "thrownTypes", term16990);
        setField(term16977, term16977.getClass(), "templateTypeNames", null);
        setField(term16977, term16977.getClass(), "classTemplateTypeNames", null);
        setField(term16977, term16977.getClass(), "description", null);
        setField(term16977, term16977.getClass(), "meaning", null);
        setField(term16977, term16977.getClass(), "deprecated", null);
        setField(term16977, term16977.getClass(), "license", null);
        setField(term16977, term16977.getClass(), "suppressions", null);
        setField(term16977, term16977.getClass(), "modifies", null);
        setField(term16977, term16977.getClass(), "lendsName", null);
        setBooleanField(term16977, term16977.getClass(), "ngInject", false);
        setField(term16976, term16976.getClass(), "info", term16977);
        setField(term16994, term16994.getClass(), "sourceComment", null);
        setField(term16994, term16994.getClass(), "markers", null);
        setField(term16994, term16994.getClass(), "parameters", null);
        setField(term16994, term16994.getClass(), "throwsDescriptions", null);
        setField(term16994, term16994.getClass(), "blockDescription", null);
        setField(term16994, term16994.getClass(), "fileOverview", null);
        setField(term16994, term16994.getClass(), "returnDescription", null);
        setField(term16994, term16994.getClass(), "version", null);
        setField(term16994, term16994.getClass(), "authors", null);
        setField(term16994, term16994.getClass(), "sees", null);
        setField(term16976, term16976.getClass(), "documentation", term16994);
        setIntField(term16995, term16995.getClass(), "type", 1053773809);
        setIntField(term16997, term16997.getClass(), "type", 0);
        setField(term16997, term16997.getClass(), "next", null);
        setField(term16997, term16997.getClass(), "first", null);
        setField(term16997, term16997.getClass(), "last", null);
        setField(term16997, term16997.getClass(), "propListHead", null);
        setIntField(term16997, term16997.getClass(), "sourcePosition", 0);
        setField(term16997, term16997.getClass(), "jsType", null);
        setField(term16997, term16997.getClass(), "parent", null);
        setField(term16995, term16995.getClass(), "next", term16997);
        setIntField(term17000, term17000.getClass(), "type", 0);
        setField(term17000, term17000.getClass(), "next", null);
        setField(term17000, term17000.getClass(), "first", null);
        setField(term17000, term17000.getClass(), "last", null);
        setField(term17000, term17000.getClass(), "propListHead", null);
        setIntField(term17000, term17000.getClass(), "sourcePosition", 0);
        setField(term17000, term17000.getClass(), "jsType", null);
        setField(term17000, term17000.getClass(), "parent", null);
        setField(term16995, term16995.getClass(), "first", term17000);
        setIntField(term17003, term17003.getClass(), "type", 0);
        setField(term17003, term17003.getClass(), "next", null);
        setField(term17003, term17003.getClass(), "first", null);
        setField(term17003, term17003.getClass(), "last", null);
        setField(term17003, term17003.getClass(), "propListHead", null);
        setIntField(term17003, term17003.getClass(), "sourcePosition", 0);
        setField(term17003, term17003.getClass(), "jsType", null);
        setField(term17003, term17003.getClass(), "parent", null);
        setField(term16995, term16995.getClass(), "last", term17003);
        setField(term16995, term16995.getClass(), "propListHead", null);
        setIntField(term16995, term16995.getClass(), "sourcePosition", 0);
        setField(term16995, term16995.getClass(), "jsType", null);
        setField(term16995, term16995.getClass(), "parent", null);
        setField(term16976, term16976.getClass(), "associatedNode", term16995);
        setField(term16976, term16976.getClass(), "visibility", enum195);
        setIntField(term16976, term16976.getClass(), "bitset", 924127883);
        setIntField(term17012, term17012.getClass(), "type", 626179200);
        setField(term17012, term17012.getClass(), "next", null);
        setField(term17012, term17012.getClass(), "first", null);
        setField(term17012, term17012.getClass(), "last", term16997);
        setField(term17012, term17012.getClass(), "propListHead", null);
        setIntField(term17012, term17012.getClass(), "sourcePosition", 0);
        setField(term17012, term17012.getClass(), "jsType", null);
        setField(term17012, term17012.getClass(), "parent", null);
        setField(term17011, term17011.getClass(), "root", term17012);
        setField(term17011, term17011.getClass(), "sourceName", "");
        setField(term16976, term16976.getClass(), "type", term17011);
        setIntField(term17017, term17017.getClass(), "type", 0);
        setField(term17017, term17017.getClass(), "next", null);
        setField(term17017, term17017.getClass(), "first", null);
        setField(term17017, term17017.getClass(), "last", null);
        setField(term17017, term17017.getClass(), "propListHead", null);
        setIntField(term17017, term17017.getClass(), "sourcePosition", 0);
        setField(term17017, term17017.getClass(), "jsType", null);
        setField(term17017, term17017.getClass(), "parent", null);
        setField(term17016, term17016.getClass(), "root", term17017);
        setField(term17016, term17016.getClass(), "sourceName", "");
        setField(term16976, term16976.getClass(), "thisType", term17016);
        setBooleanField(term16976, term16976.getClass(), "includeDocumentation", false);
        setField(term16975, term16975.getClass(), "currentInfo", term16976);
        setBooleanField(term16975, term16975.getClass(), "populated", false);
        setBooleanField(term16975, term16975.getClass(), "parseDocumentation", true);
        setField(term17025, term17025.getClass(), "item", null);
        setIntField(term17025, term17025.getClass(), "startLineno", 0);
        setIntField(term17025, term17025.getClass(), "startCharno", 0);
        setIntField(term17025, term17025.getClass(), "endLineno", 0);
        setIntField(term17025, term17025.getClass(), "endCharno", 0);
        setField(term17024, term17024.getClass(), "annotation", term17025);
        setField(term17030, term17030.getClass(), "item", null);
        setIntField(term17030, term17030.getClass(), "startLineno", 0);
        setIntField(term17030, term17030.getClass(), "startCharno", 0);
        setIntField(term17030, term17030.getClass(), "endLineno", 0);
        setIntField(term17030, term17030.getClass(), "endCharno", 0);
        setField(term17024, term17024.getClass(), "name", term17030);
        setField(term17024, term17024.getClass(), "nameNode", null);
        setField(term17024, term17024.getClass(), "description", null);
        setField(term17024, term17024.getClass(), "type", null);
        setField(term16975, term16975.getClass(), "currentMarker", term17024);
        setField(term16923, term16923.getClass(), "jsdocBuilder", term16975);
        setField(term16923, term16923.getClass(), "sourceFile", null);
        setField(term16923, term16923.getClass(), "associatedNode", term17000);
        setField(term16923, term16923.getClass(), "errorReporter", null);
        setField(term16923, term16923.getClass(), "parser", null);
        setField(term16923, term16923.getClass(), "templateNode", null);
        setField(term16923, term16923.getClass(), "fileOverviewJSDocInfo", null);
        setField(term16923, term16923.getClass(), "state", null);
        setField(term16923, term16923.getClass(), "annotationNames", null);
        setField(term16923, term16923.getClass(), "suppressionNames", null);
        setField(term16923, term16923.getClass(), "fileLevelJsDocBuilder", null);
        setField(term16923, term16923.getClass(), "unreadToken", null);
        Class<? extends Object> term114177 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term114176 = ((Class) term114177).getDeclaredField((String) "RB");
        ((Field) term114176).setAccessible(true);
        enum196 = ((Field) term114176).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum196;
        try {
            callMethod(klass, "parseTypeName", argTypes, term16923, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


