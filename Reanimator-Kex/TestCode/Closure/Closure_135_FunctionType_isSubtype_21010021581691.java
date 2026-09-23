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

public class FunctionType_isSubtype_21010021581691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2296946;
     Object term2297410;

    public FunctionType_isSubtype_21010021581691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2300464 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2300463 = ((Class) term2300464).getDeclaredField((String) "ORDINARY");
        ((Field) term2300463).setAccessible(true);
        Object enum4295 = ((Field) term2300463).get((Object) null);
        term2296946 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term2297194 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2297302 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2296946, term2296946.getClass(), "kind", enum4295);
        setField(term2297194, term2297194.getClass(), "kind", enum4295);
        setField(term2297194, term2297194.getClass(), "typeOfThis", term2297302);
        setField(term2296946, term2296946.getClass(), "typeOfThis", term2297194);
        Class<? extends Object> term2300755 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2300754 = ((Class) term2300755).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2300754).setAccessible(true);
        Object enum4296 = ((Field) term2300754).get((Object) null);
        term2297410 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term2297592 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2297848 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2297410, term2297410.getClass(), "kind", enum4295);
        setField(term2297592, term2297592.getClass(), "kind", enum4296);
        setField(term2297592, term2297592.getClass(), "typeOfThis", term2297848);
        setField(term2297410, term2297410.getClass(), "typeOfThis", term2297592);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2297410;
        try {
            callMethod(klass, "isSubtype", argTypes, term2296946, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


