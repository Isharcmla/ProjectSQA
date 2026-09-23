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
import java.util.HashMap;
import java.lang.Object;

public class Scope_undeclare_65919611738 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term571;
     Object term593;

    public Scope_undeclare_65919611738() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term572 = new HashMap();
        term571 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term585 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term589 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term571, term571.getClass(), "vars", term572);
        setField(term585, term585.getClass(), "vars", null);
        setField(term585, term585.getClass(), "parent", null);
        setIntField(term585, term585.getClass(), "depth", 0);
        setField(term585, term585.getClass(), "rootNode", null);
        setField(term585, term585.getClass(), "thisType", null);
        setBooleanField(term585, term585.getClass(), "isBottom", false);
        setField(term585, term585.getClass(), "arguments", null);
        setField(term571, term571.getClass(), "parent", term585);
        setIntField(term571, term571.getClass(), "depth", 11724947);
        setIntField(term589, term589.getClass(), "type", 0);
        setField(term589, term589.getClass(), "next", null);
        setField(term589, term589.getClass(), "first", null);
        setField(term589, term589.getClass(), "last", null);
        setField(term589, term589.getClass(), "propListHead", null);
        setIntField(term589, term589.getClass(), "sourcePosition", 0);
        setField(term589, term589.getClass(), "jsType", null);
        setField(term589, term589.getClass(), "parent", null);
        setField(term571, term571.getClass(), "rootNode", term589);
        setField(term571, term571.getClass(), "thisType", null);
        setBooleanField(term571, term571.getClass(), "isBottom", false);
        setField(term571, term571.getClass(), "arguments", null);
        term593 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Var"));
        Object term606 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term608 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term610 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term613 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term616 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term620 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term623 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term593, term593.getClass(), "name", "XOiDvlDhdc");
        setIntField(term606, term606.getClass(), "type", 1398204340);
        setIntField(term608, term608.getClass(), "type", 1384592638);
        setIntField(term610, term610.getClass(), "type", 0);
        setField(term610, term610.getClass(), "next", null);
        setField(term610, term610.getClass(), "first", null);
        setField(term610, term610.getClass(), "last", null);
        setField(term610, term610.getClass(), "propListHead", null);
        setIntField(term610, term610.getClass(), "sourcePosition", 0);
        setField(term610, term610.getClass(), "jsType", null);
        setField(term610, term610.getClass(), "parent", null);
        setField(term608, term608.getClass(), "next", term610);
        setIntField(term613, term613.getClass(), "type", 0);
        setField(term613, term613.getClass(), "next", null);
        setField(term613, term613.getClass(), "first", null);
        setField(term613, term613.getClass(), "last", null);
        setField(term613, term613.getClass(), "propListHead", null);
        setIntField(term613, term613.getClass(), "sourcePosition", 0);
        setField(term613, term613.getClass(), "jsType", null);
        setField(term613, term613.getClass(), "parent", null);
        setField(term608, term608.getClass(), "first", term613);
        setIntField(term616, term616.getClass(), "type", 0);
        setField(term616, term616.getClass(), "next", null);
        setField(term616, term616.getClass(), "first", null);
        setField(term616, term616.getClass(), "last", null);
        setField(term616, term616.getClass(), "propListHead", null);
        setIntField(term616, term616.getClass(), "sourcePosition", 0);
        setField(term616, term616.getClass(), "jsType", null);
        setField(term616, term616.getClass(), "parent", null);
        setField(term608, term608.getClass(), "last", term616);
        setField(term608, term608.getClass(), "propListHead", null);
        setIntField(term608, term608.getClass(), "sourcePosition", 0);
        setField(term608, term608.getClass(), "jsType", null);
        setField(term608, term608.getClass(), "parent", null);
        setField(term606, term606.getClass(), "next", term608);
        setIntField(term620, term620.getClass(), "type", 0);
        setField(term620, term620.getClass(), "next", null);
        setField(term620, term620.getClass(), "first", null);
        setField(term620, term620.getClass(), "last", null);
        setField(term620, term620.getClass(), "propListHead", null);
        setIntField(term620, term620.getClass(), "sourcePosition", 0);
        setField(term620, term620.getClass(), "jsType", null);
        setField(term620, term620.getClass(), "parent", null);
        setField(term606, term606.getClass(), "first", term620);
        setIntField(term623, term623.getClass(), "type", 0);
        setField(term623, term623.getClass(), "next", null);
        setField(term623, term623.getClass(), "first", null);
        setField(term623, term623.getClass(), "last", null);
        setField(term623, term623.getClass(), "propListHead", null);
        setIntField(term623, term623.getClass(), "sourcePosition", 0);
        setField(term623, term623.getClass(), "jsType", null);
        setField(term623, term623.getClass(), "parent", null);
        setField(term606, term606.getClass(), "last", term623);
        setField(term606, term606.getClass(), "propListHead", null);
        setIntField(term606, term606.getClass(), "sourcePosition", 0);
        setField(term606, term606.getClass(), "jsType", null);
        setField(term606, term606.getClass(), "parent", null);
        setField(term593, term593.getClass(), "nameNode", term606);
        setField(term593, term593.getClass(), "type", null);
        setField(term593, term593.getClass(), "info", null);
        setBooleanField(term593, term593.getClass(), "typeInferred", false);
        setField(term593, term593.getClass(), "input", null);
        setBooleanField(term593, term593.getClass(), "isDefine", false);
        setIntField(term593, term593.getClass(), "index", 0);
        setField(term593, term593.getClass(), "scope", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Scope");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Object[] args = new Object[1];
        args[0] = term593;
        try {
            callMethod(klass, "undeclare", argTypes, term571, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


