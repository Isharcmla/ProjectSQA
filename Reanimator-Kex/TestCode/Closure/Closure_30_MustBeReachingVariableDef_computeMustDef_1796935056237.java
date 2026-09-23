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

public class MustBeReachingVariableDef_computeMustDef_1796935056237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term296574;
     Object term296644;

    public MustBeReachingVariableDef_computeMustDef_1796935056237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term296574 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        term296644 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term296714 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term296784 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term296854 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term296924 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term296994 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term297064 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term297134 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term297204 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term297274 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term297344 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term297414 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term297484 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term297554 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term297624 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term297694 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term297764 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term297834 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term297904 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term297974 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term298044 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term298114 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term298184 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term298254 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term298324 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term296644, term296644.getClass(), "type", 1265463001);
        setIntField(term296714, term296714.getClass(), "type", 123);
        setIntField(term296784, term296784.getClass(), "type", 123);
        setIntField(term296854, term296854.getClass(), "type", 123);
        setIntField(term296924, term296924.getClass(), "type", 123);
        setIntField(term296994, term296994.getClass(), "type", 123);
        setIntField(term297064, term297064.getClass(), "type", 123);
        setIntField(term297134, term297134.getClass(), "type", 123);
        setIntField(term297204, term297204.getClass(), "type", 123);
        setIntField(term297274, term297274.getClass(), "type", 123);
        setIntField(term297344, term297344.getClass(), "type", 123);
        setIntField(term297414, term297414.getClass(), "type", 123);
        setIntField(term297484, term297484.getClass(), "type", 123);
        setIntField(term297554, term297554.getClass(), "type", 123);
        setIntField(term297624, term297624.getClass(), "type", 123);
        setIntField(term297694, term297694.getClass(), "type", 123);
        setIntField(term297764, term297764.getClass(), "type", 123);
        setIntField(term297834, term297834.getClass(), "type", 123);
        setIntField(term297904, term297904.getClass(), "type", 123);
        setIntField(term297974, term297974.getClass(), "type", 123);
        setIntField(term298044, term298044.getClass(), "type", 123);
        setIntField(term298114, term298114.getClass(), "type", 123);
        setIntField(term298184, term298184.getClass(), "type", 123);
        setIntField(term298254, term298254.getClass(), "type", 123);
        setIntField(term298324, term298324.getClass(), "type", 101);
        setField(term298254, term298254.getClass(), "first", term298324);
        setField(term298184, term298184.getClass(), "first", term298254);
        setField(term298114, term298114.getClass(), "first", term298184);
        setField(term298044, term298044.getClass(), "first", term298114);
        setField(term297974, term297974.getClass(), "first", term298044);
        setField(term297904, term297904.getClass(), "first", term297974);
        setField(term297834, term297834.getClass(), "first", term297904);
        setField(term297764, term297764.getClass(), "first", term297834);
        setField(term297694, term297694.getClass(), "first", term297764);
        setField(term297624, term297624.getClass(), "first", term297694);
        setField(term297554, term297554.getClass(), "first", term297624);
        setField(term297484, term297484.getClass(), "first", term297554);
        setField(term297414, term297414.getClass(), "first", term297484);
        setField(term297344, term297344.getClass(), "first", term297414);
        setField(term297274, term297274.getClass(), "first", term297344);
        setField(term297204, term297204.getClass(), "first", term297274);
        setField(term297134, term297134.getClass(), "first", term297204);
        setField(term297064, term297064.getClass(), "first", term297134);
        setField(term296994, term296994.getClass(), "first", term297064);
        setField(term296924, term296924.getClass(), "first", term296994);
        setField(term296854, term296854.getClass(), "first", term296924);
        setField(term296784, term296784.getClass(), "first", term296854);
        setField(term296714, term296714.getClass(), "first", term296784);
        setField(term296644, term296644.getClass(), "first", term296714);
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
        args[0] = term296644;
        args[1] = null;
        args[2] = null;
        args[3] = false;
        try {
            callMethod(klass, "computeMustDef", argTypes, term296574, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


