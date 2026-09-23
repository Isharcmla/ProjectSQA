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

public class FunctionType_supAndInfHelper_1915298734393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term360428;
     Object term360780;

    public FunctionType_supAndInfHelper_1915298734393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term361892 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term361891 = ((Class) term361892).getDeclaredField((String) "INTERFACE");
        ((Field) term361891).setAccessible(true);
        Object enum613 = ((Field) term361891).get((Object) null);
        term360428 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term360680 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setBooleanField(term360428, term360428.getClass(), "unknown", false);
        setField(term360428, term360428.getClass(), "kind", enum613);
        setField(term360428, term360428.getClass(), "registry", term360680);
        Class<? extends Object> term362186 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term362185 = ((Class) term362186).getDeclaredField((String) "ORDINARY");
        ((Field) term362185).setAccessible(true);
        Object enum614 = ((Field) term362185).get((Object) null);
        term360780 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setBooleanField(term360780, term360780.getClass(), "unknown", false);
        setField(term360780, term360780.getClass(), "kind", enum614);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term360780;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term360428, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


