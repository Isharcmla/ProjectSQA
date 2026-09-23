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

public class FoldConstants_tryFoldBlock_1167048042437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130870;
     Object term130940;

    public FoldConstants_tryFoldBlock_1167048042437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term130870 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        term130940 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term131010 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term131080 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term131010, term131010.getClass(), "next", term130940);
        setIntField(term131010, term131010.getClass(), "type", 31);
        setField(term130940, term130940.getClass(), "first", term131010);
        setField(term130940, term130940.getClass(), "next", term131080);
        setIntField(term130940, term130940.getClass(), "type", 127);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term130940;
        args[2] = null;
        callMethod(klass, "tryFoldBlock", argTypes, term130870, args);
    }

};


