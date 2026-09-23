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

public class CodeGenerator_addList_69461977651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1753;
     Object term1754;
     Object term1781;
     Object enum12;

    public CodeGenerator_addList_69461977651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1753 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term1753, term1753.getClass(), "cc", null);
        setField(term1753, term1753.getClass(), "outputCharsetEncoder", null);
        term1754 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1756 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1758 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1761 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1764 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1767 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1771 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1774 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1777 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1754, term1754.getClass(), "type", -375014958);
        setIntField(term1756, term1756.getClass(), "type", -2015854073);
        setIntField(term1758, term1758.getClass(), "type", 0);
        setField(term1758, term1758.getClass(), "next", null);
        setField(term1758, term1758.getClass(), "first", null);
        setField(term1758, term1758.getClass(), "last", null);
        setField(term1758, term1758.getClass(), "propListHead", null);
        setIntField(term1758, term1758.getClass(), "sourcePosition", 0);
        setField(term1758, term1758.getClass(), "jsType", null);
        setField(term1758, term1758.getClass(), "parent", null);
        setField(term1756, term1756.getClass(), "next", term1758);
        setIntField(term1761, term1761.getClass(), "type", 0);
        setField(term1761, term1761.getClass(), "next", null);
        setField(term1761, term1761.getClass(), "first", null);
        setField(term1761, term1761.getClass(), "last", null);
        setField(term1761, term1761.getClass(), "propListHead", null);
        setIntField(term1761, term1761.getClass(), "sourcePosition", 0);
        setField(term1761, term1761.getClass(), "jsType", null);
        setField(term1761, term1761.getClass(), "parent", null);
        setField(term1756, term1756.getClass(), "first", term1761);
        setIntField(term1764, term1764.getClass(), "type", 0);
        setField(term1764, term1764.getClass(), "next", null);
        setField(term1764, term1764.getClass(), "first", null);
        setField(term1764, term1764.getClass(), "last", null);
        setField(term1764, term1764.getClass(), "propListHead", null);
        setIntField(term1764, term1764.getClass(), "sourcePosition", 0);
        setField(term1764, term1764.getClass(), "jsType", null);
        setField(term1764, term1764.getClass(), "parent", null);
        setField(term1756, term1756.getClass(), "last", term1764);
        setField(term1767, term1767.getClass(), "next", null);
        setIntField(term1767, term1767.getClass(), "type", 0);
        setIntField(term1767, term1767.getClass(), "intValue", 0);
        setField(term1767, term1767.getClass(), "objectValue", null);
        setField(term1756, term1756.getClass(), "propListHead", term1767);
        setIntField(term1756, term1756.getClass(), "sourcePosition", -343325701);
        setField(term1756, term1756.getClass(), "jsType", null);
        setField(term1756, term1756.getClass(), "parent", null);
        setField(term1754, term1754.getClass(), "next", term1756);
        setIntField(term1771, term1771.getClass(), "type", 0);
        setField(term1771, term1771.getClass(), "next", null);
        setField(term1771, term1771.getClass(), "first", null);
        setField(term1771, term1771.getClass(), "last", null);
        setField(term1771, term1771.getClass(), "propListHead", null);
        setIntField(term1771, term1771.getClass(), "sourcePosition", 0);
        setField(term1771, term1771.getClass(), "jsType", null);
        setField(term1771, term1771.getClass(), "parent", null);
        setField(term1754, term1754.getClass(), "first", term1771);
        setIntField(term1774, term1774.getClass(), "type", 0);
        setField(term1774, term1774.getClass(), "next", null);
        setField(term1774, term1774.getClass(), "first", null);
        setField(term1774, term1774.getClass(), "last", null);
        setField(term1774, term1774.getClass(), "propListHead", null);
        setIntField(term1774, term1774.getClass(), "sourcePosition", 0);
        setField(term1774, term1774.getClass(), "jsType", null);
        setField(term1774, term1774.getClass(), "parent", null);
        setField(term1754, term1754.getClass(), "last", term1774);
        setField(term1777, term1777.getClass(), "next", null);
        setIntField(term1777, term1777.getClass(), "type", 0);
        setIntField(term1777, term1777.getClass(), "intValue", 0);
        setField(term1777, term1777.getClass(), "objectValue", null);
        setField(term1754, term1754.getClass(), "propListHead", term1777);
        setIntField(term1754, term1754.getClass(), "sourcePosition", 107945604);
        setField(term1754, term1754.getClass(), "jsType", null);
        setField(term1754, term1754.getClass(), "parent", null);
        term1781 = new Boolean(false);
        Class<? extends Object> term8628 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term8627 = ((Class) term8628).getDeclaredField((String) "PRESERVE_BLOCK");
        ((Field) term8627).setAccessible(true);
        enum12 = ((Field) term8627).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Object[] args = new Object[3];
        args[0] = term1754;
        args[1] = term1781;
        args[2] = enum12;
        try {
            callMethod(klass, "addList", argTypes, term1753, args);
            assertTrue(false);
        }
        catch (Error e) {
        }

    }

};


