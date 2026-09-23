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

public class JsDocInfoParser_parseTypeExpressionList_121498987788 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14903;
     Object enum190;

    public JsDocInfoParser_parseTypeExpressionList_121498987788() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term14958 = new ArrayList();
        ((ArrayList) term14958).add((Object)null);
        ((ArrayList) term14958).add((Object)null);
        ((ArrayList) term14958).add((Object)null);
        ((ArrayList) term14958).add((Object)null);
        ((ArrayList) term14958).add((Object)null);
        ArrayList term14961 = new ArrayList();
        ((ArrayList) term14961).add((Object)null);
        HashMap term14964 = new HashMap();
        ArrayList term14969 = new ArrayList();
        ((ArrayList) term14969).add((Object)null);
        ((ArrayList) term14969).add((Object)null);
        Class<? extends Object> term110824 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term110823 = ((Class) term110824).getDeclaredField((String) "PROTECTED");
        ((Field) term110823).setAccessible(true);
        Object enum189 = ((Field) term110823).get((Object) null);
        term14903 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term14904 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term14917 = (char[]) newCharArray(0);
        int[] term14919 = (int[]) newIntArray(9);
        Object term14954 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term14955 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term14956 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term14957 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term14973 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term14974 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14976 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14979 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14982 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14990 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term14992 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term14993 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15000 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term15001 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term15006 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term15011 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term14904, term14904.getClass(), "string", "YAXkVjQZcV");
        setField(term14904, term14904.getClass(), "stringBuffer", term14917);
        setIntField(term14904, term14904.getClass(), "stringBufferTop", 794352120);
        setIntElement(term14919, 0, 340719678);
        setIntElement(term14919, 1, 299791142);
        setIntElement(term14919, 2, 1862191391);
        setIntElement(term14919, 3, 1131398807);
        setIntElement(term14919, 4, -344907703);
        setIntElement(term14919, 5, 824341437);
        setIntElement(term14919, 6, -1794965320);
        setIntElement(term14919, 7, 520504102);
        setIntElement(term14919, 8, -457396133);
        setField(term14904, term14904.getClass(), "ungetBuffer", term14919);
        setIntField(term14904, term14904.getClass(), "ungetCursor", -1793950607);
        setBooleanField(term14904, term14904.getClass(), "hitEOF", true);
        setIntField(term14904, term14904.getClass(), "lineStart", 1091954101);
        setIntField(term14904, term14904.getClass(), "lineEndChar", 1895143076);
        setIntField(term14904, term14904.getClass(), "lineno", 1981860404);
        setIntField(term14904, term14904.getClass(), "charno", 732174235);
        setIntField(term14904, term14904.getClass(), "initCharno", 470895808);
        setIntField(term14904, term14904.getClass(), "initLineno", 1787325291);
        setField(term14904, term14904.getClass(), "sourceString", "pumvwBWvpy");
        setIntField(term14904, term14904.getClass(), "sourceEnd", 1470349147);
        setIntField(term14904, term14904.getClass(), "sourceCursor", -255317272);
        setIntField(term14904, term14904.getClass(), "cursor", -706253892);
        setIntField(term14904, term14904.getClass(), "tokenBeg", -1341439819);
        setIntField(term14904, term14904.getClass(), "tokenEnd", -728760750);
        setField(term14903, term14903.getClass(), "stream", term14904);
        setField(term14957, term14957.getClass(), "root", null);
        setField(term14957, term14957.getClass(), "sourceName", null);
        setField(term14956, term14956.getClass(), "baseType", term14957);
        setField(term14956, term14956.getClass(), "extendedInterfaces", term14958);
        setField(term14956, term14956.getClass(), "implementedInterfaces", term14961);
        setField(term14956, term14956.getClass(), "parameters", term14964);
        setField(term14956, term14956.getClass(), "thrownTypes", term14969);
        setField(term14956, term14956.getClass(), "templateTypeNames", null);
        setField(term14956, term14956.getClass(), "classTemplateTypeNames", null);
        setField(term14956, term14956.getClass(), "description", null);
        setField(term14956, term14956.getClass(), "meaning", null);
        setField(term14956, term14956.getClass(), "deprecated", null);
        setField(term14956, term14956.getClass(), "license", null);
        setField(term14956, term14956.getClass(), "suppressions", null);
        setField(term14956, term14956.getClass(), "modifies", null);
        setField(term14956, term14956.getClass(), "lendsName", null);
        setBooleanField(term14956, term14956.getClass(), "ngInject", false);
        setField(term14955, term14955.getClass(), "info", term14956);
        setField(term14973, term14973.getClass(), "sourceComment", null);
        setField(term14973, term14973.getClass(), "markers", null);
        setField(term14973, term14973.getClass(), "parameters", null);
        setField(term14973, term14973.getClass(), "throwsDescriptions", null);
        setField(term14973, term14973.getClass(), "blockDescription", null);
        setField(term14973, term14973.getClass(), "fileOverview", null);
        setField(term14973, term14973.getClass(), "returnDescription", null);
        setField(term14973, term14973.getClass(), "version", null);
        setField(term14973, term14973.getClass(), "authors", null);
        setField(term14973, term14973.getClass(), "sees", null);
        setField(term14955, term14955.getClass(), "documentation", term14973);
        setIntField(term14974, term14974.getClass(), "type", -1551355284);
        setIntField(term14976, term14976.getClass(), "type", 0);
        setField(term14976, term14976.getClass(), "next", null);
        setField(term14976, term14976.getClass(), "first", null);
        setField(term14976, term14976.getClass(), "last", null);
        setField(term14976, term14976.getClass(), "propListHead", null);
        setIntField(term14976, term14976.getClass(), "sourcePosition", 0);
        setField(term14976, term14976.getClass(), "jsType", null);
        setField(term14976, term14976.getClass(), "parent", null);
        setField(term14974, term14974.getClass(), "next", term14976);
        setIntField(term14979, term14979.getClass(), "type", 0);
        setField(term14979, term14979.getClass(), "next", null);
        setField(term14979, term14979.getClass(), "first", null);
        setField(term14979, term14979.getClass(), "last", null);
        setField(term14979, term14979.getClass(), "propListHead", null);
        setIntField(term14979, term14979.getClass(), "sourcePosition", 0);
        setField(term14979, term14979.getClass(), "jsType", null);
        setField(term14979, term14979.getClass(), "parent", null);
        setField(term14974, term14974.getClass(), "first", term14979);
        setIntField(term14982, term14982.getClass(), "type", 0);
        setField(term14982, term14982.getClass(), "next", null);
        setField(term14982, term14982.getClass(), "first", null);
        setField(term14982, term14982.getClass(), "last", null);
        setField(term14982, term14982.getClass(), "propListHead", null);
        setIntField(term14982, term14982.getClass(), "sourcePosition", 0);
        setField(term14982, term14982.getClass(), "jsType", null);
        setField(term14982, term14982.getClass(), "parent", null);
        setField(term14974, term14974.getClass(), "last", term14982);
        setField(term14974, term14974.getClass(), "propListHead", null);
        setIntField(term14974, term14974.getClass(), "sourcePosition", 0);
        setField(term14974, term14974.getClass(), "jsType", null);
        setField(term14974, term14974.getClass(), "parent", null);
        setField(term14955, term14955.getClass(), "associatedNode", term14974);
        setField(term14955, term14955.getClass(), "visibility", enum189);
        setIntField(term14955, term14955.getClass(), "bitset", -1381970335);
        setField(term14990, term14990.getClass(), "root", term14982);
        setField(term14990, term14990.getClass(), "sourceName", "");
        setField(term14955, term14955.getClass(), "type", term14990);
        setIntField(term14993, term14993.getClass(), "type", -885788574);
        setField(term14993, term14993.getClass(), "next", null);
        setField(term14993, term14993.getClass(), "first", term14982);
        setField(term14993, term14993.getClass(), "last", null);
        setField(term14993, term14993.getClass(), "propListHead", null);
        setIntField(term14993, term14993.getClass(), "sourcePosition", 0);
        setField(term14993, term14993.getClass(), "jsType", null);
        setField(term14993, term14993.getClass(), "parent", null);
        setField(term14992, term14992.getClass(), "root", term14993);
        setField(term14992, term14992.getClass(), "sourceName", "");
        setField(term14955, term14955.getClass(), "thisType", term14992);
        setBooleanField(term14955, term14955.getClass(), "includeDocumentation", false);
        setField(term14954, term14954.getClass(), "currentInfo", term14955);
        setBooleanField(term14954, term14954.getClass(), "populated", false);
        setBooleanField(term14954, term14954.getClass(), "parseDocumentation", true);
        setField(term15001, term15001.getClass(), "item", null);
        setIntField(term15001, term15001.getClass(), "startLineno", 0);
        setIntField(term15001, term15001.getClass(), "startCharno", 0);
        setIntField(term15001, term15001.getClass(), "endLineno", 0);
        setIntField(term15001, term15001.getClass(), "endCharno", 0);
        setField(term15000, term15000.getClass(), "annotation", term15001);
        setField(term15006, term15006.getClass(), "item", null);
        setIntField(term15006, term15006.getClass(), "startLineno", 0);
        setIntField(term15006, term15006.getClass(), "startCharno", 0);
        setIntField(term15006, term15006.getClass(), "endLineno", 0);
        setIntField(term15006, term15006.getClass(), "endCharno", 0);
        setField(term15000, term15000.getClass(), "name", term15006);
        setField(term15000, term15000.getClass(), "nameNode", null);
        setField(term15000, term15000.getClass(), "description", null);
        setField(term15000, term15000.getClass(), "type", null);
        setField(term14954, term14954.getClass(), "currentMarker", term15000);
        setField(term14903, term14903.getClass(), "jsdocBuilder", term14954);
        setField(term14903, term14903.getClass(), "sourceFile", null);
        setIntField(term15011, term15011.getClass(), "type", 0);
        setField(term15011, term15011.getClass(), "next", null);
        setField(term15011, term15011.getClass(), "first", null);
        setField(term15011, term15011.getClass(), "last", null);
        setField(term15011, term15011.getClass(), "propListHead", null);
        setIntField(term15011, term15011.getClass(), "sourcePosition", 0);
        setField(term15011, term15011.getClass(), "jsType", null);
        setField(term15011, term15011.getClass(), "parent", null);
        setField(term14903, term14903.getClass(), "associatedNode", term15011);
        setField(term14903, term14903.getClass(), "errorReporter", null);
        setField(term14903, term14903.getClass(), "parser", null);
        setField(term14903, term14903.getClass(), "templateNode", null);
        setField(term14903, term14903.getClass(), "fileOverviewJSDocInfo", null);
        setField(term14903, term14903.getClass(), "state", null);
        setField(term14903, term14903.getClass(), "annotationNames", null);
        setField(term14903, term14903.getClass(), "suppressionNames", null);
        setField(term14903, term14903.getClass(), "fileLevelJsDocBuilder", null);
        setField(term14903, term14903.getClass(), "unreadToken", null);
        Class<? extends Object> term111101 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term111100 = ((Class) term111101).getDeclaredField((String) "EOL");
        ((Field) term111100).setAccessible(true);
        enum190 = ((Field) term111100).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum190;
        try {
            callMethod(klass, "parseTypeExpressionList", argTypes, term14903, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


