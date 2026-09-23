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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FunctionType_setPrototypeNoCheck_1402626902482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term443158;
     Object term443482;

    public FunctionType_setPrototypeNoCheck_1402626902482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term443158 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term443272 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term443532 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term443272, term443272.getClass(), "type", term443532);
        setField(term443158, term443158.getClass(), "prototypeSlot", term443272);
        setField(term443158, term443158.getClass(), "source", null);
        term443482 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term443482, term443482.getClass(), "ownerFunction", term443532);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term443482;
        args[1] = null;
        try {
            callMethod(klass, "setPrototypeNoCheck", argTypes, term443158, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


