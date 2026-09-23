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

public class FunctionType_isSubtype_21010021581694 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2298661;
     Object term2299125;

    public FunctionType_isSubtype_21010021581694() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2304296 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2304295 = ((Class) term2304296).getDeclaredField((String) "ORDINARY");
        ((Field) term2304295).setAccessible(true);
        Object enum4299 = ((Field) term2304295).get((Object) null);
        term2298661 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term2298917 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2299017 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2298661, term2298661.getClass(), "kind", enum4299);
        setField(term2298917, term2298917.getClass(), "kind", enum4299);
        setField(term2298917, term2298917.getClass(), "typeOfThis", term2299017);
        setField(term2298661, term2298661.getClass(), "typeOfThis", term2298917);
        Class<? extends Object> term2304587 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2304586 = ((Class) term2304587).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2304586).setAccessible(true);
        Object enum4300 = ((Field) term2304586).get((Object) null);
        term2299125 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term2299307 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2299125, term2299125.getClass(), "kind", enum4299);
        setField(term2299307, term2299307.getClass(), "kind", enum4300);
        setField(term2299307, term2299307.getClass(), "typeOfThis", null);
        setField(term2299125, term2299125.getClass(), "typeOfThis", term2299307);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2299125;
        try {
            callMethod(klass, "isSubtype", argTypes, term2298661, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


