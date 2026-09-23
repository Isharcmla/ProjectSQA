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

public class JSDocInfoBuilder_recordEnumParameterType_881918703307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135280;
     Object term135454;
     Object term135732;
     Object term135734;

    public JSDocInfoBuilder_recordEnumParameterType_881918703307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135280 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term135360 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term135360, term135360.getClass(), "bitset", 1610612736);
        setField(term135360, term135360.getClass(), "info", null);
        setField(term135360, term135360.getClass(), "thisType", null);
        setField(term135280, term135280.getClass(), "currentInfo", term135360);
        term135454 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        term135732 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term135733 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term135733, term135733.getClass(), "info", null);
        setField(term135733, term135733.getClass(), "documentation", null);
        setField(term135733, term135733.getClass(), "sourceName", null);
        setField(term135733, term135733.getClass(), "visibility", null);
        setIntField(term135733, term135733.getClass(), "bitset", 1610612736);
        setField(term135733, term135733.getClass(), "type", null);
        setField(term135733, term135733.getClass(), "thisType", null);
        setBooleanField(term135733, term135733.getClass(), "includeDocumentation", false);
        setField(term135732, term135732.getClass(), "currentInfo", term135733);
        setBooleanField(term135732, term135732.getClass(), "populated", false);
        setBooleanField(term135732, term135732.getClass(), "parseDocumentation", false);
        setField(term135732, term135732.getClass(), "currentMarker", null);
        term135734 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term135734, term135734.getClass(), "root", null);
        setField(term135734, term135734.getClass(), "sourceName", null);
        setField(term135734, term135734.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        Object[] args = new Object[1];
        args[0] = term135454;
        Object retValue = callMethod(klass, "recordEnumParameterType", argTypes, term135280, args);
        assertTrue(recursiveEquals(term135280, term135732));
        assertTrue(recursiveEquals(term135454, term135734));
        assertTrue(recursiveEquals(retValue, false));
    }

};


