package com.fasterxml.jackson.databind;

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
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.EqualityUtils.*;
import java.util.LinkedList;
import java.lang.Object;

public class JsonMappingException_wrapWithPath_973274243111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term211851;
     Object term211979;
     Object term214345;
     Object term214346;
     Object term214124;

    public JsonMappingException_wrapWithPath_973274243111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term211851 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        term211979 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference"));
        term214345 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference"));
        setField(term214345, term214345.getClass(), "_from", null);
        setField(term214345, term214345.getClass(), "_fieldName", null);
        setIntField(term214345, term214345.getClass(), "_index", 0);
        setField(term214345, term214345.getClass(), "_desc", null);
        Object term214349 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference"));
        Object term214350 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference"));
        setField(term214350, term214350.getClass(), "_from", null);
        setField(term214350, term214350.getClass(), "_fieldName", null);
        setIntField(term214350, term214350.getClass(), "_index", 0);
        setField(term214350, term214350.getClass(), "_desc", null);
        setField(term214349, term214349.getClass(), "_from", term214350);
        setField(term214349, term214349.getClass(), "_fieldName", null);
        setIntField(term214349, term214349.getClass(), "_index", 0);
        setField(term214349, term214349.getClass(), "_desc", null);
        LinkedList term214347 = new LinkedList();
        ((LinkedList) term214347).add(term214349);
        term214346 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        setField(term214346, term214346.getClass(), "_path", term214347);
        setField(term214346, term214346.getClass(), "_processor", null);
        setField(term214346, term214346.getClass(), "_location", null);
        setField(term214346, term214346.getClass(), "backtrace", null);
        setField(term214346, term214346.getClass(), "detailMessage", null);
        setField(term214346, term214346.getClass(), "cause", null);
        setField(term214346, term214346.getClass(), "stackTrace", null);
        setIntField(term214346, term214346.getClass(), "depth", 0);
        setField(term214346, term214346.getClass(), "suppressedExceptions", null);
        Object term214128 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference"));
        Object term214112 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference"));
        setField(term214112, term214112.getClass(), "_from", null);
        setField(term214112, term214112.getClass(), "_fieldName", null);
        setIntField(term214112, term214112.getClass(), "_index", 0);
        setField(term214112, term214112.getClass(), "_desc", null);
        setField(term214128, term214128.getClass(), "_from", term214112);
        setField(term214128, term214128.getClass(), "_fieldName", null);
        setIntField(term214128, term214128.getClass(), "_index", 0);
        setField(term214128, term214128.getClass(), "_desc", null);
        LinkedList term214125 = new LinkedList();
        ((LinkedList) term214125).add(term214128);
        term214124 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        setField(term214124, term214124.getClass(), "_path", term214125);
        setField(term214124, term214124.getClass(), "_processor", null);
        setField(term214124, term214124.getClass(), "_location", null);
        setField(term214124, term214124.getClass(), "backtrace", null);
        setField(term214124, term214124.getClass(), "detailMessage", null);
        setField(term214124, term214124.getClass(), "cause", null);
        setField(term214124, term214124.getClass(), "stackTrace", null);
        setIntField(term214124, term214124.getClass(), "depth", 0);
        setField(term214124, term214124.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Throwable");
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term211851;
        args[1] = term211979;
        args[2] = 0;
        Object retValue = callMethod(klass, "wrapWithPath", argTypes, null, args);
        assertTrue(recursiveEquals(term211851, term214345));
        assertTrue(recursiveEquals(term211979, 0));
        assertTrue(recursiveEquals(retValue, term214124));
    }

};


