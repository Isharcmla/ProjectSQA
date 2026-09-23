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

public class NodeUtil_redeclareVarsInsideBranch_1330830302177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2007;
     Object term11525;

    public NodeUtil_redeclareVarsInsideBranch_1330830302177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2007 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2009 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2011 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2014 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2017 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2020 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2024 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2027 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2030 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2007, term2007.getClass(), "type", 1949983666);
        setIntField(term2009, term2009.getClass(), "type", -1780848958);
        setIntField(term2011, term2011.getClass(), "type", 0);
        setField(term2011, term2011.getClass(), "next", null);
        setField(term2011, term2011.getClass(), "first", null);
        setField(term2011, term2011.getClass(), "last", null);
        setField(term2011, term2011.getClass(), "propListHead", null);
        setIntField(term2011, term2011.getClass(), "sourcePosition", 0);
        setField(term2011, term2011.getClass(), "jsType", null);
        setField(term2011, term2011.getClass(), "parent", null);
        setField(term2009, term2009.getClass(), "next", term2011);
        setIntField(term2014, term2014.getClass(), "type", 0);
        setField(term2014, term2014.getClass(), "next", null);
        setField(term2014, term2014.getClass(), "first", null);
        setField(term2014, term2014.getClass(), "last", null);
        setField(term2014, term2014.getClass(), "propListHead", null);
        setIntField(term2014, term2014.getClass(), "sourcePosition", 0);
        setField(term2014, term2014.getClass(), "jsType", null);
        setField(term2014, term2014.getClass(), "parent", null);
        setField(term2009, term2009.getClass(), "first", term2014);
        setIntField(term2017, term2017.getClass(), "type", 0);
        setField(term2017, term2017.getClass(), "next", null);
        setField(term2017, term2017.getClass(), "first", null);
        setField(term2017, term2017.getClass(), "last", null);
        setField(term2017, term2017.getClass(), "propListHead", null);
        setIntField(term2017, term2017.getClass(), "sourcePosition", 0);
        setField(term2017, term2017.getClass(), "jsType", null);
        setField(term2017, term2017.getClass(), "parent", null);
        setField(term2009, term2009.getClass(), "last", term2017);
        setField(term2020, term2020.getClass(), "next", null);
        setIntField(term2020, term2020.getClass(), "type", 0);
        setIntField(term2020, term2020.getClass(), "intValue", 0);
        setField(term2020, term2020.getClass(), "objectValue", null);
        setField(term2009, term2009.getClass(), "propListHead", term2020);
        setIntField(term2009, term2009.getClass(), "sourcePosition", 797015478);
        setField(term2009, term2009.getClass(), "jsType", null);
        setField(term2009, term2009.getClass(), "parent", null);
        setField(term2007, term2007.getClass(), "next", term2009);
        setIntField(term2024, term2024.getClass(), "type", 0);
        setField(term2024, term2024.getClass(), "next", null);
        setField(term2024, term2024.getClass(), "first", null);
        setField(term2024, term2024.getClass(), "last", null);
        setField(term2024, term2024.getClass(), "propListHead", null);
        setIntField(term2024, term2024.getClass(), "sourcePosition", 0);
        setField(term2024, term2024.getClass(), "jsType", null);
        setField(term2024, term2024.getClass(), "parent", null);
        setField(term2007, term2007.getClass(), "first", term2024);
        setIntField(term2027, term2027.getClass(), "type", 0);
        setField(term2027, term2027.getClass(), "next", null);
        setField(term2027, term2027.getClass(), "first", null);
        setField(term2027, term2027.getClass(), "last", null);
        setField(term2027, term2027.getClass(), "propListHead", null);
        setIntField(term2027, term2027.getClass(), "sourcePosition", 0);
        setField(term2027, term2027.getClass(), "jsType", null);
        setField(term2027, term2027.getClass(), "parent", null);
        setField(term2007, term2007.getClass(), "last", term2027);
        setField(term2030, term2030.getClass(), "next", null);
        setIntField(term2030, term2030.getClass(), "type", 0);
        setIntField(term2030, term2030.getClass(), "intValue", 0);
        setField(term2030, term2030.getClass(), "objectValue", null);
        setField(term2007, term2007.getClass(), "propListHead", term2030);
        setIntField(term2007, term2007.getClass(), "sourcePosition", 717574276);
        setField(term2007, term2007.getClass(), "jsType", null);
        setField(term2007, term2007.getClass(), "parent", null);
        term11525 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11526 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11527 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11528 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11529 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11530 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term11531 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11532 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11533 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term11525, term11525.getClass(), "type", 1949983666);
        setIntField(term11526, term11526.getClass(), "type", -1780848958);
        setIntField(term11527, term11527.getClass(), "type", 0);
        setField(term11527, term11527.getClass(), "next", null);
        setField(term11527, term11527.getClass(), "first", null);
        setField(term11527, term11527.getClass(), "last", null);
        setField(term11527, term11527.getClass(), "propListHead", null);
        setIntField(term11527, term11527.getClass(), "sourcePosition", 0);
        setField(term11527, term11527.getClass(), "jsType", null);
        setField(term11527, term11527.getClass(), "parent", null);
        setField(term11526, term11526.getClass(), "next", term11527);
        setIntField(term11528, term11528.getClass(), "type", 0);
        setField(term11528, term11528.getClass(), "next", null);
        setField(term11528, term11528.getClass(), "first", null);
        setField(term11528, term11528.getClass(), "last", null);
        setField(term11528, term11528.getClass(), "propListHead", null);
        setIntField(term11528, term11528.getClass(), "sourcePosition", 0);
        setField(term11528, term11528.getClass(), "jsType", null);
        setField(term11528, term11528.getClass(), "parent", null);
        setField(term11526, term11526.getClass(), "first", term11528);
        setIntField(term11529, term11529.getClass(), "type", 0);
        setField(term11529, term11529.getClass(), "next", null);
        setField(term11529, term11529.getClass(), "first", null);
        setField(term11529, term11529.getClass(), "last", null);
        setField(term11529, term11529.getClass(), "propListHead", null);
        setIntField(term11529, term11529.getClass(), "sourcePosition", 0);
        setField(term11529, term11529.getClass(), "jsType", null);
        setField(term11529, term11529.getClass(), "parent", null);
        setField(term11526, term11526.getClass(), "last", term11529);
        setField(term11530, term11530.getClass(), "next", null);
        setIntField(term11530, term11530.getClass(), "type", 0);
        setIntField(term11530, term11530.getClass(), "intValue", 0);
        setField(term11530, term11530.getClass(), "objectValue", null);
        setField(term11526, term11526.getClass(), "propListHead", term11530);
        setIntField(term11526, term11526.getClass(), "sourcePosition", 797015478);
        setField(term11526, term11526.getClass(), "jsType", null);
        setField(term11526, term11526.getClass(), "parent", null);
        setField(term11525, term11525.getClass(), "next", term11526);
        setIntField(term11531, term11531.getClass(), "type", 0);
        setField(term11531, term11531.getClass(), "next", null);
        setField(term11531, term11531.getClass(), "first", null);
        setField(term11531, term11531.getClass(), "last", null);
        setField(term11531, term11531.getClass(), "propListHead", null);
        setIntField(term11531, term11531.getClass(), "sourcePosition", 0);
        setField(term11531, term11531.getClass(), "jsType", null);
        setField(term11531, term11531.getClass(), "parent", null);
        setField(term11525, term11525.getClass(), "first", term11531);
        setIntField(term11532, term11532.getClass(), "type", 0);
        setField(term11532, term11532.getClass(), "next", null);
        setField(term11532, term11532.getClass(), "first", null);
        setField(term11532, term11532.getClass(), "last", null);
        setField(term11532, term11532.getClass(), "propListHead", null);
        setIntField(term11532, term11532.getClass(), "sourcePosition", 0);
        setField(term11532, term11532.getClass(), "jsType", null);
        setField(term11532, term11532.getClass(), "parent", null);
        setField(term11525, term11525.getClass(), "last", term11532);
        setField(term11533, term11533.getClass(), "next", null);
        setIntField(term11533, term11533.getClass(), "type", 0);
        setIntField(term11533, term11533.getClass(), "intValue", 0);
        setField(term11533, term11533.getClass(), "objectValue", null);
        setField(term11525, term11525.getClass(), "propListHead", term11533);
        setIntField(term11525, term11525.getClass(), "sourcePosition", 717574276);
        setField(term11525, term11525.getClass(), "jsType", null);
        setField(term11525, term11525.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term2007;
        callMethod(klass, "redeclareVarsInsideBranch", argTypes, null, args);
        assertTrue(recursiveEquals(term2007, term11525));
    }

};


