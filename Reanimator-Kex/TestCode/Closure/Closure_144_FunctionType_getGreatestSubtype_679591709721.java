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

public class FunctionType_getGreatestSubtype_679591709721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term775221;
     Object term775697;

    public FunctionType_getGreatestSubtype_679591709721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term777204 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term777203 = ((Class) term777204).getDeclaredField((String) "ORDINARY");
        ((Field) term777203).setAccessible(true);
        Object enum1397 = ((Field) term777203).get((Object) null);
        term775221 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term775479 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term775587 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term775221, term775221.getClass(), "kind", enum1397);
        setField(term775479, term775479.getClass(), "kind", enum1397);
        setField(term775479, term775479.getClass(), "typeOfThis", term775587);
        setField(term775221, term775221.getClass(), "typeOfThis", term775479);
        Class<? extends Object> term777495 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term777494 = ((Class) term777495).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term777494).setAccessible(true);
        Object enum1398 = ((Field) term777494).get((Object) null);
        term775697 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term775879 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term776127 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term775697, term775697.getClass(), "kind", enum1397);
        setField(term775879, term775879.getClass(), "kind", enum1398);
        setField(term775879, term775879.getClass(), "typeOfThis", term776127);
        setField(term775697, term775697.getClass(), "typeOfThis", term775879);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term775697;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term775221, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


