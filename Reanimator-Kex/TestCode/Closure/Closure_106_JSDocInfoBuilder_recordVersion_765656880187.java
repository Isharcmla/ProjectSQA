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

public class JSDocInfoBuilder_recordVersion_765656880187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114408;
     Object term114808;

    public JSDocInfoBuilder_recordVersion_765656880187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114408 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term114488 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setBooleanField(term114488, term114488.getClass(), "includeDocumentation", true);
        setField(term114408, term114408.getClass(), "currentInfo", term114488);
        term114808 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term114809 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term114810 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        setField(term114809, term114809.getClass(), "info", null);
        setField(term114810, term114810.getClass(), "markers", null);
        setField(term114810, term114810.getClass(), "parameters", null);
        setField(term114810, term114810.getClass(), "throwsDescriptions", null);
        setField(term114810, term114810.getClass(), "blockDescription", null);
        setField(term114810, term114810.getClass(), "fileOverview", null);
        setField(term114810, term114810.getClass(), "returnDescription", null);
        setField(term114810, term114810.getClass(), "version", null);
        setField(term114810, term114810.getClass(), "authors", null);
        setField(term114810, term114810.getClass(), "sees", null);
        setField(term114809, term114809.getClass(), "documentation", term114810);
        setField(term114809, term114809.getClass(), "sourceName", null);
        setField(term114809, term114809.getClass(), "visibility", null);
        setIntField(term114809, term114809.getClass(), "bitset", 0);
        setField(term114809, term114809.getClass(), "type", null);
        setField(term114809, term114809.getClass(), "thisType", null);
        setBooleanField(term114809, term114809.getClass(), "includeDocumentation", true);
        setField(term114808, term114808.getClass(), "currentInfo", term114809);
        setBooleanField(term114808, term114808.getClass(), "populated", true);
        setBooleanField(term114808, term114808.getClass(), "parseDocumentation", false);
        setField(term114808, term114808.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "recordVersion", argTypes, term114408, args);
        assertTrue(recursiveEquals(term114408, term114808));
        assertTrue(recursiveEquals(retValue, true));
    }

};


