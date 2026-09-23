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

public class JsDocInfoParser_parseAndRecordTypeNode_183593997160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4923;
     Object enum153;

    public JsDocInfoParser_parseAndRecordTypeNode_183593997160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4971 = new HashMap();
        HashMap term4980 = new HashMap();
        Set<Object> term290390 =  ((Map) term4980).keySet();
        HashSet term4979 = new HashSet((Collection<? extends Object>) term290390);
        HashMap term4987 = new HashMap();
        Set<Object> term290391 =  ((Map) term4987).keySet();
        HashSet term4986 = new HashSet((Collection<? extends Object>) term290391);
        HashMap term4994 = new HashMap();
        Set<Object> term290392 =  ((Map) term4994).keySet();
        HashSet term4993 = new HashSet((Collection<? extends Object>) term290392);
        HashMap term4999 = new HashMap();
        HashMap term5004 = new HashMap();
        Class<? extends Object> term290414 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term290413 = ((Class) term290414).getDeclaredField((String) "INHERITED");
        ((Field) term290413).setAccessible(true);
        Object enum151 = ((Field) term290413).get((Object) null);
        Class<? extends Object> term290698 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocInfoParser$State");
        Field term290697 = ((Class) term290698).getDeclaredField((String) "SEARCHING_ANNOTATION");
        ((Field) term290697).setAccessible(true);
        Object enum152 = ((Field) term290697).get((Object) null);
        HashMap term5098 = new HashMap();
        term4923 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term4924 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term4937 = (char[]) newCharArray(4);
        int[] term4943 = (int[]) newIntArray(0);
        Object term4969 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term4970 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 7);
        Object term5025 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term5039 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term5040 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term5041 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term5046 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term5047 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term5051 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term5052 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term5057 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term5070 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser$ErrorReporterParser"));
        Object term5071 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term5109 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        setField(term4924, term4924.getClass(), "string", "sZdUNdggUW");
        setCharElement(term4937, 0, 'g');
        setCharElement(term4937, 1, 'Q');
        setCharElement(term4937, 2, 'H');
        setCharElement(term4937, 3, 'g');
        setField(term4924, term4924.getClass(), "stringBuffer", term4937);
        setIntField(term4924, term4924.getClass(), "stringBufferTop", 1532716628);
        setField(term4924, term4924.getClass(), "ungetBuffer", term4943);
        setIntField(term4924, term4924.getClass(), "ungetCursor", -1801760683);
        setBooleanField(term4924, term4924.getClass(), "hitEOF", false);
        setIntField(term4924, term4924.getClass(), "lineStart", 1141317871);
        setIntField(term4924, term4924.getClass(), "lineEndChar", 890669485);
        setIntField(term4924, term4924.getClass(), "lineno", 691577392);
        setIntField(term4924, term4924.getClass(), "charno", -893623680);
        setIntField(term4924, term4924.getClass(), "initCharno", -1963434938);
        setIntField(term4924, term4924.getClass(), "initLineno", 906181092);
        setField(term4924, term4924.getClass(), "sourceString", "OqbwYQfvAe");
        setIntField(term4924, term4924.getClass(), "sourceEnd", 1045657203);
        setIntField(term4924, term4924.getClass(), "sourceCursor", 1386130016);
        setIntField(term4924, term4924.getClass(), "cursor", 1072005683);
        setIntField(term4924, term4924.getClass(), "tokenBeg", 1861318859);
        setIntField(term4924, term4924.getClass(), "tokenEnd", 1474524152);
        setField(term4923, term4923.getClass(), "stream", term4924);
        setField(term4969, term4969.getClass(), "reporter", null);
        setField(term4969, term4969.getClass(), "nativeTypes", term4970);
        setField(term4969, term4969.getClass(), "namesToTypes", term4971);
        setField(term4969, term4969.getClass(), "namespaces", term4979);
        setField(term4969, term4969.getClass(), "enumTypeNames", term4986);
        setField(term4969, term4969.getClass(), "forwardDeclaredTypes", term4993);
        setField(term4969, term4969.getClass(), "typesIndexedByProperty", term4999);
        setField(term4969, term4969.getClass(), "greatestSubtypeByProperty", term5004);
        setField(term4969, term4969.getClass(), "interfaceToImplementors", null);
        setField(term4969, term4969.getClass(), "unresolvedNamedTypes", null);
        setField(term4969, term4969.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term4969, term4969.getClass(), "lastGeneration", true);
        setField(term4969, term4969.getClass(), "templateTypeName", "AZdLeSugwv");
        setField(term5025, term5025.getClass(), "name", "RMsXuyzKJV");
        setField(term5025, term5025.getClass(), "referencedType", null);
        setBooleanField(term5025, term5025.getClass(), "visited", true);
        setField(term5040, term5040.getClass(), "baseType", null);
        setField(term5040, term5040.getClass(), "implementedInterfaces", null);
        setField(term5040, term5040.getClass(), "parameters", null);
        setField(term5040, term5040.getClass(), "thrownTypes", null);
        setField(term5040, term5040.getClass(), "templateTypeName", null);
        setField(term5040, term5040.getClass(), "description", null);
        setField(term5040, term5040.getClass(), "deprecated", null);
        setField(term5040, term5040.getClass(), "license", null);
        setField(term5040, term5040.getClass(), "suppressions", null);
        setField(term5039, term5039.getClass(), "info", term5040);
        setField(term5041, term5041.getClass(), "markers", null);
        setField(term5041, term5041.getClass(), "parameters", null);
        setField(term5041, term5041.getClass(), "throwsDescriptions", null);
        setField(term5041, term5041.getClass(), "blockDescription", null);
        setField(term5041, term5041.getClass(), "fileOverview", null);
        setField(term5041, term5041.getClass(), "returnDescription", null);
        setField(term5041, term5041.getClass(), "version", null);
        setField(term5041, term5041.getClass(), "authors", null);
        setField(term5041, term5041.getClass(), "sees", null);
        setField(term5039, term5039.getClass(), "documentation", term5041);
        setField(term5039, term5039.getClass(), "sourceName", "");
        setField(term5039, term5039.getClass(), "visibility", enum151);
        setIntField(term5039, term5039.getClass(), "bitset", 568954359);
        setField(term5046, term5046.getClass(), "root", null);
        setField(term5046, term5046.getClass(), "sourceName", null);
        setField(term5046, term5046.getClass(), "registry", null);
        setField(term5039, term5039.getClass(), "type", term5046);
        setField(term5047, term5047.getClass(), "root", null);
        setField(term5047, term5047.getClass(), "sourceName", null);
        setField(term5047, term5047.getClass(), "registry", null);
        setField(term5039, term5039.getClass(), "thisType", term5047);
        setBooleanField(term5039, term5039.getClass(), "includeDocumentation", false);
        setField(term5025, term5025.getClass(), "docInfo", term5039);
        setBooleanField(term5025, term5025.getClass(), "unknown", true);
        setBooleanField(term5025, term5025.getClass(), "resolved", true);
        setField(term5025, term5025.getClass(), "resolveResult", null);
        setField(term5025, term5025.getClass(), "registry", null);
        setField(term4969, term4969.getClass(), "templateType", term5025);
        setField(term4923, term4923.getClass(), "typeRegistry", term4969);
        setField(term5052, term5052.getClass(), "info", null);
        setField(term5052, term5052.getClass(), "documentation", null);
        setField(term5052, term5052.getClass(), "sourceName", null);
        setField(term5052, term5052.getClass(), "visibility", null);
        setIntField(term5052, term5052.getClass(), "bitset", 0);
        setField(term5052, term5052.getClass(), "type", null);
        setField(term5052, term5052.getClass(), "thisType", null);
        setBooleanField(term5052, term5052.getClass(), "includeDocumentation", false);
        setField(term5051, term5051.getClass(), "currentInfo", term5052);
        setBooleanField(term5051, term5051.getClass(), "populated", true);
        setBooleanField(term5051, term5051.getClass(), "parseDocumentation", false);
        setField(term5057, term5057.getClass(), "annotation", null);
        setField(term5057, term5057.getClass(), "name", null);
        setField(term5057, term5057.getClass(), "description", null);
        setField(term5057, term5057.getClass(), "type", null);
        setField(term5051, term5051.getClass(), "currentMarker", term5057);
        setField(term4923, term4923.getClass(), "jsdocBuilder", term5051);
        setField(term4923, term4923.getClass(), "sourceName", "AHbZyFOmlo");
        setField(term4923, term4923.getClass(), "errorReporter", null);
        setField(term5070, term5070.getClass(), "this$0", null);
        setField(term4923, term4923.getClass(), "parser", term5070);
        setField(term5071, term5071.getClass(), "info", null);
        setField(term5071, term5071.getClass(), "documentation", null);
        setField(term5071, term5071.getClass(), "sourceName", null);
        setField(term5071, term5071.getClass(), "visibility", null);
        setIntField(term5071, term5071.getClass(), "bitset", 0);
        setField(term5071, term5071.getClass(), "type", null);
        setField(term5071, term5071.getClass(), "thisType", null);
        setBooleanField(term5071, term5071.getClass(), "includeDocumentation", false);
        setField(term4923, term4923.getClass(), "fileOverviewJSDocInfo", term5071);
        setField(term4923, term4923.getClass(), "state", enum152);
        setField(term4923, term4923.getClass(), "annotationNames", term5098);
        setField(term5109, term5109.getClass(), "this$0", null);
        setField(term4923, term4923.getClass(), "fileLevelJsDocBuilder", term5109);
        setField(term4923, term4923.getClass(), "unreadToken", null);
        Class<? extends Object> term291055 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term291054 = ((Class) term291055).getDeclaredField((String) "RC");
        ((Field) term291054).setAccessible(true);
        enum153 = ((Field) term291054).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum153;
        try {
            callMethod(klass, "parseAndRecordTypeNode", argTypes, term4923, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


