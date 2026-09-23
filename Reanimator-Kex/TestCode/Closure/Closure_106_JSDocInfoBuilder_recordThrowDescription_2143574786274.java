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
import java.util.HashMap;

public class JSDocInfoBuilder_recordThrowDescription_2143574786274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129397;
     Object term129702;

    public JSDocInfoBuilder_recordThrowDescription_2143574786274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term129667 = new HashMap();
        term129397 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term129477 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term129619 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        setBooleanField(term129477, term129477.getClass(), "includeDocumentation", true);
        setField(term129619, term129619.getClass(), "throwsDescriptions", term129667);
        setField(term129477, term129477.getClass(), "documentation", term129619);
        setField(term129397, term129397.getClass(), "currentInfo", term129477);
        HashMap term129705 = new HashMap();
        term129702 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term129703 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term129704 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        setField(term129703, term129703.getClass(), "info", null);
        setField(term129704, term129704.getClass(), "markers", null);
        setField(term129704, term129704.getClass(), "parameters", null);
        setField(term129704, term129704.getClass(), "throwsDescriptions", term129705);
        setField(term129704, term129704.getClass(), "blockDescription", null);
        setField(term129704, term129704.getClass(), "fileOverview", null);
        setField(term129704, term129704.getClass(), "returnDescription", null);
        setField(term129704, term129704.getClass(), "version", null);
        setField(term129704, term129704.getClass(), "authors", null);
        setField(term129704, term129704.getClass(), "sees", null);
        setField(term129703, term129703.getClass(), "documentation", term129704);
        setField(term129703, term129703.getClass(), "sourceName", null);
        setField(term129703, term129703.getClass(), "visibility", null);
        setIntField(term129703, term129703.getClass(), "bitset", 0);
        setField(term129703, term129703.getClass(), "type", null);
        setField(term129703, term129703.getClass(), "thisType", null);
        setBooleanField(term129703, term129703.getClass(), "includeDocumentation", true);
        setField(term129702, term129702.getClass(), "currentInfo", term129703);
        setBooleanField(term129702, term129702.getClass(), "populated", true);
        setBooleanField(term129702, term129702.getClass(), "parseDocumentation", false);
        setField(term129702, term129702.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.JSTypeExpression");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "recordThrowDescription", argTypes, term129397, args);
        assertTrue(recursiveEquals(term129397, term129702));
        assertTrue(recursiveEquals(retValue, true));
    }

};


