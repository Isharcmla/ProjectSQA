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
import java.util.LinkedList;
import java.lang.Object;
import java.util.ArrayList;

public class Compiler_fillEmptyModules_26084762414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48792;

    public Compiler_fillEmptyModules_26084762414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term48808 = new ArrayList();
        ArrayList term48812 = new ArrayList();
        ((ArrayList) term48812).add((Object)null);
        ((ArrayList) term48812).add((Object)null);
        ((ArrayList) term48812).add((Object)null);
        ((ArrayList) term48812).add((Object)null);
        ((ArrayList) term48812).add((Object)null);
        ((ArrayList) term48812).add((Object)null);
        ((ArrayList) term48812).add((Object)null);
        Object term48795 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term48795, term48795.getClass(), "name", "EyojsbSjWT");
        setField(term48795, term48795.getClass(), "inputs", term48808);
        setField(term48795, term48795.getClass(), "deps", term48812);
        setIntField(term48795, term48795.getClass(), "depth", -749861210);
        ArrayList term48820 = new ArrayList();
        ((ArrayList) term48820).add((Object)null);
        ((ArrayList) term48820).add((Object)null);
        ((ArrayList) term48820).add((Object)null);
        ((ArrayList) term48820).add((Object)null);
        ((ArrayList) term48820).add((Object)null);
        ((ArrayList) term48820).add((Object)null);
        ((ArrayList) term48820).add((Object)null);
        ((ArrayList) term48820).add((Object)null);
        ArrayList term48823 = new ArrayList();
        ((ArrayList) term48823).add((Object)null);
        ((ArrayList) term48823).add((Object)null);
        ((ArrayList) term48823).add((Object)null);
        ((ArrayList) term48823).add((Object)null);
        Object term48818 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term48818, term48818.getClass(), "name", "");
        setField(term48818, term48818.getClass(), "inputs", term48820);
        setField(term48818, term48818.getClass(), "deps", term48823);
        setIntField(term48818, term48818.getClass(), "depth", 282916351);
        Object term48828 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setField(term48828, term48828.getClass(), "name", null);
        setField(term48828, term48828.getClass(), "inputs", null);
        setField(term48828, term48828.getClass(), "deps", null);
        setIntField(term48828, term48828.getClass(), "depth", -75206835);
        term48792 = new LinkedList();
        ((LinkedList) term48792).add(term48795);
        ((LinkedList) term48792).add(term48818);
        ((LinkedList) term48792).add(term48828);
        ((LinkedList) term48792).add((Object)null);
        ((LinkedList) term48792).add((Object)null);
        ((LinkedList) term48792).add((Object)null);
        ((LinkedList) term48792).add((Object)null);
        ((LinkedList) term48792).add((Object)null);
        ((LinkedList) term48792).add((Object)null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Compiler");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term48792;
        callMethod(klass, "fillEmptyModules", argTypes, null, args);
    }

};


