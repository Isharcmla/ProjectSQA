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

public class FunctionType_getLeastSupertype_4188508861297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1625765;
     Object term1626413;

    public FunctionType_getLeastSupertype_4188508861297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1630206 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1630205 = ((Class) term1630206).getDeclaredField((String) "INTERFACE");
        ((Field) term1630205).setAccessible(true);
        Object enum3036 = ((Field) term1630205).get((Object) null);
        term1625765 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1626305 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term1625765, term1625765.getClass(), "kind", enum3036);
        setField(term1625765, term1625765.getClass(), "typeOfThis", term1626305);
        Class<? extends Object> term1630500 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1630499 = ((Class) term1630500).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1630499).setAccessible(true);
        Object enum3037 = ((Field) term1630499).get((Object) null);
        term1626413 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1626413, term1626413.getClass(), "kind", enum3037);
        setField(term1626413, term1626413.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1626413;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term1625765, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


