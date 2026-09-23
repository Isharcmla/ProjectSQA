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

public class PeepholeFoldConstants_tryReduceOperandsForOp_1283860076115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20790;
     Object term20860;
     Object term20867;
     Object term20868;

    public PeepholeFoldConstants_tryReduceOperandsForOp_1283860076115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20790 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term20860 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20860, term20860.getClass(), "type", 25);
        term20867 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term20867, term20867.getClass(), "currentTraversal", null);
        term20868 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term20868, term20868.getClass(), "type", 25);
        setField(term20868, term20868.getClass(), "next", null);
        setField(term20868, term20868.getClass(), "first", null);
        setField(term20868, term20868.getClass(), "last", null);
        setField(term20868, term20868.getClass(), "propListHead", null);
        setIntField(term20868, term20868.getClass(), "sourcePosition", 0);
        setField(term20868, term20868.getClass(), "jsType", null);
        setField(term20868, term20868.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term20860;
        callMethod(klass, "tryReduceOperandsForOp", argTypes, term20790, args);
        assertTrue(recursiveEquals(term20790, term20867));
        assertTrue(recursiveEquals(term20860, term20868));
    }

};


