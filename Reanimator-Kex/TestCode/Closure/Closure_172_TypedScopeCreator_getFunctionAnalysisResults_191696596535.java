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
import java.util.HashMap;

public class TypedScopeCreator_getFunctionAnalysisResults_191696596535 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10662;
     Object term10780;
     Object term10791;
     Object term10793;

    public TypedScopeCreator_getFunctionAnalysisResults_191696596535() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term10710 = new HashMap();
        term10662 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term10662, term10662.getClass(), "functionAnalysisResults", term10710);
        term10780 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        HashMap term10792 = new HashMap();
        term10791 = newInstance(Class.forName("com.google.javascript.jscomp.TypedScopeCreator"));
        setField(term10791, term10791.getClass(), "compiler", null);
        setField(term10791, term10791.getClass(), "typeParsingErrorReporter", null);
        setField(term10791, term10791.getClass(), "validator", null);
        setField(term10791, term10791.getClass(), "codingConvention", null);
        setField(term10791, term10791.getClass(), "typeRegistry", null);
        setField(term10791, term10791.getClass(), "delegateProxyPrototypes", null);
        setField(term10791, term10791.getClass(), "delegateCallingConventions", null);
        setField(term10791, term10791.getClass(), "functionAnalysisResults", term10792);
        setField(term10791, term10791.getClass(), "unknownType", null);
        term10793 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10793, term10793.getClass(), "type", 0);
        setField(term10793, term10793.getClass(), "next", null);
        setField(term10793, term10793.getClass(), "first", null);
        setField(term10793, term10793.getClass(), "last", null);
        setField(term10793, term10793.getClass(), "propListHead", null);
        setIntField(term10793, term10793.getClass(), "sourcePosition", 0);
        setField(term10793, term10793.getClass(), "jsType", null);
        setField(term10793, term10793.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypedScopeCreator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term10780;
        Object retValue = callMethod(klass, "getFunctionAnalysisResults", argTypes, term10662, args);
        assertTrue(recursiveEquals(term10662, term10791));
        assertTrue(recursiveEquals(term10780, term10793));
        assertTrue(recursiveEquals(retValue, null));
    }

};


