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

public class PeepholeFoldConstants_tryReduceOperandsForOp_128386007698 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16569;
     Object term16639;
     Object term17018;
     Object term17019;

    public PeepholeFoldConstants_tryReduceOperandsForOp_128386007698() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16569 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term16639 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term16639, term16639.getClass(), "type", 23);
        term17018 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term17018, term17018.getClass(), "currentTraversal", null);
        term17019 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17019, term17019.getClass(), "type", 23);
        setField(term17019, term17019.getClass(), "next", null);
        setField(term17019, term17019.getClass(), "first", null);
        setField(term17019, term17019.getClass(), "last", null);
        setField(term17019, term17019.getClass(), "propListHead", null);
        setIntField(term17019, term17019.getClass(), "sourcePosition", 0);
        setField(term17019, term17019.getClass(), "jsType", null);
        setField(term17019, term17019.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term16639;
        callMethod(klass, "tryReduceOperandsForOp", argTypes, term16569, args);
        assertTrue(recursiveEquals(term16569, term17018));
        assertTrue(recursiveEquals(term16639, term17019));
    }

};


