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

public class FunctionType_isSubtype_21010021581724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2349412;
     Object term2350066;

    public FunctionType_isSubtype_21010021581724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2351688 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2351687 = ((Class) term2351688).getDeclaredField((String) "ORDINARY");
        ((Field) term2351687).setAccessible(true);
        Object enum4393 = ((Field) term2351687).get((Object) null);
        term2349412 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2349956 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term2349412, term2349412.getClass(), "kind", enum4393);
        setField(term2349956, term2349956.getClass(), "kind", enum4393);
        setField(term2349412, term2349412.getClass(), "typeOfThis", term2349956);
        Class<? extends Object> term2351979 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2351978 = ((Class) term2351979).getDeclaredField((String) "INTERFACE");
        ((Field) term2351978).setAccessible(true);
        Object enum4394 = ((Field) term2351978).get((Object) null);
        term2350066 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2350396 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2350066, term2350066.getClass(), "kind", enum4393);
        setField(term2350396, term2350396.getClass(), "kind", enum4394);
        setField(term2350066, term2350066.getClass(), "typeOfThis", term2350396);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2350066;
        try {
            callMethod(klass, "isSubtype", argTypes, term2349412, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


