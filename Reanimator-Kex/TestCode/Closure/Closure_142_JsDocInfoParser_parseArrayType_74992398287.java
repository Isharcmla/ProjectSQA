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

public class JsDocInfoParser_parseArrayType_74992398287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34198;
     Object enum234;

    public JsDocInfoParser_parseArrayType_74992398287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term34250 = new HashMap();
        HashMap term34259 = new HashMap();
        Set<Object> term327662 =  ((Map) term34259).keySet();
        HashSet term34258 = new HashSet((Collection<? extends Object>) term327662);
        HashMap term34266 = new HashMap();
        Set<Object> term327673 =  ((Map) term34266).keySet();
        HashSet term34265 = new HashSet((Collection<? extends Object>) term327673);
        HashMap term34273 = new HashMap();
        Set<Object> term327674 =  ((Map) term34273).keySet();
        HashSet term34272 = new HashSet((Collection<? extends Object>) term327674);
        HashMap term34279 = new HashMap();
        HashMap term34284 = new HashMap();
        Class<? extends Object> term328009 = Class.forName((String) "com.google.javascript.rhino.JSDocInfo$Visibility");
        Field term328008 = ((Class) term328009).getDeclaredField((String) "INHERITED");
        ((Field) term328008).setAccessible(true);
        Object enum231 = ((Field) term328008).get((Object) null);
        Class<? extends Object> term328577 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocInfoParser$State");
        Field term328576 = ((Class) term328577).getDeclaredField((String) "NEXT_IS_ANNOTATION");
        ((Field) term328576).setAccessible(true);
        Object enum233 = ((Field) term328576).get((Object) null);
        HashMap term34376 = new HashMap();
        term34198 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser"));
        Object term34199 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocTokenStream"));
        char[] term34212 = (char[]) newCharArray(3);
        int[] term34217 = (int[]) newIntArray(5);
        Object term34248 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term34249 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 7);
        Object term34305 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term34319 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term34320 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        Object term34321 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        Object term34326 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term34327 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        Object term34331 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term34332 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term34337 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$Marker"));
        Object term34350 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser$ErrorReporterParser"));
        Object term34351 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term34387 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        setField(term34199, term34199.getClass(), "string", "dUNzDLXJcj");
        setCharElement(term34212, 0, 'V');
        setCharElement(term34212, 1, 'c');
        setCharElement(term34212, 2, 'I');
        setField(term34199, term34199.getClass(), "stringBuffer", term34212);
        setIntField(term34199, term34199.getClass(), "stringBufferTop", 1024134939);
        setIntElement(term34217, 0, 109078154);
        setIntElement(term34217, 1, -314165467);
        setIntElement(term34217, 2, 963694071);
        setIntElement(term34217, 3, -995785731);
        setIntElement(term34217, 4, 1349815364);
        setField(term34199, term34199.getClass(), "ungetBuffer", term34217);
        setIntField(term34199, term34199.getClass(), "ungetCursor", 2128383340);
        setBooleanField(term34199, term34199.getClass(), "hitEOF", false);
        setIntField(term34199, term34199.getClass(), "lineStart", 1238598518);
        setIntField(term34199, term34199.getClass(), "lineEndChar", -558146961);
        setIntField(term34199, term34199.getClass(), "lineno", 1505480070);
        setIntField(term34199, term34199.getClass(), "charno", -829088844);
        setIntField(term34199, term34199.getClass(), "initCharno", -31751777);
        setIntField(term34199, term34199.getClass(), "initLineno", -246967963);
        setField(term34199, term34199.getClass(), "sourceString", "OrVSjRJVwa");
        setIntField(term34199, term34199.getClass(), "sourceEnd", -1777140369);
        setIntField(term34199, term34199.getClass(), "sourceCursor", 993627098);
        setIntField(term34199, term34199.getClass(), "cursor", 872295704);
        setIntField(term34199, term34199.getClass(), "tokenBeg", 86041387);
        setIntField(term34199, term34199.getClass(), "tokenEnd", 1010721666);
        setField(term34198, term34198.getClass(), "stream", term34199);
        setField(term34248, term34248.getClass(), "reporter", null);
        setField(term34248, term34248.getClass(), "nativeTypes", term34249);
        setField(term34248, term34248.getClass(), "namesToTypes", term34250);
        setField(term34248, term34248.getClass(), "namespaces", term34258);
        setField(term34248, term34248.getClass(), "enumTypeNames", term34265);
        setField(term34248, term34248.getClass(), "forwardDeclaredTypes", term34272);
        setField(term34248, term34248.getClass(), "typesIndexedByProperty", term34279);
        setField(term34248, term34248.getClass(), "greatestSubtypeByProperty", term34284);
        setField(term34248, term34248.getClass(), "interfaceToImplementors", null);
        setField(term34248, term34248.getClass(), "unresolvedNamedTypes", null);
        setField(term34248, term34248.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term34248, term34248.getClass(), "lastGeneration", true);
        setField(term34248, term34248.getClass(), "templateTypeName", "aSYOhFwzSm");
        setField(term34305, term34305.getClass(), "name", "pVZlzrBeDB");
        setField(term34305, term34305.getClass(), "referencedType", null);
        setBooleanField(term34305, term34305.getClass(), "visited", true);
        setField(term34320, term34320.getClass(), "baseType", null);
        setField(term34320, term34320.getClass(), "implementedInterfaces", null);
        setField(term34320, term34320.getClass(), "parameters", null);
        setField(term34320, term34320.getClass(), "thrownTypes", null);
        setField(term34320, term34320.getClass(), "templateTypeName", null);
        setField(term34320, term34320.getClass(), "description", null);
        setField(term34320, term34320.getClass(), "deprecated", null);
        setField(term34320, term34320.getClass(), "license", null);
        setField(term34320, term34320.getClass(), "suppressions", null);
        setField(term34319, term34319.getClass(), "info", term34320);
        setField(term34321, term34321.getClass(), "markers", null);
        setField(term34321, term34321.getClass(), "parameters", null);
        setField(term34321, term34321.getClass(), "throwsDescriptions", null);
        setField(term34321, term34321.getClass(), "blockDescription", null);
        setField(term34321, term34321.getClass(), "fileOverview", null);
        setField(term34321, term34321.getClass(), "returnDescription", null);
        setField(term34321, term34321.getClass(), "version", null);
        setField(term34321, term34321.getClass(), "authors", null);
        setField(term34321, term34321.getClass(), "sees", null);
        setField(term34319, term34319.getClass(), "documentation", term34321);
        setField(term34319, term34319.getClass(), "sourceName", "");
        setField(term34319, term34319.getClass(), "visibility", enum231);
        setIntField(term34319, term34319.getClass(), "bitset", 27043781);
        setField(term34326, term34326.getClass(), "root", null);
        setField(term34326, term34326.getClass(), "sourceName", null);
        setField(term34326, term34326.getClass(), "registry", null);
        setField(term34319, term34319.getClass(), "type", term34326);
        setField(term34327, term34327.getClass(), "root", null);
        setField(term34327, term34327.getClass(), "sourceName", null);
        setField(term34327, term34327.getClass(), "registry", null);
        setField(term34319, term34319.getClass(), "thisType", term34327);
        setBooleanField(term34319, term34319.getClass(), "includeDocumentation", true);
        setField(term34305, term34305.getClass(), "docInfo", term34319);
        setBooleanField(term34305, term34305.getClass(), "unknown", false);
        setBooleanField(term34305, term34305.getClass(), "resolved", true);
        setField(term34305, term34305.getClass(), "resolveResult", null);
        setField(term34305, term34305.getClass(), "registry", null);
        setField(term34248, term34248.getClass(), "templateType", term34305);
        setField(term34198, term34198.getClass(), "typeRegistry", term34248);
        setField(term34332, term34332.getClass(), "info", null);
        setField(term34332, term34332.getClass(), "documentation", null);
        setField(term34332, term34332.getClass(), "sourceName", null);
        setField(term34332, term34332.getClass(), "visibility", null);
        setIntField(term34332, term34332.getClass(), "bitset", 0);
        setField(term34332, term34332.getClass(), "type", null);
        setField(term34332, term34332.getClass(), "thisType", null);
        setBooleanField(term34332, term34332.getClass(), "includeDocumentation", false);
        setField(term34331, term34331.getClass(), "currentInfo", term34332);
        setBooleanField(term34331, term34331.getClass(), "populated", false);
        setBooleanField(term34331, term34331.getClass(), "parseDocumentation", true);
        setField(term34337, term34337.getClass(), "annotation", null);
        setField(term34337, term34337.getClass(), "name", null);
        setField(term34337, term34337.getClass(), "description", null);
        setField(term34337, term34337.getClass(), "type", null);
        setField(term34331, term34331.getClass(), "currentMarker", term34337);
        setField(term34198, term34198.getClass(), "jsdocBuilder", term34331);
        setField(term34198, term34198.getClass(), "sourceName", "CQYmAsjvPU");
        setField(term34198, term34198.getClass(), "errorReporter", null);
        setField(term34350, term34350.getClass(), "this$0", null);
        setField(term34198, term34198.getClass(), "parser", term34350);
        setField(term34351, term34351.getClass(), "info", null);
        setField(term34351, term34351.getClass(), "documentation", null);
        setField(term34351, term34351.getClass(), "sourceName", null);
        setField(term34351, term34351.getClass(), "visibility", null);
        setIntField(term34351, term34351.getClass(), "bitset", 0);
        setField(term34351, term34351.getClass(), "type", null);
        setField(term34351, term34351.getClass(), "thisType", null);
        setBooleanField(term34351, term34351.getClass(), "includeDocumentation", false);
        setField(term34198, term34198.getClass(), "fileOverviewJSDocInfo", term34351);
        setField(term34198, term34198.getClass(), "state", enum233);
        setField(term34198, term34198.getClass(), "annotationNames", term34376);
        setField(term34387, term34387.getClass(), "this$0", null);
        setField(term34198, term34198.getClass(), "fileLevelJsDocBuilder", term34387);
        setField(term34198, term34198.getClass(), "unreadToken", null);
        Class<? extends Object> term328928 = Class.forName((String) "com.google.javascript.jscomp.parsing.JsDocToken");
        Field term328927 = ((Class) term328928).getDeclaredField((String) "BANG");
        ((Field) term328927).setAccessible(true);
        enum234 = ((Field) term328927).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.JsDocInfoParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.parsing.JsDocToken");
        Object[] args = new Object[1];
        args[0] = enum234;
        try {
            callMethod(klass, "parseArrayType", argTypes, term34198, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


