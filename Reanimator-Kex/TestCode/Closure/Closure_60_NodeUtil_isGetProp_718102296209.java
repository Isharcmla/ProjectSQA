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

public class NodeUtil_isGetProp_718102296209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1078;
     Object term10692;

    public NodeUtil_isGetProp_718102296209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1078 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1080 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1082 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1085 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1088 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1092 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1095 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1078, term1078.getClass(), "type", -2063365430);
        setIntField(term1080, term1080.getClass(), "type", -1133405894);
        setIntField(term1082, term1082.getClass(), "type", 0);
        setField(term1082, term1082.getClass(), "next", null);
        setField(term1082, term1082.getClass(), "first", null);
        setField(term1082, term1082.getClass(), "last", null);
        setField(term1082, term1082.getClass(), "propListHead", null);
        setIntField(term1082, term1082.getClass(), "sourcePosition", 0);
        setField(term1082, term1082.getClass(), "jsType", null);
        setField(term1082, term1082.getClass(), "parent", null);
        setField(term1080, term1080.getClass(), "next", term1082);
        setIntField(term1085, term1085.getClass(), "type", 0);
        setField(term1085, term1085.getClass(), "next", null);
        setField(term1085, term1085.getClass(), "first", null);
        setField(term1085, term1085.getClass(), "last", null);
        setField(term1085, term1085.getClass(), "propListHead", null);
        setIntField(term1085, term1085.getClass(), "sourcePosition", 0);
        setField(term1085, term1085.getClass(), "jsType", null);
        setField(term1085, term1085.getClass(), "parent", null);
        setField(term1080, term1080.getClass(), "first", term1085);
        setIntField(term1088, term1088.getClass(), "type", 0);
        setField(term1088, term1088.getClass(), "next", null);
        setField(term1088, term1088.getClass(), "first", null);
        setField(term1088, term1088.getClass(), "last", null);
        setField(term1088, term1088.getClass(), "propListHead", null);
        setIntField(term1088, term1088.getClass(), "sourcePosition", 0);
        setField(term1088, term1088.getClass(), "jsType", null);
        setField(term1088, term1088.getClass(), "parent", null);
        setField(term1080, term1080.getClass(), "last", term1088);
        setField(term1080, term1080.getClass(), "propListHead", null);
        setIntField(term1080, term1080.getClass(), "sourcePosition", 0);
        setField(term1080, term1080.getClass(), "jsType", null);
        setField(term1080, term1080.getClass(), "parent", null);
        setField(term1078, term1078.getClass(), "next", term1080);
        setIntField(term1092, term1092.getClass(), "type", 0);
        setField(term1092, term1092.getClass(), "next", null);
        setField(term1092, term1092.getClass(), "first", null);
        setField(term1092, term1092.getClass(), "last", null);
        setField(term1092, term1092.getClass(), "propListHead", null);
        setIntField(term1092, term1092.getClass(), "sourcePosition", 0);
        setField(term1092, term1092.getClass(), "jsType", null);
        setField(term1092, term1092.getClass(), "parent", null);
        setField(term1078, term1078.getClass(), "first", term1092);
        setIntField(term1095, term1095.getClass(), "type", 0);
        setField(term1095, term1095.getClass(), "next", null);
        setField(term1095, term1095.getClass(), "first", null);
        setField(term1095, term1095.getClass(), "last", null);
        setField(term1095, term1095.getClass(), "propListHead", null);
        setIntField(term1095, term1095.getClass(), "sourcePosition", 0);
        setField(term1095, term1095.getClass(), "jsType", null);
        setField(term1095, term1095.getClass(), "parent", null);
        setField(term1078, term1078.getClass(), "last", term1095);
        setField(term1078, term1078.getClass(), "propListHead", null);
        setIntField(term1078, term1078.getClass(), "sourcePosition", 0);
        setField(term1078, term1078.getClass(), "jsType", null);
        setField(term1078, term1078.getClass(), "parent", null);
        term10692 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10693 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10694 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10695 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10696 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10697 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10698 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10692, term10692.getClass(), "type", -2063365430);
        setIntField(term10693, term10693.getClass(), "type", -1133405894);
        setIntField(term10694, term10694.getClass(), "type", 0);
        setField(term10694, term10694.getClass(), "next", null);
        setField(term10694, term10694.getClass(), "first", null);
        setField(term10694, term10694.getClass(), "last", null);
        setField(term10694, term10694.getClass(), "propListHead", null);
        setIntField(term10694, term10694.getClass(), "sourcePosition", 0);
        setField(term10694, term10694.getClass(), "jsType", null);
        setField(term10694, term10694.getClass(), "parent", null);
        setField(term10693, term10693.getClass(), "next", term10694);
        setIntField(term10695, term10695.getClass(), "type", 0);
        setField(term10695, term10695.getClass(), "next", null);
        setField(term10695, term10695.getClass(), "first", null);
        setField(term10695, term10695.getClass(), "last", null);
        setField(term10695, term10695.getClass(), "propListHead", null);
        setIntField(term10695, term10695.getClass(), "sourcePosition", 0);
        setField(term10695, term10695.getClass(), "jsType", null);
        setField(term10695, term10695.getClass(), "parent", null);
        setField(term10693, term10693.getClass(), "first", term10695);
        setIntField(term10696, term10696.getClass(), "type", 0);
        setField(term10696, term10696.getClass(), "next", null);
        setField(term10696, term10696.getClass(), "first", null);
        setField(term10696, term10696.getClass(), "last", null);
        setField(term10696, term10696.getClass(), "propListHead", null);
        setIntField(term10696, term10696.getClass(), "sourcePosition", 0);
        setField(term10696, term10696.getClass(), "jsType", null);
        setField(term10696, term10696.getClass(), "parent", null);
        setField(term10693, term10693.getClass(), "last", term10696);
        setField(term10693, term10693.getClass(), "propListHead", null);
        setIntField(term10693, term10693.getClass(), "sourcePosition", 0);
        setField(term10693, term10693.getClass(), "jsType", null);
        setField(term10693, term10693.getClass(), "parent", null);
        setField(term10692, term10692.getClass(), "next", term10693);
        setIntField(term10697, term10697.getClass(), "type", 0);
        setField(term10697, term10697.getClass(), "next", null);
        setField(term10697, term10697.getClass(), "first", null);
        setField(term10697, term10697.getClass(), "last", null);
        setField(term10697, term10697.getClass(), "propListHead", null);
        setIntField(term10697, term10697.getClass(), "sourcePosition", 0);
        setField(term10697, term10697.getClass(), "jsType", null);
        setField(term10697, term10697.getClass(), "parent", null);
        setField(term10692, term10692.getClass(), "first", term10697);
        setIntField(term10698, term10698.getClass(), "type", 0);
        setField(term10698, term10698.getClass(), "next", null);
        setField(term10698, term10698.getClass(), "first", null);
        setField(term10698, term10698.getClass(), "last", null);
        setField(term10698, term10698.getClass(), "propListHead", null);
        setIntField(term10698, term10698.getClass(), "sourcePosition", 0);
        setField(term10698, term10698.getClass(), "jsType", null);
        setField(term10698, term10698.getClass(), "parent", null);
        setField(term10692, term10692.getClass(), "last", term10698);
        setField(term10692, term10692.getClass(), "propListHead", null);
        setIntField(term10692, term10692.getClass(), "sourcePosition", 0);
        setField(term10692, term10692.getClass(), "jsType", null);
        setField(term10692, term10692.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1078;
        Object retValue = callMethod(klass, "isGetProp", argTypes, null, args);
        assertTrue(recursiveEquals(term1078, term10692));
        assertTrue(recursiveEquals(retValue, false));
    }

};


