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
import java.lang.Object;
import java.util.HashSet;

public class CollapseVariableDeclarations_process_77566454733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18878;
     Object term19148;

    public CollapseVariableDeclarations_process_77566454733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term18930 = new ArrayList();
        ((ArrayList) term18930).add((Object)null);
        ((ArrayList) term18930).add((Object)null);
        ((ArrayList) term18930).add((Object)null);
        ((ArrayList) term18930).add((Object)null);
        ((ArrayList) term18930).add((Object)null);
        ((ArrayList) term18930).add((Object)null);
        ((ArrayList) term18930).add((Object)null);
        ((ArrayList) term18930).add((Object)null);
        ((ArrayList) term18930).add((Object)null);
        HashSet term18978 = new HashSet();
        term18878 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations"));
        setField(term18878, term18878.getClass(), "collapses", term18930);
        setField(term18878, term18878.getClass(), "nodesToCollapse", term18978);
        setField(term18878, term18878.getClass(), "compiler", null);
        term19148 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19218 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19288 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19148, term19148.getClass(), "type", 0);
        setField(term19148, term19148.getClass(), "parent", null);
        setField(term19218, term19218.getClass(), "next", null);
        setIntField(term19218, term19218.getClass(), "type", 0);
        setField(term19288, term19288.getClass(), "next", null);
        setIntField(term19288, term19288.getClass(), "type", 132);
        setField(term19218, term19218.getClass(), "first", term19288);
        setField(term19148, term19148.getClass(), "first", term19218);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term19148;
        callMethod(klass, "process", argTypes, term18878, args);
    }

};


