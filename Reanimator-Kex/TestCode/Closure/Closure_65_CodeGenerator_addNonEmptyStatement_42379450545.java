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
import java.util.HashMap;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;

public class CodeGenerator_addNonEmptyStatement_42379450545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term680;
     Object term691;
     Object enum9;
     Object term735;

    public CodeGenerator_addNonEmptyStatement_42379450545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term681 = new HashMap();
        term680 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term680, term680.getClass(), "ESCAPED_JS_STRINGS", term681);
        setField(term680, term680.getClass(), "cc", null);
        setField(term680, term680.getClass(), "outputCharsetEncoder", null);
        term691 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term693 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term695 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term698 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term701 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term704 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term708 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term711 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term714 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term691, term691.getClass(), "type", 679763016);
        setIntField(term693, term693.getClass(), "type", -157887805);
        setIntField(term695, term695.getClass(), "type", 0);
        setField(term695, term695.getClass(), "next", null);
        setField(term695, term695.getClass(), "first", null);
        setField(term695, term695.getClass(), "last", null);
        setField(term695, term695.getClass(), "propListHead", null);
        setIntField(term695, term695.getClass(), "sourcePosition", 0);
        setField(term695, term695.getClass(), "jsType", null);
        setField(term695, term695.getClass(), "parent", null);
        setField(term693, term693.getClass(), "next", term695);
        setIntField(term698, term698.getClass(), "type", 0);
        setField(term698, term698.getClass(), "next", null);
        setField(term698, term698.getClass(), "first", null);
        setField(term698, term698.getClass(), "last", null);
        setField(term698, term698.getClass(), "propListHead", null);
        setIntField(term698, term698.getClass(), "sourcePosition", 0);
        setField(term698, term698.getClass(), "jsType", null);
        setField(term698, term698.getClass(), "parent", null);
        setField(term693, term693.getClass(), "first", term698);
        setIntField(term701, term701.getClass(), "type", 0);
        setField(term701, term701.getClass(), "next", null);
        setField(term701, term701.getClass(), "first", null);
        setField(term701, term701.getClass(), "last", null);
        setField(term701, term701.getClass(), "propListHead", null);
        setIntField(term701, term701.getClass(), "sourcePosition", 0);
        setField(term701, term701.getClass(), "jsType", null);
        setField(term701, term701.getClass(), "parent", null);
        setField(term693, term693.getClass(), "last", term701);
        setField(term704, term704.getClass(), "next", null);
        setIntField(term704, term704.getClass(), "type", 0);
        setIntField(term704, term704.getClass(), "intValue", 0);
        setField(term704, term704.getClass(), "objectValue", null);
        setField(term693, term693.getClass(), "propListHead", term704);
        setIntField(term693, term693.getClass(), "sourcePosition", -1016503459);
        setField(term693, term693.getClass(), "jsType", null);
        setField(term693, term693.getClass(), "parent", null);
        setField(term691, term691.getClass(), "next", term693);
        setIntField(term708, term708.getClass(), "type", 0);
        setField(term708, term708.getClass(), "next", null);
        setField(term708, term708.getClass(), "first", null);
        setField(term708, term708.getClass(), "last", null);
        setField(term708, term708.getClass(), "propListHead", null);
        setIntField(term708, term708.getClass(), "sourcePosition", 0);
        setField(term708, term708.getClass(), "jsType", null);
        setField(term708, term708.getClass(), "parent", null);
        setField(term691, term691.getClass(), "first", term708);
        setIntField(term711, term711.getClass(), "type", 0);
        setField(term711, term711.getClass(), "next", null);
        setField(term711, term711.getClass(), "first", null);
        setField(term711, term711.getClass(), "last", null);
        setField(term711, term711.getClass(), "propListHead", null);
        setIntField(term711, term711.getClass(), "sourcePosition", 0);
        setField(term711, term711.getClass(), "jsType", null);
        setField(term711, term711.getClass(), "parent", null);
        setField(term691, term691.getClass(), "last", term711);
        setField(term714, term714.getClass(), "next", null);
        setIntField(term714, term714.getClass(), "type", 0);
        setIntField(term714, term714.getClass(), "intValue", 0);
        setField(term714, term714.getClass(), "objectValue", null);
        setField(term691, term691.getClass(), "propListHead", term714);
        setIntField(term691, term691.getClass(), "sourcePosition", -1968847291);
        setField(term691, term691.getClass(), "jsType", null);
        setField(term691, term691.getClass(), "parent", null);
        Class<? extends Object> term5710 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term5709 = ((Class) term5710).getDeclaredField((String) "START_OF_EXPR");
        ((Field) term5709).setAccessible(true);
        enum9 = ((Field) term5709).get((Object) null);
        term735 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term691;
        args[1] = enum9;
        args[2] = term735;
        try {
            callMethod(klass, "addNonEmptyStatement", argTypes, term680, args);
            assertTrue(false);
        }
        catch (Error e) {
        }

    }

};


