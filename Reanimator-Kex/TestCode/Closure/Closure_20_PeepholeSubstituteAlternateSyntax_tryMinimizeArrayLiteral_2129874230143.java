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

public class PeepholeSubstituteAlternateSyntax_tryMinimizeArrayLiteral_2129874230143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21682;
     Object term21752;
     Object term22038;
     Object term22039;
     Object term22022;

    public PeepholeSubstituteAlternateSyntax_tryMinimizeArrayLiteral_2129874230143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21682 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term21752 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term21752, term21752.getClass(), "first", term21752);
        setIntField(term21752, term21752.getClass(), "type", -41);
        setField(term21752, term21752.getClass(), "next", null);
        term22038 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        setBooleanField(term22038, term22038.getClass(), "late", false);
        setIntField(term22038, term22038.getClass(), "STRING_SPLIT_OVERHEAD", 0);
        setField(term22038, term22038.getClass(), "compiler", null);
        term22039 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term22039, term22039.getClass(), "type", -41);
        setField(term22039, term22039.getClass(), "next", null);
        setField(term22039, term22039.getClass(), "first", term22039);
        setField(term22039, term22039.getClass(), "last", null);
        setField(term22039, term22039.getClass(), "propListHead", null);
        setIntField(term22039, term22039.getClass(), "sourcePosition", 0);
        setField(term22039, term22039.getClass(), "jsType", null);
        setField(term22039, term22039.getClass(), "parent", null);
        term22022 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term22022, term22022.getClass(), "type", -41);
        setField(term22022, term22022.getClass(), "next", null);
        setField(term22022, term22022.getClass(), "first", term22022);
        setField(term22022, term22022.getClass(), "last", null);
        setField(term22022, term22022.getClass(), "propListHead", null);
        setIntField(term22022, term22022.getClass(), "sourcePosition", 0);
        setField(term22022, term22022.getClass(), "jsType", null);
        setField(term22022, term22022.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term21752;
        Object retValue = callMethod(klass, "tryMinimizeArrayLiteral", argTypes, term21682, args);
        assertTrue(recursiveEquals(term21682, term22038));
        assertTrue(recursiveEquals(term21752, term22039));
        assertTrue(recursiveEquals(retValue, term22022));
    }

};


