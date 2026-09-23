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

public class NodeUtil_redeclareVarsInsideBranch_1330830302175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1980;
     Object term11459;

    public NodeUtil_redeclareVarsInsideBranch_1330830302175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1980 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1982 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1984 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1987 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1990 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1993 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1997 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2000 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2003 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1980, term1980.getClass(), "type", 588390599);
        setIntField(term1982, term1982.getClass(), "type", 2074130991);
        setIntField(term1984, term1984.getClass(), "type", 0);
        setField(term1984, term1984.getClass(), "next", null);
        setField(term1984, term1984.getClass(), "first", null);
        setField(term1984, term1984.getClass(), "last", null);
        setField(term1984, term1984.getClass(), "propListHead", null);
        setIntField(term1984, term1984.getClass(), "sourcePosition", 0);
        setField(term1984, term1984.getClass(), "jsType", null);
        setField(term1984, term1984.getClass(), "parent", null);
        setField(term1982, term1982.getClass(), "next", term1984);
        setIntField(term1987, term1987.getClass(), "type", 0);
        setField(term1987, term1987.getClass(), "next", null);
        setField(term1987, term1987.getClass(), "first", null);
        setField(term1987, term1987.getClass(), "last", null);
        setField(term1987, term1987.getClass(), "propListHead", null);
        setIntField(term1987, term1987.getClass(), "sourcePosition", 0);
        setField(term1987, term1987.getClass(), "jsType", null);
        setField(term1987, term1987.getClass(), "parent", null);
        setField(term1982, term1982.getClass(), "first", term1987);
        setIntField(term1990, term1990.getClass(), "type", 0);
        setField(term1990, term1990.getClass(), "next", null);
        setField(term1990, term1990.getClass(), "first", null);
        setField(term1990, term1990.getClass(), "last", null);
        setField(term1990, term1990.getClass(), "propListHead", null);
        setIntField(term1990, term1990.getClass(), "sourcePosition", 0);
        setField(term1990, term1990.getClass(), "jsType", null);
        setField(term1990, term1990.getClass(), "parent", null);
        setField(term1982, term1982.getClass(), "last", term1990);
        setField(term1993, term1993.getClass(), "next", null);
        setIntField(term1993, term1993.getClass(), "type", 0);
        setIntField(term1993, term1993.getClass(), "intValue", 0);
        setField(term1993, term1993.getClass(), "objectValue", null);
        setField(term1982, term1982.getClass(), "propListHead", term1993);
        setIntField(term1982, term1982.getClass(), "sourcePosition", -284885486);
        setField(term1982, term1982.getClass(), "jsType", null);
        setField(term1982, term1982.getClass(), "parent", null);
        setField(term1980, term1980.getClass(), "next", term1982);
        setIntField(term1997, term1997.getClass(), "type", 0);
        setField(term1997, term1997.getClass(), "next", null);
        setField(term1997, term1997.getClass(), "first", null);
        setField(term1997, term1997.getClass(), "last", null);
        setField(term1997, term1997.getClass(), "propListHead", null);
        setIntField(term1997, term1997.getClass(), "sourcePosition", 0);
        setField(term1997, term1997.getClass(), "jsType", null);
        setField(term1997, term1997.getClass(), "parent", null);
        setField(term1980, term1980.getClass(), "first", term1997);
        setIntField(term2000, term2000.getClass(), "type", 0);
        setField(term2000, term2000.getClass(), "next", null);
        setField(term2000, term2000.getClass(), "first", null);
        setField(term2000, term2000.getClass(), "last", null);
        setField(term2000, term2000.getClass(), "propListHead", null);
        setIntField(term2000, term2000.getClass(), "sourcePosition", 0);
        setField(term2000, term2000.getClass(), "jsType", null);
        setField(term2000, term2000.getClass(), "parent", null);
        setField(term1980, term1980.getClass(), "last", term2000);
        setField(term2003, term2003.getClass(), "next", null);
        setIntField(term2003, term2003.getClass(), "type", 0);
        setIntField(term2003, term2003.getClass(), "intValue", 0);
        setField(term2003, term2003.getClass(), "objectValue", null);
        setField(term1980, term1980.getClass(), "propListHead", term2003);
        setIntField(term1980, term1980.getClass(), "sourcePosition", 1791984446);
        setField(term1980, term1980.getClass(), "jsType", null);
        setField(term1980, term1980.getClass(), "parent", null);
        term11459 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11460 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11461 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11462 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11463 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11464 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term11465 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11466 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11467 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term11459, term11459.getClass(), "type", 588390599);
        setIntField(term11460, term11460.getClass(), "type", 2074130991);
        setIntField(term11461, term11461.getClass(), "type", 0);
        setField(term11461, term11461.getClass(), "next", null);
        setField(term11461, term11461.getClass(), "first", null);
        setField(term11461, term11461.getClass(), "last", null);
        setField(term11461, term11461.getClass(), "propListHead", null);
        setIntField(term11461, term11461.getClass(), "sourcePosition", 0);
        setField(term11461, term11461.getClass(), "jsType", null);
        setField(term11461, term11461.getClass(), "parent", null);
        setField(term11460, term11460.getClass(), "next", term11461);
        setIntField(term11462, term11462.getClass(), "type", 0);
        setField(term11462, term11462.getClass(), "next", null);
        setField(term11462, term11462.getClass(), "first", null);
        setField(term11462, term11462.getClass(), "last", null);
        setField(term11462, term11462.getClass(), "propListHead", null);
        setIntField(term11462, term11462.getClass(), "sourcePosition", 0);
        setField(term11462, term11462.getClass(), "jsType", null);
        setField(term11462, term11462.getClass(), "parent", null);
        setField(term11460, term11460.getClass(), "first", term11462);
        setIntField(term11463, term11463.getClass(), "type", 0);
        setField(term11463, term11463.getClass(), "next", null);
        setField(term11463, term11463.getClass(), "first", null);
        setField(term11463, term11463.getClass(), "last", null);
        setField(term11463, term11463.getClass(), "propListHead", null);
        setIntField(term11463, term11463.getClass(), "sourcePosition", 0);
        setField(term11463, term11463.getClass(), "jsType", null);
        setField(term11463, term11463.getClass(), "parent", null);
        setField(term11460, term11460.getClass(), "last", term11463);
        setField(term11464, term11464.getClass(), "next", null);
        setIntField(term11464, term11464.getClass(), "type", 0);
        setIntField(term11464, term11464.getClass(), "intValue", 0);
        setField(term11464, term11464.getClass(), "objectValue", null);
        setField(term11460, term11460.getClass(), "propListHead", term11464);
        setIntField(term11460, term11460.getClass(), "sourcePosition", -284885486);
        setField(term11460, term11460.getClass(), "jsType", null);
        setField(term11460, term11460.getClass(), "parent", null);
        setField(term11459, term11459.getClass(), "next", term11460);
        setIntField(term11465, term11465.getClass(), "type", 0);
        setField(term11465, term11465.getClass(), "next", null);
        setField(term11465, term11465.getClass(), "first", null);
        setField(term11465, term11465.getClass(), "last", null);
        setField(term11465, term11465.getClass(), "propListHead", null);
        setIntField(term11465, term11465.getClass(), "sourcePosition", 0);
        setField(term11465, term11465.getClass(), "jsType", null);
        setField(term11465, term11465.getClass(), "parent", null);
        setField(term11459, term11459.getClass(), "first", term11465);
        setIntField(term11466, term11466.getClass(), "type", 0);
        setField(term11466, term11466.getClass(), "next", null);
        setField(term11466, term11466.getClass(), "first", null);
        setField(term11466, term11466.getClass(), "last", null);
        setField(term11466, term11466.getClass(), "propListHead", null);
        setIntField(term11466, term11466.getClass(), "sourcePosition", 0);
        setField(term11466, term11466.getClass(), "jsType", null);
        setField(term11466, term11466.getClass(), "parent", null);
        setField(term11459, term11459.getClass(), "last", term11466);
        setField(term11467, term11467.getClass(), "next", null);
        setIntField(term11467, term11467.getClass(), "type", 0);
        setIntField(term11467, term11467.getClass(), "intValue", 0);
        setField(term11467, term11467.getClass(), "objectValue", null);
        setField(term11459, term11459.getClass(), "propListHead", term11467);
        setIntField(term11459, term11459.getClass(), "sourcePosition", 1791984446);
        setField(term11459, term11459.getClass(), "jsType", null);
        setField(term11459, term11459.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1980;
        callMethod(klass, "redeclareVarsInsideBranch", argTypes, null, args);
        assertTrue(recursiveEquals(term1980, term11459));
    }

};


