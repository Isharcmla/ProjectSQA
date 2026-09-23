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

public class FunctionType_supAndInfHelper_1603977104579 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term555273;
     Object term555937;

    public FunctionType_supAndInfHelper_1603977104579() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term556954 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term556953 = ((Class) term556954).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term556953).setAccessible(true);
        Object enum865 = ((Field) term556953).get((Object) null);
        term555273 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term555827 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term555273, term555273.getClass(), "kind", enum865);
        setField(term555273, term555273.getClass(), "typeOfThis", term555827);
        Class<? extends Object> term557254 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term557253 = ((Class) term557254).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term557253).setAccessible(true);
        Object enum866 = ((Field) term557253).get((Object) null);
        term555937 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term555937, term555937.getClass(), "kind", enum866);
        setField(term555937, term555937.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term555937;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term555273, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


