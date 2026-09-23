package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;

public class FunctionTypeBuilder_buildAndRegister_138847461636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13103;

    public FunctionTypeBuilder_buildAndRegister_138847461636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term13118 = new HashMap();
        HashMap term13127 = new HashMap();
        Set<Object> term33235 =  ((Map) term13127).keySet();
        HashSet term13126 = new HashSet((Collection<? extends Object>) term33235);
        HashMap term13134 = new HashMap();
        Set<Object> term33236 =  ((Map) term13134).keySet();
        HashSet term13133 = new HashSet((Collection<? extends Object>) term33236);
        HashMap term13141 = new HashMap();
        Set<Object> term33237 =  ((Map) term13141).keySet();
        HashSet term13140 = new HashSet((Collection<? extends Object>) term33237);
        HashMap term13147 = new HashMap();
        HashMap term13152 = new HashMap();
        Class<? extends Object> term33259 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeRegistry$ResolveMode");
        Field term33258 = ((Class) term33259).getDeclaredField((String) "LAZY_EXPRESSIONS");
        ((Field) term33258).setAccessible(true);
        Object enum64 = ((Field) term33258).get((Object) null);
        term13103 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term13116 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term13117 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 4);
        Object term13173 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term13187 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term13213 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13228 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term13103, term13103.getClass(), "fnName", "ZwjARhAtHC");
        setField(term13103, term13103.getClass(), "compiler", null);
        setField(term13103, term13103.getClass(), "codingConvention", null);
        setField(term13116, term13116.getClass(), "reporter", null);
        setField(term13116, term13116.getClass(), "nativeTypes", term13117);
        setField(term13116, term13116.getClass(), "namesToTypes", term13118);
        setField(term13116, term13116.getClass(), "namespaces", term13126);
        setField(term13116, term13116.getClass(), "enumTypeNames", term13133);
        setField(term13116, term13116.getClass(), "forwardDeclaredTypes", term13140);
        setField(term13116, term13116.getClass(), "typesIndexedByProperty", term13147);
        setField(term13116, term13116.getClass(), "greatestSubtypeByProperty", term13152);
        setField(term13116, term13116.getClass(), "interfaceToImplementors", null);
        setField(term13116, term13116.getClass(), "unresolvedNamedTypes", null);
        setField(term13116, term13116.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term13116, term13116.getClass(), "lastGeneration", false);
        setField(term13116, term13116.getClass(), "templateTypeName", "awDQVEVIKi");
        setField(term13173, term13173.getClass(), "name", "HJwNgUzZZR");
        setField(term13173, term13173.getClass(), "referencedType", null);
        setBooleanField(term13173, term13173.getClass(), "visited", true);
        setField(term13187, term13187.getClass(), "info", null);
        setField(term13187, term13187.getClass(), "documentation", null);
        setField(term13187, term13187.getClass(), "sourceName", null);
        setField(term13187, term13187.getClass(), "visibility", null);
        setIntField(term13187, term13187.getClass(), "bitset", 0);
        setField(term13187, term13187.getClass(), "type", null);
        setField(term13187, term13187.getClass(), "thisType", null);
        setBooleanField(term13187, term13187.getClass(), "includeDocumentation", false);
        setField(term13173, term13173.getClass(), "docInfo", term13187);
        setBooleanField(term13173, term13173.getClass(), "unknown", false);
        setBooleanField(term13173, term13173.getClass(), "resolved", false);
        setField(term13173, term13173.getClass(), "resolveResult", null);
        setField(term13173, term13173.getClass(), "registry", null);
        setField(term13116, term13116.getClass(), "templateType", term13173);
        setBooleanField(term13116, term13116.getClass(), "tolerateUndefinedValues", true);
        setField(term13116, term13116.getClass(), "resolveMode", enum64);
        setField(term13103, term13103.getClass(), "typeRegistry", term13116);
        setIntField(term13213, term13213.getClass(), "type", 0);
        setField(term13213, term13213.getClass(), "next", null);
        setField(term13213, term13213.getClass(), "first", null);
        setField(term13213, term13213.getClass(), "last", null);
        setField(term13213, term13213.getClass(), "propListHead", null);
        setIntField(term13213, term13213.getClass(), "sourcePosition", 0);
        setField(term13213, term13213.getClass(), "jsType", null);
        setField(term13213, term13213.getClass(), "parent", null);
        setField(term13103, term13103.getClass(), "errorRoot", term13213);
        setField(term13103, term13103.getClass(), "sourceName", "FvUCZgTXhq");
        setField(term13228, term13228.getClass(), "vars", null);
        setField(term13228, term13228.getClass(), "parent", null);
        setField(term13228, term13228.getClass(), "rootNode", null);
        setField(term13228, term13228.getClass(), "thisType", null);
        setBooleanField(term13228, term13228.getClass(), "isBottom", false);
        setField(term13103, term13103.getClass(), "scope", term13228);
        setField(term13103, term13103.getClass(), "returnType", null);
        setField(term13103, term13103.getClass(), "implementedInterfaces", null);
        setField(term13103, term13103.getClass(), "baseType", null);
        setField(term13103, term13103.getClass(), "thisType", null);
        setBooleanField(term13103, term13103.getClass(), "isConstructor", false);
        setBooleanField(term13103, term13103.getClass(), "isInterface", false);
        setField(term13103, term13103.getClass(), "parametersNode", null);
        setField(term13103, term13103.getClass(), "sourceNode", null);
        setField(term13103, term13103.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "buildAndRegister", argTypes, term13103, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


