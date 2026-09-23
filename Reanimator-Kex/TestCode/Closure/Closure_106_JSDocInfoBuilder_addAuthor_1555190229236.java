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
import java.util.ArrayList;

public class JSDocInfoBuilder_addAuthor_1555190229236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122329;
     Object term122464;

    public JSDocInfoBuilder_addAuthor_1555190229236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term122329 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term122409 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setBooleanField(term122409, term122409.getClass(), "includeDocumentation", true);
        setField(term122409, term122409.getClass(), "documentation", null);
        setField(term122329, term122329.getClass(), "currentInfo", term122409);
        ArrayList term122467 = new ArrayList();
        ((ArrayList) term122467).add((Object)null);
        term122464 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term122465 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term122466 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        setField(term122465, term122465.getClass(), "info", null);
        setField(term122466, term122466.getClass(), "markers", null);
        setField(term122466, term122466.getClass(), "parameters", null);
        setField(term122466, term122466.getClass(), "throwsDescriptions", null);
        setField(term122466, term122466.getClass(), "blockDescription", null);
        setField(term122466, term122466.getClass(), "fileOverview", null);
        setField(term122466, term122466.getClass(), "returnDescription", null);
        setField(term122466, term122466.getClass(), "version", null);
        setField(term122466, term122466.getClass(), "authors", term122467);
        setField(term122466, term122466.getClass(), "sees", null);
        setField(term122465, term122465.getClass(), "documentation", term122466);
        setField(term122465, term122465.getClass(), "sourceName", null);
        setField(term122465, term122465.getClass(), "visibility", null);
        setIntField(term122465, term122465.getClass(), "bitset", 0);
        setField(term122465, term122465.getClass(), "type", null);
        setField(term122465, term122465.getClass(), "thisType", null);
        setBooleanField(term122465, term122465.getClass(), "includeDocumentation", true);
        setField(term122464, term122464.getClass(), "currentInfo", term122465);
        setBooleanField(term122464, term122464.getClass(), "populated", true);
        setBooleanField(term122464, term122464.getClass(), "parseDocumentation", false);
        setField(term122464, term122464.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "addAuthor", argTypes, term122329, args);
        assertTrue(recursiveEquals(term122329, term122464));
        assertTrue(recursiveEquals(retValue, true));
    }

};


