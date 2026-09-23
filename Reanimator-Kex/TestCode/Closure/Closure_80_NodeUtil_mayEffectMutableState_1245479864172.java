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
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class NodeUtil_mayEffectMutableState_1245479864172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term480;
     Object term7401;

    public NodeUtil_mayEffectMutableState_1245479864172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term480 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term482 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term484 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term487 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term490 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term493 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term497 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term500 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term503 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term480, term480.getClass(), "type", -507387516);
        setIntField(term482, term482.getClass(), "type", 114754804);
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
        setField(term493, term493.getClass(), "next", null);
        setIntField(term493, term493.getClass(), "type", 0);
        setIntField(term493, term493.getClass(), "intValue", 0);
        setField(term493, term493.getClass(), "objectValue", null);
        setField(term482, term482.getClass(), "propListHead", term493);
        setIntField(term482, term482.getClass(), "sourcePosition", 497269071);
        setField(term482, term482.getClass(), "jsType", null);
        setField(term482, term482.getClass(), "parent", null);
        setField(term480, term480.getClass(), "next", term482);
        setIntField(term497, term497.getClass(), "type", 0);
        setField(term497, term497.getClass(), "next", null);
        setField(term497, term497.getClass(), "first", null);
        setField(term497, term497.getClass(), "last", null);
        setField(term497, term497.getClass(), "propListHead", null);
        setIntField(term497, term497.getClass(), "sourcePosition", 0);
        setField(term497, term497.getClass(), "jsType", null);
        setField(term497, term497.getClass(), "parent", null);
        setField(term480, term480.getClass(), "first", term497);
        setIntField(term500, term500.getClass(), "type", 0);
        setField(term500, term500.getClass(), "next", null);
        setField(term500, term500.getClass(), "first", null);
        setField(term500, term500.getClass(), "last", null);
        setField(term500, term500.getClass(), "propListHead", null);
        setIntField(term500, term500.getClass(), "sourcePosition", 0);
        setField(term500, term500.getClass(), "jsType", null);
        setField(term500, term500.getClass(), "parent", null);
        setField(term480, term480.getClass(), "last", term500);
        setField(term503, term503.getClass(), "next", null);
        setIntField(term503, term503.getClass(), "type", 0);
        setIntField(term503, term503.getClass(), "intValue", 0);
        setField(term503, term503.getClass(), "objectValue", null);
        setField(term480, term480.getClass(), "propListHead", term503);
        setIntField(term480, term480.getClass(), "sourcePosition", -1899301124);
        setField(term480, term480.getClass(), "jsType", null);
        setField(term480, term480.getClass(), "parent", null);
        term7401 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7402 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7403 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7404 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7405 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7406 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term7407 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7408 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7409 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term7401, term7401.getClass(), "type", -507387516);
        setIntField(term7402, term7402.getClass(), "type", 114754804);
        setIntField(term7403, term7403.getClass(), "type", 0);
        setField(term7403, term7403.getClass(), "next", null);
        setField(term7403, term7403.getClass(), "first", null);
        setField(term7403, term7403.getClass(), "last", null);
        setField(term7403, term7403.getClass(), "propListHead", null);
        setIntField(term7403, term7403.getClass(), "sourcePosition", 0);
        setField(term7403, term7403.getClass(), "jsType", null);
        setField(term7403, term7403.getClass(), "parent", null);
        setField(term7402, term7402.getClass(), "next", term7403);
        setIntField(term7404, term7404.getClass(), "type", 0);
        setField(term7404, term7404.getClass(), "next", null);
        setField(term7404, term7404.getClass(), "first", null);
        setField(term7404, term7404.getClass(), "last", null);
        setField(term7404, term7404.getClass(), "propListHead", null);
        setIntField(term7404, term7404.getClass(), "sourcePosition", 0);
        setField(term7404, term7404.getClass(), "jsType", null);
        setField(term7404, term7404.getClass(), "parent", null);
        setField(term7402, term7402.getClass(), "first", term7404);
        setIntField(term7405, term7405.getClass(), "type", 0);
        setField(term7405, term7405.getClass(), "next", null);
        setField(term7405, term7405.getClass(), "first", null);
        setField(term7405, term7405.getClass(), "last", null);
        setField(term7405, term7405.getClass(), "propListHead", null);
        setIntField(term7405, term7405.getClass(), "sourcePosition", 0);
        setField(term7405, term7405.getClass(), "jsType", null);
        setField(term7405, term7405.getClass(), "parent", null);
        setField(term7402, term7402.getClass(), "last", term7405);
        setField(term7406, term7406.getClass(), "next", null);
        setIntField(term7406, term7406.getClass(), "type", 0);
        setIntField(term7406, term7406.getClass(), "intValue", 0);
        setField(term7406, term7406.getClass(), "objectValue", null);
        setField(term7402, term7402.getClass(), "propListHead", term7406);
        setIntField(term7402, term7402.getClass(), "sourcePosition", 497269071);
        setField(term7402, term7402.getClass(), "jsType", null);
        setField(term7402, term7402.getClass(), "parent", null);
        setField(term7401, term7401.getClass(), "next", term7402);
        setIntField(term7407, term7407.getClass(), "type", 0);
        setField(term7407, term7407.getClass(), "next", null);
        setField(term7407, term7407.getClass(), "first", null);
        setField(term7407, term7407.getClass(), "last", null);
        setField(term7407, term7407.getClass(), "propListHead", null);
        setIntField(term7407, term7407.getClass(), "sourcePosition", 0);
        setField(term7407, term7407.getClass(), "jsType", null);
        setField(term7407, term7407.getClass(), "parent", null);
        setField(term7401, term7401.getClass(), "first", term7407);
        setIntField(term7408, term7408.getClass(), "type", 0);
        setField(term7408, term7408.getClass(), "next", null);
        setField(term7408, term7408.getClass(), "first", null);
        setField(term7408, term7408.getClass(), "last", null);
        setField(term7408, term7408.getClass(), "propListHead", null);
        setIntField(term7408, term7408.getClass(), "sourcePosition", 0);
        setField(term7408, term7408.getClass(), "jsType", null);
        setField(term7408, term7408.getClass(), "parent", null);
        setField(term7401, term7401.getClass(), "last", term7408);
        setField(term7409, term7409.getClass(), "next", null);
        setIntField(term7409, term7409.getClass(), "type", 0);
        setIntField(term7409, term7409.getClass(), "intValue", 0);
        setField(term7409, term7409.getClass(), "objectValue", null);
        setField(term7401, term7401.getClass(), "propListHead", term7409);
        setIntField(term7401, term7401.getClass(), "sourcePosition", -1899301124);
        setField(term7401, term7401.getClass(), "jsType", null);
        setField(term7401, term7401.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[2];
        args[0] = term480;
        args[1] = null;
        callMethod(klass, "mayEffectMutableState", argTypes, null, args);
        assertTrue(recursiveEquals(term480, term7401));
    }

};


