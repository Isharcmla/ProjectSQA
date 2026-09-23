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
import java.util.LinkedHashMap;

public class JSDocInfoBuilder_recordParameterDescription_915937072256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125939;
     Object term126200;

    public JSDocInfoBuilder_recordParameterDescription_915937072256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term125939 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term126019 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term126161 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        setBooleanField(term126019, term126019.getClass(), "includeDocumentation", true);
        setField(term126161, term126161.getClass(), "parameters", null);
        setField(term126019, term126019.getClass(), "documentation", term126161);
        setField(term125939, term125939.getClass(), "currentInfo", term126019);
        LinkedHashMap term126203 = new LinkedHashMap();
        term126200 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term126201 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term126202 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        setField(term126201, term126201.getClass(), "info", null);
        setField(term126202, term126202.getClass(), "markers", null);
        setField(term126202, term126202.getClass(), "parameters", term126203);
        setField(term126202, term126202.getClass(), "throwsDescriptions", null);
        setField(term126202, term126202.getClass(), "blockDescription", null);
        setField(term126202, term126202.getClass(), "fileOverview", null);
        setField(term126202, term126202.getClass(), "returnDescription", null);
        setField(term126202, term126202.getClass(), "version", null);
        setField(term126202, term126202.getClass(), "authors", null);
        setField(term126202, term126202.getClass(), "sees", null);
        setField(term126201, term126201.getClass(), "documentation", term126202);
        setField(term126201, term126201.getClass(), "sourceName", null);
        setField(term126201, term126201.getClass(), "visibility", null);
        setIntField(term126201, term126201.getClass(), "bitset", 0);
        setField(term126201, term126201.getClass(), "type", null);
        setField(term126201, term126201.getClass(), "thisType", null);
        setBooleanField(term126201, term126201.getClass(), "includeDocumentation", true);
        setField(term126200, term126200.getClass(), "currentInfo", term126201);
        setBooleanField(term126200, term126200.getClass(), "populated", true);
        setBooleanField(term126200, term126200.getClass(), "parseDocumentation", false);
        setField(term126200, term126200.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "recordParameterDescription", argTypes, term125939, args);
        assertTrue(recursiveEquals(term125939, term126200));
        assertTrue(recursiveEquals(retValue, true));
    }

};


