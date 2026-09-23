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

public class FunctionType_isSubtype_21010021581315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1830615;
     Object term1831383;

    public FunctionType_isSubtype_21010021581315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1833285 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1833284 = ((Class) term1833285).getDeclaredField((String) "ORDINARY");
        ((Field) term1833284).setAccessible(true);
        Object enum3255 = ((Field) term1833284).get((Object) null);
        Class<? extends Object> term1833576 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1833575 = ((Class) term1833576).getDeclaredField((String) "INTERFACE");
        ((Field) term1833575).setAccessible(true);
        Object enum3256 = ((Field) term1833575).get((Object) null);
        term1830615 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1831167 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1831275 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1830615, term1830615.getClass(), "kind", enum3255);
        setField(term1831167, term1831167.getClass(), "kind", enum3256);
        setField(term1831167, term1831167.getClass(), "typeOfThis", term1831275);
        setField(term1830615, term1830615.getClass(), "typeOfThis", term1831167);
        Class<? extends Object> term1833870 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1833869 = ((Class) term1833870).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1833869).setAccessible(true);
        Object enum3257 = ((Field) term1833869).get((Object) null);
        term1831383 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1831713 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1831383, term1831383.getClass(), "kind", enum3255);
        setField(term1831713, term1831713.getClass(), "kind", enum3257);
        setField(term1831713, term1831713.getClass(), "typeOfThis", null);
        setField(term1831383, term1831383.getClass(), "typeOfThis", term1831713);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1831383;
        try {
            callMethod(klass, "isSubtype", argTypes, term1830615, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


