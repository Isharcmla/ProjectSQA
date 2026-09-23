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
import java.lang.ArrayIndexOutOfBoundsException;
import static com.google.javascript.jscomp.parsing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.lang.String;

public class JsDocInfoParser_parseTypeExpressionAnnotation_194227385081 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13698;
     Object enum183;

    public JsDocInfoParser_parseTypeExpressionAnnotation_194227385081() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term13751 = new ArrayList();
        ((ArrayList) term13751).add((Object)null);
        ((ArrayList) term13751).add((Object)null);
        ((ArrayList) term13751).add((Object)null);
        ((ArrayList) term13751).add((Object)null);
        ((ArrayList) term13751).add((Object)null);
        ((ArrayList) term13751).add((Object)null);
        ((ArrayList) term13751).add((Object)null);
        ArrayList term13754 = new ArrayList();
        ((ArrayList) term13754).add((Object)null);
        ((ArrayList) term13754).add((Object)null);
        ((ArrayList) term13754).add((Object)null);
        ((ArrayList) term13754).add((Object)null);
        HashMap term13757 = new HashMap();
        ArrayList term13762 = new ArrayList();
        ((ArrayList) term13762).add((Object)null);
        ((ArrayList) term13762).add((Object)null);
        ((ArrayList) term13762).add((Object)null);
        ((ArrayList) term13762).add((Object)null);
        ((ArrayList) term13762).add((Object)null);
        ((ArrayList) term13762).add((Object)null);
        HashSet term13770 = new HashSet();
        HashSet term13771 = new HashSet();
        ArrayList term13775 = new ArrayList();
        ((ArrayList) term13775).add((Object)null);
        ((ArrayList) term13775).add((Object)null);
        HashMap term13778 = new HashMap();
        Class<? extends Object> term90921 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term90920 = ((Class) term90921).getDeclaredField((String) "PRIVATE");
        ((Field) term90920).setAccessible(true);
        Object enum182 = ((Field) term90920).get((Object) null);
        term13698 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term13699 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term13712 = (char[]) newCharArray(3);
        int[] term13717 = (int[]) newIntArray(4);
        Object term13747 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term13748 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term13749 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term13750 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term13773 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term13783 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13790 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term13791 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13795 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term13796 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13803 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term13804 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term13809 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term13814 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term13699, term13699.getClass(), "string", "ZWcOCwKNvd");
        setCharElement(term13712, 0, 'R');
        setCharElement(term13712, 1, 'N');
        setCharElement(term13712, 2, 'S');
        setField(term13699, term13699.getClass(), "stringBuffer", term13712);
        setIntField(term13699, term13699.getClass(), "stringBufferTop", -509349195);
        setIntElement(term13717, 0, -1639041228);
        setIntElement(term13717, 1, 2027686272);
        setIntElement(term13717, 2, -1494356104);
        setIntElement(term13717, 3, -695279311);
        setField(term13699, term13699.getClass(), "ungetBuffer", term13717);
        setIntField(term13699, term13699.getClass(), "ungetCursor", 114279242);
        setBooleanField(term13699, term13699.getClass(), "hitEOF", false);
        setIntField(term13699, term13699.getClass(), "lineStart", 990883365);
        setIntField(term13699, term13699.getClass(), "lineEndChar", 633598642);
        setIntField(term13699, term13699.getClass(), "lineno", 1862841859);
        setIntField(term13699, term13699.getClass(), "charno", -1114668574);
        setIntField(term13699, term13699.getClass(), "initCharno", 514511037);
        setIntField(term13699, term13699.getClass(), "initLineno", 1713573821);
        setField(term13699, term13699.getClass(), "sourceString", "GTmoNrziyc");
        setIntField(term13699, term13699.getClass(), "sourceEnd", 1956590498);
        setIntField(term13699, term13699.getClass(), "sourceCursor", 1467356494);
        setIntField(term13699, term13699.getClass(), "cursor", -26316536);
        setIntField(term13699, term13699.getClass(), "tokenBeg", 1716165145);
        setIntField(term13699, term13699.getClass(), "tokenEnd", 1692937831);
        setField(term13698, term13698.getClass(), "stream", term13699);
        setField(term13750, term13750.getClass(), "root", null);
        setField(term13750, term13750.getClass(), "sourceName", null);
        setField(term13749, term13749.getClass(), "baseType", term13750);
        setField(term13749, term13749.getClass(), "extendedInterfaces", term13751);
        setField(term13749, term13749.getClass(), "implementedInterfaces", term13754);
        setField(term13749, term13749.getClass(), "parameters", term13757);
        setField(term13749, term13749.getClass(), "thrownTypes", term13762);
        setField(term13749, term13749.getClass(), "templateTypeName", "");
        setField(term13749, term13749.getClass(), "description", "");
        setField(term13749, term13749.getClass(), "meaning", "");
        setField(term13749, term13749.getClass(), "deprecated", "");
        setField(term13749, term13749.getClass(), "license", "");
        setField(term13749, term13749.getClass(), "suppressions", term13770);
        setField(term13749, term13749.getClass(), "modifies", term13771);
        setField(term13749, term13749.getClass(), "lendsName", "");
        setField(term13748, term13748.getClass(), "info", term13749);
        setField(term13773, term13773.getClass(), "sourceComment", "");
        setField(term13773, term13773.getClass(), "markers", term13775);
        setField(term13773, term13773.getClass(), "parameters", term13778);
        setField(term13773, term13773.getClass(), "throwsDescriptions", null);
        setField(term13773, term13773.getClass(), "blockDescription", null);
        setField(term13773, term13773.getClass(), "fileOverview", null);
        setField(term13773, term13773.getClass(), "returnDescription", null);
        setField(term13773, term13773.getClass(), "version", null);
        setField(term13773, term13773.getClass(), "authors", null);
        setField(term13773, term13773.getClass(), "sees", null);
        setField(term13748, term13748.getClass(), "documentation", term13773);
        setIntField(term13783, term13783.getClass(), "type", 0);
        setField(term13783, term13783.getClass(), "next", null);
        setField(term13783, term13783.getClass(), "first", null);
        setField(term13783, term13783.getClass(), "last", null);
        setField(term13783, term13783.getClass(), "propListHead", null);
        setIntField(term13783, term13783.getClass(), "sourcePosition", 0);
        setField(term13783, term13783.getClass(), "jsType", null);
        setField(term13783, term13783.getClass(), "parent", null);
        setField(term13748, term13748.getClass(), "associatedNode", term13783);
        setField(term13748, term13748.getClass(), "visibility", enum182);
        setIntField(term13748, term13748.getClass(), "bitset", -1622760744);
        setIntField(term13791, term13791.getClass(), "type", 550892835);
        setField(term13791, term13791.getClass(), "next", null);
        setField(term13791, term13791.getClass(), "first", null);
        setField(term13791, term13791.getClass(), "last", term13783);
        setField(term13791, term13791.getClass(), "propListHead", null);
        setIntField(term13791, term13791.getClass(), "sourcePosition", 0);
        setField(term13791, term13791.getClass(), "jsType", null);
        setField(term13791, term13791.getClass(), "parent", null);
        setField(term13790, term13790.getClass(), "root", term13791);
        setField(term13790, term13790.getClass(), "sourceName", "");
        setField(term13748, term13748.getClass(), "type", term13790);
        setIntField(term13796, term13796.getClass(), "type", 0);
        setField(term13796, term13796.getClass(), "next", null);
        setField(term13796, term13796.getClass(), "first", null);
        setField(term13796, term13796.getClass(), "last", null);
        setField(term13796, term13796.getClass(), "propListHead", null);
        setIntField(term13796, term13796.getClass(), "sourcePosition", 0);
        setField(term13796, term13796.getClass(), "jsType", null);
        setField(term13796, term13796.getClass(), "parent", null);
        setField(term13795, term13795.getClass(), "root", term13796);
        setField(term13795, term13795.getClass(), "sourceName", "");
        setField(term13748, term13748.getClass(), "thisType", term13795);
        setBooleanField(term13748, term13748.getClass(), "includeDocumentation", true);
        setField(term13747, term13747.getClass(), "currentInfo", term13748);
        setBooleanField(term13747, term13747.getClass(), "populated", false);
        setBooleanField(term13747, term13747.getClass(), "parseDocumentation", true);
        setField(term13804, term13804.getClass(), "item", null);
        setIntField(term13804, term13804.getClass(), "startLineno", 0);
        setIntField(term13804, term13804.getClass(), "startCharno", 0);
        setIntField(term13804, term13804.getClass(), "endLineno", 0);
        setIntField(term13804, term13804.getClass(), "endCharno", 0);
        setField(term13803, term13803.getClass(), "annotation", term13804);
        setField(term13809, term13809.getClass(), "item", null);
        setIntField(term13809, term13809.getClass(), "startLineno", 0);
        setIntField(term13809, term13809.getClass(), "startCharno", 0);
        setIntField(term13809, term13809.getClass(), "endLineno", 0);
        setIntField(term13809, term13809.getClass(), "endCharno", 0);
        setField(term13803, term13803.getClass(), "name", term13809);
        setField(term13803, term13803.getClass(), "nameNode", null);
        setField(term13803, term13803.getClass(), "description", null);
        setField(term13803, term13803.getClass(), "type", null);
        setField(term13747, term13747.getClass(), "currentMarker", term13803);
        setField(term13698, term13698.getClass(), "jsdocBuilder", term13747);
        setField(term13698, term13698.getClass(), "sourceFile", null);
        setIntField(term13814, term13814.getClass(), "type", 0);
        setField(term13814, term13814.getClass(), "next", null);
        setField(term13814, term13814.getClass(), "first", null);
        setField(term13814, term13814.getClass(), "last", null);
        setField(term13814, term13814.getClass(), "propListHead", null);
        setIntField(term13814, term13814.getClass(), "sourcePosition", 0);
        setField(term13814, term13814.getClass(), "jsType", null);
        setField(term13814, term13814.getClass(), "parent", null);
        setField(term13698, term13698.getClass(), "associatedNode", term13814);
        setField(term13698, term13698.getClass(), "errorReporter", null);
        setField(term13698, term13698.getClass(), "parser", null);
        setField(term13698, term13698.getClass(), "templateNode", null);
        setField(term13698, term13698.getClass(), "fileOverviewJSDocInfo", null);
        setField(term13698, term13698.getClass(), "state", null);
        setField(term13698, term13698.getClass(), "annotationNames", null);
        setField(term13698, term13698.getClass(), "suppressionNames", null);
        setField(term13698, term13698.getClass(), "fileLevelJsDocBuilder", null);
        setField(term13698, term13698.getClass(), "unreadToken", null);
        Class<? extends Object> term91189 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term91188 = ((Class) term91189).getDeclaredField((String) "LB");
        ((Field) term91188).setAccessible(true);
        enum183 = ((Field) term91188).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum183;
        try {
            callMethod(klass, "parseTypeExpressionAnnotation", argTypes, term13698, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


