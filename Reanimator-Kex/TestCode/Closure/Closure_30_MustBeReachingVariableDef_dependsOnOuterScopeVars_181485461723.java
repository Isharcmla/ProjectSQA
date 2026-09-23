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
import java.util.HashMap;

public class MustBeReachingVariableDef_dependsOnOuterScopeVars_181485461723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term610;
     Object term640;

    public MustBeReachingVariableDef_dependsOnOuterScopeVars_181485461723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term612 = new HashMap();
        term610 = newInstance(Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef"));
        Object term611 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term620 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term624 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term611, term611.getClass(), "vars", term612);
        setField(term620, term620.getClass(), "vars", null);
        setField(term620, term620.getClass(), "parent", null);
        setIntField(term620, term620.getClass(), "depth", 0);
        setField(term620, term620.getClass(), "rootNode", null);
        setField(term620, term620.getClass(), "thisType", null);
        setBooleanField(term620, term620.getClass(), "isBottom", false);
        setField(term620, term620.getClass(), "arguments", null);
        setField(term611, term611.getClass(), "parent", term620);
        setIntField(term611, term611.getClass(), "depth", 1152356969);
        setIntField(term624, term624.getClass(), "type", 0);
        setField(term624, term624.getClass(), "next", null);
        setField(term624, term624.getClass(), "first", null);
        setField(term624, term624.getClass(), "last", null);
        setField(term624, term624.getClass(), "propListHead", null);
        setIntField(term624, term624.getClass(), "sourcePosition", 0);
        setField(term624, term624.getClass(), "jsType", null);
        setField(term624, term624.getClass(), "parent", null);
        setField(term611, term611.getClass(), "rootNode", term624);
        setField(term611, term611.getClass(), "thisType", null);
        setBooleanField(term611, term611.getClass(), "isBottom", false);
        setField(term611, term611.getClass(), "arguments", null);
        setField(term610, term610.getClass(), "jsScope", term611);
        setField(term610, term610.getClass(), "compiler", null);
        setField(term610, term610.getClass(), "escaped", null);
        setField(term610, term610.getClass(), "cfg", null);
        setField(term610, term610.getClass(), "joinOp", null);
        setField(term610, term610.getClass(), "orderedWorkSet", null);
        term640 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term642 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term644 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term646 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term648 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term651 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term655 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term657 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term662 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term640, term640.getClass(), "type", -1667990367);
        setIntField(term642, term642.getClass(), "type", -1214628358);
        setIntField(term644, term644.getClass(), "type", 1102721075);
        setIntField(term646, term646.getClass(), "type", -426764678);
        setIntField(term648, term648.getClass(), "type", -1222614956);
        setField(term648, term648.getClass(), "next", null);
        setField(term648, term648.getClass(), "first", null);
        setField(term648, term648.getClass(), "last", null);
        setField(term648, term648.getClass(), "propListHead", null);
        setIntField(term648, term648.getClass(), "sourcePosition", 0);
        setField(term648, term648.getClass(), "jsType", null);
        setField(term648, term648.getClass(), "parent", null);
        setField(term646, term646.getClass(), "next", term648);
        setIntField(term651, term651.getClass(), "type", -1870495012);
        setField(term651, term651.getClass(), "next", null);
        setField(term651, term651.getClass(), "first", null);
        setField(term651, term651.getClass(), "last", term648);
        setField(term651, term651.getClass(), "propListHead", null);
        setIntField(term651, term651.getClass(), "sourcePosition", 0);
        setField(term651, term651.getClass(), "jsType", null);
        setField(term651, term651.getClass(), "parent", null);
        setField(term646, term646.getClass(), "first", term651);
        setField(term646, term646.getClass(), "last", term644);
        setField(term646, term646.getClass(), "propListHead", null);
        setIntField(term646, term646.getClass(), "sourcePosition", 0);
        setField(term646, term646.getClass(), "jsType", null);
        setField(term646, term646.getClass(), "parent", null);
        setField(term644, term644.getClass(), "next", term646);
        setField(term644, term644.getClass(), "first", term648);
        setIntField(term655, term655.getClass(), "type", -2104981311);
        setIntField(term657, term657.getClass(), "type", -571169753);
        setField(term657, term657.getClass(), "next", null);
        setField(term657, term657.getClass(), "first", term651);
        setField(term657, term657.getClass(), "last", term646);
        setField(term657, term657.getClass(), "propListHead", null);
        setIntField(term657, term657.getClass(), "sourcePosition", 0);
        setField(term657, term657.getClass(), "jsType", null);
        setField(term657, term657.getClass(), "parent", null);
        setField(term655, term655.getClass(), "next", term657);
        setField(term655, term655.getClass(), "first", term642);
        setField(term655, term655.getClass(), "last", term642);
        setField(term655, term655.getClass(), "propListHead", null);
        setIntField(term655, term655.getClass(), "sourcePosition", 0);
        setField(term655, term655.getClass(), "jsType", null);
        setField(term655, term655.getClass(), "parent", null);
        setField(term644, term644.getClass(), "last", term655);
        setField(term644, term644.getClass(), "propListHead", null);
        setIntField(term644, term644.getClass(), "sourcePosition", 0);
        setField(term644, term644.getClass(), "jsType", null);
        setField(term644, term644.getClass(), "parent", null);
        setField(term642, term642.getClass(), "next", term644);
        setIntField(term662, term662.getClass(), "type", 318591690);
        setField(term662, term662.getClass(), "next", term655);
        setField(term662, term662.getClass(), "first", term657);
        setField(term662, term662.getClass(), "last", term640);
        setField(term662, term662.getClass(), "propListHead", null);
        setIntField(term662, term662.getClass(), "sourcePosition", 0);
        setField(term662, term662.getClass(), "jsType", null);
        setField(term662, term662.getClass(), "parent", null);
        setField(term642, term642.getClass(), "first", term662);
        setField(term642, term642.getClass(), "last", term662);
        setField(term642, term642.getClass(), "propListHead", null);
        setIntField(term642, term642.getClass(), "sourcePosition", 0);
        setField(term642, term642.getClass(), "jsType", null);
        setField(term642, term642.getClass(), "parent", null);
        setField(term640, term640.getClass(), "next", term642);
        setField(term640, term640.getClass(), "first", term646);
        setField(term640, term640.getClass(), "last", term648);
        setField(term640, term640.getClass(), "propListHead", null);
        setIntField(term640, term640.getClass(), "sourcePosition", 0);
        setField(term640, term640.getClass(), "jsType", null);
        setField(term640, term640.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.MustBeReachingVariableDef");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = "OclPbYPkcH";
        args[1] = term640;
        try {
            callMethod(klass, "dependsOnOuterScopeVars", argTypes, term610, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


