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
import java.lang.Object;

public class NodeUtil_tryMergeBlock_1632890151231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2004;

    public NodeUtil_tryMergeBlock_1632890151231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2004 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2006 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2008 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2010 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2012 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2015 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2019 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2021 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2026 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term2004, term2004.getClass(), "type", 1431951992);
        setIntField(term2006, term2006.getClass(), "type", -1608123016);
        setIntField(term2008, term2008.getClass(), "type", -896473214);
        setIntField(term2010, term2010.getClass(), "type", 401203924);
        setIntField(term2012, term2012.getClass(), "type", -1212399479);
        setField(term2012, term2012.getClass(), "next", null);
        setField(term2012, term2012.getClass(), "first", null);
        setField(term2012, term2012.getClass(), "last", null);
        setField(term2012, term2012.getClass(), "propListHead", null);
        setIntField(term2012, term2012.getClass(), "sourcePosition", 0);
        setField(term2012, term2012.getClass(), "jsType", null);
        setField(term2012, term2012.getClass(), "parent", null);
        setField(term2010, term2010.getClass(), "next", term2012);
        setIntField(term2015, term2015.getClass(), "type", 2107679041);
        setField(term2015, term2015.getClass(), "next", null);
        setField(term2015, term2015.getClass(), "first", null);
        setField(term2015, term2015.getClass(), "last", term2012);
        setField(term2015, term2015.getClass(), "propListHead", null);
        setIntField(term2015, term2015.getClass(), "sourcePosition", 0);
        setField(term2015, term2015.getClass(), "jsType", null);
        setField(term2015, term2015.getClass(), "parent", null);
        setField(term2010, term2010.getClass(), "first", term2015);
        setField(term2010, term2010.getClass(), "last", term2008);
        setField(term2010, term2010.getClass(), "propListHead", null);
        setIntField(term2010, term2010.getClass(), "sourcePosition", 0);
        setField(term2010, term2010.getClass(), "jsType", null);
        setField(term2010, term2010.getClass(), "parent", null);
        setField(term2008, term2008.getClass(), "next", term2010);
        setField(term2008, term2008.getClass(), "first", term2012);
        setIntField(term2019, term2019.getClass(), "type", -1281083262);
        setIntField(term2021, term2021.getClass(), "type", 1059930704);
        setField(term2021, term2021.getClass(), "next", null);
        setField(term2021, term2021.getClass(), "first", term2015);
        setField(term2021, term2021.getClass(), "last", term2010);
        setField(term2021, term2021.getClass(), "propListHead", null);
        setIntField(term2021, term2021.getClass(), "sourcePosition", 0);
        setField(term2021, term2021.getClass(), "jsType", null);
        setField(term2021, term2021.getClass(), "parent", null);
        setField(term2019, term2019.getClass(), "next", term2021);
        setField(term2019, term2019.getClass(), "first", term2006);
        setField(term2019, term2019.getClass(), "last", term2006);
        setField(term2019, term2019.getClass(), "propListHead", null);
        setIntField(term2019, term2019.getClass(), "sourcePosition", 0);
        setField(term2019, term2019.getClass(), "jsType", null);
        setField(term2019, term2019.getClass(), "parent", null);
        setField(term2008, term2008.getClass(), "last", term2019);
        setField(term2008, term2008.getClass(), "propListHead", null);
        setIntField(term2008, term2008.getClass(), "sourcePosition", 0);
        setField(term2008, term2008.getClass(), "jsType", null);
        setField(term2008, term2008.getClass(), "parent", null);
        setField(term2006, term2006.getClass(), "next", term2008);
        setIntField(term2026, term2026.getClass(), "type", -1967153290);
        setField(term2026, term2026.getClass(), "next", term2019);
        setField(term2026, term2026.getClass(), "first", term2021);
        setField(term2026, term2026.getClass(), "last", term2004);
        setField(term2026, term2026.getClass(), "propListHead", null);
        setIntField(term2026, term2026.getClass(), "sourcePosition", 0);
        setField(term2026, term2026.getClass(), "jsType", null);
        setField(term2026, term2026.getClass(), "parent", null);
        setField(term2006, term2006.getClass(), "first", term2026);
        setField(term2006, term2006.getClass(), "last", term2026);
        setField(term2006, term2006.getClass(), "propListHead", null);
        setIntField(term2006, term2006.getClass(), "sourcePosition", 0);
        setField(term2006, term2006.getClass(), "jsType", null);
        setField(term2006, term2006.getClass(), "parent", null);
        setField(term2004, term2004.getClass(), "next", term2006);
        setField(term2004, term2004.getClass(), "first", term2010);
        setField(term2004, term2004.getClass(), "last", term2012);
        setField(term2004, term2004.getClass(), "propListHead", null);
        setIntField(term2004, term2004.getClass(), "sourcePosition", 0);
        setField(term2004, term2004.getClass(), "jsType", null);
        setField(term2004, term2004.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2004;
        try {
            callMethod(klass, "tryMergeBlock", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


