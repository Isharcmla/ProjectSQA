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

public class NodeUtil_visitPostOrder_1046356874287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3971;

    public NodeUtil_visitPostOrder_1046356874287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3971 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3973 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3975 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3978 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3981 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3984 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3988 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3991 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3994 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3971, term3971.getClass(), "type", 1286440081);
        setIntField(term3973, term3973.getClass(), "type", -1628481565);
        setIntField(term3975, term3975.getClass(), "type", 0);
        setField(term3975, term3975.getClass(), "next", null);
        setField(term3975, term3975.getClass(), "first", null);
        setField(term3975, term3975.getClass(), "last", null);
        setField(term3975, term3975.getClass(), "propListHead", null);
        setIntField(term3975, term3975.getClass(), "sourcePosition", 0);
        setField(term3975, term3975.getClass(), "jsType", null);
        setField(term3975, term3975.getClass(), "parent", null);
        setField(term3973, term3973.getClass(), "next", term3975);
        setIntField(term3978, term3978.getClass(), "type", 0);
        setField(term3978, term3978.getClass(), "next", null);
        setField(term3978, term3978.getClass(), "first", null);
        setField(term3978, term3978.getClass(), "last", null);
        setField(term3978, term3978.getClass(), "propListHead", null);
        setIntField(term3978, term3978.getClass(), "sourcePosition", 0);
        setField(term3978, term3978.getClass(), "jsType", null);
        setField(term3978, term3978.getClass(), "parent", null);
        setField(term3973, term3973.getClass(), "first", term3978);
        setIntField(term3981, term3981.getClass(), "type", 0);
        setField(term3981, term3981.getClass(), "next", null);
        setField(term3981, term3981.getClass(), "first", null);
        setField(term3981, term3981.getClass(), "last", null);
        setField(term3981, term3981.getClass(), "propListHead", null);
        setIntField(term3981, term3981.getClass(), "sourcePosition", 0);
        setField(term3981, term3981.getClass(), "jsType", null);
        setField(term3981, term3981.getClass(), "parent", null);
        setField(term3973, term3973.getClass(), "last", term3981);
        setField(term3984, term3984.getClass(), "next", null);
        setIntField(term3984, term3984.getClass(), "type", 0);
        setIntField(term3984, term3984.getClass(), "intValue", 0);
        setField(term3984, term3984.getClass(), "objectValue", null);
        setField(term3973, term3973.getClass(), "propListHead", term3984);
        setIntField(term3973, term3973.getClass(), "sourcePosition", 1354560887);
        setField(term3973, term3973.getClass(), "jsType", null);
        setField(term3973, term3973.getClass(), "parent", null);
        setField(term3971, term3971.getClass(), "next", term3973);
        setIntField(term3988, term3988.getClass(), "type", 0);
        setField(term3988, term3988.getClass(), "next", null);
        setField(term3988, term3988.getClass(), "first", null);
        setField(term3988, term3988.getClass(), "last", null);
        setField(term3988, term3988.getClass(), "propListHead", null);
        setIntField(term3988, term3988.getClass(), "sourcePosition", 0);
        setField(term3988, term3988.getClass(), "jsType", null);
        setField(term3988, term3988.getClass(), "parent", null);
        setField(term3971, term3971.getClass(), "first", term3988);
        setIntField(term3991, term3991.getClass(), "type", 0);
        setField(term3991, term3991.getClass(), "next", null);
        setField(term3991, term3991.getClass(), "first", null);
        setField(term3991, term3991.getClass(), "last", null);
        setField(term3991, term3991.getClass(), "propListHead", null);
        setIntField(term3991, term3991.getClass(), "sourcePosition", 0);
        setField(term3991, term3991.getClass(), "jsType", null);
        setField(term3991, term3991.getClass(), "parent", null);
        setField(term3971, term3971.getClass(), "last", term3991);
        setField(term3994, term3994.getClass(), "next", null);
        setIntField(term3994, term3994.getClass(), "type", 0);
        setIntField(term3994, term3994.getClass(), "intValue", 0);
        setField(term3994, term3994.getClass(), "objectValue", null);
        setField(term3971, term3971.getClass(), "propListHead", term3994);
        setIntField(term3971, term3971.getClass(), "sourcePosition", -749474542);
        setField(term3971, term3971.getClass(), "jsType", null);
        setField(term3971, term3971.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.NodeUtil$Visitor");
        argTypes[2] = Class.forName("com.google.common.base.Predicate");
        Object[] args = new Object[3];
        args[0] = term3971;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "visitPostOrder", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


