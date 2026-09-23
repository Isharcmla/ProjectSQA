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

public class FunctionType_isSubtype_2101002158557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term507395;
     Object term508037;

    public FunctionType_isSubtype_2101002158557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term511799 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term511798 = ((Class) term511799).getDeclaredField((String) "INTERFACE");
        ((Field) term511798).setAccessible(true);
        Object enum932 = ((Field) term511798).get((Object) null);
        term507395 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term507927 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term507395, term507395.getClass(), "kind", enum932);
        setField(term507395, term507395.getClass(), "typeOfThis", term507927);
        Class<? extends Object> term512093 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term512092 = ((Class) term512093).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term512092).setAccessible(true);
        Object enum933 = ((Field) term512092).get((Object) null);
        term508037 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term508037, term508037.getClass(), "kind", enum933);
        setField(term508037, term508037.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term508037;
        try {
            callMethod(klass, "isSubtype", argTypes, term507395, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


