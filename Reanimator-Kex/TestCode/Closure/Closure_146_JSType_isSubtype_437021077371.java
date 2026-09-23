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
import java.lang.StackOverflowError;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class JSType_isSubtype_437021077371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80517;
     Object term80617;

    public JSType_isSubtype_437021077371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80517 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term80517, term80517.getClass(), "referencedType", term80517);
        term80617 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setBooleanField(term80617, term80617.getClass(), "unknown", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term80517;
        args[1] = term80617;
        try {
            callMethod(klass, "isSubtype", argTypes, null, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


