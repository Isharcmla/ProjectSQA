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

public class CollapseVariableDeclarations_process_77566454743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26547;
     Object term26897;

    public CollapseVariableDeclarations_process_77566454743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term26599 = new ArrayList();
        HashSet term26647 = new HashSet();
        term26547 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations"));
        Object term26827 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term26547, term26547.getClass(), "collapses", term26599);
        setField(term26547, term26547.getClass(), "nodesToCollapse", term26647);
        setField(term26547, term26547.getClass(), "compiler", term26827);
        term26897 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term26967 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27037 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term27107 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term26897, term26897.getClass(), "type", 0);
        setField(term26897, term26897.getClass(), "parent", null);
        setField(term26967, term26967.getClass(), "next", null);
        setIntField(term26967, term26967.getClass(), "type", 0);
        setField(term27037, term27037.getClass(), "next", term27107);
        setIntField(term27037, term27037.getClass(), "type", 105);
        setField(term26967, term26967.getClass(), "first", term27037);
        setField(term26897, term26897.getClass(), "first", term26967);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term26897;
        callMethod(klass, "process", argTypes, term26547, args);
    }

};


