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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;

public class JsDocInfoParser_match_1417225348100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47462;
     Object enum264;
     Object enum265;

    public JsDocInfoParser_match_1417225348100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term47522 = new HashMap();
        HashMap term47531 = new HashMap();
        Set<Object> term338353 =  ((Map) term47531).keySet();
        HashSet term47530 = new HashSet((Collection<? extends Object>) term338353);
        HashMap term47538 = new HashMap();
        Set<Object> term338354 =  ((Map) term47538).keySet();
        HashSet term47537 = new HashSet((Collection<? extends Object>) term338354);
        HashMap term47545 = new HashMap();
        Set<Object> term338355 =  ((Map) term47545).keySet();
        HashSet term47544 = new HashSet((Collection<? extends Object>) term338355);
        HashMap term47551 = new HashMap();
        HashMap term47556 = new HashMap();
        Class<? extends Object> term338377 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term338376 = ((Class) term338377).getDeclaredField((String) "INHERITED");
        ((Field) term338376).setAccessible(true);
        Object enum262 = ((Field) term338376).get((Object) null);
        Class<? extends Object> term338661 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocInfoParser$State");
        Field term338660 = ((Class) term338661).getDeclaredField((String) "SEARCHING_NEWLINE");
        ((Field) term338660).setAccessible(true);
        Object enum263 = ((Field) term338660).get((Object) null);
        HashMap term47647 = new HashMap();
        term47462 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term47463 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term47476 = (char[]) newCharArray(7);
        int[] term47485 = (int[]) newIntArray(9);
        Object term47520 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term47521 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 6);
        Object term47577 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term47591 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term47592 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term47593 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term47598 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term47599 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term47603 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term47604 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term47609 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term47622 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser$ErrorReporterParser"));
        Object term47623 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term47658 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        setField(term47463, term47463.getClass(), "string", "gqhqalMaKC");
        setCharElement(term47476, 0, 'T');
        setCharElement(term47476, 1, 'i');
        setCharElement(term47476, 2, 'm');
        setCharElement(term47476, 3, 'M');
        setCharElement(term47476, 4, 'b');
        setCharElement(term47476, 5, 'l');
        setCharElement(term47476, 6, 'Y');
        setField(term47463, term47463.getClass(), "stringBuffer", term47476);
        setIntField(term47463, term47463.getClass(), "stringBufferTop", 1124282188);
        setIntElement(term47485, 0, -489441521);
        setIntElement(term47485, 1, 225873732);
        setIntElement(term47485, 2, 529879356);
        setIntElement(term47485, 3, 18072182);
        setIntElement(term47485, 4, 1544768934);
        setIntElement(term47485, 5, -383508597);
        setIntElement(term47485, 6, -819372164);
        setIntElement(term47485, 7, 958132675);
        setIntElement(term47485, 8, -689879283);
        setField(term47463, term47463.getClass(), "ungetBuffer", term47485);
        setIntField(term47463, term47463.getClass(), "ungetCursor", 1985432430);
        setBooleanField(term47463, term47463.getClass(), "hitEOF", false);
        setIntField(term47463, term47463.getClass(), "lineStart", -1769933499);
        setIntField(term47463, term47463.getClass(), "lineEndChar", -1510932472);
        setIntField(term47463, term47463.getClass(), "lineno", 1970654816);
        setIntField(term47463, term47463.getClass(), "charno", 1354781442);
        setIntField(term47463, term47463.getClass(), "initCharno", -393590701);
        setIntField(term47463, term47463.getClass(), "initLineno", 86344574);
        setField(term47463, term47463.getClass(), "sourceString", "qkMduZHBXR");
        setIntField(term47463, term47463.getClass(), "sourceEnd", -829441157);
        setIntField(term47463, term47463.getClass(), "sourceCursor", -1489991025);
        setIntField(term47463, term47463.getClass(), "cursor", -1542979444);
        setIntField(term47463, term47463.getClass(), "tokenBeg", -1130401612);
        setIntField(term47463, term47463.getClass(), "tokenEnd", -316771104);
        setField(term47462, term47462.getClass(), "stream", term47463);
        setField(term47520, term47520.getClass(), "reporter", null);
        setField(term47520, term47520.getClass(), "nativeTypes", term47521);
        setField(term47520, term47520.getClass(), "namesToTypes", term47522);
        setField(term47520, term47520.getClass(), "namespaces", term47530);
        setField(term47520, term47520.getClass(), "enumTypeNames", term47537);
        setField(term47520, term47520.getClass(), "forwardDeclaredTypes", term47544);
        setField(term47520, term47520.getClass(), "typesIndexedByProperty", term47551);
        setField(term47520, term47520.getClass(), "greatestSubtypeByProperty", term47556);
        setField(term47520, term47520.getClass(), "interfaceToImplementors", null);
        setField(term47520, term47520.getClass(), "unresolvedNamedTypes", null);
        setField(term47520, term47520.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term47520, term47520.getClass(), "lastGeneration", true);
        setField(term47520, term47520.getClass(), "templateTypeName", "ZBLFNFVEHD");
        setField(term47577, term47577.getClass(), "name", "miNxpUfOyL");
        setField(term47577, term47577.getClass(), "referencedType", null);
        setBooleanField(term47577, term47577.getClass(), "visited", true);
        setField(term47592, term47592.getClass(), "baseType", null);
        setField(term47592, term47592.getClass(), "implementedInterfaces", null);
        setField(term47592, term47592.getClass(), "parameters", null);
        setField(term47592, term47592.getClass(), "thrownTypes", null);
        setField(term47592, term47592.getClass(), "templateTypeName", null);
        setField(term47592, term47592.getClass(), "description", null);
        setField(term47592, term47592.getClass(), "deprecated", null);
        setField(term47592, term47592.getClass(), "license", null);
        setField(term47592, term47592.getClass(), "suppressions", null);
        setField(term47591, term47591.getClass(), "info", term47592);
        setField(term47593, term47593.getClass(), "markers", null);
        setField(term47593, term47593.getClass(), "parameters", null);
        setField(term47593, term47593.getClass(), "throwsDescriptions", null);
        setField(term47593, term47593.getClass(), "blockDescription", null);
        setField(term47593, term47593.getClass(), "fileOverview", null);
        setField(term47593, term47593.getClass(), "returnDescription", null);
        setField(term47593, term47593.getClass(), "version", null);
        setField(term47593, term47593.getClass(), "authors", null);
        setField(term47593, term47593.getClass(), "sees", null);
        setField(term47591, term47591.getClass(), "documentation", term47593);
        setField(term47591, term47591.getClass(), "sourceName", "");
        setField(term47591, term47591.getClass(), "visibility", enum262);
        setIntField(term47591, term47591.getClass(), "bitset", -1374527319);
        setField(term47598, term47598.getClass(), "root", null);
        setField(term47598, term47598.getClass(), "sourceName", null);
        setField(term47598, term47598.getClass(), "registry", null);
        setField(term47591, term47591.getClass(), "type", term47598);
        setField(term47599, term47599.getClass(), "root", null);
        setField(term47599, term47599.getClass(), "sourceName", null);
        setField(term47599, term47599.getClass(), "registry", null);
        setField(term47591, term47591.getClass(), "thisType", term47599);
        setBooleanField(term47591, term47591.getClass(), "includeDocumentation", false);
        setField(term47577, term47577.getClass(), "docInfo", term47591);
        setBooleanField(term47577, term47577.getClass(), "unknown", true);
        setBooleanField(term47577, term47577.getClass(), "resolved", true);
        setField(term47577, term47577.getClass(), "resolveResult", null);
        setField(term47577, term47577.getClass(), "registry", null);
        setField(term47520, term47520.getClass(), "templateType", term47577);
        setField(term47462, term47462.getClass(), "typeRegistry", term47520);
        setField(term47604, term47604.getClass(), "info", null);
        setField(term47604, term47604.getClass(), "documentation", null);
        setField(term47604, term47604.getClass(), "sourceName", null);
        setField(term47604, term47604.getClass(), "visibility", null);
        setIntField(term47604, term47604.getClass(), "bitset", 0);
        setField(term47604, term47604.getClass(), "type", null);
        setField(term47604, term47604.getClass(), "thisType", null);
        setBooleanField(term47604, term47604.getClass(), "includeDocumentation", false);
        setField(term47603, term47603.getClass(), "currentInfo", term47604);
        setBooleanField(term47603, term47603.getClass(), "populated", true);
        setBooleanField(term47603, term47603.getClass(), "parseDocumentation", false);
        setField(term47609, term47609.getClass(), "annotation", null);
        setField(term47609, term47609.getClass(), "name", null);
        setField(term47609, term47609.getClass(), "description", null);
        setField(term47609, term47609.getClass(), "type", null);
        setField(term47603, term47603.getClass(), "currentMarker", term47609);
        setField(term47462, term47462.getClass(), "jsdocBuilder", term47603);
        setField(term47462, term47462.getClass(), "sourceName", "cHZGcMhatT");
        setField(term47462, term47462.getClass(), "errorReporter", null);
        setField(term47622, term47622.getClass(), "this$0", null);
        setField(term47462, term47462.getClass(), "parser", term47622);
        setField(term47623, term47623.getClass(), "info", null);
        setField(term47623, term47623.getClass(), "documentation", null);
        setField(term47623, term47623.getClass(), "sourceName", null);
        setField(term47623, term47623.getClass(), "visibility", null);
        setIntField(term47623, term47623.getClass(), "bitset", 0);
        setField(term47623, term47623.getClass(), "type", null);
        setField(term47623, term47623.getClass(), "thisType", null);
        setBooleanField(term47623, term47623.getClass(), "includeDocumentation", false);
        setField(term47462, term47462.getClass(), "fileOverviewJSDocInfo", term47623);
        setField(term47462, term47462.getClass(), "state", enum263);
        setField(term47462, term47462.getClass(), "annotationNames", term47647);
        setField(term47658, term47658.getClass(), "this$0", null);
        setField(term47462, term47462.getClass(), "fileLevelJsDocBuilder", term47658);
        setField(term47462, term47462.getClass(), "unreadToken", null);
        Class<? extends Object> term339009 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term339008 = ((Class) term339009).getDeclaredField((String) "GT");
        ((Field) term339008).setAccessible(true);
        enum264 = ((Field) term339008).get((Object) null);
        Class<? extends Object> term339257 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term339256 = ((Class) term339257).getDeclaredField((String) "EQUALS");
        ((Field) term339256).setAccessible(true);
        enum265 = ((Field) term339256).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[2];
        args[0] = enum264;
        args[1] = enum265;
        try {
            callMethod(klass, "match", argTypes, term47462, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


