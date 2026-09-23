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
import java.util.HashMap;
import java.lang.Object;

public class InlineFunctions_process_40396297323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138;
     Object term169;
     Object term196;

    public InlineFunctions_process_40396297323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term139 = new HashMap();
        HashMap term154 = new HashMap();
        term138 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        setField(term138, term138.getClass(), "fns", term139);
        setField(term138, term138.getClass(), "anonFns", term154);
        setField(term138, term138.getClass(), "compiler", null);
        setField(term138, term138.getClass(), "injector", null);
        setBooleanField(term138, term138.getClass(), "blockFunctionInliningEnabled", false);
        setBooleanField(term138, term138.getClass(), "inlineGlobalFunctions", false);
        setBooleanField(term138, term138.getClass(), "inlineLocalFunctions", false);
        setField(term138, term138.getClass(), "specializationState", null);
        term169 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term171 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term173 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term176 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term179 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term182 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term186 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term189 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term192 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term169, term169.getClass(), "type", 767834723);
        setIntField(term171, term171.getClass(), "type", -817164822);
        setIntField(term173, term173.getClass(), "type", 0);
        setField(term173, term173.getClass(), "next", null);
        setField(term173, term173.getClass(), "first", null);
        setField(term173, term173.getClass(), "last", null);
        setField(term173, term173.getClass(), "propListHead", null);
        setIntField(term173, term173.getClass(), "sourcePosition", 0);
        setField(term173, term173.getClass(), "jsType", null);
        setField(term173, term173.getClass(), "parent", null);
        setField(term171, term171.getClass(), "next", term173);
        setIntField(term176, term176.getClass(), "type", 0);
        setField(term176, term176.getClass(), "next", null);
        setField(term176, term176.getClass(), "first", null);
        setField(term176, term176.getClass(), "last", null);
        setField(term176, term176.getClass(), "propListHead", null);
        setIntField(term176, term176.getClass(), "sourcePosition", 0);
        setField(term176, term176.getClass(), "jsType", null);
        setField(term176, term176.getClass(), "parent", null);
        setField(term171, term171.getClass(), "first", term176);
        setIntField(term179, term179.getClass(), "type", 0);
        setField(term179, term179.getClass(), "next", null);
        setField(term179, term179.getClass(), "first", null);
        setField(term179, term179.getClass(), "last", null);
        setField(term179, term179.getClass(), "propListHead", null);
        setIntField(term179, term179.getClass(), "sourcePosition", 0);
        setField(term179, term179.getClass(), "jsType", null);
        setField(term179, term179.getClass(), "parent", null);
        setField(term171, term171.getClass(), "last", term179);
        setField(term182, term182.getClass(), "next", null);
        setIntField(term182, term182.getClass(), "type", 0);
        setIntField(term182, term182.getClass(), "intValue", 0);
        setField(term182, term182.getClass(), "objectValue", null);
        setField(term171, term171.getClass(), "propListHead", term182);
        setIntField(term171, term171.getClass(), "sourcePosition", 579005622);
        setField(term171, term171.getClass(), "jsType", null);
        setField(term171, term171.getClass(), "parent", null);
        setField(term169, term169.getClass(), "next", term171);
        setIntField(term186, term186.getClass(), "type", 0);
        setField(term186, term186.getClass(), "next", null);
        setField(term186, term186.getClass(), "first", null);
        setField(term186, term186.getClass(), "last", null);
        setField(term186, term186.getClass(), "propListHead", null);
        setIntField(term186, term186.getClass(), "sourcePosition", 0);
        setField(term186, term186.getClass(), "jsType", null);
        setField(term186, term186.getClass(), "parent", null);
        setField(term169, term169.getClass(), "first", term186);
        setIntField(term189, term189.getClass(), "type", 0);
        setField(term189, term189.getClass(), "next", null);
        setField(term189, term189.getClass(), "first", null);
        setField(term189, term189.getClass(), "last", null);
        setField(term189, term189.getClass(), "propListHead", null);
        setIntField(term189, term189.getClass(), "sourcePosition", 0);
        setField(term189, term189.getClass(), "jsType", null);
        setField(term189, term189.getClass(), "parent", null);
        setField(term169, term169.getClass(), "last", term189);
        setField(term192, term192.getClass(), "next", null);
        setIntField(term192, term192.getClass(), "type", 0);
        setIntField(term192, term192.getClass(), "intValue", 0);
        setField(term192, term192.getClass(), "objectValue", null);
        setField(term169, term169.getClass(), "propListHead", term192);
        setIntField(term169, term169.getClass(), "sourcePosition", -14890619);
        setField(term169, term169.getClass(), "jsType", null);
        setField(term169, term169.getClass(), "parent", null);
        term196 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term198 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term200 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term203 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term206 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term209 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term213 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term216 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term219 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term196, term196.getClass(), "type", 2055867847);
        setIntField(term198, term198.getClass(), "type", -184153539);
        setIntField(term200, term200.getClass(), "type", 0);
        setField(term200, term200.getClass(), "next", null);
        setField(term200, term200.getClass(), "first", null);
        setField(term200, term200.getClass(), "last", null);
        setField(term200, term200.getClass(), "propListHead", null);
        setIntField(term200, term200.getClass(), "sourcePosition", 0);
        setField(term200, term200.getClass(), "jsType", null);
        setField(term200, term200.getClass(), "parent", null);
        setField(term198, term198.getClass(), "next", term200);
        setIntField(term203, term203.getClass(), "type", 0);
        setField(term203, term203.getClass(), "next", null);
        setField(term203, term203.getClass(), "first", null);
        setField(term203, term203.getClass(), "last", null);
        setField(term203, term203.getClass(), "propListHead", null);
        setIntField(term203, term203.getClass(), "sourcePosition", 0);
        setField(term203, term203.getClass(), "jsType", null);
        setField(term203, term203.getClass(), "parent", null);
        setField(term198, term198.getClass(), "first", term203);
        setIntField(term206, term206.getClass(), "type", 0);
        setField(term206, term206.getClass(), "next", null);
        setField(term206, term206.getClass(), "first", null);
        setField(term206, term206.getClass(), "last", null);
        setField(term206, term206.getClass(), "propListHead", null);
        setIntField(term206, term206.getClass(), "sourcePosition", 0);
        setField(term206, term206.getClass(), "jsType", null);
        setField(term206, term206.getClass(), "parent", null);
        setField(term198, term198.getClass(), "last", term206);
        setField(term209, term209.getClass(), "next", null);
        setIntField(term209, term209.getClass(), "type", 0);
        setIntField(term209, term209.getClass(), "intValue", 0);
        setField(term209, term209.getClass(), "objectValue", null);
        setField(term198, term198.getClass(), "propListHead", term209);
        setIntField(term198, term198.getClass(), "sourcePosition", 1596070772);
        setField(term198, term198.getClass(), "jsType", null);
        setField(term198, term198.getClass(), "parent", null);
        setField(term196, term196.getClass(), "next", term198);
        setIntField(term213, term213.getClass(), "type", 0);
        setField(term213, term213.getClass(), "next", null);
        setField(term213, term213.getClass(), "first", null);
        setField(term213, term213.getClass(), "last", null);
        setField(term213, term213.getClass(), "propListHead", null);
        setIntField(term213, term213.getClass(), "sourcePosition", 0);
        setField(term213, term213.getClass(), "jsType", null);
        setField(term213, term213.getClass(), "parent", null);
        setField(term196, term196.getClass(), "first", term213);
        setIntField(term216, term216.getClass(), "type", 0);
        setField(term216, term216.getClass(), "next", null);
        setField(term216, term216.getClass(), "first", null);
        setField(term216, term216.getClass(), "last", null);
        setField(term216, term216.getClass(), "propListHead", null);
        setIntField(term216, term216.getClass(), "sourcePosition", 0);
        setField(term216, term216.getClass(), "jsType", null);
        setField(term216, term216.getClass(), "parent", null);
        setField(term196, term196.getClass(), "last", term216);
        setField(term219, term219.getClass(), "next", null);
        setIntField(term219, term219.getClass(), "type", 0);
        setIntField(term219, term219.getClass(), "intValue", 0);
        setField(term219, term219.getClass(), "objectValue", null);
        setField(term196, term196.getClass(), "propListHead", term219);
        setIntField(term196, term196.getClass(), "sourcePosition", 97029295);
        setField(term196, term196.getClass(), "jsType", null);
        setField(term196, term196.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term169;
        args[1] = term196;
        try {
            callMethod(klass, "process", argTypes, term138, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


