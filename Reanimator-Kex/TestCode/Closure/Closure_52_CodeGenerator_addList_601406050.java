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

public class CodeGenerator_addList_601406050 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1757;
     Object term1768;

    public CodeGenerator_addList_601406050() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1758 = new HashMap();
        term1757 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term1757, term1757.getClass(), "ESCAPED_JS_STRINGS", term1758);
        setField(term1757, term1757.getClass(), "cc", null);
        setField(term1757, term1757.getClass(), "outputCharsetEncoder", null);
        term1768 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1770 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1772 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1775 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1778 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1782 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1785 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1768, term1768.getClass(), "type", -1547384488);
        setIntField(term1770, term1770.getClass(), "type", -1772434990);
        setIntField(term1772, term1772.getClass(), "type", 0);
        setField(term1772, term1772.getClass(), "next", null);
        setField(term1772, term1772.getClass(), "first", null);
        setField(term1772, term1772.getClass(), "last", null);
        setField(term1772, term1772.getClass(), "propListHead", null);
        setIntField(term1772, term1772.getClass(), "sourcePosition", 0);
        setField(term1772, term1772.getClass(), "jsType", null);
        setField(term1772, term1772.getClass(), "parent", null);
        setField(term1770, term1770.getClass(), "next", term1772);
        setIntField(term1775, term1775.getClass(), "type", 0);
        setField(term1775, term1775.getClass(), "next", null);
        setField(term1775, term1775.getClass(), "first", null);
        setField(term1775, term1775.getClass(), "last", null);
        setField(term1775, term1775.getClass(), "propListHead", null);
        setIntField(term1775, term1775.getClass(), "sourcePosition", 0);
        setField(term1775, term1775.getClass(), "jsType", null);
        setField(term1775, term1775.getClass(), "parent", null);
        setField(term1770, term1770.getClass(), "first", term1775);
        setIntField(term1778, term1778.getClass(), "type", 0);
        setField(term1778, term1778.getClass(), "next", null);
        setField(term1778, term1778.getClass(), "first", null);
        setField(term1778, term1778.getClass(), "last", null);
        setField(term1778, term1778.getClass(), "propListHead", null);
        setIntField(term1778, term1778.getClass(), "sourcePosition", 0);
        setField(term1778, term1778.getClass(), "jsType", null);
        setField(term1778, term1778.getClass(), "parent", null);
        setField(term1770, term1770.getClass(), "last", term1778);
        setField(term1770, term1770.getClass(), "propListHead", null);
        setIntField(term1770, term1770.getClass(), "sourcePosition", 0);
        setField(term1770, term1770.getClass(), "jsType", null);
        setField(term1770, term1770.getClass(), "parent", null);
        setField(term1768, term1768.getClass(), "next", term1770);
        setIntField(term1782, term1782.getClass(), "type", 0);
        setField(term1782, term1782.getClass(), "next", null);
        setField(term1782, term1782.getClass(), "first", null);
        setField(term1782, term1782.getClass(), "last", null);
        setField(term1782, term1782.getClass(), "propListHead", null);
        setIntField(term1782, term1782.getClass(), "sourcePosition", 0);
        setField(term1782, term1782.getClass(), "jsType", null);
        setField(term1782, term1782.getClass(), "parent", null);
        setField(term1768, term1768.getClass(), "first", term1782);
        setIntField(term1785, term1785.getClass(), "type", 0);
        setField(term1785, term1785.getClass(), "next", null);
        setField(term1785, term1785.getClass(), "first", null);
        setField(term1785, term1785.getClass(), "last", null);
        setField(term1785, term1785.getClass(), "propListHead", null);
        setIntField(term1785, term1785.getClass(), "sourcePosition", 0);
        setField(term1785, term1785.getClass(), "jsType", null);
        setField(term1785, term1785.getClass(), "parent", null);
        setField(term1768, term1768.getClass(), "last", term1785);
        setField(term1768, term1768.getClass(), "propListHead", null);
        setIntField(term1768, term1768.getClass(), "sourcePosition", 0);
        setField(term1768, term1768.getClass(), "jsType", null);
        setField(term1768, term1768.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1768;
        try {
            callMethod(klass, "addList", argTypes, term1757, args);
            assertTrue(false);
        }
        catch (Error e) {
        }

    }

};


