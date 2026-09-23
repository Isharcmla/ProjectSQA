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

public class ReferenceCollectingCallback_visit_872273174418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111312;
     Object term111533;
     Object term111490;
     Object term111851;
     Object term111852;
     Object term111853;

    public ReferenceCollectingCallback_visit_872273174418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111312 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term111533 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term111533, term111533.getClass(), "type", 0);
        term111490 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setIntField(term111490, term111490.getClass(), "type", 100);
        setField(term111490, term111490.getClass(), "first", term111533);
        term111851 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term111851, term111851.getClass(), "referenceMap", null);
        setField(term111851, term111851.getClass(), "blockStack", null);
        setField(term111851, term111851.getClass(), "behavior", null);
        setField(term111851, term111851.getClass(), "compiler", null);
        setField(term111851, term111851.getClass(), "varFilter", null);
        term111852 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term111852, term111852.getClass(), "functionName", null);
        setBooleanField(term111852, term111852.getClass(), "itsNeedsActivation", false);
        setIntField(term111852, term111852.getClass(), "itsFunctionType", 0);
        setBooleanField(term111852, term111852.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term111852, term111852.getClass(), "encodedSourceStart", 0);
        setIntField(term111852, term111852.getClass(), "encodedSourceEnd", 0);
        setField(term111852, term111852.getClass(), "sourceName", null);
        setIntField(term111852, term111852.getClass(), "baseLineno", 0);
        setIntField(term111852, term111852.getClass(), "endLineno", 0);
        setField(term111852, term111852.getClass(), "functions", null);
        setField(term111852, term111852.getClass(), "regexps", null);
        setField(term111852, term111852.getClass(), "itsVariables", null);
        setField(term111852, term111852.getClass(), "itsConst", null);
        setField(term111852, term111852.getClass(), "itsVariableNames", null);
        setIntField(term111852, term111852.getClass(), "varStart", 0);
        setField(term111852, term111852.getClass(), "compilerData", null);
        setIntField(term111852, term111852.getClass(), "type", 0);
        setField(term111852, term111852.getClass(), "next", null);
        setField(term111852, term111852.getClass(), "first", null);
        setField(term111852, term111852.getClass(), "last", null);
        setField(term111852, term111852.getClass(), "propListHead", null);
        setIntField(term111852, term111852.getClass(), "sourcePosition", 0);
        setField(term111852, term111852.getClass(), "jsType", null);
        setField(term111852, term111852.getClass(), "parent", null);
        term111853 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        Object term111854 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term111853, term111853.getClass(), "str", null);
        setIntField(term111853, term111853.getClass(), "type", 100);
        setField(term111853, term111853.getClass(), "next", null);
        setField(term111854, term111854.getClass(), "functionName", null);
        setBooleanField(term111854, term111854.getClass(), "itsNeedsActivation", false);
        setIntField(term111854, term111854.getClass(), "itsFunctionType", 0);
        setBooleanField(term111854, term111854.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term111854, term111854.getClass(), "encodedSourceStart", 0);
        setIntField(term111854, term111854.getClass(), "encodedSourceEnd", 0);
        setField(term111854, term111854.getClass(), "sourceName", null);
        setIntField(term111854, term111854.getClass(), "baseLineno", 0);
        setIntField(term111854, term111854.getClass(), "endLineno", 0);
        setField(term111854, term111854.getClass(), "functions", null);
        setField(term111854, term111854.getClass(), "regexps", null);
        setField(term111854, term111854.getClass(), "itsVariables", null);
        setField(term111854, term111854.getClass(), "itsConst", null);
        setField(term111854, term111854.getClass(), "itsVariableNames", null);
        setIntField(term111854, term111854.getClass(), "varStart", 0);
        setField(term111854, term111854.getClass(), "compilerData", null);
        setIntField(term111854, term111854.getClass(), "type", 0);
        setField(term111854, term111854.getClass(), "next", null);
        setField(term111854, term111854.getClass(), "first", null);
        setField(term111854, term111854.getClass(), "last", null);
        setField(term111854, term111854.getClass(), "propListHead", null);
        setIntField(term111854, term111854.getClass(), "sourcePosition", 0);
        setField(term111854, term111854.getClass(), "jsType", null);
        setField(term111854, term111854.getClass(), "parent", null);
        setField(term111853, term111853.getClass(), "first", term111854);
        setField(term111853, term111853.getClass(), "last", null);
        setField(term111853, term111853.getClass(), "propListHead", null);
        setIntField(term111853, term111853.getClass(), "sourcePosition", 0);
        setField(term111853, term111853.getClass(), "jsType", null);
        setField(term111853, term111853.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term111533;
        args[2] = term111490;
        callMethod(klass, "visit", argTypes, term111312, args);
        assertTrue(recursiveEquals(term111312, term111851));
        assertTrue(recursiveEquals(term111533, term111853));
        assertTrue(recursiveEquals(term111490, null));
    }

};


