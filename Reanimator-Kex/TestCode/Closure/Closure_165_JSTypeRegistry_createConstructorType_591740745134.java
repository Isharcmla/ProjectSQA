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

public class JSTypeRegistry_createConstructorType_591740745134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9576;
     Object term9660;

    public JSTypeRegistry_createConstructorType_591740745134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term9578 = new HashMap();
        HashMap term9588 = new HashMap();
        Set<Object> term495968 =  ((Map) term9588).keySet();
        HashSet term9587 = new HashSet((Collection<? extends Object>) term495968);
        HashMap term9607 = new HashMap();
        Set<Object> term495969 =  ((Map) term9607).keySet();
        HashSet term9606 = new HashSet((Collection<? extends Object>) term495969);
        HashMap term9613 = new HashMap();
        Set<Object> term495970 =  ((Map) term9613).keySet();
        HashSet term9612 = new HashSet((Collection<? extends Object>) term495970);
        HashMap term9629 = new HashMap();
        HashMap term9644 = new HashMap();
        HashMap term9649 = new HashMap();
        term9576 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term9577 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 2);
        setField(term9576, term9576.getClass(), "reporter", null);
        setField(term9576, term9576.getClass(), "nativeTypes", term9577);
        setField(term9576, term9576.getClass(), "namesToTypes", term9578);
        setField(term9576, term9576.getClass(), "namespaces", term9587);
        setField(term9576, term9576.getClass(), "nonNullableTypeNames", term9606);
        setField(term9576, term9576.getClass(), "forwardDeclaredTypes", term9612);
        setField(term9576, term9576.getClass(), "typesIndexedByProperty", term9629);
        setField(term9576, term9576.getClass(), "eachRefTypeIndexedByProperty", term9644);
        setField(term9576, term9576.getClass(), "greatestSubtypeByProperty", term9649);
        setField(term9576, term9576.getClass(), "interfaceToImplementors", null);
        setField(term9576, term9576.getClass(), "unresolvedNamedTypes", null);
        setField(term9576, term9576.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term9576, term9576.getClass(), "lastGeneration", false);
        setField(term9576, term9576.getClass(), "templateTypeName", null);
        setField(term9576, term9576.getClass(), "templateType", null);
        setBooleanField(term9576, term9576.getClass(), "tolerateUndefinedValues", false);
        setField(term9576, term9576.getClass(), "resolveMode", null);
        term9660 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Array.newInstance(Class.forName("com.google.javascript.rhino.jstype.JSType"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term9660;
        try {
            callMethod(klass, "createConstructorType", argTypes, term9576, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


