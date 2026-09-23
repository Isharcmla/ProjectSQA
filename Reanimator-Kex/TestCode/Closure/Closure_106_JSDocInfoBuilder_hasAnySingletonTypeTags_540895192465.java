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

public class JSDocInfoBuilder_hasAnySingletonTypeTags_540895192465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171132;
     Object term171704;

    public JSDocInfoBuilder_hasAnySingletonTypeTags_540895192465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term171132 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term171212 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term171212, term171212.getClass(), "bitset", 1610612736);
        setField(term171132, term171132.getClass(), "currentInfo", term171212);
        term171704 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term171705 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term171705, term171705.getClass(), "info", null);
        setField(term171705, term171705.getClass(), "documentation", null);
        setField(term171705, term171705.getClass(), "sourceName", null);
        setField(term171705, term171705.getClass(), "visibility", null);
        setIntField(term171705, term171705.getClass(), "bitset", 1610612736);
        setField(term171705, term171705.getClass(), "type", null);
        setField(term171705, term171705.getClass(), "thisType", null);
        setBooleanField(term171705, term171705.getClass(), "includeDocumentation", false);
        setField(term171704, term171704.getClass(), "currentInfo", term171705);
        setBooleanField(term171704, term171704.getClass(), "populated", false);
        setBooleanField(term171704, term171704.getClass(), "parseDocumentation", false);
        setField(term171704, term171704.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasAnySingletonTypeTags", argTypes, term171132, args);
        assertTrue(recursiveEquals(term171132, term171704));
        assertTrue(recursiveEquals(retValue, true));
    }

};


