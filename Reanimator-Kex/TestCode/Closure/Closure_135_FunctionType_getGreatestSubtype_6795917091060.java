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

public class FunctionType_getGreatestSubtype_6795917091060 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1216762;
     Object term1217422;

    public FunctionType_getGreatestSubtype_6795917091060() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1220820 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1220819 = ((Class) term1220820).getDeclaredField((String) "ORDINARY");
        ((Field) term1220819).setAccessible(true);
        Object enum2272 = ((Field) term1220819).get((Object) null);
        term1216762 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1217314 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1216762, term1216762.getClass(), "kind", enum2272);
        setField(term1217314, term1217314.getClass(), "kind", enum2272);
        setField(term1216762, term1216762.getClass(), "typeOfThis", term1217314);
        Class<? extends Object> term1221111 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1221110 = ((Class) term1221111).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1221110).setAccessible(true);
        Object enum2273 = ((Field) term1221110).get((Object) null);
        Class<? extends Object> term1221411 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1221410 = ((Class) term1221411).getDeclaredField((String) "INTERFACE");
        ((Field) term1221410).setAccessible(true);
        Object enum2274 = ((Field) term1221410).get((Object) null);
        term1217422 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1217596 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1217422, term1217422.getClass(), "kind", enum2273);
        setField(term1217596, term1217596.getClass(), "kind", enum2274);
        setField(term1217422, term1217422.getClass(), "typeOfThis", term1217596);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1217422;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term1216762, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


