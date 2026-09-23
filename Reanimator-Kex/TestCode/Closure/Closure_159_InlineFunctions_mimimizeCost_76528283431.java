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
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class InlineFunctions_mimimizeCost_76528283431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term563;
     Object term594;

    public InlineFunctions_mimimizeCost_76528283431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term564 = new HashMap();
        HashMap term579 = new HashMap();
        term563 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions"));
        setField(term563, term563.getClass(), "fns", term564);
        setField(term563, term563.getClass(), "anonFns", term579);
        setField(term563, term563.getClass(), "compiler", null);
        setField(term563, term563.getClass(), "injector", null);
        setBooleanField(term563, term563.getClass(), "blockFunctionInliningEnabled", false);
        setBooleanField(term563, term563.getClass(), "inlineGlobalFunctions", false);
        setBooleanField(term563, term563.getClass(), "inlineLocalFunctions", false);
        setField(term563, term563.getClass(), "specializationState", null);
        HashMap term627 = new HashMap();
        HashMap term644 = new HashMap();
        Set<Object> term3489 =  ((Map) term644).keySet();
        HashSet term643 = new HashSet((Collection<? extends Object>) term3489);
        term594 = newInstance(Class.forName("com.google.javascript.jscomp.InlineFunctions$FunctionState"));
        Object term595 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term597 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term599 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term602 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term605 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term608 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term612 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term615 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term618 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term641 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term594, term594.getClass(), "fn", null);
        setIntField(term595, term595.getClass(), "type", 1830648570);
        setIntField(term597, term597.getClass(), "type", 1283079251);
        setIntField(term599, term599.getClass(), "type", 0);
        setField(term599, term599.getClass(), "next", null);
        setField(term599, term599.getClass(), "first", null);
        setField(term599, term599.getClass(), "last", null);
        setField(term599, term599.getClass(), "propListHead", null);
        setIntField(term599, term599.getClass(), "sourcePosition", 0);
        setField(term599, term599.getClass(), "jsType", null);
        setField(term599, term599.getClass(), "parent", null);
        setField(term597, term597.getClass(), "next", term599);
        setIntField(term602, term602.getClass(), "type", 0);
        setField(term602, term602.getClass(), "next", null);
        setField(term602, term602.getClass(), "first", null);
        setField(term602, term602.getClass(), "last", null);
        setField(term602, term602.getClass(), "propListHead", null);
        setIntField(term602, term602.getClass(), "sourcePosition", 0);
        setField(term602, term602.getClass(), "jsType", null);
        setField(term602, term602.getClass(), "parent", null);
        setField(term597, term597.getClass(), "first", term602);
        setIntField(term605, term605.getClass(), "type", 0);
        setField(term605, term605.getClass(), "next", null);
        setField(term605, term605.getClass(), "first", null);
        setField(term605, term605.getClass(), "last", null);
        setField(term605, term605.getClass(), "propListHead", null);
        setIntField(term605, term605.getClass(), "sourcePosition", 0);
        setField(term605, term605.getClass(), "jsType", null);
        setField(term605, term605.getClass(), "parent", null);
        setField(term597, term597.getClass(), "last", term605);
        setField(term608, term608.getClass(), "next", null);
        setIntField(term608, term608.getClass(), "type", 0);
        setIntField(term608, term608.getClass(), "intValue", 0);
        setField(term608, term608.getClass(), "objectValue", null);
        setField(term597, term597.getClass(), "propListHead", term608);
        setIntField(term597, term597.getClass(), "sourcePosition", -523949691);
        setField(term597, term597.getClass(), "jsType", null);
        setField(term597, term597.getClass(), "parent", null);
        setField(term595, term595.getClass(), "next", term597);
        setIntField(term612, term612.getClass(), "type", 0);
        setField(term612, term612.getClass(), "next", null);
        setField(term612, term612.getClass(), "first", null);
        setField(term612, term612.getClass(), "last", null);
        setField(term612, term612.getClass(), "propListHead", null);
        setIntField(term612, term612.getClass(), "sourcePosition", 0);
        setField(term612, term612.getClass(), "jsType", null);
        setField(term612, term612.getClass(), "parent", null);
        setField(term595, term595.getClass(), "first", term612);
        setIntField(term615, term615.getClass(), "type", 0);
        setField(term615, term615.getClass(), "next", null);
        setField(term615, term615.getClass(), "first", null);
        setField(term615, term615.getClass(), "last", null);
        setField(term615, term615.getClass(), "propListHead", null);
        setIntField(term615, term615.getClass(), "sourcePosition", 0);
        setField(term615, term615.getClass(), "jsType", null);
        setField(term615, term615.getClass(), "parent", null);
        setField(term595, term595.getClass(), "last", term615);
        setField(term618, term618.getClass(), "next", null);
        setIntField(term618, term618.getClass(), "type", 0);
        setIntField(term618, term618.getClass(), "intValue", 0);
        setField(term618, term618.getClass(), "objectValue", null);
        setField(term595, term595.getClass(), "propListHead", term618);
        setIntField(term595, term595.getClass(), "sourcePosition", 1398204340);
        setField(term595, term595.getClass(), "jsType", null);
        setField(term595, term595.getClass(), "parent", null);
        setField(term594, term594.getClass(), "safeFnNode", term595);
        setBooleanField(term594, term594.getClass(), "inline", true);
        setBooleanField(term594, term594.getClass(), "remove", true);
        setBooleanField(term594, term594.getClass(), "inlineDirectly", false);
        setBooleanField(term594, term594.getClass(), "referencesThis", false);
        setBooleanField(term594, term594.getClass(), "hasInnerFunctions", true);
        setField(term594, term594.getClass(), "references", term627);
        setField(term641, term641.getClass(), "name", null);
        setField(term641, term641.getClass(), "inputs", null);
        setField(term641, term641.getClass(), "deps", null);
        setIntField(term641, term641.getClass(), "depth", 0);
        setField(term594, term594.getClass(), "module", term641);
        setField(term594, term594.getClass(), "namesToAlias", term643);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.InlineFunctions");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.InlineFunctions$FunctionState");
        Object[] args = new Object[1];
        args[0] = term594;
        try {
            callMethod(klass, "mimimizeCost", argTypes, term563, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


