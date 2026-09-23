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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;
import java.lang.String;

public class CodeGenerator_add_135852843041 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4726;
     Object term4739;
     Object enum47;

    public CodeGenerator_add_135852843041() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4727 = new HashMap();
        term4726 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term4726, term4726.getClass(), "ESCAPED_JS_STRINGS", term4727);
        setField(term4726, term4726.getClass(), "cc", null);
        setField(term4726, term4726.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term4726, term4726.getClass(), "preferSingleQuotes", false);
        setBooleanField(term4726, term4726.getClass(), "trustedStrings", false);
        term4739 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4741 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4743 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4745 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4747 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4750 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4754 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4756 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term4761 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term4739, term4739.getClass(), "type", 1725571209);
        setIntField(term4741, term4741.getClass(), "type", -522618178);
        setIntField(term4743, term4743.getClass(), "type", 1134449235);
        setIntField(term4745, term4745.getClass(), "type", -883034806);
        setIntField(term4747, term4747.getClass(), "type", 1585847225);
        setField(term4747, term4747.getClass(), "next", null);
        setField(term4747, term4747.getClass(), "first", null);
        setField(term4747, term4747.getClass(), "last", null);
        setField(term4747, term4747.getClass(), "propListHead", null);
        setIntField(term4747, term4747.getClass(), "sourcePosition", 0);
        setField(term4747, term4747.getClass(), "jsType", null);
        setField(term4747, term4747.getClass(), "parent", null);
        setField(term4745, term4745.getClass(), "next", term4747);
        setIntField(term4750, term4750.getClass(), "type", 597278769);
        setField(term4750, term4750.getClass(), "next", null);
        setField(term4750, term4750.getClass(), "first", null);
        setField(term4750, term4750.getClass(), "last", term4747);
        setField(term4750, term4750.getClass(), "propListHead", null);
        setIntField(term4750, term4750.getClass(), "sourcePosition", 0);
        setField(term4750, term4750.getClass(), "jsType", null);
        setField(term4750, term4750.getClass(), "parent", null);
        setField(term4745, term4745.getClass(), "first", term4750);
        setField(term4745, term4745.getClass(), "last", term4743);
        setField(term4745, term4745.getClass(), "propListHead", null);
        setIntField(term4745, term4745.getClass(), "sourcePosition", 0);
        setField(term4745, term4745.getClass(), "jsType", null);
        setField(term4745, term4745.getClass(), "parent", null);
        setField(term4743, term4743.getClass(), "next", term4745);
        setField(term4743, term4743.getClass(), "first", term4747);
        setIntField(term4754, term4754.getClass(), "type", -1456670397);
        setIntField(term4756, term4756.getClass(), "type", 1622346318);
        setField(term4756, term4756.getClass(), "next", null);
        setField(term4756, term4756.getClass(), "first", term4750);
        setField(term4756, term4756.getClass(), "last", term4745);
        setField(term4756, term4756.getClass(), "propListHead", null);
        setIntField(term4756, term4756.getClass(), "sourcePosition", 0);
        setField(term4756, term4756.getClass(), "jsType", null);
        setField(term4756, term4756.getClass(), "parent", null);
        setField(term4754, term4754.getClass(), "next", term4756);
        setField(term4754, term4754.getClass(), "first", term4741);
        setField(term4754, term4754.getClass(), "last", term4741);
        setField(term4754, term4754.getClass(), "propListHead", null);
        setIntField(term4754, term4754.getClass(), "sourcePosition", 0);
        setField(term4754, term4754.getClass(), "jsType", null);
        setField(term4754, term4754.getClass(), "parent", null);
        setField(term4743, term4743.getClass(), "last", term4754);
        setField(term4743, term4743.getClass(), "propListHead", null);
        setIntField(term4743, term4743.getClass(), "sourcePosition", 0);
        setField(term4743, term4743.getClass(), "jsType", null);
        setField(term4743, term4743.getClass(), "parent", null);
        setField(term4741, term4741.getClass(), "next", term4743);
        setIntField(term4761, term4761.getClass(), "type", 1048535127);
        setField(term4761, term4761.getClass(), "next", term4754);
        setField(term4761, term4761.getClass(), "first", term4756);
        setField(term4761, term4761.getClass(), "last", term4739);
        setField(term4761, term4761.getClass(), "propListHead", null);
        setIntField(term4761, term4761.getClass(), "sourcePosition", 0);
        setField(term4761, term4761.getClass(), "jsType", null);
        setField(term4761, term4761.getClass(), "parent", null);
        setField(term4741, term4741.getClass(), "first", term4761);
        setField(term4741, term4741.getClass(), "last", term4761);
        setField(term4741, term4741.getClass(), "propListHead", null);
        setIntField(term4741, term4741.getClass(), "sourcePosition", 0);
        setField(term4741, term4741.getClass(), "jsType", null);
        setField(term4741, term4741.getClass(), "parent", null);
        setField(term4739, term4739.getClass(), "next", term4741);
        setField(term4739, term4739.getClass(), "first", term4745);
        setField(term4739, term4739.getClass(), "last", term4747);
        setField(term4739, term4739.getClass(), "propListHead", null);
        setIntField(term4739, term4739.getClass(), "sourcePosition", 0);
        setField(term4739, term4739.getClass(), "jsType", null);
        setField(term4739, term4739.getClass(), "parent", null);
        Class<? extends Object> term17634 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term17633 = ((Class) term17634).getDeclaredField((String) "BEFORE_DANGLING_ELSE");
        ((Field) term17633).setAccessible(true);
        enum47 = ((Field) term17633).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Object[] args = new Object[2];
        args[0] = term4739;
        args[1] = enum47;
        try {
            callMethod(klass, "add", argTypes, term4726, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


