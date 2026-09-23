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

public class FunctionType_isSubtype_21010021581539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2038910;
     Object term2039674;

    public FunctionType_isSubtype_21010021581539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2041987 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2041986 = ((Class) term2041987).getDeclaredField((String) "ORDINARY");
        ((Field) term2041986).setAccessible(true);
        Object enum3802 = ((Field) term2041986).get((Object) null);
        term2038910 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term2039454 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2039566 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setField(term2038910, term2038910.getClass(), "kind", enum3802);
        setField(term2039454, term2039454.getClass(), "kind", enum3802);
        setField(term2039454, term2039454.getClass(), "typeOfThis", term2039566);
        setField(term2038910, term2038910.getClass(), "typeOfThis", term2039454);
        term2039674 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term2039996 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2039674, term2039674.getClass(), "kind", enum3802);
        setField(term2039996, term2039996.getClass(), "kind", enum3802);
        setField(term2039996, term2039996.getClass(), "typeOfThis", null);
        setField(term2039674, term2039674.getClass(), "typeOfThis", term2039996);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2039674;
        try {
            callMethod(klass, "isSubtype", argTypes, term2038910, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


