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

public class JsonMappingException_wrapWithPath_973274243117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term238025;
     Object term238153;
     Object term240901;
     Object term240902;
     Object term240893;

    public JsonMappingException_wrapWithPath_973274243117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term238025 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        term238153 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference"));
        term240901 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference"));
        setField(term240901, term240901.getClass(), "_from", null);
        setField(term240901, term240901.getClass(), "_fieldName", null);
        setIntField(term240901, term240901.getClass(), "_index", 0);
        setField(term240901, term240901.getClass(), "_desc", null);
        Object term240905 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference"));
        Object term240906 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference"));
        setField(term240906, term240906.getClass(), "_from", null);
        setField(term240906, term240906.getClass(), "_fieldName", null);
        setIntField(term240906, term240906.getClass(), "_index", 0);
        setField(term240906, term240906.getClass(), "_desc", null);
        setField(term240905, term240905.getClass(), "_from", term240906);
        setField(term240905, term240905.getClass(), "_fieldName", null);
        setIntField(term240905, term240905.getClass(), "_index", 0);
        setField(term240905, term240905.getClass(), "_desc", null);
        LinkedList term240903 = new LinkedList();
        ((LinkedList) term240903).add(term240905);
        term240902 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        setField(term240902, term240902.getClass(), "_path", term240903);
        setField(term240902, term240902.getClass(), "_processor", null);
        setField(term240902, term240902.getClass(), "_location", null);
        setField(term240902, term240902.getClass(), "backtrace", null);
        setField(term240902, term240902.getClass(), "detailMessage", null);
        setField(term240902, term240902.getClass(), "cause", null);
        setField(term240902, term240902.getClass(), "stackTrace", null);
        setIntField(term240902, term240902.getClass(), "depth", 0);
        setField(term240902, term240902.getClass(), "suppressedExceptions", null);
        Object term240897 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference"));
        Object term240881 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference"));
        setField(term240881, term240881.getClass(), "_from", null);
        setField(term240881, term240881.getClass(), "_fieldName", null);
        setIntField(term240881, term240881.getClass(), "_index", 0);
        setField(term240881, term240881.getClass(), "_desc", null);
        setField(term240897, term240897.getClass(), "_from", term240881);
        setField(term240897, term240897.getClass(), "_fieldName", null);
        setIntField(term240897, term240897.getClass(), "_index", 0);
        setField(term240897, term240897.getClass(), "_desc", null);
        LinkedList term240894 = new LinkedList();
        ((LinkedList) term240894).add(term240897);
        term240893 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        setField(term240893, term240893.getClass(), "_path", term240894);
        setField(term240893, term240893.getClass(), "_processor", null);
        setField(term240893, term240893.getClass(), "_location", null);
        setField(term240893, term240893.getClass(), "backtrace", null);
        setField(term240893, term240893.getClass(), "detailMessage", null);
        setField(term240893, term240893.getClass(), "cause", null);
        setField(term240893, term240893.getClass(), "stackTrace", null);
        setIntField(term240893, term240893.getClass(), "depth", 0);
        setField(term240893, term240893.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Throwable");
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term238025;
        args[1] = term238153;
        args[2] = 0;
        Object retValue = callMethod(klass, "wrapWithPath", argTypes, null, args);
        assertTrue(recursiveEquals(term238025, term240901));
        assertTrue(recursiveEquals(term238153, 0));
        assertTrue(recursiveEquals(retValue, term240893));
    }

};


