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

public class FunctionType_getGreatestSubtype_679591709597 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term581940;
     Object term582604;

    public FunctionType_getGreatestSubtype_679591709597() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term583794 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term583793 = ((Class) term583794).getDeclaredField((String) "INTERFACE");
        ((Field) term583793).setAccessible(true);
        Object enum904 = ((Field) term583793).get((Object) null);
        Class<? extends Object> term584088 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term584087 = ((Class) term584088).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term584087).setAccessible(true);
        Object enum905 = ((Field) term584087).get((Object) null);
        term581940 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term582494 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term581940, term581940.getClass(), "kind", enum904);
        setField(term582494, term582494.getClass(), "kind", enum905);
        setField(term581940, term581940.getClass(), "typeOfThis", term582494);
        term582604 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term582778 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term582604, term582604.getClass(), "kind", enum905);
        setField(term582604, term582604.getClass(), "typeOfThis", term582778);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term582604;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term581940, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


