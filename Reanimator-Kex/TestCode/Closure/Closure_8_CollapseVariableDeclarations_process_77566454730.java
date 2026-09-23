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

public class CollapseVariableDeclarations_process_77566454730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16887;
     Object term17157;

    public CollapseVariableDeclarations_process_77566454730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term16939 = new ArrayList();
        HashSet term16987 = new HashSet();
        term16887 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations"));
        setField(term16887, term16887.getClass(), "collapses", term16939);
        setField(term16887, term16887.getClass(), "nodesToCollapse", term16987);
        setField(term16887, term16887.getClass(), "compiler", null);
        term17157 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17227 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17297 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17367 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17437 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term17157, term17157.getClass(), "type", 0);
        setField(term17157, term17157.getClass(), "parent", null);
        setField(term17227, term17227.getClass(), "next", term17297);
        setIntField(term17227, term17227.getClass(), "type", 0);
        setField(term17367, term17367.getClass(), "next", null);
        setIntField(term17367, term17367.getClass(), "type", 0);
        setField(term17367, term17367.getClass(), "first", term17437);
        setField(term17227, term17227.getClass(), "first", term17367);
        setField(term17157, term17157.getClass(), "first", term17227);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term17157;
        callMethod(klass, "process", argTypes, term16887, args);
    }

};


