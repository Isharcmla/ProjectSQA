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

public class FunctionType_getGreatestSubtype_6795917091782 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2444387;
     Object term2445047;

    public FunctionType_getGreatestSubtype_6795917091782() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2446177 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2446176 = ((Class) term2446177).getDeclaredField((String) "INTERFACE");
        ((Field) term2446176).setAccessible(true);
        Object enum4570 = ((Field) term2446176).get((Object) null);
        Class<? extends Object> term2446471 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2446470 = ((Class) term2446471).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2446470).setAccessible(true);
        Object enum4571 = ((Field) term2446470).get((Object) null);
        term2444387 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2444939 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term2444387, term2444387.getClass(), "kind", enum4570);
        setField(term2444939, term2444939.getClass(), "kind", enum4571);
        setField(term2444387, term2444387.getClass(), "typeOfThis", term2444939);
        term2445047 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2445229 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term2445047, term2445047.getClass(), "kind", enum4571);
        setField(term2445047, term2445047.getClass(), "typeOfThis", term2445229);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2445047;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term2444387, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


