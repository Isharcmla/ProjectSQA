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

public class RemoveUnusedVars_removeAllAssigns_2251078525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term689;
     Object term693;

    public RemoveUnusedVars_removeAllAssigns_2251078525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term689 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        setField(term689, term689.getClass(), "compiler", null);
        setField(term689, term689.getClass(), "codingConvention", null);
        setBooleanField(term689, term689.getClass(), "removeGlobals", false);
        setBooleanField(term689, term689.getClass(), "preserveFunctionExpressionNames", false);
        setField(term689, term689.getClass(), "referenced", null);
        setField(term689, term689.getClass(), "maybeUnreferenced", null);
        setField(term689, term689.getClass(), "allFunctionScopes", null);
        setField(term689, term689.getClass(), "assignsByVar", null);
        setField(term689, term689.getClass(), "assignsByNode", null);
        setField(term689, term689.getClass(), "classDefiningCalls", null);
        setField(term689, term689.getClass(), "continuations", null);
        setBooleanField(term689, term689.getClass(), "modifyCallSites", false);
        setField(term689, term689.getClass(), "callSiteOptimizer", null);
        term693 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Var"));
        Object term706 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term708 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term710 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term712 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term715 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term718 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term722 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term726 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term693, term693.getClass(), "name", "pCTimMblYc");
        setIntField(term706, term706.getClass(), "type", -1222614956);
        setIntField(term708, term708.getClass(), "type", -1870495012);
        setIntField(term710, term710.getClass(), "type", -1310015129);
        setIntField(term712, term712.getClass(), "type", -2104981311);
        setField(term712, term712.getClass(), "next", null);
        setField(term712, term712.getClass(), "first", null);
        setField(term712, term712.getClass(), "last", null);
        setField(term712, term712.getClass(), "propListHead", null);
        setIntField(term712, term712.getClass(), "sourcePosition", 0);
        setField(term712, term712.getClass(), "jsType", null);
        setField(term712, term712.getClass(), "parent", null);
        setField(term710, term710.getClass(), "next", term712);
        setIntField(term715, term715.getClass(), "type", -1347358701);
        setField(term715, term715.getClass(), "next", null);
        setField(term715, term715.getClass(), "first", term706);
        setField(term715, term715.getClass(), "last", null);
        setField(term715, term715.getClass(), "propListHead", null);
        setIntField(term715, term715.getClass(), "sourcePosition", 0);
        setField(term715, term715.getClass(), "jsType", null);
        setField(term715, term715.getClass(), "parent", null);
        setField(term710, term710.getClass(), "first", term715);
        setIntField(term718, term718.getClass(), "type", 318591690);
        setField(term718, term718.getClass(), "next", null);
        setField(term718, term718.getClass(), "first", term708);
        setField(term718, term718.getClass(), "last", null);
        setField(term718, term718.getClass(), "propListHead", null);
        setIntField(term718, term718.getClass(), "sourcePosition", 0);
        setField(term718, term718.getClass(), "jsType", null);
        setField(term718, term718.getClass(), "parent", null);
        setField(term710, term710.getClass(), "last", term718);
        setField(term710, term710.getClass(), "propListHead", null);
        setIntField(term710, term710.getClass(), "sourcePosition", 0);
        setField(term710, term710.getClass(), "jsType", null);
        setField(term710, term710.getClass(), "parent", null);
        setField(term708, term708.getClass(), "next", term710);
        setField(term708, term708.getClass(), "first", term710);
        setIntField(term722, term722.getClass(), "type", -571169753);
        setField(term722, term722.getClass(), "next", term718);
        setField(term722, term722.getClass(), "first", term715);
        setField(term722, term722.getClass(), "last", term715);
        setField(term722, term722.getClass(), "propListHead", null);
        setIntField(term722, term722.getClass(), "sourcePosition", 0);
        setField(term722, term722.getClass(), "jsType", null);
        setField(term722, term722.getClass(), "parent", null);
        setField(term708, term708.getClass(), "last", term722);
        setField(term708, term708.getClass(), "propListHead", null);
        setIntField(term708, term708.getClass(), "sourcePosition", 0);
        setField(term708, term708.getClass(), "jsType", null);
        setField(term708, term708.getClass(), "parent", null);
        setField(term706, term706.getClass(), "next", term708);
        setField(term706, term706.getClass(), "first", term715);
        setIntField(term726, term726.getClass(), "type", 0);
        setField(term726, term726.getClass(), "next", null);
        setField(term726, term726.getClass(), "first", null);
        setField(term726, term726.getClass(), "last", null);
        setField(term726, term726.getClass(), "propListHead", null);
        setIntField(term726, term726.getClass(), "sourcePosition", 0);
        setField(term726, term726.getClass(), "jsType", null);
        setField(term726, term726.getClass(), "parent", null);
        setField(term706, term706.getClass(), "last", term726);
        setField(term706, term706.getClass(), "propListHead", null);
        setIntField(term706, term706.getClass(), "sourcePosition", 0);
        setField(term706, term706.getClass(), "jsType", null);
        setField(term706, term706.getClass(), "parent", null);
        setField(term693, term693.getClass(), "nameNode", term706);
        setField(term693, term693.getClass(), "type", null);
        setBooleanField(term693, term693.getClass(), "typeInferred", false);
        setField(term693, term693.getClass(), "input", null);
        setIntField(term693, term693.getClass(), "index", 0);
        setField(term693, term693.getClass(), "scope", null);
        setBooleanField(term693, term693.getClass(), "markedEscaped", false);
        setBooleanField(term693, term693.getClass(), "markedAssignedExactlyOnce", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Object[] args = new Object[1];
        args[0] = term693;
        try {
            callMethod(klass, "removeAllAssigns", argTypes, term689, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
