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

public class CollapseVariableDeclarations_process_77566454748 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30131;
     Object term30401;

    public CollapseVariableDeclarations_process_77566454748() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term30183 = new ArrayList();
        HashSet term30231 = new HashSet();
        term30131 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations"));
        setField(term30131, term30131.getClass(), "collapses", term30183);
        setField(term30131, term30131.getClass(), "nodesToCollapse", term30231);
        setField(term30131, term30131.getClass(), "compiler", null);
        term30401 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30471 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30401, term30401.getClass(), "type", 0);
        setField(term30401, term30401.getClass(), "parent", null);
        setField(term30471, term30471.getClass(), "next", null);
        setIntField(term30471, term30471.getClass(), "type", 132);
        setField(term30401, term30401.getClass(), "first", term30471);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term30401;
        callMethod(klass, "process", argTypes, term30131, args);
    }

};


