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

public class FunctionType_getLeastSupertype_418850886545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term420257;
     Object term420617;

    public FunctionType_getLeastSupertype_418850886545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term421315 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term421314 = ((Class) term421315).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term421314).setAccessible(true);
        Object enum777 = ((Field) term421314).get((Object) null);
        term420257 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term420509 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(term420257, term420257.getClass(), "kind", enum777);
        setField(term420257, term420257.getClass(), "registry", term420509);
        term420617 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term420617, term420617.getClass(), "kind", enum777);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term420617;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term420257, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


