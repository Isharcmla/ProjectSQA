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
import java.util.HashMap;
import java.util.ArrayDeque;
import java.lang.Object;

public class TypeInference_init_36813683539 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term43;

    public TypeInference_init_36813683539() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2 = new HashMap();
        Object term9 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        Object[] term10 = (Object[]) newArray("java.lang.Object", 4);
        setField(term9, term9.getClass(), "elementData", term10);
        setIntField(term9, term9.getClass(), "size", 568599855);
        setIntField(term9, term9.getClass(), "modCount", 1162663216);
        Object term13 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        Object[] term14 = (Object[]) newArray("java.lang.Object", 3);
        setField(term13, term13.getClass(), "elementData", term14);
        setIntField(term13, term13.getClass(), "size", 1484323161);
        setIntField(term13, term13.getClass(), "modCount", 391863371);
        Object term17 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        Object[] term18 = (Object[]) newArray("java.lang.Object", 4);
        setField(term17, term17.getClass(), "elementData", term18);
        setIntField(term17, term17.getClass(), "size", -1922583790);
        setIntField(term17, term17.getClass(), "modCount", -616727354);
        Object term21 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        Object[] term22 = (Object[]) newArray("java.lang.Object", 1);
        setField(term21, term21.getClass(), "elementData", term22);
        setIntField(term21, term21.getClass(), "size", -1955890973);
        setIntField(term21, term21.getClass(), "modCount", -2038273078);
        Object term25 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        Object[] term26 = (Object[]) newArray("java.lang.Object", 6);
        setField(term25, term25.getClass(), "elementData", term26);
        setIntField(term25, term25.getClass(), "size", 1227103734);
        setIntField(term25, term25.getClass(), "modCount", -1339778481);
        ArrayDeque term7 = new ArrayDeque();
        ((ArrayDeque) term7).add(term9);
        ((ArrayDeque) term7).add(term13);
        ((ArrayDeque) term7).add(term17);
        ((ArrayDeque) term7).add(term21);
        ((ArrayDeque) term7).add(term25);
        Object term33 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        Object[] term34 = (Object[]) newArray("java.lang.Object", 6);
        setField(term33, term33.getClass(), "elementData", term34);
        setIntField(term33, term33.getClass(), "size", 1725571209);
        setIntField(term33, term33.getClass(), "modCount", -522618178);
        Object term37 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        Object[] term38 = (Object[]) newArray("java.lang.Object", 7);
        setField(term37, term37.getClass(), "elementData", term38);
        setIntField(term37, term37.getClass(), "size", 1134449235);
        setIntField(term37, term37.getClass(), "modCount", -883034806);
        ArrayDeque term31 = new ArrayDeque();
        ((ArrayDeque) term31).add(term33);
        ((ArrayDeque) term31).add(term37);
        term1 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowGraph"));
        setField(term1, term1.getClass(), "implicitReturn", null);
        setField(term1, term1.getClass(), "entry", null);
        setField(term1, term1.getClass(), "nodes", term2);
        setField(term1, term1.getClass(), "nodeAnnotationStack", term7);
        setField(term1, term1.getClass(), "edgeAnnotationStack", term31);
        HashMap term44 = new HashMap();
        term43 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term57 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term59 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term43, term43.getClass(), "vars", term44);
        setField(term57, term57.getClass(), "vars", null);
        setField(term57, term57.getClass(), "parent", null);
        setField(term57, term57.getClass(), "rootNode", null);
        setField(term57, term57.getClass(), "thisType", null);
        setBooleanField(term57, term57.getClass(), "isBottom", false);
        setField(term43, term43.getClass(), "parent", term57);
        setIntField(term59, term59.getClass(), "type", 0);
        setField(term59, term59.getClass(), "next", null);
        setField(term59, term59.getClass(), "first", null);
        setField(term59, term59.getClass(), "last", null);
        setField(term59, term59.getClass(), "propListHead", null);
        setIntField(term59, term59.getClass(), "sourcePosition", 0);
        setField(term59, term59.getClass(), "jsType", null);
        setField(term59, term59.getClass(), "parent", null);
        setField(term43, term43.getClass(), "rootNode", term59);
        setField(term43, term43.getClass(), "thisType", null);
        setBooleanField(term43, term43.getClass(), "isBottom", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.ControlFlowGraph");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.ReverseAbstractInterpreter");
        argTypes[3] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term1;
        args[2] = null;
        args[3] = term43;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


