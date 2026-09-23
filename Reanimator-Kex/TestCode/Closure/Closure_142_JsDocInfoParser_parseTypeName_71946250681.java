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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;

public class JsDocInfoParser_parseTypeName_71946250681 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27342;
     Object enum213;

    public JsDocInfoParser_parseTypeName_71946250681() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term27395 = new HashMap();
        HashMap term27404 = new HashMap();
        Set<Object> term316203 =  ((Map) term27404).keySet();
        HashSet term27403 = new HashSet((Collection<? extends Object>) term316203);
        HashMap term27411 = new HashMap();
        Set<Object> term316204 =  ((Map) term27411).keySet();
        HashSet term27410 = new HashSet((Collection<? extends Object>) term316204);
        HashMap term27418 = new HashMap();
        Set<Object> term316205 =  ((Map) term27418).keySet();
        HashSet term27417 = new HashSet((Collection<? extends Object>) term316205);
        HashMap term27424 = new HashMap();
        HashMap term27429 = new HashMap();
        Class<? extends Object> term316227 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term316226 = ((Class) term316227).getDeclaredField((String) "PRIVATE");
        ((Field) term316226).setAccessible(true);
        Object enum211 = ((Field) term316226).get((Object) null);
        Class<? extends Object> term316505 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocInfoParser$State");
        Field term316504 = ((Class) term316505).getDeclaredField((String) "SEARCHING_NEWLINE");
        ((Field) term316504).setAccessible(true);
        Object enum212 = ((Field) term316504).get((Object) null);
        HashMap term27520 = new HashMap();
        term27342 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term27343 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term27356 = (char[]) newCharArray(5);
        int[] term27363 = (int[]) newIntArray(4);
        Object term27393 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term27394 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 4);
        Object term27450 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term27464 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term27465 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term27466 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term27471 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term27472 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term27476 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term27477 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term27482 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term27495 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser$ErrorReporterParser"));
        Object term27496 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term27531 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        setField(term27343, term27343.getClass(), "string", "FBCXbjHVXO");
        setCharElement(term27356, 0, 'V');
        setCharElement(term27356, 1, 'z');
        setCharElement(term27356, 2, 'R');
        setCharElement(term27356, 3, 'f');
        setCharElement(term27356, 4, 'L');
        setField(term27343, term27343.getClass(), "stringBuffer", term27356);
        setIntField(term27343, term27343.getClass(), "stringBufferTop", 2027686272);
        setIntElement(term27363, 0, -1494356104);
        setIntElement(term27363, 1, -695279311);
        setIntElement(term27363, 2, 114279242);
        setIntElement(term27363, 3, 990883365);
        setField(term27343, term27343.getClass(), "ungetBuffer", term27363);
        setIntField(term27343, term27343.getClass(), "ungetCursor", 633598642);
        setBooleanField(term27343, term27343.getClass(), "hitEOF", true);
        setIntField(term27343, term27343.getClass(), "lineStart", 1862841859);
        setIntField(term27343, term27343.getClass(), "lineEndChar", -1114668574);
        setIntField(term27343, term27343.getClass(), "lineno", 514511037);
        setIntField(term27343, term27343.getClass(), "charno", 1713573821);
        setIntField(term27343, term27343.getClass(), "initCharno", 1956590498);
        setIntField(term27343, term27343.getClass(), "initLineno", 1467356494);
        setField(term27343, term27343.getClass(), "sourceString", "dIWAnvmLiC");
        setIntField(term27343, term27343.getClass(), "sourceEnd", -26316536);
        setIntField(term27343, term27343.getClass(), "sourceCursor", 1716165145);
        setIntField(term27343, term27343.getClass(), "cursor", 1692937831);
        setIntField(term27343, term27343.getClass(), "tokenBeg", -1539747985);
        setIntField(term27343, term27343.getClass(), "tokenEnd", -1982489643);
        setField(term27342, term27342.getClass(), "stream", term27343);
        setField(term27393, term27393.getClass(), "reporter", null);
        setField(term27393, term27393.getClass(), "nativeTypes", term27394);
        setField(term27393, term27393.getClass(), "namesToTypes", term27395);
        setField(term27393, term27393.getClass(), "namespaces", term27403);
        setField(term27393, term27393.getClass(), "enumTypeNames", term27410);
        setField(term27393, term27393.getClass(), "forwardDeclaredTypes", term27417);
        setField(term27393, term27393.getClass(), "typesIndexedByProperty", term27424);
        setField(term27393, term27393.getClass(), "greatestSubtypeByProperty", term27429);
        setField(term27393, term27393.getClass(), "interfaceToImplementors", null);
        setField(term27393, term27393.getClass(), "unresolvedNamedTypes", null);
        setField(term27393, term27393.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term27393, term27393.getClass(), "lastGeneration", true);
        setField(term27393, term27393.getClass(), "templateTypeName", "fOuOhBpldm");
        setField(term27450, term27450.getClass(), "name", "qQQRKGPyIM");
        setField(term27450, term27450.getClass(), "referencedType", null);
        setBooleanField(term27450, term27450.getClass(), "visited", true);
        setField(term27465, term27465.getClass(), "baseType", null);
        setField(term27465, term27465.getClass(), "implementedInterfaces", null);
        setField(term27465, term27465.getClass(), "parameters", null);
        setField(term27465, term27465.getClass(), "thrownTypes", null);
        setField(term27465, term27465.getClass(), "templateTypeName", null);
        setField(term27465, term27465.getClass(), "description", null);
        setField(term27465, term27465.getClass(), "deprecated", null);
        setField(term27465, term27465.getClass(), "license", null);
        setField(term27465, term27465.getClass(), "suppressions", null);
        setField(term27464, term27464.getClass(), "info", term27465);
        setField(term27466, term27466.getClass(), "markers", null);
        setField(term27466, term27466.getClass(), "parameters", null);
        setField(term27466, term27466.getClass(), "throwsDescriptions", null);
        setField(term27466, term27466.getClass(), "blockDescription", null);
        setField(term27466, term27466.getClass(), "fileOverview", null);
        setField(term27466, term27466.getClass(), "returnDescription", null);
        setField(term27466, term27466.getClass(), "version", null);
        setField(term27466, term27466.getClass(), "authors", null);
        setField(term27466, term27466.getClass(), "sees", null);
        setField(term27464, term27464.getClass(), "documentation", term27466);
        setField(term27464, term27464.getClass(), "sourceName", "");
        setField(term27464, term27464.getClass(), "visibility", enum211);
        setIntField(term27464, term27464.getClass(), "bitset", 550892835);
        setField(term27471, term27471.getClass(), "root", null);
        setField(term27471, term27471.getClass(), "sourceName", null);
        setField(term27471, term27471.getClass(), "registry", null);
        setField(term27464, term27464.getClass(), "type", term27471);
        setField(term27472, term27472.getClass(), "root", null);
        setField(term27472, term27472.getClass(), "sourceName", null);
        setField(term27472, term27472.getClass(), "registry", null);
        setField(term27464, term27464.getClass(), "thisType", term27472);
        setBooleanField(term27464, term27464.getClass(), "includeDocumentation", false);
        setField(term27450, term27450.getClass(), "docInfo", term27464);
        setBooleanField(term27450, term27450.getClass(), "unknown", true);
        setBooleanField(term27450, term27450.getClass(), "resolved", true);
        setField(term27450, term27450.getClass(), "resolveResult", null);
        setField(term27450, term27450.getClass(), "registry", null);
        setField(term27393, term27393.getClass(), "templateType", term27450);
        setField(term27342, term27342.getClass(), "typeRegistry", term27393);
        setField(term27477, term27477.getClass(), "info", null);
        setField(term27477, term27477.getClass(), "documentation", null);
        setField(term27477, term27477.getClass(), "sourceName", null);
        setField(term27477, term27477.getClass(), "visibility", null);
        setIntField(term27477, term27477.getClass(), "bitset", 0);
        setField(term27477, term27477.getClass(), "type", null);
        setField(term27477, term27477.getClass(), "thisType", null);
        setBooleanField(term27477, term27477.getClass(), "includeDocumentation", false);
        setField(term27476, term27476.getClass(), "currentInfo", term27477);
        setBooleanField(term27476, term27476.getClass(), "populated", false);
        setBooleanField(term27476, term27476.getClass(), "parseDocumentation", false);
        setField(term27482, term27482.getClass(), "annotation", null);
        setField(term27482, term27482.getClass(), "name", null);
        setField(term27482, term27482.getClass(), "description", null);
        setField(term27482, term27482.getClass(), "type", null);
        setField(term27476, term27476.getClass(), "currentMarker", term27482);
        setField(term27342, term27342.getClass(), "jsdocBuilder", term27476);
        setField(term27342, term27342.getClass(), "sourceName", "mzCFLzFuSj");
        setField(term27342, term27342.getClass(), "errorReporter", null);
        setField(term27495, term27495.getClass(), "this$0", null);
        setField(term27342, term27342.getClass(), "parser", term27495);
        setField(term27496, term27496.getClass(), "info", null);
        setField(term27496, term27496.getClass(), "documentation", null);
        setField(term27496, term27496.getClass(), "sourceName", null);
        setField(term27496, term27496.getClass(), "visibility", null);
        setIntField(term27496, term27496.getClass(), "bitset", 0);
        setField(term27496, term27496.getClass(), "type", null);
        setField(term27496, term27496.getClass(), "thisType", null);
        setBooleanField(term27496, term27496.getClass(), "includeDocumentation", false);
        setField(term27342, term27342.getClass(), "fileOverviewJSDocInfo", term27496);
        setField(term27342, term27342.getClass(), "state", enum212);
        setField(term27342, term27342.getClass(), "annotationNames", term27520);
        setField(term27531, term27531.getClass(), "this$0", null);
        setField(term27342, term27342.getClass(), "fileLevelJsDocBuilder", term27531);
        setField(term27342, term27342.getClass(), "unreadToken", null);
        Class<? extends Object> term316853 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term316852 = ((Class) term316853).getDeclaredField((String) "ANNOTATION");
        ((Field) term316852).setAccessible(true);
        enum213 = ((Field) term316852).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum213;
        try {
            callMethod(klass, "parseTypeName", argTypes, term27342, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


