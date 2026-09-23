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

public class NodeUtil_newName_1541578555270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3400;

    public NodeUtil_newName_1541578555270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3400 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3402 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3404 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3407 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3410 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3413 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3417 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3420 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3423 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3400, term3400.getClass(), "type", -2060284160);
        setIntField(term3402, term3402.getClass(), "type", 318982923);
        setIntField(term3404, term3404.getClass(), "type", 0);
        setField(term3404, term3404.getClass(), "next", null);
        setField(term3404, term3404.getClass(), "first", null);
        setField(term3404, term3404.getClass(), "last", null);
        setField(term3404, term3404.getClass(), "propListHead", null);
        setIntField(term3404, term3404.getClass(), "sourcePosition", 0);
        setField(term3404, term3404.getClass(), "jsType", null);
        setField(term3404, term3404.getClass(), "parent", null);
        setField(term3402, term3402.getClass(), "next", term3404);
        setIntField(term3407, term3407.getClass(), "type", 0);
        setField(term3407, term3407.getClass(), "next", null);
        setField(term3407, term3407.getClass(), "first", null);
        setField(term3407, term3407.getClass(), "last", null);
        setField(term3407, term3407.getClass(), "propListHead", null);
        setIntField(term3407, term3407.getClass(), "sourcePosition", 0);
        setField(term3407, term3407.getClass(), "jsType", null);
        setField(term3407, term3407.getClass(), "parent", null);
        setField(term3402, term3402.getClass(), "first", term3407);
        setIntField(term3410, term3410.getClass(), "type", 0);
        setField(term3410, term3410.getClass(), "next", null);
        setField(term3410, term3410.getClass(), "first", null);
        setField(term3410, term3410.getClass(), "last", null);
        setField(term3410, term3410.getClass(), "propListHead", null);
        setIntField(term3410, term3410.getClass(), "sourcePosition", 0);
        setField(term3410, term3410.getClass(), "jsType", null);
        setField(term3410, term3410.getClass(), "parent", null);
        setField(term3402, term3402.getClass(), "last", term3410);
        setField(term3413, term3413.getClass(), "next", null);
        setIntField(term3413, term3413.getClass(), "type", 0);
        setIntField(term3413, term3413.getClass(), "intValue", 0);
        setField(term3413, term3413.getClass(), "objectValue", null);
        setField(term3402, term3402.getClass(), "propListHead", term3413);
        setIntField(term3402, term3402.getClass(), "sourcePosition", 241533020);
        setField(term3402, term3402.getClass(), "jsType", null);
        setField(term3402, term3402.getClass(), "parent", null);
        setField(term3400, term3400.getClass(), "next", term3402);
        setIntField(term3417, term3417.getClass(), "type", 0);
        setField(term3417, term3417.getClass(), "next", null);
        setField(term3417, term3417.getClass(), "first", null);
        setField(term3417, term3417.getClass(), "last", null);
        setField(term3417, term3417.getClass(), "propListHead", null);
        setIntField(term3417, term3417.getClass(), "sourcePosition", 0);
        setField(term3417, term3417.getClass(), "jsType", null);
        setField(term3417, term3417.getClass(), "parent", null);
        setField(term3400, term3400.getClass(), "first", term3417);
        setIntField(term3420, term3420.getClass(), "type", 0);
        setField(term3420, term3420.getClass(), "next", null);
        setField(term3420, term3420.getClass(), "first", null);
        setField(term3420, term3420.getClass(), "last", null);
        setField(term3420, term3420.getClass(), "propListHead", null);
        setIntField(term3420, term3420.getClass(), "sourcePosition", 0);
        setField(term3420, term3420.getClass(), "jsType", null);
        setField(term3420, term3420.getClass(), "parent", null);
        setField(term3400, term3400.getClass(), "last", term3420);
        setField(term3423, term3423.getClass(), "next", null);
        setIntField(term3423, term3423.getClass(), "type", 0);
        setIntField(term3423, term3423.getClass(), "intValue", 0);
        setField(term3423, term3423.getClass(), "objectValue", null);
        setField(term3400, term3400.getClass(), "propListHead", term3423);
        setIntField(term3400, term3400.getClass(), "sourcePosition", 2081679151);
        setField(term3400, term3400.getClass(), "jsType", null);
        setField(term3400, term3400.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.CodingConvention");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = "RkybSrpybU";
        args[2] = term3400;
        args[3] = "xOEqzGAmDU";
        try {
            callMethod(klass, "newName", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


