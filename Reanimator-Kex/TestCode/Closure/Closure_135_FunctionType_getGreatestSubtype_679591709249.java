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

public class FunctionType_getGreatestSubtype_679591709249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123144;
     Object term123508;

    public FunctionType_getGreatestSubtype_679591709249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term124604 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term124603 = ((Class) term124604).getDeclaredField((String) "ORDINARY");
        ((Field) term124603).setAccessible(true);
        Object enum238 = ((Field) term124603).get((Object) null);
        term123144 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term123400 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        setField(term123144, term123144.getClass(), "kind", enum238);
        setField(term123144, term123144.getClass(), "typeOfThis", term123400);
        Class<? extends Object> term124895 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term124894 = ((Class) term124895).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term124894).setAccessible(true);
        Object enum239 = ((Field) term124894).get((Object) null);
        term123508 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term123508, term123508.getClass(), "kind", enum239);
        setField(term123508, term123508.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term123508;
        try {
            callMethod(klass, "getGreatestSubtype", argTypes, term123144, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


