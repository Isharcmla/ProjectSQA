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

public class FunctionType_isSubtype_21010021581429 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2038016;
     Object term2038668;

    public FunctionType_isSubtype_21010021581429() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2041581 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2041580 = ((Class) term2041581).getDeclaredField((String) "ORDINARY");
        ((Field) term2041580).setAccessible(true);
        Object enum3627 = ((Field) term2041580).get((Object) null);
        term2038016 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2038560 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2038016, term2038016.getClass(), "kind", enum3627);
        setField(term2038560, term2038560.getClass(), "kind", enum3627);
        setField(term2038016, term2038016.getClass(), "typeOfThis", term2038560);
        Class<? extends Object> term2041872 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2041871 = ((Class) term2041872).getDeclaredField((String) "INTERFACE");
        ((Field) term2041871).setAccessible(true);
        Object enum3628 = ((Field) term2041871).get((Object) null);
        term2038668 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2038998 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2038668, term2038668.getClass(), "kind", enum3627);
        setField(term2038998, term2038998.getClass(), "kind", enum3628);
        setField(term2038668, term2038668.getClass(), "typeOfThis", term2038998);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2038668;
        try {
            callMethod(klass, "isSubtype", argTypes, term2038016, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


