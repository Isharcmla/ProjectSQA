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

public class PeepholeSubstituteAlternateSyntax_addParameterAfter_208269094353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123;
     Object term126;
     Object term153;

    public PeepholeSubstituteAlternateSyntax_addParameterAfter_208269094353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term123, term123.getClass(), "late", true);
        setIntField(term123, term123.getClass(), "STRING_SPLIT_OVERHEAD", 1876565163);
        setField(term123, term123.getClass(), "compiler", null);
        term126 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term128 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term130 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term132 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term134 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term137 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term141 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term143 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term148 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term126, term126.getClass(), "type", -817164822);
        setIntField(term128, term128.getClass(), "type", -1016503459);
        setIntField(term130, term130.getClass(), "type", -1968847291);
        setIntField(term132, term132.getClass(), "type", 579005622);
        setIntField(term134, term134.getClass(), "type", -14890619);
        setField(term134, term134.getClass(), "next", null);
        setField(term134, term134.getClass(), "first", null);
        setField(term134, term134.getClass(), "last", null);
        setField(term134, term134.getClass(), "propListHead", null);
        setIntField(term134, term134.getClass(), "sourcePosition", 0);
        setField(term134, term134.getClass(), "jsType", null);
        setField(term134, term134.getClass(), "parent", null);
        setField(term132, term132.getClass(), "next", term134);
        setIntField(term137, term137.getClass(), "type", 1632125673);
        setField(term137, term137.getClass(), "next", null);
        setField(term137, term137.getClass(), "first", null);
        setField(term137, term137.getClass(), "last", term134);
        setField(term137, term137.getClass(), "propListHead", null);
        setIntField(term137, term137.getClass(), "sourcePosition", 0);
        setField(term137, term137.getClass(), "jsType", null);
        setField(term137, term137.getClass(), "parent", null);
        setField(term132, term132.getClass(), "first", term137);
        setField(term132, term132.getClass(), "last", term130);
        setField(term132, term132.getClass(), "propListHead", null);
        setIntField(term132, term132.getClass(), "sourcePosition", 0);
        setField(term132, term132.getClass(), "jsType", null);
        setField(term132, term132.getClass(), "parent", null);
        setField(term130, term130.getClass(), "next", term132);
        setField(term130, term130.getClass(), "first", term134);
        setIntField(term141, term141.getClass(), "type", -1786399638);
        setIntField(term143, term143.getClass(), "type", 2055867847);
        setField(term143, term143.getClass(), "next", null);
        setField(term143, term143.getClass(), "first", term137);
        setField(term143, term143.getClass(), "last", term132);
        setField(term143, term143.getClass(), "propListHead", null);
        setIntField(term143, term143.getClass(), "sourcePosition", 0);
        setField(term143, term143.getClass(), "jsType", null);
        setField(term143, term143.getClass(), "parent", null);
        setField(term141, term141.getClass(), "next", term143);
        setField(term141, term141.getClass(), "first", term128);
        setField(term141, term141.getClass(), "last", term128);
        setField(term141, term141.getClass(), "propListHead", null);
        setIntField(term141, term141.getClass(), "sourcePosition", 0);
        setField(term141, term141.getClass(), "jsType", null);
        setField(term141, term141.getClass(), "parent", null);
        setField(term130, term130.getClass(), "last", term141);
        setField(term130, term130.getClass(), "propListHead", null);
        setIntField(term130, term130.getClass(), "sourcePosition", 0);
        setField(term130, term130.getClass(), "jsType", null);
        setField(term130, term130.getClass(), "parent", null);
        setField(term128, term128.getClass(), "next", term130);
        setIntField(term148, term148.getClass(), "type", -1048298087);
        setField(term148, term148.getClass(), "next", term141);
        setField(term148, term148.getClass(), "first", term143);
        setField(term148, term148.getClass(), "last", term126);
        setField(term148, term148.getClass(), "propListHead", null);
        setIntField(term148, term148.getClass(), "sourcePosition", 0);
        setField(term148, term148.getClass(), "jsType", null);
        setField(term148, term148.getClass(), "parent", null);
        setField(term128, term128.getClass(), "first", term148);
        setField(term128, term128.getClass(), "last", term148);
        setField(term128, term128.getClass(), "propListHead", null);
        setIntField(term128, term128.getClass(), "sourcePosition", 0);
        setField(term128, term128.getClass(), "jsType", null);
        setField(term128, term128.getClass(), "parent", null);
        setField(term126, term126.getClass(), "next", term128);
        setField(term126, term126.getClass(), "first", term132);
        setField(term126, term126.getClass(), "last", term134);
        setField(term126, term126.getClass(), "propListHead", null);
        setIntField(term126, term126.getClass(), "sourcePosition", 0);
        setField(term126, term126.getClass(), "jsType", null);
        setField(term126, term126.getClass(), "parent", null);
        term153 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term155 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term157 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term159 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term161 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term164 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term168 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term170 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term175 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term153, term153.getClass(), "type", 292681826);
        setIntField(term155, term155.getClass(), "type", 458147407);
        setIntField(term157, term157.getClass(), "type", -184153539);
        setIntField(term159, term159.getClass(), "type", 493620644);
        setIntField(term161, term161.getClass(), "type", 1328271830);
        setField(term161, term161.getClass(), "next", null);
        setField(term161, term161.getClass(), "first", null);
        setField(term161, term161.getClass(), "last", null);
        setField(term161, term161.getClass(), "propListHead", null);
        setIntField(term161, term161.getClass(), "sourcePosition", 0);
        setField(term161, term161.getClass(), "jsType", null);
        setField(term161, term161.getClass(), "parent", null);
        setField(term159, term159.getClass(), "next", term161);
        setIntField(term164, term164.getClass(), "type", 1596070772);
        setField(term164, term164.getClass(), "next", null);
        setField(term164, term164.getClass(), "first", null);
        setField(term164, term164.getClass(), "last", term161);
        setField(term164, term164.getClass(), "propListHead", null);
        setIntField(term164, term164.getClass(), "sourcePosition", 0);
        setField(term164, term164.getClass(), "jsType", null);
        setField(term164, term164.getClass(), "parent", null);
        setField(term159, term159.getClass(), "first", term164);
        setField(term159, term159.getClass(), "last", term157);
        setField(term159, term159.getClass(), "propListHead", null);
        setIntField(term159, term159.getClass(), "sourcePosition", 0);
        setField(term159, term159.getClass(), "jsType", null);
        setField(term159, term159.getClass(), "parent", null);
        setField(term157, term157.getClass(), "next", term159);
        setField(term157, term157.getClass(), "first", term161);
        setIntField(term168, term168.getClass(), "type", -1371869594);
        setIntField(term170, term170.getClass(), "type", -2095575670);
        setField(term170, term170.getClass(), "next", null);
        setField(term170, term170.getClass(), "first", term164);
        setField(term170, term170.getClass(), "last", term159);
        setField(term170, term170.getClass(), "propListHead", null);
        setIntField(term170, term170.getClass(), "sourcePosition", 0);
        setField(term170, term170.getClass(), "jsType", null);
        setField(term170, term170.getClass(), "parent", null);
        setField(term168, term168.getClass(), "next", term170);
        setField(term168, term168.getClass(), "first", term155);
        setField(term168, term168.getClass(), "last", term155);
        setField(term168, term168.getClass(), "propListHead", null);
        setIntField(term168, term168.getClass(), "sourcePosition", 0);
        setField(term168, term168.getClass(), "jsType", null);
        setField(term168, term168.getClass(), "parent", null);
        setField(term157, term157.getClass(), "last", term168);
        setField(term157, term157.getClass(), "propListHead", null);
        setIntField(term157, term157.getClass(), "sourcePosition", 0);
        setField(term157, term157.getClass(), "jsType", null);
        setField(term157, term157.getClass(), "parent", null);
        setField(term155, term155.getClass(), "next", term157);
        setIntField(term175, term175.getClass(), "type", 1225272962);
        setField(term175, term175.getClass(), "next", term168);
        setField(term175, term175.getClass(), "first", term170);
        setField(term175, term175.getClass(), "last", term153);
        setField(term175, term175.getClass(), "propListHead", null);
        setIntField(term175, term175.getClass(), "sourcePosition", 0);
        setField(term175, term175.getClass(), "jsType", null);
        setField(term175, term175.getClass(), "parent", null);
        setField(term155, term155.getClass(), "first", term175);
        setField(term155, term155.getClass(), "last", term175);
        setField(term155, term155.getClass(), "propListHead", null);
        setIntField(term155, term155.getClass(), "sourcePosition", 0);
        setField(term155, term155.getClass(), "jsType", null);
        setField(term155, term155.getClass(), "parent", null);
        setField(term153, term153.getClass(), "next", term155);
        setField(term153, term153.getClass(), "first", term159);
        setField(term153, term153.getClass(), "last", term161);
        setField(term153, term153.getClass(), "propListHead", null);
        setIntField(term153, term153.getClass(), "sourcePosition", 0);
        setField(term153, term153.getClass(), "jsType", null);
        setField(term153, term153.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term126;
        args[1] = term153;
        try {
            callMethod(klass, "addParameterAfter", argTypes, term123, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


