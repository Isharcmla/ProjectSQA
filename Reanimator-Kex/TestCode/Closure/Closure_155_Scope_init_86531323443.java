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

public class Scope_init_86531323443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4087;
     Object term4173;

    public Scope_init_86531323443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term3869 = new HashMap();
        Object term3821 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term3943 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term4013 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term3821, term3821.getClass(), "vars", term3869);
        setField(term3821, term3821.getClass(), "parent", term3943);
        setField(term3821, term3821.getClass(), "rootNode", term4013);
        term4087 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term4087, term4087.getClass(), "rootNode", null);
        term4173 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Scope");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Scope");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term4087;
        args[1] = term4173;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


