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

public class RemoveUnusedVars_traverseNode_1212081551101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27844;
     Object term27936;

    public RemoveUnusedVars_traverseNode_1212081551101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27844 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        term27936 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term28028 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term27936, term27936.getClass(), "type", -620890193);
        setIntField(term28028, term28028.getClass(), "type", 620890192);
        setField(term28028, term28028.getClass(), "first", term28028);
        setField(term27936, term27936.getClass(), "first", term28028);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[3];
        args[0] = term27936;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "traverseNode", argTypes, term27844, args);
    }

};


