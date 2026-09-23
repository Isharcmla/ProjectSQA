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

public class ReferenceCollectingCallback_visit_8722731741066 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term296576;
     Object term296662;
     Object term296704;
     Object term296705;

    public ReferenceCollectingCallback_visit_8722731741066() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term296576 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        term296662 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        term296704 = newInstance(Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        setField(term296704, term296704.getClass(), "referenceMap", null);
        setField(term296704, term296704.getClass(), "blockStack", null);
        setField(term296704, term296704.getClass(), "behavior", null);
        setField(term296704, term296704.getClass(), "compiler", null);
        setField(term296704, term296704.getClass(), "varFilter", null);
        term296705 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term296705, term296705.getClass(), "functionName", null);
        setBooleanField(term296705, term296705.getClass(), "itsNeedsActivation", false);
        setIntField(term296705, term296705.getClass(), "itsFunctionType", 0);
        setBooleanField(term296705, term296705.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term296705, term296705.getClass(), "encodedSourceStart", 0);
        setIntField(term296705, term296705.getClass(), "encodedSourceEnd", 0);
        setField(term296705, term296705.getClass(), "sourceName", null);
        setIntField(term296705, term296705.getClass(), "baseLineno", 0);
        setIntField(term296705, term296705.getClass(), "endLineno", 0);
        setField(term296705, term296705.getClass(), "functions", null);
        setField(term296705, term296705.getClass(), "regexps", null);
        setField(term296705, term296705.getClass(), "itsVariables", null);
        setField(term296705, term296705.getClass(), "itsConst", null);
        setField(term296705, term296705.getClass(), "itsVariableNames", null);
        setIntField(term296705, term296705.getClass(), "varStart", 0);
        setField(term296705, term296705.getClass(), "compilerData", null);
        setIntField(term296705, term296705.getClass(), "type", 0);
        setField(term296705, term296705.getClass(), "next", null);
        setField(term296705, term296705.getClass(), "first", null);
        setField(term296705, term296705.getClass(), "last", null);
        setField(term296705, term296705.getClass(), "propListHead", null);
        setIntField(term296705, term296705.getClass(), "sourcePosition", 0);
        setField(term296705, term296705.getClass(), "jsType", null);
        setField(term296705, term296705.getClass(), "parent", null);
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
        args[1] = term296662;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term296576, args);
        assertTrue(recursiveEquals(term296576, term296704));
        assertTrue(recursiveEquals(term296662, null));
    }

};


