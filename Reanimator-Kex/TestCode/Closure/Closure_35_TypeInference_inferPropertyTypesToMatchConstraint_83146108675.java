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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class TypeInference_inferPropertyTypesToMatchConstraint_83146108675 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4087;
     Object term20202;

    public TypeInference_inferPropertyTypesToMatchConstraint_83146108675() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4090 = new HashMap();
        HashMap term4099 = new HashMap();
        Set<Object> term20215 =  ((Map) term4099).keySet();
        HashSet term4098 = new HashSet((Collection<? extends Object>) term20215);
        HashMap term4106 = new HashMap();
        Set<Object> term20216 =  ((Map) term4106).keySet();
        HashSet term4105 = new HashSet((Collection<? extends Object>) term20216);
        HashMap term4112 = new HashMap();
        Set<Object> term20217 =  ((Map) term4112).keySet();
        HashSet term4111 = new HashSet((Collection<? extends Object>) term20217);
        HashMap term4118 = new HashMap();
        HashMap term4126 = new HashMap();
        HashMap term4131 = new HashMap();
        term4087 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term4088 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term4089 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 2);
        setField(term4087, term4087.getClass(), "compiler", null);
        setField(term4088, term4088.getClass(), "reporter", null);
        setField(term4088, term4088.getClass(), "nativeTypes", term4089);
        setField(term4088, term4088.getClass(), "namesToTypes", term4090);
        setField(term4088, term4088.getClass(), "namespaces", term4098);
        setField(term4088, term4088.getClass(), "nonNullableTypeNames", term4105);
        setField(term4088, term4088.getClass(), "forwardDeclaredTypes", term4111);
        setField(term4088, term4088.getClass(), "typesIndexedByProperty", term4118);
        setField(term4088, term4088.getClass(), "eachRefTypeIndexedByProperty", term4126);
        setField(term4088, term4088.getClass(), "greatestSubtypeByProperty", term4131);
        setField(term4088, term4088.getClass(), "interfaceToImplementors", null);
        setField(term4088, term4088.getClass(), "unresolvedNamedTypes", null);
        setField(term4088, term4088.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term4088, term4088.getClass(), "lastGeneration", false);
        setField(term4088, term4088.getClass(), "templateTypeName", null);
        setField(term4088, term4088.getClass(), "templateType", null);
        setBooleanField(term4088, term4088.getClass(), "tolerateUndefinedValues", false);
        setField(term4088, term4088.getClass(), "resolveMode", null);
        setField(term4087, term4087.getClass(), "registry", term4088);
        setField(term4087, term4087.getClass(), "reverseInterpreter", null);
        setField(term4087, term4087.getClass(), "syntacticScope", null);
        setField(term4087, term4087.getClass(), "functionScope", null);
        setField(term4087, term4087.getClass(), "bottomScope", null);
        setField(term4087, term4087.getClass(), "assertionFunctionsMap", null);
        setField(term4087, term4087.getClass(), "cfg", null);
        setField(term4087, term4087.getClass(), "joinOp", null);
        setField(term4087, term4087.getClass(), "orderedWorkSet", null);
        HashMap term20205 = new HashMap();
        HashMap term20207 = new HashMap();
        Set<Object> term20218 =  ((Map) term20207).keySet();
        HashSet term20206 = new HashSet((Collection<? extends Object>) term20218);
        HashMap term20209 = new HashMap();
        Set<Object> term20219 =  ((Map) term20209).keySet();
        HashSet term20208 = new HashSet((Collection<? extends Object>) term20219);
        HashMap term20211 = new HashMap();
        Set<Object> term20220 =  ((Map) term20211).keySet();
        HashSet term20210 = new HashSet((Collection<? extends Object>) term20220);
        HashMap term20212 = new HashMap();
        HashMap term20213 = new HashMap();
        HashMap term20214 = new HashMap();
        term20202 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term20203 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term20204 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 2);
        setField(term20202, term20202.getClass(), "compiler", null);
        setField(term20203, term20203.getClass(), "reporter", null);
        setField(term20203, term20203.getClass(), "nativeTypes", term20204);
        setField(term20203, term20203.getClass(), "namesToTypes", term20205);
        setField(term20203, term20203.getClass(), "namespaces", term20206);
        setField(term20203, term20203.getClass(), "nonNullableTypeNames", term20208);
        setField(term20203, term20203.getClass(), "forwardDeclaredTypes", term20210);
        setField(term20203, term20203.getClass(), "typesIndexedByProperty", term20212);
        setField(term20203, term20203.getClass(), "eachRefTypeIndexedByProperty", term20213);
        setField(term20203, term20203.getClass(), "greatestSubtypeByProperty", term20214);
        setField(term20203, term20203.getClass(), "interfaceToImplementors", null);
        setField(term20203, term20203.getClass(), "unresolvedNamedTypes", null);
        setField(term20203, term20203.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term20203, term20203.getClass(), "lastGeneration", false);
        setField(term20203, term20203.getClass(), "templateTypeName", null);
        setField(term20203, term20203.getClass(), "templateType", null);
        setBooleanField(term20203, term20203.getClass(), "tolerateUndefinedValues", false);
        setField(term20203, term20203.getClass(), "resolveMode", null);
        setField(term20202, term20202.getClass(), "registry", term20203);
        setField(term20202, term20202.getClass(), "reverseInterpreter", null);
        setField(term20202, term20202.getClass(), "syntacticScope", null);
        setField(term20202, term20202.getClass(), "functionScope", null);
        setField(term20202, term20202.getClass(), "bottomScope", null);
        setField(term20202, term20202.getClass(), "assertionFunctionsMap", null);
        setField(term20202, term20202.getClass(), "cfg", null);
        setField(term20202, term20202.getClass(), "joinOp", null);
        setField(term20202, term20202.getClass(), "orderedWorkSet", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "inferPropertyTypesToMatchConstraint", argTypes, term4087, args);
        assertTrue(recursiveEquals(term4087, term20202));
    }

};


