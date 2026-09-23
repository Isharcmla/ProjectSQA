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

public class CodeGenerator_isOneExactlyFunctionOrDo_211412008712 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1713;
     Object term1724;

    public CodeGenerator_isOneExactlyFunctionOrDo_211412008712() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1714 = new HashMap();
        term1713 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term1713, term1713.getClass(), "ESCAPED_JS_STRINGS", term1714);
        setField(term1713, term1713.getClass(), "cc", null);
        setField(term1713, term1713.getClass(), "outputCharsetEncoder", null);
        term1724 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1726 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1728 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1730 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1732 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1735 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1739 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1741 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1746 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1724, term1724.getClass(), "type", 2055867847);
        setIntField(term1726, term1726.getClass(), "type", -1048298087);
        setIntField(term1728, term1728.getClass(), "type", 292681826);
        setIntField(term1730, term1730.getClass(), "type", 458147407);
        setIntField(term1732, term1732.getClass(), "type", -184153539);
        setField(term1732, term1732.getClass(), "next", null);
        setField(term1732, term1732.getClass(), "first", null);
        setField(term1732, term1732.getClass(), "last", null);
        setField(term1732, term1732.getClass(), "propListHead", null);
        setIntField(term1732, term1732.getClass(), "sourcePosition", 0);
        setField(term1732, term1732.getClass(), "jsType", null);
        setField(term1732, term1732.getClass(), "parent", null);
        setField(term1730, term1730.getClass(), "next", term1732);
        setIntField(term1735, term1735.getClass(), "type", 493620644);
        setField(term1735, term1735.getClass(), "next", null);
        setField(term1735, term1735.getClass(), "first", null);
        setField(term1735, term1735.getClass(), "last", term1732);
        setField(term1735, term1735.getClass(), "propListHead", null);
        setIntField(term1735, term1735.getClass(), "sourcePosition", 0);
        setField(term1735, term1735.getClass(), "jsType", null);
        setField(term1735, term1735.getClass(), "parent", null);
        setField(term1730, term1730.getClass(), "first", term1735);
        setField(term1730, term1730.getClass(), "last", term1728);
        setField(term1730, term1730.getClass(), "propListHead", null);
        setIntField(term1730, term1730.getClass(), "sourcePosition", 0);
        setField(term1730, term1730.getClass(), "jsType", null);
        setField(term1730, term1730.getClass(), "parent", null);
        setField(term1728, term1728.getClass(), "next", term1730);
        setField(term1728, term1728.getClass(), "first", term1732);
        setIntField(term1739, term1739.getClass(), "type", 1596070772);
        setIntField(term1741, term1741.getClass(), "type", 97029295);
        setField(term1741, term1741.getClass(), "next", null);
        setField(term1741, term1741.getClass(), "first", term1735);
        setField(term1741, term1741.getClass(), "last", term1730);
        setField(term1741, term1741.getClass(), "propListHead", null);
        setIntField(term1741, term1741.getClass(), "sourcePosition", 0);
        setField(term1741, term1741.getClass(), "jsType", null);
        setField(term1741, term1741.getClass(), "parent", null);
        setField(term1739, term1739.getClass(), "next", term1741);
        setField(term1739, term1739.getClass(), "first", term1726);
        setField(term1739, term1739.getClass(), "last", term1726);
        setField(term1739, term1739.getClass(), "propListHead", null);
        setIntField(term1739, term1739.getClass(), "sourcePosition", 0);
        setField(term1739, term1739.getClass(), "jsType", null);
        setField(term1739, term1739.getClass(), "parent", null);
        setField(term1728, term1728.getClass(), "last", term1739);
        setField(term1728, term1728.getClass(), "propListHead", null);
        setIntField(term1728, term1728.getClass(), "sourcePosition", 0);
        setField(term1728, term1728.getClass(), "jsType", null);
        setField(term1728, term1728.getClass(), "parent", null);
        setField(term1726, term1726.getClass(), "next", term1728);
        setIntField(term1746, term1746.getClass(), "type", -1371869594);
        setField(term1746, term1746.getClass(), "next", term1739);
        setField(term1746, term1746.getClass(), "first", term1741);
        setField(term1746, term1746.getClass(), "last", term1724);
        setField(term1746, term1746.getClass(), "propListHead", null);
        setIntField(term1746, term1746.getClass(), "sourcePosition", 0);
        setField(term1746, term1746.getClass(), "jsType", null);
        setField(term1746, term1746.getClass(), "parent", null);
        setField(term1726, term1726.getClass(), "first", term1746);
        setField(term1726, term1726.getClass(), "last", term1746);
        setField(term1726, term1726.getClass(), "propListHead", null);
        setIntField(term1726, term1726.getClass(), "sourcePosition", 0);
        setField(term1726, term1726.getClass(), "jsType", null);
        setField(term1726, term1726.getClass(), "parent", null);
        setField(term1724, term1724.getClass(), "next", term1726);
        setField(term1724, term1724.getClass(), "first", term1730);
        setField(term1724, term1724.getClass(), "last", term1732);
        setField(term1724, term1724.getClass(), "propListHead", null);
        setIntField(term1724, term1724.getClass(), "sourcePosition", 0);
        setField(term1724, term1724.getClass(), "jsType", null);
        setField(term1724, term1724.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1724;
        callMethod(klass, "isOneExactlyFunctionOrDo", argTypes, term1713, args);
    }

};


