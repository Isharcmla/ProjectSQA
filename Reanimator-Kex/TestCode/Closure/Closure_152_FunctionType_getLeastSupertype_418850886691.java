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

public class FunctionType_getLeastSupertype_418850886691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term721848;
     Object term722502;

    public FunctionType_getLeastSupertype_418850886691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term724029 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term724028 = ((Class) term724029).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term724028).setAccessible(true);
        Object enum1092 = ((Field) term724028).get((Object) null);
        term721848 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term722392 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term721848, term721848.getClass(), "kind", enum1092);
        setField(term722392, term722392.getClass(), "kind", enum1092);
        setField(term721848, term721848.getClass(), "typeOfThis", term722392);
        Class<? extends Object> term724329 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term724328 = ((Class) term724329).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term724328).setAccessible(true);
        Object enum1093 = ((Field) term724328).get((Object) null);
        Class<? extends Object> term724629 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term724628 = ((Class) term724629).getDeclaredField((String) "INTERFACE");
        ((Field) term724628).setAccessible(true);
        Object enum1094 = ((Field) term724628).get((Object) null);
        term722502 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term722676 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term722502, term722502.getClass(), "kind", enum1093);
        setField(term722676, term722676.getClass(), "kind", enum1094);
        setField(term722502, term722502.getClass(), "typeOfThis", term722676);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term722502;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term721848, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


