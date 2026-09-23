package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.EqualityUtils.*;
import java.lang.Object;

public class JSDocInfoBuilder_recordEnumParameterType_881918703261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126647;
     Object term126821;
     Object term127051;
     Object term127053;

    public JSDocInfoBuilder_recordEnumParameterType_881918703261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126647 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term126727 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term126727, term126727.getClass(), "bitset", 1073741824);
        setField(term126727, term126727.getClass(), "info", null);
        setField(term126647, term126647.getClass(), "currentInfo", term126727);
        term126821 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term127051 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term127052 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term127052, term127052.getClass(), "info", null);
        setField(term127052, term127052.getClass(), "documentation", null);
        setField(term127052, term127052.getClass(), "sourceName", null);
        setField(term127052, term127052.getClass(), "visibility", null);
        setIntField(term127052, term127052.getClass(), "bitset", 1073741824);
        setField(term127052, term127052.getClass(), "type", null);
        setField(term127052, term127052.getClass(), "thisType", null);
        setBooleanField(term127052, term127052.getClass(), "includeDocumentation", false);
        setField(term127051, term127051.getClass(), "currentInfo", term127052);
        setBooleanField(term127051, term127051.getClass(), "populated", false);
        setBooleanField(term127051, term127051.getClass(), "parseDocumentation", false);
        setField(term127051, term127051.getClass(), "currentMarker", null);
        term127053 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term127053, term127053.getClass(), "root", null);
        setField(term127053, term127053.getClass(), "sourceName", null);
        setField(term127053, term127053.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term126821;
        Object retValue = callMethod(klass, "recordEnumParameterType", argTypes, term126647, args);
        assertTrue(recursiveEquals(term126647, term127051));
        assertTrue(recursiveEquals(term126821, term127053));
        assertTrue(recursiveEquals(retValue, false));
    }

};


