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

public class NodeUtil_canBeSideEffected_1382575805184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term806;
     Object term9753;

    public NodeUtil_canBeSideEffected_1382575805184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term806 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term808 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term810 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term813 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term816 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term819 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term823 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term826 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term829 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term806, term806.getClass(), "type", -1560631747);
        setIntField(term808, term808.getClass(), "type", 68922753);
        setIntField(term810, term810.getClass(), "type", 0);
        setField(term810, term810.getClass(), "next", null);
        setField(term810, term810.getClass(), "first", null);
        setField(term810, term810.getClass(), "last", null);
        setField(term810, term810.getClass(), "propListHead", null);
        setIntField(term810, term810.getClass(), "sourcePosition", 0);
        setField(term810, term810.getClass(), "jsType", null);
        setField(term810, term810.getClass(), "parent", null);
        setField(term808, term808.getClass(), "next", term810);
        setIntField(term813, term813.getClass(), "type", 0);
        setField(term813, term813.getClass(), "next", null);
        setField(term813, term813.getClass(), "first", null);
        setField(term813, term813.getClass(), "last", null);
        setField(term813, term813.getClass(), "propListHead", null);
        setIntField(term813, term813.getClass(), "sourcePosition", 0);
        setField(term813, term813.getClass(), "jsType", null);
        setField(term813, term813.getClass(), "parent", null);
        setField(term808, term808.getClass(), "first", term813);
        setIntField(term816, term816.getClass(), "type", 0);
        setField(term816, term816.getClass(), "next", null);
        setField(term816, term816.getClass(), "first", null);
        setField(term816, term816.getClass(), "last", null);
        setField(term816, term816.getClass(), "propListHead", null);
        setIntField(term816, term816.getClass(), "sourcePosition", 0);
        setField(term816, term816.getClass(), "jsType", null);
        setField(term816, term816.getClass(), "parent", null);
        setField(term808, term808.getClass(), "last", term816);
        setField(term819, term819.getClass(), "next", null);
        setIntField(term819, term819.getClass(), "type", 0);
        setIntField(term819, term819.getClass(), "intValue", 0);
        setField(term819, term819.getClass(), "objectValue", null);
        setField(term808, term808.getClass(), "propListHead", term819);
        setIntField(term808, term808.getClass(), "sourcePosition", -2070466617);
        setField(term808, term808.getClass(), "jsType", null);
        setField(term808, term808.getClass(), "parent", null);
        setField(term806, term806.getClass(), "next", term808);
        setIntField(term823, term823.getClass(), "type", 0);
        setField(term823, term823.getClass(), "next", null);
        setField(term823, term823.getClass(), "first", null);
        setField(term823, term823.getClass(), "last", null);
        setField(term823, term823.getClass(), "propListHead", null);
        setIntField(term823, term823.getClass(), "sourcePosition", 0);
        setField(term823, term823.getClass(), "jsType", null);
        setField(term823, term823.getClass(), "parent", null);
        setField(term806, term806.getClass(), "first", term823);
        setIntField(term826, term826.getClass(), "type", 0);
        setField(term826, term826.getClass(), "next", null);
        setField(term826, term826.getClass(), "first", null);
        setField(term826, term826.getClass(), "last", null);
        setField(term826, term826.getClass(), "propListHead", null);
        setIntField(term826, term826.getClass(), "sourcePosition", 0);
        setField(term826, term826.getClass(), "jsType", null);
        setField(term826, term826.getClass(), "parent", null);
        setField(term806, term806.getClass(), "last", term826);
        setField(term829, term829.getClass(), "next", null);
        setIntField(term829, term829.getClass(), "type", 0);
        setIntField(term829, term829.getClass(), "intValue", 0);
        setField(term829, term829.getClass(), "objectValue", null);
        setField(term806, term806.getClass(), "propListHead", term829);
        setIntField(term806, term806.getClass(), "sourcePosition", -1127721881);
        setField(term806, term806.getClass(), "jsType", null);
        setField(term806, term806.getClass(), "parent", null);
        term9753 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9754 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9755 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9756 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9757 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9758 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term9759 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9760 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9761 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term9753, term9753.getClass(), "type", -1560631747);
        setIntField(term9754, term9754.getClass(), "type", 68922753);
        setIntField(term9755, term9755.getClass(), "type", 0);
        setField(term9755, term9755.getClass(), "next", null);
        setField(term9755, term9755.getClass(), "first", null);
        setField(term9755, term9755.getClass(), "last", null);
        setField(term9755, term9755.getClass(), "propListHead", null);
        setIntField(term9755, term9755.getClass(), "sourcePosition", 0);
        setField(term9755, term9755.getClass(), "jsType", null);
        setField(term9755, term9755.getClass(), "parent", null);
        setField(term9754, term9754.getClass(), "next", term9755);
        setIntField(term9756, term9756.getClass(), "type", 0);
        setField(term9756, term9756.getClass(), "next", null);
        setField(term9756, term9756.getClass(), "first", null);
        setField(term9756, term9756.getClass(), "last", null);
        setField(term9756, term9756.getClass(), "propListHead", null);
        setIntField(term9756, term9756.getClass(), "sourcePosition", 0);
        setField(term9756, term9756.getClass(), "jsType", null);
        setField(term9756, term9756.getClass(), "parent", null);
        setField(term9754, term9754.getClass(), "first", term9756);
        setIntField(term9757, term9757.getClass(), "type", 0);
        setField(term9757, term9757.getClass(), "next", null);
        setField(term9757, term9757.getClass(), "first", null);
        setField(term9757, term9757.getClass(), "last", null);
        setField(term9757, term9757.getClass(), "propListHead", null);
        setIntField(term9757, term9757.getClass(), "sourcePosition", 0);
        setField(term9757, term9757.getClass(), "jsType", null);
        setField(term9757, term9757.getClass(), "parent", null);
        setField(term9754, term9754.getClass(), "last", term9757);
        setField(term9758, term9758.getClass(), "next", null);
        setIntField(term9758, term9758.getClass(), "type", 0);
        setIntField(term9758, term9758.getClass(), "intValue", 0);
        setField(term9758, term9758.getClass(), "objectValue", null);
        setField(term9754, term9754.getClass(), "propListHead", term9758);
        setIntField(term9754, term9754.getClass(), "sourcePosition", -2070466617);
        setField(term9754, term9754.getClass(), "jsType", null);
        setField(term9754, term9754.getClass(), "parent", null);
        setField(term9753, term9753.getClass(), "next", term9754);
        setIntField(term9759, term9759.getClass(), "type", 0);
        setField(term9759, term9759.getClass(), "next", null);
        setField(term9759, term9759.getClass(), "first", null);
        setField(term9759, term9759.getClass(), "last", null);
        setField(term9759, term9759.getClass(), "propListHead", null);
        setIntField(term9759, term9759.getClass(), "sourcePosition", 0);
        setField(term9759, term9759.getClass(), "jsType", null);
        setField(term9759, term9759.getClass(), "parent", null);
        setField(term9753, term9753.getClass(), "first", term9759);
        setIntField(term9760, term9760.getClass(), "type", 0);
        setField(term9760, term9760.getClass(), "next", null);
        setField(term9760, term9760.getClass(), "first", null);
        setField(term9760, term9760.getClass(), "last", null);
        setField(term9760, term9760.getClass(), "propListHead", null);
        setIntField(term9760, term9760.getClass(), "sourcePosition", 0);
        setField(term9760, term9760.getClass(), "jsType", null);
        setField(term9760, term9760.getClass(), "parent", null);
        setField(term9753, term9753.getClass(), "last", term9760);
        setField(term9761, term9761.getClass(), "next", null);
        setIntField(term9761, term9761.getClass(), "type", 0);
        setIntField(term9761, term9761.getClass(), "intValue", 0);
        setField(term9761, term9761.getClass(), "objectValue", null);
        setField(term9753, term9753.getClass(), "propListHead", term9761);
        setIntField(term9753, term9753.getClass(), "sourcePosition", -1127721881);
        setField(term9753, term9753.getClass(), "jsType", null);
        setField(term9753, term9753.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term806;
        callMethod(klass, "canBeSideEffected", argTypes, null, args);
        assertTrue(recursiveEquals(term806, term9753));
    }

};


