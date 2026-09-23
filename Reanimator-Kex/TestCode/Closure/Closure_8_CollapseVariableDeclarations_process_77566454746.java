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

public class CollapseVariableDeclarations_process_77566454746 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28685;
     Object term28955;

    public CollapseVariableDeclarations_process_77566454746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term28737 = new ArrayList();
        HashSet term28785 = new HashSet();
        term28685 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations"));
        setField(term28685, term28685.getClass(), "collapses", term28737);
        setField(term28685, term28685.getClass(), "nodesToCollapse", term28785);
        setField(term28685, term28685.getClass(), "compiler", null);
        term28955 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term28955, term28955.getClass(), "type", 0);
        setField(term28955, term28955.getClass(), "parent", null);
        setField(term28955, term28955.getClass(), "first", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term28955;
        callMethod(klass, "process", argTypes, term28685, args);
    }

};


