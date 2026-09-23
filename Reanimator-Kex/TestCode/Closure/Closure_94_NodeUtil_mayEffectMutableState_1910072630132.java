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

public class NodeUtil_mayEffectMutableState_1910072630132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term325;
     Object term5675;

    public NodeUtil_mayEffectMutableState_1910072630132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term325 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term327 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term332 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term335 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term338 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term342 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term345 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term348 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term325, term325.getClass(), "type", 71190297);
        setIntField(term327, term327.getClass(), "type", -1222006000);
        setIntField(term329, term329.getClass(), "type", 0);
        setField(term329, term329.getClass(), "next", null);
        setField(term329, term329.getClass(), "first", null);
        setField(term329, term329.getClass(), "last", null);
        setField(term329, term329.getClass(), "propListHead", null);
        setIntField(term329, term329.getClass(), "sourcePosition", 0);
        setField(term329, term329.getClass(), "jsType", null);
        setField(term329, term329.getClass(), "parent", null);
        setField(term327, term327.getClass(), "next", term329);
        setIntField(term332, term332.getClass(), "type", 0);
        setField(term332, term332.getClass(), "next", null);
        setField(term332, term332.getClass(), "first", null);
        setField(term332, term332.getClass(), "last", null);
        setField(term332, term332.getClass(), "propListHead", null);
        setIntField(term332, term332.getClass(), "sourcePosition", 0);
        setField(term332, term332.getClass(), "jsType", null);
        setField(term332, term332.getClass(), "parent", null);
        setField(term327, term327.getClass(), "first", term332);
        setIntField(term335, term335.getClass(), "type", 0);
        setField(term335, term335.getClass(), "next", null);
        setField(term335, term335.getClass(), "first", null);
        setField(term335, term335.getClass(), "last", null);
        setField(term335, term335.getClass(), "propListHead", null);
        setIntField(term335, term335.getClass(), "sourcePosition", 0);
        setField(term335, term335.getClass(), "jsType", null);
        setField(term335, term335.getClass(), "parent", null);
        setField(term327, term327.getClass(), "last", term335);
        setField(term338, term338.getClass(), "next", null);
        setIntField(term338, term338.getClass(), "type", 0);
        setIntField(term338, term338.getClass(), "intValue", 0);
        setField(term338, term338.getClass(), "objectValue", null);
        setField(term327, term327.getClass(), "propListHead", term338);
        setIntField(term327, term327.getClass(), "sourcePosition", 344323424);
        setField(term327, term327.getClass(), "jsType", null);
        setField(term327, term327.getClass(), "parent", null);
        setField(term325, term325.getClass(), "next", term327);
        setIntField(term342, term342.getClass(), "type", 0);
        setField(term342, term342.getClass(), "next", null);
        setField(term342, term342.getClass(), "first", null);
        setField(term342, term342.getClass(), "last", null);
        setField(term342, term342.getClass(), "propListHead", null);
        setIntField(term342, term342.getClass(), "sourcePosition", 0);
        setField(term342, term342.getClass(), "jsType", null);
        setField(term342, term342.getClass(), "parent", null);
        setField(term325, term325.getClass(), "first", term342);
        setIntField(term345, term345.getClass(), "type", 0);
        setField(term345, term345.getClass(), "next", null);
        setField(term345, term345.getClass(), "first", null);
        setField(term345, term345.getClass(), "last", null);
        setField(term345, term345.getClass(), "propListHead", null);
        setIntField(term345, term345.getClass(), "sourcePosition", 0);
        setField(term345, term345.getClass(), "jsType", null);
        setField(term345, term345.getClass(), "parent", null);
        setField(term325, term325.getClass(), "last", term345);
        setField(term348, term348.getClass(), "next", null);
        setIntField(term348, term348.getClass(), "type", 0);
        setIntField(term348, term348.getClass(), "intValue", 0);
        setField(term348, term348.getClass(), "objectValue", null);
        setField(term325, term325.getClass(), "propListHead", term348);
        setIntField(term325, term325.getClass(), "sourcePosition", 9726679);
        setField(term325, term325.getClass(), "jsType", null);
        setField(term325, term325.getClass(), "parent", null);
        term5675 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5676 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5677 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5678 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5679 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5680 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term5681 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5682 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5683 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term5675, term5675.getClass(), "type", 71190297);
        setIntField(term5676, term5676.getClass(), "type", -1222006000);
        setIntField(term5677, term5677.getClass(), "type", 0);
        setField(term5677, term5677.getClass(), "next", null);
        setField(term5677, term5677.getClass(), "first", null);
        setField(term5677, term5677.getClass(), "last", null);
        setField(term5677, term5677.getClass(), "propListHead", null);
        setIntField(term5677, term5677.getClass(), "sourcePosition", 0);
        setField(term5677, term5677.getClass(), "jsType", null);
        setField(term5677, term5677.getClass(), "parent", null);
        setField(term5676, term5676.getClass(), "next", term5677);
        setIntField(term5678, term5678.getClass(), "type", 0);
        setField(term5678, term5678.getClass(), "next", null);
        setField(term5678, term5678.getClass(), "first", null);
        setField(term5678, term5678.getClass(), "last", null);
        setField(term5678, term5678.getClass(), "propListHead", null);
        setIntField(term5678, term5678.getClass(), "sourcePosition", 0);
        setField(term5678, term5678.getClass(), "jsType", null);
        setField(term5678, term5678.getClass(), "parent", null);
        setField(term5676, term5676.getClass(), "first", term5678);
        setIntField(term5679, term5679.getClass(), "type", 0);
        setField(term5679, term5679.getClass(), "next", null);
        setField(term5679, term5679.getClass(), "first", null);
        setField(term5679, term5679.getClass(), "last", null);
        setField(term5679, term5679.getClass(), "propListHead", null);
        setIntField(term5679, term5679.getClass(), "sourcePosition", 0);
        setField(term5679, term5679.getClass(), "jsType", null);
        setField(term5679, term5679.getClass(), "parent", null);
        setField(term5676, term5676.getClass(), "last", term5679);
        setField(term5680, term5680.getClass(), "next", null);
        setIntField(term5680, term5680.getClass(), "type", 0);
        setIntField(term5680, term5680.getClass(), "intValue", 0);
        setField(term5680, term5680.getClass(), "objectValue", null);
        setField(term5676, term5676.getClass(), "propListHead", term5680);
        setIntField(term5676, term5676.getClass(), "sourcePosition", 344323424);
        setField(term5676, term5676.getClass(), "jsType", null);
        setField(term5676, term5676.getClass(), "parent", null);
        setField(term5675, term5675.getClass(), "next", term5676);
        setIntField(term5681, term5681.getClass(), "type", 0);
        setField(term5681, term5681.getClass(), "next", null);
        setField(term5681, term5681.getClass(), "first", null);
        setField(term5681, term5681.getClass(), "last", null);
        setField(term5681, term5681.getClass(), "propListHead", null);
        setIntField(term5681, term5681.getClass(), "sourcePosition", 0);
        setField(term5681, term5681.getClass(), "jsType", null);
        setField(term5681, term5681.getClass(), "parent", null);
        setField(term5675, term5675.getClass(), "first", term5681);
        setIntField(term5682, term5682.getClass(), "type", 0);
        setField(term5682, term5682.getClass(), "next", null);
        setField(term5682, term5682.getClass(), "first", null);
        setField(term5682, term5682.getClass(), "last", null);
        setField(term5682, term5682.getClass(), "propListHead", null);
        setIntField(term5682, term5682.getClass(), "sourcePosition", 0);
        setField(term5682, term5682.getClass(), "jsType", null);
        setField(term5682, term5682.getClass(), "parent", null);
        setField(term5675, term5675.getClass(), "last", term5682);
        setField(term5683, term5683.getClass(), "next", null);
        setIntField(term5683, term5683.getClass(), "type", 0);
        setIntField(term5683, term5683.getClass(), "intValue", 0);
        setField(term5683, term5683.getClass(), "objectValue", null);
        setField(term5675, term5675.getClass(), "propListHead", term5683);
        setIntField(term5675, term5675.getClass(), "sourcePosition", 9726679);
        setField(term5675, term5675.getClass(), "jsType", null);
        setField(term5675, term5675.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term325;
        callMethod(klass, "mayEffectMutableState", argTypes, null, args);
        assertTrue(recursiveEquals(term325, term5675));
    }

};


