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

public class NodeUtil_isName_1555326690132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term706;
     Object term6422;

    public NodeUtil_isName_1555326690132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term706 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term708 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term710 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term713 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term716 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term719 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term723 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term726 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term729 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term706, term706.getClass(), "type", -1070592289);
        setIntField(term708, term708.getClass(), "type", 1252951645);
        setIntField(term710, term710.getClass(), "type", 0);
        setField(term710, term710.getClass(), "next", null);
        setField(term710, term710.getClass(), "first", null);
        setField(term710, term710.getClass(), "last", null);
        setField(term710, term710.getClass(), "propListHead", null);
        setIntField(term710, term710.getClass(), "sourcePosition", 0);
        setField(term710, term710.getClass(), "jsType", null);
        setField(term710, term710.getClass(), "parent", null);
        setField(term708, term708.getClass(), "next", term710);
        setIntField(term713, term713.getClass(), "type", 0);
        setField(term713, term713.getClass(), "next", null);
        setField(term713, term713.getClass(), "first", null);
        setField(term713, term713.getClass(), "last", null);
        setField(term713, term713.getClass(), "propListHead", null);
        setIntField(term713, term713.getClass(), "sourcePosition", 0);
        setField(term713, term713.getClass(), "jsType", null);
        setField(term713, term713.getClass(), "parent", null);
        setField(term708, term708.getClass(), "first", term713);
        setIntField(term716, term716.getClass(), "type", 0);
        setField(term716, term716.getClass(), "next", null);
        setField(term716, term716.getClass(), "first", null);
        setField(term716, term716.getClass(), "last", null);
        setField(term716, term716.getClass(), "propListHead", null);
        setIntField(term716, term716.getClass(), "sourcePosition", 0);
        setField(term716, term716.getClass(), "jsType", null);
        setField(term716, term716.getClass(), "parent", null);
        setField(term708, term708.getClass(), "last", term716);
        setField(term719, term719.getClass(), "next", null);
        setIntField(term719, term719.getClass(), "type", 0);
        setIntField(term719, term719.getClass(), "intValue", 0);
        setField(term719, term719.getClass(), "objectValue", null);
        setField(term708, term708.getClass(), "propListHead", term719);
        setIntField(term708, term708.getClass(), "sourcePosition", -634976996);
        setField(term708, term708.getClass(), "jsType", null);
        setField(term708, term708.getClass(), "parent", null);
        setField(term706, term706.getClass(), "next", term708);
        setIntField(term723, term723.getClass(), "type", 0);
        setField(term723, term723.getClass(), "next", null);
        setField(term723, term723.getClass(), "first", null);
        setField(term723, term723.getClass(), "last", null);
        setField(term723, term723.getClass(), "propListHead", null);
        setIntField(term723, term723.getClass(), "sourcePosition", 0);
        setField(term723, term723.getClass(), "jsType", null);
        setField(term723, term723.getClass(), "parent", null);
        setField(term706, term706.getClass(), "first", term723);
        setIntField(term726, term726.getClass(), "type", 0);
        setField(term726, term726.getClass(), "next", null);
        setField(term726, term726.getClass(), "first", null);
        setField(term726, term726.getClass(), "last", null);
        setField(term726, term726.getClass(), "propListHead", null);
        setIntField(term726, term726.getClass(), "sourcePosition", 0);
        setField(term726, term726.getClass(), "jsType", null);
        setField(term726, term726.getClass(), "parent", null);
        setField(term706, term706.getClass(), "last", term726);
        setField(term729, term729.getClass(), "next", null);
        setIntField(term729, term729.getClass(), "type", 0);
        setIntField(term729, term729.getClass(), "intValue", 0);
        setField(term729, term729.getClass(), "objectValue", null);
        setField(term706, term706.getClass(), "propListHead", term729);
        setIntField(term706, term706.getClass(), "sourcePosition", -1015274146);
        setField(term706, term706.getClass(), "jsType", null);
        setField(term706, term706.getClass(), "parent", null);
        term6422 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6423 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6424 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6425 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6426 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6427 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term6428 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6429 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6430 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term6422, term6422.getClass(), "type", -1070592289);
        setIntField(term6423, term6423.getClass(), "type", 1252951645);
        setIntField(term6424, term6424.getClass(), "type", 0);
        setField(term6424, term6424.getClass(), "next", null);
        setField(term6424, term6424.getClass(), "first", null);
        setField(term6424, term6424.getClass(), "last", null);
        setField(term6424, term6424.getClass(), "propListHead", null);
        setIntField(term6424, term6424.getClass(), "sourcePosition", 0);
        setField(term6424, term6424.getClass(), "jsType", null);
        setField(term6424, term6424.getClass(), "parent", null);
        setField(term6423, term6423.getClass(), "next", term6424);
        setIntField(term6425, term6425.getClass(), "type", 0);
        setField(term6425, term6425.getClass(), "next", null);
        setField(term6425, term6425.getClass(), "first", null);
        setField(term6425, term6425.getClass(), "last", null);
        setField(term6425, term6425.getClass(), "propListHead", null);
        setIntField(term6425, term6425.getClass(), "sourcePosition", 0);
        setField(term6425, term6425.getClass(), "jsType", null);
        setField(term6425, term6425.getClass(), "parent", null);
        setField(term6423, term6423.getClass(), "first", term6425);
        setIntField(term6426, term6426.getClass(), "type", 0);
        setField(term6426, term6426.getClass(), "next", null);
        setField(term6426, term6426.getClass(), "first", null);
        setField(term6426, term6426.getClass(), "last", null);
        setField(term6426, term6426.getClass(), "propListHead", null);
        setIntField(term6426, term6426.getClass(), "sourcePosition", 0);
        setField(term6426, term6426.getClass(), "jsType", null);
        setField(term6426, term6426.getClass(), "parent", null);
        setField(term6423, term6423.getClass(), "last", term6426);
        setField(term6427, term6427.getClass(), "next", null);
        setIntField(term6427, term6427.getClass(), "type", 0);
        setIntField(term6427, term6427.getClass(), "intValue", 0);
        setField(term6427, term6427.getClass(), "objectValue", null);
        setField(term6423, term6423.getClass(), "propListHead", term6427);
        setIntField(term6423, term6423.getClass(), "sourcePosition", -634976996);
        setField(term6423, term6423.getClass(), "jsType", null);
        setField(term6423, term6423.getClass(), "parent", null);
        setField(term6422, term6422.getClass(), "next", term6423);
        setIntField(term6428, term6428.getClass(), "type", 0);
        setField(term6428, term6428.getClass(), "next", null);
        setField(term6428, term6428.getClass(), "first", null);
        setField(term6428, term6428.getClass(), "last", null);
        setField(term6428, term6428.getClass(), "propListHead", null);
        setIntField(term6428, term6428.getClass(), "sourcePosition", 0);
        setField(term6428, term6428.getClass(), "jsType", null);
        setField(term6428, term6428.getClass(), "parent", null);
        setField(term6422, term6422.getClass(), "first", term6428);
        setIntField(term6429, term6429.getClass(), "type", 0);
        setField(term6429, term6429.getClass(), "next", null);
        setField(term6429, term6429.getClass(), "first", null);
        setField(term6429, term6429.getClass(), "last", null);
        setField(term6429, term6429.getClass(), "propListHead", null);
        setIntField(term6429, term6429.getClass(), "sourcePosition", 0);
        setField(term6429, term6429.getClass(), "jsType", null);
        setField(term6429, term6429.getClass(), "parent", null);
        setField(term6422, term6422.getClass(), "last", term6429);
        setField(term6430, term6430.getClass(), "next", null);
        setIntField(term6430, term6430.getClass(), "type", 0);
        setIntField(term6430, term6430.getClass(), "intValue", 0);
        setField(term6430, term6430.getClass(), "objectValue", null);
        setField(term6422, term6422.getClass(), "propListHead", term6430);
        setIntField(term6422, term6422.getClass(), "sourcePosition", -1015274146);
        setField(term6422, term6422.getClass(), "jsType", null);
        setField(term6422, term6422.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term706;
        Object retValue = callMethod(klass, "isName", argTypes, null, args);
        assertTrue(recursiveEquals(term706, term6422));
        assertTrue(recursiveEquals(retValue, false));
    }

};


