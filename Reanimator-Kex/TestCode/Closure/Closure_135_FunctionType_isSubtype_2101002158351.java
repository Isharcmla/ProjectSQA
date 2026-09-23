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

public class FunctionType_isSubtype_2101002158351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201767;
     Object term202023;
     Object term202373;
     Object term202377;

    public FunctionType_isSubtype_2101002158351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term202380 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term202379 = ((Class) term202380).getDeclaredField((String) "INTERFACE");
        ((Field) term202379).setAccessible(true);
        Object enum367 = ((Field) term202379).get((Object) null);
        term201767 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term201767, term201767.getClass(), "kind", enum367);
        term202023 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Class<? extends Object> term202674 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term202673 = ((Class) term202674).getDeclaredField((String) "INTERFACE");
        ((Field) term202673).setAccessible(true);
        Object enum368 = ((Field) term202673).get((Object) null);
        term202373 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term202373, term202373.getClass(), "this$0", null);
        setField(term202373, term202373.getClass(), "call", null);
        setField(term202373, term202373.getClass(), "prototype", null);
        setField(term202373, term202373.getClass(), "kind", enum368);
        setField(term202373, term202373.getClass(), "typeOfThis", null);
        setField(term202373, term202373.getClass(), "source", null);
        setField(term202373, term202373.getClass(), "implementedInterfaces", null);
        setField(term202373, term202373.getClass(), "subTypes", null);
        setField(term202373, term202373.getClass(), "templateTypeName", null);
        setField(term202373, term202373.getClass(), "className", null);
        setField(term202373, term202373.getClass(), "properties", null);
        setField(term202373, term202373.getClass(), "implicitPrototype", null);
        setBooleanField(term202373, term202373.getClass(), "nativeType", false);
        setBooleanField(term202373, term202373.getClass(), "visited", false);
        setField(term202373, term202373.getClass(), "docInfo", null);
        setBooleanField(term202373, term202373.getClass(), "unknown", false);
        setBooleanField(term202373, term202373.getClass(), "resolved", false);
        setField(term202373, term202373.getClass(), "resolveResult", null);
        setField(term202373, term202373.getClass(), "registry", null);
        term202377 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term202377, term202377.getClass(), "this$0", null);
        setField(term202377, term202377.getClass(), "call", null);
        setField(term202377, term202377.getClass(), "prototype", null);
        setField(term202377, term202377.getClass(), "kind", null);
        setField(term202377, term202377.getClass(), "typeOfThis", null);
        setField(term202377, term202377.getClass(), "source", null);
        setField(term202377, term202377.getClass(), "implementedInterfaces", null);
        setField(term202377, term202377.getClass(), "subTypes", null);
        setField(term202377, term202377.getClass(), "templateTypeName", null);
        setField(term202377, term202377.getClass(), "className", null);
        setField(term202377, term202377.getClass(), "properties", null);
        setField(term202377, term202377.getClass(), "implicitPrototype", null);
        setBooleanField(term202377, term202377.getClass(), "nativeType", false);
        setBooleanField(term202377, term202377.getClass(), "visited", false);
        setField(term202377, term202377.getClass(), "docInfo", null);
        setBooleanField(term202377, term202377.getClass(), "unknown", false);
        setBooleanField(term202377, term202377.getClass(), "resolved", false);
        setField(term202377, term202377.getClass(), "resolveResult", null);
        setField(term202377, term202377.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term202023;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term201767, args);
        assertTrue(recursiveEquals(term201767, term202373));
        assertTrue(recursiveEquals(term202023, term202377));
        assertTrue(recursiveEquals(retValue, false));
    }

};


