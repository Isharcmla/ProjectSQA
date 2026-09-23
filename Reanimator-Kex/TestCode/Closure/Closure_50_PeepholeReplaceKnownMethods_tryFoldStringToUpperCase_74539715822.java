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
import java.util.ArrayDeque;

public class PeepholeReplaceKnownMethods_tryFoldStringToUpperCase_74539715822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term480;
     Object term522;
     Object term543;

    public PeepholeReplaceKnownMethods_tryFoldStringToUpperCase_74539715822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term496 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        setField(term496, term496.getClass(), "vars", null);
        setField(term496, term496.getClass(), "parent", null);
        setIntField(term496, term496.getClass(), "depth", 0);
        setField(term496, term496.getClass(), "rootNode", null);
        setField(term496, term496.getClass(), "thisType", null);
        setBooleanField(term496, term496.getClass(), "isBottom", false);
        setField(term496, term496.getClass(), "arguments", null);
        ArrayDeque term494 = new ArrayDeque();
        ((ArrayDeque) term494).add(term496);
        ArrayDeque term501 = new ArrayDeque();
        ArrayDeque term505 = new ArrayDeque();
        term480 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        Object term481 = newInstance(Class.forName("com.google.javascript.jscomp.NodeTraversal"));
        Object term482 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term484 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term487 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term490 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term521 = newInstance(Class.forName("com.google.javascript.rhino.InputId"));
        setField(term481, term481.getClass(), "compiler", null);
        setField(term481, term481.getClass(), "callback", null);
        setIntField(term482, term482.getClass(), "type", -344842608);
        setIntField(term484, term484.getClass(), "type", 0);
        setField(term484, term484.getClass(), "next", null);
        setField(term484, term484.getClass(), "first", null);
        setField(term484, term484.getClass(), "last", null);
        setField(term484, term484.getClass(), "propListHead", null);
        setIntField(term484, term484.getClass(), "sourcePosition", 0);
        setField(term484, term484.getClass(), "jsType", null);
        setField(term484, term484.getClass(), "parent", null);
        setField(term482, term482.getClass(), "next", term484);
        setIntField(term487, term487.getClass(), "type", 0);
        setField(term487, term487.getClass(), "next", null);
        setField(term487, term487.getClass(), "first", null);
        setField(term487, term487.getClass(), "last", null);
        setField(term487, term487.getClass(), "propListHead", null);
        setIntField(term487, term487.getClass(), "sourcePosition", 0);
        setField(term487, term487.getClass(), "jsType", null);
        setField(term487, term487.getClass(), "parent", null);
        setField(term482, term482.getClass(), "first", term487);
        setIntField(term490, term490.getClass(), "type", 0);
        setField(term490, term490.getClass(), "next", null);
        setField(term490, term490.getClass(), "first", null);
        setField(term490, term490.getClass(), "last", null);
        setField(term490, term490.getClass(), "propListHead", null);
        setIntField(term490, term490.getClass(), "sourcePosition", 0);
        setField(term490, term490.getClass(), "jsType", null);
        setField(term490, term490.getClass(), "parent", null);
        setField(term482, term482.getClass(), "last", term490);
        setField(term482, term482.getClass(), "propListHead", null);
        setIntField(term482, term482.getClass(), "sourcePosition", 0);
        setField(term482, term482.getClass(), "jsType", null);
        setField(term482, term482.getClass(), "parent", null);
        setField(term481, term481.getClass(), "curNode", term482);
        setField(term481, term481.getClass(), "scopes", term494);
        setField(term481, term481.getClass(), "scopeRoots", term501);
        setField(term481, term481.getClass(), "cfgs", term505);
        setField(term481, term481.getClass(), "sourceName", "EGtDIRbSSb");
        setField(term521, term521.getClass(), "id", null);
        setField(term481, term481.getClass(), "inputId", term521);
        setField(term481, term481.getClass(), "scopeCreator", null);
        setField(term481, term481.getClass(), "scopeCallback", null);
        setField(term480, term480.getClass(), "currentTraversal", term481);
        term522 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term524 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term526 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term529 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term532 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term536 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term539 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term522, term522.getClass(), "type", 304775596);
        setIntField(term524, term524.getClass(), "type", 1596213415);
        setIntField(term526, term526.getClass(), "type", 0);
        setField(term526, term526.getClass(), "next", null);
        setField(term526, term526.getClass(), "first", null);
        setField(term526, term526.getClass(), "last", null);
        setField(term526, term526.getClass(), "propListHead", null);
        setIntField(term526, term526.getClass(), "sourcePosition", 0);
        setField(term526, term526.getClass(), "jsType", null);
        setField(term526, term526.getClass(), "parent", null);
        setField(term524, term524.getClass(), "next", term526);
        setIntField(term529, term529.getClass(), "type", 0);
        setField(term529, term529.getClass(), "next", null);
        setField(term529, term529.getClass(), "first", null);
        setField(term529, term529.getClass(), "last", null);
        setField(term529, term529.getClass(), "propListHead", null);
        setIntField(term529, term529.getClass(), "sourcePosition", 0);
        setField(term529, term529.getClass(), "jsType", null);
        setField(term529, term529.getClass(), "parent", null);
        setField(term524, term524.getClass(), "first", term529);
        setIntField(term532, term532.getClass(), "type", 0);
        setField(term532, term532.getClass(), "next", null);
        setField(term532, term532.getClass(), "first", null);
        setField(term532, term532.getClass(), "last", null);
        setField(term532, term532.getClass(), "propListHead", null);
        setIntField(term532, term532.getClass(), "sourcePosition", 0);
        setField(term532, term532.getClass(), "jsType", null);
        setField(term532, term532.getClass(), "parent", null);
        setField(term524, term524.getClass(), "last", term532);
        setField(term524, term524.getClass(), "propListHead", null);
        setIntField(term524, term524.getClass(), "sourcePosition", 0);
        setField(term524, term524.getClass(), "jsType", null);
        setField(term524, term524.getClass(), "parent", null);
        setField(term522, term522.getClass(), "next", term524);
        setIntField(term536, term536.getClass(), "type", 0);
        setField(term536, term536.getClass(), "next", null);
        setField(term536, term536.getClass(), "first", null);
        setField(term536, term536.getClass(), "last", null);
        setField(term536, term536.getClass(), "propListHead", null);
        setIntField(term536, term536.getClass(), "sourcePosition", 0);
        setField(term536, term536.getClass(), "jsType", null);
        setField(term536, term536.getClass(), "parent", null);
        setField(term522, term522.getClass(), "first", term536);
        setIntField(term539, term539.getClass(), "type", 0);
        setField(term539, term539.getClass(), "next", null);
        setField(term539, term539.getClass(), "first", null);
        setField(term539, term539.getClass(), "last", null);
        setField(term539, term539.getClass(), "propListHead", null);
        setIntField(term539, term539.getClass(), "sourcePosition", 0);
        setField(term539, term539.getClass(), "jsType", null);
        setField(term539, term539.getClass(), "parent", null);
        setField(term522, term522.getClass(), "last", term539);
        setField(term522, term522.getClass(), "propListHead", null);
        setIntField(term522, term522.getClass(), "sourcePosition", 0);
        setField(term522, term522.getClass(), "jsType", null);
        setField(term522, term522.getClass(), "parent", null);
        term543 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term545 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term547 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term550 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term553 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term557 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term560 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term543, term543.getClass(), "type", -1476117762);
        setIntField(term545, term545.getClass(), "type", 1141317871);
        setIntField(term547, term547.getClass(), "type", 0);
        setField(term547, term547.getClass(), "next", null);
        setField(term547, term547.getClass(), "first", null);
        setField(term547, term547.getClass(), "last", null);
        setField(term547, term547.getClass(), "propListHead", null);
        setIntField(term547, term547.getClass(), "sourcePosition", 0);
        setField(term547, term547.getClass(), "jsType", null);
        setField(term547, term547.getClass(), "parent", null);
        setField(term545, term545.getClass(), "next", term547);
        setIntField(term550, term550.getClass(), "type", 0);
        setField(term550, term550.getClass(), "next", null);
        setField(term550, term550.getClass(), "first", null);
        setField(term550, term550.getClass(), "last", null);
        setField(term550, term550.getClass(), "propListHead", null);
        setIntField(term550, term550.getClass(), "sourcePosition", 0);
        setField(term550, term550.getClass(), "jsType", null);
        setField(term550, term550.getClass(), "parent", null);
        setField(term545, term545.getClass(), "first", term550);
        setIntField(term553, term553.getClass(), "type", 0);
        setField(term553, term553.getClass(), "next", null);
        setField(term553, term553.getClass(), "first", null);
        setField(term553, term553.getClass(), "last", null);
        setField(term553, term553.getClass(), "propListHead", null);
        setIntField(term553, term553.getClass(), "sourcePosition", 0);
        setField(term553, term553.getClass(), "jsType", null);
        setField(term553, term553.getClass(), "parent", null);
        setField(term545, term545.getClass(), "last", term553);
        setField(term545, term545.getClass(), "propListHead", null);
        setIntField(term545, term545.getClass(), "sourcePosition", 0);
        setField(term545, term545.getClass(), "jsType", null);
        setField(term545, term545.getClass(), "parent", null);
        setField(term543, term543.getClass(), "next", term545);
        setIntField(term557, term557.getClass(), "type", 0);
        setField(term557, term557.getClass(), "next", null);
        setField(term557, term557.getClass(), "first", null);
        setField(term557, term557.getClass(), "last", null);
        setField(term557, term557.getClass(), "propListHead", null);
        setIntField(term557, term557.getClass(), "sourcePosition", 0);
        setField(term557, term557.getClass(), "jsType", null);
        setField(term557, term557.getClass(), "parent", null);
        setField(term543, term543.getClass(), "first", term557);
        setIntField(term560, term560.getClass(), "type", 0);
        setField(term560, term560.getClass(), "next", null);
        setField(term560, term560.getClass(), "first", null);
        setField(term560, term560.getClass(), "last", null);
        setField(term560, term560.getClass(), "propListHead", null);
        setIntField(term560, term560.getClass(), "sourcePosition", 0);
        setField(term560, term560.getClass(), "jsType", null);
        setField(term560, term560.getClass(), "parent", null);
        setField(term543, term543.getClass(), "last", term560);
        setField(term543, term543.getClass(), "propListHead", null);
        setIntField(term543, term543.getClass(), "sourcePosition", 0);
        setField(term543, term543.getClass(), "jsType", null);
        setField(term543, term543.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term522;
        args[1] = term543;
        try {
            callMethod(klass, "tryFoldStringToUpperCase", argTypes, term480, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


