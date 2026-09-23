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

public class FunctionType_hasUnknownSupertype_259494629184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96235;

    public FunctionType_hasUnknownSupertype_259494629184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term97885 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term97884 = ((Class) term97885).getDeclaredField((String) "INTERFACE");
        ((Field) term97884).setAccessible(true);
        Object enum202 = ((Field) term97884).get((Object) null);
        term96235 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term96235, term96235.getClass(), "kind", enum202);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "hasUnknownSupertype", argTypes, term96235, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


