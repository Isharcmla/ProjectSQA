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

public class JSTypeRegistry_findCommonSuperObject_2000679954102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3610;

    public JSTypeRegistry_findCommonSuperObject_2000679954102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3612 = new HashMap();
        HashMap term3622 = new HashMap();
        Set<Object> term482854 =  ((Map) term3622).keySet();
        HashSet term3621 = new HashSet((Collection<? extends Object>) term482854);
        HashMap term3639 = new HashMap();
        Set<Object> term482855 =  ((Map) term3639).keySet();
        HashSet term3638 = new HashSet((Collection<? extends Object>) term482855);
        HashMap term3656 = new HashMap();
        Set<Object> term482856 =  ((Map) term3656).keySet();
        HashSet term3655 = new HashSet((Collection<? extends Object>) term482856);
        HashMap term3672 = new HashMap();
        HashMap term3687 = new HashMap();
        HashMap term3692 = new HashMap();
        term3610 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        Object[] term3611 = (Object[]) newArray("com.google.javascript.rhino.jstype.JSType", 9);
        setField(term3610, term3610.getClass(), "reporter", null);
        setField(term3610, term3610.getClass(), "nativeTypes", term3611);
        setField(term3610, term3610.getClass(), "namesToTypes", term3612);
        setField(term3610, term3610.getClass(), "namespaces", term3621);
        setField(term3610, term3610.getClass(), "nonNullableTypeNames", term3638);
        setField(term3610, term3610.getClass(), "forwardDeclaredTypes", term3655);
        setField(term3610, term3610.getClass(), "typesIndexedByProperty", term3672);
        setField(term3610, term3610.getClass(), "eachRefTypeIndexedByProperty", term3687);
        setField(term3610, term3610.getClass(), "greatestSubtypeByProperty", term3692);
        setField(term3610, term3610.getClass(), "interfaceToImplementors", null);
        setField(term3610, term3610.getClass(), "unresolvedNamedTypes", null);
        setField(term3610, term3610.getClass(), "resolvedNamedTypes", null);
        setBooleanField(term3610, term3610.getClass(), "lastGeneration", false);
        setField(term3610, term3610.getClass(), "templateTypeName", null);
        setField(term3610, term3610.getClass(), "templateType", null);
        setBooleanField(term3610, term3610.getClass(), "tolerateUndefinedValues", false);
        setField(term3610, term3610.getClass(), "resolveMode", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "findCommonSuperObject", argTypes, term3610, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


