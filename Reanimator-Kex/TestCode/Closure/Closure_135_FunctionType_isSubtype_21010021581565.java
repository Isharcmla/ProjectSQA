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

public class FunctionType_isSubtype_21010021581565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2080220;
     Object term2080880;

    public FunctionType_isSubtype_21010021581565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2083869 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2083868 = ((Class) term2083869).getDeclaredField((String) "INTERFACE");
        ((Field) term2083868).setAccessible(true);
        Object enum3878 = ((Field) term2083868).get((Object) null);
        term2080220 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term2080772 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2080220, term2080220.getClass(), "kind", enum3878);
        setField(term2080220, term2080220.getClass(), "typeOfThis", term2080772);
        Class<? extends Object> term2084163 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2084162 = ((Class) term2084163).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2084162).setAccessible(true);
        Object enum3879 = ((Field) term2084162).get((Object) null);
        term2080880 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term2080880, term2080880.getClass(), "kind", enum3879);
        setField(term2080880, term2080880.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2080880;
        try {
            callMethod(klass, "isSubtype", argTypes, term2080220, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


