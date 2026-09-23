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
import java.util.HashMap;
import java.util.ArrayDeque;
import java.lang.Object;

public class MustBeReachingVariableDef_init_169918452912 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term45;

    public MustBeReachingVariableDef_init_169918452912() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2 = new HashMap();
        Object term11 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        Object[] term12 = (Object[]) newArray("java.lang.Object", 4);
        setField(term11, term11.getClass(), "elementData", term12);
        setIntField(term11, term11.getClass(), "size", 568599855);
        setIntField(term11, term11.getClass(), "modCount", 1162663216);
        Object term15 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        Object[] term16 = (Object[]) newArray("java.lang.Object", 3);
        setField(term15, term15.getClass(), "elementData", term16);
        setIntField(term15, term15.getClass(), "size", 1484323161);
        setIntField(term15, term15.getClass(), "modCount", 391863371);
        Object term19 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        Object[] term20 = (Object[]) newArray("java.lang.Object", 4);
        setField(term19, term19.getClass(), "elementData", term20);
        setIntField(term19, term19.getClass(), "size", -1922583790);
        setIntField(term19, term19.getClass(), "modCount", -616727354);
        Object term23 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        Object[] term24 = (Object[]) newArray("java.lang.Object", 1);
        setField(term23, term23.getClass(), "elementData", term24);
        setIntField(term23, term23.getClass(), "size", -1955890973);
        setIntField(term23, term23.getClass(), "modCount", -2038273078);
        Object term27 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        Object[] term28 = (Object[]) newArray("java.lang.Object", 6);
        setField(term27, term27.getClass(), "elementData", term28);
        setIntField(term27, term27.getClass(), "size", 1227103734);
        setIntField(term27, term27.getClass(), "modCount", -1339778481);
        ArrayDeque term9 = new ArrayDeque();
        ((ArrayDeque) term9).add(term11);
        ((ArrayDeque) term9).add(term15);
        ((ArrayDeque) term9).add(term19);
        ((ArrayDeque) term9).add(term23);
        ((ArrayDeque) term9).add(term27);
        Object term35 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        Object[] term36 = (Object[]) newArray("java.lang.Object", 6);
        setField(term35, term35.getClass(), "elementData", term36);
        setIntField(term35, term35.getClass(), "size", 1725571209);
        setIntField(term35, term35.getClass(), "modCount", -522618178);
        Object term39 = newInstance(Class.forName("com.google.javascript.jscomp.graph.Graph$GraphAnnotationState"));
        Object[] term40 = (Object[]) newArray("java.lang.Object", 7);
        setField(term39, term39.getClass(), "elementData", term40);
        setIntField(term39, term39.getClass(), "size", 1134449235);
        setIntField(term39, term39.getClass(), "modCount", -883034806);
        ArrayDeque term33 = new ArrayDeque();
        ((ArrayDeque) term33).add(term35);
        ((ArrayDeque) term33).add(term39);
        term1 = newInstance(Class.forName("com.google.javascript.jscomp.ControlFlowGraph"));
        setField(term1, term1.getClass(), "implicitReturn", null);
        setField(term1, term1.getClass(), "entry", null);
        setField(term1, term1.getClass(), "nodes", term2);
        setBooleanField(term1, term1.getClass(), "useNodeAnnotations", false);
        setBooleanField(term1, term1.getClass(), "useEdgeAnnotations", false);
        setField(term1, term1.getClass(), "nodeAnnotationStack", term9);
        setField(term1, term1.getClass(), "edgeAnnotationStack", term33);
        HashMap term46 = new HashMap();
        term45 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term60 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term64 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term66 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term73 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term82 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term87 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term45, term45.getClass(), "vars", term46);
        setField(term60, term60.getClass(), "vars", null);
        setField(term60, term60.getClass(), "parent", null);
        setIntField(term60, term60.getClass(), "depth", 0);
        setField(term60, term60.getClass(), "rootNode", null);
        setField(term60, term60.getClass(), "thisType", null);
        setBooleanField(term60, term60.getClass(), "isBottom", false);
        setField(term60, term60.getClass(), "arguments", null);
        setField(term45, term45.getClass(), "parent", term60);
        setIntField(term45, term45.getClass(), "depth", -2068769794);
        setIntField(term64, term64.getClass(), "type", 1622346318);
        setIntField(term66, term66.getClass(), "type", 1048535127);
        setIntField(term68, term68.getClass(), "type", -655067527);
        setIntField(term70, term70.getClass(), "type", -6029667);
        setField(term70, term70.getClass(), "next", null);
        setField(term70, term70.getClass(), "first", null);
        setField(term70, term70.getClass(), "last", term70);
        setField(term70, term70.getClass(), "propListHead", null);
        setIntField(term70, term70.getClass(), "sourcePosition", 0);
        setField(term70, term70.getClass(), "jsType", null);
        setField(term70, term70.getClass(), "parent", null);
        setField(term68, term68.getClass(), "next", term70);
        setIntField(term73, term73.getClass(), "type", 0);
        setField(term73, term73.getClass(), "next", null);
        setField(term73, term73.getClass(), "first", null);
        setField(term73, term73.getClass(), "last", null);
        setField(term73, term73.getClass(), "propListHead", null);
        setIntField(term73, term73.getClass(), "sourcePosition", 0);
        setField(term73, term73.getClass(), "jsType", null);
        setField(term73, term73.getClass(), "parent", null);
        setField(term68, term68.getClass(), "first", term73);
        setIntField(term76, term76.getClass(), "type", 1585847225);
        setField(term76, term76.getClass(), "next", null);
        setField(term76, term76.getClass(), "first", term66);
        setField(term76, term76.getClass(), "last", null);
        setField(term76, term76.getClass(), "propListHead", null);
        setIntField(term76, term76.getClass(), "sourcePosition", 0);
        setField(term76, term76.getClass(), "jsType", null);
        setField(term76, term76.getClass(), "parent", null);
        setField(term68, term68.getClass(), "last", term76);
        setField(term68, term68.getClass(), "propListHead", null);
        setIntField(term68, term68.getClass(), "sourcePosition", 0);
        setField(term68, term68.getClass(), "jsType", null);
        setField(term68, term68.getClass(), "parent", null);
        setField(term66, term66.getClass(), "next", term68);
        setField(term66, term66.getClass(), "first", term66);
        setIntField(term80, term80.getClass(), "type", -1456670397);
        setField(term80, term80.getClass(), "next", term64);
        setIntField(term82, term82.getClass(), "type", 0);
        setField(term82, term82.getClass(), "next", null);
        setField(term82, term82.getClass(), "first", null);
        setField(term82, term82.getClass(), "last", null);
        setField(term82, term82.getClass(), "propListHead", null);
        setIntField(term82, term82.getClass(), "sourcePosition", 0);
        setField(term82, term82.getClass(), "jsType", null);
        setField(term82, term82.getClass(), "parent", null);
        setField(term80, term80.getClass(), "first", term82);
        setField(term80, term80.getClass(), "last", term70);
        setField(term80, term80.getClass(), "propListHead", null);
        setIntField(term80, term80.getClass(), "sourcePosition", 0);
        setField(term80, term80.getClass(), "jsType", null);
        setField(term80, term80.getClass(), "parent", null);
        setField(term66, term66.getClass(), "last", term80);
        setField(term66, term66.getClass(), "propListHead", null);
        setIntField(term66, term66.getClass(), "sourcePosition", 0);
        setField(term66, term66.getClass(), "jsType", null);
        setField(term66, term66.getClass(), "parent", null);
        setField(term64, term64.getClass(), "next", term66);
        setIntField(term87, term87.getClass(), "type", 597278769);
        setIntField(term89, term89.getClass(), "type", -1685132342);
        setField(term89, term89.getClass(), "next", term80);
        setField(term89, term89.getClass(), "first", term70);
        setField(term89, term89.getClass(), "last", term64);
        setField(term89, term89.getClass(), "propListHead", null);
        setIntField(term89, term89.getClass(), "sourcePosition", 0);
        setField(term89, term89.getClass(), "jsType", null);
        setField(term89, term89.getClass(), "parent", null);
        setField(term87, term87.getClass(), "next", term89);
        setField(term87, term87.getClass(), "first", term82);
        setField(term87, term87.getClass(), "last", term70);
        setField(term87, term87.getClass(), "propListHead", null);
        setIntField(term87, term87.getClass(), "sourcePosition", 0);
        setField(term87, term87.getClass(), "jsType", null);
        setField(term87, term87.getClass(), "parent", null);
        setField(term64, term64.getClass(), "first", term87);
        setField(term64, term64.getClass(), "last", term87);
        setField(term64, term64.getClass(), "propListHead", null);
        setIntField(term64, term64.getClass(), "sourcePosition", 0);
        setField(term64, term64.getClass(), "jsType", null);
        setField(term64, term64.getClass(), "parent", null);
        setField(term45, term45.getClass(), "rootNode", term64);
        setField(term45, term45.getClass(), "thisType", null);
        setBooleanField(term45, term45.getClass(), "isBottom", false);
        setField(term45, term45.getClass(), "arguments", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.ControlFlowGraph");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.Scope");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[3];
        args[0] = term1;
        args[1] = term45;
        args[2] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


