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

public class FunctionType_isSubtype_21010021581523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2220858;
     Object term2221620;

    public FunctionType_isSubtype_21010021581523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2222866 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2222865 = ((Class) term2222866).getDeclaredField((String) "ORDINARY");
        ((Field) term2222865).setAccessible(true);
        Object enum3965 = ((Field) term2222865).get((Object) null);
        term2220858 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2221402 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2221512 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2220858, term2220858.getClass(), "kind", enum3965);
        setField(term2221402, term2221402.getClass(), "kind", enum3965);
        setField(term2221402, term2221402.getClass(), "typeOfThis", term2221512);
        setField(term2220858, term2220858.getClass(), "typeOfThis", term2221402);
        Class<? extends Object> term2223157 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2223156 = ((Class) term2223157).getDeclaredField((String) "INTERFACE");
        ((Field) term2223156).setAccessible(true);
        Object enum3966 = ((Field) term2223156).get((Object) null);
        term2221620 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2221950 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2221620, term2221620.getClass(), "kind", enum3965);
        setField(term2221950, term2221950.getClass(), "kind", enum3966);
        setField(term2221950, term2221950.getClass(), "typeOfThis", null);
        setField(term2221620, term2221620.getClass(), "typeOfThis", term2221950);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2221620;
        try {
            callMethod(klass, "isSubtype", argTypes, term2220858, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


