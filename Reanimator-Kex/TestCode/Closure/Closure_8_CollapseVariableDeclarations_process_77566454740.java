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
import java.util.ArrayList;
import java.util.HashSet;
import java.lang.Object;

public class CollapseVariableDeclarations_process_77566454740 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24144;
     Object term24546;

    public CollapseVariableDeclarations_process_77566454740() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term24196 = new ArrayList();
        HashSet term24244 = new HashSet();
        term24144 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations"));
        Object term24476 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term24144, term24144.getClass(), "collapses", term24196);
        setField(term24144, term24144.getClass(), "nodesToCollapse", term24244);
        setField(term24144, term24144.getClass(), "compiler", term24476);
        term24546 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24616 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24686 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term24546, term24546.getClass(), "type", 0);
        setField(term24546, term24546.getClass(), "parent", null);
        setField(term24616, term24616.getClass(), "next", null);
        setIntField(term24616, term24616.getClass(), "type", 0);
        setField(term24686, term24686.getClass(), "next", null);
        setIntField(term24686, term24686.getClass(), "type", 118);
        setField(term24686, term24686.getClass(), "first", null);
        setField(term24616, term24616.getClass(), "first", term24686);
        setField(term24546, term24546.getClass(), "first", term24616);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term24546;
        callMethod(klass, "process", argTypes, term24144, args);
    }

};


