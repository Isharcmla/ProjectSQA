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

public class PeepholeFoldConstants_tryFoldComparison_8484431791098 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term257680;
     Object term257772;
     Object term257864;
     Object term257956;
     Object term258843;
     Object term258844;
     Object term258845;
     Object term258846;
     Object term258825;

    public PeepholeFoldConstants_tryFoldComparison_8484431791098() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term257680 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        term257772 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term257772, term257772.getClass(), "type", 16);
        term257864 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term257864, term257864.getClass(), "type", 16);
        term257956 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        term258843 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(term258843, term258843.getClass(), "currentTraversal", null);
        term258844 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term258844, term258844.getClass(), "str", null);
        setIntField(term258844, term258844.getClass(), "type", 16);
        setField(term258844, term258844.getClass(), "next", null);
        setField(term258844, term258844.getClass(), "first", null);
        setField(term258844, term258844.getClass(), "last", null);
        setField(term258844, term258844.getClass(), "propListHead", null);
        setIntField(term258844, term258844.getClass(), "sourcePosition", 0);
        setField(term258844, term258844.getClass(), "jsType", null);
        setField(term258844, term258844.getClass(), "parent", null);
        term258845 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term258845, term258845.getClass(), "str", null);
        setIntField(term258845, term258845.getClass(), "type", 16);
        setField(term258845, term258845.getClass(), "next", null);
        setField(term258845, term258845.getClass(), "first", null);
        setField(term258845, term258845.getClass(), "last", null);
        setField(term258845, term258845.getClass(), "propListHead", null);
        setIntField(term258845, term258845.getClass(), "sourcePosition", 0);
        setField(term258845, term258845.getClass(), "jsType", null);
        setField(term258845, term258845.getClass(), "parent", null);
        term258846 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term258846, term258846.getClass(), "str", null);
        setIntField(term258846, term258846.getClass(), "type", 0);
        setField(term258846, term258846.getClass(), "next", null);
        setField(term258846, term258846.getClass(), "first", null);
        setField(term258846, term258846.getClass(), "last", null);
        setField(term258846, term258846.getClass(), "propListHead", null);
        setIntField(term258846, term258846.getClass(), "sourcePosition", 0);
        setField(term258846, term258846.getClass(), "jsType", null);
        setField(term258846, term258846.getClass(), "parent", null);
        term258825 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term258825, term258825.getClass(), "str", null);
        setIntField(term258825, term258825.getClass(), "type", 16);
        setField(term258825, term258825.getClass(), "next", null);
        setField(term258825, term258825.getClass(), "first", null);
        setField(term258825, term258825.getClass(), "last", null);
        setField(term258825, term258825.getClass(), "propListHead", null);
        setIntField(term258825, term258825.getClass(), "sourcePosition", 0);
        setField(term258825, term258825.getClass(), "jsType", null);
        setField(term258825, term258825.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = term257772;
        args[1] = term257864;
        args[2] = term257956;
        Object retValue = callMethod(klass, "tryFoldComparison", argTypes, term257680, args);
        assertTrue(recursiveEquals(term257680, term258843));
        assertTrue(recursiveEquals(term257772, term258844));
        assertTrue(recursiveEquals(term257864, term258845));
        assertTrue(recursiveEquals(term257956, term258846));
        assertTrue(recursiveEquals(retValue, term258825));
    }

};


