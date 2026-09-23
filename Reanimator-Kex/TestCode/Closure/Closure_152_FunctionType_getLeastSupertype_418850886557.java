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

public class FunctionType_getLeastSupertype_418850886557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term521785;
     Object term522439;

    public FunctionType_getLeastSupertype_418850886557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term523579 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term523578 = ((Class) term523579).getDeclaredField((String) "ORDINARY");
        ((Field) term523578).setAccessible(true);
        Object enum827 = ((Field) term523578).get((Object) null);
        term521785 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term522329 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term521785, term521785.getClass(), "kind", enum827);
        setField(term521785, term521785.getClass(), "typeOfThis", term522329);
        Class<? extends Object> term523870 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term523869 = ((Class) term523870).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term523869).setAccessible(true);
        Object enum828 = ((Field) term523869).get((Object) null);
        term522439 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term522601 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term522439, term522439.getClass(), "kind", enum828);
        setField(term522439, term522439.getClass(), "typeOfThis", term522601);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term522439;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term521785, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


