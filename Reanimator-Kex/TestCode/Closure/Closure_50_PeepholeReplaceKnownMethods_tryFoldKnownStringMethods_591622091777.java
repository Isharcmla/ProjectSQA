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

public class PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091777 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3661612;
     Object term3661698;
     Object term3663013;
     Object term3663014;
     Object term3662898;

    public PeepholeReplaceKnownMethods_tryFoldKnownStringMethods_591622091777() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3661612 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        term3661698 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3661790 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3661882 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3661974 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3662104 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term3661698, term3661698.getClass(), "type", 37);
        setIntField(term3661790, term3661790.getClass(), "type", 35);
        setIntField(term3661974, term3661974.getClass(), "type", 40);
        setField(term3661974, term3661974.getClass(), "str", " ");
        setField(term3661882, term3661882.getClass(), "next", term3661974);
        setIntField(term3661882, term3661882.getClass(), "type", 40);
        setField(term3661790, term3661790.getClass(), "first", term3661882);
        setIntField(term3662104, term3662104.getClass(), "type", 43);
        setField(term3661790, term3661790.getClass(), "next", term3662104);
        setField(term3661698, term3661698.getClass(), "first", term3661790);
        term3663013 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        setField(term3663013, term3663013.getClass(), "currentTraversal", null);
        term3663014 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3663015 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3663016 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3663017 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3663018 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3663014, term3663014.getClass(), "functionName", null);
        setBooleanField(term3663014, term3663014.getClass(), "itsNeedsActivation", false);
        setIntField(term3663014, term3663014.getClass(), "itsFunctionType", 0);
        setBooleanField(term3663014, term3663014.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3663014, term3663014.getClass(), "encodedSourceStart", 0);
        setIntField(term3663014, term3663014.getClass(), "encodedSourceEnd", 0);
        setField(term3663014, term3663014.getClass(), "sourceName", null);
        setIntField(term3663014, term3663014.getClass(), "baseLineno", 0);
        setIntField(term3663014, term3663014.getClass(), "endLineno", 0);
        setField(term3663014, term3663014.getClass(), "functions", null);
        setField(term3663014, term3663014.getClass(), "regexps", null);
        setField(term3663014, term3663014.getClass(), "itsVariables", null);
        setField(term3663014, term3663014.getClass(), "itsConst", null);
        setField(term3663014, term3663014.getClass(), "itsVariableNames", null);
        setIntField(term3663014, term3663014.getClass(), "varStart", 0);
        setField(term3663014, term3663014.getClass(), "compilerData", null);
        setIntField(term3663014, term3663014.getClass(), "type", 37);
        setField(term3663014, term3663014.getClass(), "next", null);
        setField(term3663015, term3663015.getClass(), "str", null);
        setIntField(term3663015, term3663015.getClass(), "type", 35);
        setField(term3663016, term3663016.getClass(), "str", null);
        setIntField(term3663016, term3663016.getClass(), "type", 43);
        setField(term3663016, term3663016.getClass(), "next", null);
        setField(term3663016, term3663016.getClass(), "first", null);
        setField(term3663016, term3663016.getClass(), "last", null);
        setField(term3663016, term3663016.getClass(), "propListHead", null);
        setIntField(term3663016, term3663016.getClass(), "sourcePosition", 0);
        setField(term3663016, term3663016.getClass(), "jsType", null);
        setField(term3663016, term3663016.getClass(), "parent", null);
        setField(term3663015, term3663015.getClass(), "next", term3663016);
        setField(term3663017, term3663017.getClass(), "str", null);
        setIntField(term3663017, term3663017.getClass(), "type", 40);
        setField(term3663018, term3663018.getClass(), "str", "");
        setIntField(term3663018, term3663018.getClass(), "type", 40);
        setField(term3663018, term3663018.getClass(), "next", null);
        setField(term3663018, term3663018.getClass(), "first", null);
        setField(term3663018, term3663018.getClass(), "last", null);
        setField(term3663018, term3663018.getClass(), "propListHead", null);
        setIntField(term3663018, term3663018.getClass(), "sourcePosition", 0);
        setField(term3663018, term3663018.getClass(), "jsType", null);
        setField(term3663018, term3663018.getClass(), "parent", null);
        setField(term3663017, term3663017.getClass(), "next", term3663018);
        setField(term3663017, term3663017.getClass(), "first", null);
        setField(term3663017, term3663017.getClass(), "last", null);
        setField(term3663017, term3663017.getClass(), "propListHead", null);
        setIntField(term3663017, term3663017.getClass(), "sourcePosition", 0);
        setField(term3663017, term3663017.getClass(), "jsType", null);
        setField(term3663017, term3663017.getClass(), "parent", null);
        setField(term3663015, term3663015.getClass(), "first", term3663017);
        setField(term3663015, term3663015.getClass(), "last", null);
        setField(term3663015, term3663015.getClass(), "propListHead", null);
        setIntField(term3663015, term3663015.getClass(), "sourcePosition", 0);
        setField(term3663015, term3663015.getClass(), "jsType", null);
        setField(term3663015, term3663015.getClass(), "parent", null);
        setField(term3663014, term3663014.getClass(), "first", term3663015);
        setField(term3663014, term3663014.getClass(), "last", null);
        setField(term3663014, term3663014.getClass(), "propListHead", null);
        setIntField(term3663014, term3663014.getClass(), "sourcePosition", 0);
        setField(term3663014, term3663014.getClass(), "jsType", null);
        setField(term3663014, term3663014.getClass(), "parent", null);
        term3662898 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term3662908 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3662910 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3662913 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term3662915 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term3662898, term3662898.getClass(), "functionName", null);
        setBooleanField(term3662898, term3662898.getClass(), "itsNeedsActivation", false);
        setIntField(term3662898, term3662898.getClass(), "itsFunctionType", 0);
        setBooleanField(term3662898, term3662898.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term3662898, term3662898.getClass(), "encodedSourceStart", 0);
        setIntField(term3662898, term3662898.getClass(), "encodedSourceEnd", 0);
        setField(term3662898, term3662898.getClass(), "sourceName", null);
        setIntField(term3662898, term3662898.getClass(), "baseLineno", 0);
        setIntField(term3662898, term3662898.getClass(), "endLineno", 0);
        setField(term3662898, term3662898.getClass(), "functions", null);
        setField(term3662898, term3662898.getClass(), "regexps", null);
        setField(term3662898, term3662898.getClass(), "itsVariables", null);
        setField(term3662898, term3662898.getClass(), "itsConst", null);
        setField(term3662898, term3662898.getClass(), "itsVariableNames", null);
        setIntField(term3662898, term3662898.getClass(), "varStart", 0);
        setField(term3662898, term3662898.getClass(), "compilerData", null);
        setIntField(term3662898, term3662898.getClass(), "type", 37);
        setField(term3662898, term3662898.getClass(), "next", null);
        setField(term3662908, term3662908.getClass(), "str", null);
        setIntField(term3662908, term3662908.getClass(), "type", 35);
        setField(term3662910, term3662910.getClass(), "str", null);
        setIntField(term3662910, term3662910.getClass(), "type", 43);
        setField(term3662910, term3662910.getClass(), "next", null);
        setField(term3662910, term3662910.getClass(), "first", null);
        setField(term3662910, term3662910.getClass(), "last", null);
        setField(term3662910, term3662910.getClass(), "propListHead", null);
        setIntField(term3662910, term3662910.getClass(), "sourcePosition", 0);
        setField(term3662910, term3662910.getClass(), "jsType", null);
        setField(term3662910, term3662910.getClass(), "parent", null);
        setField(term3662908, term3662908.getClass(), "next", term3662910);
        setField(term3662913, term3662913.getClass(), "str", null);
        setIntField(term3662913, term3662913.getClass(), "type", 40);
        setField(term3662915, term3662915.getClass(), "str", "");
        setIntField(term3662915, term3662915.getClass(), "type", 40);
        setField(term3662915, term3662915.getClass(), "next", null);
        setField(term3662915, term3662915.getClass(), "first", null);
        setField(term3662915, term3662915.getClass(), "last", null);
        setField(term3662915, term3662915.getClass(), "propListHead", null);
        setIntField(term3662915, term3662915.getClass(), "sourcePosition", 0);
        setField(term3662915, term3662915.getClass(), "jsType", null);
        setField(term3662915, term3662915.getClass(), "parent", null);
        setField(term3662913, term3662913.getClass(), "next", term3662915);
        setField(term3662913, term3662913.getClass(), "first", null);
        setField(term3662913, term3662913.getClass(), "last", null);
        setField(term3662913, term3662913.getClass(), "propListHead", null);
        setIntField(term3662913, term3662913.getClass(), "sourcePosition", 0);
        setField(term3662913, term3662913.getClass(), "jsType", null);
        setField(term3662913, term3662913.getClass(), "parent", null);
        setField(term3662908, term3662908.getClass(), "first", term3662913);
        setField(term3662908, term3662908.getClass(), "last", null);
        setField(term3662908, term3662908.getClass(), "propListHead", null);
        setIntField(term3662908, term3662908.getClass(), "sourcePosition", 0);
        setField(term3662908, term3662908.getClass(), "jsType", null);
        setField(term3662908, term3662908.getClass(), "parent", null);
        setField(term3662898, term3662898.getClass(), "first", term3662908);
        setField(term3662898, term3662898.getClass(), "last", null);
        setField(term3662898, term3662898.getClass(), "propListHead", null);
        setIntField(term3662898, term3662898.getClass(), "sourcePosition", 0);
        setField(term3662898, term3662898.getClass(), "jsType", null);
        setField(term3662898, term3662898.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term3661698;
        Object retValue = callMethod(klass, "tryFoldKnownStringMethods", argTypes, term3661612, args);
        assertTrue(recursiveEquals(term3661612, term3663013));
        assertTrue(recursiveEquals(term3661698, term3663014));
        assertTrue(recursiveEquals(retValue, term3662898));
    }

};


