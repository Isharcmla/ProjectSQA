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

public class ReferenceCollectingCallback_enterScope_162729746517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term369;
     Object term411;

    public ReferenceCollectingCallback_enterScope_162729746517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term370 = new HashMap();
        Object term385 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        setField(term385, term385.getClass(), "parent", null);
        setBooleanField(term385, term385.getClass(), "isHoisted", false);
        setBooleanField(term385, term385.getClass(), "isFunction", false);
        setBooleanField(term385, term385.getClass(), "isLoop", false);
        Object term389 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        setField(term389, term389.getClass(), "parent", null);
        setBooleanField(term389, term389.getClass(), "isHoisted", false);
        setBooleanField(term389, term389.getClass(), "isFunction", false);
        setBooleanField(term389, term389.getClass(), "isLoop", false);
        Object term393 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        setField(term393, term393.getClass(), "parent", null);
        setBooleanField(term393, term393.getClass(), "isHoisted", false);
        setBooleanField(term393, term393.getClass(), "isFunction", false);
        setBooleanField(term393, term393.getClass(), "isLoop", false);
        Object term397 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        setField(term397, term397.getClass(), "parent", null);
        setBooleanField(term397, term397.getClass(), "isHoisted", false);
        setBooleanField(term397, term397.getClass(), "isFunction", false);
        setBooleanField(term397, term397.getClass(), "isLoop", false);
        Object term401 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        setField(term401, term401.getClass(), "parent", null);
        setBooleanField(term401, term401.getClass(), "isHoisted", false);
        setBooleanField(term401, term401.getClass(), "isFunction", false);
        setBooleanField(term401, term401.getClass(), "isLoop", false);
        Object term405 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        setField(term405, term405.getClass(), "parent", null);
        setBooleanField(term405, term405.getClass(), "isHoisted", false);
        setBooleanField(term405, term405.getClass(), "isFunction", false);
        setBooleanField(term405, term405.getClass(), "isLoop", false);
        ArrayDeque term383 = new ArrayDeque();
        ((ArrayDeque) term383).add(term385);
        ((ArrayDeque) term383).add(term389);
        ((ArrayDeque) term383).add(term393);
        ((ArrayDeque) term383).add(term397);
        ((ArrayDeque) term383).add(term401);
        ((ArrayDeque) term383).add(term405);
        term369 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term369, term369.getClass(), "referenceMap", term370);
        setField(term369, term369.getClass(), "blockStack", term383);
        setField(term369, term369.getClass(), "behavior", null);
        setField(term369, term369.getClass(), "compiler", null);
        setField(term369, term369.getClass(), "varFilter", null);
        Object term429 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term429, term429.getClass(), "vars", null);
        setField(term429, term429.getClass(), "parent", null);
        setIntField(term429, term429.getClass(), "depth", 0);
        setField(term429, term429.getClass(), "rootNode", null);
        setField(term429, term429.getClass(), "thisType", null);
        setBooleanField(term429, term429.getClass(), "isBottom", false);
        Object term432 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term432, term432.getClass(), "vars", null);
        setField(term432, term432.getClass(), "parent", null);
        setIntField(term432, term432.getClass(), "depth", 0);
        setField(term432, term432.getClass(), "rootNode", null);
        setField(term432, term432.getClass(), "thisType", null);
        setBooleanField(term432, term432.getClass(), "isBottom", false);
        Object term435 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term435, term435.getClass(), "vars", null);
        setField(term435, term435.getClass(), "parent", null);
        setIntField(term435, term435.getClass(), "depth", 0);
        setField(term435, term435.getClass(), "rootNode", null);
        setField(term435, term435.getClass(), "thisType", null);
        setBooleanField(term435, term435.getClass(), "isBottom", false);
        Object term438 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term438, term438.getClass(), "vars", null);
        setField(term438, term438.getClass(), "parent", null);
        setIntField(term438, term438.getClass(), "depth", 0);
        setField(term438, term438.getClass(), "rootNode", null);
        setField(term438, term438.getClass(), "thisType", null);
        setBooleanField(term438, term438.getClass(), "isBottom", false);
        Object term441 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term441, term441.getClass(), "vars", null);
        setField(term441, term441.getClass(), "parent", null);
        setIntField(term441, term441.getClass(), "depth", 0);
        setField(term441, term441.getClass(), "rootNode", null);
        setField(term441, term441.getClass(), "thisType", null);
        setBooleanField(term441, term441.getClass(), "isBottom", false);
        Object term444 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term444, term444.getClass(), "vars", null);
        setField(term444, term444.getClass(), "parent", null);
        setIntField(term444, term444.getClass(), "depth", 0);
        setField(term444, term444.getClass(), "rootNode", null);
        setField(term444, term444.getClass(), "thisType", null);
        setBooleanField(term444, term444.getClass(), "isBottom", false);
        Object term447 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term447, term447.getClass(), "vars", null);
        setField(term447, term447.getClass(), "parent", null);
        setIntField(term447, term447.getClass(), "depth", 0);
        setField(term447, term447.getClass(), "rootNode", null);
        setField(term447, term447.getClass(), "thisType", null);
        setBooleanField(term447, term447.getClass(), "isBottom", false);
        ArrayDeque term427 = new ArrayDeque();
        ((ArrayDeque) term427).add(term429);
        ((ArrayDeque) term427).add(term432);
        ((ArrayDeque) term427).add(term435);
        ((ArrayDeque) term427).add(term438);
        ((ArrayDeque) term427).add(term441);
        ((ArrayDeque) term427).add(term444);
        ((ArrayDeque) term427).add(term447);
        Object term454 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term454, term454.getClass(), "type", 0);
        setField(term454, term454.getClass(), "next", null);
        setField(term454, term454.getClass(), "first", null);
        setField(term454, term454.getClass(), "last", null);
        setField(term454, term454.getClass(), "propListHead", null);
        setIntField(term454, term454.getClass(), "sourcePosition", 0);
        setField(term454, term454.getClass(), "jsType", null);
        setField(term454, term454.getClass(), "parent", null);
        ArrayDeque term452 = new ArrayDeque();
        ((ArrayDeque) term452).add(term454);
        ArrayDeque term459 = new ArrayDeque();
        term411 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        Object term412 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term414 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term417 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term420 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term423 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setField(term411, term411.getClass(), "compiler", null);
        setField(term411, term411.getClass(), "callback", null);
        setIntField(term412, term412.getClass(), "type", 1386130016);
        setIntField(term414, term414.getClass(), "type", 0);
        setField(term414, term414.getClass(), "next", null);
        setField(term414, term414.getClass(), "first", null);
        setField(term414, term414.getClass(), "last", null);
        setField(term414, term414.getClass(), "propListHead", null);
        setIntField(term414, term414.getClass(), "sourcePosition", 0);
        setField(term414, term414.getClass(), "jsType", null);
        setField(term414, term414.getClass(), "parent", null);
        setField(term412, term412.getClass(), "next", term414);
        setIntField(term417, term417.getClass(), "type", 0);
        setField(term417, term417.getClass(), "next", null);
        setField(term417, term417.getClass(), "first", null);
        setField(term417, term417.getClass(), "last", null);
        setField(term417, term417.getClass(), "propListHead", null);
        setIntField(term417, term417.getClass(), "sourcePosition", 0);
        setField(term417, term417.getClass(), "jsType", null);
        setField(term417, term417.getClass(), "parent", null);
        setField(term412, term412.getClass(), "first", term417);
        setIntField(term420, term420.getClass(), "type", 0);
        setField(term420, term420.getClass(), "next", null);
        setField(term420, term420.getClass(), "first", null);
        setField(term420, term420.getClass(), "last", null);
        setField(term420, term420.getClass(), "propListHead", null);
        setIntField(term420, term420.getClass(), "sourcePosition", 0);
        setField(term420, term420.getClass(), "jsType", null);
        setField(term420, term420.getClass(), "parent", null);
        setField(term412, term412.getClass(), "last", term420);
        setField(term423, term423.getClass(), "next", null);
        setIntField(term423, term423.getClass(), "type", 0);
        setIntField(term423, term423.getClass(), "intValue", 0);
        setField(term423, term423.getClass(), "objectValue", null);
        setField(term412, term412.getClass(), "propListHead", term423);
        setIntField(term412, term412.getClass(), "sourcePosition", 568954359);
        setField(term412, term412.getClass(), "jsType", null);
        setField(term412, term412.getClass(), "parent", null);
        setField(term411, term411.getClass(), "curNode", term412);
        setField(term411, term411.getClass(), "scopes", term427);
        setField(term411, term411.getClass(), "scopeRoots", term452);
        setField(term411, term411.getClass(), "cfgs", term459);
        setField(term411, term411.getClass(), "sourceName", "MjGYSRKTNF");
        setField(term411, term411.getClass(), "scopeCreator", null);
        setField(term411, term411.getClass(), "scopeCallback", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Object[] args = new Object[1];
        args[0] = term411;
        try {
            callMethod(klass, "enterScope", argTypes, term369, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


