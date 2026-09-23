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

public class FunctionType_isSubtype_21010021581425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2029664;
     Object term2030262;

    public FunctionType_isSubtype_21010021581425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2035435 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2035434 = ((Class) term2035435).getDeclaredField((String) "ORDINARY");
        ((Field) term2035434).setAccessible(true);
        Object enum3616 = ((Field) term2035434).get((Object) null);
        Class<? extends Object> term2035726 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2035725 = ((Class) term2035726).getDeclaredField((String) "INTERFACE");
        ((Field) term2035725).setAccessible(true);
        Object enum3617 = ((Field) term2035725).get((Object) null);
        term2029664 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2029912 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2030154 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2029664, term2029664.getClass(), "kind", enum3616);
        setField(term2029912, term2029912.getClass(), "kind", enum3617);
        setField(term2029664, term2029664.getClass(), "typeOfThis", term2029912);
        setField(term2029664, term2029664.getClass(), "call", term2030154);
        term2030262 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2030446 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term2030540 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term2030262, term2030262.getClass(), "kind", enum3616);
        setField(term2030446, term2030446.getClass(), "kind", enum3616);
        setField(term2030262, term2030262.getClass(), "typeOfThis", term2030446);
        setField(term2030262, term2030262.getClass(), "call", term2030540);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2030262;
        try {
            callMethod(klass, "isSubtype", argTypes, term2029664, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


