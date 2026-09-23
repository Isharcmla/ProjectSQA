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

public class PeepholeFoldConstants_tryReduceVoid_942546715115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15673;
     Object term15823;

    public PeepholeFoldConstants_tryReduceVoid_942546715115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15673 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Object term15753 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term15673, term15673.getClass(), "compiler", term15753);
        term15823 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15893 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15893, term15893.getClass(), "type", 141);
        setField(term15823, term15823.getClass(), "first", term15893);
        setIntField(term15823, term15823.getClass(), "type", 141);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term15823;
        callMethod(klass, "tryReduceVoid", argTypes, term15673, args);
    }

};


