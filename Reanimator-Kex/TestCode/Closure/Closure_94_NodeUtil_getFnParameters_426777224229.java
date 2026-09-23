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

public class NodeUtil_getFnParameters_426777224229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3355;

    public NodeUtil_getFnParameters_426777224229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3355 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3357 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3359 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3362 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3365 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3368 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3372 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3375 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3378 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3355, term3355.getClass(), "type", -767031634);
        setIntField(term3357, term3357.getClass(), "type", -1433815725);
        setIntField(term3359, term3359.getClass(), "type", 0);
        setField(term3359, term3359.getClass(), "next", null);
        setField(term3359, term3359.getClass(), "first", null);
        setField(term3359, term3359.getClass(), "last", null);
        setField(term3359, term3359.getClass(), "propListHead", null);
        setIntField(term3359, term3359.getClass(), "sourcePosition", 0);
        setField(term3359, term3359.getClass(), "jsType", null);
        setField(term3359, term3359.getClass(), "parent", null);
        setField(term3357, term3357.getClass(), "next", term3359);
        setIntField(term3362, term3362.getClass(), "type", 0);
        setField(term3362, term3362.getClass(), "next", null);
        setField(term3362, term3362.getClass(), "first", null);
        setField(term3362, term3362.getClass(), "last", null);
        setField(term3362, term3362.getClass(), "propListHead", null);
        setIntField(term3362, term3362.getClass(), "sourcePosition", 0);
        setField(term3362, term3362.getClass(), "jsType", null);
        setField(term3362, term3362.getClass(), "parent", null);
        setField(term3357, term3357.getClass(), "first", term3362);
        setIntField(term3365, term3365.getClass(), "type", 0);
        setField(term3365, term3365.getClass(), "next", null);
        setField(term3365, term3365.getClass(), "first", null);
        setField(term3365, term3365.getClass(), "last", null);
        setField(term3365, term3365.getClass(), "propListHead", null);
        setIntField(term3365, term3365.getClass(), "sourcePosition", 0);
        setField(term3365, term3365.getClass(), "jsType", null);
        setField(term3365, term3365.getClass(), "parent", null);
        setField(term3357, term3357.getClass(), "last", term3365);
        setField(term3368, term3368.getClass(), "next", null);
        setIntField(term3368, term3368.getClass(), "type", 0);
        setIntField(term3368, term3368.getClass(), "intValue", 0);
        setField(term3368, term3368.getClass(), "objectValue", null);
        setField(term3357, term3357.getClass(), "propListHead", term3368);
        setIntField(term3357, term3357.getClass(), "sourcePosition", -378436487);
        setField(term3357, term3357.getClass(), "jsType", null);
        setField(term3357, term3357.getClass(), "parent", null);
        setField(term3355, term3355.getClass(), "next", term3357);
        setIntField(term3372, term3372.getClass(), "type", 0);
        setField(term3372, term3372.getClass(), "next", null);
        setField(term3372, term3372.getClass(), "first", null);
        setField(term3372, term3372.getClass(), "last", null);
        setField(term3372, term3372.getClass(), "propListHead", null);
        setIntField(term3372, term3372.getClass(), "sourcePosition", 0);
        setField(term3372, term3372.getClass(), "jsType", null);
        setField(term3372, term3372.getClass(), "parent", null);
        setField(term3355, term3355.getClass(), "first", term3372);
        setIntField(term3375, term3375.getClass(), "type", 0);
        setField(term3375, term3375.getClass(), "next", null);
        setField(term3375, term3375.getClass(), "first", null);
        setField(term3375, term3375.getClass(), "last", null);
        setField(term3375, term3375.getClass(), "propListHead", null);
        setIntField(term3375, term3375.getClass(), "sourcePosition", 0);
        setField(term3375, term3375.getClass(), "jsType", null);
        setField(term3375, term3375.getClass(), "parent", null);
        setField(term3355, term3355.getClass(), "last", term3375);
        setField(term3378, term3378.getClass(), "next", null);
        setIntField(term3378, term3378.getClass(), "type", 0);
        setIntField(term3378, term3378.getClass(), "intValue", 0);
        setField(term3378, term3378.getClass(), "objectValue", null);
        setField(term3355, term3355.getClass(), "propListHead", term3378);
        setIntField(term3355, term3355.getClass(), "sourcePosition", 584949609);
        setField(term3355, term3355.getClass(), "jsType", null);
        setField(term3355, term3355.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3355;
        try {
            callMethod(klass, "getFnParameters", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


