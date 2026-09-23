package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class IR_forNode_18900270112845 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term536956;
     Object term537026;
     Object term537096;

    public IR_forNode_18900270112845() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term536956 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term536956, term536956.getClass(), "type", 64);
        term537026 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term537026, term537026.getClass(), "type", 105);
        term537096 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term537096, term537096.getClass(), "type", 56);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[4];
        args[0] = term536956;
        args[1] = term537026;
        args[2] = term537096;
        args[3] = null;
        try {
            callMethod(klass, "forNode", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


