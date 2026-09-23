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

public class NodeUtil_newVarNode_930235028287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3993;

    public NodeUtil_newVarNode_930235028287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3993 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3995 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3997 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3999 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4001 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4004 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4008 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4010 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4015 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3993, term3993.getClass(), "type", 1302110708);
        setIntField(term3995, term3995.getClass(), "type", 594705497);
        setIntField(term3997, term3997.getClass(), "type", -600102466);
        setIntField(term3999, term3999.getClass(), "type", -899986714);
        setIntField(term4001, term4001.getClass(), "type", 1307244466);
        setField(term4001, term4001.getClass(), "next", null);
        setField(term4001, term4001.getClass(), "first", null);
        setField(term4001, term4001.getClass(), "last", null);
        setField(term4001, term4001.getClass(), "propListHead", null);
        setIntField(term4001, term4001.getClass(), "sourcePosition", 0);
        setField(term4001, term4001.getClass(), "jsType", null);
        setField(term4001, term4001.getClass(), "parent", null);
        setField(term3999, term3999.getClass(), "next", term4001);
        setIntField(term4004, term4004.getClass(), "type", -252262096);
        setField(term4004, term4004.getClass(), "next", null);
        setField(term4004, term4004.getClass(), "first", null);
        setField(term4004, term4004.getClass(), "last", term4001);
        setField(term4004, term4004.getClass(), "propListHead", null);
        setIntField(term4004, term4004.getClass(), "sourcePosition", 0);
        setField(term4004, term4004.getClass(), "jsType", null);
        setField(term4004, term4004.getClass(), "parent", null);
        setField(term3999, term3999.getClass(), "first", term4004);
        setField(term3999, term3999.getClass(), "last", term3997);
        setField(term3999, term3999.getClass(), "propListHead", null);
        setIntField(term3999, term3999.getClass(), "sourcePosition", 0);
        setField(term3999, term3999.getClass(), "jsType", null);
        setField(term3999, term3999.getClass(), "parent", null);
        setField(term3997, term3997.getClass(), "next", term3999);
        setField(term3997, term3997.getClass(), "first", term4001);
        setIntField(term4008, term4008.getClass(), "type", -861014847);
        setIntField(term4010, term4010.getClass(), "type", 2132934139);
        setField(term4010, term4010.getClass(), "next", null);
        setField(term4010, term4010.getClass(), "first", term4004);
        setField(term4010, term4010.getClass(), "last", term3999);
        setField(term4010, term4010.getClass(), "propListHead", null);
        setIntField(term4010, term4010.getClass(), "sourcePosition", 0);
        setField(term4010, term4010.getClass(), "jsType", null);
        setField(term4010, term4010.getClass(), "parent", null);
        setField(term4008, term4008.getClass(), "next", term4010);
        setField(term4008, term4008.getClass(), "first", term3995);
        setField(term4008, term4008.getClass(), "last", term3995);
        setField(term4008, term4008.getClass(), "propListHead", null);
        setIntField(term4008, term4008.getClass(), "sourcePosition", 0);
        setField(term4008, term4008.getClass(), "jsType", null);
        setField(term4008, term4008.getClass(), "parent", null);
        setField(term3997, term3997.getClass(), "last", term4008);
        setField(term3997, term3997.getClass(), "propListHead", null);
        setIntField(term3997, term3997.getClass(), "sourcePosition", 0);
        setField(term3997, term3997.getClass(), "jsType", null);
        setField(term3997, term3997.getClass(), "parent", null);
        setField(term3995, term3995.getClass(), "next", term3997);
        setIntField(term4015, term4015.getClass(), "type", -1261824381);
        setField(term4015, term4015.getClass(), "next", term4008);
        setField(term4015, term4015.getClass(), "first", term4010);
        setField(term4015, term4015.getClass(), "last", term3993);
        setField(term4015, term4015.getClass(), "propListHead", null);
        setIntField(term4015, term4015.getClass(), "sourcePosition", 0);
        setField(term4015, term4015.getClass(), "jsType", null);
        setField(term4015, term4015.getClass(), "parent", null);
        setField(term3995, term3995.getClass(), "first", term4015);
        setField(term3995, term3995.getClass(), "last", term4015);
        setField(term3995, term3995.getClass(), "propListHead", null);
        setIntField(term3995, term3995.getClass(), "sourcePosition", 0);
        setField(term3995, term3995.getClass(), "jsType", null);
        setField(term3995, term3995.getClass(), "parent", null);
        setField(term3993, term3993.getClass(), "next", term3995);
        setField(term3993, term3993.getClass(), "first", term3999);
        setField(term3993, term3993.getClass(), "last", term4001);
        setField(term3993, term3993.getClass(), "propListHead", null);
        setIntField(term3993, term3993.getClass(), "sourcePosition", 0);
        setField(term3993, term3993.getClass(), "jsType", null);
        setField(term3993, term3993.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = "dEnhdmILtU";
        args[1] = term3993;
        try {
            callMethod(klass, "newVarNode", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


