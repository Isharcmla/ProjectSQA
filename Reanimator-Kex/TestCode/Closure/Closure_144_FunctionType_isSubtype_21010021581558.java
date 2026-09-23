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

public class FunctionType_isSubtype_21010021581558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2277180;
     Object term2277942;

    public FunctionType_isSubtype_21010021581558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2281348 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2281347 = ((Class) term2281348).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2281347).setAccessible(true);
        Object enum4067 = ((Field) term2281347).get((Object) null);
        Class<? extends Object> term2281648 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2281647 = ((Class) term2281648).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2281647).setAccessible(true);
        Object enum4068 = ((Field) term2281647).get((Object) null);
        term2277180 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2277724 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2277834 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2277180, term2277180.getClass(), "kind", enum4067);
        setField(term2277724, term2277724.getClass(), "kind", enum4068);
        setField(term2277724, term2277724.getClass(), "typeOfThis", term2277834);
        setField(term2277180, term2277180.getClass(), "typeOfThis", term2277724);
        term2277942 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2278274 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2278374 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term2277942, term2277942.getClass(), "kind", enum4067);
        setField(term2278274, term2278274.getClass(), "kind", enum4068);
        setField(term2278274, term2278274.getClass(), "typeOfThis", term2278374);
        setField(term2277942, term2277942.getClass(), "typeOfThis", term2278274);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2277942;
        try {
            callMethod(klass, "isSubtype", argTypes, term2277180, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


