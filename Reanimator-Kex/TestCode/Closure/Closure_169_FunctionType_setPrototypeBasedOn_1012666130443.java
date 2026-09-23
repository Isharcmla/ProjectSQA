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
import java.lang.NullPointerException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class FunctionType_setPrototypeBasedOn_1012666130443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term403984;
     Object term404236;

    public FunctionType_setPrototypeBasedOn_1012666130443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term405070 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term405069 = ((Class) term405070).getDeclaredField((String) "INTERFACE");
        ((Field) term405069).setAccessible(true);
        Object enum667 = ((Field) term405069).get((Object) null);
        term403984 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setBooleanField(term403984, term403984.getClass(), "nativeType", false);
        setField(term403984, term403984.getClass(), "kind", enum667);
        setField(term403984, term403984.getClass(), "prototypeSlot", null);
        setField(term403984, term403984.getClass(), "source", null);
        term404236 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term404236, term404236.getClass(), "className", null);
        setField(term404236, term404236.getClass(), "ownerFunction", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[1];
        args[0] = term404236;
        try {
            callMethod(klass, "setPrototypeBasedOn", argTypes, term403984, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


