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

public class FunctionType_isSubtype_21010021581476 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2130259;
     Object term2130921;

    public FunctionType_isSubtype_21010021581476() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2134323 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2134322 = ((Class) term2134323).getDeclaredField((String) "ORDINARY");
        ((Field) term2134322).setAccessible(true);
        Object enum3799 = ((Field) term2134322).get((Object) null);
        term2130259 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2130813 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term2130259, term2130259.getClass(), "kind", enum3799);
        setField(term2130813, term2130813.getClass(), "kind", enum3799);
        setField(term2130259, term2130259.getClass(), "typeOfThis", term2130813);
        Class<? extends Object> term2134614 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2134613 = ((Class) term2134614).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2134613).setAccessible(true);
        Object enum3800 = ((Field) term2134613).get((Object) null);
        Class<? extends Object> term2134914 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2134913 = ((Class) term2134914).getDeclaredField((String) "INTERFACE");
        ((Field) term2134913).setAccessible(true);
        Object enum3801 = ((Field) term2134913).get((Object) null);
        term2130921 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2131103 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term2130921, term2130921.getClass(), "kind", enum3800);
        setField(term2131103, term2131103.getClass(), "kind", enum3801);
        setField(term2130921, term2130921.getClass(), "typeOfThis", term2131103);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2130921;
        try {
            callMethod(klass, "isSubtype", argTypes, term2130259, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


