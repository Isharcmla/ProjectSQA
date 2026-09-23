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
import java.lang.Object;
import java.util.HashMap;
import java.util.ArrayDeque;

public class ControlFlowAnalysis_handleWhile_185270483548 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term723;
     Object term768;

    public ControlFlowAnalysis_handleWhile_185270483548() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term725 = new HashMap();
        ArrayDeque term732 = new ArrayDeque();
        Object term738 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term738, term738.getClass(), "elementData", null);
        setIntField(term738, term738.getClass(), "size", 497269071);
        setIntField(term738, term738.getClass(), "modCount", -1899301124);
        Object term741 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term741, term741.getClass(), "elementData", null);
        setIntField(term741, term741.getClass(), "size", -1882480155);
        setIntField(term741, term741.getClass(), "modCount", -1410220680);
        ArrayDeque term736 = new ArrayDeque();
        ((ArrayDeque) term736).add(term738);
        ((ArrayDeque) term736).add(term741);
        HashMap term746 = new HashMap();
        HashMap term759 = new HashMap();
        term723 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis"));
        Object term724 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowGraph"));
        setField(term723, term723.getClass(), "compiler", null);
        setField(term724, term724.getClass(), "implicitReturn", null);
        setField(term724, term724.getClass(), "entry", null);
        setField(term724, term724.getClass(), "nodes", term725);
        setBooleanField(term724, term724.getClass(), "useNodeAnnotations", false);
        setBooleanField(term724, term724.getClass(), "useEdgeAnnotations", false);
        setField(term724, term724.getClass(), "nodeAnnotationStack", term732);
        setField(term724, term724.getClass(), "edgeAnnotationStack", term736);
        setField(term723, term723.getClass(), "cfg", term724);
        setField(term723, term723.getClass(), "astPosition", term746);
        setField(term723, term723.getClass(), "nodePriorities", term759);
        setField(term723, term723.getClass(), "priorityComparator", null);
        setIntField(term723, term723.getClass(), "astPositionCounter", 0);
        setIntField(term723, term723.getClass(), "priorityCounter", 0);
        setBooleanField(term723, term723.getClass(), "shouldTraverseFunctions", false);
        setBooleanField(term723, term723.getClass(), "edgeAnnotations", false);
        setField(term723, term723.getClass(), "root", null);
        setField(term723, term723.getClass(), "exceptionHandler", null);
        setField(term723, term723.getClass(), "finallyMap", null);
        term768 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term770 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term772 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term774 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term776 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term779 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term783 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term785 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term790 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term768, term768.getClass(), "type", -426764678);
        setIntField(term770, term770.getClass(), "type", -1222614956);
        setIntField(term772, term772.getClass(), "type", -1870495012);
        setIntField(term774, term774.getClass(), "type", -1310015129);
        setIntField(term776, term776.getClass(), "type", -2104981311);
        setField(term776, term776.getClass(), "next", null);
        setField(term776, term776.getClass(), "first", null);
        setField(term776, term776.getClass(), "last", null);
        setField(term776, term776.getClass(), "propListHead", null);
        setIntField(term776, term776.getClass(), "sourcePosition", 0);
        setField(term776, term776.getClass(), "jsType", null);
        setField(term776, term776.getClass(), "parent", null);
        setField(term774, term774.getClass(), "next", term776);
        setIntField(term779, term779.getClass(), "type", -571169753);
        setField(term779, term779.getClass(), "next", null);
        setField(term779, term779.getClass(), "first", null);
        setField(term779, term779.getClass(), "last", term776);
        setField(term779, term779.getClass(), "propListHead", null);
        setIntField(term779, term779.getClass(), "sourcePosition", 0);
        setField(term779, term779.getClass(), "jsType", null);
        setField(term779, term779.getClass(), "parent", null);
        setField(term774, term774.getClass(), "first", term779);
        setField(term774, term774.getClass(), "last", term772);
        setField(term774, term774.getClass(), "propListHead", null);
        setIntField(term774, term774.getClass(), "sourcePosition", 0);
        setField(term774, term774.getClass(), "jsType", null);
        setField(term774, term774.getClass(), "parent", null);
        setField(term772, term772.getClass(), "next", term774);
        setField(term772, term772.getClass(), "first", term776);
        setIntField(term783, term783.getClass(), "type", -165587447);
        setIntField(term785, term785.getClass(), "type", -1347358701);
        setField(term785, term785.getClass(), "next", null);
        setField(term785, term785.getClass(), "first", term779);
        setField(term785, term785.getClass(), "last", term774);
        setField(term785, term785.getClass(), "propListHead", null);
        setIntField(term785, term785.getClass(), "sourcePosition", 0);
        setField(term785, term785.getClass(), "jsType", null);
        setField(term785, term785.getClass(), "parent", null);
        setField(term783, term783.getClass(), "next", term785);
        setField(term783, term783.getClass(), "first", term770);
        setField(term783, term783.getClass(), "last", term770);
        setField(term783, term783.getClass(), "propListHead", null);
        setIntField(term783, term783.getClass(), "sourcePosition", 0);
        setField(term783, term783.getClass(), "jsType", null);
        setField(term783, term783.getClass(), "parent", null);
        setField(term772, term772.getClass(), "last", term783);
        setField(term772, term772.getClass(), "propListHead", null);
        setIntField(term772, term772.getClass(), "sourcePosition", 0);
        setField(term772, term772.getClass(), "jsType", null);
        setField(term772, term772.getClass(), "parent", null);
        setField(term770, term770.getClass(), "next", term772);
        setIntField(term790, term790.getClass(), "type", 806595993);
        setField(term790, term790.getClass(), "next", term783);
        setField(term790, term790.getClass(), "first", term785);
        setField(term790, term790.getClass(), "last", term768);
        setField(term790, term790.getClass(), "propListHead", null);
        setIntField(term790, term790.getClass(), "sourcePosition", 0);
        setField(term790, term790.getClass(), "jsType", null);
        setField(term790, term790.getClass(), "parent", null);
        setField(term770, term770.getClass(), "first", term790);
        setField(term770, term770.getClass(), "last", term790);
        setField(term770, term770.getClass(), "propListHead", null);
        setIntField(term770, term770.getClass(), "sourcePosition", 0);
        setField(term770, term770.getClass(), "jsType", null);
        setField(term770, term770.getClass(), "parent", null);
        setField(term768, term768.getClass(), "next", term770);
        setField(term768, term768.getClass(), "first", term774);
        setField(term768, term768.getClass(), "last", term776);
        setField(term768, term768.getClass(), "propListHead", null);
        setIntField(term768, term768.getClass(), "sourcePosition", 0);
        setField(term768, term768.getClass(), "jsType", null);
        setField(term768, term768.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term768;
        try {
            callMethod(klass, "handleWhile", argTypes, term723, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


