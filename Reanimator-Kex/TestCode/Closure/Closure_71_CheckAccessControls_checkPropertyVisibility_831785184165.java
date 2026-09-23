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
import java.lang.Object;

public class CheckAccessControls_checkPropertyVisibility_831785184165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45019;
     Object term45089;

    public CheckAccessControls_checkPropertyVisibility_831785184165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45019 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term45089 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45199 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term45089, term45089.getClass(), "first", term45089);
        setField(term45089, term45089.getClass(), "jsType", term45199);
        setField(term45089, term45089.getClass(), "last", term45089);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term45089;
        args[2] = null;
        try {
            callMethod(klass, "checkPropertyVisibility", argTypes, term45019, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


