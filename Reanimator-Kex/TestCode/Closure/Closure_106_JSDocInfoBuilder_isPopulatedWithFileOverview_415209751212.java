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

public class JSDocInfoBuilder_isPopulatedWithFileOverview_415209751212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118658;
     Object term118756;

    public JSDocInfoBuilder_isPopulatedWithFileOverview_415209751212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118658 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term118738 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setBooleanField(term118658, term118658.getClass(), "populated", true);
        setIntField(term118738, term118738.getClass(), "bitset", 4096);
        setField(term118658, term118658.getClass(), "currentInfo", term118738);
        term118756 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term118757 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term118757, term118757.getClass(), "info", null);
        setField(term118757, term118757.getClass(), "documentation", null);
        setField(term118757, term118757.getClass(), "sourceName", null);
        setField(term118757, term118757.getClass(), "visibility", null);
        setIntField(term118757, term118757.getClass(), "bitset", 4096);
        setField(term118757, term118757.getClass(), "type", null);
        setField(term118757, term118757.getClass(), "thisType", null);
        setBooleanField(term118757, term118757.getClass(), "includeDocumentation", false);
        setField(term118756, term118756.getClass(), "currentInfo", term118757);
        setBooleanField(term118756, term118756.getClass(), "populated", true);
        setBooleanField(term118756, term118756.getClass(), "parseDocumentation", false);
        setField(term118756, term118756.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isPopulatedWithFileOverview", argTypes, term118658, args);
        assertTrue(recursiveEquals(term118658, term118756));
        assertTrue(recursiveEquals(retValue, true));
    }

};


