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

public class ProcessCommonJSModules_process_627866047102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44326;
     Object term44396;
     Object term45740;
     Object term45741;

    public ProcessCommonJSModules_process_627866047102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44326 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term44326, term44326.getClass(), "compiler", null);
        term44396 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44466 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44536 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44606 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44676 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44746 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term44396, term44396.getClass(), "type", 0);
        setField(term44396, term44396.getClass(), "parent", null);
        setField(term44466, term44466.getClass(), "next", term44536);
        setIntField(term44466, term44466.getClass(), "type", 0);
        setField(term44676, term44676.getClass(), "next", term44746);
        setIntField(term44676, term44676.getClass(), "type", 37);
        setField(term44676, term44676.getClass(), "first", null);
        setField(term44606, term44606.getClass(), "next", term44676);
        setIntField(term44606, term44606.getClass(), "type", 37);
        setField(term44606, term44606.getClass(), "first", null);
        setField(term44466, term44466.getClass(), "first", term44606);
        setField(term44396, term44396.getClass(), "first", term44466);
        term45740 = newInstance(Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules"));
        setField(term45740, term45740.getClass(), "compiler", null);
        setField(term45740, term45740.getClass(), "filenamePrefix", null);
        setBooleanField(term45740, term45740.getClass(), "reportDependencies", false);
        setField(term45740, term45740.getClass(), "module", null);
        term45741 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45742 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45743 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45744 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45745 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45746 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term45741, term45741.getClass(), "type", 0);
        setField(term45741, term45741.getClass(), "next", null);
        setIntField(term45742, term45742.getClass(), "type", 0);
        setIntField(term45743, term45743.getClass(), "type", 0);
        setField(term45743, term45743.getClass(), "next", null);
        setField(term45743, term45743.getClass(), "first", null);
        setField(term45743, term45743.getClass(), "last", null);
        setField(term45743, term45743.getClass(), "propListHead", null);
        setIntField(term45743, term45743.getClass(), "sourcePosition", 0);
        setField(term45743, term45743.getClass(), "jsType", null);
        setField(term45743, term45743.getClass(), "parent", null);
        setField(term45742, term45742.getClass(), "next", term45743);
        setIntField(term45744, term45744.getClass(), "type", 37);
        setIntField(term45745, term45745.getClass(), "type", 37);
        setIntField(term45746, term45746.getClass(), "type", 0);
        setField(term45746, term45746.getClass(), "next", null);
        setField(term45746, term45746.getClass(), "first", null);
        setField(term45746, term45746.getClass(), "last", null);
        setField(term45746, term45746.getClass(), "propListHead", null);
        setIntField(term45746, term45746.getClass(), "sourcePosition", 0);
        setField(term45746, term45746.getClass(), "jsType", null);
        setField(term45746, term45746.getClass(), "parent", null);
        setField(term45745, term45745.getClass(), "next", term45746);
        setField(term45745, term45745.getClass(), "first", null);
        setField(term45745, term45745.getClass(), "last", null);
        setField(term45745, term45745.getClass(), "propListHead", null);
        setIntField(term45745, term45745.getClass(), "sourcePosition", 0);
        setField(term45745, term45745.getClass(), "jsType", null);
        setField(term45745, term45745.getClass(), "parent", null);
        setField(term45744, term45744.getClass(), "next", term45745);
        setField(term45744, term45744.getClass(), "first", null);
        setField(term45744, term45744.getClass(), "last", null);
        setField(term45744, term45744.getClass(), "propListHead", null);
        setIntField(term45744, term45744.getClass(), "sourcePosition", 0);
        setField(term45744, term45744.getClass(), "jsType", null);
        setField(term45744, term45744.getClass(), "parent", null);
        setField(term45742, term45742.getClass(), "first", term45744);
        setField(term45742, term45742.getClass(), "last", null);
        setField(term45742, term45742.getClass(), "propListHead", null);
        setIntField(term45742, term45742.getClass(), "sourcePosition", 0);
        setField(term45742, term45742.getClass(), "jsType", null);
        setField(term45742, term45742.getClass(), "parent", null);
        setField(term45741, term45741.getClass(), "first", term45742);
        setField(term45741, term45741.getClass(), "last", null);
        setField(term45741, term45741.getClass(), "propListHead", null);
        setIntField(term45741, term45741.getClass(), "sourcePosition", 0);
        setField(term45741, term45741.getClass(), "jsType", null);
        setField(term45741, term45741.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term44396;
        callMethod(klass, "process", argTypes, term44326, args);
        assertTrue(recursiveEquals(term44326, term45740));
        assertTrue(recursiveEquals(term44396, null));
    }

};


