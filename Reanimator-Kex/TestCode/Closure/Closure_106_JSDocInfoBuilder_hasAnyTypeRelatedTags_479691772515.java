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

public class JSDocInfoBuilder_hasAnyTypeRelatedTags_479691772515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183215;
     Object term184042;

    public JSDocInfoBuilder_hasAnyTypeRelatedTags_479691772515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term183215 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term183295 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term183389 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setIntField(term183295, term183295.getClass(), "bitset", 0);
        setField(term183295, term183295.getClass(), "info", null);
        setField(term183295, term183295.getClass(), "thisType", term183389);
        setField(term183215, term183215.getClass(), "currentInfo", term183295);
        term184042 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term184043 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term184044 = newInstance(Class.forName("com.google.javascript.rhino.JSTypeExpression"));
        setField(term184043, term184043.getClass(), "info", null);
        setField(term184043, term184043.getClass(), "documentation", null);
        setField(term184043, term184043.getClass(), "sourceName", null);
        setField(term184043, term184043.getClass(), "visibility", null);
        setIntField(term184043, term184043.getClass(), "bitset", 0);
        setField(term184043, term184043.getClass(), "type", null);
        setField(term184044, term184044.getClass(), "root", null);
        setField(term184044, term184044.getClass(), "sourceName", null);
        setField(term184044, term184044.getClass(), "registry", null);
        setField(term184043, term184043.getClass(), "thisType", term184044);
        setBooleanField(term184043, term184043.getClass(), "includeDocumentation", false);
        setField(term184042, term184042.getClass(), "currentInfo", term184043);
        setBooleanField(term184042, term184042.getClass(), "populated", false);
        setBooleanField(term184042, term184042.getClass(), "parseDocumentation", false);
        setField(term184042, term184042.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasAnyTypeRelatedTags", argTypes, term183215, args);
        assertTrue(recursiveEquals(term183215, term184042));
        assertTrue(recursiveEquals(retValue, true));
    }

};


