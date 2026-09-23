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

public class PeepholeFoldConstants_tryReduceOperandsForOp_1283860076147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24281;
     Object term24351;
     Object term24404;
     Object term24405;

    public PeepholeFoldConstants_tryReduceOperandsForOp_1283860076147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24281 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term24351 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term24351, term24351.getClass(), "type", 10);
        term24404 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term24404, term24404.getClass(), "currentTraversal", null);
        term24405 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term24405, term24405.getClass(), "type", 10);
        setField(term24405, term24405.getClass(), "next", null);
        setField(term24405, term24405.getClass(), "first", null);
        setField(term24405, term24405.getClass(), "last", null);
        setField(term24405, term24405.getClass(), "propListHead", null);
        setIntField(term24405, term24405.getClass(), "sourcePosition", 0);
        setField(term24405, term24405.getClass(), "jsType", null);
        setField(term24405, term24405.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term24351;
        callMethod(klass, "tryReduceOperandsForOp", argTypes, term24281, args);
        assertTrue(recursiveEquals(term24281, term24404));
        assertTrue(recursiveEquals(term24351, term24405));
    }

};


