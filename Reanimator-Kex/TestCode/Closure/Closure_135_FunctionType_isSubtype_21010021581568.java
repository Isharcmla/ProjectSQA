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
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class FunctionType_isSubtype_21010021581568 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2085292;
     Object term2085548;
     Object term2087799;
     Object term2087803;

    public FunctionType_isSubtype_21010021581568() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2087809 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2087808 = ((Class) term2087809).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2087808).setAccessible(true);
        Object enum3885 = ((Field) term2087808).get((Object) null);
        term2085292 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term2085292, term2085292.getClass(), "kind", enum3885);
        Class<? extends Object> term2088109 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2088108 = ((Class) term2088109).getDeclaredField((String) "INTERFACE");
        ((Field) term2088108).setAccessible(true);
        Object enum3886 = ((Field) term2088108).get((Object) null);
        term2085548 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term2085548, term2085548.getClass(), "kind", enum3886);
        Class<? extends Object> term2088403 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2088402 = ((Class) term2088403).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2088402).setAccessible(true);
        Object enum3887 = ((Field) term2088402).get((Object) null);
        term2087799 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term2087799, term2087799.getClass(), "this$0", null);
        setField(term2087799, term2087799.getClass(), "call", null);
        setField(term2087799, term2087799.getClass(), "prototype", null);
        setField(term2087799, term2087799.getClass(), "kind", enum3887);
        setField(term2087799, term2087799.getClass(), "typeOfThis", null);
        setField(term2087799, term2087799.getClass(), "source", null);
        setField(term2087799, term2087799.getClass(), "implementedInterfaces", null);
        setField(term2087799, term2087799.getClass(), "subTypes", null);
        setField(term2087799, term2087799.getClass(), "templateTypeName", null);
        setField(term2087799, term2087799.getClass(), "className", null);
        setField(term2087799, term2087799.getClass(), "properties", null);
        setField(term2087799, term2087799.getClass(), "implicitPrototype", null);
        setBooleanField(term2087799, term2087799.getClass(), "nativeType", false);
        setBooleanField(term2087799, term2087799.getClass(), "visited", false);
        setField(term2087799, term2087799.getClass(), "docInfo", null);
        setBooleanField(term2087799, term2087799.getClass(), "unknown", false);
        setBooleanField(term2087799, term2087799.getClass(), "resolved", false);
        setField(term2087799, term2087799.getClass(), "resolveResult", null);
        setField(term2087799, term2087799.getClass(), "registry", null);
        Class<? extends Object> term2088703 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2088702 = ((Class) term2088703).getDeclaredField((String) "INTERFACE");
        ((Field) term2088702).setAccessible(true);
        Object enum3888 = ((Field) term2088702).get((Object) null);
        term2087803 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term2087803, term2087803.getClass(), "this$0", null);
        setField(term2087803, term2087803.getClass(), "call", null);
        setField(term2087803, term2087803.getClass(), "prototype", null);
        setField(term2087803, term2087803.getClass(), "kind", enum3888);
        setField(term2087803, term2087803.getClass(), "typeOfThis", null);
        setField(term2087803, term2087803.getClass(), "source", null);
        setField(term2087803, term2087803.getClass(), "implementedInterfaces", null);
        setField(term2087803, term2087803.getClass(), "subTypes", null);
        setField(term2087803, term2087803.getClass(), "templateTypeName", null);
        setField(term2087803, term2087803.getClass(), "className", null);
        setField(term2087803, term2087803.getClass(), "properties", null);
        setField(term2087803, term2087803.getClass(), "implicitPrototype", null);
        setBooleanField(term2087803, term2087803.getClass(), "nativeType", false);
        setBooleanField(term2087803, term2087803.getClass(), "visited", false);
        setField(term2087803, term2087803.getClass(), "docInfo", null);
        setBooleanField(term2087803, term2087803.getClass(), "unknown", false);
        setBooleanField(term2087803, term2087803.getClass(), "resolved", false);
        setField(term2087803, term2087803.getClass(), "resolveResult", null);
        setField(term2087803, term2087803.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2085548;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term2085292, args);
        assertTrue(recursiveEquals(term2085292, term2087799));
        assertTrue(recursiveEquals(term2085548, term2087803));
        assertTrue(recursiveEquals(retValue, true));
    }

};


