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

public class NodeUtil_mayBeStringHelper_1019295344200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term927;
     Object term9989;

    public NodeUtil_mayBeStringHelper_1019295344200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term927 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term929 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term931 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term934 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term937 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term941 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term944 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term927, term927.getClass(), "type", 977862393);
        setIntField(term929, term929.getClass(), "type", -544382127);
        setIntField(term931, term931.getClass(), "type", 0);
        setField(term931, term931.getClass(), "next", null);
        setField(term931, term931.getClass(), "first", null);
        setField(term931, term931.getClass(), "last", null);
        setField(term931, term931.getClass(), "propListHead", null);
        setIntField(term931, term931.getClass(), "sourcePosition", 0);
        setField(term931, term931.getClass(), "jsType", null);
        setField(term931, term931.getClass(), "parent", null);
        setField(term929, term929.getClass(), "next", term931);
        setIntField(term934, term934.getClass(), "type", 0);
        setField(term934, term934.getClass(), "next", null);
        setField(term934, term934.getClass(), "first", null);
        setField(term934, term934.getClass(), "last", null);
        setField(term934, term934.getClass(), "propListHead", null);
        setIntField(term934, term934.getClass(), "sourcePosition", 0);
        setField(term934, term934.getClass(), "jsType", null);
        setField(term934, term934.getClass(), "parent", null);
        setField(term929, term929.getClass(), "first", term934);
        setIntField(term937, term937.getClass(), "type", 0);
        setField(term937, term937.getClass(), "next", null);
        setField(term937, term937.getClass(), "first", null);
        setField(term937, term937.getClass(), "last", null);
        setField(term937, term937.getClass(), "propListHead", null);
        setIntField(term937, term937.getClass(), "sourcePosition", 0);
        setField(term937, term937.getClass(), "jsType", null);
        setField(term937, term937.getClass(), "parent", null);
        setField(term929, term929.getClass(), "last", term937);
        setField(term929, term929.getClass(), "propListHead", null);
        setIntField(term929, term929.getClass(), "sourcePosition", 0);
        setField(term929, term929.getClass(), "jsType", null);
        setField(term929, term929.getClass(), "parent", null);
        setField(term927, term927.getClass(), "next", term929);
        setIntField(term941, term941.getClass(), "type", 0);
        setField(term941, term941.getClass(), "next", null);
        setField(term941, term941.getClass(), "first", null);
        setField(term941, term941.getClass(), "last", null);
        setField(term941, term941.getClass(), "propListHead", null);
        setIntField(term941, term941.getClass(), "sourcePosition", 0);
        setField(term941, term941.getClass(), "jsType", null);
        setField(term941, term941.getClass(), "parent", null);
        setField(term927, term927.getClass(), "first", term941);
        setIntField(term944, term944.getClass(), "type", 0);
        setField(term944, term944.getClass(), "next", null);
        setField(term944, term944.getClass(), "first", null);
        setField(term944, term944.getClass(), "last", null);
        setField(term944, term944.getClass(), "propListHead", null);
        setIntField(term944, term944.getClass(), "sourcePosition", 0);
        setField(term944, term944.getClass(), "jsType", null);
        setField(term944, term944.getClass(), "parent", null);
        setField(term927, term927.getClass(), "last", term944);
        setField(term927, term927.getClass(), "propListHead", null);
        setIntField(term927, term927.getClass(), "sourcePosition", 0);
        setField(term927, term927.getClass(), "jsType", null);
        setField(term927, term927.getClass(), "parent", null);
        term9989 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9990 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9991 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9992 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9993 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9994 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9995 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9989, term9989.getClass(), "type", 977862393);
        setIntField(term9990, term9990.getClass(), "type", -544382127);
        setIntField(term9991, term9991.getClass(), "type", 0);
        setField(term9991, term9991.getClass(), "next", null);
        setField(term9991, term9991.getClass(), "first", null);
        setField(term9991, term9991.getClass(), "last", null);
        setField(term9991, term9991.getClass(), "propListHead", null);
        setIntField(term9991, term9991.getClass(), "sourcePosition", 0);
        setField(term9991, term9991.getClass(), "jsType", null);
        setField(term9991, term9991.getClass(), "parent", null);
        setField(term9990, term9990.getClass(), "next", term9991);
        setIntField(term9992, term9992.getClass(), "type", 0);
        setField(term9992, term9992.getClass(), "next", null);
        setField(term9992, term9992.getClass(), "first", null);
        setField(term9992, term9992.getClass(), "last", null);
        setField(term9992, term9992.getClass(), "propListHead", null);
        setIntField(term9992, term9992.getClass(), "sourcePosition", 0);
        setField(term9992, term9992.getClass(), "jsType", null);
        setField(term9992, term9992.getClass(), "parent", null);
        setField(term9990, term9990.getClass(), "first", term9992);
        setIntField(term9993, term9993.getClass(), "type", 0);
        setField(term9993, term9993.getClass(), "next", null);
        setField(term9993, term9993.getClass(), "first", null);
        setField(term9993, term9993.getClass(), "last", null);
        setField(term9993, term9993.getClass(), "propListHead", null);
        setIntField(term9993, term9993.getClass(), "sourcePosition", 0);
        setField(term9993, term9993.getClass(), "jsType", null);
        setField(term9993, term9993.getClass(), "parent", null);
        setField(term9990, term9990.getClass(), "last", term9993);
        setField(term9990, term9990.getClass(), "propListHead", null);
        setIntField(term9990, term9990.getClass(), "sourcePosition", 0);
        setField(term9990, term9990.getClass(), "jsType", null);
        setField(term9990, term9990.getClass(), "parent", null);
        setField(term9989, term9989.getClass(), "next", term9990);
        setIntField(term9994, term9994.getClass(), "type", 0);
        setField(term9994, term9994.getClass(), "next", null);
        setField(term9994, term9994.getClass(), "first", null);
        setField(term9994, term9994.getClass(), "last", null);
        setField(term9994, term9994.getClass(), "propListHead", null);
        setIntField(term9994, term9994.getClass(), "sourcePosition", 0);
        setField(term9994, term9994.getClass(), "jsType", null);
        setField(term9994, term9994.getClass(), "parent", null);
        setField(term9989, term9989.getClass(), "first", term9994);
        setIntField(term9995, term9995.getClass(), "type", 0);
        setField(term9995, term9995.getClass(), "next", null);
        setField(term9995, term9995.getClass(), "first", null);
        setField(term9995, term9995.getClass(), "last", null);
        setField(term9995, term9995.getClass(), "propListHead", null);
        setIntField(term9995, term9995.getClass(), "sourcePosition", 0);
        setField(term9995, term9995.getClass(), "jsType", null);
        setField(term9995, term9995.getClass(), "parent", null);
        setField(term9989, term9989.getClass(), "last", term9995);
        setField(term9989, term9989.getClass(), "propListHead", null);
        setIntField(term9989, term9989.getClass(), "sourcePosition", 0);
        setField(term9989, term9989.getClass(), "jsType", null);
        setField(term9989, term9989.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term927;
        Object retValue = callMethod(klass, "mayBeStringHelper", argTypes, null, args);
        assertTrue(recursiveEquals(term927, term9989));
        assertTrue(recursiveEquals(retValue, true));
    }

};


