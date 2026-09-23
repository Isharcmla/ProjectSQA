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

public class NodeUtil_mayBeString_2061010946195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1103;
     Object term10932;

    public NodeUtil_mayBeString_2061010946195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1103 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1105 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1107 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1110 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1113 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1116 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1120 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1123 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1126 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1103, term1103.getClass(), "type", 1607082164);
        setIntField(term1105, term1105.getClass(), "type", 91958879);
        setIntField(term1107, term1107.getClass(), "type", 0);
        setField(term1107, term1107.getClass(), "next", null);
        setField(term1107, term1107.getClass(), "first", null);
        setField(term1107, term1107.getClass(), "last", null);
        setField(term1107, term1107.getClass(), "propListHead", null);
        setIntField(term1107, term1107.getClass(), "sourcePosition", 0);
        setField(term1107, term1107.getClass(), "jsType", null);
        setField(term1107, term1107.getClass(), "parent", null);
        setField(term1105, term1105.getClass(), "next", term1107);
        setIntField(term1110, term1110.getClass(), "type", 0);
        setField(term1110, term1110.getClass(), "next", null);
        setField(term1110, term1110.getClass(), "first", null);
        setField(term1110, term1110.getClass(), "last", null);
        setField(term1110, term1110.getClass(), "propListHead", null);
        setIntField(term1110, term1110.getClass(), "sourcePosition", 0);
        setField(term1110, term1110.getClass(), "jsType", null);
        setField(term1110, term1110.getClass(), "parent", null);
        setField(term1105, term1105.getClass(), "first", term1110);
        setIntField(term1113, term1113.getClass(), "type", 0);
        setField(term1113, term1113.getClass(), "next", null);
        setField(term1113, term1113.getClass(), "first", null);
        setField(term1113, term1113.getClass(), "last", null);
        setField(term1113, term1113.getClass(), "propListHead", null);
        setIntField(term1113, term1113.getClass(), "sourcePosition", 0);
        setField(term1113, term1113.getClass(), "jsType", null);
        setField(term1113, term1113.getClass(), "parent", null);
        setField(term1105, term1105.getClass(), "last", term1113);
        setField(term1116, term1116.getClass(), "next", null);
        setIntField(term1116, term1116.getClass(), "type", 0);
        setIntField(term1116, term1116.getClass(), "intValue", 0);
        setField(term1116, term1116.getClass(), "objectValue", null);
        setField(term1105, term1105.getClass(), "propListHead", term1116);
        setIntField(term1105, term1105.getClass(), "sourcePosition", 644154104);
        setField(term1105, term1105.getClass(), "jsType", null);
        setField(term1105, term1105.getClass(), "parent", null);
        setField(term1103, term1103.getClass(), "next", term1105);
        setIntField(term1120, term1120.getClass(), "type", 0);
        setField(term1120, term1120.getClass(), "next", null);
        setField(term1120, term1120.getClass(), "first", null);
        setField(term1120, term1120.getClass(), "last", null);
        setField(term1120, term1120.getClass(), "propListHead", null);
        setIntField(term1120, term1120.getClass(), "sourcePosition", 0);
        setField(term1120, term1120.getClass(), "jsType", null);
        setField(term1120, term1120.getClass(), "parent", null);
        setField(term1103, term1103.getClass(), "first", term1120);
        setIntField(term1123, term1123.getClass(), "type", 0);
        setField(term1123, term1123.getClass(), "next", null);
        setField(term1123, term1123.getClass(), "first", null);
        setField(term1123, term1123.getClass(), "last", null);
        setField(term1123, term1123.getClass(), "propListHead", null);
        setIntField(term1123, term1123.getClass(), "sourcePosition", 0);
        setField(term1123, term1123.getClass(), "jsType", null);
        setField(term1123, term1123.getClass(), "parent", null);
        setField(term1103, term1103.getClass(), "last", term1123);
        setField(term1126, term1126.getClass(), "next", null);
        setIntField(term1126, term1126.getClass(), "type", 0);
        setIntField(term1126, term1126.getClass(), "intValue", 0);
        setField(term1126, term1126.getClass(), "objectValue", null);
        setField(term1103, term1103.getClass(), "propListHead", term1126);
        setIntField(term1103, term1103.getClass(), "sourcePosition", 76650923);
        setField(term1103, term1103.getClass(), "jsType", null);
        setField(term1103, term1103.getClass(), "parent", null);
        term10932 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10933 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10934 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10935 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10936 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10937 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term10938 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10939 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10940 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term10932, term10932.getClass(), "type", 1607082164);
        setIntField(term10933, term10933.getClass(), "type", 91958879);
        setIntField(term10934, term10934.getClass(), "type", 0);
        setField(term10934, term10934.getClass(), "next", null);
        setField(term10934, term10934.getClass(), "first", null);
        setField(term10934, term10934.getClass(), "last", null);
        setField(term10934, term10934.getClass(), "propListHead", null);
        setIntField(term10934, term10934.getClass(), "sourcePosition", 0);
        setField(term10934, term10934.getClass(), "jsType", null);
        setField(term10934, term10934.getClass(), "parent", null);
        setField(term10933, term10933.getClass(), "next", term10934);
        setIntField(term10935, term10935.getClass(), "type", 0);
        setField(term10935, term10935.getClass(), "next", null);
        setField(term10935, term10935.getClass(), "first", null);
        setField(term10935, term10935.getClass(), "last", null);
        setField(term10935, term10935.getClass(), "propListHead", null);
        setIntField(term10935, term10935.getClass(), "sourcePosition", 0);
        setField(term10935, term10935.getClass(), "jsType", null);
        setField(term10935, term10935.getClass(), "parent", null);
        setField(term10933, term10933.getClass(), "first", term10935);
        setIntField(term10936, term10936.getClass(), "type", 0);
        setField(term10936, term10936.getClass(), "next", null);
        setField(term10936, term10936.getClass(), "first", null);
        setField(term10936, term10936.getClass(), "last", null);
        setField(term10936, term10936.getClass(), "propListHead", null);
        setIntField(term10936, term10936.getClass(), "sourcePosition", 0);
        setField(term10936, term10936.getClass(), "jsType", null);
        setField(term10936, term10936.getClass(), "parent", null);
        setField(term10933, term10933.getClass(), "last", term10936);
        setField(term10937, term10937.getClass(), "next", null);
        setIntField(term10937, term10937.getClass(), "type", 0);
        setIntField(term10937, term10937.getClass(), "intValue", 0);
        setField(term10937, term10937.getClass(), "objectValue", null);
        setField(term10933, term10933.getClass(), "propListHead", term10937);
        setIntField(term10933, term10933.getClass(), "sourcePosition", 644154104);
        setField(term10933, term10933.getClass(), "jsType", null);
        setField(term10933, term10933.getClass(), "parent", null);
        setField(term10932, term10932.getClass(), "next", term10933);
        setIntField(term10938, term10938.getClass(), "type", 0);
        setField(term10938, term10938.getClass(), "next", null);
        setField(term10938, term10938.getClass(), "first", null);
        setField(term10938, term10938.getClass(), "last", null);
        setField(term10938, term10938.getClass(), "propListHead", null);
        setIntField(term10938, term10938.getClass(), "sourcePosition", 0);
        setField(term10938, term10938.getClass(), "jsType", null);
        setField(term10938, term10938.getClass(), "parent", null);
        setField(term10932, term10932.getClass(), "first", term10938);
        setIntField(term10939, term10939.getClass(), "type", 0);
        setField(term10939, term10939.getClass(), "next", null);
        setField(term10939, term10939.getClass(), "first", null);
        setField(term10939, term10939.getClass(), "last", null);
        setField(term10939, term10939.getClass(), "propListHead", null);
        setIntField(term10939, term10939.getClass(), "sourcePosition", 0);
        setField(term10939, term10939.getClass(), "jsType", null);
        setField(term10939, term10939.getClass(), "parent", null);
        setField(term10932, term10932.getClass(), "last", term10939);
        setField(term10940, term10940.getClass(), "next", null);
        setIntField(term10940, term10940.getClass(), "type", 0);
        setIntField(term10940, term10940.getClass(), "intValue", 0);
        setField(term10940, term10940.getClass(), "objectValue", null);
        setField(term10932, term10932.getClass(), "propListHead", term10940);
        setIntField(term10932, term10932.getClass(), "sourcePosition", 76650923);
        setField(term10932, term10932.getClass(), "jsType", null);
        setField(term10932, term10932.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1103;
        callMethod(klass, "mayBeString", argTypes, null, args);
        assertTrue(recursiveEquals(term1103, term10932));
    }

};


