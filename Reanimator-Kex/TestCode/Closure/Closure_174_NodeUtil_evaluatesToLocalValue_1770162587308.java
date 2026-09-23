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

public class NodeUtil_evaluatesToLocalValue_1770162587308 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4690;

    public NodeUtil_evaluatesToLocalValue_1770162587308() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4690 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4692 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4694 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4696 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4698 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4701 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4705 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4707 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4712 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4690, term4690.getClass(), "type", 1765633108);
        setIntField(term4692, term4692.getClass(), "type", 1312888741);
        setIntField(term4694, term4694.getClass(), "type", -1443680397);
        setIntField(term4696, term4696.getClass(), "type", -1331169079);
        setIntField(term4698, term4698.getClass(), "type", 1109050836);
        setField(term4698, term4698.getClass(), "next", null);
        setField(term4698, term4698.getClass(), "first", null);
        setField(term4698, term4698.getClass(), "last", null);
        setField(term4698, term4698.getClass(), "propListHead", null);
        setIntField(term4698, term4698.getClass(), "sourcePosition", 0);
        setField(term4698, term4698.getClass(), "jsType", null);
        setField(term4698, term4698.getClass(), "parent", null);
        setField(term4696, term4696.getClass(), "next", term4698);
        setIntField(term4701, term4701.getClass(), "type", 1978065000);
        setField(term4701, term4701.getClass(), "next", null);
        setField(term4701, term4701.getClass(), "first", null);
        setField(term4701, term4701.getClass(), "last", term4698);
        setField(term4701, term4701.getClass(), "propListHead", null);
        setIntField(term4701, term4701.getClass(), "sourcePosition", 0);
        setField(term4701, term4701.getClass(), "jsType", null);
        setField(term4701, term4701.getClass(), "parent", null);
        setField(term4696, term4696.getClass(), "first", term4701);
        setField(term4696, term4696.getClass(), "last", term4694);
        setField(term4696, term4696.getClass(), "propListHead", null);
        setIntField(term4696, term4696.getClass(), "sourcePosition", 0);
        setField(term4696, term4696.getClass(), "jsType", null);
        setField(term4696, term4696.getClass(), "parent", null);
        setField(term4694, term4694.getClass(), "next", term4696);
        setField(term4694, term4694.getClass(), "first", term4698);
        setIntField(term4705, term4705.getClass(), "type", -1005498887);
        setIntField(term4707, term4707.getClass(), "type", 1329150584);
        setField(term4707, term4707.getClass(), "next", null);
        setField(term4707, term4707.getClass(), "first", term4701);
        setField(term4707, term4707.getClass(), "last", term4696);
        setField(term4707, term4707.getClass(), "propListHead", null);
        setIntField(term4707, term4707.getClass(), "sourcePosition", 0);
        setField(term4707, term4707.getClass(), "jsType", null);
        setField(term4707, term4707.getClass(), "parent", null);
        setField(term4705, term4705.getClass(), "next", term4707);
        setField(term4705, term4705.getClass(), "first", term4692);
        setField(term4705, term4705.getClass(), "last", term4692);
        setField(term4705, term4705.getClass(), "propListHead", null);
        setIntField(term4705, term4705.getClass(), "sourcePosition", 0);
        setField(term4705, term4705.getClass(), "jsType", null);
        setField(term4705, term4705.getClass(), "parent", null);
        setField(term4694, term4694.getClass(), "last", term4705);
        setField(term4694, term4694.getClass(), "propListHead", null);
        setIntField(term4694, term4694.getClass(), "sourcePosition", 0);
        setField(term4694, term4694.getClass(), "jsType", null);
        setField(term4694, term4694.getClass(), "parent", null);
        setField(term4692, term4692.getClass(), "next", term4694);
        setIntField(term4712, term4712.getClass(), "type", -1825382367);
        setField(term4712, term4712.getClass(), "next", term4705);
        setField(term4712, term4712.getClass(), "first", term4707);
        setField(term4712, term4712.getClass(), "last", term4690);
        setField(term4712, term4712.getClass(), "propListHead", null);
        setIntField(term4712, term4712.getClass(), "sourcePosition", 0);
        setField(term4712, term4712.getClass(), "jsType", null);
        setField(term4712, term4712.getClass(), "parent", null);
        setField(term4692, term4692.getClass(), "first", term4712);
        setField(term4692, term4692.getClass(), "last", term4712);
        setField(term4692, term4692.getClass(), "propListHead", null);
        setIntField(term4692, term4692.getClass(), "sourcePosition", 0);
        setField(term4692, term4692.getClass(), "jsType", null);
        setField(term4692, term4692.getClass(), "parent", null);
        setField(term4690, term4690.getClass(), "next", term4692);
        setField(term4690, term4690.getClass(), "first", term4696);
        setField(term4690, term4690.getClass(), "last", term4698);
        setField(term4690, term4690.getClass(), "propListHead", null);
        setIntField(term4690, term4690.getClass(), "sourcePosition", 0);
        setField(term4690, term4690.getClass(), "jsType", null);
        setField(term4690, term4690.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[2];
        args[0] = term4690;
        args[1] = null;
        try {
            callMethod(klass, "evaluatesToLocalValue", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


