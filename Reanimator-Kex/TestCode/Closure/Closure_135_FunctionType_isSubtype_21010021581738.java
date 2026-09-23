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

public class FunctionType_isSubtype_21010021581738 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2372758;
     Object term2373418;

    public FunctionType_isSubtype_21010021581738() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2376298 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2376297 = ((Class) term2376298).getDeclaredField((String) "ORDINARY");
        ((Field) term2376297).setAccessible(true);
        Object enum4440 = ((Field) term2376297).get((Object) null);
        Class<? extends Object> term2376589 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2376588 = ((Class) term2376589).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2376588).setAccessible(true);
        Object enum4441 = ((Field) term2376588).get((Object) null);
        term2372758 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2373310 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2372758, term2372758.getClass(), "kind", enum4440);
        setField(term2373310, term2373310.getClass(), "kind", enum4441);
        setField(term2372758, term2372758.getClass(), "typeOfThis", term2373310);
        term2373418 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2373748 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2373418, term2373418.getClass(), "kind", enum4440);
        setField(term2373748, term2373748.getClass(), "kind", enum4441);
        setField(term2373418, term2373418.getClass(), "typeOfThis", term2373748);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2373418;
        try {
            callMethod(klass, "isSubtype", argTypes, term2372758, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


