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

public class ReferenceCollectingCallback_enterScope_162729746515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term301;
     Object term323;

    public ReferenceCollectingCallback_enterScope_162729746515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term302 = new HashMap();
        Object term317 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        setField(term317, term317.getClass(), "parent", null);
        setBooleanField(term317, term317.getClass(), "isHoisted", false);
        Object term319 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        setField(term319, term319.getClass(), "parent", null);
        setBooleanField(term319, term319.getClass(), "isHoisted", false);
        ArrayDeque term315 = new ArrayDeque();
        ((ArrayDeque) term315).add(term317);
        ((ArrayDeque) term315).add(term319);
        term301 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term301, term301.getClass(), "referenceMap", term302);
        setField(term301, term301.getClass(), "blockStack", term315);
        setField(term301, term301.getClass(), "behavior", null);
        setField(term301, term301.getClass(), "compiler", null);
        setField(term301, term301.getClass(), "varFilter", null);
        Object term341 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term341, term341.getClass(), "vars", null);
        setField(term341, term341.getClass(), "parent", null);
        setField(term341, term341.getClass(), "rootNode", null);
        setField(term341, term341.getClass(), "thisType", null);
        setBooleanField(term341, term341.getClass(), "isBottom", false);
        Object term343 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term343, term343.getClass(), "vars", null);
        setField(term343, term343.getClass(), "parent", null);
        setField(term343, term343.getClass(), "rootNode", null);
        setField(term343, term343.getClass(), "thisType", null);
        setBooleanField(term343, term343.getClass(), "isBottom", false);
        Object term345 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term345, term345.getClass(), "vars", null);
        setField(term345, term345.getClass(), "parent", null);
        setField(term345, term345.getClass(), "rootNode", null);
        setField(term345, term345.getClass(), "thisType", null);
        setBooleanField(term345, term345.getClass(), "isBottom", false);
        Object term347 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term347, term347.getClass(), "vars", null);
        setField(term347, term347.getClass(), "parent", null);
        setField(term347, term347.getClass(), "rootNode", null);
        setField(term347, term347.getClass(), "thisType", null);
        setBooleanField(term347, term347.getClass(), "isBottom", false);
        Object term349 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term349, term349.getClass(), "vars", null);
        setField(term349, term349.getClass(), "parent", null);
        setField(term349, term349.getClass(), "rootNode", null);
        setField(term349, term349.getClass(), "thisType", null);
        setBooleanField(term349, term349.getClass(), "isBottom", false);
        Object term351 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term351, term351.getClass(), "vars", null);
        setField(term351, term351.getClass(), "parent", null);
        setField(term351, term351.getClass(), "rootNode", null);
        setField(term351, term351.getClass(), "thisType", null);
        setBooleanField(term351, term351.getClass(), "isBottom", false);
        ArrayDeque term339 = new ArrayDeque();
        ((ArrayDeque) term339).add(term341);
        ((ArrayDeque) term339).add(term343);
        ((ArrayDeque) term339).add(term345);
        ((ArrayDeque) term339).add(term347);
        ((ArrayDeque) term339).add(term349);
        ((ArrayDeque) term339).add(term351);
        Object term357 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term357, term357.getClass(), "type", 0);
        setField(term357, term357.getClass(), "next", null);
        setField(term357, term357.getClass(), "first", null);
        setField(term357, term357.getClass(), "last", null);
        setField(term357, term357.getClass(), "propListHead", null);
        setIntField(term357, term357.getClass(), "sourcePosition", 0);
        setField(term357, term357.getClass(), "jsType", null);
        setField(term357, term357.getClass(), "parent", null);
        Object term360 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term360, term360.getClass(), "type", 0);
        setField(term360, term360.getClass(), "next", null);
        setField(term360, term360.getClass(), "first", null);
        setField(term360, term360.getClass(), "last", null);
        setField(term360, term360.getClass(), "propListHead", null);
        setIntField(term360, term360.getClass(), "sourcePosition", 0);
        setField(term360, term360.getClass(), "jsType", null);
        setField(term360, term360.getClass(), "parent", null);
        Object term363 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term363, term363.getClass(), "type", 0);
        setField(term363, term363.getClass(), "next", null);
        setField(term363, term363.getClass(), "first", null);
        setField(term363, term363.getClass(), "last", null);
        setField(term363, term363.getClass(), "propListHead", null);
        setIntField(term363, term363.getClass(), "sourcePosition", 0);
        setField(term363, term363.getClass(), "jsType", null);
        setField(term363, term363.getClass(), "parent", null);
        Object term366 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term366, term366.getClass(), "type", 0);
        setField(term366, term366.getClass(), "next", null);
        setField(term366, term366.getClass(), "first", null);
        setField(term366, term366.getClass(), "last", null);
        setField(term366, term366.getClass(), "propListHead", null);
        setIntField(term366, term366.getClass(), "sourcePosition", 0);
        setField(term366, term366.getClass(), "jsType", null);
        setField(term366, term366.getClass(), "parent", null);
        Object term369 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term369, term369.getClass(), "type", 0);
        setField(term369, term369.getClass(), "next", null);
        setField(term369, term369.getClass(), "first", null);
        setField(term369, term369.getClass(), "last", null);
        setField(term369, term369.getClass(), "propListHead", null);
        setIntField(term369, term369.getClass(), "sourcePosition", 0);
        setField(term369, term369.getClass(), "jsType", null);
        setField(term369, term369.getClass(), "parent", null);
        Object term372 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term372, term372.getClass(), "type", 0);
        setField(term372, term372.getClass(), "next", null);
        setField(term372, term372.getClass(), "first", null);
        setField(term372, term372.getClass(), "last", null);
        setField(term372, term372.getClass(), "propListHead", null);
        setIntField(term372, term372.getClass(), "sourcePosition", 0);
        setField(term372, term372.getClass(), "jsType", null);
        setField(term372, term372.getClass(), "parent", null);
        ArrayDeque term355 = new ArrayDeque();
        ((ArrayDeque) term355).add(term357);
        ((ArrayDeque) term355).add(term360);
        ((ArrayDeque) term355).add(term363);
        ((ArrayDeque) term355).add(term366);
        ((ArrayDeque) term355).add(term369);
        ((ArrayDeque) term355).add(term372);
        ((ArrayDeque) term355).add(term366);
        ArrayDeque term377 = new ArrayDeque();
        term323 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        Object term324 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term326 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term332 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term335 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setField(term323, term323.getClass(), "compiler", null);
        setField(term323, term323.getClass(), "callback", null);
        setIntField(term324, term324.getClass(), "type", -341962980);
        setIntField(term326, term326.getClass(), "type", 0);
        setField(term326, term326.getClass(), "next", null);
        setField(term326, term326.getClass(), "first", null);
        setField(term326, term326.getClass(), "last", null);
        setField(term326, term326.getClass(), "propListHead", null);
        setIntField(term326, term326.getClass(), "sourcePosition", 0);
        setField(term326, term326.getClass(), "jsType", null);
        setField(term326, term326.getClass(), "parent", null);
        setField(term324, term324.getClass(), "next", term326);
        setIntField(term329, term329.getClass(), "type", 0);
        setField(term329, term329.getClass(), "next", null);
        setField(term329, term329.getClass(), "first", null);
        setField(term329, term329.getClass(), "last", null);
        setField(term329, term329.getClass(), "propListHead", null);
        setIntField(term329, term329.getClass(), "sourcePosition", 0);
        setField(term329, term329.getClass(), "jsType", null);
        setField(term329, term329.getClass(), "parent", null);
        setField(term324, term324.getClass(), "first", term329);
        setIntField(term332, term332.getClass(), "type", 0);
        setField(term332, term332.getClass(), "next", null);
        setField(term332, term332.getClass(), "first", null);
        setField(term332, term332.getClass(), "last", null);
        setField(term332, term332.getClass(), "propListHead", null);
        setIntField(term332, term332.getClass(), "sourcePosition", 0);
        setField(term332, term332.getClass(), "jsType", null);
        setField(term332, term332.getClass(), "parent", null);
        setField(term324, term324.getClass(), "last", term332);
        setField(term335, term335.getClass(), "next", null);
        setIntField(term335, term335.getClass(), "type", 0);
        setIntField(term335, term335.getClass(), "intValue", 0);
        setField(term335, term335.getClass(), "objectValue", null);
        setField(term324, term324.getClass(), "propListHead", term335);
        setIntField(term324, term324.getClass(), "sourcePosition", 890669485);
        setField(term324, term324.getClass(), "jsType", null);
        setField(term324, term324.getClass(), "parent", null);
        setField(term323, term323.getClass(), "curNode", term324);
        setField(term323, term323.getClass(), "scopes", term339);
        setField(term323, term323.getClass(), "scopeRoots", term355);
        setField(term323, term323.getClass(), "cfgs", term377);
        setField(term323, term323.getClass(), "sourceName", "SzjVpOQTyS");
        setField(term323, term323.getClass(), "scopeCreator", null);
        setField(term323, term323.getClass(), "scopeCallback", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Object[] args = new Object[1];
        args[0] = term323;
        try {
            callMethod(klass, "enterScope", argTypes, term301, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


