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

public class FunctionType_isSubtype_2101002158487 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term342889;
     Object term343529;

    public FunctionType_isSubtype_2101002158487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term344571 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term344570 = ((Class) term344571).getDeclaredField((String) "ORDINARY");
        ((Field) term344570).setAccessible(true);
        Object enum628 = ((Field) term344570).get((Object) null);
        term342889 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term343421 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term342889, term342889.getClass(), "kind", enum628);
        setField(term342889, term342889.getClass(), "typeOfThis", term343421);
        Class<? extends Object> term344862 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term344861 = ((Class) term344862).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term344861).setAccessible(true);
        Object enum629 = ((Field) term344861).get((Object) null);
        term343529 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term343529, term343529.getClass(), "kind", enum629);
        setField(term343529, term343529.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term343529;
        try {
            callMethod(klass, "isSubtype", argTypes, term342889, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


