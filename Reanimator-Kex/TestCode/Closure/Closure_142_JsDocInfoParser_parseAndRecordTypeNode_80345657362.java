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
import java.lang.Integer;

public class JsDocInfoParser_parseAndRecordTypeNode_80345657362 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7172;
     Object enum159;
     Object term7369;
     Object term7371;

    public JsDocInfoParser_parseAndRecordTypeNode_80345657362() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7225 = new HashMap();
        HashMap term7234 = new HashMap();
        Set<Object> term293132 =  ((Map) term7234).keySet();
        HashSet term7233 = new HashSet((Collection<? extends Object>) term293132);
        HashMap term7241 = new HashMap();
        Set<Object> term293133 =  ((Map) term7241).keySet();
        HashSet term7240 = new HashSet((Collection<? extends Object>) term293133);
        HashMap term7248 = new HashMap();
        Set<Object> term293134 =  ((Map) term7248).keySet();
        HashSet term7247 = new HashSet((Collection<? extends Object>) term293134);
        HashMap term7253 = new HashMap();
        HashMap term7258 = new HashMap();
        Class<? extends Object> term293156 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term293155 = ((Class) term293156).getDeclaredField((String) "INHERITED");
        ((Field) term293155).setAccessible(true);
        Object enum157 = ((Field) term293155).get((Object) null);
        Class<? extends Object> term293440 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocInfoParser$State");
        Field term293439 = ((Class) term293440).getDeclaredField((String) "NEXT_IS_ANNOTATION");
        ((Field) term293439).setAccessible(true);
        Object enum158 = ((Field) term293439).get((Object) null);
        HashMap term7350 = new HashMap();
        term7172 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term7173 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term7186 = (char[]) newCharArray(8);
        int[] term7196 = (int[]) newIntArray(1);
        Object term7223 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term7224 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 2);
        Object term7279 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term7293 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term7294 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term7295 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term7300 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term7301 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term7305 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term7306 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term7311 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term7324 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser$ErrorReporterParser"));
        Object term7325 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term7361 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        setField(term7173, term7173.getClass(), "string", "WVbxuoDBcn");
        setCharElement(term7186, 0, 'z');
        setCharElement(term7186, 1, 'x');
        setCharElement(term7186, 2, 'x');
        setCharElement(term7186, 3, 't');
        setCharElement(term7186, 4, 'l');
        setCharElement(term7186, 5, 'P');
        setCharElement(term7186, 6, 'w');
        setCharElement(term7186, 7, 'D');
        setField(term7173, term7173.getClass(), "stringBuffer", term7186);
        setIntField(term7173, term7173.getClass(), "stringBufferTop", 2095798786);
        setIntElement(term7196, 0, -1565502840);
        setField(term7173, term7173.getClass(), "ungetBuffer", term7196);
        setIntField(term7173, term7173.getClass(), "ungetCursor", 344323424);
        setBooleanField(term7173, term7173.getClass(), "hitEOF", false);
        setIntField(term7173, term7173.getClass(), "lineStart", 9726679);
        setIntField(term7173, term7173.getClass(), "lineEndChar", -25637976);
        setIntField(term7173, term7173.getClass(), "lineno", 1555897383);
        setIntField(term7173, term7173.getClass(), "charno", 202001407);
        setIntField(term7173, term7173.getClass(), "initCharno", 158873461);
        setIntField(term7173, term7173.getClass(), "initLineno", -430151637);
        setField(term7173, term7173.getClass(), "sourceString", "pvDEABOxLt");
        setIntField(term7173, term7173.getClass(), "sourceEnd", -1697741339);
        setIntField(term7173, term7173.getClass(), "sourceCursor", 98922530);
        setIntField(term7173, term7173.getClass(), "cursor", -1388471422);
        setIntField(term7173, term7173.getClass(), "tokenBeg", -1498296052);
        setIntField(term7173, term7173.getClass(), "tokenEnd", 2098647989);
        setField(term7172, term7172.getClass(), "stream", term7173);
        setField(term7223, term7223.getClass(), "reporter", null);
        setField(term7223, term7223.getClass(), "nativeTypes", term7224);
        setField(term7223, term7223.getClass(), "namesToTypes", term7225);
        setField(term7223, term7223.getClass(), "namespaces", term7233);
        setField(term7223, term7223.getClass(), "enumTypeNames", term7240);
        setField(term7223, term7223.getClass(), "forwardDeclaredTypes", term7247);
        setField(term7223, term7223.getClass(), "typesIndexedByProperty", term7253);
        setField(term7223, term7223.getClass(), "greatestSubtypeByProperty", term7258);
        setField(term7223, term7223.getClass(), "interfaceToImplementors", null);
        setField(term7223, term7223.getClass(), "unresolvedNamedTypes", null);
        setField(term7223, term7223.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term7223, term7223.getClass(), "lastGeneration", false);
        setField(term7223, term7223.getClass(), "templateTypeName", "TweMFhxNdj");
        setField(term7279, term7279.getClass(), "name", "NBrvVzvQHe");
        setField(term7279, term7279.getClass(), "referencedType", null);
        setBooleanField(term7279, term7279.getClass(), "visited", false);
        setField(term7294, term7294.getClass(), "baseType", null);
        setField(term7294, term7294.getClass(), "implementedInterfaces", null);
        setField(term7294, term7294.getClass(), "parameters", null);
        setField(term7294, term7294.getClass(), "thrownTypes", null);
        setField(term7294, term7294.getClass(), "templateTypeName", null);
        setField(term7294, term7294.getClass(), "description", null);
        setField(term7294, term7294.getClass(), "deprecated", null);
        setField(term7294, term7294.getClass(), "license", null);
        setField(term7294, term7294.getClass(), "suppressions", null);
        setField(term7293, term7293.getClass(), "info", term7294);
        setField(term7295, term7295.getClass(), "markers", null);
        setField(term7295, term7295.getClass(), "parameters", null);
        setField(term7295, term7295.getClass(), "throwsDescriptions", null);
        setField(term7295, term7295.getClass(), "blockDescription", null);
        setField(term7295, term7295.getClass(), "fileOverview", null);
        setField(term7295, term7295.getClass(), "returnDescription", null);
        setField(term7295, term7295.getClass(), "version", null);
        setField(term7295, term7295.getClass(), "authors", null);
        setField(term7295, term7295.getClass(), "sees", null);
        setField(term7293, term7293.getClass(), "documentation", term7295);
        setField(term7293, term7293.getClass(), "sourceName", "");
        setField(term7293, term7293.getClass(), "visibility", enum157);
        setIntField(term7293, term7293.getClass(), "bitset", 1598895173);
        setField(term7300, term7300.getClass(), "root", null);
        setField(term7300, term7300.getClass(), "sourceName", null);
        setField(term7300, term7300.getClass(), "registry", null);
        setField(term7293, term7293.getClass(), "type", term7300);
        setField(term7301, term7301.getClass(), "root", null);
        setField(term7301, term7301.getClass(), "sourceName", null);
        setField(term7301, term7301.getClass(), "registry", null);
        setField(term7293, term7293.getClass(), "thisType", term7301);
        setBooleanField(term7293, term7293.getClass(), "includeDocumentation", false);
        setField(term7279, term7279.getClass(), "docInfo", term7293);
        setBooleanField(term7279, term7279.getClass(), "unknown", true);
        setBooleanField(term7279, term7279.getClass(), "resolved", true);
        setField(term7279, term7279.getClass(), "resolveResult", null);
        setField(term7279, term7279.getClass(), "registry", null);
        setField(term7223, term7223.getClass(), "templateType", term7279);
        setField(term7172, term7172.getClass(), "typeRegistry", term7223);
        setField(term7306, term7306.getClass(), "info", null);
        setField(term7306, term7306.getClass(), "documentation", null);
        setField(term7306, term7306.getClass(), "sourceName", null);
        setField(term7306, term7306.getClass(), "visibility", null);
        setIntField(term7306, term7306.getClass(), "bitset", 0);
        setField(term7306, term7306.getClass(), "type", null);
        setField(term7306, term7306.getClass(), "thisType", null);
        setBooleanField(term7306, term7306.getClass(), "includeDocumentation", false);
        setField(term7305, term7305.getClass(), "currentInfo", term7306);
        setBooleanField(term7305, term7305.getClass(), "populated", false);
        setBooleanField(term7305, term7305.getClass(), "parseDocumentation", false);
        setField(term7311, term7311.getClass(), "annotation", null);
        setField(term7311, term7311.getClass(), "name", null);
        setField(term7311, term7311.getClass(), "description", null);
        setField(term7311, term7311.getClass(), "type", null);
        setField(term7305, term7305.getClass(), "currentMarker", term7311);
        setField(term7172, term7172.getClass(), "jsdocBuilder", term7305);
        setField(term7172, term7172.getClass(), "sourceName", "wBGfLpNNiZ");
        setField(term7172, term7172.getClass(), "errorReporter", null);
        setField(term7324, term7324.getClass(), "this$0", null);
        setField(term7172, term7172.getClass(), "parser", term7324);
        setField(term7325, term7325.getClass(), "info", null);
        setField(term7325, term7325.getClass(), "documentation", null);
        setField(term7325, term7325.getClass(), "sourceName", null);
        setField(term7325, term7325.getClass(), "visibility", null);
        setIntField(term7325, term7325.getClass(), "bitset", 0);
        setField(term7325, term7325.getClass(), "type", null);
        setField(term7325, term7325.getClass(), "thisType", null);
        setBooleanField(term7325, term7325.getClass(), "includeDocumentation", false);
        setField(term7172, term7172.getClass(), "fileOverviewJSDocInfo", term7325);
        setField(term7172, term7172.getClass(), "state", enum158);
        setField(term7172, term7172.getClass(), "annotationNames", term7350);
        setField(term7361, term7361.getClass(), "this$0", null);
        setField(term7172, term7172.getClass(), "fileLevelJsDocBuilder", term7361);
        setField(term7172, term7172.getClass(), "unreadToken", null);
        Class<? extends Object> term293791 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term293790 = ((Class) term293791).getDeclaredField((String) "EOC");
        ((Field) term293790).setAccessible(true);
        enum159 = ((Field) term293790).get((Object) null);
        term7369 = new Integer(-227365013);
        term7371 = new Integer(11724947);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = enum159;
        args[1] = term7369;
        args[2] = term7371;
        try {
            callMethod(klass, "parseAndRecordTypeNode", argTypes, term7172, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


