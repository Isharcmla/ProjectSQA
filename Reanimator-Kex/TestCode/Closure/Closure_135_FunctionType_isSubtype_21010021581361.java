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

public class FunctionType_isSubtype_21010021581361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1735653;
     Object term1736405;

    public FunctionType_isSubtype_21010021581361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1738396 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1738395 = ((Class) term1738396).getDeclaredField((String) "ORDINARY");
        ((Field) term1738395).setAccessible(true);
        Object enum3239 = ((Field) term1738395).get((Object) null);
        term1735653 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1736197 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1736297 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term1735653, term1735653.getClass(), "kind", enum3239);
        setField(term1736197, term1736197.getClass(), "kind", enum3239);
        setField(term1736297, term1736297.getClass(), "kind", enum3239);
        setField(term1736197, term1736197.getClass(), "typeOfThis", term1736297);
        setField(term1735653, term1735653.getClass(), "typeOfThis", term1736197);
        Class<? extends Object> term1738687 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1738686 = ((Class) term1738687).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1738686).setAccessible(true);
        Object enum3240 = ((Field) term1738686).get((Object) null);
        Class<? extends Object> term1738987 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1738986 = ((Class) term1738987).getDeclaredField((String) "INTERFACE");
        ((Field) term1738986).setAccessible(true);
        Object enum3241 = ((Field) term1738986).get((Object) null);
        term1736405 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1736587 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1736843 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1736405, term1736405.getClass(), "kind", enum3240);
        setField(term1736587, term1736587.getClass(), "kind", enum3239);
        setField(term1736843, term1736843.getClass(), "kind", enum3241);
        setField(term1736587, term1736587.getClass(), "typeOfThis", term1736843);
        setField(term1736405, term1736405.getClass(), "typeOfThis", term1736587);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1736405;
        try {
            callMethod(klass, "isSubtype", argTypes, term1735653, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


