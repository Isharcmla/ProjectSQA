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

public class JSDocInfoBuilder_recordEnumParameterType_881918703313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136014;
     Object term136282;
     Object term136696;
     Object term136699;

    public JSDocInfoBuilder_recordEnumParameterType_881918703313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136014 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term136094 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term136188 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setIntField(term136094, term136094.getClass(), "bitset", 0);
        setField(term136094, term136094.getClass(), "info", null);
        setField(term136094, term136094.getClass(), "thisType", term136188);
        setField(term136014, term136014.getClass(), "currentInfo", term136094);
        term136282 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term136696 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term136697 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term136698 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term136697, term136697.getClass(), "info", null);
        setField(term136697, term136697.getClass(), "documentation", null);
        setField(term136697, term136697.getClass(), "sourceName", null);
        setField(term136697, term136697.getClass(), "visibility", null);
        setIntField(term136697, term136697.getClass(), "bitset", 0);
        setField(term136697, term136697.getClass(), "type", null);
        setField(term136698, term136698.getClass(), "root", null);
        setField(term136698, term136698.getClass(), "sourceName", null);
        setField(term136698, term136698.getClass(), "registry", null);
        setField(term136697, term136697.getClass(), "thisType", term136698);
        setBooleanField(term136697, term136697.getClass(), "includeDocumentation", false);
        setField(term136696, term136696.getClass(), "currentInfo", term136697);
        setBooleanField(term136696, term136696.getClass(), "populated", false);
        setBooleanField(term136696, term136696.getClass(), "parseDocumentation", false);
        setField(term136696, term136696.getClass(), "currentMarker", null);
        term136699 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term136699, term136699.getClass(), "root", null);
        setField(term136699, term136699.getClass(), "sourceName", null);
        setField(term136699, term136699.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term136282;
        Object retValue = callMethod(klass, "recordEnumParameterType", argTypes, term136014, args);
        assertTrue(recursiveEquals(term136014, term136696));
        assertTrue(recursiveEquals(term136282, term136699));
        assertTrue(recursiveEquals(retValue, false));
    }

};


