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

public class CollapseVariableDeclarations_process_77566454735 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20125;
     Object term20365;

    public CollapseVariableDeclarations_process_77566454735() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term20177 = new ArrayList();
        HashSet term20225 = new HashSet();
        term20125 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations"));
        setField(term20125, term20125.getClass(), "collapses", term20177);
        setField(term20125, term20125.getClass(), "nodesToCollapse", term20225);
        setField(term20125, term20125.getClass(), "compiler", null);
        term20365 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term20365;
        callMethod(klass, "process", argTypes, term20125, args);
    }

};


