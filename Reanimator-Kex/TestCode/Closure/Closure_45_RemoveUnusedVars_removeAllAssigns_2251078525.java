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
     Object term669;
     Object term673;

    public RemoveUnusedVars_removeAllAssigns_2251078525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term669 = newInstance(Class.forName("com.google.javascript.jscomp.RemoveUnusedVars"));
        setField(term669, term669.getClass(), "compiler", null);
        setField(term669, term669.getClass(), "codingConvention", null);
        setBooleanField(term669, term669.getClass(), "removeGlobals", true);
        setBooleanField(term669, term669.getClass(), "preserveFunctionExpressionNames", true);
        setField(term669, term669.getClass(), "referenced", null);
        setField(term669, term669.getClass(), "maybeUnreferenced", null);
        setField(term669, term669.getClass(), "allFunctionScopes", null);
        setField(term669, term669.getClass(), "assignsByVar", null);
        setField(term669, term669.getClass(), "assignsByNode", null);
        setField(term669, term669.getClass(), "inheritsCalls", null);
        setField(term669, term669.getClass(), "continuations", null);
        setBooleanField(term669, term669.getClass(), "modifyCallSites", false);
        setField(term669, term669.getClass(), "callSiteOptimizer", null);
        term673 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Var"));
        Object term686 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term688 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term690 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term692 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term695 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term698 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term702 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term706 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term673, term673.getClass(), "name", "pCTimMblYc");
        setIntField(term686, term686.getClass(), "type", -1222614956);
        setIntField(term688, term688.getClass(), "type", -1870495012);
        setIntField(term690, term690.getClass(), "type", -1310015129);
        setIntField(term692, term692.getClass(), "type", -2104981311);
        setField(term692, term692.getClass(), "next", null);
        setField(term692, term692.getClass(), "first", null);
        setField(term692, term692.getClass(), "last", null);
        setField(term692, term692.getClass(), "propListHead", null);
        setIntField(term692, term692.getClass(), "sourcePosition", 0);
        setField(term692, term692.getClass(), "jsType", null);
        setField(term692, term692.getClass(), "parent", null);
        setField(term690, term690.getClass(), "next", term692);
        setIntField(term695, term695.getClass(), "type", -1347358701);
        setField(term695, term695.getClass(), "next", null);
        setField(term695, term695.getClass(), "first", term686);
        setField(term695, term695.getClass(), "last", null);
        setField(term695, term695.getClass(), "propListHead", null);
        setIntField(term695, term695.getClass(), "sourcePosition", 0);
        setField(term695, term695.getClass(), "jsType", null);
        setField(term695, term695.getClass(), "parent", null);
        setField(term690, term690.getClass(), "first", term695);
        setIntField(term698, term698.getClass(), "type", 318591690);
        setField(term698, term698.getClass(), "next", null);
        setField(term698, term698.getClass(), "first", term688);
        setField(term698, term698.getClass(), "last", null);
        setField(term698, term698.getClass(), "propListHead", null);
        setIntField(term698, term698.getClass(), "sourcePosition", 0);
        setField(term698, term698.getClass(), "jsType", null);
        setField(term698, term698.getClass(), "parent", null);
        setField(term690, term690.getClass(), "last", term698);
        setField(term690, term690.getClass(), "propListHead", null);
        setIntField(term690, term690.getClass(), "sourcePosition", 0);
        setField(term690, term690.getClass(), "jsType", null);
        setField(term690, term690.getClass(), "parent", null);
        setField(term688, term688.getClass(), "next", term690);
        setField(term688, term688.getClass(), "first", term690);
        setIntField(term702, term702.getClass(), "type", -571169753);
        setField(term702, term702.getClass(), "next", term698);
        setField(term702, term702.getClass(), "first", term695);
        setField(term702, term702.getClass(), "last", term695);
        setField(term702, term702.getClass(), "propListHead", null);
        setIntField(term702, term702.getClass(), "sourcePosition", 0);
        setField(term702, term702.getClass(), "jsType", null);
        setField(term702, term702.getClass(), "parent", null);
        setField(term688, term688.getClass(), "last", term702);
        setField(term688, term688.getClass(), "propListHead", null);
        setIntField(term688, term688.getClass(), "sourcePosition", 0);
        setField(term688, term688.getClass(), "jsType", null);
        setField(term688, term688.getClass(), "parent", null);
        setField(term686, term686.getClass(), "next", term688);
        setField(term686, term686.getClass(), "first", term695);
        setIntField(term706, term706.getClass(), "type", 0);
        setField(term706, term706.getClass(), "next", null);
        setField(term706, term706.getClass(), "first", null);
        setField(term706, term706.getClass(), "last", null);
        setField(term706, term706.getClass(), "propListHead", null);
        setIntField(term706, term706.getClass(), "sourcePosition", 0);
        setField(term706, term706.getClass(), "jsType", null);
        setField(term706, term706.getClass(), "parent", null);
        setField(term686, term686.getClass(), "last", term706);
        setField(term686, term686.getClass(), "propListHead", null);
        setIntField(term686, term686.getClass(), "sourcePosition", 0);
        setField(term686, term686.getClass(), "jsType", null);
        setField(term686, term686.getClass(), "parent", null);
        setField(term673, term673.getClass(), "nameNode", term686);
        setField(term673, term673.getClass(), "type", null);
        setField(term673, term673.getClass(), "info", null);
        setBooleanField(term673, term673.getClass(), "typeInferred", false);
        setField(term673, term673.getClass(), "input", null);
        setBooleanField(term673, term673.getClass(), "isDefine", false);
        setIntField(term673, term673.getClass(), "index", 0);
        setField(term673, term673.getClass(), "scope", null);
        setBooleanField(term673, term673.getClass(), "markedEscaped", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.RemoveUnusedVars");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Object[] args = new Object[1];
        args[0] = term673;
        try {
            callMethod(klass, "removeAllAssigns", argTypes, term669, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


