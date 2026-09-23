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

public class FunctionType_getGreatestSubtype_679591709529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term468479;
     Object term468955;

    public FunctionType_getGreatestSubtype_679591709529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term470353 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term470352 = ((Class) term470353).getDeclaredField((String) "ORDINARY");
        ((Field) term470352).setAccessible(true);
        Object enum856 = ((Field) term470352).get((Object) null);
        term468479 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term468737 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term468845 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term468479, term468479.getClass(), "kind", enum856);
        setField(term468737, term468737.getClass(), "kind", enum856);
        setField(term468737, term468737.getClass(), "typeOfThis", term468845);
        setField(term468479, term468479.getClass(), "typeOfThis", term468737);
        Class<? extends Object> term470644 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term470643 = ((Class) term470644).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term470643).setAccessible(true);
        Object enum857 = ((Field) term470643).get((Object) null);
        term468955 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term469129 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term468955, term468955.getClass(), "kind", enum856);
        setField(term469129, term469129.getClass(), "kind", enum857);
        setField(term469129, term469129.getClass(), "typeOfThis", null);
        setField(term468955, term468955.getClass(), "typeOfThis", term469129);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term468955;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term468479, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


