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

public class FunctionType_supAndInfHelper_1603977104591 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term573940;
     Object term574602;

    public FunctionType_supAndInfHelper_1603977104591() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term575473 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term575472 = ((Class) term575473).getDeclaredField((String) "ORDINARY");
        ((Field) term575472).setAccessible(true);
        Object enum891 = ((Field) term575472).get((Object) null);
        term573940 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term574492 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term573940, term573940.getClass(), "kind", enum891);
        setField(term573940, term573940.getClass(), "typeOfThis", term574492);
        term574602 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term574602, term574602.getClass(), "kind", enum891);
        setField(term574602, term574602.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term574602;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term573940, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


