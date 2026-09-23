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

public class IR_forNode_18900270112954 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term560958;
     Object term561028;

    public IR_forNode_18900270112954() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term560958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term560958, term560958.getClass(), "type", 97);
        term561028 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term561028, term561028.getClass(), "type", 109);
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
        args[0] = term560958;
        args[1] = term561028;
        args[2] = null;
        args[3] = null;
        try {
            callMethod(klass, "forNode", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


