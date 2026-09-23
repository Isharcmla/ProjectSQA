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

public class ControlFlowAnalysis_handleWhile_185270483543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term664;
     Object term706;

    public ControlFlowAnalysis_handleWhile_185270483543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term666 = new HashMap();
        ArrayDeque term671 = new ArrayDeque();
        Object term677 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term677, term677.getClass(), "elementData", null);
        setIntField(term677, term677.getClass(), "size", 1694224101);
        setIntField(term677, term677.getClass(), "modCount", 937859191);
        Object term680 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        setField(term680, term680.getClass(), "elementData", null);
        setIntField(term680, term680.getClass(), "size", -916584829);
        setIntField(term680, term680.getClass(), "modCount", -2131181468);
        ArrayDeque term675 = new ArrayDeque();
        ((ArrayDeque) term675).add(term677);
        ((ArrayDeque) term675).add(term680);
        HashMap term685 = new HashMap();
        HashMap term698 = new HashMap();
        term664 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis"));
        Object term665 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowGraph"));
        setField(term664, term664.getClass(), "compiler", null);
        setField(term665, term665.getClass(), "implicitReturn", null);
        setField(term665, term665.getClass(), "entry", null);
        setField(term665, term665.getClass(), "nodes", term666);
        setField(term665, term665.getClass(), "nodeAnnotationStack", term671);
        setField(term665, term665.getClass(), "edgeAnnotationStack", term675);
        setField(term664, term664.getClass(), "cfg", term665);
        setField(term664, term664.getClass(), "astPosition", term685);
        setField(term664, term664.getClass(), "nodePriorities", term698);
        setField(term664, term664.getClass(), "priorityComparator", null);
        setIntField(term664, term664.getClass(), "astPositionCounter", 0);
        setIntField(term664, term664.getClass(), "priorityCounter", 0);
        setBooleanField(term664, term664.getClass(), "shouldTraverseFunctions", false);
        setField(term664, term664.getClass(), "root", null);
        setField(term664, term664.getClass(), "exceptionHandler", null);
        setField(term664, term664.getClass(), "finallyMap", null);
        term706 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term708 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term710 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term713 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term716 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term719 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term723 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term726 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term729 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term706, term706.getClass(), "type", -1476644457);
        setIntField(term708, term708.getClass(), "type", -1022990421);
        setIntField(term710, term710.getClass(), "type", 0);
        setField(term710, term710.getClass(), "next", null);
        setField(term710, term710.getClass(), "first", null);
        setField(term710, term710.getClass(), "last", null);
        setField(term710, term710.getClass(), "propListHead", null);
        setIntField(term710, term710.getClass(), "sourcePosition", 0);
        setField(term710, term710.getClass(), "jsType", null);
        setField(term710, term710.getClass(), "parent", null);
        setField(term708, term708.getClass(), "next", term710);
        setIntField(term713, term713.getClass(), "type", 0);
        setField(term713, term713.getClass(), "next", null);
        setField(term713, term713.getClass(), "first", null);
        setField(term713, term713.getClass(), "last", null);
        setField(term713, term713.getClass(), "propListHead", null);
        setIntField(term713, term713.getClass(), "sourcePosition", 0);
        setField(term713, term713.getClass(), "jsType", null);
        setField(term713, term713.getClass(), "parent", null);
        setField(term708, term708.getClass(), "first", term713);
        setIntField(term716, term716.getClass(), "type", 0);
        setField(term716, term716.getClass(), "next", null);
        setField(term716, term716.getClass(), "first", null);
        setField(term716, term716.getClass(), "last", null);
        setField(term716, term716.getClass(), "propListHead", null);
        setIntField(term716, term716.getClass(), "sourcePosition", 0);
        setField(term716, term716.getClass(), "jsType", null);
        setField(term716, term716.getClass(), "parent", null);
        setField(term708, term708.getClass(), "last", term716);
        setField(term719, term719.getClass(), "next", null);
        setIntField(term719, term719.getClass(), "type", 0);
        setIntField(term719, term719.getClass(), "intValue", 0);
        setField(term719, term719.getClass(), "objectValue", null);
        setField(term708, term708.getClass(), "propListHead", term719);
        setIntField(term708, term708.getClass(), "sourcePosition", -542712742);
        setField(term708, term708.getClass(), "jsType", null);
        setField(term708, term708.getClass(), "parent", null);
        setField(term706, term706.getClass(), "next", term708);
        setIntField(term723, term723.getClass(), "type", 0);
        setField(term723, term723.getClass(), "next", null);
        setField(term723, term723.getClass(), "first", null);
        setField(term723, term723.getClass(), "last", null);
        setField(term723, term723.getClass(), "propListHead", null);
        setIntField(term723, term723.getClass(), "sourcePosition", 0);
        setField(term723, term723.getClass(), "jsType", null);
        setField(term723, term723.getClass(), "parent", null);
        setField(term706, term706.getClass(), "first", term723);
        setIntField(term726, term726.getClass(), "type", 0);
        setField(term726, term726.getClass(), "next", null);
        setField(term726, term726.getClass(), "first", null);
        setField(term726, term726.getClass(), "last", null);
        setField(term726, term726.getClass(), "propListHead", null);
        setIntField(term726, term726.getClass(), "sourcePosition", 0);
        setField(term726, term726.getClass(), "jsType", null);
        setField(term726, term726.getClass(), "parent", null);
        setField(term706, term706.getClass(), "last", term726);
        setField(term729, term729.getClass(), "next", null);
        setIntField(term729, term729.getClass(), "type", 0);
        setIntField(term729, term729.getClass(), "intValue", 0);
        setField(term729, term729.getClass(), "objectValue", null);
        setField(term706, term706.getClass(), "propListHead", term729);
        setIntField(term706, term706.getClass(), "sourcePosition", -1254072822);
        setField(term706, term706.getClass(), "jsType", null);
        setField(term706, term706.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term706;
        try {
            callMethod(klass, "handleWhile", argTypes, term664, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


