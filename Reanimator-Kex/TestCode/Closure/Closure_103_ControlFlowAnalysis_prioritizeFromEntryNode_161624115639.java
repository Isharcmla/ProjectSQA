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

public class ControlFlowAnalysis_prioritizeFromEntryNode_161624115639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168;

    public ControlFlowAnalysis_prioritizeFromEntryNode_161624115639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term170 = new HashMap();
        Object term177 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term177, term177.getClass(), "elementData", null);
        setIntField(term177, term177.getClass(), "size", 1225272962);
        setIntField(term177, term177.getClass(), "modCount", 1324040357);
        Object term180 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term180, term180.getClass(), "elementData", null);
        setIntField(term180, term180.getClass(), "size", -1588772968);
        setIntField(term180, term180.getClass(), "modCount", -93135961);
        ArrayDeque term175 = new ArrayDeque();
        ((ArrayDeque) term175).add(term177);
        ((ArrayDeque) term175).add(term180);
        Object term187 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term187, term187.getClass(), "elementData", null);
        setIntField(term187, term187.getClass(), "size", -112921587);
        setIntField(term187, term187.getClass(), "modCount", 933028652);
        Object term190 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term190, term190.getClass(), "elementData", null);
        setIntField(term190, term190.getClass(), "size", 287287233);
        setIntField(term190, term190.getClass(), "modCount", 962840079);
        ArrayDeque term185 = new ArrayDeque();
        ((ArrayDeque) term185).add(term187);
        ((ArrayDeque) term185).add(term190);
        HashMap term195 = new HashMap();
        HashMap term208 = new HashMap();
        term168 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis"));
        Object term169 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowGraph"));
        setField(term168, term168.getClass(), "compiler", null);
        setField(term169, term169.getClass(), "implicitReturn", null);
        setField(term169, term169.getClass(), "entry", null);
        setField(term169, term169.getClass(), "nodes", term170);
        setField(term169, term169.getClass(), "nodeAnnotationStack", term175);
        setField(term169, term169.getClass(), "edgeAnnotationStack", term185);
        setField(term168, term168.getClass(), "cfg", term169);
        setField(term168, term168.getClass(), "astPosition", term195);
        setField(term168, term168.getClass(), "nodePriorities", term208);
        setField(term168, term168.getClass(), "priorityComparator", null);
        setIntField(term168, term168.getClass(), "astPositionCounter", 0);
        setIntField(term168, term168.getClass(), "priorityCounter", 0);
        setBooleanField(term168, term168.getClass(), "shouldTraverseFunctions", false);
        setField(term168, term168.getClass(), "root", null);
        setField(term168, term168.getClass(), "exceptionHandler", null);
        setField(term168, term168.getClass(), "finallyMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.graph.DiGraph$DiGraphNode");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "prioritizeFromEntryNode", argTypes, term168, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


