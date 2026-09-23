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

public class NodeUtil_isNameReferenced_1680890329281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3743;

    public NodeUtil_isNameReferenced_1680890329281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3743 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3745 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3747 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3750 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3753 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3756 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3760 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3763 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3766 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3743, term3743.getClass(), "type", 1841731593);
        setIntField(term3745, term3745.getClass(), "type", -574611924);
        setIntField(term3747, term3747.getClass(), "type", 0);
        setField(term3747, term3747.getClass(), "next", null);
        setField(term3747, term3747.getClass(), "first", null);
        setField(term3747, term3747.getClass(), "last", null);
        setField(term3747, term3747.getClass(), "propListHead", null);
        setIntField(term3747, term3747.getClass(), "sourcePosition", 0);
        setField(term3747, term3747.getClass(), "jsType", null);
        setField(term3747, term3747.getClass(), "parent", null);
        setField(term3745, term3745.getClass(), "next", term3747);
        setIntField(term3750, term3750.getClass(), "type", 0);
        setField(term3750, term3750.getClass(), "next", null);
        setField(term3750, term3750.getClass(), "first", null);
        setField(term3750, term3750.getClass(), "last", null);
        setField(term3750, term3750.getClass(), "propListHead", null);
        setIntField(term3750, term3750.getClass(), "sourcePosition", 0);
        setField(term3750, term3750.getClass(), "jsType", null);
        setField(term3750, term3750.getClass(), "parent", null);
        setField(term3745, term3745.getClass(), "first", term3750);
        setIntField(term3753, term3753.getClass(), "type", 0);
        setField(term3753, term3753.getClass(), "next", null);
        setField(term3753, term3753.getClass(), "first", null);
        setField(term3753, term3753.getClass(), "last", null);
        setField(term3753, term3753.getClass(), "propListHead", null);
        setIntField(term3753, term3753.getClass(), "sourcePosition", 0);
        setField(term3753, term3753.getClass(), "jsType", null);
        setField(term3753, term3753.getClass(), "parent", null);
        setField(term3745, term3745.getClass(), "last", term3753);
        setField(term3756, term3756.getClass(), "next", null);
        setIntField(term3756, term3756.getClass(), "type", 0);
        setIntField(term3756, term3756.getClass(), "intValue", 0);
        setField(term3756, term3756.getClass(), "objectValue", null);
        setField(term3745, term3745.getClass(), "propListHead", term3756);
        setIntField(term3745, term3745.getClass(), "sourcePosition", 1143522832);
        setField(term3745, term3745.getClass(), "jsType", null);
        setField(term3745, term3745.getClass(), "parent", null);
        setField(term3743, term3743.getClass(), "next", term3745);
        setIntField(term3760, term3760.getClass(), "type", 0);
        setField(term3760, term3760.getClass(), "next", null);
        setField(term3760, term3760.getClass(), "first", null);
        setField(term3760, term3760.getClass(), "last", null);
        setField(term3760, term3760.getClass(), "propListHead", null);
        setIntField(term3760, term3760.getClass(), "sourcePosition", 0);
        setField(term3760, term3760.getClass(), "jsType", null);
        setField(term3760, term3760.getClass(), "parent", null);
        setField(term3743, term3743.getClass(), "first", term3760);
        setIntField(term3763, term3763.getClass(), "type", 0);
        setField(term3763, term3763.getClass(), "next", null);
        setField(term3763, term3763.getClass(), "first", null);
        setField(term3763, term3763.getClass(), "last", null);
        setField(term3763, term3763.getClass(), "propListHead", null);
        setIntField(term3763, term3763.getClass(), "sourcePosition", 0);
        setField(term3763, term3763.getClass(), "jsType", null);
        setField(term3763, term3763.getClass(), "parent", null);
        setField(term3743, term3743.getClass(), "last", term3763);
        setField(term3766, term3766.getClass(), "next", null);
        setIntField(term3766, term3766.getClass(), "type", 0);
        setIntField(term3766, term3766.getClass(), "intValue", 0);
        setField(term3766, term3766.getClass(), "objectValue", null);
        setField(term3743, term3743.getClass(), "propListHead", term3766);
        setIntField(term3743, term3743.getClass(), "sourcePosition", 40965975);
        setField(term3743, term3743.getClass(), "jsType", null);
        setField(term3743, term3743.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term3743;
        args[1] = "flxyYxBRtu";
        args[2] = null;
        try {
            callMethod(klass, "isNameReferenced", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


