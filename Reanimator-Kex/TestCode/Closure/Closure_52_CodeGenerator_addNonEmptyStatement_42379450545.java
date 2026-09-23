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
     Object term662;
     Object term673;
     Object enum9;
     Object term711;

    public CodeGenerator_addNonEmptyStatement_42379450545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term663 = new HashMap();
        term662 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term662, term662.getClass(), "ESCAPED_JS_STRINGS", term663);
        setField(term662, term662.getClass(), "cc", null);
        setField(term662, term662.getClass(), "outputCharsetEncoder", null);
        term673 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term675 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term677 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term680 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term683 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term687 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term690 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term673, term673.getClass(), "type", -226514366);
        setIntField(term675, term675.getClass(), "type", -469968304);
        setIntField(term677, term677.getClass(), "type", 0);
        setField(term677, term677.getClass(), "next", null);
        setField(term677, term677.getClass(), "first", null);
        setField(term677, term677.getClass(), "last", null);
        setField(term677, term677.getClass(), "propListHead", null);
        setIntField(term677, term677.getClass(), "sourcePosition", 0);
        setField(term677, term677.getClass(), "jsType", null);
        setField(term677, term677.getClass(), "parent", null);
        setField(term675, term675.getClass(), "next", term677);
        setIntField(term680, term680.getClass(), "type", 0);
        setField(term680, term680.getClass(), "next", null);
        setField(term680, term680.getClass(), "first", null);
        setField(term680, term680.getClass(), "last", null);
        setField(term680, term680.getClass(), "propListHead", null);
        setIntField(term680, term680.getClass(), "sourcePosition", 0);
        setField(term680, term680.getClass(), "jsType", null);
        setField(term680, term680.getClass(), "parent", null);
        setField(term675, term675.getClass(), "first", term680);
        setIntField(term683, term683.getClass(), "type", 0);
        setField(term683, term683.getClass(), "next", null);
        setField(term683, term683.getClass(), "first", null);
        setField(term683, term683.getClass(), "last", null);
        setField(term683, term683.getClass(), "propListHead", null);
        setIntField(term683, term683.getClass(), "sourcePosition", 0);
        setField(term683, term683.getClass(), "jsType", null);
        setField(term683, term683.getClass(), "parent", null);
        setField(term675, term675.getClass(), "last", term683);
        setField(term675, term675.getClass(), "propListHead", null);
        setIntField(term675, term675.getClass(), "sourcePosition", 0);
        setField(term675, term675.getClass(), "jsType", null);
        setField(term675, term675.getClass(), "parent", null);
        setField(term673, term673.getClass(), "next", term675);
        setIntField(term687, term687.getClass(), "type", 0);
        setField(term687, term687.getClass(), "next", null);
        setField(term687, term687.getClass(), "first", null);
        setField(term687, term687.getClass(), "last", null);
        setField(term687, term687.getClass(), "propListHead", null);
        setIntField(term687, term687.getClass(), "sourcePosition", 0);
        setField(term687, term687.getClass(), "jsType", null);
        setField(term687, term687.getClass(), "parent", null);
        setField(term673, term673.getClass(), "first", term687);
        setIntField(term690, term690.getClass(), "type", 0);
        setField(term690, term690.getClass(), "next", null);
        setField(term690, term690.getClass(), "first", null);
        setField(term690, term690.getClass(), "last", null);
        setField(term690, term690.getClass(), "propListHead", null);
        setIntField(term690, term690.getClass(), "sourcePosition", 0);
        setField(term690, term690.getClass(), "jsType", null);
        setField(term690, term690.getClass(), "parent", null);
        setField(term673, term673.getClass(), "last", term690);
        setField(term673, term673.getClass(), "propListHead", null);
        setIntField(term673, term673.getClass(), "sourcePosition", 0);
        setField(term673, term673.getClass(), "jsType", null);
        setField(term673, term673.getClass(), "parent", null);
        Class<? extends Object> term5557 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term5556 = ((Class) term5557).getDeclaredField((String) "START_OF_EXPR");
        ((Field) term5556).setAccessible(true);
        enum9 = ((Field) term5556).get((Object) null);
        term711 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term673;
        args[1] = enum9;
        args[2] = term711;
        try {
            callMethod(klass, "addNonEmptyStatement", argTypes, term662, args);
            assertTrue(false);
        }
        catch (Error e) {
        }

    }

};


