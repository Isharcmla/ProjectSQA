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
import java.util.HashMap;
import java.lang.Object;
import java.lang.Boolean;

public class CodeGenerator_addList_71041459250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6770;
     Object term6783;
     Object term6810;

    public CodeGenerator_addList_71041459250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6771 = new HashMap();
        term6770 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term6770, term6770.getClass(), "ESCAPED_JS_STRINGS", term6771);
        setField(term6770, term6770.getClass(), "cc", null);
        setField(term6770, term6770.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term6770, term6770.getClass(), "preferSingleQuotes", false);
        setBooleanField(term6770, term6770.getClass(), "trustedStrings", false);
        term6783 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6785 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6787 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6789 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6791 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6794 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6798 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6800 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6805 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term6783, term6783.getClass(), "type", -1465035361);
        setIntField(term6785, term6785.getClass(), "type", 1090617576);
        setIntField(term6787, term6787.getClass(), "type", -1547384488);
        setIntField(term6789, term6789.getClass(), "type", 1442160736);
        setIntField(term6791, term6791.getClass(), "type", 1114000454);
        setField(term6791, term6791.getClass(), "next", null);
        setField(term6791, term6791.getClass(), "first", null);
        setField(term6791, term6791.getClass(), "last", null);
        setField(term6791, term6791.getClass(), "propListHead", null);
        setIntField(term6791, term6791.getClass(), "sourcePosition", 0);
        setField(term6791, term6791.getClass(), "jsType", null);
        setField(term6791, term6791.getClass(), "parent", null);
        setField(term6789, term6789.getClass(), "next", term6791);
        setIntField(term6794, term6794.getClass(), "type", -556405712);
        setField(term6794, term6794.getClass(), "next", null);
        setField(term6794, term6794.getClass(), "first", null);
        setField(term6794, term6794.getClass(), "last", term6791);
        setField(term6794, term6794.getClass(), "propListHead", null);
        setIntField(term6794, term6794.getClass(), "sourcePosition", 0);
        setField(term6794, term6794.getClass(), "jsType", null);
        setField(term6794, term6794.getClass(), "parent", null);
        setField(term6789, term6789.getClass(), "first", term6794);
        setField(term6789, term6789.getClass(), "last", term6787);
        setField(term6789, term6789.getClass(), "propListHead", null);
        setIntField(term6789, term6789.getClass(), "sourcePosition", 0);
        setField(term6789, term6789.getClass(), "jsType", null);
        setField(term6789, term6789.getClass(), "parent", null);
        setField(term6787, term6787.getClass(), "next", term6789);
        setField(term6787, term6787.getClass(), "first", term6791);
        setIntField(term6798, term6798.getClass(), "type", -1845499264);
        setIntField(term6800, term6800.getClass(), "type", -505439934);
        setField(term6800, term6800.getClass(), "next", null);
        setField(term6800, term6800.getClass(), "first", term6794);
        setField(term6800, term6800.getClass(), "last", term6789);
        setField(term6800, term6800.getClass(), "propListHead", null);
        setIntField(term6800, term6800.getClass(), "sourcePosition", 0);
        setField(term6800, term6800.getClass(), "jsType", null);
        setField(term6800, term6800.getClass(), "parent", null);
        setField(term6798, term6798.getClass(), "next", term6800);
        setField(term6798, term6798.getClass(), "first", term6785);
        setField(term6798, term6798.getClass(), "last", term6785);
        setField(term6798, term6798.getClass(), "propListHead", null);
        setIntField(term6798, term6798.getClass(), "sourcePosition", 0);
        setField(term6798, term6798.getClass(), "jsType", null);
        setField(term6798, term6798.getClass(), "parent", null);
        setField(term6787, term6787.getClass(), "last", term6798);
        setField(term6787, term6787.getClass(), "propListHead", null);
        setIntField(term6787, term6787.getClass(), "sourcePosition", 0);
        setField(term6787, term6787.getClass(), "jsType", null);
        setField(term6787, term6787.getClass(), "parent", null);
        setField(term6785, term6785.getClass(), "next", term6787);
        setIntField(term6805, term6805.getClass(), "type", -344842608);
        setField(term6805, term6805.getClass(), "next", term6798);
        setField(term6805, term6805.getClass(), "first", term6800);
        setField(term6805, term6805.getClass(), "last", term6783);
        setField(term6805, term6805.getClass(), "propListHead", null);
        setIntField(term6805, term6805.getClass(), "sourcePosition", 0);
        setField(term6805, term6805.getClass(), "jsType", null);
        setField(term6805, term6805.getClass(), "parent", null);
        setField(term6785, term6785.getClass(), "first", term6805);
        setField(term6785, term6785.getClass(), "last", term6805);
        setField(term6785, term6785.getClass(), "propListHead", null);
        setIntField(term6785, term6785.getClass(), "sourcePosition", 0);
        setField(term6785, term6785.getClass(), "jsType", null);
        setField(term6785, term6785.getClass(), "parent", null);
        setField(term6783, term6783.getClass(), "next", term6785);
        setField(term6783, term6783.getClass(), "first", term6789);
        setField(term6783, term6783.getClass(), "last", term6791);
        setField(term6783, term6783.getClass(), "propListHead", null);
        setIntField(term6783, term6783.getClass(), "sourcePosition", 0);
        setField(term6783, term6783.getClass(), "jsType", null);
        setField(term6783, term6783.getClass(), "parent", null);
        term6810 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term6783;
        args[1] = term6810;
        try {
            callMethod(klass, "addList", argTypes, term6770, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


