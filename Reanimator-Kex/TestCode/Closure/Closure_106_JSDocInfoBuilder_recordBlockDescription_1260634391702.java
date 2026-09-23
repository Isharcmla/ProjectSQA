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

public class JSDocInfoBuilder_recordBlockDescription_1260634391702 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term231564;
     Object term231848;

    public JSDocInfoBuilder_recordBlockDescription_1260634391702() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term231564 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term231644 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term231786 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        setBooleanField(term231564, term231564.getClass(), "parseDocumentation", false);
        setBooleanField(term231644, term231644.getClass(), "includeDocumentation", true);
        setField(term231786, term231786.getClass(), "blockDescription", "");
        setField(term231644, term231644.getClass(), "documentation", term231786);
        setField(term231564, term231564.getClass(), "currentInfo", term231644);
        term231848 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term231849 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term231850 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        setField(term231849, term231849.getClass(), "info", null);
        setField(term231850, term231850.getClass(), "markers", null);
        setField(term231850, term231850.getClass(), "parameters", null);
        setField(term231850, term231850.getClass(), "throwsDescriptions", null);
        setField(term231850, term231850.getClass(), "blockDescription", "");
        setField(term231850, term231850.getClass(), "fileOverview", null);
        setField(term231850, term231850.getClass(), "returnDescription", null);
        setField(term231850, term231850.getClass(), "version", null);
        setField(term231850, term231850.getClass(), "authors", null);
        setField(term231850, term231850.getClass(), "sees", null);
        setField(term231849, term231849.getClass(), "documentation", term231850);
        setField(term231849, term231849.getClass(), "sourceName", null);
        setField(term231849, term231849.getClass(), "visibility", null);
        setIntField(term231849, term231849.getClass(), "bitset", 0);
        setField(term231849, term231849.getClass(), "type", null);
        setField(term231849, term231849.getClass(), "thisType", null);
        setBooleanField(term231849, term231849.getClass(), "includeDocumentation", true);
        setField(term231848, term231848.getClass(), "currentInfo", term231849);
        setBooleanField(term231848, term231848.getClass(), "populated", false);
        setBooleanField(term231848, term231848.getClass(), "parseDocumentation", false);
        setField(term231848, term231848.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "recordBlockDescription", argTypes, term231564, args);
        assertTrue(recursiveEquals(term231564, term231848));
    }

};


