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

public class FunctionType_isSubtype_2101002158625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term617206;
     Object term617858;

    public FunctionType_isSubtype_2101002158625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term618819 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term618818 = ((Class) term618819).getDeclaredField((String) "INTERFACE");
        ((Field) term618818).setAccessible(true);
        Object enum1118 = ((Field) term618818).get((Object) null);
        term617206 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term617750 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term617206, term617206.getClass(), "kind", enum1118);
        setField(term617206, term617206.getClass(), "typeOfThis", term617750);
        term617858 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term618188 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term617858, term617858.getClass(), "kind", enum1118);
        setField(term617858, term617858.getClass(), "typeOfThis", term618188);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term617858;
        try {
            callMethod(klass, "isSubtype", argTypes, term617206, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


