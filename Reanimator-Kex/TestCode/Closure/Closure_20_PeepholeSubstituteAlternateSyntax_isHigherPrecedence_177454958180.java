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
import java.lang.Object;
import java.lang.Integer;

public class PeepholeSubstituteAlternateSyntax_isHigherPrecedence_177454958180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term991;
     Object term994;
     Object term1021;

    public PeepholeSubstituteAlternateSyntax_isHigherPrecedence_177454958180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term991 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term991, term991.getClass(), "late", true);
        setIntField(term991, term991.getClass(), "STRING_SPLIT_OVERHEAD", -1667482829);
        setField(term991, term991.getClass(), "compiler", null);
        term994 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term996 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term998 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1000 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1002 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1005 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1009 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1011 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1016 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term994, term994.getClass(), "type", 1116576792);
        setIntField(term996, term996.getClass(), "type", -942194446);
        setIntField(term998, term998.getClass(), "type", -938508470);
        setIntField(term1000, term1000.getClass(), "type", 1242676024);
        setIntField(term1002, term1002.getClass(), "type", -1865023308);
        setField(term1002, term1002.getClass(), "next", null);
        setField(term1002, term1002.getClass(), "first", null);
        setField(term1002, term1002.getClass(), "last", null);
        setField(term1002, term1002.getClass(), "propListHead", null);
        setIntField(term1002, term1002.getClass(), "sourcePosition", 0);
        setField(term1002, term1002.getClass(), "jsType", null);
        setField(term1002, term1002.getClass(), "parent", null);
        setField(term1000, term1000.getClass(), "next", term1002);
        setIntField(term1005, term1005.getClass(), "type", 1698510819);
        setField(term1005, term1005.getClass(), "next", null);
        setField(term1005, term1005.getClass(), "first", null);
        setField(term1005, term1005.getClass(), "last", term1002);
        setField(term1005, term1005.getClass(), "propListHead", null);
        setIntField(term1005, term1005.getClass(), "sourcePosition", 0);
        setField(term1005, term1005.getClass(), "jsType", null);
        setField(term1005, term1005.getClass(), "parent", null);
        setField(term1000, term1000.getClass(), "first", term1005);
        setField(term1000, term1000.getClass(), "last", term998);
        setField(term1000, term1000.getClass(), "propListHead", null);
        setIntField(term1000, term1000.getClass(), "sourcePosition", 0);
        setField(term1000, term1000.getClass(), "jsType", null);
        setField(term1000, term1000.getClass(), "parent", null);
        setField(term998, term998.getClass(), "next", term1000);
        setField(term998, term998.getClass(), "first", term1002);
        setIntField(term1009, term1009.getClass(), "type", 1303442927);
        setIntField(term1011, term1011.getClass(), "type", 794568325);
        setField(term1011, term1011.getClass(), "next", null);
        setField(term1011, term1011.getClass(), "first", term1005);
        setField(term1011, term1011.getClass(), "last", term1000);
        setField(term1011, term1011.getClass(), "propListHead", null);
        setIntField(term1011, term1011.getClass(), "sourcePosition", 0);
        setField(term1011, term1011.getClass(), "jsType", null);
        setField(term1011, term1011.getClass(), "parent", null);
        setField(term1009, term1009.getClass(), "next", term1011);
        setField(term1009, term1009.getClass(), "first", term996);
        setField(term1009, term1009.getClass(), "last", term996);
        setField(term1009, term1009.getClass(), "propListHead", null);
        setIntField(term1009, term1009.getClass(), "sourcePosition", 0);
        setField(term1009, term1009.getClass(), "jsType", null);
        setField(term1009, term1009.getClass(), "parent", null);
        setField(term998, term998.getClass(), "last", term1009);
        setField(term998, term998.getClass(), "propListHead", null);
        setIntField(term998, term998.getClass(), "sourcePosition", 0);
        setField(term998, term998.getClass(), "jsType", null);
        setField(term998, term998.getClass(), "parent", null);
        setField(term996, term996.getClass(), "next", term998);
        setIntField(term1016, term1016.getClass(), "type", -434468428);
        setField(term1016, term1016.getClass(), "next", term1009);
        setField(term1016, term1016.getClass(), "first", term1011);
        setField(term1016, term1016.getClass(), "last", term994);
        setField(term1016, term1016.getClass(), "propListHead", null);
        setIntField(term1016, term1016.getClass(), "sourcePosition", 0);
        setField(term1016, term1016.getClass(), "jsType", null);
        setField(term1016, term1016.getClass(), "parent", null);
        setField(term996, term996.getClass(), "first", term1016);
        setField(term996, term996.getClass(), "last", term1016);
        setField(term996, term996.getClass(), "propListHead", null);
        setIntField(term996, term996.getClass(), "sourcePosition", 0);
        setField(term996, term996.getClass(), "jsType", null);
        setField(term996, term996.getClass(), "parent", null);
        setField(term994, term994.getClass(), "next", term996);
        setField(term994, term994.getClass(), "first", term1000);
        setField(term994, term994.getClass(), "last", term1002);
        setField(term994, term994.getClass(), "propListHead", null);
        setIntField(term994, term994.getClass(), "sourcePosition", 0);
        setField(term994, term994.getClass(), "jsType", null);
        setField(term994, term994.getClass(), "parent", null);
        term1021 = new Integer(1559605714);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term994;
        args[1] = term1021;
        try {
            callMethod(klass, "isHigherPrecedence", argTypes, term991, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


