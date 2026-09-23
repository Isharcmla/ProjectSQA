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

public class NodeUtil_isUndefined_497061199192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1022;
     Object term10694;

    public NodeUtil_isUndefined_497061199192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1022 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1024 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1026 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1029 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1032 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1035 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1039 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1042 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1045 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1022, term1022.getClass(), "type", 765731371);
        setIntField(term1024, term1024.getClass(), "type", -1941343035);
        setIntField(term1026, term1026.getClass(), "type", 0);
        setField(term1026, term1026.getClass(), "next", null);
        setField(term1026, term1026.getClass(), "first", null);
        setField(term1026, term1026.getClass(), "last", null);
        setField(term1026, term1026.getClass(), "propListHead", null);
        setIntField(term1026, term1026.getClass(), "sourcePosition", 0);
        setField(term1026, term1026.getClass(), "jsType", null);
        setField(term1026, term1026.getClass(), "parent", null);
        setField(term1024, term1024.getClass(), "next", term1026);
        setIntField(term1029, term1029.getClass(), "type", 0);
        setField(term1029, term1029.getClass(), "next", null);
        setField(term1029, term1029.getClass(), "first", null);
        setField(term1029, term1029.getClass(), "last", null);
        setField(term1029, term1029.getClass(), "propListHead", null);
        setIntField(term1029, term1029.getClass(), "sourcePosition", 0);
        setField(term1029, term1029.getClass(), "jsType", null);
        setField(term1029, term1029.getClass(), "parent", null);
        setField(term1024, term1024.getClass(), "first", term1029);
        setIntField(term1032, term1032.getClass(), "type", 0);
        setField(term1032, term1032.getClass(), "next", null);
        setField(term1032, term1032.getClass(), "first", null);
        setField(term1032, term1032.getClass(), "last", null);
        setField(term1032, term1032.getClass(), "propListHead", null);
        setIntField(term1032, term1032.getClass(), "sourcePosition", 0);
        setField(term1032, term1032.getClass(), "jsType", null);
        setField(term1032, term1032.getClass(), "parent", null);
        setField(term1024, term1024.getClass(), "last", term1032);
        setField(term1035, term1035.getClass(), "next", null);
        setIntField(term1035, term1035.getClass(), "type", 0);
        setIntField(term1035, term1035.getClass(), "intValue", 0);
        setField(term1035, term1035.getClass(), "objectValue", null);
        setField(term1024, term1024.getClass(), "propListHead", term1035);
        setIntField(term1024, term1024.getClass(), "sourcePosition", -1748391876);
        setField(term1024, term1024.getClass(), "jsType", null);
        setField(term1024, term1024.getClass(), "parent", null);
        setField(term1022, term1022.getClass(), "next", term1024);
        setIntField(term1039, term1039.getClass(), "type", 0);
        setField(term1039, term1039.getClass(), "next", null);
        setField(term1039, term1039.getClass(), "first", null);
        setField(term1039, term1039.getClass(), "last", null);
        setField(term1039, term1039.getClass(), "propListHead", null);
        setIntField(term1039, term1039.getClass(), "sourcePosition", 0);
        setField(term1039, term1039.getClass(), "jsType", null);
        setField(term1039, term1039.getClass(), "parent", null);
        setField(term1022, term1022.getClass(), "first", term1039);
        setIntField(term1042, term1042.getClass(), "type", 0);
        setField(term1042, term1042.getClass(), "next", null);
        setField(term1042, term1042.getClass(), "first", null);
        setField(term1042, term1042.getClass(), "last", null);
        setField(term1042, term1042.getClass(), "propListHead", null);
        setIntField(term1042, term1042.getClass(), "sourcePosition", 0);
        setField(term1042, term1042.getClass(), "jsType", null);
        setField(term1042, term1042.getClass(), "parent", null);
        setField(term1022, term1022.getClass(), "last", term1042);
        setField(term1045, term1045.getClass(), "next", null);
        setIntField(term1045, term1045.getClass(), "type", 0);
        setIntField(term1045, term1045.getClass(), "intValue", 0);
        setField(term1045, term1045.getClass(), "objectValue", null);
        setField(term1022, term1022.getClass(), "propListHead", term1045);
        setIntField(term1022, term1022.getClass(), "sourcePosition", 43258317);
        setField(term1022, term1022.getClass(), "jsType", null);
        setField(term1022, term1022.getClass(), "parent", null);
        term10694 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10695 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10696 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10697 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10698 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10699 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term10700 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10701 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10702 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term10694, term10694.getClass(), "type", 765731371);
        setIntField(term10695, term10695.getClass(), "type", -1941343035);
        setIntField(term10696, term10696.getClass(), "type", 0);
        setField(term10696, term10696.getClass(), "next", null);
        setField(term10696, term10696.getClass(), "first", null);
        setField(term10696, term10696.getClass(), "last", null);
        setField(term10696, term10696.getClass(), "propListHead", null);
        setIntField(term10696, term10696.getClass(), "sourcePosition", 0);
        setField(term10696, term10696.getClass(), "jsType", null);
        setField(term10696, term10696.getClass(), "parent", null);
        setField(term10695, term10695.getClass(), "next", term10696);
        setIntField(term10697, term10697.getClass(), "type", 0);
        setField(term10697, term10697.getClass(), "next", null);
        setField(term10697, term10697.getClass(), "first", null);
        setField(term10697, term10697.getClass(), "last", null);
        setField(term10697, term10697.getClass(), "propListHead", null);
        setIntField(term10697, term10697.getClass(), "sourcePosition", 0);
        setField(term10697, term10697.getClass(), "jsType", null);
        setField(term10697, term10697.getClass(), "parent", null);
        setField(term10695, term10695.getClass(), "first", term10697);
        setIntField(term10698, term10698.getClass(), "type", 0);
        setField(term10698, term10698.getClass(), "next", null);
        setField(term10698, term10698.getClass(), "first", null);
        setField(term10698, term10698.getClass(), "last", null);
        setField(term10698, term10698.getClass(), "propListHead", null);
        setIntField(term10698, term10698.getClass(), "sourcePosition", 0);
        setField(term10698, term10698.getClass(), "jsType", null);
        setField(term10698, term10698.getClass(), "parent", null);
        setField(term10695, term10695.getClass(), "last", term10698);
        setField(term10699, term10699.getClass(), "next", null);
        setIntField(term10699, term10699.getClass(), "type", 0);
        setIntField(term10699, term10699.getClass(), "intValue", 0);
        setField(term10699, term10699.getClass(), "objectValue", null);
        setField(term10695, term10695.getClass(), "propListHead", term10699);
        setIntField(term10695, term10695.getClass(), "sourcePosition", -1748391876);
        setField(term10695, term10695.getClass(), "jsType", null);
        setField(term10695, term10695.getClass(), "parent", null);
        setField(term10694, term10694.getClass(), "next", term10695);
        setIntField(term10700, term10700.getClass(), "type", 0);
        setField(term10700, term10700.getClass(), "next", null);
        setField(term10700, term10700.getClass(), "first", null);
        setField(term10700, term10700.getClass(), "last", null);
        setField(term10700, term10700.getClass(), "propListHead", null);
        setIntField(term10700, term10700.getClass(), "sourcePosition", 0);
        setField(term10700, term10700.getClass(), "jsType", null);
        setField(term10700, term10700.getClass(), "parent", null);
        setField(term10694, term10694.getClass(), "first", term10700);
        setIntField(term10701, term10701.getClass(), "type", 0);
        setField(term10701, term10701.getClass(), "next", null);
        setField(term10701, term10701.getClass(), "first", null);
        setField(term10701, term10701.getClass(), "last", null);
        setField(term10701, term10701.getClass(), "propListHead", null);
        setIntField(term10701, term10701.getClass(), "sourcePosition", 0);
        setField(term10701, term10701.getClass(), "jsType", null);
        setField(term10701, term10701.getClass(), "parent", null);
        setField(term10694, term10694.getClass(), "last", term10701);
        setField(term10702, term10702.getClass(), "next", null);
        setIntField(term10702, term10702.getClass(), "type", 0);
        setIntField(term10702, term10702.getClass(), "intValue", 0);
        setField(term10702, term10702.getClass(), "objectValue", null);
        setField(term10694, term10694.getClass(), "propListHead", term10702);
        setIntField(term10694, term10694.getClass(), "sourcePosition", 43258317);
        setField(term10694, term10694.getClass(), "jsType", null);
        setField(term10694, term10694.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1022;
        Object retValue = callMethod(klass, "isUndefined", argTypes, null, args);
        assertTrue(recursiveEquals(term1022, term10694));
        assertTrue(recursiveEquals(retValue, false));
    }

};


