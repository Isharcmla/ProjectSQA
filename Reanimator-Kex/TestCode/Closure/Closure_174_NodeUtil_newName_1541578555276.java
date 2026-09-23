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

public class NodeUtil_newName_1541578555276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3672;

    public NodeUtil_newName_1541578555276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3672 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3674 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3676 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3678 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3680 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3683 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3687 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3689 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3694 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term3672, term3672.getClass(), "type", -963198667);
        setIntField(term3674, term3674.getClass(), "type", -1007935918);
        setIntField(term3676, term3676.getClass(), "type", 1485731037);
        setIntField(term3678, term3678.getClass(), "type", 1304396087);
        setIntField(term3680, term3680.getClass(), "type", 1782600602);
        setField(term3680, term3680.getClass(), "next", null);
        setField(term3680, term3680.getClass(), "first", null);
        setField(term3680, term3680.getClass(), "last", null);
        setField(term3680, term3680.getClass(), "propListHead", null);
        setIntField(term3680, term3680.getClass(), "sourcePosition", 0);
        setField(term3680, term3680.getClass(), "jsType", null);
        setField(term3680, term3680.getClass(), "parent", null);
        setField(term3678, term3678.getClass(), "next", term3680);
        setIntField(term3683, term3683.getClass(), "type", -185892708);
        setField(term3683, term3683.getClass(), "next", null);
        setField(term3683, term3683.getClass(), "first", null);
        setField(term3683, term3683.getClass(), "last", term3680);
        setField(term3683, term3683.getClass(), "propListHead", null);
        setIntField(term3683, term3683.getClass(), "sourcePosition", 0);
        setField(term3683, term3683.getClass(), "jsType", null);
        setField(term3683, term3683.getClass(), "parent", null);
        setField(term3678, term3678.getClass(), "first", term3683);
        setField(term3678, term3678.getClass(), "last", term3676);
        setField(term3678, term3678.getClass(), "propListHead", null);
        setIntField(term3678, term3678.getClass(), "sourcePosition", 0);
        setField(term3678, term3678.getClass(), "jsType", null);
        setField(term3678, term3678.getClass(), "parent", null);
        setField(term3676, term3676.getClass(), "next", term3678);
        setField(term3676, term3676.getClass(), "first", term3680);
        setIntField(term3687, term3687.getClass(), "type", 498473526);
        setIntField(term3689, term3689.getClass(), "type", 1186917020);
        setField(term3689, term3689.getClass(), "next", null);
        setField(term3689, term3689.getClass(), "first", term3683);
        setField(term3689, term3689.getClass(), "last", term3678);
        setField(term3689, term3689.getClass(), "propListHead", null);
        setIntField(term3689, term3689.getClass(), "sourcePosition", 0);
        setField(term3689, term3689.getClass(), "jsType", null);
        setField(term3689, term3689.getClass(), "parent", null);
        setField(term3687, term3687.getClass(), "next", term3689);
        setField(term3687, term3687.getClass(), "first", term3674);
        setField(term3687, term3687.getClass(), "last", term3674);
        setField(term3687, term3687.getClass(), "propListHead", null);
        setIntField(term3687, term3687.getClass(), "sourcePosition", 0);
        setField(term3687, term3687.getClass(), "jsType", null);
        setField(term3687, term3687.getClass(), "parent", null);
        setField(term3676, term3676.getClass(), "last", term3687);
        setField(term3676, term3676.getClass(), "propListHead", null);
        setIntField(term3676, term3676.getClass(), "sourcePosition", 0);
        setField(term3676, term3676.getClass(), "jsType", null);
        setField(term3676, term3676.getClass(), "parent", null);
        setField(term3674, term3674.getClass(), "next", term3676);
        setIntField(term3694, term3694.getClass(), "type", 1670041824);
        setField(term3694, term3694.getClass(), "next", term3687);
        setField(term3694, term3694.getClass(), "first", term3689);
        setField(term3694, term3694.getClass(), "last", term3672);
        setField(term3694, term3694.getClass(), "propListHead", null);
        setIntField(term3694, term3694.getClass(), "sourcePosition", 0);
        setField(term3694, term3694.getClass(), "jsType", null);
        setField(term3694, term3694.getClass(), "parent", null);
        setField(term3674, term3674.getClass(), "first", term3694);
        setField(term3674, term3674.getClass(), "last", term3694);
        setField(term3674, term3674.getClass(), "propListHead", null);
        setIntField(term3674, term3674.getClass(), "sourcePosition", 0);
        setField(term3674, term3674.getClass(), "jsType", null);
        setField(term3674, term3674.getClass(), "parent", null);
        setField(term3672, term3672.getClass(), "next", term3674);
        setField(term3672, term3672.getClass(), "first", term3678);
        setField(term3672, term3672.getClass(), "last", term3680);
        setField(term3672, term3672.getClass(), "propListHead", null);
        setIntField(term3672, term3672.getClass(), "sourcePosition", 0);
        setField(term3672, term3672.getClass(), "jsType", null);
        setField(term3672, term3672.getClass(), "parent", null);
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
        args[1] = "YRHGsAkhxb";
        args[2] = term3672;
        args[3] = "ffYhPOzlUs";
        try {
            callMethod(klass, "newName", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


