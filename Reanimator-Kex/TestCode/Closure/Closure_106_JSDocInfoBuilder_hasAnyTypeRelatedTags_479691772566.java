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

public class JSDocInfoBuilder_hasAnyTypeRelatedTags_479691772566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199655;
     Object term199903;

    public JSDocInfoBuilder_hasAnyTypeRelatedTags_479691772566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term199655 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term199735 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term199859 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setIntField(term199735, term199735.getClass(), "bitset", 1073741824);
        setField(term199859, term199859.getClass(), "parameters", null);
        setField(term199735, term199735.getClass(), "info", term199859);
        setField(term199655, term199655.getClass(), "currentInfo", term199735);
        term199903 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term199904 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term199905 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo"));
        setField(term199905, term199905.getClass(), "baseType", null);
        setField(term199905, term199905.getClass(), "implementedInterfaces", null);
        setField(term199905, term199905.getClass(), "parameters", null);
        setField(term199905, term199905.getClass(), "thrownTypes", null);
        setField(term199905, term199905.getClass(), "templateTypeName", null);
        setField(term199905, term199905.getClass(), "description", null);
        setField(term199905, term199905.getClass(), "deprecated", null);
        setField(term199905, term199905.getClass(), "license", null);
        setField(term199905, term199905.getClass(), "suppressions", null);
        setField(term199904, term199904.getClass(), "info", term199905);
        setField(term199904, term199904.getClass(), "documentation", null);
        setField(term199904, term199904.getClass(), "sourceName", null);
        setField(term199904, term199904.getClass(), "visibility", null);
        setIntField(term199904, term199904.getClass(), "bitset", 1073741824);
        setField(term199904, term199904.getClass(), "type", null);
        setField(term199904, term199904.getClass(), "thisType", null);
        setBooleanField(term199904, term199904.getClass(), "includeDocumentation", false);
        setField(term199903, term199903.getClass(), "currentInfo", term199904);
        setBooleanField(term199903, term199903.getClass(), "populated", false);
        setBooleanField(term199903, term199903.getClass(), "parseDocumentation", false);
        setField(term199903, term199903.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasAnyTypeRelatedTags", argTypes, term199655, args);
        assertTrue(recursiveEquals(term199655, term199903));
        assertTrue(recursiveEquals(retValue, true));
    }

};


