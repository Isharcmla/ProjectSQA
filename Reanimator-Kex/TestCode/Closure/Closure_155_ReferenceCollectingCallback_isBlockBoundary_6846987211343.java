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

public class ReferenceCollectingCallback_isBlockBoundary_6846987211343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term380651;
     Object term380684;

    public ReferenceCollectingCallback_isBlockBoundary_6846987211343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term380651 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        term380684 = newInstance(Class.forName("com.google.javascript.rhino.ScriptOrFnNode"));
        setIntField(term380684, term380684.getClass(), "encodedSourceStart", 0);
        setIntField(term380684, term380684.getClass(), "encodedSourceEnd", 0);
        setField(term380684, term380684.getClass(), "sourceName", null);
        setIntField(term380684, term380684.getClass(), "baseLineno", 0);
        setIntField(term380684, term380684.getClass(), "endLineno", 0);
        setField(term380684, term380684.getClass(), "functions", null);
        setField(term380684, term380684.getClass(), "regexps", null);
        setField(term380684, term380684.getClass(), "itsVariables", null);
        setField(term380684, term380684.getClass(), "itsConst", null);
        setField(term380684, term380684.getClass(), "itsVariableNames", null);
        setIntField(term380684, term380684.getClass(), "varStart", 0);
        setField(term380684, term380684.getClass(), "compilerData", null);
        setIntField(term380684, term380684.getClass(), "type", 0);
        setField(term380684, term380684.getClass(), "next", null);
        setField(term380684, term380684.getClass(), "first", null);
        setField(term380684, term380684.getClass(), "last", null);
        setField(term380684, term380684.getClass(), "propListHead", null);
        setIntField(term380684, term380684.getClass(), "sourcePosition", 0);
        setField(term380684, term380684.getClass(), "jsType", null);
        setField(term380684, term380684.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term380651;
        args[1] = null;
        Object retValue = callMethod(klass, "isBlockBoundary", argTypes, null, args);
        assertTrue(recursiveEquals(term380651, term380684));
        assertTrue(recursiveEquals(retValue, false));
    }

};


