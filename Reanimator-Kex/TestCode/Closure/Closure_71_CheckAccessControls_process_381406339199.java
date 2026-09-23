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
import java.lang.RuntimeException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CheckAccessControls_process_381406339199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55104;
     Object term55254;

    public CheckAccessControls_process_381406339199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55104 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        Object term55184 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term55104, term55104.getClass(), "compiler", term55184);
        term55254 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term55324 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term55436 = newInstance(Class.forName("com.google.javascript.rhino.jstype.InstanceObjectType"));
        setIntField(term55254, term55254.getClass(), "type", 30);
        setField(term55324, term55324.getClass(), "next", null);
        setIntField(term55324, term55324.getClass(), "type", 0);
        setField(term55324, term55324.getClass(), "first", null);
        setField(term55254, term55254.getClass(), "first", term55324);
        setField(term55254, term55254.getClass(), "jsType", term55436);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term55254;
        try {
            callMethod(klass, "process", argTypes, term55104, args);
            assertTrue(false);
        }
        catch (RuntimeException e) {
        }

    }

};


