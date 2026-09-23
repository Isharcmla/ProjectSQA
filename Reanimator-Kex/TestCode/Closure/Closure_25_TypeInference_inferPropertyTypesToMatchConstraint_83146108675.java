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
     Object term19986;

    public TypeInference_inferPropertyTypesToMatchConstraint_83146108675() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4090 = new HashMap();
        HashMap term4099 = new HashMap();
        Set<Object> term19999 =  ((Map) term4099).keySet();
        HashSet term4098 = new HashSet((Collection<? extends Object>) term19999);
        HashMap term4106 = new HashMap();
        Set<Object> term20000 =  ((Map) term4106).keySet();
        HashSet term4105 = new HashSet((Collection<? extends Object>) term20000);
        HashMap term4112 = new HashMap();
        Set<Object> term20001 =  ((Map) term4112).keySet();
        HashSet term4111 = new HashSet((Collection<? extends Object>) term20001);
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
        HashMap term19989 = new HashMap();
        HashMap term19991 = new HashMap();
        Set<Object> term20002 =  ((Map) term19991).keySet();
        HashSet term19990 = new HashSet((Collection<? extends Object>) term20002);
        HashMap term19993 = new HashMap();
        Set<Object> term20003 =  ((Map) term19993).keySet();
        HashSet term19992 = new HashSet((Collection<? extends Object>) term20003);
        HashMap term19995 = new HashMap();
        Set<Object> term20004 =  ((Map) term19995).keySet();
        HashSet term19994 = new HashSet((Collection<? extends Object>) term20004);
        HashMap term19996 = new HashMap();
        HashMap term19997 = new HashMap();
        HashMap term19998 = new HashMap();
        term19986 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        Object term19987 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term19988 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 2);
        setField(term19986, term19986.getClass(), "compiler", null);
        setField(term19987, term19987.getClass(), "reporter", null);
        setField(term19987, term19987.getClass(), "nativeTypes", term19988);
        setField(term19987, term19987.getClass(), "namesToTypes", term19989);
        setField(term19987, term19987.getClass(), "namespaces", term19990);
        setField(term19987, term19987.getClass(), "nonNullableTypeNames", term19992);
        setField(term19987, term19987.getClass(), "forwardDeclaredTypes", term19994);
        setField(term19987, term19987.getClass(), "typesIndexedByProperty", term19996);
        setField(term19987, term19987.getClass(), "eachRefTypeIndexedByProperty", term19997);
        setField(term19987, term19987.getClass(), "greatestSubtypeByProperty", term19998);
        setField(term19987, term19987.getClass(), "interfaceToImplementors", null);
        setField(term19987, term19987.getClass(), "unresolvedNamedTypes", null);
        setField(term19987, term19987.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term19987, term19987.getClass(), "lastGeneration", false);
        setField(term19987, term19987.getClass(), "templateTypeName", null);
        setField(term19987, term19987.getClass(), "templateType", null);
        setBooleanField(term19987, term19987.getClass(), "tolerateUndefinedValues", false);
        setField(term19987, term19987.getClass(), "resolveMode", null);
        setField(term19986, term19986.getClass(), "registry", term19987);
        setField(term19986, term19986.getClass(), "reverseInterpreter", null);
        setField(term19986, term19986.getClass(), "syntacticScope", null);
        setField(term19986, term19986.getClass(), "functionScope", null);
        setField(term19986, term19986.getClass(), "bottomScope", null);
        setField(term19986, term19986.getClass(), "assertionFunctionsMap", null);
        setField(term19986, term19986.getClass(), "cfg", null);
        setField(term19986, term19986.getClass(), "joinOp", null);
        setField(term19986, term19986.getClass(), "orderedWorkSet", null);
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
        assertTrue(recursiveEquals(term4087, term19986));
    }

};


