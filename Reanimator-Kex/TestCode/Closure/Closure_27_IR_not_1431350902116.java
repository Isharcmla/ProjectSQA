package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class IR_not_1431350902116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1777;

    public IR_not_1431350902116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1777 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1779 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1781 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1783 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1785 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1788 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1792 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1794 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1799 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1777, term1777.getClass(), "type", -573608449);
        setIntField(term1779, term1779.getClass(), "type", -1660057757);
        setIntField(term1781, term1781.getClass(), "type", 1816273440);
        setIntField(term1783, term1783.getClass(), "type", -96541009);
        setIntField(term1785, term1785.getClass(), "type", -43719302);
        setField(term1785, term1785.getClass(), "next", null);
        setField(term1785, term1785.getClass(), "first", null);
        setField(term1785, term1785.getClass(), "last", null);
        setField(term1785, term1785.getClass(), "propListHead", null);
        setIntField(term1785, term1785.getClass(), "sourcePosition", 0);
        setField(term1785, term1785.getClass(), "jsType", null);
        setField(term1785, term1785.getClass(), "parent", null);
        setField(term1783, term1783.getClass(), "next", term1785);
        setIntField(term1788, term1788.getClass(), "type", 1024134939);
        setField(term1788, term1788.getClass(), "next", null);
        setField(term1788, term1788.getClass(), "first", null);
        setField(term1788, term1788.getClass(), "last", term1785);
        setField(term1788, term1788.getClass(), "propListHead", null);
        setIntField(term1788, term1788.getClass(), "sourcePosition", 0);
        setField(term1788, term1788.getClass(), "jsType", null);
        setField(term1788, term1788.getClass(), "parent", null);
        setField(term1783, term1783.getClass(), "first", term1788);
        setField(term1783, term1783.getClass(), "last", term1781);
        setField(term1783, term1783.getClass(), "propListHead", null);
        setIntField(term1783, term1783.getClass(), "sourcePosition", 0);
        setField(term1783, term1783.getClass(), "jsType", null);
        setField(term1783, term1783.getClass(), "parent", null);
        setField(term1781, term1781.getClass(), "next", term1783);
        setField(term1781, term1781.getClass(), "first", term1785);
        setIntField(term1792, term1792.getClass(), "type", -314165467);
        setIntField(term1794, term1794.getClass(), "type", 963694071);
        setField(term1794, term1794.getClass(), "next", null);
        setField(term1794, term1794.getClass(), "first", term1788);
        setField(term1794, term1794.getClass(), "last", term1783);
        setField(term1794, term1794.getClass(), "propListHead", null);
        setIntField(term1794, term1794.getClass(), "sourcePosition", 0);
        setField(term1794, term1794.getClass(), "jsType", null);
        setField(term1794, term1794.getClass(), "parent", null);
        setField(term1792, term1792.getClass(), "next", term1794);
        setField(term1792, term1792.getClass(), "first", term1779);
        setField(term1792, term1792.getClass(), "last", term1779);
        setField(term1792, term1792.getClass(), "propListHead", null);
        setIntField(term1792, term1792.getClass(), "sourcePosition", 0);
        setField(term1792, term1792.getClass(), "jsType", null);
        setField(term1792, term1792.getClass(), "parent", null);
        setField(term1781, term1781.getClass(), "last", term1792);
        setField(term1781, term1781.getClass(), "propListHead", null);
        setIntField(term1781, term1781.getClass(), "sourcePosition", 0);
        setField(term1781, term1781.getClass(), "jsType", null);
        setField(term1781, term1781.getClass(), "parent", null);
        setField(term1779, term1779.getClass(), "next", term1781);
        setIntField(term1799, term1799.getClass(), "type", -995785731);
        setField(term1799, term1799.getClass(), "next", term1792);
        setField(term1799, term1799.getClass(), "first", term1794);
        setField(term1799, term1799.getClass(), "last", term1777);
        setField(term1799, term1799.getClass(), "propListHead", null);
        setIntField(term1799, term1799.getClass(), "sourcePosition", 0);
        setField(term1799, term1799.getClass(), "jsType", null);
        setField(term1799, term1799.getClass(), "parent", null);
        setField(term1779, term1779.getClass(), "first", term1799);
        setField(term1779, term1779.getClass(), "last", term1799);
        setField(term1779, term1779.getClass(), "propListHead", null);
        setIntField(term1779, term1779.getClass(), "sourcePosition", 0);
        setField(term1779, term1779.getClass(), "jsType", null);
        setField(term1779, term1779.getClass(), "parent", null);
        setField(term1777, term1777.getClass(), "next", term1779);
        setField(term1777, term1777.getClass(), "first", term1783);
        setField(term1777, term1777.getClass(), "last", term1785);
        setField(term1777, term1777.getClass(), "propListHead", null);
        setIntField(term1777, term1777.getClass(), "sourcePosition", 0);
        setField(term1777, term1777.getClass(), "jsType", null);
        setField(term1777, term1777.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1777;
        try {
            callMethod(klass, "not", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


