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

public class CodeGenerator_addList_69461977643 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1680;
     Object term1681;
     Object term1708;
     Object enum12;

    public CodeGenerator_addList_69461977643() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1680 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term1680, term1680.getClass(), "cc", null);
        setField(term1680, term1680.getClass(), "outputCharsetEncoder", null);
        term1681 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1683 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1685 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1688 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1691 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1694 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1698 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1701 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1704 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1681, term1681.getClass(), "type", 890669485);
        setIntField(term1683, term1683.getClass(), "type", 906181092);
        setIntField(term1685, term1685.getClass(), "type", 0);
        setField(term1685, term1685.getClass(), "next", null);
        setField(term1685, term1685.getClass(), "first", null);
        setField(term1685, term1685.getClass(), "last", null);
        setField(term1685, term1685.getClass(), "propListHead", null);
        setIntField(term1685, term1685.getClass(), "sourcePosition", 0);
        setField(term1685, term1685.getClass(), "jsType", null);
        setField(term1685, term1685.getClass(), "parent", null);
        setField(term1683, term1683.getClass(), "next", term1685);
        setIntField(term1688, term1688.getClass(), "type", 0);
        setField(term1688, term1688.getClass(), "next", null);
        setField(term1688, term1688.getClass(), "first", null);
        setField(term1688, term1688.getClass(), "last", null);
        setField(term1688, term1688.getClass(), "propListHead", null);
        setIntField(term1688, term1688.getClass(), "sourcePosition", 0);
        setField(term1688, term1688.getClass(), "jsType", null);
        setField(term1688, term1688.getClass(), "parent", null);
        setField(term1683, term1683.getClass(), "first", term1688);
        setIntField(term1691, term1691.getClass(), "type", 0);
        setField(term1691, term1691.getClass(), "next", null);
        setField(term1691, term1691.getClass(), "first", null);
        setField(term1691, term1691.getClass(), "last", null);
        setField(term1691, term1691.getClass(), "propListHead", null);
        setIntField(term1691, term1691.getClass(), "sourcePosition", 0);
        setField(term1691, term1691.getClass(), "jsType", null);
        setField(term1691, term1691.getClass(), "parent", null);
        setField(term1683, term1683.getClass(), "last", term1691);
        setField(term1694, term1694.getClass(), "next", null);
        setIntField(term1694, term1694.getClass(), "type", 0);
        setIntField(term1694, term1694.getClass(), "intValue", 0);
        setField(term1694, term1694.getClass(), "objectValue", null);
        setField(term1683, term1683.getClass(), "propListHead", term1694);
        setIntField(term1683, term1683.getClass(), "sourcePosition", 1072005683);
        setField(term1683, term1683.getClass(), "jsType", null);
        setField(term1683, term1683.getClass(), "parent", null);
        setField(term1681, term1681.getClass(), "next", term1683);
        setIntField(term1698, term1698.getClass(), "type", 0);
        setField(term1698, term1698.getClass(), "next", null);
        setField(term1698, term1698.getClass(), "first", null);
        setField(term1698, term1698.getClass(), "last", null);
        setField(term1698, term1698.getClass(), "propListHead", null);
        setIntField(term1698, term1698.getClass(), "sourcePosition", 0);
        setField(term1698, term1698.getClass(), "jsType", null);
        setField(term1698, term1698.getClass(), "parent", null);
        setField(term1681, term1681.getClass(), "first", term1698);
        setIntField(term1701, term1701.getClass(), "type", 0);
        setField(term1701, term1701.getClass(), "next", null);
        setField(term1701, term1701.getClass(), "first", null);
        setField(term1701, term1701.getClass(), "last", null);
        setField(term1701, term1701.getClass(), "propListHead", null);
        setIntField(term1701, term1701.getClass(), "sourcePosition", 0);
        setField(term1701, term1701.getClass(), "jsType", null);
        setField(term1701, term1701.getClass(), "parent", null);
        setField(term1681, term1681.getClass(), "last", term1701);
        setField(term1704, term1704.getClass(), "next", null);
        setIntField(term1704, term1704.getClass(), "type", 0);
        setIntField(term1704, term1704.getClass(), "intValue", 0);
        setField(term1704, term1704.getClass(), "objectValue", null);
        setField(term1681, term1681.getClass(), "propListHead", term1704);
        setIntField(term1681, term1681.getClass(), "sourcePosition", 1861318859);
        setField(term1681, term1681.getClass(), "jsType", null);
        setField(term1681, term1681.getClass(), "parent", null);
        term1708 = new Boolean(false);
        Class<? extends Object> term8226 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term8225 = ((Class) term8226).getDeclaredField((String) "PRESERVE_BLOCK");
        ((Field) term8225).setAccessible(true);
        enum12 = ((Field) term8225).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Object[] args = new Object[3];
        args[0] = term1681;
        args[1] = term1708;
        args[2] = enum12;
        try {
            callMethod(klass, "addList", argTypes, term1680, args);
            assertTrue(false);
        }
        catch (Error e) {
        }

    }

};


