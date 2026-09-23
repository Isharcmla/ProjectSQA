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

public class FunctionType_getGreatestSubtype_679591709775 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term872142;
     Object term872806;

    public FunctionType_getGreatestSubtype_679591709775() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term875640 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term875639 = ((Class) term875640).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term875639).setAccessible(true);
        Object enum1581 = ((Field) term875639).get((Object) null);
        term872142 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term872696 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term872142, term872142.getClass(), "kind", enum1581);
        setField(term872142, term872142.getClass(), "typeOfThis", term872696);
        Class<? extends Object> term875940 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term875939 = ((Class) term875940).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term875939).setAccessible(true);
        Object enum1582 = ((Field) term875939).get((Object) null);
        term872806 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term872980 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term872806, term872806.getClass(), "kind", enum1582);
        setField(term872980, term872980.getClass(), "kind", enum1582);
        setField(term872980, term872980.getClass(), "typeOfThis", null);
        setField(term872806, term872806.getClass(), "typeOfThis", term872980);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term872806;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term872142, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


