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

public class PeepholeFoldConstants_tryReduceVoid_942546715246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39612;
     Object term39772;

    public PeepholeFoldConstants_tryReduceVoid_942546715246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39612 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term39702 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        setField(term39702, term39702.getClass(), "compiler", null);
        setField(term39612, term39612.getClass(), "currentTraversal", term39702);
        term39772 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39842 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term39842, term39842.getClass(), "type", 91);
        setField(term39772, term39772.getClass(), "first", term39842);
        setIntField(term39772, term39772.getClass(), "type", 91);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term39772;
        try {
            callMethod(klass, "tryReduceVoid", argTypes, term39612, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


