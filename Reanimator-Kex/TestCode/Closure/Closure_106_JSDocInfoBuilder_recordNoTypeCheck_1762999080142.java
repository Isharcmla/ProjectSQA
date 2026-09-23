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

public class JSDocInfoBuilder_recordNoTypeCheck_1762999080142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107724;
     Object term107859;

    public JSDocInfoBuilder_recordNoTypeCheck_1762999080142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107724 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term107804 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term107804, term107804.getClass(), "bitset", 32);
        setField(term107724, term107724.getClass(), "currentInfo", term107804);
        term107859 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term107860 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term107860, term107860.getClass(), "info", null);
        setField(term107860, term107860.getClass(), "documentation", null);
        setField(term107860, term107860.getClass(), "sourceName", null);
        setField(term107860, term107860.getClass(), "visibility", null);
        setIntField(term107860, term107860.getClass(), "bitset", 32);
        setField(term107860, term107860.getClass(), "type", null);
        setField(term107860, term107860.getClass(), "thisType", null);
        setBooleanField(term107860, term107860.getClass(), "includeDocumentation", false);
        setField(term107859, term107859.getClass(), "currentInfo", term107860);
        setBooleanField(term107859, term107859.getClass(), "populated", false);
        setBooleanField(term107859, term107859.getClass(), "parseDocumentation", false);
        setField(term107859, term107859.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "recordNoTypeCheck", argTypes, term107724, args);
        assertTrue(recursiveEquals(term107724, term107859));
        assertTrue(recursiveEquals(retValue, false));
    }

};


