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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayDeque;

public class PeepholeReplaceKnownMethods_tryFoldKnownNumericMethods_35048816720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277;
     Object term337;

    public PeepholeReplaceKnownMethods_tryFoldKnownNumericMethods_35048816720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term293 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term293, term293.getClass(), "vars", null);
        setField(term293, term293.getClass(), "parent", null);
        setIntField(term293, term293.getClass(), "depth", 0);
        setField(term293, term293.getClass(), "rootNode", null);
        setField(term293, term293.getClass(), "thisType", null);
        setBooleanField(term293, term293.getClass(), "isBottom", false);
        setField(term293, term293.getClass(), "arguments", null);
        ArrayDeque term291 = new ArrayDeque();
        ((ArrayDeque) term291).add(term293);
        Object term300 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term300, term300.getClass(), "type", 0);
        setField(term300, term300.getClass(), "next", null);
        setField(term300, term300.getClass(), "first", null);
        setField(term300, term300.getClass(), "last", null);
        setField(term300, term300.getClass(), "propListHead", null);
        setIntField(term300, term300.getClass(), "sourcePosition", 0);
        setField(term300, term300.getClass(), "jsType", null);
        setField(term300, term300.getClass(), "parent", null);
        Object term303 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term303, term303.getClass(), "type", 0);
        setField(term303, term303.getClass(), "next", null);
        setField(term303, term303.getClass(), "first", null);
        setField(term303, term303.getClass(), "last", null);
        setField(term303, term303.getClass(), "propListHead", null);
        setIntField(term303, term303.getClass(), "sourcePosition", 0);
        setField(term303, term303.getClass(), "jsType", null);
        setField(term303, term303.getClass(), "parent", null);
        Object term306 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term306, term306.getClass(), "type", 0);
        setField(term306, term306.getClass(), "next", null);
        setField(term306, term306.getClass(), "first", null);
        setField(term306, term306.getClass(), "last", null);
        setField(term306, term306.getClass(), "propListHead", null);
        setIntField(term306, term306.getClass(), "sourcePosition", 0);
        setField(term306, term306.getClass(), "jsType", null);
        setField(term306, term306.getClass(), "parent", null);
        Object term309 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term309, term309.getClass(), "type", 0);
        setField(term309, term309.getClass(), "next", null);
        setField(term309, term309.getClass(), "first", null);
        setField(term309, term309.getClass(), "last", null);
        setField(term309, term309.getClass(), "propListHead", null);
        setIntField(term309, term309.getClass(), "sourcePosition", 0);
        setField(term309, term309.getClass(), "jsType", null);
        setField(term309, term309.getClass(), "parent", null);
        Object term312 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term312, term312.getClass(), "type", 0);
        setField(term312, term312.getClass(), "next", null);
        setField(term312, term312.getClass(), "first", null);
        setField(term312, term312.getClass(), "last", null);
        setField(term312, term312.getClass(), "propListHead", null);
        setIntField(term312, term312.getClass(), "sourcePosition", 0);
        setField(term312, term312.getClass(), "jsType", null);
        setField(term312, term312.getClass(), "parent", null);
        Object term315 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term315, term315.getClass(), "type", 0);
        setField(term315, term315.getClass(), "next", null);
        setField(term315, term315.getClass(), "first", null);
        setField(term315, term315.getClass(), "last", null);
        setField(term315, term315.getClass(), "propListHead", null);
        setIntField(term315, term315.getClass(), "sourcePosition", 0);
        setField(term315, term315.getClass(), "jsType", null);
        setField(term315, term315.getClass(), "parent", null);
        ArrayDeque term298 = new ArrayDeque();
        ((ArrayDeque) term298).add(term300);
        ((ArrayDeque) term298).add(term303);
        ((ArrayDeque) term298).add(term306);
        ((ArrayDeque) term298).add(term309);
        ((ArrayDeque) term298).add(term312);
        ((ArrayDeque) term298).add(term315);
        ArrayDeque term320 = new ArrayDeque();
        term277 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        Object term278 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        Object term279 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term281 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term284 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term287 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term336 = newInstance(Class.forName("com.google.javascript.rhino.InputId"));
        setField(term278, term278.getClass(), "compiler", null);
        setField(term278, term278.getClass(), "callback", null);
        setIntField(term279, term279.getClass(), "type", 454281060);
        setIntField(term281, term281.getClass(), "type", 0);
        setField(term281, term281.getClass(), "next", null);
        setField(term281, term281.getClass(), "first", null);
        setField(term281, term281.getClass(), "last", null);
        setField(term281, term281.getClass(), "propListHead", null);
        setIntField(term281, term281.getClass(), "sourcePosition", 0);
        setField(term281, term281.getClass(), "jsType", null);
        setField(term281, term281.getClass(), "parent", null);
        setField(term279, term279.getClass(), "next", term281);
        setIntField(term284, term284.getClass(), "type", 0);
        setField(term284, term284.getClass(), "next", null);
        setField(term284, term284.getClass(), "first", null);
        setField(term284, term284.getClass(), "last", null);
        setField(term284, term284.getClass(), "propListHead", null);
        setIntField(term284, term284.getClass(), "sourcePosition", 0);
        setField(term284, term284.getClass(), "jsType", null);
        setField(term284, term284.getClass(), "parent", null);
        setField(term279, term279.getClass(), "first", term284);
        setIntField(term287, term287.getClass(), "type", 0);
        setField(term287, term287.getClass(), "next", null);
        setField(term287, term287.getClass(), "first", null);
        setField(term287, term287.getClass(), "last", null);
        setField(term287, term287.getClass(), "propListHead", null);
        setIntField(term287, term287.getClass(), "sourcePosition", 0);
        setField(term287, term287.getClass(), "jsType", null);
        setField(term287, term287.getClass(), "parent", null);
        setField(term279, term279.getClass(), "last", term287);
        setField(term279, term279.getClass(), "propListHead", null);
        setIntField(term279, term279.getClass(), "sourcePosition", 0);
        setField(term279, term279.getClass(), "jsType", null);
        setField(term279, term279.getClass(), "parent", null);
        setField(term278, term278.getClass(), "curNode", term279);
        setField(term278, term278.getClass(), "scopes", term291);
        setField(term278, term278.getClass(), "scopeRoots", term298);
        setField(term278, term278.getClass(), "cfgs", term320);
        setField(term278, term278.getClass(), "sourceName", "xxtlPwDYFs");
        setField(term336, term336.getClass(), "id", null);
        setField(term278, term278.getClass(), "inputId", term336);
        setField(term278, term278.getClass(), "scopeCreator", null);
        setField(term278, term278.getClass(), "scopeCallback", null);
        setField(term277, term277.getClass(), "currentTraversal", term278);
        term337 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term339 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term341 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term344 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term347 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term351 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term354 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term337, term337.getClass(), "type", -184153539);
        setIntField(term339, term339.getClass(), "type", 97029295);
        setIntField(term341, term341.getClass(), "type", 0);
        setField(term341, term341.getClass(), "next", null);
        setField(term341, term341.getClass(), "first", null);
        setField(term341, term341.getClass(), "last", null);
        setField(term341, term341.getClass(), "propListHead", null);
        setIntField(term341, term341.getClass(), "sourcePosition", 0);
        setField(term341, term341.getClass(), "jsType", null);
        setField(term341, term341.getClass(), "parent", null);
        setField(term339, term339.getClass(), "next", term341);
        setIntField(term344, term344.getClass(), "type", 0);
        setField(term344, term344.getClass(), "next", null);
        setField(term344, term344.getClass(), "first", null);
        setField(term344, term344.getClass(), "last", null);
        setField(term344, term344.getClass(), "propListHead", null);
        setIntField(term344, term344.getClass(), "sourcePosition", 0);
        setField(term344, term344.getClass(), "jsType", null);
        setField(term344, term344.getClass(), "parent", null);
        setField(term339, term339.getClass(), "first", term344);
        setIntField(term347, term347.getClass(), "type", 0);
        setField(term347, term347.getClass(), "next", null);
        setField(term347, term347.getClass(), "first", null);
        setField(term347, term347.getClass(), "last", null);
        setField(term347, term347.getClass(), "propListHead", null);
        setIntField(term347, term347.getClass(), "sourcePosition", 0);
        setField(term347, term347.getClass(), "jsType", null);
        setField(term347, term347.getClass(), "parent", null);
        setField(term339, term339.getClass(), "last", term347);
        setField(term339, term339.getClass(), "propListHead", null);
        setIntField(term339, term339.getClass(), "sourcePosition", 0);
        setField(term339, term339.getClass(), "jsType", null);
        setField(term339, term339.getClass(), "parent", null);
        setField(term337, term337.getClass(), "next", term339);
        setIntField(term351, term351.getClass(), "type", 0);
        setField(term351, term351.getClass(), "next", null);
        setField(term351, term351.getClass(), "first", null);
        setField(term351, term351.getClass(), "last", null);
        setField(term351, term351.getClass(), "propListHead", null);
        setIntField(term351, term351.getClass(), "sourcePosition", 0);
        setField(term351, term351.getClass(), "jsType", null);
        setField(term351, term351.getClass(), "parent", null);
        setField(term337, term337.getClass(), "first", term351);
        setIntField(term354, term354.getClass(), "type", 0);
        setField(term354, term354.getClass(), "next", null);
        setField(term354, term354.getClass(), "first", null);
        setField(term354, term354.getClass(), "last", null);
        setField(term354, term354.getClass(), "propListHead", null);
        setIntField(term354, term354.getClass(), "sourcePosition", 0);
        setField(term354, term354.getClass(), "jsType", null);
        setField(term354, term354.getClass(), "parent", null);
        setField(term337, term337.getClass(), "last", term354);
        setField(term337, term337.getClass(), "propListHead", null);
        setIntField(term337, term337.getClass(), "sourcePosition", 0);
        setField(term337, term337.getClass(), "jsType", null);
        setField(term337, term337.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term337;
        try {
            callMethod(klass, "tryFoldKnownNumericMethods", argTypes, term277, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


