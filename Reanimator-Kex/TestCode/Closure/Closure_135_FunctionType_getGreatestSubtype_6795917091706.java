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

public class FunctionType_getGreatestSubtype_6795917091706 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2319492;
     Object term2320152;

    public FunctionType_getGreatestSubtype_6795917091706() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2321655 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2321654 = ((Class) term2321655).getDeclaredField((String) "ORDINARY");
        ((Field) term2321654).setAccessible(true);
        Object enum4335 = ((Field) term2321654).get((Object) null);
        term2319492 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2320044 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term2319492, term2319492.getClass(), "kind", enum4335);
        setField(term2320044, term2320044.getClass(), "kind", enum4335);
        setField(term2319492, term2319492.getClass(), "typeOfThis", term2320044);
        Class<? extends Object> term2321946 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2321945 = ((Class) term2321946).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2321945).setAccessible(true);
        Object enum4336 = ((Field) term2321945).get((Object) null);
        Class<? extends Object> term2322246 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2322245 = ((Class) term2322246).getDeclaredField((String) "INTERFACE");
        ((Field) term2322245).setAccessible(true);
        Object enum4337 = ((Field) term2322245).get((Object) null);
        term2320152 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2320326 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2320152, term2320152.getClass(), "kind", enum4336);
        setField(term2320326, term2320326.getClass(), "kind", enum4337);
        setField(term2320152, term2320152.getClass(), "typeOfThis", term2320326);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2320152;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term2319492, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


