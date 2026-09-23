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

public class NodeUtil_isStatementParent_1289829320228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1498;
     Object term13554;

    public NodeUtil_isStatementParent_1289829320228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1498 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1500 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1502 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1505 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1508 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1512 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1515 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1498, term1498.getClass(), "type", 633765954);
        setIntField(term1500, term1500.getClass(), "type", 34167717);
        setIntField(term1502, term1502.getClass(), "type", 0);
        setField(term1502, term1502.getClass(), "next", null);
        setField(term1502, term1502.getClass(), "first", null);
        setField(term1502, term1502.getClass(), "last", null);
        setField(term1502, term1502.getClass(), "propListHead", null);
        setIntField(term1502, term1502.getClass(), "sourcePosition", 0);
        setField(term1502, term1502.getClass(), "jsType", null);
        setField(term1502, term1502.getClass(), "parent", null);
        setField(term1500, term1500.getClass(), "next", term1502);
        setIntField(term1505, term1505.getClass(), "type", 0);
        setField(term1505, term1505.getClass(), "next", null);
        setField(term1505, term1505.getClass(), "first", null);
        setField(term1505, term1505.getClass(), "last", null);
        setField(term1505, term1505.getClass(), "propListHead", null);
        setIntField(term1505, term1505.getClass(), "sourcePosition", 0);
        setField(term1505, term1505.getClass(), "jsType", null);
        setField(term1505, term1505.getClass(), "parent", null);
        setField(term1500, term1500.getClass(), "first", term1505);
        setIntField(term1508, term1508.getClass(), "type", 0);
        setField(term1508, term1508.getClass(), "next", null);
        setField(term1508, term1508.getClass(), "first", null);
        setField(term1508, term1508.getClass(), "last", null);
        setField(term1508, term1508.getClass(), "propListHead", null);
        setIntField(term1508, term1508.getClass(), "sourcePosition", 0);
        setField(term1508, term1508.getClass(), "jsType", null);
        setField(term1508, term1508.getClass(), "parent", null);
        setField(term1500, term1500.getClass(), "last", term1508);
        setField(term1500, term1500.getClass(), "propListHead", null);
        setIntField(term1500, term1500.getClass(), "sourcePosition", 0);
        setField(term1500, term1500.getClass(), "jsType", null);
        setField(term1500, term1500.getClass(), "parent", null);
        setField(term1498, term1498.getClass(), "next", term1500);
        setIntField(term1512, term1512.getClass(), "type", 0);
        setField(term1512, term1512.getClass(), "next", null);
        setField(term1512, term1512.getClass(), "first", null);
        setField(term1512, term1512.getClass(), "last", null);
        setField(term1512, term1512.getClass(), "propListHead", null);
        setIntField(term1512, term1512.getClass(), "sourcePosition", 0);
        setField(term1512, term1512.getClass(), "jsType", null);
        setField(term1512, term1512.getClass(), "parent", null);
        setField(term1498, term1498.getClass(), "first", term1512);
        setIntField(term1515, term1515.getClass(), "type", 0);
        setField(term1515, term1515.getClass(), "next", null);
        setField(term1515, term1515.getClass(), "first", null);
        setField(term1515, term1515.getClass(), "last", null);
        setField(term1515, term1515.getClass(), "propListHead", null);
        setIntField(term1515, term1515.getClass(), "sourcePosition", 0);
        setField(term1515, term1515.getClass(), "jsType", null);
        setField(term1515, term1515.getClass(), "parent", null);
        setField(term1498, term1498.getClass(), "last", term1515);
        setField(term1498, term1498.getClass(), "propListHead", null);
        setIntField(term1498, term1498.getClass(), "sourcePosition", 0);
        setField(term1498, term1498.getClass(), "jsType", null);
        setField(term1498, term1498.getClass(), "parent", null);
        term13554 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13555 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13556 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13557 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13558 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13559 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13560 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13554, term13554.getClass(), "type", 633765954);
        setIntField(term13555, term13555.getClass(), "type", 34167717);
        setIntField(term13556, term13556.getClass(), "type", 0);
        setField(term13556, term13556.getClass(), "next", null);
        setField(term13556, term13556.getClass(), "first", null);
        setField(term13556, term13556.getClass(), "last", null);
        setField(term13556, term13556.getClass(), "propListHead", null);
        setIntField(term13556, term13556.getClass(), "sourcePosition", 0);
        setField(term13556, term13556.getClass(), "jsType", null);
        setField(term13556, term13556.getClass(), "parent", null);
        setField(term13555, term13555.getClass(), "next", term13556);
        setIntField(term13557, term13557.getClass(), "type", 0);
        setField(term13557, term13557.getClass(), "next", null);
        setField(term13557, term13557.getClass(), "first", null);
        setField(term13557, term13557.getClass(), "last", null);
        setField(term13557, term13557.getClass(), "propListHead", null);
        setIntField(term13557, term13557.getClass(), "sourcePosition", 0);
        setField(term13557, term13557.getClass(), "jsType", null);
        setField(term13557, term13557.getClass(), "parent", null);
        setField(term13555, term13555.getClass(), "first", term13557);
        setIntField(term13558, term13558.getClass(), "type", 0);
        setField(term13558, term13558.getClass(), "next", null);
        setField(term13558, term13558.getClass(), "first", null);
        setField(term13558, term13558.getClass(), "last", null);
        setField(term13558, term13558.getClass(), "propListHead", null);
        setIntField(term13558, term13558.getClass(), "sourcePosition", 0);
        setField(term13558, term13558.getClass(), "jsType", null);
        setField(term13558, term13558.getClass(), "parent", null);
        setField(term13555, term13555.getClass(), "last", term13558);
        setField(term13555, term13555.getClass(), "propListHead", null);
        setIntField(term13555, term13555.getClass(), "sourcePosition", 0);
        setField(term13555, term13555.getClass(), "jsType", null);
        setField(term13555, term13555.getClass(), "parent", null);
        setField(term13554, term13554.getClass(), "next", term13555);
        setIntField(term13559, term13559.getClass(), "type", 0);
        setField(term13559, term13559.getClass(), "next", null);
        setField(term13559, term13559.getClass(), "first", null);
        setField(term13559, term13559.getClass(), "last", null);
        setField(term13559, term13559.getClass(), "propListHead", null);
        setIntField(term13559, term13559.getClass(), "sourcePosition", 0);
        setField(term13559, term13559.getClass(), "jsType", null);
        setField(term13559, term13559.getClass(), "parent", null);
        setField(term13554, term13554.getClass(), "first", term13559);
        setIntField(term13560, term13560.getClass(), "type", 0);
        setField(term13560, term13560.getClass(), "next", null);
        setField(term13560, term13560.getClass(), "first", null);
        setField(term13560, term13560.getClass(), "last", null);
        setField(term13560, term13560.getClass(), "propListHead", null);
        setIntField(term13560, term13560.getClass(), "sourcePosition", 0);
        setField(term13560, term13560.getClass(), "jsType", null);
        setField(term13560, term13560.getClass(), "parent", null);
        setField(term13554, term13554.getClass(), "last", term13560);
        setField(term13554, term13554.getClass(), "propListHead", null);
        setIntField(term13554, term13554.getClass(), "sourcePosition", 0);
        setField(term13554, term13554.getClass(), "jsType", null);
        setField(term13554, term13554.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1498;
        Object retValue = callMethod(klass, "isStatementParent", argTypes, null, args);
        assertTrue(recursiveEquals(term1498, term13554));
        assertTrue(recursiveEquals(retValue, false));
    }

};


