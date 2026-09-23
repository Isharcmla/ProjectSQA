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

public class PeepholeSubstituteAlternateSyntax_addParameterAfter_2082690943102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11307;
     Object term11399;
     Object term11859;
     Object term12778;
     Object term12779;
     Object term12784;

    public PeepholeSubstituteAlternateSyntax_addParameterAfter_2082690943102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11307 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term11399 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term11491 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term11583 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term11675 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term11767 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setField(term11767, term11767.getClass(), "next", null);
        setField(term11767, term11767.getClass(), "first", null);
        setField(term11675, term11675.getClass(), "next", term11767);
        setField(term11583, term11583.getClass(), "next", term11675);
        setField(term11491, term11491.getClass(), "next", term11583);
        setField(term11399, term11399.getClass(), "next", term11491);
        term11859 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term11929 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term11859, term11859.getClass(), "parent", term11929);
        term12778 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term12778, term12778.getClass(), "late", false);
        setIntField(term12778, term12778.getClass(), "STRING_SPLIT_OVERHEAD", 0);
        setField(term12778, term12778.getClass(), "compiler", null);
        term12779 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term12780 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term12781 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term12782 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term12783 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term12779, term12779.getClass(), "number", 0.0);
        setIntField(term12779, term12779.getClass(), "type", 0);
        setField(term12780, term12780.getClass(), "str", null);
        setIntField(term12780, term12780.getClass(), "type", 0);
        setField(term12781, term12781.getClass(), "str", null);
        setIntField(term12781, term12781.getClass(), "type", 0);
        setDoubleField(term12782, term12782.getClass(), "number", 0.0);
        setIntField(term12782, term12782.getClass(), "type", 0);
        setDoubleField(term12783, term12783.getClass(), "number", 0.0);
        setIntField(term12783, term12783.getClass(), "type", 0);
        setField(term12783, term12783.getClass(), "next", null);
        setField(term12783, term12783.getClass(), "first", null);
        setField(term12783, term12783.getClass(), "last", null);
        setField(term12783, term12783.getClass(), "propListHead", null);
        setIntField(term12783, term12783.getClass(), "sourcePosition", 0);
        setField(term12783, term12783.getClass(), "jsType", null);
        setField(term12783, term12783.getClass(), "parent", null);
        setField(term12782, term12782.getClass(), "next", term12783);
        setField(term12782, term12782.getClass(), "first", null);
        setField(term12782, term12782.getClass(), "last", null);
        setField(term12782, term12782.getClass(), "propListHead", null);
        setIntField(term12782, term12782.getClass(), "sourcePosition", 0);
        setField(term12782, term12782.getClass(), "jsType", null);
        setField(term12782, term12782.getClass(), "parent", null);
        setField(term12781, term12781.getClass(), "next", term12782);
        setField(term12781, term12781.getClass(), "first", null);
        setField(term12781, term12781.getClass(), "last", null);
        setField(term12781, term12781.getClass(), "propListHead", null);
        setIntField(term12781, term12781.getClass(), "sourcePosition", 0);
        setField(term12781, term12781.getClass(), "jsType", null);
        setField(term12781, term12781.getClass(), "parent", null);
        setField(term12780, term12780.getClass(), "next", term12781);
        setField(term12780, term12780.getClass(), "first", null);
        setField(term12780, term12780.getClass(), "last", null);
        setField(term12780, term12780.getClass(), "propListHead", null);
        setIntField(term12780, term12780.getClass(), "sourcePosition", 0);
        setField(term12780, term12780.getClass(), "jsType", null);
        setField(term12780, term12780.getClass(), "parent", null);
        setField(term12779, term12779.getClass(), "next", term12780);
        setField(term12779, term12779.getClass(), "first", null);
        setField(term12779, term12779.getClass(), "last", null);
        setField(term12779, term12779.getClass(), "propListHead", null);
        setIntField(term12779, term12779.getClass(), "sourcePosition", 0);
        setField(term12779, term12779.getClass(), "jsType", null);
        setField(term12779, term12779.getClass(), "parent", null);
        term12784 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term12785 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term12786 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term12787 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term12788 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        Object term12789 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term12784, term12784.getClass(), "str", null);
        setIntField(term12784, term12784.getClass(), "type", 0);
        setDoubleField(term12785, term12785.getClass(), "number", 0.0);
        setIntField(term12785, term12785.getClass(), "type", 0);
        setField(term12786, term12786.getClass(), "str", null);
        setIntField(term12786, term12786.getClass(), "type", 0);
        setField(term12787, term12787.getClass(), "str", null);
        setIntField(term12787, term12787.getClass(), "type", 0);
        setDoubleField(term12788, term12788.getClass(), "number", 0.0);
        setIntField(term12788, term12788.getClass(), "type", 0);
        setField(term12788, term12788.getClass(), "next", null);
        setField(term12788, term12788.getClass(), "first", null);
        setField(term12788, term12788.getClass(), "last", null);
        setField(term12788, term12788.getClass(), "propListHead", null);
        setIntField(term12788, term12788.getClass(), "sourcePosition", 0);
        setField(term12788, term12788.getClass(), "jsType", null);
        setField(term12788, term12788.getClass(), "parent", null);
        setField(term12787, term12787.getClass(), "next", term12788);
        setField(term12787, term12787.getClass(), "first", null);
        setField(term12787, term12787.getClass(), "last", null);
        setField(term12787, term12787.getClass(), "propListHead", null);
        setIntField(term12787, term12787.getClass(), "sourcePosition", 0);
        setField(term12787, term12787.getClass(), "jsType", null);
        setIntField(term12789, term12789.getClass(), "type", 0);
        setField(term12789, term12789.getClass(), "next", null);
        setField(term12789, term12789.getClass(), "first", null);
        setField(term12789, term12789.getClass(), "last", null);
        setField(term12789, term12789.getClass(), "propListHead", null);
        setIntField(term12789, term12789.getClass(), "sourcePosition", 0);
        setField(term12789, term12789.getClass(), "jsType", null);
        setField(term12789, term12789.getClass(), "parent", null);
        setField(term12787, term12787.getClass(), "parent", term12789);
        setField(term12786, term12786.getClass(), "next", term12787);
        setField(term12786, term12786.getClass(), "first", null);
        setField(term12786, term12786.getClass(), "last", null);
        setField(term12786, term12786.getClass(), "propListHead", null);
        setIntField(term12786, term12786.getClass(), "sourcePosition", 0);
        setField(term12786, term12786.getClass(), "jsType", null);
        setField(term12786, term12786.getClass(), "parent", term12789);
        setField(term12785, term12785.getClass(), "next", term12786);
        setField(term12785, term12785.getClass(), "first", null);
        setField(term12785, term12785.getClass(), "last", null);
        setField(term12785, term12785.getClass(), "propListHead", null);
        setIntField(term12785, term12785.getClass(), "sourcePosition", 0);
        setField(term12785, term12785.getClass(), "jsType", null);
        setField(term12785, term12785.getClass(), "parent", term12789);
        setField(term12784, term12784.getClass(), "next", term12785);
        setField(term12784, term12784.getClass(), "first", null);
        setField(term12784, term12784.getClass(), "last", null);
        setField(term12784, term12784.getClass(), "propListHead", null);
        setIntField(term12784, term12784.getClass(), "sourcePosition", 0);
        setField(term12784, term12784.getClass(), "jsType", null);
        setField(term12784, term12784.getClass(), "parent", term12789);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term11399;
        args[1] = term11859;
        callMethod(klass, "addParameterAfter", argTypes, term11307, args);
        assertTrue(recursiveEquals(term11307, term12778));
        assertTrue(recursiveEquals(term11399, term12779));
        assertTrue(recursiveEquals(term11859, term12784));
    }

};


