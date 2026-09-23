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

public class FunctionType_isSubtype_2101002158413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term317464;
     Object term317822;

    public FunctionType_isSubtype_2101002158413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term318966 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term318965 = ((Class) term318966).getDeclaredField((String) "ORDINARY");
        ((Field) term318965).setAccessible(true);
        Object enum578 = ((Field) term318965).get((Object) null);
        term317464 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term317712 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term317464, term317464.getClass(), "kind", enum578);
        setField(term317464, term317464.getClass(), "typeOfThis", term317712);
        Class<? extends Object> term319257 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term319256 = ((Class) term319257).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term319256).setAccessible(true);
        Object enum579 = ((Field) term319256).get((Object) null);
        term317822 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term317822, term317822.getClass(), "kind", enum579);
        setField(term317822, term317822.getClass(), "typeOfThis", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term317822;
        try {
            callMethod(klass, "isSubtype", argTypes, term317464, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


