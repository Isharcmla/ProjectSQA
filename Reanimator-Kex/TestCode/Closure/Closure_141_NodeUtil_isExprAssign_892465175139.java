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

public class NodeUtil_isExprAssign_892465175139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term868;
     Object term6939;

    public NodeUtil_isExprAssign_892465175139() {
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
        term6939 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6940 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6941 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6942 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6943 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6944 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term6945 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6946 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6947 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term6939, term6939.getClass(), "type", -938508470);
        setIntField(term6940, term6940.getClass(), "type", -1553893255);
        setIntField(term6941, term6941.getClass(), "type", 0);
        setField(term6941, term6941.getClass(), "next", null);
        setField(term6941, term6941.getClass(), "first", null);
        setField(term6941, term6941.getClass(), "last", null);
        setField(term6941, term6941.getClass(), "propListHead", null);
        setIntField(term6941, term6941.getClass(), "sourcePosition", 0);
        setField(term6941, term6941.getClass(), "jsType", null);
        setField(term6941, term6941.getClass(), "parent", null);
        setField(term6940, term6940.getClass(), "next", term6941);
        setIntField(term6942, term6942.getClass(), "type", 0);
        setField(term6942, term6942.getClass(), "next", null);
        setField(term6942, term6942.getClass(), "first", null);
        setField(term6942, term6942.getClass(), "last", null);
        setField(term6942, term6942.getClass(), "propListHead", null);
        setIntField(term6942, term6942.getClass(), "sourcePosition", 0);
        setField(term6942, term6942.getClass(), "jsType", null);
        setField(term6942, term6942.getClass(), "parent", null);
        setField(term6940, term6940.getClass(), "first", term6942);
        setIntField(term6943, term6943.getClass(), "type", 0);
        setField(term6943, term6943.getClass(), "next", null);
        setField(term6943, term6943.getClass(), "first", null);
        setField(term6943, term6943.getClass(), "last", null);
        setField(term6943, term6943.getClass(), "propListHead", null);
        setIntField(term6943, term6943.getClass(), "sourcePosition", 0);
        setField(term6943, term6943.getClass(), "jsType", null);
        setField(term6943, term6943.getClass(), "parent", null);
        setField(term6940, term6940.getClass(), "last", term6943);
        setField(term6944, term6944.getClass(), "next", null);
        setIntField(term6944, term6944.getClass(), "type", 0);
        setIntField(term6944, term6944.getClass(), "intValue", 0);
        setField(term6944, term6944.getClass(), "objectValue", null);
        setField(term6940, term6940.getClass(), "propListHead", term6944);
        setIntField(term6940, term6940.getClass(), "sourcePosition", -434468428);
        setField(term6940, term6940.getClass(), "jsType", null);
        setField(term6940, term6940.getClass(), "parent", null);
        setField(term6939, term6939.getClass(), "next", term6940);
        setIntField(term6945, term6945.getClass(), "type", 0);
        setField(term6945, term6945.getClass(), "next", null);
        setField(term6945, term6945.getClass(), "first", null);
        setField(term6945, term6945.getClass(), "last", null);
        setField(term6945, term6945.getClass(), "propListHead", null);
        setIntField(term6945, term6945.getClass(), "sourcePosition", 0);
        setField(term6945, term6945.getClass(), "jsType", null);
        setField(term6945, term6945.getClass(), "parent", null);
        setField(term6939, term6939.getClass(), "first", term6945);
        setIntField(term6946, term6946.getClass(), "type", 0);
        setField(term6946, term6946.getClass(), "next", null);
        setField(term6946, term6946.getClass(), "first", null);
        setField(term6946, term6946.getClass(), "last", null);
        setField(term6946, term6946.getClass(), "propListHead", null);
        setIntField(term6946, term6946.getClass(), "sourcePosition", 0);
        setField(term6946, term6946.getClass(), "jsType", null);
        setField(term6946, term6946.getClass(), "parent", null);
        setField(term6939, term6939.getClass(), "last", term6946);
        setField(term6947, term6947.getClass(), "next", null);
        setIntField(term6947, term6947.getClass(), "type", 0);
        setIntField(term6947, term6947.getClass(), "intValue", 0);
        setField(term6947, term6947.getClass(), "objectValue", null);
        setField(term6939, term6939.getClass(), "propListHead", term6947);
        setIntField(term6939, term6939.getClass(), "sourcePosition", 1559605714);
        setField(term6939, term6939.getClass(), "jsType", null);
        setField(term6939, term6939.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term868;
        Object retValue = callMethod(klass, "isExprAssign", argTypes, null, args);
        assertTrue(recursiveEquals(term868, term6939));
        assertTrue(recursiveEquals(retValue, false));
    }

};


