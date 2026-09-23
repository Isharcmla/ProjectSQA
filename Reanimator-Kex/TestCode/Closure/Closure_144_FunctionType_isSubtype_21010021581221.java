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

public class FunctionType_isSubtype_21010021581221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1660734;
     Object term1661496;

    public FunctionType_isSubtype_21010021581221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1662940 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1662939 = ((Class) term1662940).getDeclaredField((String) "ORDINARY");
        ((Field) term1662939).setAccessible(true);
        Object enum2970 = ((Field) term1662939).get((Object) null);
        Class<? extends Object> term1663231 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1663230 = ((Class) term1663231).getDeclaredField((String) "INTERFACE");
        ((Field) term1663230).setAccessible(true);
        Object enum2971 = ((Field) term1663230).get((Object) null);
        term1660734 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1661278 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1661881 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1660734, term1660734.getClass(), "kind", enum2970);
        setField(term1661278, term1661278.getClass(), "kind", enum2970);
        setField(term1661881, term1661881.getClass(), "kind", enum2971);
        setField(term1661278, term1661278.getClass(), "typeOfThis", term1661881);
        setField(term1660734, term1660734.getClass(), "typeOfThis", term1661278);
        term1661496 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term1661826 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1661496, term1661496.getClass(), "kind", enum2970);
        setField(term1661826, term1661826.getClass(), "kind", enum2970);
        setField(term1661826, term1661826.getClass(), "typeOfThis", term1661881);
        setField(term1661496, term1661496.getClass(), "typeOfThis", term1661826);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1661496;
        try {
            callMethod(klass, "isSubtype", argTypes, term1660734, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


