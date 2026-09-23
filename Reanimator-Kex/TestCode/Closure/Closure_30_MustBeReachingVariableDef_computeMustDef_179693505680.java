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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MustBeReachingVariableDef_computeMustDef_179693505680 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20705;
     Object term20797;

    public MustBeReachingVariableDef_computeMustDef_179693505680() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20705 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term20797 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term20889 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term20981 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term21073 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term20797, term20797.getClass(), "type", 1265463001);
        setIntField(term20889, term20889.getClass(), "type", -2027534003);
        setIntField(term20981, term20981.getClass(), "type", 1375330971);
        setField(term20981, term20981.getClass(), "first", null);
        setField(term20981, term20981.getClass(), "next", null);
        setField(term20889, term20889.getClass(), "first", term20981);
        setIntField(term21073, term21073.getClass(), "type", 115);
        setField(term20889, term20889.getClass(), "next", term21073);
        setField(term20797, term20797.getClass(), "first", term20889);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$MustDef");
        argTypes[3] = boolean.class;
        Object[] args = new Object[4];
        args[0] = term20797;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        try {
            callMethod(klass, "computeMustDef", argTypes, term20705, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


