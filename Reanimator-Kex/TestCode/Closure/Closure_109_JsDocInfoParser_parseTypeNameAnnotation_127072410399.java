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
import java.util.HashSet;
import java.lang.String;

public class JsDocInfoParser_parseTypeNameAnnotation_127072410399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16852;
     Object enum215;

    public JsDocInfoParser_parseTypeNameAnnotation_127072410399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term16909 = new ArrayList();
        ((ArrayList) term16909).add((Object)null);
        ArrayList term16912 = new ArrayList();
        ((ArrayList) term16912).add((Object)null);
        HashMap term16915 = new HashMap();
        ArrayList term16920 = new ArrayList();
        HashSet term16923 = new HashSet();
        HashSet term16928 = new HashSet();
        HashSet term16929 = new HashSet();
        ArrayList term16938 = new ArrayList();
        ((ArrayList) term16938).add((Object)null);
        ((ArrayList) term16938).add((Object)null);
        ((ArrayList) term16938).add((Object)null);
        HashMap term16941 = new HashMap();
        Class<? extends Object> term148870 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term148869 = ((Class) term148870).getDeclaredField((String) "PUBLIC");
        ((Field) term148869).setAccessible(true);
        Object enum214 = ((Field) term148869).get((Object) null);
        term16852 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term16853 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term16866 = (char[]) newCharArray(8);
        int[] term16876 = (int[]) newIntArray(3);
        Object term16905 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term16906 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term16907 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term16908 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term16936 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term16946 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16953 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term16954 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term16959 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term16960 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term16965 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$TrimmedStringPosition"));
        Object term16970 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16972 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16975 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term16853, term16853.getClass(), "string", "ZFpcYBgLNC");
        setCharElement(term16866, 0, 'a');
        setCharElement(term16866, 1, 'P');
        setCharElement(term16866, 2, 'i');
        setCharElement(term16866, 3, 'g');
        setCharElement(term16866, 4, 'E');
        setCharElement(term16866, 5, 'T');
        setCharElement(term16866, 6, 'm');
        setCharElement(term16866, 7, 'J');
        setField(term16853, term16853.getClass(), "stringBuffer", term16866);
        setIntField(term16853, term16853.getClass(), "stringBufferTop", -2018735535);
        setIntElement(term16876, 0, -658524954);
        setIntElement(term16876, 1, -2009613557);
        setIntElement(term16876, 2, 654195547);
        setField(term16853, term16853.getClass(), "ungetBuffer", term16876);
        setIntField(term16853, term16853.getClass(), "ungetCursor", 1622857008);
        setBooleanField(term16853, term16853.getClass(), "hitEOF", false);
        setIntField(term16853, term16853.getClass(), "lineStart", 934338954);
        setIntField(term16853, term16853.getClass(), "lineEndChar", 598635505);
        setIntField(term16853, term16853.getClass(), "lineno", -944986533);
        setIntField(term16853, term16853.getClass(), "charno", 1894454926);
        setIntField(term16853, term16853.getClass(), "initCharno", 1415142780);
        setIntField(term16853, term16853.getClass(), "initLineno", -574105759);
        setField(term16853, term16853.getClass(), "sourceString", "VAGkRppBem");
        setIntField(term16853, term16853.getClass(), "sourceEnd", -1165271567);
        setIntField(term16853, term16853.getClass(), "sourceCursor", 376834234);
        setIntField(term16853, term16853.getClass(), "cursor", -1911972560);
        setIntField(term16853, term16853.getClass(), "tokenBeg", -642716895);
        setIntField(term16853, term16853.getClass(), "tokenEnd", 1743398246);
        setField(term16852, term16852.getClass(), "stream", term16853);
        setField(term16908, term16908.getClass(), "root", null);
        setField(term16908, term16908.getClass(), "sourceName", null);
        setField(term16907, term16907.getClass(), "baseType", term16908);
        setField(term16907, term16907.getClass(), "extendedInterfaces", term16909);
        setField(term16907, term16907.getClass(), "implementedInterfaces", term16912);
        setField(term16907, term16907.getClass(), "parameters", term16915);
        setField(term16907, term16907.getClass(), "thrownTypes", term16920);
        setField(term16907, term16907.getClass(), "templateTypeNames", null);
        setField(term16907, term16907.getClass(), "disposedParameters", term16923);
        setField(term16907, term16907.getClass(), "description", "");
        setField(term16907, term16907.getClass(), "meaning", "");
        setField(term16907, term16907.getClass(), "deprecated", "");
        setField(term16907, term16907.getClass(), "license", "");
        setField(term16907, term16907.getClass(), "suppressions", term16928);
        setField(term16907, term16907.getClass(), "modifies", term16929);
        setField(term16907, term16907.getClass(), "lendsName", "");
        setBooleanField(term16907, term16907.getClass(), "ngInject", false);
        setBooleanField(term16907, term16907.getClass(), "wizaction", true);
        setBooleanField(term16907, term16907.getClass(), "jaggerInject", false);
        setBooleanField(term16907, term16907.getClass(), "jaggerProvide", false);
        setBooleanField(term16907, term16907.getClass(), "jaggerModule", true);
        setField(term16906, term16906.getClass(), "info", term16907);
        setField(term16936, term16936.getClass(), "sourceComment", "");
        setField(term16936, term16936.getClass(), "markers", term16938);
        setField(term16936, term16936.getClass(), "parameters", term16941);
        setField(term16936, term16936.getClass(), "throwsDescriptions", null);
        setField(term16936, term16936.getClass(), "blockDescription", null);
        setField(term16936, term16936.getClass(), "fileOverview", null);
        setField(term16936, term16936.getClass(), "returnDescription", null);
        setField(term16936, term16936.getClass(), "version", null);
        setField(term16936, term16936.getClass(), "authors", null);
        setField(term16936, term16936.getClass(), "sees", null);
        setField(term16906, term16906.getClass(), "documentation", term16936);
        setIntField(term16946, term16946.getClass(), "type", 0);
        setField(term16946, term16946.getClass(), "next", null);
        setField(term16946, term16946.getClass(), "first", null);
        setField(term16946, term16946.getClass(), "last", null);
        setField(term16946, term16946.getClass(), "propListHead", null);
        setIntField(term16946, term16946.getClass(), "sourcePosition", 0);
        setField(term16946, term16946.getClass(), "jsType", null);
        setField(term16946, term16946.getClass(), "parent", null);
        setField(term16906, term16906.getClass(), "associatedNode", term16946);
        setField(term16906, term16906.getClass(), "visibility", enum214);
        setIntField(term16906, term16906.getClass(), "bitset", 297582552);
        setField(term16953, term16953.getClass(), "root", null);
        setField(term16953, term16953.getClass(), "sourceName", null);
        setField(term16906, term16906.getClass(), "type", term16953);
        setField(term16954, term16954.getClass(), "root", null);
        setField(term16954, term16954.getClass(), "sourceName", null);
        setField(term16906, term16906.getClass(), "thisType", term16954);
        setBooleanField(term16906, term16906.getClass(), "includeDocumentation", false);
        setIntField(term16906, term16906.getClass(), "originalCommentPosition", -1485916498);
        setField(term16905, term16905.getClass(), "currentInfo", term16906);
        setBooleanField(term16905, term16905.getClass(), "populated", false);
        setBooleanField(term16905, term16905.getClass(), "parseDocumentation", false);
        setField(term16960, term16960.getClass(), "item", null);
        setIntField(term16960, term16960.getClass(), "startLineno", 0);
        setIntField(term16960, term16960.getClass(), "startCharno", 0);
        setIntField(term16960, term16960.getClass(), "endLineno", 0);
        setIntField(term16960, term16960.getClass(), "endCharno", 0);
        setField(term16959, term16959.getClass(), "annotation", term16960);
        setField(term16965, term16965.getClass(), "item", null);
        setIntField(term16965, term16965.getClass(), "startLineno", 0);
        setIntField(term16965, term16965.getClass(), "startCharno", 0);
        setIntField(term16965, term16965.getClass(), "endLineno", 0);
        setIntField(term16965, term16965.getClass(), "endCharno", 0);
        setField(term16959, term16959.getClass(), "name", term16965);
        setField(term16959, term16959.getClass(), "nameNode", null);
        setField(term16959, term16959.getClass(), "description", null);
        setField(term16959, term16959.getClass(), "type", null);
        setField(term16905, term16905.getClass(), "currentMarker", term16959);
        setField(term16852, term16852.getClass(), "jsdocBuilder", term16905);
        setField(term16852, term16852.getClass(), "sourceFile", null);
        setIntField(term16970, term16970.getClass(), "type", 1474899591);
        setIntField(term16972, term16972.getClass(), "type", 0);
        setField(term16972, term16972.getClass(), "next", null);
        setField(term16972, term16972.getClass(), "first", null);
        setField(term16972, term16972.getClass(), "last", null);
        setField(term16972, term16972.getClass(), "propListHead", null);
        setIntField(term16972, term16972.getClass(), "sourcePosition", 0);
        setField(term16972, term16972.getClass(), "jsType", null);
        setField(term16972, term16972.getClass(), "parent", null);
        setField(term16970, term16970.getClass(), "next", term16972);
        setIntField(term16975, term16975.getClass(), "type", 0);
        setField(term16975, term16975.getClass(), "next", null);
        setField(term16975, term16975.getClass(), "first", null);
        setField(term16975, term16975.getClass(), "last", null);
        setField(term16975, term16975.getClass(), "propListHead", null);
        setIntField(term16975, term16975.getClass(), "sourcePosition", 0);
        setField(term16975, term16975.getClass(), "jsType", null);
        setField(term16975, term16975.getClass(), "parent", null);
        setField(term16970, term16970.getClass(), "first", term16975);
        setField(term16970, term16970.getClass(), "last", term16946);
        setField(term16970, term16970.getClass(), "propListHead", null);
        setIntField(term16970, term16970.getClass(), "sourcePosition", 0);
        setField(term16970, term16970.getClass(), "jsType", null);
        setField(term16970, term16970.getClass(), "parent", null);
        setField(term16852, term16852.getClass(), "associatedNode", term16970);
        setField(term16852, term16852.getClass(), "errorReporter", null);
        setField(term16852, term16852.getClass(), "parser", null);
        setField(term16852, term16852.getClass(), "templateNode", null);
        setField(term16852, term16852.getClass(), "fileOverviewJSDocInfo", null);
        setField(term16852, term16852.getClass(), "state", null);
        setField(term16852, term16852.getClass(), "annotationNames", null);
        setField(term16852, term16852.getClass(), "suppressionNames", null);
        setField(term16852, term16852.getClass(), "fileLevelJsDocBuilder", null);
        setField(term16852, term16852.getClass(), "unreadToken", null);
        Class<? extends Object> term149135 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term149134 = ((Class) term149135).getDeclaredField((String) "RP");
        ((Field) term149134).setAccessible(true);
        enum215 = ((Field) term149134).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum215;
        try {
            callMethod(klass, "parseTypeNameAnnotation", argTypes, term16852, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


