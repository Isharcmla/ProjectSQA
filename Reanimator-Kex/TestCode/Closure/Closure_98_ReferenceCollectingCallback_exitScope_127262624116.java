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

public class ReferenceCollectingCallback_exitScope_127262624116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term403;
     Object term433;

    public ReferenceCollectingCallback_exitScope_127262624116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term404 = new HashMap();
        Object term419 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        setField(term419, term419.getClass(), "parent", null);
        setBooleanField(term419, term419.getClass(), "isHoisted", false);
        Object term421 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        setField(term421, term421.getClass(), "parent", null);
        setBooleanField(term421, term421.getClass(), "isHoisted", false);
        Object term423 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        setField(term423, term423.getClass(), "parent", null);
        setBooleanField(term423, term423.getClass(), "isHoisted", false);
        Object term425 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        setField(term425, term425.getClass(), "parent", null);
        setBooleanField(term425, term425.getClass(), "isHoisted", false);
        Object term427 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        setField(term427, term427.getClass(), "parent", null);
        setBooleanField(term427, term427.getClass(), "isHoisted", false);
        Object term429 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        setField(term429, term429.getClass(), "parent", null);
        setBooleanField(term429, term429.getClass(), "isHoisted", false);
        ArrayDeque term417 = new ArrayDeque();
        ((ArrayDeque) term417).add(term419);
        ((ArrayDeque) term417).add(term421);
        ((ArrayDeque) term417).add(term423);
        ((ArrayDeque) term417).add(term425);
        ((ArrayDeque) term417).add(term427);
        ((ArrayDeque) term417).add(term429);
        term403 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term403, term403.getClass(), "referenceMap", term404);
        setField(term403, term403.getClass(), "blockStack", term417);
        setField(term403, term403.getClass(), "behavior", null);
        setField(term403, term403.getClass(), "compiler", null);
        setField(term403, term403.getClass(), "varFilter", null);
        Object term451 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term451, term451.getClass(), "vars", null);
        setField(term451, term451.getClass(), "parent", null);
        setField(term451, term451.getClass(), "rootNode", null);
        setField(term451, term451.getClass(), "thisType", null);
        setBooleanField(term451, term451.getClass(), "isBottom", false);
        Object term453 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term453, term453.getClass(), "vars", null);
        setField(term453, term453.getClass(), "parent", null);
        setField(term453, term453.getClass(), "rootNode", null);
        setField(term453, term453.getClass(), "thisType", null);
        setBooleanField(term453, term453.getClass(), "isBottom", false);
        Object term455 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term455, term455.getClass(), "vars", null);
        setField(term455, term455.getClass(), "parent", null);
        setField(term455, term455.getClass(), "rootNode", null);
        setField(term455, term455.getClass(), "thisType", null);
        setBooleanField(term455, term455.getClass(), "isBottom", false);
        Object term457 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term457, term457.getClass(), "vars", null);
        setField(term457, term457.getClass(), "parent", null);
        setField(term457, term457.getClass(), "rootNode", null);
        setField(term457, term457.getClass(), "thisType", null);
        setBooleanField(term457, term457.getClass(), "isBottom", false);
        Object term459 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term459, term459.getClass(), "vars", null);
        setField(term459, term459.getClass(), "parent", null);
        setField(term459, term459.getClass(), "rootNode", null);
        setField(term459, term459.getClass(), "thisType", null);
        setBooleanField(term459, term459.getClass(), "isBottom", false);
        ArrayDeque term449 = new ArrayDeque();
        ((ArrayDeque) term449).add(term451);
        ((ArrayDeque) term449).add(term453);
        ((ArrayDeque) term449).add(term455);
        ((ArrayDeque) term449).add(term457);
        ((ArrayDeque) term449).add(term459);
        Object term465 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term465, term465.getClass(), "type", 0);
        setField(term465, term465.getClass(), "next", null);
        setField(term465, term465.getClass(), "first", null);
        setField(term465, term465.getClass(), "last", null);
        setField(term465, term465.getClass(), "propListHead", null);
        setIntField(term465, term465.getClass(), "sourcePosition", 0);
        setField(term465, term465.getClass(), "jsType", null);
        setField(term465, term465.getClass(), "parent", null);
        Object term468 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term468, term468.getClass(), "type", 0);
        setField(term468, term468.getClass(), "next", null);
        setField(term468, term468.getClass(), "first", null);
        setField(term468, term468.getClass(), "last", null);
        setField(term468, term468.getClass(), "propListHead", null);
        setIntField(term468, term468.getClass(), "sourcePosition", 0);
        setField(term468, term468.getClass(), "jsType", null);
        setField(term468, term468.getClass(), "parent", null);
        Object term471 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term471, term471.getClass(), "type", 0);
        setField(term471, term471.getClass(), "next", null);
        setField(term471, term471.getClass(), "first", null);
        setField(term471, term471.getClass(), "last", null);
        setField(term471, term471.getClass(), "propListHead", null);
        setIntField(term471, term471.getClass(), "sourcePosition", 0);
        setField(term471, term471.getClass(), "jsType", null);
        setField(term471, term471.getClass(), "parent", null);
        Object term474 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term474, term474.getClass(), "type", 0);
        setField(term474, term474.getClass(), "next", null);
        setField(term474, term474.getClass(), "first", null);
        setField(term474, term474.getClass(), "last", null);
        setField(term474, term474.getClass(), "propListHead", null);
        setIntField(term474, term474.getClass(), "sourcePosition", 0);
        setField(term474, term474.getClass(), "jsType", null);
        setField(term474, term474.getClass(), "parent", null);
        Object term477 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term477, term477.getClass(), "type", 0);
        setField(term477, term477.getClass(), "next", null);
        setField(term477, term477.getClass(), "first", null);
        setField(term477, term477.getClass(), "last", null);
        setField(term477, term477.getClass(), "propListHead", null);
        setIntField(term477, term477.getClass(), "sourcePosition", 0);
        setField(term477, term477.getClass(), "jsType", null);
        setField(term477, term477.getClass(), "parent", null);
        ArrayDeque term463 = new ArrayDeque();
        ((ArrayDeque) term463).add(term465);
        ((ArrayDeque) term463).add(term468);
        ((ArrayDeque) term463).add(term471);
        ((ArrayDeque) term463).add(term474);
        ((ArrayDeque) term463).add(term477);
        ArrayDeque term482 = new ArrayDeque();
        term433 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        Object term434 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term436 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term439 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term442 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term445 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setField(term433, term433.getClass(), "compiler", null);
        setField(term433, term433.getClass(), "callback", null);
        setIntField(term434, term434.getClass(), "type", 480137250);
        setIntField(term436, term436.getClass(), "type", 0);
        setField(term436, term436.getClass(), "next", null);
        setField(term436, term436.getClass(), "first", null);
        setField(term436, term436.getClass(), "last", null);
        setField(term436, term436.getClass(), "propListHead", null);
        setIntField(term436, term436.getClass(), "sourcePosition", 0);
        setField(term436, term436.getClass(), "jsType", null);
        setField(term436, term436.getClass(), "parent", null);
        setField(term434, term434.getClass(), "next", term436);
        setIntField(term439, term439.getClass(), "type", 0);
        setField(term439, term439.getClass(), "next", null);
        setField(term439, term439.getClass(), "first", null);
        setField(term439, term439.getClass(), "last", null);
        setField(term439, term439.getClass(), "propListHead", null);
        setIntField(term439, term439.getClass(), "sourcePosition", 0);
        setField(term439, term439.getClass(), "jsType", null);
        setField(term439, term439.getClass(), "parent", null);
        setField(term434, term434.getClass(), "first", term439);
        setIntField(term442, term442.getClass(), "type", 0);
        setField(term442, term442.getClass(), "next", null);
        setField(term442, term442.getClass(), "first", null);
        setField(term442, term442.getClass(), "last", null);
        setField(term442, term442.getClass(), "propListHead", null);
        setIntField(term442, term442.getClass(), "sourcePosition", 0);
        setField(term442, term442.getClass(), "jsType", null);
        setField(term442, term442.getClass(), "parent", null);
        setField(term434, term434.getClass(), "last", term442);
        setField(term445, term445.getClass(), "next", null);
        setIntField(term445, term445.getClass(), "type", 0);
        setIntField(term445, term445.getClass(), "intValue", 0);
        setField(term445, term445.getClass(), "objectValue", null);
        setField(term434, term434.getClass(), "propListHead", term445);
        setIntField(term434, term434.getClass(), "sourcePosition", 96566506);
        setField(term434, term434.getClass(), "jsType", null);
        setField(term434, term434.getClass(), "parent", null);
        setField(term433, term433.getClass(), "curNode", term434);
        setField(term433, term433.getClass(), "scopes", term449);
        setField(term433, term433.getClass(), "scopeRoots", term463);
        setField(term433, term433.getClass(), "cfgs", term482);
        setField(term433, term433.getClass(), "sourceName", "hRNSzYYIrc");
        setField(term433, term433.getClass(), "scopeCreator", null);
        setField(term433, term433.getClass(), "scopeCallback", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Object[] args = new Object[1];
        args[0] = term433;
        try {
            callMethod(klass, "exitScope", argTypes, term403, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


