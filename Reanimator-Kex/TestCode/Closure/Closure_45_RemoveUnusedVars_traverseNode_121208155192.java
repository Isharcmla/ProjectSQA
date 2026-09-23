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

public class RemoveUnusedVars_traverseNode_121208155192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24560;
     Object term24652;

    public RemoveUnusedVars_traverseNode_121208155192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24560 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        term24652 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term24744 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term24652, term24652.getClass(), "type", -626131017);
        setIntField(term24744, term24744.getClass(), "type", 626131016);
        setField(term24744, term24744.getClass(), "first", term24744);
        setField(term24652, term24652.getClass(), "first", term24744);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[3];
        args[0] = term24652;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "traverseNode", argTypes, term24560, args);
    }

};


