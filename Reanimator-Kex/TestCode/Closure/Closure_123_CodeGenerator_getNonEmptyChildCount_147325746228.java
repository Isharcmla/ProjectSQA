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
import java.lang.Object;
import java.lang.Integer;

public class CodeGenerator_getNonEmptyChildCount_147325746228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15669;
     Object term15696;

    public CodeGenerator_getNonEmptyChildCount_147325746228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15669 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15671 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15673 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15675 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15677 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15680 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15684 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15686 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15691 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15669, term15669.getClass(), "type", 9726679);
        setIntField(term15671, term15671.getClass(), "type", -25637976);
        setIntField(term15673, term15673.getClass(), "type", 1555897383);
        setIntField(term15675, term15675.getClass(), "type", 202001407);
        setIntField(term15677, term15677.getClass(), "type", 158873461);
        setField(term15677, term15677.getClass(), "next", null);
        setField(term15677, term15677.getClass(), "first", null);
        setField(term15677, term15677.getClass(), "last", null);
        setField(term15677, term15677.getClass(), "propListHead", null);
        setIntField(term15677, term15677.getClass(), "sourcePosition", 0);
        setField(term15677, term15677.getClass(), "jsType", null);
        setField(term15677, term15677.getClass(), "parent", null);
        setField(term15675, term15675.getClass(), "next", term15677);
        setIntField(term15680, term15680.getClass(), "type", -430151637);
        setField(term15680, term15680.getClass(), "next", null);
        setField(term15680, term15680.getClass(), "first", null);
        setField(term15680, term15680.getClass(), "last", term15677);
        setField(term15680, term15680.getClass(), "propListHead", null);
        setIntField(term15680, term15680.getClass(), "sourcePosition", 0);
        setField(term15680, term15680.getClass(), "jsType", null);
        setField(term15680, term15680.getClass(), "parent", null);
        setField(term15675, term15675.getClass(), "first", term15680);
        setField(term15675, term15675.getClass(), "last", term15673);
        setField(term15675, term15675.getClass(), "propListHead", null);
        setIntField(term15675, term15675.getClass(), "sourcePosition", 0);
        setField(term15675, term15675.getClass(), "jsType", null);
        setField(term15675, term15675.getClass(), "parent", null);
        setField(term15673, term15673.getClass(), "next", term15675);
        setField(term15673, term15673.getClass(), "first", term15677);
        setIntField(term15684, term15684.getClass(), "type", 98922530);
        setIntField(term15686, term15686.getClass(), "type", -1388471422);
        setField(term15686, term15686.getClass(), "next", null);
        setField(term15686, term15686.getClass(), "first", term15680);
        setField(term15686, term15686.getClass(), "last", term15675);
        setField(term15686, term15686.getClass(), "propListHead", null);
        setIntField(term15686, term15686.getClass(), "sourcePosition", 0);
        setField(term15686, term15686.getClass(), "jsType", null);
        setField(term15686, term15686.getClass(), "parent", null);
        setField(term15684, term15684.getClass(), "next", term15686);
        setField(term15684, term15684.getClass(), "first", term15671);
        setField(term15684, term15684.getClass(), "last", term15671);
        setField(term15684, term15684.getClass(), "propListHead", null);
        setIntField(term15684, term15684.getClass(), "sourcePosition", 0);
        setField(term15684, term15684.getClass(), "jsType", null);
        setField(term15684, term15684.getClass(), "parent", null);
        setField(term15673, term15673.getClass(), "last", term15684);
        setField(term15673, term15673.getClass(), "propListHead", null);
        setIntField(term15673, term15673.getClass(), "sourcePosition", 0);
        setField(term15673, term15673.getClass(), "jsType", null);
        setField(term15673, term15673.getClass(), "parent", null);
        setField(term15671, term15671.getClass(), "next", term15673);
        setIntField(term15691, term15691.getClass(), "type", -1498296052);
        setField(term15691, term15691.getClass(), "next", term15684);
        setField(term15691, term15691.getClass(), "first", term15686);
        setField(term15691, term15691.getClass(), "last", term15669);
        setField(term15691, term15691.getClass(), "propListHead", null);
        setIntField(term15691, term15691.getClass(), "sourcePosition", 0);
        setField(term15691, term15691.getClass(), "jsType", null);
        setField(term15691, term15691.getClass(), "parent", null);
        setField(term15671, term15671.getClass(), "first", term15691);
        setField(term15671, term15671.getClass(), "last", term15691);
        setField(term15671, term15671.getClass(), "propListHead", null);
        setIntField(term15671, term15671.getClass(), "sourcePosition", 0);
        setField(term15671, term15671.getClass(), "jsType", null);
        setField(term15671, term15671.getClass(), "parent", null);
        setField(term15669, term15669.getClass(), "next", term15671);
        setField(term15669, term15669.getClass(), "first", term15675);
        setField(term15669, term15669.getClass(), "last", term15677);
        setField(term15669, term15669.getClass(), "propListHead", null);
        setIntField(term15669, term15669.getClass(), "sourcePosition", 0);
        setField(term15669, term15669.getClass(), "jsType", null);
        setField(term15669, term15669.getClass(), "parent", null);
        term15696 = new Integer(2098647989);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term15669;
        args[1] = term15696;
        callMethod(klass, "getNonEmptyChildCount", argTypes, null, args);
    }

};


