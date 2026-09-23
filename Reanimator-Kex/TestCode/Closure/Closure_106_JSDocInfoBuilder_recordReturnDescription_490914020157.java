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

public class JSDocInfoBuilder_recordReturnDescription_490914020157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109667;
     Object term110063;

    public JSDocInfoBuilder_recordReturnDescription_490914020157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109667 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term109747 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setBooleanField(term109747, term109747.getClass(), "includeDocumentation", true);
        setField(term109667, term109667.getClass(), "currentInfo", term109747);
        term110063 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term110064 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term110065 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        setField(term110064, term110064.getClass(), "info", null);
        setField(term110065, term110065.getClass(), "markers", null);
        setField(term110065, term110065.getClass(), "parameters", null);
        setField(term110065, term110065.getClass(), "throwsDescriptions", null);
        setField(term110065, term110065.getClass(), "blockDescription", null);
        setField(term110065, term110065.getClass(), "fileOverview", null);
        setField(term110065, term110065.getClass(), "returnDescription", null);
        setField(term110065, term110065.getClass(), "version", null);
        setField(term110065, term110065.getClass(), "authors", null);
        setField(term110065, term110065.getClass(), "sees", null);
        setField(term110064, term110064.getClass(), "documentation", term110065);
        setField(term110064, term110064.getClass(), "sourceName", null);
        setField(term110064, term110064.getClass(), "visibility", null);
        setIntField(term110064, term110064.getClass(), "bitset", 0);
        setField(term110064, term110064.getClass(), "type", null);
        setField(term110064, term110064.getClass(), "thisType", null);
        setBooleanField(term110064, term110064.getClass(), "includeDocumentation", true);
        setField(term110063, term110063.getClass(), "currentInfo", term110064);
        setBooleanField(term110063, term110063.getClass(), "populated", true);
        setBooleanField(term110063, term110063.getClass(), "parseDocumentation", false);
        setField(term110063, term110063.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "recordReturnDescription", argTypes, term109667, args);
        assertTrue(recursiveEquals(term109667, term110063));
        assertTrue(recursiveEquals(retValue, true));
    }

};


