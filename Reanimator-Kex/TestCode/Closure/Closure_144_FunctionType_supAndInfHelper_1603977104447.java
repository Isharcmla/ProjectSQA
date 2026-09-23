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

public class FunctionType_supAndInfHelper_1603977104447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term363634;
     Object term364312;

    public FunctionType_supAndInfHelper_1603977104447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term365168 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term365167 = ((Class) term365168).getDeclaredField((String) "INTERFACE");
        ((Field) term365167).setAccessible(true);
        Object enum662 = ((Field) term365167).get((Object) null);
        term363634 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term364202 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term363634, term363634.getClass(), "kind", enum662);
        setField(term363634, term363634.getClass(), "typeOfThis", term364202);
        term364312 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term364312, term364312.getClass(), "kind", enum662);
        setField(term364312, term364312.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term364312;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term363634, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


