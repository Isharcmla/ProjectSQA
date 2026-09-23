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

public class FunctionType_getGreatestSubtype_679591709751 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term825446;
     Object term825704;

    public FunctionType_getGreatestSubtype_679591709751() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term826992 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term826991 = ((Class) term826992).getDeclaredField((String) "ORDINARY");
        ((Field) term826991).setAccessible(true);
        Object enum1492 = ((Field) term826991).get((Object) null);
        term825446 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term825446, term825446.getClass(), "kind", enum1492);
        setField(term825446, term825446.getClass(), "typeOfThis", term825446);
        Class<? extends Object> term827283 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term827282 = ((Class) term827283).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term827282).setAccessible(true);
        Object enum1493 = ((Field) term827282).get((Object) null);
        term825704 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term825952 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term825704, term825704.getClass(), "kind", enum1493);
        setField(term825952, term825952.getClass(), "kind", enum1493);
        setField(term825952, term825952.getClass(), "typeOfThis", null);
        setField(term825704, term825704.getClass(), "typeOfThis", term825952);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term825704;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term825446, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


