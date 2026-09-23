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

public class FunctionType_isSubtype_2101002158699 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term736390;
     Object term737042;

    public FunctionType_isSubtype_2101002158699() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term738546 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term738545 = ((Class) term738546).getDeclaredField((String) "ORDINARY");
        ((Field) term738545).setAccessible(true);
        Object enum1326 = ((Field) term738545).get((Object) null);
        Class<? extends Object> term738837 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term738836 = ((Class) term738837).getDeclaredField((String) "INTERFACE");
        ((Field) term738836).setAccessible(true);
        Object enum1327 = ((Field) term738836).get((Object) null);
        term736390 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term736934 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term736390, term736390.getClass(), "kind", enum1326);
        setField(term736934, term736934.getClass(), "kind", enum1327);
        setField(term736390, term736390.getClass(), "typeOfThis", term736934);
        term737042 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term737374 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term737042, term737042.getClass(), "kind", enum1326);
        setField(term737374, term737374.getClass(), "kind", enum1326);
        setField(term737042, term737042.getClass(), "typeOfThis", term737374);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term737042;
        try {
            callMethod(klass, "isSubtype", argTypes, term736390, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


