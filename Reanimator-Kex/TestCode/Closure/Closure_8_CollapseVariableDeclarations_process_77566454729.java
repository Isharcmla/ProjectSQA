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

public class CollapseVariableDeclarations_process_77566454729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16015;
     Object term16307;

    public CollapseVariableDeclarations_process_77566454729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term16067 = new ArrayList();
        HashSet term16115 = new HashSet();
        term16015 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations"));
        setField(term16015, term16015.getClass(), "collapses", term16067);
        setField(term16015, term16015.getClass(), "nodesToCollapse", term16115);
        setField(term16015, term16015.getClass(), "compiler", null);
        term16307 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term16399 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term16469 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16561 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term16307, term16307.getClass(), "type", 0);
        setField(term16307, term16307.getClass(), "parent", null);
        setField(term16399, term16399.getClass(), "next", term16469);
        setIntField(term16399, term16399.getClass(), "type", 0);
        setField(term16399, term16399.getClass(), "first", term16561);
        setField(term16307, term16307.getClass(), "first", term16399);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term16307;
        callMethod(klass, "process", argTypes, term16015, args);
    }

};


