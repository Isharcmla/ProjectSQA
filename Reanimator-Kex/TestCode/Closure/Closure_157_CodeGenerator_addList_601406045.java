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

public class CodeGenerator_addList_601406045 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1651;
     Object term1652;

    public CodeGenerator_addList_601406045() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1651 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term1651, term1651.getClass(), "cc", null);
        setField(term1651, term1651.getClass(), "outputCharsetEncoder", null);
        term1652 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1654 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1656 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1659 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1662 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1665 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1669 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1672 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1675 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1652, term1652.getClass(), "type", 683666002);
        setIntField(term1654, term1654.getClass(), "type", -663691365);
        setIntField(term1656, term1656.getClass(), "type", 0);
        setField(term1656, term1656.getClass(), "next", null);
        setField(term1656, term1656.getClass(), "first", null);
        setField(term1656, term1656.getClass(), "last", null);
        setField(term1656, term1656.getClass(), "propListHead", null);
        setIntField(term1656, term1656.getClass(), "sourcePosition", 0);
        setField(term1656, term1656.getClass(), "jsType", null);
        setField(term1656, term1656.getClass(), "parent", null);
        setField(term1654, term1654.getClass(), "next", term1656);
        setIntField(term1659, term1659.getClass(), "type", 0);
        setField(term1659, term1659.getClass(), "next", null);
        setField(term1659, term1659.getClass(), "first", null);
        setField(term1659, term1659.getClass(), "last", null);
        setField(term1659, term1659.getClass(), "propListHead", null);
        setIntField(term1659, term1659.getClass(), "sourcePosition", 0);
        setField(term1659, term1659.getClass(), "jsType", null);
        setField(term1659, term1659.getClass(), "parent", null);
        setField(term1654, term1654.getClass(), "first", term1659);
        setIntField(term1662, term1662.getClass(), "type", 0);
        setField(term1662, term1662.getClass(), "next", null);
        setField(term1662, term1662.getClass(), "first", null);
        setField(term1662, term1662.getClass(), "last", null);
        setField(term1662, term1662.getClass(), "propListHead", null);
        setIntField(term1662, term1662.getClass(), "sourcePosition", 0);
        setField(term1662, term1662.getClass(), "jsType", null);
        setField(term1662, term1662.getClass(), "parent", null);
        setField(term1654, term1654.getClass(), "last", term1662);
        setField(term1665, term1665.getClass(), "next", null);
        setIntField(term1665, term1665.getClass(), "type", 0);
        setIntField(term1665, term1665.getClass(), "intValue", 0);
        setField(term1665, term1665.getClass(), "objectValue", null);
        setField(term1654, term1654.getClass(), "propListHead", term1665);
        setIntField(term1654, term1654.getClass(), "sourcePosition", -1476117762);
        setField(term1654, term1654.getClass(), "jsType", null);
        setField(term1654, term1654.getClass(), "parent", null);
        setField(term1652, term1652.getClass(), "next", term1654);
        setIntField(term1669, term1669.getClass(), "type", 0);
        setField(term1669, term1669.getClass(), "next", null);
        setField(term1669, term1669.getClass(), "first", null);
        setField(term1669, term1669.getClass(), "last", null);
        setField(term1669, term1669.getClass(), "propListHead", null);
        setIntField(term1669, term1669.getClass(), "sourcePosition", 0);
        setField(term1669, term1669.getClass(), "jsType", null);
        setField(term1669, term1669.getClass(), "parent", null);
        setField(term1652, term1652.getClass(), "first", term1669);
        setIntField(term1672, term1672.getClass(), "type", 0);
        setField(term1672, term1672.getClass(), "next", null);
        setField(term1672, term1672.getClass(), "first", null);
        setField(term1672, term1672.getClass(), "last", null);
        setField(term1672, term1672.getClass(), "propListHead", null);
        setIntField(term1672, term1672.getClass(), "sourcePosition", 0);
        setField(term1672, term1672.getClass(), "jsType", null);
        setField(term1672, term1672.getClass(), "parent", null);
        setField(term1652, term1652.getClass(), "last", term1672);
        setField(term1675, term1675.getClass(), "next", null);
        setIntField(term1675, term1675.getClass(), "type", 0);
        setIntField(term1675, term1675.getClass(), "intValue", 0);
        setField(term1675, term1675.getClass(), "objectValue", null);
        setField(term1652, term1652.getClass(), "propListHead", term1675);
        setIntField(term1652, term1652.getClass(), "sourcePosition", -341962980);
        setField(term1652, term1652.getClass(), "jsType", null);
        setField(term1652, term1652.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1652;
        try {
            callMethod(klass, "addList", argTypes, term1651, args);
            assertTrue(false);
        }
        catch (Error e) {
        }

    }

};


