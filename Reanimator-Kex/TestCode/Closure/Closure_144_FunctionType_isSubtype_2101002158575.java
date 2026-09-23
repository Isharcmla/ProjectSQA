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

public class FunctionType_isSubtype_2101002158575 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term538071;
     Object term538725;

    public FunctionType_isSubtype_2101002158575() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term539747 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term539746 = ((Class) term539747).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term539746).setAccessible(true);
        Object enum981 = ((Field) term539746).get((Object) null);
        term538071 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term538615 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term538071, term538071.getClass(), "kind", enum981);
        setField(term538071, term538071.getClass(), "typeOfThis", term538615);
        term538725 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term539055 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term538725, term538725.getClass(), "kind", enum981);
        setField(term538725, term538725.getClass(), "typeOfThis", term539055);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term538725;
        try {
            callMethod(klass, "isSubtype", argTypes, term538071, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


