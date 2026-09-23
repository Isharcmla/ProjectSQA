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

public class FunctionType_isSubtype_21010021581169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1561192;
     Object term1561960;

    public FunctionType_isSubtype_21010021581169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1565544 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1565543 = ((Class) term1565544).getDeclaredField((String) "INTERFACE");
        ((Field) term1565543).setAccessible(true);
        Object enum2791 = ((Field) term1565543).get((Object) null);
        Class<? extends Object> term1565838 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1565837 = ((Class) term1565838).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1565837).setAccessible(true);
        Object enum2792 = ((Field) term1565837).get((Object) null);
        term1561192 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1561744 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1561852 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1561192, term1561192.getClass(), "kind", enum2791);
        setField(term1561744, term1561744.getClass(), "kind", enum2792);
        setField(term1561744, term1561744.getClass(), "typeOfThis", term1561852);
        setField(term1561192, term1561192.getClass(), "typeOfThis", term1561744);
        term1561960 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1562290 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1561960, term1561960.getClass(), "kind", enum2791);
        setField(term1562290, term1562290.getClass(), "kind", enum2792);
        setField(term1562290, term1562290.getClass(), "typeOfThis", null);
        setField(term1561960, term1561960.getClass(), "typeOfThis", term1562290);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1561960;
        try {
            callMethod(klass, "isSubtype", argTypes, term1561192, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


