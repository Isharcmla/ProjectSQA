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

public class NodeUtil_mapMainToClone_1834507399324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5105;
     Object term5132;

    public NodeUtil_mapMainToClone_1834507399324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5105 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5107 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5109 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5111 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5113 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5116 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5120 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5122 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5105, term5105.getClass(), "type", -194718582);
        setIntField(term5107, term5107.getClass(), "type", 42982854);
        setIntField(term5109, term5109.getClass(), "type", -1129506480);
        setIntField(term5111, term5111.getClass(), "type", 301438568);
        setIntField(term5113, term5113.getClass(), "type", -1667908453);
        setField(term5113, term5113.getClass(), "next", null);
        setField(term5113, term5113.getClass(), "first", null);
        setField(term5113, term5113.getClass(), "last", null);
        setField(term5113, term5113.getClass(), "propListHead", null);
        setIntField(term5113, term5113.getClass(), "sourcePosition", 0);
        setField(term5113, term5113.getClass(), "jsType", null);
        setField(term5113, term5113.getClass(), "parent", null);
        setField(term5111, term5111.getClass(), "next", term5113);
        setIntField(term5116, term5116.getClass(), "type", 315910438);
        setField(term5116, term5116.getClass(), "next", null);
        setField(term5116, term5116.getClass(), "first", null);
        setField(term5116, term5116.getClass(), "last", term5113);
        setField(term5116, term5116.getClass(), "propListHead", null);
        setIntField(term5116, term5116.getClass(), "sourcePosition", 0);
        setField(term5116, term5116.getClass(), "jsType", null);
        setField(term5116, term5116.getClass(), "parent", null);
        setField(term5111, term5111.getClass(), "first", term5116);
        setField(term5111, term5111.getClass(), "last", term5109);
        setField(term5111, term5111.getClass(), "propListHead", null);
        setIntField(term5111, term5111.getClass(), "sourcePosition", 0);
        setField(term5111, term5111.getClass(), "jsType", null);
        setField(term5111, term5111.getClass(), "parent", null);
        setField(term5109, term5109.getClass(), "next", term5111);
        setField(term5109, term5109.getClass(), "first", term5113);
        setIntField(term5120, term5120.getClass(), "type", 1217804703);
        setIntField(term5122, term5122.getClass(), "type", -1981494102);
        setField(term5122, term5122.getClass(), "next", null);
        setField(term5122, term5122.getClass(), "first", term5116);
        setField(term5122, term5122.getClass(), "last", term5111);
        setField(term5122, term5122.getClass(), "propListHead", null);
        setIntField(term5122, term5122.getClass(), "sourcePosition", 0);
        setField(term5122, term5122.getClass(), "jsType", null);
        setField(term5122, term5122.getClass(), "parent", null);
        setField(term5120, term5120.getClass(), "next", term5122);
        setField(term5120, term5120.getClass(), "first", term5107);
        setField(term5120, term5120.getClass(), "last", term5107);
        setField(term5120, term5120.getClass(), "propListHead", null);
        setIntField(term5120, term5120.getClass(), "sourcePosition", 0);
        setField(term5120, term5120.getClass(), "jsType", null);
        setField(term5120, term5120.getClass(), "parent", null);
        setField(term5109, term5109.getClass(), "last", term5120);
        setField(term5109, term5109.getClass(), "propListHead", null);
        setIntField(term5109, term5109.getClass(), "sourcePosition", 0);
        setField(term5109, term5109.getClass(), "jsType", null);
        setField(term5109, term5109.getClass(), "parent", null);
        setField(term5107, term5107.getClass(), "next", term5109);
        setIntField(term5127, term5127.getClass(), "type", -2064148945);
        setField(term5127, term5127.getClass(), "next", term5120);
        setField(term5127, term5127.getClass(), "first", term5122);
        setField(term5127, term5127.getClass(), "last", term5105);
        setField(term5127, term5127.getClass(), "propListHead", null);
        setIntField(term5127, term5127.getClass(), "sourcePosition", 0);
        setField(term5127, term5127.getClass(), "jsType", null);
        setField(term5127, term5127.getClass(), "parent", null);
        setField(term5107, term5107.getClass(), "first", term5127);
        setField(term5107, term5107.getClass(), "last", term5127);
        setField(term5107, term5107.getClass(), "propListHead", null);
        setIntField(term5107, term5107.getClass(), "sourcePosition", 0);
        setField(term5107, term5107.getClass(), "jsType", null);
        setField(term5107, term5107.getClass(), "parent", null);
        setField(term5105, term5105.getClass(), "next", term5107);
        setField(term5105, term5105.getClass(), "first", term5111);
        setField(term5105, term5105.getClass(), "last", term5113);
        setField(term5105, term5105.getClass(), "propListHead", null);
        setIntField(term5105, term5105.getClass(), "sourcePosition", 0);
        setField(term5105, term5105.getClass(), "jsType", null);
        setField(term5105, term5105.getClass(), "parent", null);
        term5132 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5134 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5136 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5138 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5140 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5143 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5147 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5149 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5154 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5132, term5132.getClass(), "type", 494400151);
        setIntField(term5134, term5134.getClass(), "type", 1588058685);
        setIntField(term5136, term5136.getClass(), "type", 1677707412);
        setIntField(term5138, term5138.getClass(), "type", -297367861);
        setIntField(term5140, term5140.getClass(), "type", -1133541490);
        setField(term5140, term5140.getClass(), "next", null);
        setField(term5140, term5140.getClass(), "first", null);
        setField(term5140, term5140.getClass(), "last", null);
        setField(term5140, term5140.getClass(), "propListHead", null);
        setIntField(term5140, term5140.getClass(), "sourcePosition", 0);
        setField(term5140, term5140.getClass(), "jsType", null);
        setField(term5140, term5140.getClass(), "parent", null);
        setField(term5138, term5138.getClass(), "next", term5140);
        setIntField(term5143, term5143.getClass(), "type", 942412391);
        setField(term5143, term5143.getClass(), "next", null);
        setField(term5143, term5143.getClass(), "first", null);
        setField(term5143, term5143.getClass(), "last", term5140);
        setField(term5143, term5143.getClass(), "propListHead", null);
        setIntField(term5143, term5143.getClass(), "sourcePosition", 0);
        setField(term5143, term5143.getClass(), "jsType", null);
        setField(term5143, term5143.getClass(), "parent", null);
        setField(term5138, term5138.getClass(), "first", term5143);
        setField(term5138, term5138.getClass(), "last", term5136);
        setField(term5138, term5138.getClass(), "propListHead", null);
        setIntField(term5138, term5138.getClass(), "sourcePosition", 0);
        setField(term5138, term5138.getClass(), "jsType", null);
        setField(term5138, term5138.getClass(), "parent", null);
        setField(term5136, term5136.getClass(), "next", term5138);
        setField(term5136, term5136.getClass(), "first", term5140);
        setIntField(term5147, term5147.getClass(), "type", 1971485144);
        setIntField(term5149, term5149.getClass(), "type", 2059603512);
        setField(term5149, term5149.getClass(), "next", null);
        setField(term5149, term5149.getClass(), "first", term5143);
        setField(term5149, term5149.getClass(), "last", term5138);
        setField(term5149, term5149.getClass(), "propListHead", null);
        setIntField(term5149, term5149.getClass(), "sourcePosition", 0);
        setField(term5149, term5149.getClass(), "jsType", null);
        setField(term5149, term5149.getClass(), "parent", null);
        setField(term5147, term5147.getClass(), "next", term5149);
        setField(term5147, term5147.getClass(), "first", term5134);
        setField(term5147, term5147.getClass(), "last", term5134);
        setField(term5147, term5147.getClass(), "propListHead", null);
        setIntField(term5147, term5147.getClass(), "sourcePosition", 0);
        setField(term5147, term5147.getClass(), "jsType", null);
        setField(term5147, term5147.getClass(), "parent", null);
        setField(term5136, term5136.getClass(), "last", term5147);
        setField(term5136, term5136.getClass(), "propListHead", null);
        setIntField(term5136, term5136.getClass(), "sourcePosition", 0);
        setField(term5136, term5136.getClass(), "jsType", null);
        setField(term5136, term5136.getClass(), "parent", null);
        setField(term5134, term5134.getClass(), "next", term5136);
        setIntField(term5154, term5154.getClass(), "type", -1308902065);
        setField(term5154, term5154.getClass(), "next", term5147);
        setField(term5154, term5154.getClass(), "first", term5149);
        setField(term5154, term5154.getClass(), "last", term5132);
        setField(term5154, term5154.getClass(), "propListHead", null);
        setIntField(term5154, term5154.getClass(), "sourcePosition", 0);
        setField(term5154, term5154.getClass(), "jsType", null);
        setField(term5154, term5154.getClass(), "parent", null);
        setField(term5134, term5134.getClass(), "first", term5154);
        setField(term5134, term5134.getClass(), "last", term5154);
        setField(term5134, term5134.getClass(), "propListHead", null);
        setIntField(term5134, term5134.getClass(), "sourcePosition", 0);
        setField(term5134, term5134.getClass(), "jsType", null);
        setField(term5134, term5134.getClass(), "parent", null);
        setField(term5132, term5132.getClass(), "next", term5134);
        setField(term5132, term5132.getClass(), "first", term5138);
        setField(term5132, term5132.getClass(), "last", term5140);
        setField(term5132, term5132.getClass(), "propListHead", null);
        setIntField(term5132, term5132.getClass(), "sourcePosition", 0);
        setField(term5132, term5132.getClass(), "jsType", null);
        setField(term5132, term5132.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term5105;
        args[1] = term5132;
        try {
            callMethod(klass, "mapMainToClone", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


