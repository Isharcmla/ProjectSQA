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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class PeepholeSubstituteAlternateSyntax_tryMinimizeStringArrayLiteral_546530939108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13636;
     Object term13706;
     Object term14324;
     Object term14325;
     Object term14311;

    public PeepholeSubstituteAlternateSyntax_tryMinimizeStringArrayLiteral_546530939108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13636 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term13636, term13636.getClass(), "late", true);
        setIntField(term13636, term13636.getClass(), "STRING_SPLIT_OVERHEAD", 4);
        term13706 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13776 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13846 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term13846, term13846.getClass(), "next", null);
        setField(term13776, term13776.getClass(), "next", term13846);
        setField(term13706, term13706.getClass(), "first", term13776);
        term14324 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term14324, term14324.getClass(), "late", true);
        setIntField(term14324, term14324.getClass(), "STRING_SPLIT_OVERHEAD", 4);
        setField(term14324, term14324.getClass(), "compiler", null);
        term14325 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14326 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14327 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14325, term14325.getClass(), "type", 0);
        setField(term14325, term14325.getClass(), "next", null);
        setIntField(term14326, term14326.getClass(), "type", 0);
        setIntField(term14327, term14327.getClass(), "type", 0);
        setField(term14327, term14327.getClass(), "next", null);
        setField(term14327, term14327.getClass(), "first", null);
        setField(term14327, term14327.getClass(), "last", null);
        setField(term14327, term14327.getClass(), "propListHead", null);
        setIntField(term14327, term14327.getClass(), "sourcePosition", 0);
        setField(term14327, term14327.getClass(), "jsType", null);
        setField(term14327, term14327.getClass(), "parent", null);
        setField(term14326, term14326.getClass(), "next", term14327);
        setField(term14326, term14326.getClass(), "first", null);
        setField(term14326, term14326.getClass(), "last", null);
        setField(term14326, term14326.getClass(), "propListHead", null);
        setIntField(term14326, term14326.getClass(), "sourcePosition", 0);
        setField(term14326, term14326.getClass(), "jsType", null);
        setField(term14326, term14326.getClass(), "parent", null);
        setField(term14325, term14325.getClass(), "first", term14326);
        setField(term14325, term14325.getClass(), "last", null);
        setField(term14325, term14325.getClass(), "propListHead", null);
        setIntField(term14325, term14325.getClass(), "sourcePosition", 0);
        setField(term14325, term14325.getClass(), "jsType", null);
        setField(term14325, term14325.getClass(), "parent", null);
        term14311 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14313 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14315 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term14311, term14311.getClass(), "type", 0);
        setField(term14311, term14311.getClass(), "next", null);
        setIntField(term14313, term14313.getClass(), "type", 0);
        setIntField(term14315, term14315.getClass(), "type", 0);
        setField(term14315, term14315.getClass(), "next", null);
        setField(term14315, term14315.getClass(), "first", null);
        setField(term14315, term14315.getClass(), "last", null);
        setField(term14315, term14315.getClass(), "propListHead", null);
        setIntField(term14315, term14315.getClass(), "sourcePosition", 0);
        setField(term14315, term14315.getClass(), "jsType", null);
        setField(term14315, term14315.getClass(), "parent", null);
        setField(term14313, term14313.getClass(), "next", term14315);
        setField(term14313, term14313.getClass(), "first", null);
        setField(term14313, term14313.getClass(), "last", null);
        setField(term14313, term14313.getClass(), "propListHead", null);
        setIntField(term14313, term14313.getClass(), "sourcePosition", 0);
        setField(term14313, term14313.getClass(), "jsType", null);
        setField(term14313, term14313.getClass(), "parent", null);
        setField(term14311, term14311.getClass(), "first", term14313);
        setField(term14311, term14311.getClass(), "last", null);
        setField(term14311, term14311.getClass(), "propListHead", null);
        setIntField(term14311, term14311.getClass(), "sourcePosition", 0);
        setField(term14311, term14311.getClass(), "jsType", null);
        setField(term14311, term14311.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term13706;
        Object retValue = callMethod(klass, "tryMinimizeStringArrayLiteral", argTypes, term13636, args);
        assertTrue(recursiveEquals(term13636, term14324));
        assertTrue(recursiveEquals(term13706, term14325));
        assertTrue(recursiveEquals(retValue, term14311));
    }

};


