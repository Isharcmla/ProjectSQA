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

public class CodeGenerator_addList_601406049 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1695;
     Object term1696;

    public CodeGenerator_addList_601406049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1695 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term1695, term1695.getClass(), "cc", null);
        setField(term1695, term1695.getClass(), "outputCharsetEncoder", null);
        term1696 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1698 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1700 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1703 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1706 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1709 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1713 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1716 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1719 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1696, term1696.getClass(), "type", 683666002);
        setIntField(term1698, term1698.getClass(), "type", -663691365);
        setIntField(term1700, term1700.getClass(), "type", 0);
        setField(term1700, term1700.getClass(), "next", null);
        setField(term1700, term1700.getClass(), "first", null);
        setField(term1700, term1700.getClass(), "last", null);
        setField(term1700, term1700.getClass(), "propListHead", null);
        setIntField(term1700, term1700.getClass(), "sourcePosition", 0);
        setField(term1700, term1700.getClass(), "jsType", null);
        setField(term1700, term1700.getClass(), "parent", null);
        setField(term1698, term1698.getClass(), "next", term1700);
        setIntField(term1703, term1703.getClass(), "type", 0);
        setField(term1703, term1703.getClass(), "next", null);
        setField(term1703, term1703.getClass(), "first", null);
        setField(term1703, term1703.getClass(), "last", null);
        setField(term1703, term1703.getClass(), "propListHead", null);
        setIntField(term1703, term1703.getClass(), "sourcePosition", 0);
        setField(term1703, term1703.getClass(), "jsType", null);
        setField(term1703, term1703.getClass(), "parent", null);
        setField(term1698, term1698.getClass(), "first", term1703);
        setIntField(term1706, term1706.getClass(), "type", 0);
        setField(term1706, term1706.getClass(), "next", null);
        setField(term1706, term1706.getClass(), "first", null);
        setField(term1706, term1706.getClass(), "last", null);
        setField(term1706, term1706.getClass(), "propListHead", null);
        setIntField(term1706, term1706.getClass(), "sourcePosition", 0);
        setField(term1706, term1706.getClass(), "jsType", null);
        setField(term1706, term1706.getClass(), "parent", null);
        setField(term1698, term1698.getClass(), "last", term1706);
        setField(term1709, term1709.getClass(), "next", null);
        setIntField(term1709, term1709.getClass(), "type", 0);
        setIntField(term1709, term1709.getClass(), "intValue", 0);
        setField(term1709, term1709.getClass(), "objectValue", null);
        setField(term1698, term1698.getClass(), "propListHead", term1709);
        setIntField(term1698, term1698.getClass(), "sourcePosition", -1476117762);
        setField(term1698, term1698.getClass(), "jsType", null);
        setField(term1698, term1698.getClass(), "parent", null);
        setField(term1696, term1696.getClass(), "next", term1698);
        setIntField(term1713, term1713.getClass(), "type", 0);
        setField(term1713, term1713.getClass(), "next", null);
        setField(term1713, term1713.getClass(), "first", null);
        setField(term1713, term1713.getClass(), "last", null);
        setField(term1713, term1713.getClass(), "propListHead", null);
        setIntField(term1713, term1713.getClass(), "sourcePosition", 0);
        setField(term1713, term1713.getClass(), "jsType", null);
        setField(term1713, term1713.getClass(), "parent", null);
        setField(term1696, term1696.getClass(), "first", term1713);
        setIntField(term1716, term1716.getClass(), "type", 0);
        setField(term1716, term1716.getClass(), "next", null);
        setField(term1716, term1716.getClass(), "first", null);
        setField(term1716, term1716.getClass(), "last", null);
        setField(term1716, term1716.getClass(), "propListHead", null);
        setIntField(term1716, term1716.getClass(), "sourcePosition", 0);
        setField(term1716, term1716.getClass(), "jsType", null);
        setField(term1716, term1716.getClass(), "parent", null);
        setField(term1696, term1696.getClass(), "last", term1716);
        setField(term1719, term1719.getClass(), "next", null);
        setIntField(term1719, term1719.getClass(), "type", 0);
        setIntField(term1719, term1719.getClass(), "intValue", 0);
        setField(term1719, term1719.getClass(), "objectValue", null);
        setField(term1696, term1696.getClass(), "propListHead", term1719);
        setIntField(term1696, term1696.getClass(), "sourcePosition", -341962980);
        setField(term1696, term1696.getClass(), "jsType", null);
        setField(term1696, term1696.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1696;
        try {
            callMethod(klass, "addList", argTypes, term1695, args);
            assertTrue(false);
        }
        catch (Error e) {
        }

    }

};


