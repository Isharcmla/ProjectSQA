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

public class NodeUtil_isLoopStructure_1113179246217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1649;
     Object term12608;

    public NodeUtil_isLoopStructure_1113179246217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1649 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1651 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1653 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1656 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1659 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1662 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1666 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1669 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1672 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1649, term1649.getClass(), "type", -1632929393);
        setIntField(term1651, term1651.getClass(), "type", -1511130237);
        setIntField(term1653, term1653.getClass(), "type", 0);
        setField(term1653, term1653.getClass(), "next", null);
        setField(term1653, term1653.getClass(), "first", null);
        setField(term1653, term1653.getClass(), "last", null);
        setField(term1653, term1653.getClass(), "propListHead", null);
        setIntField(term1653, term1653.getClass(), "sourcePosition", 0);
        setField(term1653, term1653.getClass(), "jsType", null);
        setField(term1653, term1653.getClass(), "parent", null);
        setField(term1651, term1651.getClass(), "next", term1653);
        setIntField(term1656, term1656.getClass(), "type", 0);
        setField(term1656, term1656.getClass(), "next", null);
        setField(term1656, term1656.getClass(), "first", null);
        setField(term1656, term1656.getClass(), "last", null);
        setField(term1656, term1656.getClass(), "propListHead", null);
        setIntField(term1656, term1656.getClass(), "sourcePosition", 0);
        setField(term1656, term1656.getClass(), "jsType", null);
        setField(term1656, term1656.getClass(), "parent", null);
        setField(term1651, term1651.getClass(), "first", term1656);
        setIntField(term1659, term1659.getClass(), "type", 0);
        setField(term1659, term1659.getClass(), "next", null);
        setField(term1659, term1659.getClass(), "first", null);
        setField(term1659, term1659.getClass(), "last", null);
        setField(term1659, term1659.getClass(), "propListHead", null);
        setIntField(term1659, term1659.getClass(), "sourcePosition", 0);
        setField(term1659, term1659.getClass(), "jsType", null);
        setField(term1659, term1659.getClass(), "parent", null);
        setField(term1651, term1651.getClass(), "last", term1659);
        setField(term1662, term1662.getClass(), "next", null);
        setIntField(term1662, term1662.getClass(), "type", 0);
        setIntField(term1662, term1662.getClass(), "intValue", 0);
        setField(term1662, term1662.getClass(), "objectValue", null);
        setField(term1651, term1651.getClass(), "propListHead", term1662);
        setIntField(term1651, term1651.getClass(), "sourcePosition", 1499735894);
        setField(term1651, term1651.getClass(), "jsType", null);
        setField(term1651, term1651.getClass(), "parent", null);
        setField(term1649, term1649.getClass(), "next", term1651);
        setIntField(term1666, term1666.getClass(), "type", 0);
        setField(term1666, term1666.getClass(), "next", null);
        setField(term1666, term1666.getClass(), "first", null);
        setField(term1666, term1666.getClass(), "last", null);
        setField(term1666, term1666.getClass(), "propListHead", null);
        setIntField(term1666, term1666.getClass(), "sourcePosition", 0);
        setField(term1666, term1666.getClass(), "jsType", null);
        setField(term1666, term1666.getClass(), "parent", null);
        setField(term1649, term1649.getClass(), "first", term1666);
        setIntField(term1669, term1669.getClass(), "type", 0);
        setField(term1669, term1669.getClass(), "next", null);
        setField(term1669, term1669.getClass(), "first", null);
        setField(term1669, term1669.getClass(), "last", null);
        setField(term1669, term1669.getClass(), "propListHead", null);
        setIntField(term1669, term1669.getClass(), "sourcePosition", 0);
        setField(term1669, term1669.getClass(), "jsType", null);
        setField(term1669, term1669.getClass(), "parent", null);
        setField(term1649, term1649.getClass(), "last", term1669);
        setField(term1672, term1672.getClass(), "next", null);
        setIntField(term1672, term1672.getClass(), "type", 0);
        setIntField(term1672, term1672.getClass(), "intValue", 0);
        setField(term1672, term1672.getClass(), "objectValue", null);
        setField(term1649, term1649.getClass(), "propListHead", term1672);
        setIntField(term1649, term1649.getClass(), "sourcePosition", 716486048);
        setField(term1649, term1649.getClass(), "jsType", null);
        setField(term1649, term1649.getClass(), "parent", null);
        term12608 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12609 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12610 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12611 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12612 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12613 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term12614 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12615 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12616 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term12608, term12608.getClass(), "type", -1632929393);
        setIntField(term12609, term12609.getClass(), "type", -1511130237);
        setIntField(term12610, term12610.getClass(), "type", 0);
        setField(term12610, term12610.getClass(), "next", null);
        setField(term12610, term12610.getClass(), "first", null);
        setField(term12610, term12610.getClass(), "last", null);
        setField(term12610, term12610.getClass(), "propListHead", null);
        setIntField(term12610, term12610.getClass(), "sourcePosition", 0);
        setField(term12610, term12610.getClass(), "jsType", null);
        setField(term12610, term12610.getClass(), "parent", null);
        setField(term12609, term12609.getClass(), "next", term12610);
        setIntField(term12611, term12611.getClass(), "type", 0);
        setField(term12611, term12611.getClass(), "next", null);
        setField(term12611, term12611.getClass(), "first", null);
        setField(term12611, term12611.getClass(), "last", null);
        setField(term12611, term12611.getClass(), "propListHead", null);
        setIntField(term12611, term12611.getClass(), "sourcePosition", 0);
        setField(term12611, term12611.getClass(), "jsType", null);
        setField(term12611, term12611.getClass(), "parent", null);
        setField(term12609, term12609.getClass(), "first", term12611);
        setIntField(term12612, term12612.getClass(), "type", 0);
        setField(term12612, term12612.getClass(), "next", null);
        setField(term12612, term12612.getClass(), "first", null);
        setField(term12612, term12612.getClass(), "last", null);
        setField(term12612, term12612.getClass(), "propListHead", null);
        setIntField(term12612, term12612.getClass(), "sourcePosition", 0);
        setField(term12612, term12612.getClass(), "jsType", null);
        setField(term12612, term12612.getClass(), "parent", null);
        setField(term12609, term12609.getClass(), "last", term12612);
        setField(term12613, term12613.getClass(), "next", null);
        setIntField(term12613, term12613.getClass(), "type", 0);
        setIntField(term12613, term12613.getClass(), "intValue", 0);
        setField(term12613, term12613.getClass(), "objectValue", null);
        setField(term12609, term12609.getClass(), "propListHead", term12613);
        setIntField(term12609, term12609.getClass(), "sourcePosition", 1499735894);
        setField(term12609, term12609.getClass(), "jsType", null);
        setField(term12609, term12609.getClass(), "parent", null);
        setField(term12608, term12608.getClass(), "next", term12609);
        setIntField(term12614, term12614.getClass(), "type", 0);
        setField(term12614, term12614.getClass(), "next", null);
        setField(term12614, term12614.getClass(), "first", null);
        setField(term12614, term12614.getClass(), "last", null);
        setField(term12614, term12614.getClass(), "propListHead", null);
        setIntField(term12614, term12614.getClass(), "sourcePosition", 0);
        setField(term12614, term12614.getClass(), "jsType", null);
        setField(term12614, term12614.getClass(), "parent", null);
        setField(term12608, term12608.getClass(), "first", term12614);
        setIntField(term12615, term12615.getClass(), "type", 0);
        setField(term12615, term12615.getClass(), "next", null);
        setField(term12615, term12615.getClass(), "first", null);
        setField(term12615, term12615.getClass(), "last", null);
        setField(term12615, term12615.getClass(), "propListHead", null);
        setIntField(term12615, term12615.getClass(), "sourcePosition", 0);
        setField(term12615, term12615.getClass(), "jsType", null);
        setField(term12615, term12615.getClass(), "parent", null);
        setField(term12608, term12608.getClass(), "last", term12615);
        setField(term12616, term12616.getClass(), "next", null);
        setIntField(term12616, term12616.getClass(), "type", 0);
        setIntField(term12616, term12616.getClass(), "intValue", 0);
        setField(term12616, term12616.getClass(), "objectValue", null);
        setField(term12608, term12608.getClass(), "propListHead", term12616);
        setIntField(term12608, term12608.getClass(), "sourcePosition", 716486048);
        setField(term12608, term12608.getClass(), "jsType", null);
        setField(term12608, term12608.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1649;
        Object retValue = callMethod(klass, "isLoopStructure", argTypes, null, args);
        assertTrue(recursiveEquals(term1649, term12608));
        assertTrue(recursiveEquals(retValue, false));
    }

};


