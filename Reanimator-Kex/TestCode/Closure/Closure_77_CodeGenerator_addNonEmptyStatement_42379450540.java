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
import java.lang.String;
import java.lang.Boolean;

public class CodeGenerator_addNonEmptyStatement_42379450540 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term576;
     Object term577;
     Object enum9;
     Object term621;

    public CodeGenerator_addNonEmptyStatement_42379450540() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term576 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term576, term576.getClass(), "cc", null);
        setField(term576, term576.getClass(), "outputCharsetEncoder", null);
        term577 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term579 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term581 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term584 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term587 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term590 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term594 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term597 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term600 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term577, term577.getClass(), "type", 679763016);
        setIntField(term579, term579.getClass(), "type", -157887805);
        setIntField(term581, term581.getClass(), "type", 0);
        setField(term581, term581.getClass(), "next", null);
        setField(term581, term581.getClass(), "first", null);
        setField(term581, term581.getClass(), "last", null);
        setField(term581, term581.getClass(), "propListHead", null);
        setIntField(term581, term581.getClass(), "sourcePosition", 0);
        setField(term581, term581.getClass(), "jsType", null);
        setField(term581, term581.getClass(), "parent", null);
        setField(term579, term579.getClass(), "next", term581);
        setIntField(term584, term584.getClass(), "type", 0);
        setField(term584, term584.getClass(), "next", null);
        setField(term584, term584.getClass(), "first", null);
        setField(term584, term584.getClass(), "last", null);
        setField(term584, term584.getClass(), "propListHead", null);
        setIntField(term584, term584.getClass(), "sourcePosition", 0);
        setField(term584, term584.getClass(), "jsType", null);
        setField(term584, term584.getClass(), "parent", null);
        setField(term579, term579.getClass(), "first", term584);
        setIntField(term587, term587.getClass(), "type", 0);
        setField(term587, term587.getClass(), "next", null);
        setField(term587, term587.getClass(), "first", null);
        setField(term587, term587.getClass(), "last", null);
        setField(term587, term587.getClass(), "propListHead", null);
        setIntField(term587, term587.getClass(), "sourcePosition", 0);
        setField(term587, term587.getClass(), "jsType", null);
        setField(term587, term587.getClass(), "parent", null);
        setField(term579, term579.getClass(), "last", term587);
        setField(term590, term590.getClass(), "next", null);
        setIntField(term590, term590.getClass(), "type", 0);
        setIntField(term590, term590.getClass(), "intValue", 0);
        setField(term590, term590.getClass(), "objectValue", null);
        setField(term579, term579.getClass(), "propListHead", term590);
        setIntField(term579, term579.getClass(), "sourcePosition", -1016503459);
        setField(term579, term579.getClass(), "jsType", null);
        setField(term579, term579.getClass(), "parent", null);
        setField(term577, term577.getClass(), "next", term579);
        setIntField(term594, term594.getClass(), "type", 0);
        setField(term594, term594.getClass(), "next", null);
        setField(term594, term594.getClass(), "first", null);
        setField(term594, term594.getClass(), "last", null);
        setField(term594, term594.getClass(), "propListHead", null);
        setIntField(term594, term594.getClass(), "sourcePosition", 0);
        setField(term594, term594.getClass(), "jsType", null);
        setField(term594, term594.getClass(), "parent", null);
        setField(term577, term577.getClass(), "first", term594);
        setIntField(term597, term597.getClass(), "type", 0);
        setField(term597, term597.getClass(), "next", null);
        setField(term597, term597.getClass(), "first", null);
        setField(term597, term597.getClass(), "last", null);
        setField(term597, term597.getClass(), "propListHead", null);
        setIntField(term597, term597.getClass(), "sourcePosition", 0);
        setField(term597, term597.getClass(), "jsType", null);
        setField(term597, term597.getClass(), "parent", null);
        setField(term577, term577.getClass(), "last", term597);
        setField(term600, term600.getClass(), "next", null);
        setIntField(term600, term600.getClass(), "type", 0);
        setIntField(term600, term600.getClass(), "intValue", 0);
        setField(term600, term600.getClass(), "objectValue", null);
        setField(term577, term577.getClass(), "propListHead", term600);
        setIntField(term577, term577.getClass(), "sourcePosition", -1968847291);
        setField(term577, term577.getClass(), "jsType", null);
        setField(term577, term577.getClass(), "parent", null);
        Class<? extends Object> term5355 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term5354 = ((Class) term5355).getDeclaredField((String) "START_OF_EXPR");
        ((Field) term5354).setAccessible(true);
        enum9 = ((Field) term5354).get((Object) null);
        term621 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term577;
        args[1] = enum9;
        args[2] = term621;
        try {
            callMethod(klass, "addNonEmptyStatement", argTypes, term576, args);
            assertTrue(false);
        }
        catch (Error e) {
        }

    }

};


