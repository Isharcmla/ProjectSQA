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

public class FunctionType_getGreatestSubtype_6795917091636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2201281;
     Object term2202035;

    public FunctionType_getGreatestSubtype_6795917091636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2205354 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2205353 = ((Class) term2205354).getDeclaredField((String) "ORDINARY");
        ((Field) term2205353).setAccessible(true);
        Object enum4108 = ((Field) term2205353).get((Object) null);
        term2201281 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2201833 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term2201927 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term2201281, term2201281.getClass(), "kind", enum4108);
        setField(term2201833, term2201833.getClass(), "kind", enum4108);
        setField(term2201833, term2201833.getClass(), "typeOfThis", term2201927);
        setField(term2201281, term2201281.getClass(), "typeOfThis", term2201833);
        Class<? extends Object> term2205645 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2205644 = ((Class) term2205645).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2205644).setAccessible(true);
        Object enum4109 = ((Field) term2205644).get((Object) null);
        term2202035 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2202219 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2202035, term2202035.getClass(), "kind", enum4109);
        setField(term2202219, term2202219.getClass(), "kind", enum4108);
        setField(term2202219, term2202219.getClass(), "typeOfThis", null);
        setField(term2202035, term2202035.getClass(), "typeOfThis", term2202219);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2202035;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term2201281, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


