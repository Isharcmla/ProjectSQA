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

public class CollapseVariableDeclarations_process_77566454731 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17797;
     Object term18015;

    public CollapseVariableDeclarations_process_77566454731() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term17849 = new ArrayList();
        ((ArrayList) term17849).add((Object)null);
        HashSet term17897 = new HashSet();
        ((HashSet) term17897).add((Object)null);
        term17797 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations"));
        setField(term17797, term17797.getClass(), "collapses", term17849);
        setField(term17797, term17797.getClass(), "nodesToCollapse", term17897);
        setField(term17797, term17797.getClass(), "compiler", null);
        term18015 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18085 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term18015, term18015.getClass(), "type", -133);
        setField(term18015, term18015.getClass(), "parent", term18085);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term18015;
        callMethod(klass, "process", argTypes, term17797, args);
    }

};


