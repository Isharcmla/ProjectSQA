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

public class NodeUtil_isFunctionObjectApply_1904386250191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1999;
     Object term12349;

    public NodeUtil_isFunctionObjectApply_1904386250191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1999 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2001 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2003 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2006 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2009 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2012 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2016 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2019 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2022 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1999, term1999.getClass(), "type", -284885486);
        setIntField(term2001, term2001.getClass(), "type", 915367534);
        setIntField(term2003, term2003.getClass(), "type", 0);
        setField(term2003, term2003.getClass(), "next", null);
        setField(term2003, term2003.getClass(), "first", null);
        setField(term2003, term2003.getClass(), "last", null);
        setField(term2003, term2003.getClass(), "propListHead", null);
        setIntField(term2003, term2003.getClass(), "sourcePosition", 0);
        setField(term2003, term2003.getClass(), "jsType", null);
        setField(term2003, term2003.getClass(), "parent", null);
        setField(term2001, term2001.getClass(), "next", term2003);
        setIntField(term2006, term2006.getClass(), "type", 0);
        setField(term2006, term2006.getClass(), "next", null);
        setField(term2006, term2006.getClass(), "first", null);
        setField(term2006, term2006.getClass(), "last", null);
        setField(term2006, term2006.getClass(), "propListHead", null);
        setIntField(term2006, term2006.getClass(), "sourcePosition", 0);
        setField(term2006, term2006.getClass(), "jsType", null);
        setField(term2006, term2006.getClass(), "parent", null);
        setField(term2001, term2001.getClass(), "first", term2006);
        setIntField(term2009, term2009.getClass(), "type", 0);
        setField(term2009, term2009.getClass(), "next", null);
        setField(term2009, term2009.getClass(), "first", null);
        setField(term2009, term2009.getClass(), "last", null);
        setField(term2009, term2009.getClass(), "propListHead", null);
        setIntField(term2009, term2009.getClass(), "sourcePosition", 0);
        setField(term2009, term2009.getClass(), "jsType", null);
        setField(term2009, term2009.getClass(), "parent", null);
        setField(term2001, term2001.getClass(), "last", term2009);
        setField(term2012, term2012.getClass(), "next", null);
        setIntField(term2012, term2012.getClass(), "type", 0);
        setIntField(term2012, term2012.getClass(), "intValue", 0);
        setField(term2012, term2012.getClass(), "objectValue", null);
        setField(term2001, term2001.getClass(), "propListHead", term2012);
        setIntField(term2001, term2001.getClass(), "sourcePosition", 710986341);
        setField(term2001, term2001.getClass(), "jsType", null);
        setField(term2001, term2001.getClass(), "parent", null);
        setField(term1999, term1999.getClass(), "next", term2001);
        setIntField(term2016, term2016.getClass(), "type", 0);
        setField(term2016, term2016.getClass(), "next", null);
        setField(term2016, term2016.getClass(), "first", null);
        setField(term2016, term2016.getClass(), "last", null);
        setField(term2016, term2016.getClass(), "propListHead", null);
        setIntField(term2016, term2016.getClass(), "sourcePosition", 0);
        setField(term2016, term2016.getClass(), "jsType", null);
        setField(term2016, term2016.getClass(), "parent", null);
        setField(term1999, term1999.getClass(), "first", term2016);
        setIntField(term2019, term2019.getClass(), "type", 0);
        setField(term2019, term2019.getClass(), "next", null);
        setField(term2019, term2019.getClass(), "first", null);
        setField(term2019, term2019.getClass(), "last", null);
        setField(term2019, term2019.getClass(), "propListHead", null);
        setIntField(term2019, term2019.getClass(), "sourcePosition", 0);
        setField(term2019, term2019.getClass(), "jsType", null);
        setField(term2019, term2019.getClass(), "parent", null);
        setField(term1999, term1999.getClass(), "last", term2019);
        setField(term2022, term2022.getClass(), "next", null);
        setIntField(term2022, term2022.getClass(), "type", 0);
        setIntField(term2022, term2022.getClass(), "intValue", 0);
        setField(term2022, term2022.getClass(), "objectValue", null);
        setField(term1999, term1999.getClass(), "propListHead", term2022);
        setIntField(term1999, term1999.getClass(), "sourcePosition", -873958002);
        setField(term1999, term1999.getClass(), "jsType", null);
        setField(term1999, term1999.getClass(), "parent", null);
        term12349 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12350 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12351 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12352 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12353 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12354 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term12355 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12356 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12357 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term12349, term12349.getClass(), "type", -284885486);
        setIntField(term12350, term12350.getClass(), "type", 915367534);
        setIntField(term12351, term12351.getClass(), "type", 0);
        setField(term12351, term12351.getClass(), "next", null);
        setField(term12351, term12351.getClass(), "first", null);
        setField(term12351, term12351.getClass(), "last", null);
        setField(term12351, term12351.getClass(), "propListHead", null);
        setIntField(term12351, term12351.getClass(), "sourcePosition", 0);
        setField(term12351, term12351.getClass(), "jsType", null);
        setField(term12351, term12351.getClass(), "parent", null);
        setField(term12350, term12350.getClass(), "next", term12351);
        setIntField(term12352, term12352.getClass(), "type", 0);
        setField(term12352, term12352.getClass(), "next", null);
        setField(term12352, term12352.getClass(), "first", null);
        setField(term12352, term12352.getClass(), "last", null);
        setField(term12352, term12352.getClass(), "propListHead", null);
        setIntField(term12352, term12352.getClass(), "sourcePosition", 0);
        setField(term12352, term12352.getClass(), "jsType", null);
        setField(term12352, term12352.getClass(), "parent", null);
        setField(term12350, term12350.getClass(), "first", term12352);
        setIntField(term12353, term12353.getClass(), "type", 0);
        setField(term12353, term12353.getClass(), "next", null);
        setField(term12353, term12353.getClass(), "first", null);
        setField(term12353, term12353.getClass(), "last", null);
        setField(term12353, term12353.getClass(), "propListHead", null);
        setIntField(term12353, term12353.getClass(), "sourcePosition", 0);
        setField(term12353, term12353.getClass(), "jsType", null);
        setField(term12353, term12353.getClass(), "parent", null);
        setField(term12350, term12350.getClass(), "last", term12353);
        setField(term12354, term12354.getClass(), "next", null);
        setIntField(term12354, term12354.getClass(), "type", 0);
        setIntField(term12354, term12354.getClass(), "intValue", 0);
        setField(term12354, term12354.getClass(), "objectValue", null);
        setField(term12350, term12350.getClass(), "propListHead", term12354);
        setIntField(term12350, term12350.getClass(), "sourcePosition", 710986341);
        setField(term12350, term12350.getClass(), "jsType", null);
        setField(term12350, term12350.getClass(), "parent", null);
        setField(term12349, term12349.getClass(), "next", term12350);
        setIntField(term12355, term12355.getClass(), "type", 0);
        setField(term12355, term12355.getClass(), "next", null);
        setField(term12355, term12355.getClass(), "first", null);
        setField(term12355, term12355.getClass(), "last", null);
        setField(term12355, term12355.getClass(), "propListHead", null);
        setIntField(term12355, term12355.getClass(), "sourcePosition", 0);
        setField(term12355, term12355.getClass(), "jsType", null);
        setField(term12355, term12355.getClass(), "parent", null);
        setField(term12349, term12349.getClass(), "first", term12355);
        setIntField(term12356, term12356.getClass(), "type", 0);
        setField(term12356, term12356.getClass(), "next", null);
        setField(term12356, term12356.getClass(), "first", null);
        setField(term12356, term12356.getClass(), "last", null);
        setField(term12356, term12356.getClass(), "propListHead", null);
        setIntField(term12356, term12356.getClass(), "sourcePosition", 0);
        setField(term12356, term12356.getClass(), "jsType", null);
        setField(term12356, term12356.getClass(), "parent", null);
        setField(term12349, term12349.getClass(), "last", term12356);
        setField(term12357, term12357.getClass(), "next", null);
        setIntField(term12357, term12357.getClass(), "type", 0);
        setIntField(term12357, term12357.getClass(), "intValue", 0);
        setField(term12357, term12357.getClass(), "objectValue", null);
        setField(term12349, term12349.getClass(), "propListHead", term12357);
        setIntField(term12349, term12349.getClass(), "sourcePosition", -873958002);
        setField(term12349, term12349.getClass(), "jsType", null);
        setField(term12349, term12349.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1999;
        callMethod(klass, "isFunctionObjectApply", argTypes, null, args);
        assertTrue(recursiveEquals(term1999, term12349));
    }

};


