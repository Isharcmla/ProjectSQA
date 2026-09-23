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

public class FunctionTypeBuilder_buildAndRegister_138847461641 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14133;

    public FunctionTypeBuilder_buildAndRegister_138847461641() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term14148 = new HashMap();
        HashMap term14157 = new HashMap();
        Set<Object> term31153 =  ((Map) term14157).keySet();
        HashSet term14156 = new HashSet((Collection<? extends Object>) term31153);
        HashMap term14164 = new HashMap();
        Set<Object> term31154 =  ((Map) term14164).keySet();
        HashSet term14163 = new HashSet((Collection<? extends Object>) term31154);
        HashMap term14171 = new HashMap();
        Set<Object> term31155 =  ((Map) term14171).keySet();
        HashSet term14170 = new HashSet((Collection<? extends Object>) term31155);
        HashMap term14177 = new HashMap();
        HashMap term14182 = new HashMap();
        Class<? extends Object> term31177 = Class.forName((String) "com.google.javascript.rhino.jstype.JSTypeRegistry$ResolveMode");
        Field term31176 = ((Class) term31177).getDeclaredField((String) "IMMEDIATE");
        ((Field) term31176).setAccessible(true);
        Object enum58 = ((Field) term31176).get((Object) null);
        term14133 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder"));
        Object term14146 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term14147 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 9);
        Object term14203 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        Object term14233 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14248 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term14133, term14133.getClass(), "fnName", "iVOvTzOxwt");
        setField(term14133, term14133.getClass(), "compiler", null);
        setField(term14133, term14133.getClass(), "codingConvention", null);
        setField(term14146, term14146.getClass(), "reporter", null);
        setField(term14146, term14146.getClass(), "nativeTypes", term14147);
        setField(term14146, term14146.getClass(), "namesToTypes", term14148);
        setField(term14146, term14146.getClass(), "namespaces", term14156);
        setField(term14146, term14146.getClass(), "nonNullableTypeNames", term14163);
        setField(term14146, term14146.getClass(), "forwardDeclaredTypes", term14170);
        setField(term14146, term14146.getClass(), "typesIndexedByProperty", term14177);
        setField(term14146, term14146.getClass(), "greatestSubtypeByProperty", term14182);
        setField(term14146, term14146.getClass(), "interfaceToImplementors", null);
        setField(term14146, term14146.getClass(), "unresolvedNamedTypes", null);
        setField(term14146, term14146.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term14146, term14146.getClass(), "lastGeneration", false);
        setField(term14146, term14146.getClass(), "templateTypeName", "IiNCZfdouL");
        setField(term14203, term14203.getClass(), "name", "AhOHzCsHKW");
        setField(term14203, term14203.getClass(), "referencedType", null);
        setField(term14203, term14203.getClass(), "referencedObjType", null);
        setBooleanField(term14203, term14203.getClass(), "visited", false);
        setField(term14203, term14203.getClass(), "docInfo", null);
        setBooleanField(term14203, term14203.getClass(), "unknown", false);
        setBooleanField(term14203, term14203.getClass(), "resolved", false);
        setField(term14203, term14203.getClass(), "resolveResult", null);
        setField(term14203, term14203.getClass(), "registry", null);
        setField(term14146, term14146.getClass(), "templateType", term14203);
        setBooleanField(term14146, term14146.getClass(), "tolerateUndefinedValues", true);
        setField(term14146, term14146.getClass(), "resolveMode", enum58);
        setField(term14133, term14133.getClass(), "typeRegistry", term14146);
        setIntField(term14233, term14233.getClass(), "type", 0);
        setField(term14233, term14233.getClass(), "next", null);
        setField(term14233, term14233.getClass(), "first", null);
        setField(term14233, term14233.getClass(), "last", null);
        setField(term14233, term14233.getClass(), "propListHead", null);
        setIntField(term14233, term14233.getClass(), "sourcePosition", 0);
        setField(term14233, term14233.getClass(), "jsType", null);
        setField(term14233, term14233.getClass(), "parent", null);
        setField(term14133, term14133.getClass(), "errorRoot", term14233);
        setField(term14133, term14133.getClass(), "sourceName", "UqgLPaaAHi");
        setField(term14248, term14248.getClass(), "vars", null);
        setField(term14248, term14248.getClass(), "parent", null);
        setField(term14248, term14248.getClass(), "rootNode", null);
        setField(term14248, term14248.getClass(), "thisType", null);
        setBooleanField(term14248, term14248.getClass(), "isBottom", false);
        setField(term14133, term14133.getClass(), "scope", term14248);
        setField(term14133, term14133.getClass(), "returnType", null);
        setBooleanField(term14133, term14133.getClass(), "returnTypeInferred", false);
        setField(term14133, term14133.getClass(), "implementedInterfaces", null);
        setField(term14133, term14133.getClass(), "baseType", null);
        setField(term14133, term14133.getClass(), "thisType", null);
        setBooleanField(term14133, term14133.getClass(), "isConstructor", false);
        setBooleanField(term14133, term14133.getClass(), "isInterface", false);
        setField(term14133, term14133.getClass(), "parametersNode", null);
        setField(term14133, term14133.getClass(), "sourceNode", null);
        setField(term14133, term14133.getClass(), "templateTypeName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "buildAndRegister", argTypes, term14133, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


