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

public class CollapseProperties_flattenNameRefAtDepth_172779351561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57646;
     Object term57716;
     Object term57756;
     Object term57757;

    public CollapseProperties_flattenNameRefAtDepth_172779351561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57646 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        term57716 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term57716, term57716.getClass(), "type", 33);
        term57756 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term57756, term57756.getClass(), "compiler", null);
        setField(term57756, term57756.getClass(), "globalNames", null);
        setField(term57756, term57756.getClass(), "nameMap", null);
        setBooleanField(term57756, term57756.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term57756, term57756.getClass(), "inlineAliases", false);
        term57757 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term57757, term57757.getClass(), "type", 33);
        setField(term57757, term57757.getClass(), "next", null);
        setField(term57757, term57757.getClass(), "first", null);
        setField(term57757, term57757.getClass(), "last", null);
        setField(term57757, term57757.getClass(), "propListHead", null);
        setIntField(term57757, term57757.getClass(), "sourcePosition", 0);
        setField(term57757, term57757.getClass(), "jsType", null);
        setField(term57757, term57757.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term57716;
        args[2] = 0;
        args[3] = null;
        callMethod(klass, "flattenNameRefAtDepth", argTypes, term57646, args);
        assertTrue(recursiveEquals(term57646, term57756));
        assertTrue(recursiveEquals(term57716, null));
    }

};


