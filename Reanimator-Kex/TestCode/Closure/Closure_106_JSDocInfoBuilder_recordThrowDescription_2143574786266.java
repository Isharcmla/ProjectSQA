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

public class JSDocInfoBuilder_recordThrowDescription_2143574786266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127650;
     Object term127770;

    public JSDocInfoBuilder_recordThrowDescription_2143574786266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127650 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term127730 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setBooleanField(term127730, term127730.getClass(), "includeDocumentation", true);
        setField(term127730, term127730.getClass(), "documentation", null);
        setField(term127650, term127650.getClass(), "currentInfo", term127730);
        LinkedHashMap term127773 = new LinkedHashMap();
        term127770 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term127771 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term127772 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo$LazilyInitializedDocumentation"));
        setField(term127771, term127771.getClass(), "info", null);
        setField(term127772, term127772.getClass(), "markers", null);
        setField(term127772, term127772.getClass(), "parameters", null);
        setField(term127772, term127772.getClass(), "throwsDescriptions", term127773);
        setField(term127772, term127772.getClass(), "blockDescription", null);
        setField(term127772, term127772.getClass(), "fileOverview", null);
        setField(term127772, term127772.getClass(), "returnDescription", null);
        setField(term127772, term127772.getClass(), "version", null);
        setField(term127772, term127772.getClass(), "authors", null);
        setField(term127772, term127772.getClass(), "sees", null);
        setField(term127771, term127771.getClass(), "documentation", term127772);
        setField(term127771, term127771.getClass(), "sourceName", null);
        setField(term127771, term127771.getClass(), "visibility", null);
        setIntField(term127771, term127771.getClass(), "bitset", 0);
        setField(term127771, term127771.getClass(), "type", null);
        setField(term127771, term127771.getClass(), "thisType", null);
        setBooleanField(term127771, term127771.getClass(), "includeDocumentation", true);
        setField(term127770, term127770.getClass(), "currentInfo", term127771);
        setBooleanField(term127770, term127770.getClass(), "populated", true);
        setBooleanField(term127770, term127770.getClass(), "parseDocumentation", false);
        setField(term127770, term127770.getClass(), "currentMarker", null);
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
        Object retValue = callMethod(klass, "recordThrowDescription", argTypes, term127650, args);
        assertTrue(recursiveEquals(term127650, term127770));
        assertTrue(recursiveEquals(retValue, true));
    }

};


