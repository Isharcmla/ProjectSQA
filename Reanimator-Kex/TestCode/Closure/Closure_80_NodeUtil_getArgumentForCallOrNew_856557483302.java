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
import java.lang.Integer;

public class NodeUtil_getArgumentForCallOrNew_856557483302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4408;
     Object term4435;

    public NodeUtil_getArgumentForCallOrNew_856557483302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4408 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4410 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4412 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4415 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4418 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4421 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term4425 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4428 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4431 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term4408, term4408.getClass(), "type", 918882916);
        setIntField(term4410, term4410.getClass(), "type", 996017434);
        setIntField(term4412, term4412.getClass(), "type", 0);
        setField(term4412, term4412.getClass(), "next", null);
        setField(term4412, term4412.getClass(), "first", null);
        setField(term4412, term4412.getClass(), "last", null);
        setField(term4412, term4412.getClass(), "propListHead", null);
        setIntField(term4412, term4412.getClass(), "sourcePosition", 0);
        setField(term4412, term4412.getClass(), "jsType", null);
        setField(term4412, term4412.getClass(), "parent", null);
        setField(term4410, term4410.getClass(), "next", term4412);
        setIntField(term4415, term4415.getClass(), "type", 0);
        setField(term4415, term4415.getClass(), "next", null);
        setField(term4415, term4415.getClass(), "first", null);
        setField(term4415, term4415.getClass(), "last", null);
        setField(term4415, term4415.getClass(), "propListHead", null);
        setIntField(term4415, term4415.getClass(), "sourcePosition", 0);
        setField(term4415, term4415.getClass(), "jsType", null);
        setField(term4415, term4415.getClass(), "parent", null);
        setField(term4410, term4410.getClass(), "first", term4415);
        setIntField(term4418, term4418.getClass(), "type", 0);
        setField(term4418, term4418.getClass(), "next", null);
        setField(term4418, term4418.getClass(), "first", null);
        setField(term4418, term4418.getClass(), "last", null);
        setField(term4418, term4418.getClass(), "propListHead", null);
        setIntField(term4418, term4418.getClass(), "sourcePosition", 0);
        setField(term4418, term4418.getClass(), "jsType", null);
        setField(term4418, term4418.getClass(), "parent", null);
        setField(term4410, term4410.getClass(), "last", term4418);
        setField(term4421, term4421.getClass(), "next", null);
        setIntField(term4421, term4421.getClass(), "type", 0);
        setIntField(term4421, term4421.getClass(), "intValue", 0);
        setField(term4421, term4421.getClass(), "objectValue", null);
        setField(term4410, term4410.getClass(), "propListHead", term4421);
        setIntField(term4410, term4410.getClass(), "sourcePosition", 1047409266);
        setField(term4410, term4410.getClass(), "jsType", null);
        setField(term4410, term4410.getClass(), "parent", null);
        setField(term4408, term4408.getClass(), "next", term4410);
        setIntField(term4425, term4425.getClass(), "type", 0);
        setField(term4425, term4425.getClass(), "next", null);
        setField(term4425, term4425.getClass(), "first", null);
        setField(term4425, term4425.getClass(), "last", null);
        setField(term4425, term4425.getClass(), "propListHead", null);
        setIntField(term4425, term4425.getClass(), "sourcePosition", 0);
        setField(term4425, term4425.getClass(), "jsType", null);
        setField(term4425, term4425.getClass(), "parent", null);
        setField(term4408, term4408.getClass(), "first", term4425);
        setIntField(term4428, term4428.getClass(), "type", 0);
        setField(term4428, term4428.getClass(), "next", null);
        setField(term4428, term4428.getClass(), "first", null);
        setField(term4428, term4428.getClass(), "last", null);
        setField(term4428, term4428.getClass(), "propListHead", null);
        setIntField(term4428, term4428.getClass(), "sourcePosition", 0);
        setField(term4428, term4428.getClass(), "jsType", null);
        setField(term4428, term4428.getClass(), "parent", null);
        setField(term4408, term4408.getClass(), "last", term4428);
        setField(term4431, term4431.getClass(), "next", null);
        setIntField(term4431, term4431.getClass(), "type", 0);
        setIntField(term4431, term4431.getClass(), "intValue", 0);
        setField(term4431, term4431.getClass(), "objectValue", null);
        setField(term4408, term4408.getClass(), "propListHead", term4431);
        setIntField(term4408, term4408.getClass(), "sourcePosition", 1427248961);
        setField(term4408, term4408.getClass(), "jsType", null);
        setField(term4408, term4408.getClass(), "parent", null);
        term4435 = new Integer(1445291866);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term4408;
        args[1] = term4435;
        try {
            callMethod(klass, "getArgumentForCallOrNew", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


