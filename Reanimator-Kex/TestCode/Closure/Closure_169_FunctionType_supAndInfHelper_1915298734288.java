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

public class FunctionType_supAndInfHelper_1915298734288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273491;
     Object term274035;

    public FunctionType_supAndInfHelper_1915298734288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term275992 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term275991 = ((Class) term275992).getDeclaredField((String) "ORDINARY");
        ((Field) term275991).setAccessible(true);
        Object enum491 = ((Field) term275991).get((Object) null);
        term273491 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setBooleanField(term273491, term273491.getClass(), "unknown", false);
        setField(term273491, term273491.getClass(), "kind", enum491);
        Class<? extends Object> term276283 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term276282 = ((Class) term276283).getDeclaredField((String) "INTERFACE");
        ((Field) term276282).setAccessible(true);
        Object enum492 = ((Field) term276282).get((Object) null);
        term274035 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setBooleanField(term274035, term274035.getClass(), "unknown", false);
        setField(term274035, term274035.getClass(), "kind", enum492);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term274035;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term273491, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


