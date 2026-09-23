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

public class NodeUtil_isExprAssign_892465175138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term868;
     Object term6912;

    public NodeUtil_isExprAssign_892465175138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term868 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term870 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term872 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term875 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term878 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term881 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term885 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term888 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term891 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term868, term868.getClass(), "type", -938508470);
        setIntField(term870, term870.getClass(), "type", -1553893255);
        setIntField(term872, term872.getClass(), "type", 0);
        setField(term872, term872.getClass(), "next", null);
        setField(term872, term872.getClass(), "first", null);
        setField(term872, term872.getClass(), "last", null);
        setField(term872, term872.getClass(), "propListHead", null);
        setIntField(term872, term872.getClass(), "sourcePosition", 0);
        setField(term872, term872.getClass(), "jsType", null);
        setField(term872, term872.getClass(), "parent", null);
        setField(term870, term870.getClass(), "next", term872);
        setIntField(term875, term875.getClass(), "type", 0);
        setField(term875, term875.getClass(), "next", null);
        setField(term875, term875.getClass(), "first", null);
        setField(term875, term875.getClass(), "last", null);
        setField(term875, term875.getClass(), "propListHead", null);
        setIntField(term875, term875.getClass(), "sourcePosition", 0);
        setField(term875, term875.getClass(), "jsType", null);
        setField(term875, term875.getClass(), "parent", null);
        setField(term870, term870.getClass(), "first", term875);
        setIntField(term878, term878.getClass(), "type", 0);
        setField(term878, term878.getClass(), "next", null);
        setField(term878, term878.getClass(), "first", null);
        setField(term878, term878.getClass(), "last", null);
        setField(term878, term878.getClass(), "propListHead", null);
        setIntField(term878, term878.getClass(), "sourcePosition", 0);
        setField(term878, term878.getClass(), "jsType", null);
        setField(term878, term878.getClass(), "parent", null);
        setField(term870, term870.getClass(), "last", term878);
        setField(term881, term881.getClass(), "next", null);
        setIntField(term881, term881.getClass(), "type", 0);
        setIntField(term881, term881.getClass(), "intValue", 0);
        setField(term881, term881.getClass(), "objectValue", null);
        setField(term870, term870.getClass(), "propListHead", term881);
        setIntField(term870, term870.getClass(), "sourcePosition", -434468428);
        setField(term870, term870.getClass(), "jsType", null);
        setField(term870, term870.getClass(), "parent", null);
        setField(term868, term868.getClass(), "next", term870);
        setIntField(term885, term885.getClass(), "type", 0);
        setField(term885, term885.getClass(), "next", null);
        setField(term885, term885.getClass(), "first", null);
        setField(term885, term885.getClass(), "last", null);
        setField(term885, term885.getClass(), "propListHead", null);
        setIntField(term885, term885.getClass(), "sourcePosition", 0);
        setField(term885, term885.getClass(), "jsType", null);
        setField(term885, term885.getClass(), "parent", null);
        setField(term868, term868.getClass(), "first", term885);
        setIntField(term888, term888.getClass(), "type", 0);
        setField(term888, term888.getClass(), "next", null);
        setField(term888, term888.getClass(), "first", null);
        setField(term888, term888.getClass(), "last", null);
        setField(term888, term888.getClass(), "propListHead", null);
        setIntField(term888, term888.getClass(), "sourcePosition", 0);
        setField(term888, term888.getClass(), "jsType", null);
        setField(term888, term888.getClass(), "parent", null);
        setField(term868, term868.getClass(), "last", term888);
        setField(term891, term891.getClass(), "next", null);
        setIntField(term891, term891.getClass(), "type", 0);
        setIntField(term891, term891.getClass(), "intValue", 0);
        setField(term891, term891.getClass(), "objectValue", null);
        setField(term868, term868.getClass(), "propListHead", term891);
        setIntField(term868, term868.getClass(), "sourcePosition", 1559605714);
        setField(term868, term868.getClass(), "jsType", null);
        setField(term868, term868.getClass(), "parent", null);
        term6912 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6913 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6914 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6915 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6916 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6917 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term6918 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6919 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6920 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term6912, term6912.getClass(), "type", -938508470);
        setIntField(term6913, term6913.getClass(), "type", -1553893255);
        setIntField(term6914, term6914.getClass(), "type", 0);
        setField(term6914, term6914.getClass(), "next", null);
        setField(term6914, term6914.getClass(), "first", null);
        setField(term6914, term6914.getClass(), "last", null);
        setField(term6914, term6914.getClass(), "propListHead", null);
        setIntField(term6914, term6914.getClass(), "sourcePosition", 0);
        setField(term6914, term6914.getClass(), "jsType", null);
        setField(term6914, term6914.getClass(), "parent", null);
        setField(term6913, term6913.getClass(), "next", term6914);
        setIntField(term6915, term6915.getClass(), "type", 0);
        setField(term6915, term6915.getClass(), "next", null);
        setField(term6915, term6915.getClass(), "first", null);
        setField(term6915, term6915.getClass(), "last", null);
        setField(term6915, term6915.getClass(), "propListHead", null);
        setIntField(term6915, term6915.getClass(), "sourcePosition", 0);
        setField(term6915, term6915.getClass(), "jsType", null);
        setField(term6915, term6915.getClass(), "parent", null);
        setField(term6913, term6913.getClass(), "first", term6915);
        setIntField(term6916, term6916.getClass(), "type", 0);
        setField(term6916, term6916.getClass(), "next", null);
        setField(term6916, term6916.getClass(), "first", null);
        setField(term6916, term6916.getClass(), "last", null);
        setField(term6916, term6916.getClass(), "propListHead", null);
        setIntField(term6916, term6916.getClass(), "sourcePosition", 0);
        setField(term6916, term6916.getClass(), "jsType", null);
        setField(term6916, term6916.getClass(), "parent", null);
        setField(term6913, term6913.getClass(), "last", term6916);
        setField(term6917, term6917.getClass(), "next", null);
        setIntField(term6917, term6917.getClass(), "type", 0);
        setIntField(term6917, term6917.getClass(), "intValue", 0);
        setField(term6917, term6917.getClass(), "objectValue", null);
        setField(term6913, term6913.getClass(), "propListHead", term6917);
        setIntField(term6913, term6913.getClass(), "sourcePosition", -434468428);
        setField(term6913, term6913.getClass(), "jsType", null);
        setField(term6913, term6913.getClass(), "parent", null);
        setField(term6912, term6912.getClass(), "next", term6913);
        setIntField(term6918, term6918.getClass(), "type", 0);
        setField(term6918, term6918.getClass(), "next", null);
        setField(term6918, term6918.getClass(), "first", null);
        setField(term6918, term6918.getClass(), "last", null);
        setField(term6918, term6918.getClass(), "propListHead", null);
        setIntField(term6918, term6918.getClass(), "sourcePosition", 0);
        setField(term6918, term6918.getClass(), "jsType", null);
        setField(term6918, term6918.getClass(), "parent", null);
        setField(term6912, term6912.getClass(), "first", term6918);
        setIntField(term6919, term6919.getClass(), "type", 0);
        setField(term6919, term6919.getClass(), "next", null);
        setField(term6919, term6919.getClass(), "first", null);
        setField(term6919, term6919.getClass(), "last", null);
        setField(term6919, term6919.getClass(), "propListHead", null);
        setIntField(term6919, term6919.getClass(), "sourcePosition", 0);
        setField(term6919, term6919.getClass(), "jsType", null);
        setField(term6919, term6919.getClass(), "parent", null);
        setField(term6912, term6912.getClass(), "last", term6919);
        setField(term6920, term6920.getClass(), "next", null);
        setIntField(term6920, term6920.getClass(), "type", 0);
        setIntField(term6920, term6920.getClass(), "intValue", 0);
        setField(term6920, term6920.getClass(), "objectValue", null);
        setField(term6912, term6912.getClass(), "propListHead", term6920);
        setIntField(term6912, term6912.getClass(), "sourcePosition", 1559605714);
        setField(term6912, term6912.getClass(), "jsType", null);
        setField(term6912, term6912.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term868;
        Object retValue = callMethod(klass, "isExprAssign", argTypes, null, args);
        assertTrue(recursiveEquals(term868, term6912));
        assertTrue(recursiveEquals(retValue, false));
    }

};


