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

public class FunctionType_supAndInfHelper_1603977104493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term432745;
     Object term433409;

    public FunctionType_supAndInfHelper_1603977104493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term434942 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term434941 = ((Class) term434942).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term434941).setAccessible(true);
        Object enum710 = ((Field) term434941).get((Object) null);
        term432745 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term433299 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term432745, term432745.getClass(), "kind", enum710);
        setField(term433299, term433299.getClass(), "kind", enum710);
        setField(term432745, term432745.getClass(), "typeOfThis", term433299);
        Class<? extends Object> term435242 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term435241 = ((Class) term435242).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term435241).setAccessible(true);
        Object enum711 = ((Field) term435241).get((Object) null);
        Class<? extends Object> term435542 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term435541 = ((Class) term435542).getDeclaredField((String) "INTERFACE");
        ((Field) term435541).setAccessible(true);
        Object enum712 = ((Field) term435541).get((Object) null);
        term433409 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term433583 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term433409, term433409.getClass(), "kind", enum711);
        setField(term433583, term433583.getClass(), "kind", enum712);
        setField(term433409, term433409.getClass(), "typeOfThis", term433583);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term433409;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term432745, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


