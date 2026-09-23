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

public class FunctionType_supAndInfHelper_1603977104357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term248050;
     Object term248704;

    public FunctionType_supAndInfHelper_1603977104357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term249573 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term249572 = ((Class) term249573).getDeclaredField((String) "INTERFACE");
        ((Field) term249572).setAccessible(true);
        Object enum435 = ((Field) term249572).get((Object) null);
        term248050 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term248594 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term248050, term248050.getClass(), "kind", enum435);
        setField(term248050, term248050.getClass(), "typeOfThis", term248594);
        term248704 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term248704, term248704.getClass(), "kind", enum435);
        setField(term248704, term248704.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term248704;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term248050, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


