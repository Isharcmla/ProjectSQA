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

public class IR_paramList_193679063876 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109;

    public IR_paramList_193679063876() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109 = (Object[]) newArray("com.google.javascript.rhino.Node", 5);
        Object term110 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term112 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term114 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term116 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term122 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term126 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term128 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term134 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term110, term110.getClass(), "type", 1962444399);
        setIntField(term112, term112.getClass(), "type", 767834723);
        setIntField(term114, term114.getClass(), "type", -602026508);
        setIntField(term116, term116.getClass(), "type", -157887805);
        setField(term116, term116.getClass(), "next", null);
        setField(term116, term116.getClass(), "first", null);
        setField(term116, term116.getClass(), "last", term114);
        setField(term116, term116.getClass(), "propListHead", null);
        setIntField(term116, term116.getClass(), "sourcePosition", 0);
        setField(term116, term116.getClass(), "jsType", null);
        setField(term116, term116.getClass(), "parent", null);
        setField(term114, term114.getClass(), "next", term116);
        setIntField(term119, term119.getClass(), "type", 1876565163);
        setField(term119, term119.getClass(), "next", null);
        setField(term119, term119.getClass(), "first", null);
        setField(term119, term119.getClass(), "last", null);
        setField(term119, term119.getClass(), "propListHead", null);
        setIntField(term119, term119.getClass(), "sourcePosition", 0);
        setField(term119, term119.getClass(), "jsType", null);
        setField(term119, term119.getClass(), "parent", null);
        setField(term114, term114.getClass(), "first", term119);
        setIntField(term122, term122.getClass(), "type", -1968847291);
        setField(term122, term122.getClass(), "next", null);
        setField(term122, term122.getClass(), "first", term112);
        setField(term122, term122.getClass(), "last", term112);
        setField(term122, term122.getClass(), "propListHead", null);
        setIntField(term122, term122.getClass(), "sourcePosition", 0);
        setField(term122, term122.getClass(), "jsType", null);
        setField(term122, term122.getClass(), "parent", null);
        setField(term114, term114.getClass(), "last", term122);
        setField(term114, term114.getClass(), "propListHead", null);
        setIntField(term114, term114.getClass(), "sourcePosition", 0);
        setField(term114, term114.getClass(), "jsType", null);
        setField(term114, term114.getClass(), "parent", null);
        setField(term112, term112.getClass(), "next", term114);
        setIntField(term126, term126.getClass(), "type", -14890619);
        setField(term126, term126.getClass(), "next", term122);
        setIntField(term128, term128.getClass(), "type", 579005622);
        setField(term128, term128.getClass(), "next", term126);
        setField(term128, term128.getClass(), "first", null);
        setField(term128, term128.getClass(), "last", term116);
        setField(term128, term128.getClass(), "propListHead", null);
        setIntField(term128, term128.getClass(), "sourcePosition", 0);
        setField(term128, term128.getClass(), "jsType", null);
        setField(term128, term128.getClass(), "parent", null);
        setField(term126, term126.getClass(), "first", term128);
        setField(term126, term126.getClass(), "last", term110);
        setField(term126, term126.getClass(), "propListHead", null);
        setIntField(term126, term126.getClass(), "sourcePosition", 0);
        setField(term126, term126.getClass(), "jsType", null);
        setField(term126, term126.getClass(), "parent", null);
        setField(term112, term112.getClass(), "first", term126);
        setField(term112, term112.getClass(), "last", term126);
        setField(term112, term112.getClass(), "propListHead", null);
        setIntField(term112, term112.getClass(), "sourcePosition", 0);
        setField(term112, term112.getClass(), "jsType", null);
        setField(term112, term112.getClass(), "parent", null);
        setField(term110, term110.getClass(), "next", term112);
        setField(term110, term110.getClass(), "first", term116);
        setField(term110, term110.getClass(), "last", term119);
        setField(term110, term110.getClass(), "propListHead", null);
        setIntField(term110, term110.getClass(), "sourcePosition", 0);
        setField(term110, term110.getClass(), "jsType", null);
        setField(term110, term110.getClass(), "parent", null);
        setElement(term109, 0, term110);
        setElement(term109, 1, term119);
        setElement(term109, 2, term112);
        setIntField(term134, term134.getClass(), "type", -1016503459);
        setField(term134, term134.getClass(), "next", term122);
        setField(term134, term134.getClass(), "first", term126);
        setField(term134, term134.getClass(), "last", term122);
        setField(term134, term134.getClass(), "propListHead", null);
        setIntField(term134, term134.getClass(), "sourcePosition", 0);
        setField(term134, term134.getClass(), "jsType", null);
        setField(term134, term134.getClass(), "parent", null);
        setElement(term109, 3, term134);
        setElement(term109, 4, term134);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("com.google.javascript.rhino.Node"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term109;
        try {
            callMethod(klass, "paramList", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


