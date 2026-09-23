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
import static com.google.javascript.jscomp.parsing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.parsing.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;

public class JsDocInfoParser_init_173800094656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2221;
     Object term2284;
     Object term56466;
     Object term56468;

    public JsDocInfoParser_init_173800094656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2221 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term2234 = (char[]) newCharArray(3);
        int[] term2239 = (int[]) newIntArray(7);
        setField(term2221, term2221.getClass(), "string", "XqgfKFvPSD");
        setCharElement(term2234, 0, 'l');
        setCharElement(term2234, 1, 'J');
        setCharElement(term2234, 2, 'A');
        setField(term2221, term2221.getClass(), "stringBuffer", term2234);
        setIntField(term2221, term2221.getClass(), "stringBufferTop", 1876565163);
        setIntElement(term2239, 0, -817164822);
        setIntElement(term2239, 1, -1016503459);
        setIntElement(term2239, 2, -1968847291);
        setIntElement(term2239, 3, 579005622);
        setIntElement(term2239, 4, -14890619);
        setIntElement(term2239, 5, 1632125673);
        setIntElement(term2239, 6, 454281060);
        setField(term2221, term2221.getClass(), "ungetBuffer", term2239);
        setIntField(term2221, term2221.getClass(), "ungetCursor", -1786399638);
        setBooleanField(term2221, term2221.getClass(), "hitEOF", true);
        setIntField(term2221, term2221.getClass(), "lineStart", 2055867847);
        setIntField(term2221, term2221.getClass(), "lineEndChar", -1048298087);
        setIntField(term2221, term2221.getClass(), "lineno", 292681826);
        setIntField(term2221, term2221.getClass(), "charno", 458147407);
        setIntField(term2221, term2221.getClass(), "initCharno", -184153539);
        setIntField(term2221, term2221.getClass(), "initLineno", 493620644);
        setField(term2221, term2221.getClass(), "sourceString", "JiVRgTZvKc");
        setIntField(term2221, term2221.getClass(), "sourceEnd", 1328271830);
        setIntField(term2221, term2221.getClass(), "sourceCursor", 1596070772);
        setIntField(term2221, term2221.getClass(), "cursor", 97029295);
        setIntField(term2221, term2221.getClass(), "tokenBeg", -1371869594);
        setIntField(term2221, term2221.getClass(), "tokenEnd", -2095575670);
        HashMap term2287 = new HashMap();
        HashMap term2296 = new HashMap();
        Set<Object> term56509 =  ((Map) term2296).keySet();
        HashSet term2295 = new HashSet((Collection<? extends Object>) term56509);
        HashMap term2303 = new HashMap();
        Set<Object> term56510 =  ((Map) term2303).keySet();
        HashSet term2302 = new HashSet((Collection<? extends Object>) term56510);
        HashMap term2310 = new HashMap();
        Set<Object> term56511 =  ((Map) term2310).keySet();
        HashSet term2309 = new HashSet((Collection<? extends Object>) term56511);
        HashMap term2316 = new HashMap();
        HashMap term2321 = new HashMap();
        Class<? extends Object> term56533 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term56532 = ((Class) term56533).getDeclaredField((String) "PRIVATE");
        ((Field) term56532).setAccessible(true);
        Object enum141 = ((Field) term56532).get((Object) null);
        HashMap term2370 = new HashMap();
        term2284 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term2285 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term2286 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 2);
        Object term2342 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term2356 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term2357 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term2358 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term2363 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term2364 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term2285, term2285.getClass(), "reporter", null);
        setField(term2285, term2285.getClass(), "nativeTypes", term2286);
        setField(term2285, term2285.getClass(), "namesToTypes", term2287);
        setField(term2285, term2285.getClass(), "namespaces", term2295);
        setField(term2285, term2285.getClass(), "enumTypeNames", term2302);
        setField(term2285, term2285.getClass(), "forwardDeclaredTypes", term2309);
        setField(term2285, term2285.getClass(), "typesIndexedByProperty", term2316);
        setField(term2285, term2285.getClass(), "greatestSubtypeByProperty", term2321);
        setField(term2285, term2285.getClass(), "interfaceToImplementors", null);
        setField(term2285, term2285.getClass(), "unresolvedNamedTypes", null);
        setField(term2285, term2285.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term2285, term2285.getClass(), "lastGeneration", false);
        setField(term2285, term2285.getClass(), "templateTypeName", "MvRIxilFMJ");
        setField(term2342, term2342.getClass(), "name", "iNwOJRBEjp");
        setField(term2342, term2342.getClass(), "referencedType", null);
        setBooleanField(term2342, term2342.getClass(), "visited", false);
        setField(term2357, term2357.getClass(), "baseType", null);
        setField(term2357, term2357.getClass(), "implementedInterfaces", null);
        setField(term2357, term2357.getClass(), "parameters", null);
        setField(term2357, term2357.getClass(), "thrownTypes", null);
        setField(term2357, term2357.getClass(), "templateTypeName", null);
        setField(term2357, term2357.getClass(), "description", null);
        setField(term2357, term2357.getClass(), "deprecated", null);
        setField(term2357, term2357.getClass(), "license", null);
        setField(term2357, term2357.getClass(), "suppressions", null);
        setField(term2356, term2356.getClass(), "info", term2357);
        setField(term2358, term2358.getClass(), "markers", null);
        setField(term2358, term2358.getClass(), "parameters", null);
        setField(term2358, term2358.getClass(), "throwsDescriptions", null);
        setField(term2358, term2358.getClass(), "blockDescription", null);
        setField(term2358, term2358.getClass(), "fileOverview", null);
        setField(term2358, term2358.getClass(), "returnDescription", null);
        setField(term2358, term2358.getClass(), "version", null);
        setField(term2358, term2358.getClass(), "authors", null);
        setField(term2358, term2358.getClass(), "sees", null);
        setField(term2356, term2356.getClass(), "documentation", term2358);
        setField(term2356, term2356.getClass(), "sourceName", "");
        setField(term2356, term2356.getClass(), "visibility", enum141);
        setIntField(term2356, term2356.getClass(), "bitset", 1225272962);
        setField(term2363, term2363.getClass(), "root", null);
        setField(term2363, term2363.getClass(), "sourceName", null);
        setField(term2363, term2363.getClass(), "registry", null);
        setField(term2356, term2356.getClass(), "type", term2363);
        setField(term2364, term2364.getClass(), "root", null);
        setField(term2364, term2364.getClass(), "sourceName", null);
        setField(term2364, term2364.getClass(), "registry", null);
        setField(term2356, term2356.getClass(), "thisType", term2364);
        setBooleanField(term2356, term2356.getClass(), "includeDocumentation", true);
        setField(term2342, term2342.getClass(), "docInfo", term2356);
        setBooleanField(term2342, term2342.getClass(), "unknown", true);
        setBooleanField(term2342, term2342.getClass(), "resolved", true);
        setField(term2342, term2342.getClass(), "resolveResult", null);
        setField(term2342, term2342.getClass(), "registry", null);
        setField(term2285, term2285.getClass(), "templateType", term2342);
        setField(term2284, term2284.getClass(), "registry", term2285);
        setBooleanField(term2284, term2284.getClass(), "parseJsDocDocumentation", true);
        setBooleanField(term2284, term2284.getClass(), "isIdeMode", true);
        setField(term2284, term2284.getClass(), "annotationNames", term2370);
        term56466 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser$ErrorReporterParser"));
        Object term56467 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        setField(term56467, term56467.getClass(), "stream", null);
        setField(term56467, term56467.getClass(), "typeRegistry", null);
        setField(term56467, term56467.getClass(), "jsdocBuilder", null);
        setField(term56467, term56467.getClass(), "sourceName", null);
        setField(term56467, term56467.getClass(), "errorReporter", null);
        setField(term56467, term56467.getClass(), "parser", null);
        setField(term56467, term56467.getClass(), "fileOverviewJSDocInfo", null);
        setField(term56467, term56467.getClass(), "state", null);
        setField(term56467, term56467.getClass(), "annotationNames", null);
        setField(term56467, term56467.getClass(), "fileLevelJsDocBuilder", null);
        setField(term56467, term56467.getClass(), "unreadToken", null);
        setField(term56466, term56466.getClass(), "this$0", term56467);
        term56468 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        setField(term56468, term56468.getClass(), "stream", null);
        setField(term56468, term56468.getClass(), "typeRegistry", null);
        setField(term56468, term56468.getClass(), "jsdocBuilder", null);
        setField(term56468, term56468.getClass(), "sourceName", null);
        setField(term56468, term56468.getClass(), "errorReporter", null);
        setField(term56468, term56468.getClass(), "parser", null);
        setField(term56468, term56468.getClass(), "fileOverviewJSDocInfo", null);
        setField(term56468, term56468.getClass(), "state", null);
        setField(term56468, term56468.getClass(), "annotationNames", null);
        setField(term56468, term56468.getClass(), "fileLevelJsDocBuilder", null);
        setField(term56468, term56468.getClass(), "unreadToken", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.parsing.Config");
        argTypes[3] = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ErrorReporter");
        Object[] args = new Object[4];
        args[0] = term2221;
        args[1] = "XPKmummaqg";
        args[2] = term2284;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term56466));
        assertTrue(recursiveEquals(term2221, term56468));
        assertTrue(recursiveEquals(term2284, true));
    }

};


