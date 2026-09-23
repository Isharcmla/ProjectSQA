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

public class FunctionType_equals_1032735900341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196009;
     Object term196257;
     Object term196593;
     Object term196597;

    public FunctionType_equals_1032735900341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term196600 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term196599 = ((Class) term196600).getDeclaredField((String) "INTERFACE");
        ((Field) term196599).setAccessible(true);
        Object enum358 = ((Field) term196599).get((Object) null);
        term196009 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term196009, term196009.getClass(), "kind", enum358);
        term196257 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Class<? extends Object> term196894 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term196893 = ((Class) term196894).getDeclaredField((String) "INTERFACE");
        ((Field) term196893).setAccessible(true);
        Object enum359 = ((Field) term196893).get((Object) null);
        term196593 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term196593, term196593.getClass(), "call", null);
        setField(term196593, term196593.getClass(), "prototype", null);
        setField(term196593, term196593.getClass(), "kind", enum359);
        setField(term196593, term196593.getClass(), "typeOfThis", null);
        setField(term196593, term196593.getClass(), "source", null);
        setField(term196593, term196593.getClass(), "implementedInterfaces", null);
        setField(term196593, term196593.getClass(), "subTypes", null);
        setField(term196593, term196593.getClass(), "templateTypeName", null);
        setField(term196593, term196593.getClass(), "className", null);
        setField(term196593, term196593.getClass(), "properties", null);
        setField(term196593, term196593.getClass(), "implicitPrototype", null);
        setBooleanField(term196593, term196593.getClass(), "nativeType", false);
        setBooleanField(term196593, term196593.getClass(), "visited", false);
        setField(term196593, term196593.getClass(), "docInfo", null);
        setBooleanField(term196593, term196593.getClass(), "unknown", false);
        setBooleanField(term196593, term196593.getClass(), "resolved", false);
        setField(term196593, term196593.getClass(), "resolveResult", null);
        setField(term196593, term196593.getClass(), "registry", null);
        term196597 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term196597, term196597.getClass(), "call", null);
        setField(term196597, term196597.getClass(), "prototype", null);
        setField(term196597, term196597.getClass(), "kind", null);
        setField(term196597, term196597.getClass(), "typeOfThis", null);
        setField(term196597, term196597.getClass(), "source", null);
        setField(term196597, term196597.getClass(), "implementedInterfaces", null);
        setField(term196597, term196597.getClass(), "subTypes", null);
        setField(term196597, term196597.getClass(), "templateTypeName", null);
        setField(term196597, term196597.getClass(), "className", null);
        setField(term196597, term196597.getClass(), "properties", null);
        setField(term196597, term196597.getClass(), "implicitPrototype", null);
        setBooleanField(term196597, term196597.getClass(), "nativeType", false);
        setBooleanField(term196597, term196597.getClass(), "visited", false);
        setField(term196597, term196597.getClass(), "docInfo", null);
        setBooleanField(term196597, term196597.getClass(), "unknown", false);
        setBooleanField(term196597, term196597.getClass(), "resolved", false);
        setField(term196597, term196597.getClass(), "resolveResult", null);
        setField(term196597, term196597.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term196257;
        Object retValue = callMethod(klass, "equals", argTypes, term196009, args);
        assertTrue(recursiveEquals(term196009, term196593));
        assertTrue(recursiveEquals(term196257, term196597));
        assertTrue(recursiveEquals(retValue, false));
    }

};


