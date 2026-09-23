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

public class PeepholeFoldConstants_tryReduceVoid_942546715190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30468;
     Object term30628;

    public PeepholeFoldConstants_tryReduceVoid_942546715190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30468 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term30558 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term30558, term30558.getClass(), "compiler", null);
        setField(term30468, term30468.getClass(), "currentTraversal", term30558);
        term30628 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30698 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30698, term30698.getClass(), "type", 89);
        setField(term30628, term30628.getClass(), "first", term30698);
        setIntField(term30628, term30628.getClass(), "type", 89);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term30628;
        try {
            callMethod(klass, "tryReduceVoid", argTypes, term30468, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


