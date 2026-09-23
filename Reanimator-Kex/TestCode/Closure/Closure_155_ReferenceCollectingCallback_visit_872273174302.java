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

public class ReferenceCollectingCallback_visit_872273174302 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71010;
     Object term71096;
     Object term71531;
     Object term71532;

    public ReferenceCollectingCallback_visit_872273174302() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71010 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term71096 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term71531 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term71531, term71531.getClass(), "referenceMap", null);
        setField(term71531, term71531.getClass(), "blockStack", null);
        setField(term71531, term71531.getClass(), "behavior", null);
        setField(term71531, term71531.getClass(), "compiler", null);
        setField(term71531, term71531.getClass(), "varFilter", null);
        term71532 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term71532, term71532.getClass(), "functionName", null);
        setBooleanField(term71532, term71532.getClass(), "itsNeedsActivation", false);
        setIntField(term71532, term71532.getClass(), "itsFunctionType", 0);
        setBooleanField(term71532, term71532.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term71532, term71532.getClass(), "encodedSourceStart", 0);
        setIntField(term71532, term71532.getClass(), "encodedSourceEnd", 0);
        setField(term71532, term71532.getClass(), "sourceName", null);
        setIntField(term71532, term71532.getClass(), "baseLineno", 0);
        setIntField(term71532, term71532.getClass(), "endLineno", 0);
        setField(term71532, term71532.getClass(), "functions", null);
        setField(term71532, term71532.getClass(), "regexps", null);
        setField(term71532, term71532.getClass(), "itsVariables", null);
        setField(term71532, term71532.getClass(), "itsConst", null);
        setField(term71532, term71532.getClass(), "itsVariableNames", null);
        setIntField(term71532, term71532.getClass(), "varStart", 0);
        setField(term71532, term71532.getClass(), "compilerData", null);
        setIntField(term71532, term71532.getClass(), "type", 0);
        setField(term71532, term71532.getClass(), "next", null);
        setField(term71532, term71532.getClass(), "first", null);
        setField(term71532, term71532.getClass(), "last", null);
        setField(term71532, term71532.getClass(), "propListHead", null);
        setIntField(term71532, term71532.getClass(), "sourcePosition", 0);
        setField(term71532, term71532.getClass(), "jsType", null);
        setField(term71532, term71532.getClass(), "parent", null);
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
        args[1] = term71096;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term71010, args);
        assertTrue(recursiveEquals(term71010, term71531));
        assertTrue(recursiveEquals(term71096, null));
    }

};


