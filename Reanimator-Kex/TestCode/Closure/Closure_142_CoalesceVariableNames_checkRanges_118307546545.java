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

public class CoalesceVariableNames_checkRanges_118307546545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13866;
     Object term13918;
     Object term14004;
     Object term14669;
     Object term14670;
     Object term14672;

    public CoalesceVariableNames_checkRanges_118307546545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13866 = newInstance(Class.forName("com.google.javascript.jscomp.CoalesceVariableNames"));
        setField(term13866, term13866.getClass(), "compiler", null);
        term13918 = new ArrayList();
        term14004 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term14004, term14004.getClass(), "type", 132);
        term14669 = newInstance(Class.forName("com.google.javascript.jscomp.CoalesceVariableNames"));
        setField(term14669, term14669.getClass(), "compiler", null);
        setField(term14669, term14669.getClass(), "colorings", null);
        setBooleanField(term14669, term14669.getClass(), "usePseudoNames", false);
        term14670 = new ArrayList();
        term14672 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setField(term14672, term14672.getClass(), "functionName", null);
        setBooleanField(term14672, term14672.getClass(), "itsNeedsActivation", false);
        setIntField(term14672, term14672.getClass(), "itsFunctionType", 0);
        setBooleanField(term14672, term14672.getClass(), "itsIgnoreDynamicScope", false);
        setIntField(term14672, term14672.getClass(), "encodedSourceStart", 0);
        setIntField(term14672, term14672.getClass(), "encodedSourceEnd", 0);
        setField(term14672, term14672.getClass(), "sourceName", null);
        setIntField(term14672, term14672.getClass(), "baseLineno", 0);
        setIntField(term14672, term14672.getClass(), "endLineno", 0);
        setField(term14672, term14672.getClass(), "functions", null);
        setField(term14672, term14672.getClass(), "regexps", null);
        setField(term14672, term14672.getClass(), "itsVariables", null);
        setField(term14672, term14672.getClass(), "itsConst", null);
        setField(term14672, term14672.getClass(), "itsVariableNames", null);
        setIntField(term14672, term14672.getClass(), "varStart", 0);
        setField(term14672, term14672.getClass(), "compilerData", null);
        setIntField(term14672, term14672.getClass(), "type", 132);
        setField(term14672, term14672.getClass(), "next", null);
        setField(term14672, term14672.getClass(), "first", null);
        setField(term14672, term14672.getClass(), "last", null);
        setField(term14672, term14672.getClass(), "propListHead", null);
        setIntField(term14672, term14672.getClass(), "sourcePosition", 0);
        setField(term14672, term14672.getClass(), "jsType", null);
        setField(term14672, term14672.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.ArrayList");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term13918;
        args[1] = term14004;
        callMethod(klass, "checkRanges", argTypes, term13866, args);
        assertTrue(recursiveEquals(term13866, term14669));
        assertTrue(recursiveEquals(term13918, term14670));
        assertTrue(recursiveEquals(term14004, term14672));
    }

};


