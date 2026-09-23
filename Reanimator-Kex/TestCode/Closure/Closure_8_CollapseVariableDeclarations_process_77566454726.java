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

public class CollapseVariableDeclarations_process_77566454726 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13973;
     Object term14295;

    public CollapseVariableDeclarations_process_77566454726() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term14025 = new ArrayList();
        HashSet term14073 = new HashSet();
        term13973 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations"));
        setField(term13973, term13973.getClass(), "collapses", term14025);
        setField(term13973, term13973.getClass(), "nodesToCollapse", term14073);
        setField(term13973, term13973.getClass(), "compiler", null);
        term14295 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14365 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14295, term14295.getClass(), "type", 0);
        setField(term14295, term14295.getClass(), "parent", null);
        setField(term14365, term14365.getClass(), "next", null);
        setIntField(term14365, term14365.getClass(), "type", 0);
        setField(term14365, term14365.getClass(), "first", null);
        setField(term14295, term14295.getClass(), "first", term14365);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term14295;
        callMethod(klass, "process", argTypes, term13973, args);
    }

};


