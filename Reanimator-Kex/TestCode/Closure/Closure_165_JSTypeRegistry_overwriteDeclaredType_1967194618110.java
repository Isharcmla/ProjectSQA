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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class JSTypeRegistry_overwriteDeclaredType_1967194618110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4605;

    public JSTypeRegistry_overwriteDeclaredType_1967194618110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4607 = new HashMap();
        HashMap term4617 = new HashMap();
        Set<Object> term485851 =  ((Map) term4617).keySet();
        HashSet term4616 = new HashSet((Collection<? extends Object>) term485851);
        HashMap term4638 = new HashMap();
        Set<Object> term485852 =  ((Map) term4638).keySet();
        HashSet term4637 = new HashSet((Collection<? extends Object>) term485852);
        HashMap term4649 = new HashMap();
        Set<Object> term485853 =  ((Map) term4649).keySet();
        HashSet term4648 = new HashSet((Collection<? extends Object>) term485853);
        HashMap term4665 = new HashMap();
        HashMap term4680 = new HashMap();
        HashMap term4685 = new HashMap();
        term4605 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term4606 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 7);
        setField(term4605, term4605.getClass(), "reporter", null);
        setField(term4605, term4605.getClass(), "nativeTypes", term4606);
        setField(term4605, term4605.getClass(), "namesToTypes", term4607);
        setField(term4605, term4605.getClass(), "namespaces", term4616);
        setField(term4605, term4605.getClass(), "nonNullableTypeNames", term4637);
        setField(term4605, term4605.getClass(), "forwardDeclaredTypes", term4648);
        setField(term4605, term4605.getClass(), "typesIndexedByProperty", term4665);
        setField(term4605, term4605.getClass(), "eachRefTypeIndexedByProperty", term4680);
        setField(term4605, term4605.getClass(), "greatestSubtypeByProperty", term4685);
        setField(term4605, term4605.getClass(), "interfaceToImplementors", null);
        setField(term4605, term4605.getClass(), "unresolvedNamedTypes", null);
        setField(term4605, term4605.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term4605, term4605.getClass(), "lastGeneration", false);
        setField(term4605, term4605.getClass(), "templateTypeName", null);
        setField(term4605, term4605.getClass(), "templateType", null);
        setBooleanField(term4605, term4605.getClass(), "tolerateUndefinedValues", false);
        setField(term4605, term4605.getClass(), "resolveMode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = "ARnOWpgtAg";
        args[1] = null;
        try {
            callMethod(klass, "overwriteDeclaredType", argTypes, term4605, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


