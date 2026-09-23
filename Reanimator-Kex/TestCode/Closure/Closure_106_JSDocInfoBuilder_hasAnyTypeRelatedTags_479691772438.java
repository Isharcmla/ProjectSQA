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

public class JSDocInfoBuilder_hasAnyTypeRelatedTags_479691772438 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165605;
     Object term165746;

    public JSDocInfoBuilder_hasAnyTypeRelatedTags_479691772438() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term165605 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term165685 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term165685, term165685.getClass(), "bitset", 536870912);
        setField(term165685, term165685.getClass(), "info", null);
        setField(term165685, term165685.getClass(), "thisType", null);
        setField(term165605, term165605.getClass(), "currentInfo", term165685);
        term165746 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term165747 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term165747, term165747.getClass(), "info", null);
        setField(term165747, term165747.getClass(), "documentation", null);
        setField(term165747, term165747.getClass(), "sourceName", null);
        setField(term165747, term165747.getClass(), "visibility", null);
        setIntField(term165747, term165747.getClass(), "bitset", 536870912);
        setField(term165747, term165747.getClass(), "type", null);
        setField(term165747, term165747.getClass(), "thisType", null);
        setBooleanField(term165747, term165747.getClass(), "includeDocumentation", false);
        setField(term165746, term165746.getClass(), "currentInfo", term165747);
        setBooleanField(term165746, term165746.getClass(), "populated", false);
        setBooleanField(term165746, term165746.getClass(), "parseDocumentation", false);
        setField(term165746, term165746.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasAnyTypeRelatedTags", argTypes, term165605, args);
        assertTrue(recursiveEquals(term165605, term165746));
        assertTrue(recursiveEquals(retValue, true));
    }

};


