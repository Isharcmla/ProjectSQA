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

public class JsDocInfoParser_parseTypeExpressionAnnotation_194227385074 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19374;
     Object enum192;

    public JsDocInfoParser_parseTypeExpressionAnnotation_194227385074() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term19436 = new HashMap();
        HashMap term19445 = new HashMap();
        Set<Object> term307237 =  ((Map) term19445).keySet();
        HashSet term19444 = new HashSet((Collection<? extends Object>) term307237);
        HashMap term19452 = new HashMap();
        Set<Object> term307238 =  ((Map) term19452).keySet();
        HashSet term19451 = new HashSet((Collection<? extends Object>) term307238);
        HashMap term19459 = new HashMap();
        Set<Object> term307239 =  ((Map) term19459).keySet();
        HashSet term19458 = new HashSet((Collection<? extends Object>) term307239);
        HashMap term19465 = new HashMap();
        HashMap term19470 = new HashMap();
        Class<? extends Object> term307261 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term307260 = ((Class) term307261).getDeclaredField((String) "INHERITED");
        ((Field) term307260).setAccessible(true);
        Object enum190 = ((Field) term307260).get((Object) null);
        Class<? extends Object> term307545 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocInfoParser$State");
        Field term307544 = ((Class) term307545).getDeclaredField((String) "SEARCHING_ANNOTATION");
        ((Field) term307544).setAccessible(true);
        Object enum191 = ((Field) term307544).get((Object) null);
        HashMap term19564 = new HashMap();
        term19374 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term19375 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term19388 = (char[]) newCharArray(9);
        int[] term19399 = (int[]) newIntArray(9);
        Object term19434 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term19435 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        Object term19491 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term19505 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term19506 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term19507 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term19512 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term19513 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term19517 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term19518 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term19523 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term19536 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser$ErrorReporterParser"));
        Object term19537 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term19575 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        setField(term19375, term19375.getClass(), "string", "fcCAsvfBbe");
        setCharElement(term19388, 0, 'I');
        setCharElement(term19388, 1, 'r');
        setCharElement(term19388, 2, 'c');
        setCharElement(term19388, 3, 'R');
        setCharElement(term19388, 4, 'M');
        setCharElement(term19388, 5, 'F');
        setCharElement(term19388, 6, 'I');
        setCharElement(term19388, 7, 's');
        setCharElement(term19388, 8, 'Y');
        setField(term19375, term19375.getClass(), "stringBuffer", term19388);
        setIntField(term19375, term19375.getClass(), "stringBufferTop", 1221443226);
        setIntElement(term19399, 0, 908108726);
        setIntElement(term19399, 1, 1023209512);
        setIntElement(term19399, 2, 1084849225);
        setIntElement(term19399, 3, -1702055571);
        setIntElement(term19399, 4, -944542900);
        setIntElement(term19399, 5, 2063762142);
        setIntElement(term19399, 6, 1658391716);
        setIntElement(term19399, 7, 2143282300);
        setIntElement(term19399, 8, 1137624258);
        setField(term19375, term19375.getClass(), "ungetBuffer", term19399);
        setIntField(term19375, term19375.getClass(), "ungetCursor", 977862393);
        setBooleanField(term19375, term19375.getClass(), "hitEOF", true);
        setIntField(term19375, term19375.getClass(), "lineStart", 301401782);
        setIntField(term19375, term19375.getClass(), "lineEndChar", 1988605357);
        setIntField(term19375, term19375.getClass(), "lineno", 808203320);
        setIntField(term19375, term19375.getClass(), "charno", -544382127);
        setIntField(term19375, term19375.getClass(), "initCharno", -1830198043);
        setIntField(term19375, term19375.getClass(), "initLineno", -439048495);
        setField(term19375, term19375.getClass(), "sourceString", "mUNcKUxghj");
        setIntField(term19375, term19375.getClass(), "sourceEnd", -1849105286);
        setIntField(term19375, term19375.getClass(), "sourceCursor", 1334483645);
        setIntField(term19375, term19375.getClass(), "cursor", 917513193);
        setIntField(term19375, term19375.getClass(), "tokenBeg", 787278105);
        setIntField(term19375, term19375.getClass(), "tokenEnd", -2063843486);
        setField(term19374, term19374.getClass(), "stream", term19375);
        setField(term19434, term19434.getClass(), "reporter", null);
        setField(term19434, term19434.getClass(), "nativeTypes", term19435);
        setField(term19434, term19434.getClass(), "namesToTypes", term19436);
        setField(term19434, term19434.getClass(), "namespaces", term19444);
        setField(term19434, term19434.getClass(), "enumTypeNames", term19451);
        setField(term19434, term19434.getClass(), "forwardDeclaredTypes", term19458);
        setField(term19434, term19434.getClass(), "typesIndexedByProperty", term19465);
        setField(term19434, term19434.getClass(), "greatestSubtypeByProperty", term19470);
        setField(term19434, term19434.getClass(), "interfaceToImplementors", null);
        setField(term19434, term19434.getClass(), "unresolvedNamedTypes", null);
        setField(term19434, term19434.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term19434, term19434.getClass(), "lastGeneration", true);
        setField(term19434, term19434.getClass(), "templateTypeName", "NZdTuwSCIM");
        setField(term19491, term19491.getClass(), "name", "dDHcmzPAmP");
        setField(term19491, term19491.getClass(), "referencedType", null);
        setBooleanField(term19491, term19491.getClass(), "visited", false);
        setField(term19506, term19506.getClass(), "baseType", null);
        setField(term19506, term19506.getClass(), "implementedInterfaces", null);
        setField(term19506, term19506.getClass(), "parameters", null);
        setField(term19506, term19506.getClass(), "thrownTypes", null);
        setField(term19506, term19506.getClass(), "templateTypeName", null);
        setField(term19506, term19506.getClass(), "description", null);
        setField(term19506, term19506.getClass(), "deprecated", null);
        setField(term19506, term19506.getClass(), "license", null);
        setField(term19506, term19506.getClass(), "suppressions", null);
        setField(term19505, term19505.getClass(), "info", term19506);
        setField(term19507, term19507.getClass(), "markers", null);
        setField(term19507, term19507.getClass(), "parameters", null);
        setField(term19507, term19507.getClass(), "throwsDescriptions", null);
        setField(term19507, term19507.getClass(), "blockDescription", null);
        setField(term19507, term19507.getClass(), "fileOverview", null);
        setField(term19507, term19507.getClass(), "returnDescription", null);
        setField(term19507, term19507.getClass(), "version", null);
        setField(term19507, term19507.getClass(), "authors", null);
        setField(term19507, term19507.getClass(), "sees", null);
        setField(term19505, term19505.getClass(), "documentation", term19507);
        setField(term19505, term19505.getClass(), "sourceName", "");
        setField(term19505, term19505.getClass(), "visibility", enum190);
        setIntField(term19505, term19505.getClass(), "bitset", 833762980);
        setField(term19512, term19512.getClass(), "root", null);
        setField(term19512, term19512.getClass(), "sourceName", null);
        setField(term19512, term19512.getClass(), "registry", null);
        setField(term19505, term19505.getClass(), "type", term19512);
        setField(term19513, term19513.getClass(), "root", null);
        setField(term19513, term19513.getClass(), "sourceName", null);
        setField(term19513, term19513.getClass(), "registry", null);
        setField(term19505, term19505.getClass(), "thisType", term19513);
        setBooleanField(term19505, term19505.getClass(), "includeDocumentation", true);
        setField(term19491, term19491.getClass(), "docInfo", term19505);
        setBooleanField(term19491, term19491.getClass(), "unknown", true);
        setBooleanField(term19491, term19491.getClass(), "resolved", false);
        setField(term19491, term19491.getClass(), "resolveResult", null);
        setField(term19491, term19491.getClass(), "registry", null);
        setField(term19434, term19434.getClass(), "templateType", term19491);
        setField(term19374, term19374.getClass(), "typeRegistry", term19434);
        setField(term19518, term19518.getClass(), "info", null);
        setField(term19518, term19518.getClass(), "documentation", null);
        setField(term19518, term19518.getClass(), "sourceName", null);
        setField(term19518, term19518.getClass(), "visibility", null);
        setIntField(term19518, term19518.getClass(), "bitset", 0);
        setField(term19518, term19518.getClass(), "type", null);
        setField(term19518, term19518.getClass(), "thisType", null);
        setBooleanField(term19518, term19518.getClass(), "includeDocumentation", false);
        setField(term19517, term19517.getClass(), "currentInfo", term19518);
        setBooleanField(term19517, term19517.getClass(), "populated", false);
        setBooleanField(term19517, term19517.getClass(), "parseDocumentation", false);
        setField(term19523, term19523.getClass(), "annotation", null);
        setField(term19523, term19523.getClass(), "name", null);
        setField(term19523, term19523.getClass(), "description", null);
        setField(term19523, term19523.getClass(), "type", null);
        setField(term19517, term19517.getClass(), "currentMarker", term19523);
        setField(term19374, term19374.getClass(), "jsdocBuilder", term19517);
        setField(term19374, term19374.getClass(), "sourceName", "GSOWFHMlbF");
        setField(term19374, term19374.getClass(), "errorReporter", null);
        setField(term19536, term19536.getClass(), "this$0", null);
        setField(term19374, term19374.getClass(), "parser", term19536);
        setField(term19537, term19537.getClass(), "info", null);
        setField(term19537, term19537.getClass(), "documentation", null);
        setField(term19537, term19537.getClass(), "sourceName", null);
        setField(term19537, term19537.getClass(), "visibility", null);
        setIntField(term19537, term19537.getClass(), "bitset", 0);
        setField(term19537, term19537.getClass(), "type", null);
        setField(term19537, term19537.getClass(), "thisType", null);
        setBooleanField(term19537, term19537.getClass(), "includeDocumentation", false);
        setField(term19374, term19374.getClass(), "fileOverviewJSDocInfo", term19537);
        setField(term19374, term19374.getClass(), "state", enum191);
        setField(term19374, term19374.getClass(), "annotationNames", term19564);
        setField(term19575, term19575.getClass(), "this$0", null);
        setField(term19374, term19374.getClass(), "fileLevelJsDocBuilder", term19575);
        setField(term19374, term19374.getClass(), "unreadToken", null);
        Class<? extends Object> term307902 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term307901 = ((Class) term307902).getDeclaredField((String) "EQUALS");
        ((Field) term307901).setAccessible(true);
        enum192 = ((Field) term307901).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum192;
        try {
            callMethod(klass, "parseTypeExpressionAnnotation", argTypes, term19374, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


