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

public class PeepholeFoldConstants_tryReduceVoid_942546715157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26009;
     Object term26159;

    public PeepholeFoldConstants_tryReduceVoid_942546715157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26009 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term26089 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term26009, term26009.getClass(), "compiler", term26089);
        term26159 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26229 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26229, term26229.getClass(), "type", 106);
        setField(term26159, term26159.getClass(), "first", term26229);
        setIntField(term26159, term26159.getClass(), "type", 106);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term26159;
        callMethod(klass, "tryReduceVoid", argTypes, term26009, args);
    }

};


