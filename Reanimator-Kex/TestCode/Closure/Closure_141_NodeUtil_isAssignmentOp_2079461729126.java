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

public class NodeUtil_isAssignmentOp_2079461729126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term517;
     Object term5740;

    public NodeUtil_isAssignmentOp_2079461729126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term517 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term519 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term521 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term524 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term527 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term530 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term534 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term537 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term540 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term517, term517.getClass(), "type", -1347358701);
        setIntField(term519, term519.getClass(), "type", 1694224101);
        setIntField(term521, term521.getClass(), "type", 0);
        setField(term521, term521.getClass(), "next", null);
        setField(term521, term521.getClass(), "first", null);
        setField(term521, term521.getClass(), "last", null);
        setField(term521, term521.getClass(), "propListHead", null);
        setIntField(term521, term521.getClass(), "sourcePosition", 0);
        setField(term521, term521.getClass(), "jsType", null);
        setField(term521, term521.getClass(), "parent", null);
        setField(term519, term519.getClass(), "next", term521);
        setIntField(term524, term524.getClass(), "type", 0);
        setField(term524, term524.getClass(), "next", null);
        setField(term524, term524.getClass(), "first", null);
        setField(term524, term524.getClass(), "last", null);
        setField(term524, term524.getClass(), "propListHead", null);
        setIntField(term524, term524.getClass(), "sourcePosition", 0);
        setField(term524, term524.getClass(), "jsType", null);
        setField(term524, term524.getClass(), "parent", null);
        setField(term519, term519.getClass(), "first", term524);
        setIntField(term527, term527.getClass(), "type", 0);
        setField(term527, term527.getClass(), "next", null);
        setField(term527, term527.getClass(), "first", null);
        setField(term527, term527.getClass(), "last", null);
        setField(term527, term527.getClass(), "propListHead", null);
        setIntField(term527, term527.getClass(), "sourcePosition", 0);
        setField(term527, term527.getClass(), "jsType", null);
        setField(term527, term527.getClass(), "parent", null);
        setField(term519, term519.getClass(), "last", term527);
        setField(term530, term530.getClass(), "next", null);
        setIntField(term530, term530.getClass(), "type", 0);
        setIntField(term530, term530.getClass(), "intValue", 0);
        setField(term530, term530.getClass(), "objectValue", null);
        setField(term519, term519.getClass(), "propListHead", term530);
        setIntField(term519, term519.getClass(), "sourcePosition", -2131181468);
        setField(term519, term519.getClass(), "jsType", null);
        setField(term519, term519.getClass(), "parent", null);
        setField(term517, term517.getClass(), "next", term519);
        setIntField(term534, term534.getClass(), "type", 0);
        setField(term534, term534.getClass(), "next", null);
        setField(term534, term534.getClass(), "first", null);
        setField(term534, term534.getClass(), "last", null);
        setField(term534, term534.getClass(), "propListHead", null);
        setIntField(term534, term534.getClass(), "sourcePosition", 0);
        setField(term534, term534.getClass(), "jsType", null);
        setField(term534, term534.getClass(), "parent", null);
        setField(term517, term517.getClass(), "first", term534);
        setIntField(term537, term537.getClass(), "type", 0);
        setField(term537, term537.getClass(), "next", null);
        setField(term537, term537.getClass(), "first", null);
        setField(term537, term537.getClass(), "last", null);
        setField(term537, term537.getClass(), "propListHead", null);
        setIntField(term537, term537.getClass(), "sourcePosition", 0);
        setField(term537, term537.getClass(), "jsType", null);
        setField(term537, term537.getClass(), "parent", null);
        setField(term517, term517.getClass(), "last", term537);
        setField(term540, term540.getClass(), "next", null);
        setIntField(term540, term540.getClass(), "type", 0);
        setIntField(term540, term540.getClass(), "intValue", 0);
        setField(term540, term540.getClass(), "objectValue", null);
        setField(term517, term517.getClass(), "propListHead", term540);
        setIntField(term517, term517.getClass(), "sourcePosition", 282916351);
        setField(term517, term517.getClass(), "jsType", null);
        setField(term517, term517.getClass(), "parent", null);
        term5740 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5741 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5742 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5743 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5744 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5745 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term5746 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5747 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5748 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term5740, term5740.getClass(), "type", -1347358701);
        setIntField(term5741, term5741.getClass(), "type", 1694224101);
        setIntField(term5742, term5742.getClass(), "type", 0);
        setField(term5742, term5742.getClass(), "next", null);
        setField(term5742, term5742.getClass(), "first", null);
        setField(term5742, term5742.getClass(), "last", null);
        setField(term5742, term5742.getClass(), "propListHead", null);
        setIntField(term5742, term5742.getClass(), "sourcePosition", 0);
        setField(term5742, term5742.getClass(), "jsType", null);
        setField(term5742, term5742.getClass(), "parent", null);
        setField(term5741, term5741.getClass(), "next", term5742);
        setIntField(term5743, term5743.getClass(), "type", 0);
        setField(term5743, term5743.getClass(), "next", null);
        setField(term5743, term5743.getClass(), "first", null);
        setField(term5743, term5743.getClass(), "last", null);
        setField(term5743, term5743.getClass(), "propListHead", null);
        setIntField(term5743, term5743.getClass(), "sourcePosition", 0);
        setField(term5743, term5743.getClass(), "jsType", null);
        setField(term5743, term5743.getClass(), "parent", null);
        setField(term5741, term5741.getClass(), "first", term5743);
        setIntField(term5744, term5744.getClass(), "type", 0);
        setField(term5744, term5744.getClass(), "next", null);
        setField(term5744, term5744.getClass(), "first", null);
        setField(term5744, term5744.getClass(), "last", null);
        setField(term5744, term5744.getClass(), "propListHead", null);
        setIntField(term5744, term5744.getClass(), "sourcePosition", 0);
        setField(term5744, term5744.getClass(), "jsType", null);
        setField(term5744, term5744.getClass(), "parent", null);
        setField(term5741, term5741.getClass(), "last", term5744);
        setField(term5745, term5745.getClass(), "next", null);
        setIntField(term5745, term5745.getClass(), "type", 0);
        setIntField(term5745, term5745.getClass(), "intValue", 0);
        setField(term5745, term5745.getClass(), "objectValue", null);
        setField(term5741, term5741.getClass(), "propListHead", term5745);
        setIntField(term5741, term5741.getClass(), "sourcePosition", -2131181468);
        setField(term5741, term5741.getClass(), "jsType", null);
        setField(term5741, term5741.getClass(), "parent", null);
        setField(term5740, term5740.getClass(), "next", term5741);
        setIntField(term5746, term5746.getClass(), "type", 0);
        setField(term5746, term5746.getClass(), "next", null);
        setField(term5746, term5746.getClass(), "first", null);
        setField(term5746, term5746.getClass(), "last", null);
        setField(term5746, term5746.getClass(), "propListHead", null);
        setIntField(term5746, term5746.getClass(), "sourcePosition", 0);
        setField(term5746, term5746.getClass(), "jsType", null);
        setField(term5746, term5746.getClass(), "parent", null);
        setField(term5740, term5740.getClass(), "first", term5746);
        setIntField(term5747, term5747.getClass(), "type", 0);
        setField(term5747, term5747.getClass(), "next", null);
        setField(term5747, term5747.getClass(), "first", null);
        setField(term5747, term5747.getClass(), "last", null);
        setField(term5747, term5747.getClass(), "propListHead", null);
        setIntField(term5747, term5747.getClass(), "sourcePosition", 0);
        setField(term5747, term5747.getClass(), "jsType", null);
        setField(term5747, term5747.getClass(), "parent", null);
        setField(term5740, term5740.getClass(), "last", term5747);
        setField(term5748, term5748.getClass(), "next", null);
        setIntField(term5748, term5748.getClass(), "type", 0);
        setIntField(term5748, term5748.getClass(), "intValue", 0);
        setField(term5748, term5748.getClass(), "objectValue", null);
        setField(term5740, term5740.getClass(), "propListHead", term5748);
        setIntField(term5740, term5740.getClass(), "sourcePosition", 282916351);
        setField(term5740, term5740.getClass(), "jsType", null);
        setField(term5740, term5740.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term517;
        Object retValue = callMethod(klass, "isAssignmentOp", argTypes, null, args);
        assertTrue(recursiveEquals(term517, term5740));
        assertTrue(recursiveEquals(retValue, false));
    }

};


