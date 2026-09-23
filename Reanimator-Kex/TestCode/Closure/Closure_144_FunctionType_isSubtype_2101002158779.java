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

public class FunctionType_isSubtype_2101002158779 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term879218;
     Object term879870;

    public FunctionType_isSubtype_2101002158779() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term883369 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term883368 = ((Class) term883369).getDeclaredField((String) "INTERFACE");
        ((Field) term883368).setAccessible(true);
        Object enum1596 = ((Field) term883368).get((Object) null);
        Class<? extends Object> term883663 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term883662 = ((Class) term883663).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term883662).setAccessible(true);
        Object enum1597 = ((Field) term883662).get((Object) null);
        term879218 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term879762 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term879218, term879218.getClass(), "kind", enum1596);
        setField(term879762, term879762.getClass(), "kind", enum1597);
        setField(term879218, term879218.getClass(), "typeOfThis", term879762);
        term879870 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term880202 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term879870, term879870.getClass(), "kind", enum1596);
        setField(term880202, term880202.getClass(), "kind", enum1596);
        setField(term879870, term879870.getClass(), "typeOfThis", term880202);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term879870;
        try {
            callMethod(klass, "isSubtype", argTypes, term879218, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


