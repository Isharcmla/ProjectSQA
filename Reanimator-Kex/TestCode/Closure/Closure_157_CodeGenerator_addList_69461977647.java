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
import java.lang.Error;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.String;

public class CodeGenerator_addList_69461977647 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1709;
     Object term1710;
     Object term1737;
     Object enum12;

    public CodeGenerator_addList_69461977647() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1709 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term1709, term1709.getClass(), "cc", null);
        setField(term1709, term1709.getClass(), "outputCharsetEncoder", null);
        term1710 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1712 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1714 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1717 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1720 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1723 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1727 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1730 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1733 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1710, term1710.getClass(), "type", -375014958);
        setIntField(term1712, term1712.getClass(), "type", -2015854073);
        setIntField(term1714, term1714.getClass(), "type", 0);
        setField(term1714, term1714.getClass(), "next", null);
        setField(term1714, term1714.getClass(), "first", null);
        setField(term1714, term1714.getClass(), "last", null);
        setField(term1714, term1714.getClass(), "propListHead", null);
        setIntField(term1714, term1714.getClass(), "sourcePosition", 0);
        setField(term1714, term1714.getClass(), "jsType", null);
        setField(term1714, term1714.getClass(), "parent", null);
        setField(term1712, term1712.getClass(), "next", term1714);
        setIntField(term1717, term1717.getClass(), "type", 0);
        setField(term1717, term1717.getClass(), "next", null);
        setField(term1717, term1717.getClass(), "first", null);
        setField(term1717, term1717.getClass(), "last", null);
        setField(term1717, term1717.getClass(), "propListHead", null);
        setIntField(term1717, term1717.getClass(), "sourcePosition", 0);
        setField(term1717, term1717.getClass(), "jsType", null);
        setField(term1717, term1717.getClass(), "parent", null);
        setField(term1712, term1712.getClass(), "first", term1717);
        setIntField(term1720, term1720.getClass(), "type", 0);
        setField(term1720, term1720.getClass(), "next", null);
        setField(term1720, term1720.getClass(), "first", null);
        setField(term1720, term1720.getClass(), "last", null);
        setField(term1720, term1720.getClass(), "propListHead", null);
        setIntField(term1720, term1720.getClass(), "sourcePosition", 0);
        setField(term1720, term1720.getClass(), "jsType", null);
        setField(term1720, term1720.getClass(), "parent", null);
        setField(term1712, term1712.getClass(), "last", term1720);
        setField(term1723, term1723.getClass(), "next", null);
        setIntField(term1723, term1723.getClass(), "type", 0);
        setIntField(term1723, term1723.getClass(), "intValue", 0);
        setField(term1723, term1723.getClass(), "objectValue", null);
        setField(term1712, term1712.getClass(), "propListHead", term1723);
        setIntField(term1712, term1712.getClass(), "sourcePosition", -343325701);
        setField(term1712, term1712.getClass(), "jsType", null);
        setField(term1712, term1712.getClass(), "parent", null);
        setField(term1710, term1710.getClass(), "next", term1712);
        setIntField(term1727, term1727.getClass(), "type", 0);
        setField(term1727, term1727.getClass(), "next", null);
        setField(term1727, term1727.getClass(), "first", null);
        setField(term1727, term1727.getClass(), "last", null);
        setField(term1727, term1727.getClass(), "propListHead", null);
        setIntField(term1727, term1727.getClass(), "sourcePosition", 0);
        setField(term1727, term1727.getClass(), "jsType", null);
        setField(term1727, term1727.getClass(), "parent", null);
        setField(term1710, term1710.getClass(), "first", term1727);
        setIntField(term1730, term1730.getClass(), "type", 0);
        setField(term1730, term1730.getClass(), "next", null);
        setField(term1730, term1730.getClass(), "first", null);
        setField(term1730, term1730.getClass(), "last", null);
        setField(term1730, term1730.getClass(), "propListHead", null);
        setIntField(term1730, term1730.getClass(), "sourcePosition", 0);
        setField(term1730, term1730.getClass(), "jsType", null);
        setField(term1730, term1730.getClass(), "parent", null);
        setField(term1710, term1710.getClass(), "last", term1730);
        setField(term1733, term1733.getClass(), "next", null);
        setIntField(term1733, term1733.getClass(), "type", 0);
        setIntField(term1733, term1733.getClass(), "intValue", 0);
        setField(term1733, term1733.getClass(), "objectValue", null);
        setField(term1710, term1710.getClass(), "propListHead", term1733);
        setIntField(term1710, term1710.getClass(), "sourcePosition", 107945604);
        setField(term1710, term1710.getClass(), "jsType", null);
        setField(term1710, term1710.getClass(), "parent", null);
        term1737 = new Boolean(false);
        Class<? extends Object> term8546 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term8545 = ((Class) term8546).getDeclaredField((String) "PRESERVE_BLOCK");
        ((Field) term8545).setAccessible(true);
        enum12 = ((Field) term8545).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Object[] args = new Object[3];
        args[0] = term1710;
        args[1] = term1737;
        args[2] = enum12;
        try {
            callMethod(klass, "addList", argTypes, term1709, args);
            assertTrue(false);
        }
        catch (Error e) {
        }

    }

};


