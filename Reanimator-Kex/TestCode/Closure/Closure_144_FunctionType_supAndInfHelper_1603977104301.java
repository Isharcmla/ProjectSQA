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

public class FunctionType_supAndInfHelper_1603977104301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term189591;
     Object term190269;

    public FunctionType_supAndInfHelper_1603977104301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term191123 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term191122 = ((Class) term191123).getDeclaredField((String) "INTERFACE");
        ((Field) term191122).setAccessible(true);
        Object enum363 = ((Field) term191122).get((Object) null);
        term189591 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term190159 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term189591, term189591.getClass(), "kind", enum363);
        setField(term189591, term189591.getClass(), "typeOfThis", term190159);
        term190269 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term190269, term190269.getClass(), "kind", enum363);
        setField(term190269, term190269.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term190269;
        args[1] = false;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term189591, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


