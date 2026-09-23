package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class TypeCheck_hasUnknownOrEmptySupertype_59657982492 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149845;

    public TypeCheck_hasUnknownOrEmptySupertype_59657982492() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term150892 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term150891 = ((Class) term150892).getDeclaredField((String) "INTERFACE");
        ((Field) term150891).setAccessible(true);
        Object enum25 = ((Field) term150891).get((Object) null);
        term149845 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term149845, term149845.getClass(), "kind", enum25);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Object[] args = new Object[1];
        args[0] = term149845;
        try {
            callMethod(klass, "hasUnknownOrEmptySupertype", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


