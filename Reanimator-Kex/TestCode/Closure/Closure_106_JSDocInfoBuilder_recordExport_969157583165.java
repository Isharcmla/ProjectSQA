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

public class JSDocInfoBuilder_recordExport_969157583165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110876;
     Object term111164;

    public JSDocInfoBuilder_recordExport_969157583165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110876 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term110956 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setIntField(term110956, term110956.getClass(), "bitset", 0);
        setField(term110876, term110876.getClass(), "currentInfo", term110956);
        term111164 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfoBuilder"));
        Object term111165 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term111165, term111165.getClass(), "info", null);
        setField(term111165, term111165.getClass(), "documentation", null);
        setField(term111165, term111165.getClass(), "sourceName", null);
        setField(term111165, term111165.getClass(), "visibility", null);
        setIntField(term111165, term111165.getClass(), "bitset", 1024);
        setField(term111165, term111165.getClass(), "type", null);
        setField(term111165, term111165.getClass(), "thisType", null);
        setBooleanField(term111165, term111165.getClass(), "includeDocumentation", false);
        setField(term111164, term111164.getClass(), "currentInfo", term111165);
        setBooleanField(term111164, term111164.getClass(), "populated", true);
        setBooleanField(term111164, term111164.getClass(), "parseDocumentation", false);
        setField(term111164, term111164.getClass(), "currentMarker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.JSDocInfoBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "recordExport", argTypes, term110876, args);
        assertTrue(recursiveEquals(term110876, term111164));
        assertTrue(recursiveEquals(retValue, true));
    }

};


