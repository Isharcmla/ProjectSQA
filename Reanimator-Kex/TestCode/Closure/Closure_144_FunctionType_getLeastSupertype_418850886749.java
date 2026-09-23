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

public class FunctionType_getLeastSupertype_418850886749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term821310;
     Object term821974;

    public FunctionType_getLeastSupertype_418850886749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term823418 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term823417 = ((Class) term823418).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term823417).setAccessible(true);
        Object enum1484 = ((Field) term823417).get((Object) null);
        Class<? extends Object> term823718 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term823717 = ((Class) term823718).getDeclaredField((String) "INTERFACE");
        ((Field) term823717).setAccessible(true);
        Object enum1485 = ((Field) term823717).get((Object) null);
        term821310 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term821864 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term821310, term821310.getClass(), "kind", enum1484);
        setField(term821864, term821864.getClass(), "kind", enum1485);
        setField(term821310, term821310.getClass(), "typeOfThis", term821864);
        Class<? extends Object> term824012 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term824011 = ((Class) term824012).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term824011).setAccessible(true);
        Object enum1486 = ((Field) term824011).get((Object) null);
        term821974 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term822148 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term821974, term821974.getClass(), "kind", enum1486);
        setField(term821974, term821974.getClass(), "typeOfThis", term822148);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term821974;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term821310, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


