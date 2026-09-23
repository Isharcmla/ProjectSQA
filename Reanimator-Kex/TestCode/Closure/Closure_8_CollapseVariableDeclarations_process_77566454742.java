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

public class CollapseVariableDeclarations_process_77566454742 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25611;
     Object term26035;

    public CollapseVariableDeclarations_process_77566454742() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term25663 = new ArrayList();
        HashSet term25711 = new HashSet();
        term25611 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations"));
        Object term25943 = newInstance(Class.forName("com.google.javascript.jscomp.Compiler"));
        setField(term25611, term25611.getClass(), "collapses", term25663);
        setField(term25611, term25611.getClass(), "nodesToCollapse", term25711);
        setField(term25611, term25611.getClass(), "compiler", term25943);
        term26035 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term26127 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term26035, term26035.getClass(), "type", 0);
        setField(term26035, term26035.getClass(), "parent", null);
        setField(term26035, term26035.getClass(), "first", term26127);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseVariableDeclarations");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term26035;
        callMethod(klass, "process", argTypes, term25611, args);
    }

};


