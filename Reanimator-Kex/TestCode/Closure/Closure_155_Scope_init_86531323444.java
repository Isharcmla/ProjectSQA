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
import java.util.HashMap;

public class Scope_init_86531323444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4560;
     Object term4652;

    public Scope_init_86531323444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4342 = new HashMap();
        Object term4294 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term4416 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term4486 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term4294, term4294.getClass(), "vars", term4342);
        setField(term4294, term4294.getClass(), "parent", term4416);
        setField(term4294, term4294.getClass(), "rootNode", term4486);
        term4560 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term4560, term4560.getClass(), "rootNode", null);
        term4652 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Scope");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Scope");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term4560;
        args[1] = term4652;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


