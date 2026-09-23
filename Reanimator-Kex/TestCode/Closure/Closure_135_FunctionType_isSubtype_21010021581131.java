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

public class FunctionType_isSubtype_21010021581131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1338073;
     Object term1338733;
     Object term1339795;
     Object term1339803;

    public FunctionType_isSubtype_21010021581131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1339813 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1339812 = ((Class) term1339813).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1339812).setAccessible(true);
        Object enum2503 = ((Field) term1339812).get((Object) null);
        Class<? extends Object> term1340113 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1340112 = ((Class) term1340113).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1340112).setAccessible(true);
        Object enum2504 = ((Field) term1340112).get((Object) null);
        term1338073 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1338625 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1338073, term1338073.getClass(), "kind", enum2503);
        setField(term1338625, term1338625.getClass(), "kind", enum2504);
        setField(term1338073, term1338073.getClass(), "typeOfThis", term1338625);
        term1338733 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1339063 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1338733, term1338733.getClass(), "kind", enum2503);
        setField(term1339063, term1339063.getClass(), "kind", enum2504);
        setField(term1338733, term1338733.getClass(), "typeOfThis", term1339063);
        Class<? extends Object> term1340413 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1340412 = ((Class) term1340413).getDeclaredField((String) "INTERFACE");
        ((Field) term1340412).setAccessible(true);
        Object enum2505 = ((Field) term1340412).get((Object) null);
        Class<? extends Object> term1340707 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1340706 = ((Class) term1340707).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1340706).setAccessible(true);
        Object enum2506 = ((Field) term1340706).get((Object) null);
        term1339795 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1339799 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1339795, term1339795.getClass(), "call", null);
        setField(term1339795, term1339795.getClass(), "prototype", null);
        setField(term1339795, term1339795.getClass(), "kind", enum2505);
        setField(term1339799, term1339799.getClass(), "this$0", null);
        setField(term1339799, term1339799.getClass(), "call", null);
        setField(term1339799, term1339799.getClass(), "prototype", null);
        setField(term1339799, term1339799.getClass(), "kind", enum2506);
        setField(term1339799, term1339799.getClass(), "typeOfThis", null);
        setField(term1339799, term1339799.getClass(), "source", null);
        setField(term1339799, term1339799.getClass(), "implementedInterfaces", null);
        setField(term1339799, term1339799.getClass(), "subTypes", null);
        setField(term1339799, term1339799.getClass(), "templateTypeName", null);
        setField(term1339799, term1339799.getClass(), "className", null);
        setField(term1339799, term1339799.getClass(), "properties", null);
        setField(term1339799, term1339799.getClass(), "implicitPrototype", null);
        setBooleanField(term1339799, term1339799.getClass(), "nativeType", false);
        setBooleanField(term1339799, term1339799.getClass(), "visited", false);
        setField(term1339799, term1339799.getClass(), "docInfo", null);
        setBooleanField(term1339799, term1339799.getClass(), "unknown", false);
        setBooleanField(term1339799, term1339799.getClass(), "resolved", false);
        setField(term1339799, term1339799.getClass(), "resolveResult", null);
        setField(term1339799, term1339799.getClass(), "registry", null);
        setField(term1339795, term1339795.getClass(), "typeOfThis", term1339799);
        setField(term1339795, term1339795.getClass(), "source", null);
        setField(term1339795, term1339795.getClass(), "implementedInterfaces", null);
        setField(term1339795, term1339795.getClass(), "subTypes", null);
        setField(term1339795, term1339795.getClass(), "templateTypeName", null);
        setField(term1339795, term1339795.getClass(), "className", null);
        setField(term1339795, term1339795.getClass(), "properties", null);
        setField(term1339795, term1339795.getClass(), "implicitPrototype", null);
        setBooleanField(term1339795, term1339795.getClass(), "nativeType", false);
        setBooleanField(term1339795, term1339795.getClass(), "visited", false);
        setField(term1339795, term1339795.getClass(), "docInfo", null);
        setBooleanField(term1339795, term1339795.getClass(), "unknown", false);
        setBooleanField(term1339795, term1339795.getClass(), "resolved", false);
        setField(term1339795, term1339795.getClass(), "resolveResult", null);
        setField(term1339795, term1339795.getClass(), "registry", null);
        Class<? extends Object> term1341007 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1341006 = ((Class) term1341007).getDeclaredField((String) "INTERFACE");
        ((Field) term1341006).setAccessible(true);
        Object enum2507 = ((Field) term1341006).get((Object) null);
        Class<? extends Object> term1341301 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1341300 = ((Class) term1341301).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1341300).setAccessible(true);
        Object enum2508 = ((Field) term1341300).get((Object) null);
        term1339803 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1339807 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1339803, term1339803.getClass(), "this$0", null);
        setField(term1339803, term1339803.getClass(), "call", null);
        setField(term1339803, term1339803.getClass(), "prototype", null);
        setField(term1339803, term1339803.getClass(), "kind", enum2507);
        setField(term1339807, term1339807.getClass(), "this$0", null);
        setField(term1339807, term1339807.getClass(), "call", null);
        setField(term1339807, term1339807.getClass(), "prototype", null);
        setField(term1339807, term1339807.getClass(), "kind", enum2508);
        setField(term1339807, term1339807.getClass(), "typeOfThis", null);
        setField(term1339807, term1339807.getClass(), "source", null);
        setField(term1339807, term1339807.getClass(), "implementedInterfaces", null);
        setField(term1339807, term1339807.getClass(), "subTypes", null);
        setField(term1339807, term1339807.getClass(), "templateTypeName", null);
        setField(term1339807, term1339807.getClass(), "className", null);
        setField(term1339807, term1339807.getClass(), "properties", null);
        setField(term1339807, term1339807.getClass(), "implicitPrototype", null);
        setBooleanField(term1339807, term1339807.getClass(), "nativeType", false);
        setBooleanField(term1339807, term1339807.getClass(), "visited", false);
        setField(term1339807, term1339807.getClass(), "docInfo", null);
        setBooleanField(term1339807, term1339807.getClass(), "unknown", false);
        setBooleanField(term1339807, term1339807.getClass(), "resolved", false);
        setField(term1339807, term1339807.getClass(), "resolveResult", null);
        setField(term1339807, term1339807.getClass(), "registry", null);
        setField(term1339803, term1339803.getClass(), "typeOfThis", term1339807);
        setField(term1339803, term1339803.getClass(), "source", null);
        setField(term1339803, term1339803.getClass(), "implementedInterfaces", null);
        setField(term1339803, term1339803.getClass(), "subTypes", null);
        setField(term1339803, term1339803.getClass(), "templateTypeName", null);
        setField(term1339803, term1339803.getClass(), "className", null);
        setField(term1339803, term1339803.getClass(), "properties", null);
        setField(term1339803, term1339803.getClass(), "implicitPrototype", null);
        setBooleanField(term1339803, term1339803.getClass(), "nativeType", false);
        setBooleanField(term1339803, term1339803.getClass(), "visited", false);
        setField(term1339803, term1339803.getClass(), "docInfo", null);
        setBooleanField(term1339803, term1339803.getClass(), "unknown", false);
        setBooleanField(term1339803, term1339803.getClass(), "resolved", false);
        setField(term1339803, term1339803.getClass(), "resolveResult", null);
        setField(term1339803, term1339803.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1338733;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1338073, args);
        assertTrue(recursiveEquals(term1338073, term1339795));
        assertTrue(recursiveEquals(term1338733, term1339803));
        assertTrue(recursiveEquals(retValue, true));
    }

};


