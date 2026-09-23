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

public class CollapseVariableDeclarations_process_77566454745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28031;
     Object term28301;

    public CollapseVariableDeclarations_process_77566454745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term28083 = new ArrayList();
        HashSet term28131 = new HashSet();
        term28031 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations"));
        setField(term28031, term28031.getClass(), "collapses", term28083);
        setField(term28031, term28031.getClass(), "nodesToCollapse", term28131);
        setField(term28031, term28031.getClass(), "compiler", null);
        term28301 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28393 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term28301, term28301.getClass(), "type", 0);
        setField(term28301, term28301.getClass(), "parent", null);
        setField(term28301, term28301.getClass(), "first", term28393);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term28301;
        callMethod(klass, "process", argTypes, term28031, args);
    }

};


