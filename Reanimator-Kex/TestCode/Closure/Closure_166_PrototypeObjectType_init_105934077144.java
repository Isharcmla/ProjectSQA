package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.Boolean;

public class PrototypeObjectType_init_105934077144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109;
     Object term201;

    public PrototypeObjectType_init_105934077144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term111 = new HashMap();
        HashMap term121 = new HashMap();
        Set<Object> term4468 =  ((Map) term121).keySet();
        HashSet term120 = new HashSet((Collection<? extends Object>) term4468);
        HashMap term127 = new HashMap();
        Set<Object> term4469 =  ((Map) term127).keySet();
        HashSet term126 = new HashSet((Collection<? extends Object>) term4469);
        HashMap term138 = new HashMap();
        Set<Object> term4470 =  ((Map) term138).keySet();
        HashSet term137 = new HashSet((Collection<? extends Object>) term4470);
        HashMap term158 = new HashMap();
        HashMap term173 = new HashMap();
        HashMap term178 = new HashMap();
        term109 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term110 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 1);
        setField(term109, term109.getClass(), "reporter", null);
        setField(term109, term109.getClass(), "nativeTypes", term110);
        setField(term109, term109.getClass(), "namesToTypes", term111);
        setField(term109, term109.getClass(), "namespaces", term120);
        setField(term109, term109.getClass(), "nonNullableTypeNames", term126);
        setField(term109, term109.getClass(), "forwardDeclaredTypes", term137);
        setField(term109, term109.getClass(), "typesIndexedByProperty", term158);
        setField(term109, term109.getClass(), "eachRefTypeIndexedByProperty", term173);
        setField(term109, term109.getClass(), "greatestSubtypeByProperty", term178);
        setField(term109, term109.getClass(), "interfaceToImplementors", null);
        setField(term109, term109.getClass(), "unresolvedNamedTypes", null);
        setField(term109, term109.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term109, term109.getClass(), "lastGeneration", false);
        setField(term109, term109.getClass(), "templateTypes", null);
        setBooleanField(term109, term109.getClass(), "tolerateUndefinedValues", false);
        setField(term109, term109.getClass(), "resolveMode", null);
        term201 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = term109;
        args[1] = "jiKYgYHqIS";
        args[2] = null;
        args[3] = term201;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


