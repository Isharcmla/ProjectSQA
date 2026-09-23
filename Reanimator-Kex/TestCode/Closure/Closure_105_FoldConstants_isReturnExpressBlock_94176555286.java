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

public class FoldConstants_isReturnExpressBlock_94176555286 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5029;
     Object term5030;
     Object term14937;
     Object term14938;

    public FoldConstants_isReturnExpressBlock_94176555286() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5029 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term5029, term5029.getClass(), "compiler", null);
        term5030 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5032 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5034 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5037 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5040 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5043 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term5047 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5050 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5053 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term5030, term5030.getClass(), "type", -1012090049);
        setIntField(term5032, term5032.getClass(), "type", 44908093);
        setIntField(term5034, term5034.getClass(), "type", 0);
        setField(term5034, term5034.getClass(), "next", null);
        setField(term5034, term5034.getClass(), "first", null);
        setField(term5034, term5034.getClass(), "last", null);
        setField(term5034, term5034.getClass(), "propListHead", null);
        setIntField(term5034, term5034.getClass(), "sourcePosition", 0);
        setField(term5034, term5034.getClass(), "jsType", null);
        setField(term5034, term5034.getClass(), "parent", null);
        setField(term5032, term5032.getClass(), "next", term5034);
        setIntField(term5037, term5037.getClass(), "type", 0);
        setField(term5037, term5037.getClass(), "next", null);
        setField(term5037, term5037.getClass(), "first", null);
        setField(term5037, term5037.getClass(), "last", null);
        setField(term5037, term5037.getClass(), "propListHead", null);
        setIntField(term5037, term5037.getClass(), "sourcePosition", 0);
        setField(term5037, term5037.getClass(), "jsType", null);
        setField(term5037, term5037.getClass(), "parent", null);
        setField(term5032, term5032.getClass(), "first", term5037);
        setIntField(term5040, term5040.getClass(), "type", 0);
        setField(term5040, term5040.getClass(), "next", null);
        setField(term5040, term5040.getClass(), "first", null);
        setField(term5040, term5040.getClass(), "last", null);
        setField(term5040, term5040.getClass(), "propListHead", null);
        setIntField(term5040, term5040.getClass(), "sourcePosition", 0);
        setField(term5040, term5040.getClass(), "jsType", null);
        setField(term5040, term5040.getClass(), "parent", null);
        setField(term5032, term5032.getClass(), "last", term5040);
        setField(term5043, term5043.getClass(), "next", null);
        setIntField(term5043, term5043.getClass(), "type", 0);
        setIntField(term5043, term5043.getClass(), "intValue", 0);
        setField(term5043, term5043.getClass(), "objectValue", null);
        setField(term5032, term5032.getClass(), "propListHead", term5043);
        setIntField(term5032, term5032.getClass(), "sourcePosition", 2087383644);
        setField(term5032, term5032.getClass(), "jsType", null);
        setField(term5032, term5032.getClass(), "parent", null);
        setField(term5030, term5030.getClass(), "next", term5032);
        setIntField(term5047, term5047.getClass(), "type", 0);
        setField(term5047, term5047.getClass(), "next", null);
        setField(term5047, term5047.getClass(), "first", null);
        setField(term5047, term5047.getClass(), "last", null);
        setField(term5047, term5047.getClass(), "propListHead", null);
        setIntField(term5047, term5047.getClass(), "sourcePosition", 0);
        setField(term5047, term5047.getClass(), "jsType", null);
        setField(term5047, term5047.getClass(), "parent", null);
        setField(term5030, term5030.getClass(), "first", term5047);
        setIntField(term5050, term5050.getClass(), "type", 0);
        setField(term5050, term5050.getClass(), "next", null);
        setField(term5050, term5050.getClass(), "first", null);
        setField(term5050, term5050.getClass(), "last", null);
        setField(term5050, term5050.getClass(), "propListHead", null);
        setIntField(term5050, term5050.getClass(), "sourcePosition", 0);
        setField(term5050, term5050.getClass(), "jsType", null);
        setField(term5050, term5050.getClass(), "parent", null);
        setField(term5030, term5030.getClass(), "last", term5050);
        setField(term5053, term5053.getClass(), "next", null);
        setIntField(term5053, term5053.getClass(), "type", 0);
        setIntField(term5053, term5053.getClass(), "intValue", 0);
        setField(term5053, term5053.getClass(), "objectValue", null);
        setField(term5030, term5030.getClass(), "propListHead", term5053);
        setIntField(term5030, term5030.getClass(), "sourcePosition", 405527523);
        setField(term5030, term5030.getClass(), "jsType", null);
        setField(term5030, term5030.getClass(), "parent", null);
        term14937 = newInstance(Class.forName("com.google.javascript.jscomp.FoldConstants"));
        setField(term14937, term14937.getClass(), "compiler", null);
        term14938 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14939 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14940 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14941 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14942 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14943 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term14944 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14945 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14946 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term14938, term14938.getClass(), "type", -1012090049);
        setIntField(term14939, term14939.getClass(), "type", 44908093);
        setIntField(term14940, term14940.getClass(), "type", 0);
        setField(term14940, term14940.getClass(), "next", null);
        setField(term14940, term14940.getClass(), "first", null);
        setField(term14940, term14940.getClass(), "last", null);
        setField(term14940, term14940.getClass(), "propListHead", null);
        setIntField(term14940, term14940.getClass(), "sourcePosition", 0);
        setField(term14940, term14940.getClass(), "jsType", null);
        setField(term14940, term14940.getClass(), "parent", null);
        setField(term14939, term14939.getClass(), "next", term14940);
        setIntField(term14941, term14941.getClass(), "type", 0);
        setField(term14941, term14941.getClass(), "next", null);
        setField(term14941, term14941.getClass(), "first", null);
        setField(term14941, term14941.getClass(), "last", null);
        setField(term14941, term14941.getClass(), "propListHead", null);
        setIntField(term14941, term14941.getClass(), "sourcePosition", 0);
        setField(term14941, term14941.getClass(), "jsType", null);
        setField(term14941, term14941.getClass(), "parent", null);
        setField(term14939, term14939.getClass(), "first", term14941);
        setIntField(term14942, term14942.getClass(), "type", 0);
        setField(term14942, term14942.getClass(), "next", null);
        setField(term14942, term14942.getClass(), "first", null);
        setField(term14942, term14942.getClass(), "last", null);
        setField(term14942, term14942.getClass(), "propListHead", null);
        setIntField(term14942, term14942.getClass(), "sourcePosition", 0);
        setField(term14942, term14942.getClass(), "jsType", null);
        setField(term14942, term14942.getClass(), "parent", null);
        setField(term14939, term14939.getClass(), "last", term14942);
        setField(term14943, term14943.getClass(), "next", null);
        setIntField(term14943, term14943.getClass(), "type", 0);
        setIntField(term14943, term14943.getClass(), "intValue", 0);
        setField(term14943, term14943.getClass(), "objectValue", null);
        setField(term14939, term14939.getClass(), "propListHead", term14943);
        setIntField(term14939, term14939.getClass(), "sourcePosition", 2087383644);
        setField(term14939, term14939.getClass(), "jsType", null);
        setField(term14939, term14939.getClass(), "parent", null);
        setField(term14938, term14938.getClass(), "next", term14939);
        setIntField(term14944, term14944.getClass(), "type", 0);
        setField(term14944, term14944.getClass(), "next", null);
        setField(term14944, term14944.getClass(), "first", null);
        setField(term14944, term14944.getClass(), "last", null);
        setField(term14944, term14944.getClass(), "propListHead", null);
        setIntField(term14944, term14944.getClass(), "sourcePosition", 0);
        setField(term14944, term14944.getClass(), "jsType", null);
        setField(term14944, term14944.getClass(), "parent", null);
        setField(term14938, term14938.getClass(), "first", term14944);
        setIntField(term14945, term14945.getClass(), "type", 0);
        setField(term14945, term14945.getClass(), "next", null);
        setField(term14945, term14945.getClass(), "first", null);
        setField(term14945, term14945.getClass(), "last", null);
        setField(term14945, term14945.getClass(), "propListHead", null);
        setIntField(term14945, term14945.getClass(), "sourcePosition", 0);
        setField(term14945, term14945.getClass(), "jsType", null);
        setField(term14945, term14945.getClass(), "parent", null);
        setField(term14938, term14938.getClass(), "last", term14945);
        setField(term14946, term14946.getClass(), "next", null);
        setIntField(term14946, term14946.getClass(), "type", 0);
        setIntField(term14946, term14946.getClass(), "intValue", 0);
        setField(term14946, term14946.getClass(), "objectValue", null);
        setField(term14938, term14938.getClass(), "propListHead", term14946);
        setIntField(term14938, term14938.getClass(), "sourcePosition", 405527523);
        setField(term14938, term14938.getClass(), "jsType", null);
        setField(term14938, term14938.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term5030;
        callMethod(klass, "isReturnExpressBlock", argTypes, term5029, args);
        assertTrue(recursiveEquals(term5029, term14937));
        assertTrue(recursiveEquals(term5030, term14938));
    }

};


