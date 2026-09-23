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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.ArrayDeque;

public class ControlFlowAnalysis_prioritizeFromEntryNode_161624115644 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176;

    public ControlFlowAnalysis_prioritizeFromEntryNode_161624115644() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term178 = new HashMap();
        Object term187 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term187, term187.getClass(), "elementData", null);
        setIntField(term187, term187.getClass(), "size", 493620644);
        setIntField(term187, term187.getClass(), "modCount", 1328271830);
        Object term190 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term190, term190.getClass(), "elementData", null);
        setIntField(term190, term190.getClass(), "size", 1596070772);
        setIntField(term190, term190.getClass(), "modCount", 97029295);
        ArrayDeque term185 = new ArrayDeque();
        ((ArrayDeque) term185).add(term187);
        ((ArrayDeque) term185).add(term190);
        Object term197 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term197, term197.getClass(), "elementData", null);
        setIntField(term197, term197.getClass(), "size", -1371869594);
        setIntField(term197, term197.getClass(), "modCount", -2095575670);
        Object term200 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term200, term200.getClass(), "elementData", null);
        setIntField(term200, term200.getClass(), "size", 1225272962);
        setIntField(term200, term200.getClass(), "modCount", 1324040357);
        ArrayDeque term195 = new ArrayDeque();
        ((ArrayDeque) term195).add(term197);
        ((ArrayDeque) term195).add(term200);
        HashMap term205 = new HashMap();
        HashMap term218 = new HashMap();
        term176 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis"));
        Object term177 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowGraph"));
        setField(term176, term176.getClass(), "compiler", null);
        setField(term177, term177.getClass(), "implicitReturn", null);
        setField(term177, term177.getClass(), "entry", null);
        setField(term177, term177.getClass(), "nodes", term178);
        setBooleanField(term177, term177.getClass(), "useNodeAnnotations", true);
        setBooleanField(term177, term177.getClass(), "useEdgeAnnotations", true);
        setField(term177, term177.getClass(), "nodeAnnotationStack", term185);
        setField(term177, term177.getClass(), "edgeAnnotationStack", term195);
        setField(term176, term176.getClass(), "cfg", term177);
        setField(term176, term176.getClass(), "astPosition", term205);
        setField(term176, term176.getClass(), "nodePriorities", term218);
        setField(term176, term176.getClass(), "priorityComparator", null);
        setIntField(term176, term176.getClass(), "astPositionCounter", 0);
        setIntField(term176, term176.getClass(), "priorityCounter", 0);
        setBooleanField(term176, term176.getClass(), "shouldTraverseFunctions", false);
        setBooleanField(term176, term176.getClass(), "edgeAnnotations", false);
        setField(term176, term176.getClass(), "root", null);
        setField(term176, term176.getClass(), "exceptionHandler", null);
        setField(term176, term176.getClass(), "finallyMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.graph.DiGraph$DiGraphNode");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "prioritizeFromEntryNode", argTypes, term176, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


