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
import java.lang.Object;
import java.lang.String;

public class FunctionType_tryMergeFunctionPiecewise_2003411845567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term536934;
     Object term537556;

    public FunctionType_tryMergeFunctionPiecewise_2003411845567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term538753 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term538752 = ((Class) term538753).getDeclaredField((String) "ORDINARY");
        ((Field) term538752).setAccessible(true);
        Object enum844 = ((Field) term538752).get((Object) null);
        term536934 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term537028 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term537755 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term537198 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term537446 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term537755, term537755.getClass(), "first", term537755);
        setField(term537755, term537755.getClass(), "jsType", null);
        setField(term537755, term537755.getClass(), "next", null);
        setField(term537028, term537028.getClass(), "parameters", term537755);
        setField(term537198, term537198.getClass(), "kind", enum844);
        setField(term537198, term537198.getClass(), "typeOfThis", term537446);
        setField(term537028, term537028.getClass(), "returnType", term537198);
        setField(term536934, term536934.getClass(), "call", term537028);
        term537556 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term537650 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term537720 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term537855 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term538029 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term537720, term537720.getClass(), "first", term537755);
        setField(term537650, term537650.getClass(), "parameters", term537720);
        setField(term537855, term537855.getClass(), "kind", enum844);
        setField(term537855, term537855.getClass(), "typeOfThis", term538029);
        setField(term537650, term537650.getClass(), "returnType", term537855);
        setField(term537556, term537556.getClass(), "call", term537650);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term537556;
        args[1] = true;
        try {
            callMethod(klass, "tryMergeFunctionPiecewise", argTypes, term536934, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


