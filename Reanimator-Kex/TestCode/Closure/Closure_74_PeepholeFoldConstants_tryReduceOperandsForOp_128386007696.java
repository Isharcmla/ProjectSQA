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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;

public class PeepholeFoldConstants_tryReduceOperandsForOp_128386007696 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17407;
     Object term17477;
     Object term17781;
     Object term17782;

    public PeepholeFoldConstants_tryReduceOperandsForOp_128386007696() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17407 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term17477 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17477, term17477.getClass(), "type", 20);
        term17781 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term17781, term17781.getClass(), "currentTraversal", null);
        term17782 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17782, term17782.getClass(), "type", 20);
        setField(term17782, term17782.getClass(), "next", null);
        setField(term17782, term17782.getClass(), "first", null);
        setField(term17782, term17782.getClass(), "last", null);
        setField(term17782, term17782.getClass(), "propListHead", null);
        setIntField(term17782, term17782.getClass(), "sourcePosition", 0);
        setField(term17782, term17782.getClass(), "jsType", null);
        setField(term17782, term17782.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term17477;
        callMethod(klass, "tryReduceOperandsForOp", argTypes, term17407, args);
        assertTrue(recursiveEquals(term17407, term17781));
        assertTrue(recursiveEquals(term17477, term17782));
    }

};


