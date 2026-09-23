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

public class NodeUtil_getSourceName_466164534296 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4241;
     Object term25680;

    public NodeUtil_getSourceName_466164534296() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4241 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4243 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4245 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4248 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4251 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4254 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term4258 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4261 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4264 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term4241, term4241.getClass(), "type", -1702132549);
        setIntField(term4243, term4243.getClass(), "type", 1957633116);
        setIntField(term4245, term4245.getClass(), "type", 0);
        setField(term4245, term4245.getClass(), "next", null);
        setField(term4245, term4245.getClass(), "first", null);
        setField(term4245, term4245.getClass(), "last", null);
        setField(term4245, term4245.getClass(), "propListHead", null);
        setIntField(term4245, term4245.getClass(), "sourcePosition", 0);
        setField(term4245, term4245.getClass(), "jsType", null);
        setField(term4245, term4245.getClass(), "parent", null);
        setField(term4243, term4243.getClass(), "next", term4245);
        setIntField(term4248, term4248.getClass(), "type", 0);
        setField(term4248, term4248.getClass(), "next", null);
        setField(term4248, term4248.getClass(), "first", null);
        setField(term4248, term4248.getClass(), "last", null);
        setField(term4248, term4248.getClass(), "propListHead", null);
        setIntField(term4248, term4248.getClass(), "sourcePosition", 0);
        setField(term4248, term4248.getClass(), "jsType", null);
        setField(term4248, term4248.getClass(), "parent", null);
        setField(term4243, term4243.getClass(), "first", term4248);
        setIntField(term4251, term4251.getClass(), "type", 0);
        setField(term4251, term4251.getClass(), "next", null);
        setField(term4251, term4251.getClass(), "first", null);
        setField(term4251, term4251.getClass(), "last", null);
        setField(term4251, term4251.getClass(), "propListHead", null);
        setIntField(term4251, term4251.getClass(), "sourcePosition", 0);
        setField(term4251, term4251.getClass(), "jsType", null);
        setField(term4251, term4251.getClass(), "parent", null);
        setField(term4243, term4243.getClass(), "last", term4251);
        setField(term4254, term4254.getClass(), "next", null);
        setIntField(term4254, term4254.getClass(), "type", 0);
        setIntField(term4254, term4254.getClass(), "intValue", 0);
        setField(term4254, term4254.getClass(), "objectValue", null);
        setField(term4243, term4243.getClass(), "propListHead", term4254);
        setIntField(term4243, term4243.getClass(), "sourcePosition", 1846399918);
        setField(term4243, term4243.getClass(), "jsType", null);
        setField(term4243, term4243.getClass(), "parent", null);
        setField(term4241, term4241.getClass(), "next", term4243);
        setIntField(term4258, term4258.getClass(), "type", 0);
        setField(term4258, term4258.getClass(), "next", null);
        setField(term4258, term4258.getClass(), "first", null);
        setField(term4258, term4258.getClass(), "last", null);
        setField(term4258, term4258.getClass(), "propListHead", null);
        setIntField(term4258, term4258.getClass(), "sourcePosition", 0);
        setField(term4258, term4258.getClass(), "jsType", null);
        setField(term4258, term4258.getClass(), "parent", null);
        setField(term4241, term4241.getClass(), "first", term4258);
        setIntField(term4261, term4261.getClass(), "type", 0);
        setField(term4261, term4261.getClass(), "next", null);
        setField(term4261, term4261.getClass(), "first", null);
        setField(term4261, term4261.getClass(), "last", null);
        setField(term4261, term4261.getClass(), "propListHead", null);
        setIntField(term4261, term4261.getClass(), "sourcePosition", 0);
        setField(term4261, term4261.getClass(), "jsType", null);
        setField(term4261, term4261.getClass(), "parent", null);
        setField(term4241, term4241.getClass(), "last", term4261);
        setField(term4264, term4264.getClass(), "next", null);
        setIntField(term4264, term4264.getClass(), "type", 0);
        setIntField(term4264, term4264.getClass(), "intValue", 0);
        setField(term4264, term4264.getClass(), "objectValue", null);
        setField(term4241, term4241.getClass(), "propListHead", term4264);
        setIntField(term4241, term4241.getClass(), "sourcePosition", 35388821);
        setField(term4241, term4241.getClass(), "jsType", null);
        setField(term4241, term4241.getClass(), "parent", null);
        term25680 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25681 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25682 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25683 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25684 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25685 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term25686 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25687 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25688 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term25680, term25680.getClass(), "type", -1702132549);
        setIntField(term25681, term25681.getClass(), "type", 1957633116);
        setIntField(term25682, term25682.getClass(), "type", 0);
        setField(term25682, term25682.getClass(), "next", null);
        setField(term25682, term25682.getClass(), "first", null);
        setField(term25682, term25682.getClass(), "last", null);
        setField(term25682, term25682.getClass(), "propListHead", null);
        setIntField(term25682, term25682.getClass(), "sourcePosition", 0);
        setField(term25682, term25682.getClass(), "jsType", null);
        setField(term25682, term25682.getClass(), "parent", null);
        setField(term25681, term25681.getClass(), "next", term25682);
        setIntField(term25683, term25683.getClass(), "type", 0);
        setField(term25683, term25683.getClass(), "next", null);
        setField(term25683, term25683.getClass(), "first", null);
        setField(term25683, term25683.getClass(), "last", null);
        setField(term25683, term25683.getClass(), "propListHead", null);
        setIntField(term25683, term25683.getClass(), "sourcePosition", 0);
        setField(term25683, term25683.getClass(), "jsType", null);
        setField(term25683, term25683.getClass(), "parent", null);
        setField(term25681, term25681.getClass(), "first", term25683);
        setIntField(term25684, term25684.getClass(), "type", 0);
        setField(term25684, term25684.getClass(), "next", null);
        setField(term25684, term25684.getClass(), "first", null);
        setField(term25684, term25684.getClass(), "last", null);
        setField(term25684, term25684.getClass(), "propListHead", null);
        setIntField(term25684, term25684.getClass(), "sourcePosition", 0);
        setField(term25684, term25684.getClass(), "jsType", null);
        setField(term25684, term25684.getClass(), "parent", null);
        setField(term25681, term25681.getClass(), "last", term25684);
        setField(term25685, term25685.getClass(), "next", null);
        setIntField(term25685, term25685.getClass(), "type", 0);
        setIntField(term25685, term25685.getClass(), "intValue", 0);
        setField(term25685, term25685.getClass(), "objectValue", null);
        setField(term25681, term25681.getClass(), "propListHead", term25685);
        setIntField(term25681, term25681.getClass(), "sourcePosition", 1846399918);
        setField(term25681, term25681.getClass(), "jsType", null);
        setField(term25681, term25681.getClass(), "parent", null);
        setField(term25680, term25680.getClass(), "next", term25681);
        setIntField(term25686, term25686.getClass(), "type", 0);
        setField(term25686, term25686.getClass(), "next", null);
        setField(term25686, term25686.getClass(), "first", null);
        setField(term25686, term25686.getClass(), "last", null);
        setField(term25686, term25686.getClass(), "propListHead", null);
        setIntField(term25686, term25686.getClass(), "sourcePosition", 0);
        setField(term25686, term25686.getClass(), "jsType", null);
        setField(term25686, term25686.getClass(), "parent", null);
        setField(term25680, term25680.getClass(), "first", term25686);
        setIntField(term25687, term25687.getClass(), "type", 0);
        setField(term25687, term25687.getClass(), "next", null);
        setField(term25687, term25687.getClass(), "first", null);
        setField(term25687, term25687.getClass(), "last", null);
        setField(term25687, term25687.getClass(), "propListHead", null);
        setIntField(term25687, term25687.getClass(), "sourcePosition", 0);
        setField(term25687, term25687.getClass(), "jsType", null);
        setField(term25687, term25687.getClass(), "parent", null);
        setField(term25680, term25680.getClass(), "last", term25687);
        setField(term25688, term25688.getClass(), "next", null);
        setIntField(term25688, term25688.getClass(), "type", 0);
        setIntField(term25688, term25688.getClass(), "intValue", 0);
        setField(term25688, term25688.getClass(), "objectValue", null);
        setField(term25680, term25680.getClass(), "propListHead", term25688);
        setIntField(term25680, term25680.getClass(), "sourcePosition", 35388821);
        setField(term25680, term25680.getClass(), "jsType", null);
        setField(term25680, term25680.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term4241;
        callMethod(klass, "getSourceName", argTypes, null, args);
        assertTrue(recursiveEquals(term4241, term25680));
    }

};


