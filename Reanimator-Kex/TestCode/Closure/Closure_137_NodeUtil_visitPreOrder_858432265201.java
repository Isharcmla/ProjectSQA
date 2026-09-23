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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NodeUtil_visitPreOrder_858432265201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2981;

    public NodeUtil_visitPreOrder_858432265201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2981 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2983 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2985 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2991 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2994 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2998 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3001 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3004 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2981, term2981.getClass(), "type", -1174440096);
        setIntField(term2983, term2983.getClass(), "type", -191639503);
        setIntField(term2985, term2985.getClass(), "type", 0);
        setField(term2985, term2985.getClass(), "next", null);
        setField(term2985, term2985.getClass(), "first", null);
        setField(term2985, term2985.getClass(), "last", null);
        setField(term2985, term2985.getClass(), "propListHead", null);
        setIntField(term2985, term2985.getClass(), "sourcePosition", 0);
        setField(term2985, term2985.getClass(), "jsType", null);
        setField(term2985, term2985.getClass(), "parent", null);
        setField(term2983, term2983.getClass(), "next", term2985);
        setIntField(term2988, term2988.getClass(), "type", 0);
        setField(term2988, term2988.getClass(), "next", null);
        setField(term2988, term2988.getClass(), "first", null);
        setField(term2988, term2988.getClass(), "last", null);
        setField(term2988, term2988.getClass(), "propListHead", null);
        setIntField(term2988, term2988.getClass(), "sourcePosition", 0);
        setField(term2988, term2988.getClass(), "jsType", null);
        setField(term2988, term2988.getClass(), "parent", null);
        setField(term2983, term2983.getClass(), "first", term2988);
        setIntField(term2991, term2991.getClass(), "type", 0);
        setField(term2991, term2991.getClass(), "next", null);
        setField(term2991, term2991.getClass(), "first", null);
        setField(term2991, term2991.getClass(), "last", null);
        setField(term2991, term2991.getClass(), "propListHead", null);
        setIntField(term2991, term2991.getClass(), "sourcePosition", 0);
        setField(term2991, term2991.getClass(), "jsType", null);
        setField(term2991, term2991.getClass(), "parent", null);
        setField(term2983, term2983.getClass(), "last", term2991);
        setField(term2994, term2994.getClass(), "next", null);
        setIntField(term2994, term2994.getClass(), "type", 0);
        setIntField(term2994, term2994.getClass(), "intValue", 0);
        setField(term2994, term2994.getClass(), "objectValue", null);
        setField(term2983, term2983.getClass(), "propListHead", term2994);
        setIntField(term2983, term2983.getClass(), "sourcePosition", 697841387);
        setField(term2983, term2983.getClass(), "jsType", null);
        setField(term2983, term2983.getClass(), "parent", null);
        setField(term2981, term2981.getClass(), "next", term2983);
        setIntField(term2998, term2998.getClass(), "type", 0);
        setField(term2998, term2998.getClass(), "next", null);
        setField(term2998, term2998.getClass(), "first", null);
        setField(term2998, term2998.getClass(), "last", null);
        setField(term2998, term2998.getClass(), "propListHead", null);
        setIntField(term2998, term2998.getClass(), "sourcePosition", 0);
        setField(term2998, term2998.getClass(), "jsType", null);
        setField(term2998, term2998.getClass(), "parent", null);
        setField(term2981, term2981.getClass(), "first", term2998);
        setIntField(term3001, term3001.getClass(), "type", 0);
        setField(term3001, term3001.getClass(), "next", null);
        setField(term3001, term3001.getClass(), "first", null);
        setField(term3001, term3001.getClass(), "last", null);
        setField(term3001, term3001.getClass(), "propListHead", null);
        setIntField(term3001, term3001.getClass(), "sourcePosition", 0);
        setField(term3001, term3001.getClass(), "jsType", null);
        setField(term3001, term3001.getClass(), "parent", null);
        setField(term2981, term2981.getClass(), "last", term3001);
        setField(term3004, term3004.getClass(), "next", null);
        setIntField(term3004, term3004.getClass(), "type", 0);
        setIntField(term3004, term3004.getClass(), "intValue", 0);
        setField(term3004, term3004.getClass(), "objectValue", null);
        setField(term2981, term2981.getClass(), "propListHead", term3004);
        setIntField(term2981, term2981.getClass(), "sourcePosition", -1749591213);
        setField(term2981, term2981.getClass(), "jsType", null);
        setField(term2981, term2981.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeUtil$Visitor");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term2981;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "visitPreOrder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


