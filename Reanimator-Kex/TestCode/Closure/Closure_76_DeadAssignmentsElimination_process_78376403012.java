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

public class DeadAssignmentsElimination_process_78376403012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term18;
     Object term45;

    public DeadAssignmentsElimination_process_78376403012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4 = new HashMap();
        term1 = newInstance(Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination"));
        Object term2 = newInstance(Class.forName("com.google.javascript.jscomp.LiveVariablesAnalysis"));
        Object term3 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term10 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term14 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1, term1.getClass(), "compiler", null);
        setField(term3, term3.getClass(), "vars", term4);
        setField(term10, term10.getClass(), "vars", null);
        setField(term10, term10.getClass(), "parent", null);
        setIntField(term10, term10.getClass(), "depth", 0);
        setField(term10, term10.getClass(), "rootNode", null);
        setField(term10, term10.getClass(), "thisType", null);
        setBooleanField(term10, term10.getClass(), "isBottom", false);
        setField(term3, term3.getClass(), "parent", term10);
        setIntField(term3, term3.getClass(), "depth", -1955890973);
        setIntField(term14, term14.getClass(), "type", 0);
        setField(term14, term14.getClass(), "next", null);
        setField(term14, term14.getClass(), "first", null);
        setField(term14, term14.getClass(), "last", null);
        setField(term14, term14.getClass(), "propListHead", null);
        setIntField(term14, term14.getClass(), "sourcePosition", 0);
        setField(term14, term14.getClass(), "jsType", null);
        setField(term14, term14.getClass(), "parent", null);
        setField(term3, term3.getClass(), "rootNode", term14);
        setField(term3, term3.getClass(), "thisType", null);
        setBooleanField(term3, term3.getClass(), "isBottom", false);
        setField(term2, term2.getClass(), "jsScope", term3);
        setField(term2, term2.getClass(), "escaped", null);
        setField(term2, term2.getClass(), "cfg", null);
        setField(term2, term2.getClass(), "joinOp", null);
        setField(term2, term2.getClass(), "orderedWorkSet", null);
        setField(term1, term1.getClass(), "liveness", term2);
        term18 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term25 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term35 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term18, term18.getClass(), "type", 1725571209);
        setIntField(term20, term20.getClass(), "type", 1585847225);
        setIntField(term22, term22.getClass(), "type", 0);
        setField(term22, term22.getClass(), "next", null);
        setField(term22, term22.getClass(), "first", null);
        setField(term22, term22.getClass(), "last", null);
        setField(term22, term22.getClass(), "propListHead", null);
        setIntField(term22, term22.getClass(), "sourcePosition", 0);
        setField(term22, term22.getClass(), "jsType", null);
        setField(term22, term22.getClass(), "parent", null);
        setField(term20, term20.getClass(), "next", term22);
        setIntField(term25, term25.getClass(), "type", 0);
        setField(term25, term25.getClass(), "next", null);
        setField(term25, term25.getClass(), "first", null);
        setField(term25, term25.getClass(), "last", null);
        setField(term25, term25.getClass(), "propListHead", null);
        setIntField(term25, term25.getClass(), "sourcePosition", 0);
        setField(term25, term25.getClass(), "jsType", null);
        setField(term25, term25.getClass(), "parent", null);
        setField(term20, term20.getClass(), "first", term25);
        setIntField(term28, term28.getClass(), "type", 0);
        setField(term28, term28.getClass(), "next", null);
        setField(term28, term28.getClass(), "first", null);
        setField(term28, term28.getClass(), "last", null);
        setField(term28, term28.getClass(), "propListHead", null);
        setIntField(term28, term28.getClass(), "sourcePosition", 0);
        setField(term28, term28.getClass(), "jsType", null);
        setField(term28, term28.getClass(), "parent", null);
        setField(term20, term20.getClass(), "last", term28);
        setField(term31, term31.getClass(), "next", null);
        setIntField(term31, term31.getClass(), "type", 0);
        setIntField(term31, term31.getClass(), "intValue", 0);
        setField(term31, term31.getClass(), "objectValue", null);
        setField(term20, term20.getClass(), "propListHead", term31);
        setIntField(term20, term20.getClass(), "sourcePosition", -1456670397);
        setField(term20, term20.getClass(), "jsType", null);
        setField(term20, term20.getClass(), "parent", null);
        setField(term18, term18.getClass(), "next", term20);
        setIntField(term35, term35.getClass(), "type", 0);
        setField(term35, term35.getClass(), "next", null);
        setField(term35, term35.getClass(), "first", null);
        setField(term35, term35.getClass(), "last", null);
        setField(term35, term35.getClass(), "propListHead", null);
        setIntField(term35, term35.getClass(), "sourcePosition", 0);
        setField(term35, term35.getClass(), "jsType", null);
        setField(term35, term35.getClass(), "parent", null);
        setField(term18, term18.getClass(), "first", term35);
        setIntField(term38, term38.getClass(), "type", 0);
        setField(term38, term38.getClass(), "next", null);
        setField(term38, term38.getClass(), "first", null);
        setField(term38, term38.getClass(), "last", null);
        setField(term38, term38.getClass(), "propListHead", null);
        setIntField(term38, term38.getClass(), "sourcePosition", 0);
        setField(term38, term38.getClass(), "jsType", null);
        setField(term38, term38.getClass(), "parent", null);
        setField(term18, term18.getClass(), "last", term38);
        setField(term41, term41.getClass(), "next", null);
        setIntField(term41, term41.getClass(), "type", 0);
        setIntField(term41, term41.getClass(), "intValue", 0);
        setField(term41, term41.getClass(), "objectValue", null);
        setField(term18, term18.getClass(), "propListHead", term41);
        setIntField(term18, term18.getClass(), "sourcePosition", 1622346318);
        setField(term18, term18.getClass(), "jsType", null);
        setField(term18, term18.getClass(), "parent", null);
        term45 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term55 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term62 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term65 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term45, term45.getClass(), "type", -2068769794);
        setIntField(term47, term47.getClass(), "type", 590364439);
        setIntField(term49, term49.getClass(), "type", 0);
        setField(term49, term49.getClass(), "next", null);
        setField(term49, term49.getClass(), "first", null);
        setField(term49, term49.getClass(), "last", null);
        setField(term49, term49.getClass(), "propListHead", null);
        setIntField(term49, term49.getClass(), "sourcePosition", 0);
        setField(term49, term49.getClass(), "jsType", null);
        setField(term49, term49.getClass(), "parent", null);
        setField(term47, term47.getClass(), "next", term49);
        setIntField(term52, term52.getClass(), "type", 0);
        setField(term52, term52.getClass(), "next", null);
        setField(term52, term52.getClass(), "first", null);
        setField(term52, term52.getClass(), "last", null);
        setField(term52, term52.getClass(), "propListHead", null);
        setIntField(term52, term52.getClass(), "sourcePosition", 0);
        setField(term52, term52.getClass(), "jsType", null);
        setField(term52, term52.getClass(), "parent", null);
        setField(term47, term47.getClass(), "first", term52);
        setIntField(term55, term55.getClass(), "type", 0);
        setField(term55, term55.getClass(), "next", null);
        setField(term55, term55.getClass(), "first", null);
        setField(term55, term55.getClass(), "last", null);
        setField(term55, term55.getClass(), "propListHead", null);
        setIntField(term55, term55.getClass(), "sourcePosition", 0);
        setField(term55, term55.getClass(), "jsType", null);
        setField(term55, term55.getClass(), "parent", null);
        setField(term47, term47.getClass(), "last", term55);
        setField(term58, term58.getClass(), "next", null);
        setIntField(term58, term58.getClass(), "type", 0);
        setIntField(term58, term58.getClass(), "intValue", 0);
        setField(term58, term58.getClass(), "objectValue", null);
        setField(term47, term47.getClass(), "propListHead", term58);
        setIntField(term47, term47.getClass(), "sourcePosition", -244121226);
        setField(term47, term47.getClass(), "jsType", null);
        setField(term47, term47.getClass(), "parent", null);
        setField(term45, term45.getClass(), "next", term47);
        setIntField(term62, term62.getClass(), "type", 0);
        setField(term62, term62.getClass(), "next", null);
        setField(term62, term62.getClass(), "first", null);
        setField(term62, term62.getClass(), "last", null);
        setField(term62, term62.getClass(), "propListHead", null);
        setIntField(term62, term62.getClass(), "sourcePosition", 0);
        setField(term62, term62.getClass(), "jsType", null);
        setField(term62, term62.getClass(), "parent", null);
        setField(term45, term45.getClass(), "first", term62);
        setIntField(term65, term65.getClass(), "type", 0);
        setField(term65, term65.getClass(), "next", null);
        setField(term65, term65.getClass(), "first", null);
        setField(term65, term65.getClass(), "last", null);
        setField(term65, term65.getClass(), "propListHead", null);
        setIntField(term65, term65.getClass(), "sourcePosition", 0);
        setField(term65, term65.getClass(), "jsType", null);
        setField(term65, term65.getClass(), "parent", null);
        setField(term45, term45.getClass(), "last", term65);
        setField(term68, term68.getClass(), "next", null);
        setIntField(term68, term68.getClass(), "type", 0);
        setIntField(term68, term68.getClass(), "intValue", 0);
        setField(term68, term68.getClass(), "objectValue", null);
        setField(term45, term45.getClass(), "propListHead", term68);
        setIntField(term45, term45.getClass(), "sourcePosition", -203030934);
        setField(term45, term45.getClass(), "jsType", null);
        setField(term45, term45.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DeadAssignmentsElimination");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term18;
        args[1] = term45;
        try {
            callMethod(klass, "process", argTypes, term1, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


