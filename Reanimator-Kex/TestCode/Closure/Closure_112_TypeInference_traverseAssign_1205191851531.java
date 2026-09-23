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

public class TypeInference_traverseAssign_1205191851531 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2977232;
     Object term2977302;

    public TypeInference_traverseAssign_1205191851531() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2977232 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term2977302 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2977372 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2977442 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term2977302, term2977302.getClass(), "first", term2977302);
        setField(term2977302, term2977302.getClass(), "last", term2977372);
        setIntField(term2977302, term2977302.getClass(), "type", 1072005683);
        setIntField(term2977442, term2977442.getClass(), "type", 41);
        setField(term2977302, term2977302.getClass(), "next", term2977442);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term2977302;
        args[1] = null;
        callMethod(klass, "traverseAssign", argTypes, term2977232, args);
    }

};


