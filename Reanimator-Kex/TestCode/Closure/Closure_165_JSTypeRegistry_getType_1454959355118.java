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
import java.lang.Integer;

public class JSTypeRegistry_getType_1454959355118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6415;
     Object term6530;
     Object term6532;

    public JSTypeRegistry_getType_1454959355118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6417 = new HashMap();
        HashMap term6427 = new HashMap();
        Set<Object> term487167 =  ((Map) term6427).keySet();
        HashSet term6426 = new HashSet((Collection<? extends Object>) term487167);
        HashMap term6448 = new HashMap();
        Set<Object> term487168 =  ((Map) term6448).keySet();
        HashSet term6447 = new HashSet((Collection<? extends Object>) term487168);
        HashMap term6459 = new HashMap();
        Set<Object> term487169 =  ((Map) term6459).keySet();
        HashSet term6458 = new HashSet((Collection<? extends Object>) term487169);
        HashMap term6475 = new HashMap();
        HashMap term6490 = new HashMap();
        HashMap term6495 = new HashMap();
        term6415 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term6416 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 7);
        setField(term6415, term6415.getClass(), "reporter", null);
        setField(term6415, term6415.getClass(), "nativeTypes", term6416);
        setField(term6415, term6415.getClass(), "namesToTypes", term6417);
        setField(term6415, term6415.getClass(), "namespaces", term6426);
        setField(term6415, term6415.getClass(), "nonNullableTypeNames", term6447);
        setField(term6415, term6415.getClass(), "forwardDeclaredTypes", term6458);
        setField(term6415, term6415.getClass(), "typesIndexedByProperty", term6475);
        setField(term6415, term6415.getClass(), "eachRefTypeIndexedByProperty", term6490);
        setField(term6415, term6415.getClass(), "greatestSubtypeByProperty", term6495);
        setField(term6415, term6415.getClass(), "interfaceToImplementors", null);
        setField(term6415, term6415.getClass(), "unresolvedNamedTypes", null);
        setField(term6415, term6415.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term6415, term6415.getClass(), "lastGeneration", false);
        setField(term6415, term6415.getClass(), "templateTypeName", null);
        setField(term6415, term6415.getClass(), "templateType", null);
        setBooleanField(term6415, term6415.getClass(), "tolerateUndefinedValues", false);
        setField(term6415, term6415.getClass(), "resolveMode", null);
        term6530 = new Integer(-2104981311);
        term6532 = new Integer(-571169753);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = "rmSqCaXWHi";
        args[2] = "ScztqspySK";
        args[3] = term6530;
        args[4] = term6532;
        try {
            callMethod(klass, "getType", argTypes, term6415, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


