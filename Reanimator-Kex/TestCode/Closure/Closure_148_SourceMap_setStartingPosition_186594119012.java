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
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Integer;

public class SourceMap_setStartingPosition_186594119012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188;
     Object term223;
     Object term225;
     Object term839;

    public SourceMap_setStartingPosition_186594119012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term189 = new ArrayList();
        term188 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        Object term193 = newInstance(Class.forName("com.google.javascript.jscomp.Position"));
        Object term196 = newInstance(Class.forName("com.google.javascript.jscomp.Position"));
        setField(term188, term188.getClass(), "mappings", term189);
        setIntField(term193, term193.getClass(), "lineNumber", 0);
        setIntField(term193, term193.getClass(), "characterIndex", 0);
        setField(term188, term188.getClass(), "offsetPosition", term193);
        setIntField(term196, term196.getClass(), "lineNumber", 0);
        setIntField(term196, term196.getClass(), "characterIndex", 0);
        setField(term188, term188.getClass(), "prefixPosition", term196);
        setField(term188, term188.getClass(), "lastSourceFile", "SzjVpOQTyS");
        setField(term188, term188.getClass(), "lastSourceFileEscaped", "MjGYSRKTNF");
        term223 = new Integer(-1685132342);
        term225 = new Integer(-1456670397);
        ArrayList term840 = new ArrayList();
        term839 = newInstance(Class.forName("com.google.javascript.jscomp.SourceMap"));
        Object term842 = newInstance(Class.forName("com.google.javascript.jscomp.Position"));
        Object term843 = newInstance(Class.forName("com.google.javascript.jscomp.Position"));
        setField(term839, term839.getClass(), "mappings", term840);
        setIntField(term842, term842.getClass(), "lineNumber", -1685132342);
        setIntField(term842, term842.getClass(), "characterIndex", -1456670397);
        setField(term839, term839.getClass(), "offsetPosition", term842);
        setIntField(term843, term843.getClass(), "lineNumber", 0);
        setIntField(term843, term843.getClass(), "characterIndex", 0);
        setField(term839, term839.getClass(), "prefixPosition", term843);
        setField(term839, term839.getClass(), "lastSourceFile", "SzjVpOQTyS");
        setField(term839, term839.getClass(), "lastSourceFileEscaped", "MjGYSRKTNF");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.SourceMap");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term223;
        args[1] = term225;
        callMethod(klass, "setStartingPosition", argTypes, term188, args);
        assertTrue(recursiveEquals(term188, term839));
        assertTrue(recursiveEquals(term223, -1685132342));
        assertTrue(recursiveEquals(term225, -1456670397));
    }

};


