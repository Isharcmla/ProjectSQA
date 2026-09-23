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

public class NodeUtil_isAssignmentOp_2079461729148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term735;
     Object term7927;

    public NodeUtil_isAssignmentOp_2079461729148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term735 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term737 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term739 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term742 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term745 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term748 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term752 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term755 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term758 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term735, term735.getClass(), "type", 803925431);
        setIntField(term737, term737.getClass(), "type", -1835839814);
        setIntField(term739, term739.getClass(), "type", 0);
        setField(term739, term739.getClass(), "next", null);
        setField(term739, term739.getClass(), "first", null);
        setField(term739, term739.getClass(), "last", null);
        setField(term739, term739.getClass(), "propListHead", null);
        setIntField(term739, term739.getClass(), "sourcePosition", 0);
        setField(term739, term739.getClass(), "jsType", null);
        setField(term739, term739.getClass(), "parent", null);
        setField(term737, term737.getClass(), "next", term739);
        setIntField(term742, term742.getClass(), "type", 0);
        setField(term742, term742.getClass(), "next", null);
        setField(term742, term742.getClass(), "first", null);
        setField(term742, term742.getClass(), "last", null);
        setField(term742, term742.getClass(), "propListHead", null);
        setIntField(term742, term742.getClass(), "sourcePosition", 0);
        setField(term742, term742.getClass(), "jsType", null);
        setField(term742, term742.getClass(), "parent", null);
        setField(term737, term737.getClass(), "first", term742);
        setIntField(term745, term745.getClass(), "type", 0);
        setField(term745, term745.getClass(), "next", null);
        setField(term745, term745.getClass(), "first", null);
        setField(term745, term745.getClass(), "last", null);
        setField(term745, term745.getClass(), "propListHead", null);
        setIntField(term745, term745.getClass(), "sourcePosition", 0);
        setField(term745, term745.getClass(), "jsType", null);
        setField(term745, term745.getClass(), "parent", null);
        setField(term737, term737.getClass(), "last", term745);
        setField(term748, term748.getClass(), "next", null);
        setIntField(term748, term748.getClass(), "type", 0);
        setIntField(term748, term748.getClass(), "intValue", 0);
        setField(term748, term748.getClass(), "objectValue", null);
        setField(term737, term737.getClass(), "propListHead", term748);
        setIntField(term737, term737.getClass(), "sourcePosition", 579006268);
        setField(term737, term737.getClass(), "jsType", null);
        setField(term737, term737.getClass(), "parent", null);
        setField(term735, term735.getClass(), "next", term737);
        setIntField(term752, term752.getClass(), "type", 0);
        setField(term752, term752.getClass(), "next", null);
        setField(term752, term752.getClass(), "first", null);
        setField(term752, term752.getClass(), "last", null);
        setField(term752, term752.getClass(), "propListHead", null);
        setIntField(term752, term752.getClass(), "sourcePosition", 0);
        setField(term752, term752.getClass(), "jsType", null);
        setField(term752, term752.getClass(), "parent", null);
        setField(term735, term735.getClass(), "first", term752);
        setIntField(term755, term755.getClass(), "type", 0);
        setField(term755, term755.getClass(), "next", null);
        setField(term755, term755.getClass(), "first", null);
        setField(term755, term755.getClass(), "last", null);
        setField(term755, term755.getClass(), "propListHead", null);
        setIntField(term755, term755.getClass(), "sourcePosition", 0);
        setField(term755, term755.getClass(), "jsType", null);
        setField(term755, term755.getClass(), "parent", null);
        setField(term735, term735.getClass(), "last", term755);
        setField(term758, term758.getClass(), "next", null);
        setIntField(term758, term758.getClass(), "type", 0);
        setIntField(term758, term758.getClass(), "intValue", 0);
        setField(term758, term758.getClass(), "objectValue", null);
        setField(term735, term735.getClass(), "propListHead", term758);
        setIntField(term735, term735.getClass(), "sourcePosition", -1694747156);
        setField(term735, term735.getClass(), "jsType", null);
        setField(term735, term735.getClass(), "parent", null);
        term7927 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7928 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7929 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7930 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7931 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7932 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term7933 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7934 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7935 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term7927, term7927.getClass(), "type", 803925431);
        setIntField(term7928, term7928.getClass(), "type", -1835839814);
        setIntField(term7929, term7929.getClass(), "type", 0);
        setField(term7929, term7929.getClass(), "next", null);
        setField(term7929, term7929.getClass(), "first", null);
        setField(term7929, term7929.getClass(), "last", null);
        setField(term7929, term7929.getClass(), "propListHead", null);
        setIntField(term7929, term7929.getClass(), "sourcePosition", 0);
        setField(term7929, term7929.getClass(), "jsType", null);
        setField(term7929, term7929.getClass(), "parent", null);
        setField(term7928, term7928.getClass(), "next", term7929);
        setIntField(term7930, term7930.getClass(), "type", 0);
        setField(term7930, term7930.getClass(), "next", null);
        setField(term7930, term7930.getClass(), "first", null);
        setField(term7930, term7930.getClass(), "last", null);
        setField(term7930, term7930.getClass(), "propListHead", null);
        setIntField(term7930, term7930.getClass(), "sourcePosition", 0);
        setField(term7930, term7930.getClass(), "jsType", null);
        setField(term7930, term7930.getClass(), "parent", null);
        setField(term7928, term7928.getClass(), "first", term7930);
        setIntField(term7931, term7931.getClass(), "type", 0);
        setField(term7931, term7931.getClass(), "next", null);
        setField(term7931, term7931.getClass(), "first", null);
        setField(term7931, term7931.getClass(), "last", null);
        setField(term7931, term7931.getClass(), "propListHead", null);
        setIntField(term7931, term7931.getClass(), "sourcePosition", 0);
        setField(term7931, term7931.getClass(), "jsType", null);
        setField(term7931, term7931.getClass(), "parent", null);
        setField(term7928, term7928.getClass(), "last", term7931);
        setField(term7932, term7932.getClass(), "next", null);
        setIntField(term7932, term7932.getClass(), "type", 0);
        setIntField(term7932, term7932.getClass(), "intValue", 0);
        setField(term7932, term7932.getClass(), "objectValue", null);
        setField(term7928, term7928.getClass(), "propListHead", term7932);
        setIntField(term7928, term7928.getClass(), "sourcePosition", 579006268);
        setField(term7928, term7928.getClass(), "jsType", null);
        setField(term7928, term7928.getClass(), "parent", null);
        setField(term7927, term7927.getClass(), "next", term7928);
        setIntField(term7933, term7933.getClass(), "type", 0);
        setField(term7933, term7933.getClass(), "next", null);
        setField(term7933, term7933.getClass(), "first", null);
        setField(term7933, term7933.getClass(), "last", null);
        setField(term7933, term7933.getClass(), "propListHead", null);
        setIntField(term7933, term7933.getClass(), "sourcePosition", 0);
        setField(term7933, term7933.getClass(), "jsType", null);
        setField(term7933, term7933.getClass(), "parent", null);
        setField(term7927, term7927.getClass(), "first", term7933);
        setIntField(term7934, term7934.getClass(), "type", 0);
        setField(term7934, term7934.getClass(), "next", null);
        setField(term7934, term7934.getClass(), "first", null);
        setField(term7934, term7934.getClass(), "last", null);
        setField(term7934, term7934.getClass(), "propListHead", null);
        setIntField(term7934, term7934.getClass(), "sourcePosition", 0);
        setField(term7934, term7934.getClass(), "jsType", null);
        setField(term7934, term7934.getClass(), "parent", null);
        setField(term7927, term7927.getClass(), "last", term7934);
        setField(term7935, term7935.getClass(), "next", null);
        setIntField(term7935, term7935.getClass(), "type", 0);
        setIntField(term7935, term7935.getClass(), "intValue", 0);
        setField(term7935, term7935.getClass(), "objectValue", null);
        setField(term7927, term7927.getClass(), "propListHead", term7935);
        setIntField(term7927, term7927.getClass(), "sourcePosition", -1694747156);
        setField(term7927, term7927.getClass(), "jsType", null);
        setField(term7927, term7927.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term735;
        Object retValue = callMethod(klass, "isAssignmentOp", argTypes, null, args);
        assertTrue(recursiveEquals(term735, term7927));
        assertTrue(recursiveEquals(retValue, false));
    }

};


