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

public class NodeUtil_allArgsUnescapedLocal_847069128463 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113221;

    public NodeUtil_allArgsUnescapedLocal_847069128463() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113221 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term113291 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term113361 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term113361, term113361.getClass(), "type", 90);
        setField(term113291, term113291.getClass(), "next", term113361);
        setField(term113221, term113221.getClass(), "first", term113291);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term113221;
        callMethod(klass, "allArgsUnescapedLocal", argTypes, null, args);
    }

};


