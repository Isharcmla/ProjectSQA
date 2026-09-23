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

public class FunctionType_isSubtype_21010021581688 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2292605;
     Object term2293265;

    public FunctionType_isSubtype_21010021581688() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2294944 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2294943 = ((Class) term2294944).getDeclaredField((String) "INTERFACE");
        ((Field) term2294943).setAccessible(true);
        Object enum4285 = ((Field) term2294943).get((Object) null);
        term2292605 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term2293157 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2292605, term2292605.getClass(), "kind", enum4285);
        setField(term2293157, term2293157.getClass(), "kind", enum4285);
        setField(term2292605, term2292605.getClass(), "typeOfThis", term2293157);
        Class<? extends Object> term2295238 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2295237 = ((Class) term2295238).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2295237).setAccessible(true);
        Object enum4286 = ((Field) term2295237).get((Object) null);
        Class<? extends Object> term2295538 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2295537 = ((Class) term2295538).getDeclaredField((String) "INTERFACE");
        ((Field) term2295537).setAccessible(true);
        Object enum4287 = ((Field) term2295537).get((Object) null);
        term2293265 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term2293447 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2293265, term2293265.getClass(), "kind", enum4286);
        setField(term2293447, term2293447.getClass(), "kind", enum4287);
        setField(term2293265, term2293265.getClass(), "typeOfThis", term2293447);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2293265;
        try {
            callMethod(klass, "isSubtype", argTypes, term2292605, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


