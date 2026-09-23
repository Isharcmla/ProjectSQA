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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16384;
     Object term16454;
     Object term16956;
     Object term16957;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16384 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term16454 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16524 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16594 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16664 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term16454, term16454.getClass(), "type", 48);
        setIntField(term16524, term16524.getClass(), "type", 2);
        setIntField(term16594, term16594.getClass(), "type", 1);
        setField(term16594, term16594.getClass(), "first", null);
        setField(term16594, term16594.getClass(), "next", null);
        setField(term16524, term16524.getClass(), "first", term16594);
        setIntField(term16664, term16664.getClass(), "type", 0);
        setField(term16664, term16664.getClass(), "first", null);
        setField(term16664, term16664.getClass(), "next", null);
        setField(term16524, term16524.getClass(), "next", term16664);
        setField(term16454, term16454.getClass(), "first", term16524);
        term16956 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term16956, term16956.getClass(), "late", false);
        setIntField(term16956, term16956.getClass(), "STRING_SPLIT_OVERHEAD", 0);
        setField(term16956, term16956.getClass(), "compiler", null);
        term16957 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16958 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16959 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16960 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term16957, term16957.getClass(), "type", 48);
        setField(term16957, term16957.getClass(), "next", null);
        setIntField(term16958, term16958.getClass(), "type", 2);
        setIntField(term16959, term16959.getClass(), "type", 0);
        setField(term16959, term16959.getClass(), "next", null);
        setField(term16959, term16959.getClass(), "first", null);
        setField(term16959, term16959.getClass(), "last", null);
        setField(term16959, term16959.getClass(), "propListHead", null);
        setIntField(term16959, term16959.getClass(), "sourcePosition", 0);
        setField(term16959, term16959.getClass(), "jsType", null);
        setField(term16959, term16959.getClass(), "parent", null);
        setField(term16958, term16958.getClass(), "next", term16959);
        setIntField(term16960, term16960.getClass(), "type", 1);
        setField(term16960, term16960.getClass(), "next", null);
        setField(term16960, term16960.getClass(), "first", null);
        setField(term16960, term16960.getClass(), "last", null);
        setField(term16960, term16960.getClass(), "propListHead", null);
        setIntField(term16960, term16960.getClass(), "sourcePosition", 0);
        setField(term16960, term16960.getClass(), "jsType", null);
        setField(term16960, term16960.getClass(), "parent", null);
        setField(term16958, term16958.getClass(), "first", term16960);
        setField(term16958, term16958.getClass(), "last", null);
        setField(term16958, term16958.getClass(), "propListHead", null);
        setIntField(term16958, term16958.getClass(), "sourcePosition", 0);
        setField(term16958, term16958.getClass(), "jsType", null);
        setField(term16958, term16958.getClass(), "parent", null);
        setField(term16957, term16957.getClass(), "first", term16958);
        setField(term16957, term16957.getClass(), "last", null);
        setField(term16957, term16957.getClass(), "propListHead", null);
        setIntField(term16957, term16957.getClass(), "sourcePosition", 0);
        setField(term16957, term16957.getClass(), "jsType", null);
        setField(term16957, term16957.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term16454;
        Object retValue = callMethod(klass, "isPure", argTypes, term16384, args);
        assertTrue(recursiveEquals(term16384, term16956));
        assertTrue(recursiveEquals(term16454, term16957));
        assertTrue(recursiveEquals(retValue, false));
    }

};


