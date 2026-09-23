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

public class FunctionType_isSubtype_2101002158553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term433014;
     Object term433666;

    public FunctionType_isSubtype_2101002158553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term435134 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term435133 = ((Class) term435134).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term435133).setAccessible(true);
        Object enum803 = ((Field) term435133).get((Object) null);
        Class<? extends Object> term435434 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term435433 = ((Class) term435434).getDeclaredField((String) "INTERFACE");
        ((Field) term435433).setAccessible(true);
        Object enum804 = ((Field) term435433).get((Object) null);
        term433014 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term433558 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term433014, term433014.getClass(), "kind", enum803);
        setField(term433558, term433558.getClass(), "kind", enum804);
        setField(term433014, term433014.getClass(), "typeOfThis", term433558);
        Class<? extends Object> term435728 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term435727 = ((Class) term435728).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term435727).setAccessible(true);
        Object enum805 = ((Field) term435727).get((Object) null);
        term433666 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term433840 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term433666, term433666.getClass(), "kind", enum805);
        setField(term433666, term433666.getClass(), "typeOfThis", term433840);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term433666;
        try {
            callMethod(klass, "isSubtype", argTypes, term433014, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


