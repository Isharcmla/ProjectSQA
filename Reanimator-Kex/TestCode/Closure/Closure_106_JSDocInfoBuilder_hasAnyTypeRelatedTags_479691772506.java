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

public class JSDocInfoBuilder_hasAnyTypeRelatedTags_479691772506 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181230;
     Object term181331;

    public JSDocInfoBuilder_hasAnyTypeRelatedTags_479691772506() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term181230 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term181310 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term181310, term181310.getClass(), "bitset", 2);
        setField(term181230, term181230.getClass(), "currentInfo", term181310);
        term181331 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term181332 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term181332, term181332.getClass(), "info", null);
        setField(term181332, term181332.getClass(), "documentation", null);
        setField(term181332, term181332.getClass(), "sourceName", null);
        setField(term181332, term181332.getClass(), "visibility", null);
        setIntField(term181332, term181332.getClass(), "bitset", 2);
        setField(term181332, term181332.getClass(), "type", null);
        setField(term181332, term181332.getClass(), "thisType", null);
        setBooleanField(term181332, term181332.getClass(), "includeDocumentation", false);
        setField(term181331, term181331.getClass(), "currentInfo", term181332);
        setBooleanField(term181331, term181331.getClass(), "populated", false);
        setBooleanField(term181331, term181331.getClass(), "parseDocumentation", false);
        setField(term181331, term181331.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasAnyTypeRelatedTags", argTypes, term181230, args);
        assertTrue(recursiveEquals(term181230, term181331));
        assertTrue(recursiveEquals(retValue, true));
    }

};


