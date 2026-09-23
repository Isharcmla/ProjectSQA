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

public class NodeUtil_getSourceName_466164534296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4241;
     Object term25633;

    public NodeUtil_getSourceName_466164534296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4241 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4243 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4245 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4248 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4251 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4254 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term4258 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4261 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4264 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term4241, term4241.getClass(), "type", -1702132549);
        setIntField(term4243, term4243.getClass(), "type", 1957633116);
        setIntField(term4245, term4245.getClass(), "type", 0);
        setField(term4245, term4245.getClass(), "next", null);
        setField(term4245, term4245.getClass(), "first", null);
        setField(term4245, term4245.getClass(), "last", null);
        setField(term4245, term4245.getClass(), "propListHead", null);
        setIntField(term4245, term4245.getClass(), "sourcePosition", 0);
        setField(term4245, term4245.getClass(), "jsType", null);
        setField(term4245, term4245.getClass(), "parent", null);
        setField(term4243, term4243.getClass(), "next", term4245);
        setIntField(term4248, term4248.getClass(), "type", 0);
        setField(term4248, term4248.getClass(), "next", null);
        setField(term4248, term4248.getClass(), "first", null);
        setField(term4248, term4248.getClass(), "last", null);
        setField(term4248, term4248.getClass(), "propListHead", null);
        setIntField(term4248, term4248.getClass(), "sourcePosition", 0);
        setField(term4248, term4248.getClass(), "jsType", null);
        setField(term4248, term4248.getClass(), "parent", null);
        setField(term4243, term4243.getClass(), "first", term4248);
        setIntField(term4251, term4251.getClass(), "type", 0);
        setField(term4251, term4251.getClass(), "next", null);
        setField(term4251, term4251.getClass(), "first", null);
        setField(term4251, term4251.getClass(), "last", null);
        setField(term4251, term4251.getClass(), "propListHead", null);
        setIntField(term4251, term4251.getClass(), "sourcePosition", 0);
        setField(term4251, term4251.getClass(), "jsType", null);
        setField(term4251, term4251.getClass(), "parent", null);
        setField(term4243, term4243.getClass(), "last", term4251);
        setField(term4254, term4254.getClass(), "next", null);
        setIntField(term4254, term4254.getClass(), "type", 0);
        setIntField(term4254, term4254.getClass(), "intValue", 0);
        setField(term4254, term4254.getClass(), "objectValue", null);
        setField(term4243, term4243.getClass(), "propListHead", term4254);
        setIntField(term4243, term4243.getClass(), "sourcePosition", 1846399918);
        setField(term4243, term4243.getClass(), "jsType", null);
        setField(term4243, term4243.getClass(), "parent", null);
        setField(term4241, term4241.getClass(), "next", term4243);
        setIntField(term4258, term4258.getClass(), "type", 0);
        setField(term4258, term4258.getClass(), "next", null);
        setField(term4258, term4258.getClass(), "first", null);
        setField(term4258, term4258.getClass(), "last", null);
        setField(term4258, term4258.getClass(), "propListHead", null);
        setIntField(term4258, term4258.getClass(), "sourcePosition", 0);
        setField(term4258, term4258.getClass(), "jsType", null);
        setField(term4258, term4258.getClass(), "parent", null);
        setField(term4241, term4241.getClass(), "first", term4258);
        setIntField(term4261, term4261.getClass(), "type", 0);
        setField(term4261, term4261.getClass(), "next", null);
        setField(term4261, term4261.getClass(), "first", null);
        setField(term4261, term4261.getClass(), "last", null);
        setField(term4261, term4261.getClass(), "propListHead", null);
        setIntField(term4261, term4261.getClass(), "sourcePosition", 0);
        setField(term4261, term4261.getClass(), "jsType", null);
        setField(term4261, term4261.getClass(), "parent", null);
        setField(term4241, term4241.getClass(), "last", term4261);
        setField(term4264, term4264.getClass(), "next", null);
        setIntField(term4264, term4264.getClass(), "type", 0);
        setIntField(term4264, term4264.getClass(), "intValue", 0);
        setField(term4264, term4264.getClass(), "objectValue", null);
        setField(term4241, term4241.getClass(), "propListHead", term4264);
        setIntField(term4241, term4241.getClass(), "sourcePosition", 35388821);
        setField(term4241, term4241.getClass(), "jsType", null);
        setField(term4241, term4241.getClass(), "parent", null);
        term25633 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25634 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25635 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25636 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25637 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25638 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term25639 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25640 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25641 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term25633, term25633.getClass(), "type", -1702132549);
        setIntField(term25634, term25634.getClass(), "type", 1957633116);
        setIntField(term25635, term25635.getClass(), "type", 0);
        setField(term25635, term25635.getClass(), "next", null);
        setField(term25635, term25635.getClass(), "first", null);
        setField(term25635, term25635.getClass(), "last", null);
        setField(term25635, term25635.getClass(), "propListHead", null);
        setIntField(term25635, term25635.getClass(), "sourcePosition", 0);
        setField(term25635, term25635.getClass(), "jsType", null);
        setField(term25635, term25635.getClass(), "parent", null);
        setField(term25634, term25634.getClass(), "next", term25635);
        setIntField(term25636, term25636.getClass(), "type", 0);
        setField(term25636, term25636.getClass(), "next", null);
        setField(term25636, term25636.getClass(), "first", null);
        setField(term25636, term25636.getClass(), "last", null);
        setField(term25636, term25636.getClass(), "propListHead", null);
        setIntField(term25636, term25636.getClass(), "sourcePosition", 0);
        setField(term25636, term25636.getClass(), "jsType", null);
        setField(term25636, term25636.getClass(), "parent", null);
        setField(term25634, term25634.getClass(), "first", term25636);
        setIntField(term25637, term25637.getClass(), "type", 0);
        setField(term25637, term25637.getClass(), "next", null);
        setField(term25637, term25637.getClass(), "first", null);
        setField(term25637, term25637.getClass(), "last", null);
        setField(term25637, term25637.getClass(), "propListHead", null);
        setIntField(term25637, term25637.getClass(), "sourcePosition", 0);
        setField(term25637, term25637.getClass(), "jsType", null);
        setField(term25637, term25637.getClass(), "parent", null);
        setField(term25634, term25634.getClass(), "last", term25637);
        setField(term25638, term25638.getClass(), "next", null);
        setIntField(term25638, term25638.getClass(), "type", 0);
        setIntField(term25638, term25638.getClass(), "intValue", 0);
        setField(term25638, term25638.getClass(), "objectValue", null);
        setField(term25634, term25634.getClass(), "propListHead", term25638);
        setIntField(term25634, term25634.getClass(), "sourcePosition", 1846399918);
        setField(term25634, term25634.getClass(), "jsType", null);
        setField(term25634, term25634.getClass(), "parent", null);
        setField(term25633, term25633.getClass(), "next", term25634);
        setIntField(term25639, term25639.getClass(), "type", 0);
        setField(term25639, term25639.getClass(), "next", null);
        setField(term25639, term25639.getClass(), "first", null);
        setField(term25639, term25639.getClass(), "last", null);
        setField(term25639, term25639.getClass(), "propListHead", null);
        setIntField(term25639, term25639.getClass(), "sourcePosition", 0);
        setField(term25639, term25639.getClass(), "jsType", null);
        setField(term25639, term25639.getClass(), "parent", null);
        setField(term25633, term25633.getClass(), "first", term25639);
        setIntField(term25640, term25640.getClass(), "type", 0);
        setField(term25640, term25640.getClass(), "next", null);
        setField(term25640, term25640.getClass(), "first", null);
        setField(term25640, term25640.getClass(), "last", null);
        setField(term25640, term25640.getClass(), "propListHead", null);
        setIntField(term25640, term25640.getClass(), "sourcePosition", 0);
        setField(term25640, term25640.getClass(), "jsType", null);
        setField(term25640, term25640.getClass(), "parent", null);
        setField(term25633, term25633.getClass(), "last", term25640);
        setField(term25641, term25641.getClass(), "next", null);
        setIntField(term25641, term25641.getClass(), "type", 0);
        setIntField(term25641, term25641.getClass(), "intValue", 0);
        setField(term25641, term25641.getClass(), "objectValue", null);
        setField(term25633, term25633.getClass(), "propListHead", term25641);
        setIntField(term25633, term25633.getClass(), "sourcePosition", 35388821);
        setField(term25633, term25633.getClass(), "jsType", null);
        setField(term25633, term25633.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4241;
        callMethod(klass, "getSourceName", argTypes, null, args);
        assertTrue(recursiveEquals(term4241, term25633));
    }

};


