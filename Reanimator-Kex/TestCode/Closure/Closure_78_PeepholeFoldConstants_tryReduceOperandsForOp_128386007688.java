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

public class PeepholeFoldConstants_tryReduceOperandsForOp_128386007688 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15181;
     Object term15251;
     Object term15553;
     Object term15554;

    public PeepholeFoldConstants_tryReduceOperandsForOp_128386007688() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15181 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term15251 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15251, term15251.getClass(), "type", 29);
        term15553 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term15553, term15553.getClass(), "currentTraversal", null);
        term15554 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15554, term15554.getClass(), "type", 29);
        setField(term15554, term15554.getClass(), "next", null);
        setField(term15554, term15554.getClass(), "first", null);
        setField(term15554, term15554.getClass(), "last", null);
        setField(term15554, term15554.getClass(), "propListHead", null);
        setIntField(term15554, term15554.getClass(), "sourcePosition", 0);
        setField(term15554, term15554.getClass(), "jsType", null);
        setField(term15554, term15554.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term15251;
        callMethod(klass, "tryReduceOperandsForOp", argTypes, term15181, args);
        assertTrue(recursiveEquals(term15181, term15553));
        assertTrue(recursiveEquals(term15251, term15554));
    }

};


