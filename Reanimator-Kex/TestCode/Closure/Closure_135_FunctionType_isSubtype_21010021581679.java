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

public class FunctionType_isSubtype_21010021581679 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2273232;
     Object term2273984;

    public FunctionType_isSubtype_21010021581679() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2277678 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2277677 = ((Class) term2277678).getDeclaredField((String) "INTERFACE");
        ((Field) term2277677).setAccessible(true);
        Object enum4249 = ((Field) term2277677).get((Object) null);
        Class<? extends Object> term2277972 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2277971 = ((Class) term2277972).getDeclaredField((String) "INTERFACE");
        ((Field) term2277971).setAccessible(true);
        Object enum4250 = ((Field) term2277971).get((Object) null);
        term2273232 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term2273776 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2273876 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2273232, term2273232.getClass(), "kind", enum4249);
        setField(term2273776, term2273776.getClass(), "kind", enum4249);
        setField(term2273876, term2273876.getClass(), "kind", enum4250);
        setField(term2273776, term2273776.getClass(), "typeOfThis", term2273876);
        setField(term2273232, term2273232.getClass(), "typeOfThis", term2273776);
        Class<? extends Object> term2278266 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2278265 = ((Class) term2278266).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2278265).setAccessible(true);
        Object enum4251 = ((Field) term2278265).get((Object) null);
        term2273984 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term2274166 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2274274 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2273984, term2273984.getClass(), "kind", enum4251);
        setField(term2274166, term2274166.getClass(), "kind", enum4251);
        setField(term2274166, term2274166.getClass(), "typeOfThis", term2274274);
        setField(term2273984, term2273984.getClass(), "typeOfThis", term2274166);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2273984;
        try {
            callMethod(klass, "isSubtype", argTypes, term2273232, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


