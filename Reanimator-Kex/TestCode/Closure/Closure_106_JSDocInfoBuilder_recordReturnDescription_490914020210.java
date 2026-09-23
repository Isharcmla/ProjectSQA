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

public class JSDocInfoBuilder_recordReturnDescription_490914020210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118300;
     Object term118542;

    public JSDocInfoBuilder_recordReturnDescription_490914020210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118300 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term118380 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term118522 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        setBooleanField(term118380, term118380.getClass(), "includeDocumentation", true);
        setField(term118380, term118380.getClass(), "documentation", term118522);
        setField(term118300, term118300.getClass(), "currentInfo", term118380);
        term118542 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term118543 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term118544 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        setField(term118543, term118543.getClass(), "info", null);
        setField(term118544, term118544.getClass(), "markers", null);
        setField(term118544, term118544.getClass(), "parameters", null);
        setField(term118544, term118544.getClass(), "throwsDescriptions", null);
        setField(term118544, term118544.getClass(), "blockDescription", null);
        setField(term118544, term118544.getClass(), "fileOverview", null);
        setField(term118544, term118544.getClass(), "returnDescription", null);
        setField(term118544, term118544.getClass(), "version", null);
        setField(term118544, term118544.getClass(), "authors", null);
        setField(term118544, term118544.getClass(), "sees", null);
        setField(term118543, term118543.getClass(), "documentation", term118544);
        setField(term118543, term118543.getClass(), "sourceName", null);
        setField(term118543, term118543.getClass(), "visibility", null);
        setIntField(term118543, term118543.getClass(), "bitset", 0);
        setField(term118543, term118543.getClass(), "type", null);
        setField(term118543, term118543.getClass(), "thisType", null);
        setBooleanField(term118543, term118543.getClass(), "includeDocumentation", true);
        setField(term118542, term118542.getClass(), "currentInfo", term118543);
        setBooleanField(term118542, term118542.getClass(), "populated", true);
        setBooleanField(term118542, term118542.getClass(), "parseDocumentation", false);
        setField(term118542, term118542.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "recordReturnDescription", argTypes, term118300, args);
        assertTrue(recursiveEquals(term118300, term118542));
        assertTrue(recursiveEquals(retValue, true));
    }

};


