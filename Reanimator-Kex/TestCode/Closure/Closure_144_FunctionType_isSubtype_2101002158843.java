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

public class FunctionType_isSubtype_2101002158843 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term990754;
     Object term991200;

    public FunctionType_isSubtype_2101002158843() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term992803 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term992802 = ((Class) term992803).getDeclaredField((String) "ORDINARY");
        ((Field) term992802).setAccessible(true);
        Object enum1794 = ((Field) term992802).get((Object) null);
        term990754 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term991002 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term991090 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term990754, term990754.getClass(), "kind", enum1794);
        setField(term991002, term991002.getClass(), "kind", enum1794);
        setField(term991002, term991002.getClass(), "typeOfThis", term991090);
        setField(term990754, term990754.getClass(), "typeOfThis", term991002);
        Class<? extends Object> term993094 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term993093 = ((Class) term993094).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term993093).setAccessible(true);
        Object enum1795 = ((Field) term993093).get((Object) null);
        term991200 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term991384 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term991200, term991200.getClass(), "kind", enum1794);
        setField(term991384, term991384.getClass(), "kind", enum1795);
        setField(term991384, term991384.getClass(), "typeOfThis", null);
        setField(term991200, term991200.getClass(), "typeOfThis", term991384);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term991200;
        try {
            callMethod(klass, "isSubtype", argTypes, term990754, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


