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
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;

public class FunctionType_hasImplementedInterfaces_1135786392267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term258039;

    public FunctionType_hasImplementedInterfaces_1135786392267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term258091 = new ArrayList();
        Class<? extends Object> term258834 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term258833 = ((Class) term258834).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term258833).setAccessible(true);
        Object enum468 = ((Field) term258833).get((Object) null);
        term258039 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term258039, term258039.getClass(), "implementedInterfaces", term258091);
        setField(term258039, term258039.getClass(), "kind", enum468);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "hasImplementedInterfaces", argTypes, term258039, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


