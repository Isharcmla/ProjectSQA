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

public class CodeGenerator_addList_71041459250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1723;
     Object term1724;
     Object term1751;

    public CodeGenerator_addList_71041459250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1723 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term1723, term1723.getClass(), "cc", null);
        setField(term1723, term1723.getClass(), "outputCharsetEncoder", null);
        term1724 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1726 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1728 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1731 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1734 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1737 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1741 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1744 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1747 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1724, term1724.getClass(), "type", 890669485);
        setIntField(term1726, term1726.getClass(), "type", 906181092);
        setIntField(term1728, term1728.getClass(), "type", 0);
        setField(term1728, term1728.getClass(), "next", null);
        setField(term1728, term1728.getClass(), "first", null);
        setField(term1728, term1728.getClass(), "last", null);
        setField(term1728, term1728.getClass(), "propListHead", null);
        setIntField(term1728, term1728.getClass(), "sourcePosition", 0);
        setField(term1728, term1728.getClass(), "jsType", null);
        setField(term1728, term1728.getClass(), "parent", null);
        setField(term1726, term1726.getClass(), "next", term1728);
        setIntField(term1731, term1731.getClass(), "type", 0);
        setField(term1731, term1731.getClass(), "next", null);
        setField(term1731, term1731.getClass(), "first", null);
        setField(term1731, term1731.getClass(), "last", null);
        setField(term1731, term1731.getClass(), "propListHead", null);
        setIntField(term1731, term1731.getClass(), "sourcePosition", 0);
        setField(term1731, term1731.getClass(), "jsType", null);
        setField(term1731, term1731.getClass(), "parent", null);
        setField(term1726, term1726.getClass(), "first", term1731);
        setIntField(term1734, term1734.getClass(), "type", 0);
        setField(term1734, term1734.getClass(), "next", null);
        setField(term1734, term1734.getClass(), "first", null);
        setField(term1734, term1734.getClass(), "last", null);
        setField(term1734, term1734.getClass(), "propListHead", null);
        setIntField(term1734, term1734.getClass(), "sourcePosition", 0);
        setField(term1734, term1734.getClass(), "jsType", null);
        setField(term1734, term1734.getClass(), "parent", null);
        setField(term1726, term1726.getClass(), "last", term1734);
        setField(term1737, term1737.getClass(), "next", null);
        setIntField(term1737, term1737.getClass(), "type", 0);
        setIntField(term1737, term1737.getClass(), "intValue", 0);
        setField(term1737, term1737.getClass(), "objectValue", null);
        setField(term1726, term1726.getClass(), "propListHead", term1737);
        setIntField(term1726, term1726.getClass(), "sourcePosition", 1072005683);
        setField(term1726, term1726.getClass(), "jsType", null);
        setField(term1726, term1726.getClass(), "parent", null);
        setField(term1724, term1724.getClass(), "next", term1726);
        setIntField(term1741, term1741.getClass(), "type", 0);
        setField(term1741, term1741.getClass(), "next", null);
        setField(term1741, term1741.getClass(), "first", null);
        setField(term1741, term1741.getClass(), "last", null);
        setField(term1741, term1741.getClass(), "propListHead", null);
        setIntField(term1741, term1741.getClass(), "sourcePosition", 0);
        setField(term1741, term1741.getClass(), "jsType", null);
        setField(term1741, term1741.getClass(), "parent", null);
        setField(term1724, term1724.getClass(), "first", term1741);
        setIntField(term1744, term1744.getClass(), "type", 0);
        setField(term1744, term1744.getClass(), "next", null);
        setField(term1744, term1744.getClass(), "first", null);
        setField(term1744, term1744.getClass(), "last", null);
        setField(term1744, term1744.getClass(), "propListHead", null);
        setIntField(term1744, term1744.getClass(), "sourcePosition", 0);
        setField(term1744, term1744.getClass(), "jsType", null);
        setField(term1744, term1744.getClass(), "parent", null);
        setField(term1724, term1724.getClass(), "last", term1744);
        setField(term1747, term1747.getClass(), "next", null);
        setIntField(term1747, term1747.getClass(), "type", 0);
        setIntField(term1747, term1747.getClass(), "intValue", 0);
        setField(term1747, term1747.getClass(), "objectValue", null);
        setField(term1724, term1724.getClass(), "propListHead", term1747);
        setIntField(term1724, term1724.getClass(), "sourcePosition", 1861318859);
        setField(term1724, term1724.getClass(), "jsType", null);
        setField(term1724, term1724.getClass(), "parent", null);
        term1751 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term1724;
        args[1] = term1751;
        try {
            callMethod(klass, "addList", argTypes, term1723, args);
            assertTrue(false);
        }
        catch (Error e) {
        }

    }

};


