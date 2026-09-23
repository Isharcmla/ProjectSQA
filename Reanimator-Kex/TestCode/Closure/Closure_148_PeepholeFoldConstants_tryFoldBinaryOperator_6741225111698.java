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

public class PeepholeFoldConstants_tryFoldBinaryOperator_6741225111698 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term437945;
     Object term438031;

    public PeepholeFoldConstants_tryFoldBinaryOperator_6741225111698() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term437945 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term438031 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term438117 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term438207 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        Object term438277 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term438207, term438207.getClass(), "type", 63);
        setField(term438117, term438117.getClass(), "next", term438207);
        setIntField(term438117, term438117.getClass(), "type", 0);
        setField(term438031, term438031.getClass(), "first", term438117);
        setIntField(term438031, term438031.getClass(), "type", 101);
        setIntField(term438277, term438277.getClass(), "type", 108);
        setField(term438031, term438031.getClass(), "parent", term438277);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term438031;
        try {
            callMethod(klass, "tryFoldBinaryOperator", argTypes, term437945, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


