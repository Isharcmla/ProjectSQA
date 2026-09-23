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

public class FunctionType_isSubtype_21010021581325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1676060;
     Object term1676720;

    public FunctionType_isSubtype_21010021581325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1679782 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1679781 = ((Class) term1679782).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1679781).setAccessible(true);
        Object enum3134 = ((Field) term1679781).get((Object) null);
        Class<? extends Object> term1680082 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1680081 = ((Class) term1680082).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1680081).setAccessible(true);
        Object enum3135 = ((Field) term1680081).get((Object) null);
        term1676060 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1676848 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1676060, term1676060.getClass(), "kind", enum3134);
        setField(term1676848, term1676848.getClass(), "kind", enum3135);
        setField(term1676060, term1676060.getClass(), "typeOfThis", term1676848);
        term1676720 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1676720, term1676720.getClass(), "kind", enum3135);
        setField(term1676720, term1676720.getClass(), "typeOfThis", term1676848);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1676720;
        try {
            callMethod(klass, "isSubtype", argTypes, term1676060, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


