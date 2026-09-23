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

public class FunctionType_isSubtype_2101002158783 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term886785;
     Object term887291;

    public FunctionType_isSubtype_2101002158783() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term890430 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term890429 = ((Class) term890430).getDeclaredField((String) "ORDINARY");
        ((Field) term890429).setAccessible(true);
        Object enum1608 = ((Field) term890429).get((Object) null);
        Class<? extends Object> term890721 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term890720 = ((Class) term890721).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term890720).setAccessible(true);
        Object enum1609 = ((Field) term890720).get((Object) null);
        term886785 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term887033 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term886785, term886785.getClass(), "kind", enum1608);
        setField(term887033, term887033.getClass(), "kind", enum1609);
        setField(term887033, term887033.getClass(), "typeOfThis", null);
        setField(term886785, term886785.getClass(), "typeOfThis", term887033);
        term887291 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term887473 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term887581 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term887291, term887291.getClass(), "kind", enum1608);
        setField(term887473, term887473.getClass(), "kind", enum1608);
        setField(term887473, term887473.getClass(), "typeOfThis", term887581);
        setField(term887291, term887291.getClass(), "typeOfThis", term887473);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term887291;
        try {
            callMethod(klass, "isSubtype", argTypes, term886785, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


