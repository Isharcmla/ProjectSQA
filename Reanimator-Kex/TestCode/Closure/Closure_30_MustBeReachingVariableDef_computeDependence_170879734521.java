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

public class MustBeReachingVariableDef_computeDependence_170879734521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term473;
     Object term491;
     Object term516;

    public MustBeReachingVariableDef_computeDependence_170879734521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term475 = new HashMap();
        term473 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Object term474 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term483 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term487 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term474, term474.getClass(), "vars", term475);
        setField(term483, term483.getClass(), "vars", null);
        setField(term483, term483.getClass(), "parent", null);
        setIntField(term483, term483.getClass(), "depth", 0);
        setField(term483, term483.getClass(), "rootNode", null);
        setField(term483, term483.getClass(), "thisType", null);
        setBooleanField(term483, term483.getClass(), "isBottom", false);
        setField(term483, term483.getClass(), "arguments", null);
        setField(term474, term474.getClass(), "parent", term483);
        setIntField(term474, term474.getClass(), "depth", -1498296052);
        setIntField(term487, term487.getClass(), "type", 0);
        setField(term487, term487.getClass(), "next", null);
        setField(term487, term487.getClass(), "first", null);
        setField(term487, term487.getClass(), "last", null);
        setField(term487, term487.getClass(), "propListHead", null);
        setIntField(term487, term487.getClass(), "sourcePosition", 0);
        setField(term487, term487.getClass(), "jsType", null);
        setField(term487, term487.getClass(), "parent", null);
        setField(term474, term474.getClass(), "rootNode", term487);
        setField(term474, term474.getClass(), "thisType", null);
        setBooleanField(term474, term474.getClass(), "isBottom", false);
        setField(term474, term474.getClass(), "arguments", null);
        setField(term473, term473.getClass(), "jsScope", term474);
        setField(term473, term473.getClass(), "compiler", null);
        setField(term473, term473.getClass(), "escaped", null);
        setField(term473, term473.getClass(), "cfg", null);
        setField(term473, term473.getClass(), "joinOp", null);
        setField(term473, term473.getClass(), "orderedWorkSet", null);
        term491 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$Definition"));
        Object term492 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term494 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term496 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term498 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term501 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term504 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term508 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term512 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term492, term492.getClass(), "type", 2098647989);
        setIntField(term494, term494.getClass(), "type", 1598895173);
        setIntField(term496, term496.getClass(), "type", 1830648570);
        setIntField(term498, term498.getClass(), "type", -227365013);
        setField(term498, term498.getClass(), "next", null);
        setField(term498, term498.getClass(), "first", null);
        setField(term498, term498.getClass(), "last", null);
        setField(term498, term498.getClass(), "propListHead", null);
        setIntField(term498, term498.getClass(), "sourcePosition", 0);
        setField(term498, term498.getClass(), "jsType", null);
        setField(term498, term498.getClass(), "parent", null);
        setField(term496, term496.getClass(), "next", term498);
        setIntField(term501, term501.getClass(), "type", -523949691);
        setField(term501, term501.getClass(), "next", null);
        setField(term501, term501.getClass(), "first", term492);
        setField(term501, term501.getClass(), "last", null);
        setField(term501, term501.getClass(), "propListHead", null);
        setIntField(term501, term501.getClass(), "sourcePosition", 0);
        setField(term501, term501.getClass(), "jsType", null);
        setField(term501, term501.getClass(), "parent", null);
        setField(term496, term496.getClass(), "first", term501);
        setIntField(term504, term504.getClass(), "type", 1953277050);
        setField(term504, term504.getClass(), "next", null);
        setField(term504, term504.getClass(), "first", term494);
        setField(term504, term504.getClass(), "last", null);
        setField(term504, term504.getClass(), "propListHead", null);
        setIntField(term504, term504.getClass(), "sourcePosition", 0);
        setField(term504, term504.getClass(), "jsType", null);
        setField(term504, term504.getClass(), "parent", null);
        setField(term496, term496.getClass(), "last", term504);
        setField(term496, term496.getClass(), "propListHead", null);
        setIntField(term496, term496.getClass(), "sourcePosition", 0);
        setField(term496, term496.getClass(), "jsType", null);
        setField(term496, term496.getClass(), "parent", null);
        setField(term494, term494.getClass(), "next", term496);
        setField(term494, term494.getClass(), "first", term496);
        setIntField(term508, term508.getClass(), "type", 11724947);
        setField(term508, term508.getClass(), "next", term504);
        setField(term508, term508.getClass(), "first", term501);
        setField(term508, term508.getClass(), "last", term501);
        setField(term508, term508.getClass(), "propListHead", null);
        setIntField(term508, term508.getClass(), "sourcePosition", 0);
        setField(term508, term508.getClass(), "jsType", null);
        setField(term508, term508.getClass(), "parent", null);
        setField(term494, term494.getClass(), "last", term508);
        setField(term494, term494.getClass(), "propListHead", null);
        setIntField(term494, term494.getClass(), "sourcePosition", 0);
        setField(term494, term494.getClass(), "jsType", null);
        setField(term494, term494.getClass(), "parent", null);
        setField(term492, term492.getClass(), "next", term494);
        setField(term492, term492.getClass(), "first", term501);
        setIntField(term512, term512.getClass(), "type", 0);
        setField(term512, term512.getClass(), "next", null);
        setField(term512, term512.getClass(), "first", null);
        setField(term512, term512.getClass(), "last", null);
        setField(term512, term512.getClass(), "propListHead", null);
        setIntField(term512, term512.getClass(), "sourcePosition", 0);
        setField(term512, term512.getClass(), "jsType", null);
        setField(term512, term512.getClass(), "parent", null);
        setField(term492, term492.getClass(), "last", term512);
        setField(term492, term492.getClass(), "propListHead", null);
        setIntField(term492, term492.getClass(), "sourcePosition", 0);
        setField(term492, term492.getClass(), "jsType", null);
        setField(term492, term492.getClass(), "parent", null);
        setField(term491, term491.getClass(), "node", term492);
        setField(term491, term491.getClass(), "depends", null);
        term516 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term518 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term520 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term522 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term524 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term527 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term531 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term533 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term538 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term516, term516.getClass(), "type", 229204365);
        setIntField(term518, term518.getClass(), "type", -461771056);
        setIntField(term520, term520.getClass(), "type", -243422082);
        setIntField(term522, term522.getClass(), "type", 1384592638);
        setIntField(term524, term524.getClass(), "type", -1002370457);
        setField(term524, term524.getClass(), "next", null);
        setField(term524, term524.getClass(), "first", null);
        setField(term524, term524.getClass(), "last", null);
        setField(term524, term524.getClass(), "propListHead", null);
        setIntField(term524, term524.getClass(), "sourcePosition", 0);
        setField(term524, term524.getClass(), "jsType", null);
        setField(term524, term524.getClass(), "parent", null);
        setField(term522, term522.getClass(), "next", term524);
        setIntField(term527, term527.getClass(), "type", -2014576105);
        setField(term527, term527.getClass(), "next", null);
        setField(term527, term527.getClass(), "first", null);
        setField(term527, term527.getClass(), "last", term524);
        setField(term527, term527.getClass(), "propListHead", null);
        setIntField(term527, term527.getClass(), "sourcePosition", 0);
        setField(term527, term527.getClass(), "jsType", null);
        setField(term527, term527.getClass(), "parent", null);
        setField(term522, term522.getClass(), "first", term527);
        setField(term522, term522.getClass(), "last", term520);
        setField(term522, term522.getClass(), "propListHead", null);
        setIntField(term522, term522.getClass(), "sourcePosition", 0);
        setField(term522, term522.getClass(), "jsType", null);
        setField(term522, term522.getClass(), "parent", null);
        setField(term520, term520.getClass(), "next", term522);
        setField(term520, term520.getClass(), "first", term524);
        setIntField(term531, term531.getClass(), "type", 628918458);
        setIntField(term533, term533.getClass(), "type", -1274456137);
        setField(term533, term533.getClass(), "next", null);
        setField(term533, term533.getClass(), "first", term527);
        setField(term533, term533.getClass(), "last", term522);
        setField(term533, term533.getClass(), "propListHead", null);
        setIntField(term533, term533.getClass(), "sourcePosition", 0);
        setField(term533, term533.getClass(), "jsType", null);
        setField(term533, term533.getClass(), "parent", null);
        setField(term531, term531.getClass(), "next", term533);
        setField(term531, term531.getClass(), "first", term518);
        setField(term531, term531.getClass(), "last", term518);
        setField(term531, term531.getClass(), "propListHead", null);
        setIntField(term531, term531.getClass(), "sourcePosition", 0);
        setField(term531, term531.getClass(), "jsType", null);
        setField(term531, term531.getClass(), "parent", null);
        setField(term520, term520.getClass(), "last", term531);
        setField(term520, term520.getClass(), "propListHead", null);
        setIntField(term520, term520.getClass(), "sourcePosition", 0);
        setField(term520, term520.getClass(), "jsType", null);
        setField(term520, term520.getClass(), "parent", null);
        setField(term518, term518.getClass(), "next", term520);
        setIntField(term538, term538.getClass(), "type", 1041916673);
        setField(term538, term538.getClass(), "next", term531);
        setField(term538, term538.getClass(), "first", term533);
        setField(term538, term538.getClass(), "last", term516);
        setField(term538, term538.getClass(), "propListHead", null);
        setIntField(term538, term538.getClass(), "sourcePosition", 0);
        setField(term538, term538.getClass(), "jsType", null);
        setField(term538, term538.getClass(), "parent", null);
        setField(term518, term518.getClass(), "first", term538);
        setField(term518, term518.getClass(), "last", term538);
        setField(term518, term518.getClass(), "propListHead", null);
        setIntField(term518, term518.getClass(), "sourcePosition", 0);
        setField(term518, term518.getClass(), "jsType", null);
        setField(term518, term518.getClass(), "parent", null);
        setField(term516, term516.getClass(), "next", term518);
        setField(term516, term516.getClass(), "first", term522);
        setField(term516, term516.getClass(), "last", term524);
        setField(term516, term516.getClass(), "propListHead", null);
        setIntField(term516, term516.getClass(), "sourcePosition", 0);
        setField(term516, term516.getClass(), "jsType", null);
        setField(term516, term516.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef$Definition");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term491;
        args[1] = term516;
        try {
            callMethod(klass, "computeDependence", argTypes, term473, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


