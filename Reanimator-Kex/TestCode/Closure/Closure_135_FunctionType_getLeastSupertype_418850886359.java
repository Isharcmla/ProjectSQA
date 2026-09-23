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

public class FunctionType_getLeastSupertype_418850886359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term212354;
     Object term212783;
     Object term212787;
     Object term212730;

    public FunctionType_getLeastSupertype_418850886359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term212792 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term212791 = ((Class) term212792).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term212791).setAccessible(true);
        Object enum385 = ((Field) term212791).get((Object) null);
        term212354 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term212354, term212354.getClass(), "kind", enum385);
        Class<? extends Object> term213092 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term213091 = ((Class) term213092).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term213091).setAccessible(true);
        Object enum386 = ((Field) term213091).get((Object) null);
        term212783 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term212783, term212783.getClass(), "this$0", null);
        setField(term212783, term212783.getClass(), "call", null);
        setField(term212783, term212783.getClass(), "prototype", null);
        setField(term212783, term212783.getClass(), "kind", enum386);
        setField(term212783, term212783.getClass(), "typeOfThis", null);
        setField(term212783, term212783.getClass(), "source", null);
        setField(term212783, term212783.getClass(), "implementedInterfaces", null);
        setField(term212783, term212783.getClass(), "subTypes", null);
        setField(term212783, term212783.getClass(), "templateTypeName", null);
        setField(term212783, term212783.getClass(), "className", null);
        setField(term212783, term212783.getClass(), "properties", null);
        setField(term212783, term212783.getClass(), "implicitPrototype", null);
        setBooleanField(term212783, term212783.getClass(), "nativeType", false);
        setBooleanField(term212783, term212783.getClass(), "visited", false);
        setField(term212783, term212783.getClass(), "docInfo", null);
        setBooleanField(term212783, term212783.getClass(), "unknown", false);
        setBooleanField(term212783, term212783.getClass(), "resolved", false);
        setField(term212783, term212783.getClass(), "resolveResult", null);
        setField(term212783, term212783.getClass(), "registry", null);
        Class<? extends Object> term213392 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term213391 = ((Class) term213392).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term213391).setAccessible(true);
        Object enum387 = ((Field) term213391).get((Object) null);
        term212787 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term212787, term212787.getClass(), "this$0", null);
        setField(term212787, term212787.getClass(), "call", null);
        setField(term212787, term212787.getClass(), "prototype", null);
        setField(term212787, term212787.getClass(), "kind", enum387);
        setField(term212787, term212787.getClass(), "typeOfThis", null);
        setField(term212787, term212787.getClass(), "source", null);
        setField(term212787, term212787.getClass(), "implementedInterfaces", null);
        setField(term212787, term212787.getClass(), "subTypes", null);
        setField(term212787, term212787.getClass(), "templateTypeName", null);
        setField(term212787, term212787.getClass(), "className", null);
        setField(term212787, term212787.getClass(), "properties", null);
        setField(term212787, term212787.getClass(), "implicitPrototype", null);
        setBooleanField(term212787, term212787.getClass(), "nativeType", false);
        setBooleanField(term212787, term212787.getClass(), "visited", false);
        setField(term212787, term212787.getClass(), "docInfo", null);
        setBooleanField(term212787, term212787.getClass(), "unknown", false);
        setBooleanField(term212787, term212787.getClass(), "resolved", false);
        setField(term212787, term212787.getClass(), "resolveResult", null);
        setField(term212787, term212787.getClass(), "registry", null);
        Class<? extends Object> term213692 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term213691 = ((Class) term213692).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term213691).setAccessible(true);
        Object enum388 = ((Field) term213691).get((Object) null);
        term212730 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term212730, term212730.getClass(), "this$0", null);
        setField(term212730, term212730.getClass(), "call", null);
        setField(term212730, term212730.getClass(), "prototype", null);
        setField(term212730, term212730.getClass(), "kind", enum388);
        setField(term212730, term212730.getClass(), "typeOfThis", null);
        setField(term212730, term212730.getClass(), "source", null);
        setField(term212730, term212730.getClass(), "implementedInterfaces", null);
        setField(term212730, term212730.getClass(), "subTypes", null);
        setField(term212730, term212730.getClass(), "templateTypeName", null);
        setField(term212730, term212730.getClass(), "className", null);
        setField(term212730, term212730.getClass(), "properties", null);
        setField(term212730, term212730.getClass(), "implicitPrototype", null);
        setBooleanField(term212730, term212730.getClass(), "nativeType", false);
        setBooleanField(term212730, term212730.getClass(), "visited", false);
        setField(term212730, term212730.getClass(), "docInfo", null);
        setBooleanField(term212730, term212730.getClass(), "unknown", false);
        setBooleanField(term212730, term212730.getClass(), "resolved", false);
        setField(term212730, term212730.getClass(), "resolveResult", null);
        setField(term212730, term212730.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term212354;
        Object retValue = callMethod(klass, "getLeastSupertype", argTypes, term212354, args);
        assertTrue(recursiveEquals(term212354, term212783));
        assertTrue(recursiveEquals(term212354, term212787));
        assertTrue(recursiveEquals(retValue, term212730));
    }

};


