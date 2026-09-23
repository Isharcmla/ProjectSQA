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

public class NodeUtil_isSwitchCase_1170575017226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1919;
     Object term13740;

    public NodeUtil_isSwitchCase_1170575017226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1919 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1921 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1923 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1926 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1929 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1932 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1936 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1939 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1942 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1919, term1919.getClass(), "type", -944986533);
        setIntField(term1921, term1921.getClass(), "type", -1165271567);
        setIntField(term1923, term1923.getClass(), "type", 0);
        setField(term1923, term1923.getClass(), "next", null);
        setField(term1923, term1923.getClass(), "first", null);
        setField(term1923, term1923.getClass(), "last", null);
        setField(term1923, term1923.getClass(), "propListHead", null);
        setIntField(term1923, term1923.getClass(), "sourcePosition", 0);
        setField(term1923, term1923.getClass(), "jsType", null);
        setField(term1923, term1923.getClass(), "parent", null);
        setField(term1921, term1921.getClass(), "next", term1923);
        setIntField(term1926, term1926.getClass(), "type", 0);
        setField(term1926, term1926.getClass(), "next", null);
        setField(term1926, term1926.getClass(), "first", null);
        setField(term1926, term1926.getClass(), "last", null);
        setField(term1926, term1926.getClass(), "propListHead", null);
        setIntField(term1926, term1926.getClass(), "sourcePosition", 0);
        setField(term1926, term1926.getClass(), "jsType", null);
        setField(term1926, term1926.getClass(), "parent", null);
        setField(term1921, term1921.getClass(), "first", term1926);
        setIntField(term1929, term1929.getClass(), "type", 0);
        setField(term1929, term1929.getClass(), "next", null);
        setField(term1929, term1929.getClass(), "first", null);
        setField(term1929, term1929.getClass(), "last", null);
        setField(term1929, term1929.getClass(), "propListHead", null);
        setIntField(term1929, term1929.getClass(), "sourcePosition", 0);
        setField(term1929, term1929.getClass(), "jsType", null);
        setField(term1929, term1929.getClass(), "parent", null);
        setField(term1921, term1921.getClass(), "last", term1929);
        setField(term1932, term1932.getClass(), "next", null);
        setIntField(term1932, term1932.getClass(), "type", 0);
        setIntField(term1932, term1932.getClass(), "intValue", 0);
        setField(term1932, term1932.getClass(), "objectValue", null);
        setField(term1921, term1921.getClass(), "propListHead", term1932);
        setIntField(term1921, term1921.getClass(), "sourcePosition", -642716895);
        setField(term1921, term1921.getClass(), "jsType", null);
        setField(term1921, term1921.getClass(), "parent", null);
        setField(term1919, term1919.getClass(), "next", term1921);
        setIntField(term1936, term1936.getClass(), "type", 0);
        setField(term1936, term1936.getClass(), "next", null);
        setField(term1936, term1936.getClass(), "first", null);
        setField(term1936, term1936.getClass(), "last", null);
        setField(term1936, term1936.getClass(), "propListHead", null);
        setIntField(term1936, term1936.getClass(), "sourcePosition", 0);
        setField(term1936, term1936.getClass(), "jsType", null);
        setField(term1936, term1936.getClass(), "parent", null);
        setField(term1919, term1919.getClass(), "first", term1936);
        setIntField(term1939, term1939.getClass(), "type", 0);
        setField(term1939, term1939.getClass(), "next", null);
        setField(term1939, term1939.getClass(), "first", null);
        setField(term1939, term1939.getClass(), "last", null);
        setField(term1939, term1939.getClass(), "propListHead", null);
        setIntField(term1939, term1939.getClass(), "sourcePosition", 0);
        setField(term1939, term1939.getClass(), "jsType", null);
        setField(term1939, term1939.getClass(), "parent", null);
        setField(term1919, term1919.getClass(), "last", term1939);
        setField(term1942, term1942.getClass(), "next", null);
        setIntField(term1942, term1942.getClass(), "type", 0);
        setIntField(term1942, term1942.getClass(), "intValue", 0);
        setField(term1942, term1942.getClass(), "objectValue", null);
        setField(term1919, term1919.getClass(), "propListHead", term1942);
        setIntField(term1919, term1919.getClass(), "sourcePosition", 1743398246);
        setField(term1919, term1919.getClass(), "jsType", null);
        setField(term1919, term1919.getClass(), "parent", null);
        term13740 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13741 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13742 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13743 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13744 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13745 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term13746 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13747 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13748 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term13740, term13740.getClass(), "type", -944986533);
        setIntField(term13741, term13741.getClass(), "type", -1165271567);
        setIntField(term13742, term13742.getClass(), "type", 0);
        setField(term13742, term13742.getClass(), "next", null);
        setField(term13742, term13742.getClass(), "first", null);
        setField(term13742, term13742.getClass(), "last", null);
        setField(term13742, term13742.getClass(), "propListHead", null);
        setIntField(term13742, term13742.getClass(), "sourcePosition", 0);
        setField(term13742, term13742.getClass(), "jsType", null);
        setField(term13742, term13742.getClass(), "parent", null);
        setField(term13741, term13741.getClass(), "next", term13742);
        setIntField(term13743, term13743.getClass(), "type", 0);
        setField(term13743, term13743.getClass(), "next", null);
        setField(term13743, term13743.getClass(), "first", null);
        setField(term13743, term13743.getClass(), "last", null);
        setField(term13743, term13743.getClass(), "propListHead", null);
        setIntField(term13743, term13743.getClass(), "sourcePosition", 0);
        setField(term13743, term13743.getClass(), "jsType", null);
        setField(term13743, term13743.getClass(), "parent", null);
        setField(term13741, term13741.getClass(), "first", term13743);
        setIntField(term13744, term13744.getClass(), "type", 0);
        setField(term13744, term13744.getClass(), "next", null);
        setField(term13744, term13744.getClass(), "first", null);
        setField(term13744, term13744.getClass(), "last", null);
        setField(term13744, term13744.getClass(), "propListHead", null);
        setIntField(term13744, term13744.getClass(), "sourcePosition", 0);
        setField(term13744, term13744.getClass(), "jsType", null);
        setField(term13744, term13744.getClass(), "parent", null);
        setField(term13741, term13741.getClass(), "last", term13744);
        setField(term13745, term13745.getClass(), "next", null);
        setIntField(term13745, term13745.getClass(), "type", 0);
        setIntField(term13745, term13745.getClass(), "intValue", 0);
        setField(term13745, term13745.getClass(), "objectValue", null);
        setField(term13741, term13741.getClass(), "propListHead", term13745);
        setIntField(term13741, term13741.getClass(), "sourcePosition", -642716895);
        setField(term13741, term13741.getClass(), "jsType", null);
        setField(term13741, term13741.getClass(), "parent", null);
        setField(term13740, term13740.getClass(), "next", term13741);
        setIntField(term13746, term13746.getClass(), "type", 0);
        setField(term13746, term13746.getClass(), "next", null);
        setField(term13746, term13746.getClass(), "first", null);
        setField(term13746, term13746.getClass(), "last", null);
        setField(term13746, term13746.getClass(), "propListHead", null);
        setIntField(term13746, term13746.getClass(), "sourcePosition", 0);
        setField(term13746, term13746.getClass(), "jsType", null);
        setField(term13746, term13746.getClass(), "parent", null);
        setField(term13740, term13740.getClass(), "first", term13746);
        setIntField(term13747, term13747.getClass(), "type", 0);
        setField(term13747, term13747.getClass(), "next", null);
        setField(term13747, term13747.getClass(), "first", null);
        setField(term13747, term13747.getClass(), "last", null);
        setField(term13747, term13747.getClass(), "propListHead", null);
        setIntField(term13747, term13747.getClass(), "sourcePosition", 0);
        setField(term13747, term13747.getClass(), "jsType", null);
        setField(term13747, term13747.getClass(), "parent", null);
        setField(term13740, term13740.getClass(), "last", term13747);
        setField(term13748, term13748.getClass(), "next", null);
        setIntField(term13748, term13748.getClass(), "type", 0);
        setIntField(term13748, term13748.getClass(), "intValue", 0);
        setField(term13748, term13748.getClass(), "objectValue", null);
        setField(term13740, term13740.getClass(), "propListHead", term13748);
        setIntField(term13740, term13740.getClass(), "sourcePosition", 1743398246);
        setField(term13740, term13740.getClass(), "jsType", null);
        setField(term13740, term13740.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1919;
        Object retValue = callMethod(klass, "isSwitchCase", argTypes, null, args);
        assertTrue(recursiveEquals(term1919, term13740));
        assertTrue(recursiveEquals(retValue, false));
    }

};


