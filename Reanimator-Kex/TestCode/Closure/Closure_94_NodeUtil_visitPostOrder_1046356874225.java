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

public class NodeUtil_visitPostOrder_1046356874225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3247;

    public NodeUtil_visitPostOrder_1046356874225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3247 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3249 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3251 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3254 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3257 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3260 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3264 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3267 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3270 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3247, term3247.getClass(), "type", -1012090049);
        setIntField(term3249, term3249.getClass(), "type", 44908093);
        setIntField(term3251, term3251.getClass(), "type", 0);
        setField(term3251, term3251.getClass(), "next", null);
        setField(term3251, term3251.getClass(), "first", null);
        setField(term3251, term3251.getClass(), "last", null);
        setField(term3251, term3251.getClass(), "propListHead", null);
        setIntField(term3251, term3251.getClass(), "sourcePosition", 0);
        setField(term3251, term3251.getClass(), "jsType", null);
        setField(term3251, term3251.getClass(), "parent", null);
        setField(term3249, term3249.getClass(), "next", term3251);
        setIntField(term3254, term3254.getClass(), "type", 0);
        setField(term3254, term3254.getClass(), "next", null);
        setField(term3254, term3254.getClass(), "first", null);
        setField(term3254, term3254.getClass(), "last", null);
        setField(term3254, term3254.getClass(), "propListHead", null);
        setIntField(term3254, term3254.getClass(), "sourcePosition", 0);
        setField(term3254, term3254.getClass(), "jsType", null);
        setField(term3254, term3254.getClass(), "parent", null);
        setField(term3249, term3249.getClass(), "first", term3254);
        setIntField(term3257, term3257.getClass(), "type", 0);
        setField(term3257, term3257.getClass(), "next", null);
        setField(term3257, term3257.getClass(), "first", null);
        setField(term3257, term3257.getClass(), "last", null);
        setField(term3257, term3257.getClass(), "propListHead", null);
        setIntField(term3257, term3257.getClass(), "sourcePosition", 0);
        setField(term3257, term3257.getClass(), "jsType", null);
        setField(term3257, term3257.getClass(), "parent", null);
        setField(term3249, term3249.getClass(), "last", term3257);
        setField(term3260, term3260.getClass(), "next", null);
        setIntField(term3260, term3260.getClass(), "type", 0);
        setIntField(term3260, term3260.getClass(), "intValue", 0);
        setField(term3260, term3260.getClass(), "objectValue", null);
        setField(term3249, term3249.getClass(), "propListHead", term3260);
        setIntField(term3249, term3249.getClass(), "sourcePosition", 2087383644);
        setField(term3249, term3249.getClass(), "jsType", null);
        setField(term3249, term3249.getClass(), "parent", null);
        setField(term3247, term3247.getClass(), "next", term3249);
        setIntField(term3264, term3264.getClass(), "type", 0);
        setField(term3264, term3264.getClass(), "next", null);
        setField(term3264, term3264.getClass(), "first", null);
        setField(term3264, term3264.getClass(), "last", null);
        setField(term3264, term3264.getClass(), "propListHead", null);
        setIntField(term3264, term3264.getClass(), "sourcePosition", 0);
        setField(term3264, term3264.getClass(), "jsType", null);
        setField(term3264, term3264.getClass(), "parent", null);
        setField(term3247, term3247.getClass(), "first", term3264);
        setIntField(term3267, term3267.getClass(), "type", 0);
        setField(term3267, term3267.getClass(), "next", null);
        setField(term3267, term3267.getClass(), "first", null);
        setField(term3267, term3267.getClass(), "last", null);
        setField(term3267, term3267.getClass(), "propListHead", null);
        setIntField(term3267, term3267.getClass(), "sourcePosition", 0);
        setField(term3267, term3267.getClass(), "jsType", null);
        setField(term3267, term3267.getClass(), "parent", null);
        setField(term3247, term3247.getClass(), "last", term3267);
        setField(term3270, term3270.getClass(), "next", null);
        setIntField(term3270, term3270.getClass(), "type", 0);
        setIntField(term3270, term3270.getClass(), "intValue", 0);
        setField(term3270, term3270.getClass(), "objectValue", null);
        setField(term3247, term3247.getClass(), "propListHead", term3270);
        setIntField(term3247, term3247.getClass(), "sourcePosition", 405527523);
        setField(term3247, term3247.getClass(), "jsType", null);
        setField(term3247, term3247.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeUtil$Visitor");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term3247;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "visitPostOrder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


