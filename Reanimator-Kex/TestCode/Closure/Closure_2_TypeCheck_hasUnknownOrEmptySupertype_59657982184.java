package com.google.javascript.jscomp;

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
import java.lang.ClassCastException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class TypeCheck_hasUnknownOrEmptySupertype_59657982184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45090;

    public TypeCheck_hasUnknownOrEmptySupertype_59657982184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term46457 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term46456 = ((Class) term46457).getDeclaredField((String) "INTERFACE");
        ((Field) term46456).setAccessible(true);
        Object enum27 = ((Field) term46456).get((Object) null);
        term45090 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term45330 = newInstance(Class.forName("com.google.javascript.rhino.jstype.Property"));
        Object term45426 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        setField(term45090, term45090.getClass(), "kind", enum27);
        setBooleanField(term45090, term45090.getClass(), "unknown", false);
        setField(term45330, term45330.getClass(), "type", term45426);
        setField(term45090, term45090.getClass(), "prototypeSlot", term45330);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term45090;
        try {
            callMethod(klass, "hasUnknownOrEmptySupertype", argTypes, null, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


