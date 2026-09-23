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

public class MustBeReachingVariableDef_computeMustDef_1796935056121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32906;
     Object term32998;

    public MustBeReachingVariableDef_computeMustDef_1796935056121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32906 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term32998 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term33090 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term33182 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term32998, term32998.getClass(), "type", 1265463001);
        setIntField(term33090, term33090.getClass(), "type", -2027534003);
        setIntField(term33182, term33182.getClass(), "type", 98);
        setField(term33090, term33090.getClass(), "first", term33182);
        setField(term32998, term32998.getClass(), "first", term33090);
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
        args[0] = term32998;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        try {
            callMethod(klass, "computeMustDef", argTypes, term32906, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


