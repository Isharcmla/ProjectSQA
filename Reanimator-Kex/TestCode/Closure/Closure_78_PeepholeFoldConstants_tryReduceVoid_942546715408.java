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
import java.lang.Object;

public class PeepholeFoldConstants_tryReduceVoid_942546715408 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term882299;
     Object term882539;

    public PeepholeFoldConstants_tryReduceVoid_942546715408() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term882299 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term882389 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        Object term882469 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term882389, term882389.getClass(), "compiler", term882469);
        setField(term882299, term882299.getClass(), "currentTraversal", term882389);
        term882539 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term882609 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term882609, term882609.getClass(), "type", 93);
        setField(term882539, term882539.getClass(), "first", term882609);
        setIntField(term882539, term882539.getClass(), "type", 93);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term882539;
        callMethod(klass, "tryReduceVoid", argTypes, term882299, args);
    }

};


