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

public class JSDocInfoBuilder_hasAnyTypeRelatedTags_479691772468 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171922;
     Object term172040;

    public JSDocInfoBuilder_hasAnyTypeRelatedTags_479691772468() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term171922 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term172002 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term172002, term172002.getClass(), "bitset", 1073741824);
        setField(term172002, term172002.getClass(), "info", null);
        setField(term171922, term171922.getClass(), "currentInfo", term172002);
        term172040 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term172041 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term172041, term172041.getClass(), "info", null);
        setField(term172041, term172041.getClass(), "documentation", null);
        setField(term172041, term172041.getClass(), "sourceName", null);
        setField(term172041, term172041.getClass(), "visibility", null);
        setIntField(term172041, term172041.getClass(), "bitset", 1073741824);
        setField(term172041, term172041.getClass(), "type", null);
        setField(term172041, term172041.getClass(), "thisType", null);
        setBooleanField(term172041, term172041.getClass(), "includeDocumentation", false);
        setField(term172040, term172040.getClass(), "currentInfo", term172041);
        setBooleanField(term172040, term172040.getClass(), "populated", false);
        setBooleanField(term172040, term172040.getClass(), "parseDocumentation", false);
        setField(term172040, term172040.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasAnyTypeRelatedTags", argTypes, term171922, args);
        assertTrue(recursiveEquals(term171922, term172040));
        assertTrue(recursiveEquals(retValue, true));
    }

};


