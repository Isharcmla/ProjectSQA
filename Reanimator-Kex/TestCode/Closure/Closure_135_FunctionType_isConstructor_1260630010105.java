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

public class FunctionType_isConstructor_1260630010105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58054;
     Object term58525;

    public FunctionType_isConstructor_1260630010105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term58531 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term58530 = ((Class) term58531).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term58530).setAccessible(true);
        Object enum144 = ((Field) term58530).get((Object) null);
        term58054 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term58054, term58054.getClass(), "kind", enum144);
        Class<? extends Object> term58831 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term58830 = ((Class) term58831).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term58830).setAccessible(true);
        Object enum145 = ((Field) term58830).get((Object) null);
        term58525 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term58525, term58525.getClass(), "call", null);
        setField(term58525, term58525.getClass(), "prototype", null);
        setField(term58525, term58525.getClass(), "kind", enum145);
        setField(term58525, term58525.getClass(), "typeOfThis", null);
        setField(term58525, term58525.getClass(), "source", null);
        setField(term58525, term58525.getClass(), "implementedInterfaces", null);
        setField(term58525, term58525.getClass(), "subTypes", null);
        setField(term58525, term58525.getClass(), "templateTypeName", null);
        setField(term58525, term58525.getClass(), "className", null);
        setField(term58525, term58525.getClass(), "properties", null);
        setField(term58525, term58525.getClass(), "implicitPrototype", null);
        setBooleanField(term58525, term58525.getClass(), "nativeType", false);
        setBooleanField(term58525, term58525.getClass(), "visited", false);
        setField(term58525, term58525.getClass(), "docInfo", null);
        setBooleanField(term58525, term58525.getClass(), "unknown", false);
        setBooleanField(term58525, term58525.getClass(), "resolved", false);
        setField(term58525, term58525.getClass(), "resolveResult", null);
        setField(term58525, term58525.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isConstructor", argTypes, term58054, args);
        assertTrue(recursiveEquals(term58054, term58525));
        assertTrue(recursiveEquals(retValue, true));
    }

};


