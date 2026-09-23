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
import java.util.LinkedList;
import java.lang.Object;

public class NodeTraversal_traverseRoots_2057520395250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66575;
     Object term66963;

    public NodeTraversal_traverseRoots_2057520395250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term66697 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term66789 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setIntField(term66789, term66789.getClass(), "type", 0);
        setField(term66789, term66789.getClass(), "parent", null);
        setField(term66697, term66697.getClass(), "parent", term66789);
        setIntField(term66697, term66697.getClass(), "type", 132);
        term66575 = new LinkedList();
        ((LinkedList) term66575).add(term66697);
        term66963 = newInstance(Class.forName("com.google.javascript.jscomp.ExtractPrototypeMemberDeclarations$GatherExtractionInfo"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("java.util.List");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.NodeTraversal$Callback");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term66575;
        args[2] = term66963;
        callMethod(klass, "traverseRoots", argTypes, null, args);
    }

};


