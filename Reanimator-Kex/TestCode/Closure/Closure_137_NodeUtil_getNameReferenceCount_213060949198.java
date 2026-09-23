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

public class NodeUtil_getNameReferenceCount_213060949198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2878;
     Object term15195;

    public NodeUtil_getNameReferenceCount_213060949198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2878 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2880 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2882 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2885 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2888 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2891 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2895 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2898 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2901 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2878, term2878.getClass(), "type", -600102466);
        setIntField(term2880, term2880.getClass(), "type", -37129068);
        setIntField(term2882, term2882.getClass(), "type", 0);
        setField(term2882, term2882.getClass(), "next", null);
        setField(term2882, term2882.getClass(), "first", null);
        setField(term2882, term2882.getClass(), "last", null);
        setField(term2882, term2882.getClass(), "propListHead", null);
        setIntField(term2882, term2882.getClass(), "sourcePosition", 0);
        setField(term2882, term2882.getClass(), "jsType", null);
        setField(term2882, term2882.getClass(), "parent", null);
        setField(term2880, term2880.getClass(), "next", term2882);
        setIntField(term2885, term2885.getClass(), "type", 0);
        setField(term2885, term2885.getClass(), "next", null);
        setField(term2885, term2885.getClass(), "first", null);
        setField(term2885, term2885.getClass(), "last", null);
        setField(term2885, term2885.getClass(), "propListHead", null);
        setIntField(term2885, term2885.getClass(), "sourcePosition", 0);
        setField(term2885, term2885.getClass(), "jsType", null);
        setField(term2885, term2885.getClass(), "parent", null);
        setField(term2880, term2880.getClass(), "first", term2885);
        setIntField(term2888, term2888.getClass(), "type", 0);
        setField(term2888, term2888.getClass(), "next", null);
        setField(term2888, term2888.getClass(), "first", null);
        setField(term2888, term2888.getClass(), "last", null);
        setField(term2888, term2888.getClass(), "propListHead", null);
        setIntField(term2888, term2888.getClass(), "sourcePosition", 0);
        setField(term2888, term2888.getClass(), "jsType", null);
        setField(term2888, term2888.getClass(), "parent", null);
        setField(term2880, term2880.getClass(), "last", term2888);
        setField(term2891, term2891.getClass(), "next", null);
        setIntField(term2891, term2891.getClass(), "type", 0);
        setIntField(term2891, term2891.getClass(), "intValue", 0);
        setField(term2891, term2891.getClass(), "objectValue", null);
        setField(term2880, term2880.getClass(), "propListHead", term2891);
        setIntField(term2880, term2880.getClass(), "sourcePosition", -1261824381);
        setField(term2880, term2880.getClass(), "jsType", null);
        setField(term2880, term2880.getClass(), "parent", null);
        setField(term2878, term2878.getClass(), "next", term2880);
        setIntField(term2895, term2895.getClass(), "type", 0);
        setField(term2895, term2895.getClass(), "next", null);
        setField(term2895, term2895.getClass(), "first", null);
        setField(term2895, term2895.getClass(), "last", null);
        setField(term2895, term2895.getClass(), "propListHead", null);
        setIntField(term2895, term2895.getClass(), "sourcePosition", 0);
        setField(term2895, term2895.getClass(), "jsType", null);
        setField(term2895, term2895.getClass(), "parent", null);
        setField(term2878, term2878.getClass(), "first", term2895);
        setIntField(term2898, term2898.getClass(), "type", 0);
        setField(term2898, term2898.getClass(), "next", null);
        setField(term2898, term2898.getClass(), "first", null);
        setField(term2898, term2898.getClass(), "last", null);
        setField(term2898, term2898.getClass(), "propListHead", null);
        setIntField(term2898, term2898.getClass(), "sourcePosition", 0);
        setField(term2898, term2898.getClass(), "jsType", null);
        setField(term2898, term2898.getClass(), "parent", null);
        setField(term2878, term2878.getClass(), "last", term2898);
        setField(term2901, term2901.getClass(), "next", null);
        setIntField(term2901, term2901.getClass(), "type", 0);
        setIntField(term2901, term2901.getClass(), "intValue", 0);
        setField(term2901, term2901.getClass(), "objectValue", null);
        setField(term2878, term2878.getClass(), "propListHead", term2901);
        setIntField(term2878, term2878.getClass(), "sourcePosition", 1594426218);
        setField(term2878, term2878.getClass(), "jsType", null);
        setField(term2878, term2878.getClass(), "parent", null);
        term15195 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15196 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15197 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15198 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15199 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15200 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term15201 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15202 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15203 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term15195, term15195.getClass(), "type", -600102466);
        setIntField(term15196, term15196.getClass(), "type", -37129068);
        setIntField(term15197, term15197.getClass(), "type", 0);
        setField(term15197, term15197.getClass(), "next", null);
        setField(term15197, term15197.getClass(), "first", null);
        setField(term15197, term15197.getClass(), "last", null);
        setField(term15197, term15197.getClass(), "propListHead", null);
        setIntField(term15197, term15197.getClass(), "sourcePosition", 0);
        setField(term15197, term15197.getClass(), "jsType", null);
        setField(term15197, term15197.getClass(), "parent", null);
        setField(term15196, term15196.getClass(), "next", term15197);
        setIntField(term15198, term15198.getClass(), "type", 0);
        setField(term15198, term15198.getClass(), "next", null);
        setField(term15198, term15198.getClass(), "first", null);
        setField(term15198, term15198.getClass(), "last", null);
        setField(term15198, term15198.getClass(), "propListHead", null);
        setIntField(term15198, term15198.getClass(), "sourcePosition", 0);
        setField(term15198, term15198.getClass(), "jsType", null);
        setField(term15198, term15198.getClass(), "parent", null);
        setField(term15196, term15196.getClass(), "first", term15198);
        setIntField(term15199, term15199.getClass(), "type", 0);
        setField(term15199, term15199.getClass(), "next", null);
        setField(term15199, term15199.getClass(), "first", null);
        setField(term15199, term15199.getClass(), "last", null);
        setField(term15199, term15199.getClass(), "propListHead", null);
        setIntField(term15199, term15199.getClass(), "sourcePosition", 0);
        setField(term15199, term15199.getClass(), "jsType", null);
        setField(term15199, term15199.getClass(), "parent", null);
        setField(term15196, term15196.getClass(), "last", term15199);
        setField(term15200, term15200.getClass(), "next", null);
        setIntField(term15200, term15200.getClass(), "type", 0);
        setIntField(term15200, term15200.getClass(), "intValue", 0);
        setField(term15200, term15200.getClass(), "objectValue", null);
        setField(term15196, term15196.getClass(), "propListHead", term15200);
        setIntField(term15196, term15196.getClass(), "sourcePosition", -1261824381);
        setField(term15196, term15196.getClass(), "jsType", null);
        setField(term15196, term15196.getClass(), "parent", null);
        setField(term15195, term15195.getClass(), "next", term15196);
        setIntField(term15201, term15201.getClass(), "type", 0);
        setField(term15201, term15201.getClass(), "next", null);
        setField(term15201, term15201.getClass(), "first", null);
        setField(term15201, term15201.getClass(), "last", null);
        setField(term15201, term15201.getClass(), "propListHead", null);
        setIntField(term15201, term15201.getClass(), "sourcePosition", 0);
        setField(term15201, term15201.getClass(), "jsType", null);
        setField(term15201, term15201.getClass(), "parent", null);
        setField(term15195, term15195.getClass(), "first", term15201);
        setIntField(term15202, term15202.getClass(), "type", 0);
        setField(term15202, term15202.getClass(), "next", null);
        setField(term15202, term15202.getClass(), "first", null);
        setField(term15202, term15202.getClass(), "last", null);
        setField(term15202, term15202.getClass(), "propListHead", null);
        setIntField(term15202, term15202.getClass(), "sourcePosition", 0);
        setField(term15202, term15202.getClass(), "jsType", null);
        setField(term15202, term15202.getClass(), "parent", null);
        setField(term15195, term15195.getClass(), "last", term15202);
        setField(term15203, term15203.getClass(), "next", null);
        setIntField(term15203, term15203.getClass(), "type", 0);
        setIntField(term15203, term15203.getClass(), "intValue", 0);
        setField(term15203, term15203.getClass(), "objectValue", null);
        setField(term15195, term15195.getClass(), "propListHead", term15203);
        setIntField(term15195, term15195.getClass(), "sourcePosition", 1594426218);
        setField(term15195, term15195.getClass(), "jsType", null);
        setField(term15195, term15195.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term2878;
        args[1] = "vrQLuWIDJX";
        Object retValue = callMethod(klass, "getNameReferenceCount", argTypes, null, args);
        assertTrue(recursiveEquals(term2878, "vrQLuWIDJX"));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


