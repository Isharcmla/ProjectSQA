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

public class NodeUtil_isHoistedFunctionDeclaration_1630852851242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2405;
     Object term15760;

    public NodeUtil_isHoistedFunctionDeclaration_1630852851242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2405 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2407 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2409 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2412 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2415 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2418 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2422 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2425 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2428 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2405, term2405.getClass(), "type", 1558810715);
        setIntField(term2407, term2407.getClass(), "type", 802673242);
        setIntField(term2409, term2409.getClass(), "type", 0);
        setField(term2409, term2409.getClass(), "next", null);
        setField(term2409, term2409.getClass(), "first", null);
        setField(term2409, term2409.getClass(), "last", null);
        setField(term2409, term2409.getClass(), "propListHead", null);
        setIntField(term2409, term2409.getClass(), "sourcePosition", 0);
        setField(term2409, term2409.getClass(), "jsType", null);
        setField(term2409, term2409.getClass(), "parent", null);
        setField(term2407, term2407.getClass(), "next", term2409);
        setIntField(term2412, term2412.getClass(), "type", 0);
        setField(term2412, term2412.getClass(), "next", null);
        setField(term2412, term2412.getClass(), "first", null);
        setField(term2412, term2412.getClass(), "last", null);
        setField(term2412, term2412.getClass(), "propListHead", null);
        setIntField(term2412, term2412.getClass(), "sourcePosition", 0);
        setField(term2412, term2412.getClass(), "jsType", null);
        setField(term2412, term2412.getClass(), "parent", null);
        setField(term2407, term2407.getClass(), "first", term2412);
        setIntField(term2415, term2415.getClass(), "type", 0);
        setField(term2415, term2415.getClass(), "next", null);
        setField(term2415, term2415.getClass(), "first", null);
        setField(term2415, term2415.getClass(), "last", null);
        setField(term2415, term2415.getClass(), "propListHead", null);
        setIntField(term2415, term2415.getClass(), "sourcePosition", 0);
        setField(term2415, term2415.getClass(), "jsType", null);
        setField(term2415, term2415.getClass(), "parent", null);
        setField(term2407, term2407.getClass(), "last", term2415);
        setField(term2418, term2418.getClass(), "next", null);
        setIntField(term2418, term2418.getClass(), "type", 0);
        setIntField(term2418, term2418.getClass(), "intValue", 0);
        setField(term2418, term2418.getClass(), "objectValue", null);
        setField(term2407, term2407.getClass(), "propListHead", term2418);
        setIntField(term2407, term2407.getClass(), "sourcePosition", 2052244839);
        setField(term2407, term2407.getClass(), "jsType", null);
        setField(term2407, term2407.getClass(), "parent", null);
        setField(term2405, term2405.getClass(), "next", term2407);
        setIntField(term2422, term2422.getClass(), "type", 0);
        setField(term2422, term2422.getClass(), "next", null);
        setField(term2422, term2422.getClass(), "first", null);
        setField(term2422, term2422.getClass(), "last", null);
        setField(term2422, term2422.getClass(), "propListHead", null);
        setIntField(term2422, term2422.getClass(), "sourcePosition", 0);
        setField(term2422, term2422.getClass(), "jsType", null);
        setField(term2422, term2422.getClass(), "parent", null);
        setField(term2405, term2405.getClass(), "first", term2422);
        setIntField(term2425, term2425.getClass(), "type", 0);
        setField(term2425, term2425.getClass(), "next", null);
        setField(term2425, term2425.getClass(), "first", null);
        setField(term2425, term2425.getClass(), "last", null);
        setField(term2425, term2425.getClass(), "propListHead", null);
        setIntField(term2425, term2425.getClass(), "sourcePosition", 0);
        setField(term2425, term2425.getClass(), "jsType", null);
        setField(term2425, term2425.getClass(), "parent", null);
        setField(term2405, term2405.getClass(), "last", term2425);
        setField(term2428, term2428.getClass(), "next", null);
        setIntField(term2428, term2428.getClass(), "type", 0);
        setIntField(term2428, term2428.getClass(), "intValue", 0);
        setField(term2428, term2428.getClass(), "objectValue", null);
        setField(term2405, term2405.getClass(), "propListHead", term2428);
        setIntField(term2405, term2405.getClass(), "sourcePosition", -1763480506);
        setField(term2405, term2405.getClass(), "jsType", null);
        setField(term2405, term2405.getClass(), "parent", null);
        term15760 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15761 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15762 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15763 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15764 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15765 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term15766 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15767 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15768 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term15760, term15760.getClass(), "type", 1558810715);
        setIntField(term15761, term15761.getClass(), "type", 802673242);
        setIntField(term15762, term15762.getClass(), "type", 0);
        setField(term15762, term15762.getClass(), "next", null);
        setField(term15762, term15762.getClass(), "first", null);
        setField(term15762, term15762.getClass(), "last", null);
        setField(term15762, term15762.getClass(), "propListHead", null);
        setIntField(term15762, term15762.getClass(), "sourcePosition", 0);
        setField(term15762, term15762.getClass(), "jsType", null);
        setField(term15762, term15762.getClass(), "parent", null);
        setField(term15761, term15761.getClass(), "next", term15762);
        setIntField(term15763, term15763.getClass(), "type", 0);
        setField(term15763, term15763.getClass(), "next", null);
        setField(term15763, term15763.getClass(), "first", null);
        setField(term15763, term15763.getClass(), "last", null);
        setField(term15763, term15763.getClass(), "propListHead", null);
        setIntField(term15763, term15763.getClass(), "sourcePosition", 0);
        setField(term15763, term15763.getClass(), "jsType", null);
        setField(term15763, term15763.getClass(), "parent", null);
        setField(term15761, term15761.getClass(), "first", term15763);
        setIntField(term15764, term15764.getClass(), "type", 0);
        setField(term15764, term15764.getClass(), "next", null);
        setField(term15764, term15764.getClass(), "first", null);
        setField(term15764, term15764.getClass(), "last", null);
        setField(term15764, term15764.getClass(), "propListHead", null);
        setIntField(term15764, term15764.getClass(), "sourcePosition", 0);
        setField(term15764, term15764.getClass(), "jsType", null);
        setField(term15764, term15764.getClass(), "parent", null);
        setField(term15761, term15761.getClass(), "last", term15764);
        setField(term15765, term15765.getClass(), "next", null);
        setIntField(term15765, term15765.getClass(), "type", 0);
        setIntField(term15765, term15765.getClass(), "intValue", 0);
        setField(term15765, term15765.getClass(), "objectValue", null);
        setField(term15761, term15761.getClass(), "propListHead", term15765);
        setIntField(term15761, term15761.getClass(), "sourcePosition", 2052244839);
        setField(term15761, term15761.getClass(), "jsType", null);
        setField(term15761, term15761.getClass(), "parent", null);
        setField(term15760, term15760.getClass(), "next", term15761);
        setIntField(term15766, term15766.getClass(), "type", 0);
        setField(term15766, term15766.getClass(), "next", null);
        setField(term15766, term15766.getClass(), "first", null);
        setField(term15766, term15766.getClass(), "last", null);
        setField(term15766, term15766.getClass(), "propListHead", null);
        setIntField(term15766, term15766.getClass(), "sourcePosition", 0);
        setField(term15766, term15766.getClass(), "jsType", null);
        setField(term15766, term15766.getClass(), "parent", null);
        setField(term15760, term15760.getClass(), "first", term15766);
        setIntField(term15767, term15767.getClass(), "type", 0);
        setField(term15767, term15767.getClass(), "next", null);
        setField(term15767, term15767.getClass(), "first", null);
        setField(term15767, term15767.getClass(), "last", null);
        setField(term15767, term15767.getClass(), "propListHead", null);
        setIntField(term15767, term15767.getClass(), "sourcePosition", 0);
        setField(term15767, term15767.getClass(), "jsType", null);
        setField(term15767, term15767.getClass(), "parent", null);
        setField(term15760, term15760.getClass(), "last", term15767);
        setField(term15768, term15768.getClass(), "next", null);
        setIntField(term15768, term15768.getClass(), "type", 0);
        setIntField(term15768, term15768.getClass(), "intValue", 0);
        setField(term15768, term15768.getClass(), "objectValue", null);
        setField(term15760, term15760.getClass(), "propListHead", term15768);
        setIntField(term15760, term15760.getClass(), "sourcePosition", -1763480506);
        setField(term15760, term15760.getClass(), "jsType", null);
        setField(term15760, term15760.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2405;
        Object retValue = callMethod(klass, "isHoistedFunctionDeclaration", argTypes, null, args);
        assertTrue(recursiveEquals(term2405, term15760));
        assertTrue(recursiveEquals(retValue, false));
    }

};


