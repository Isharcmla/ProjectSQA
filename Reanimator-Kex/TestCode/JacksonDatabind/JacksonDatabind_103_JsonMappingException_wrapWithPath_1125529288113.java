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

public class JsonMappingException_wrapWithPath_1125529288113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term231220;
     Object term231348;
     Object term237071;
     Object term237074;
     Object term237062;

    public JsonMappingException_wrapWithPath_1125529288113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term231220 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        term231348 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference"));
        term237071 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference"));
        setField(term237071, term237071.getClass(), "_from", null);
        setField(term237071, term237071.getClass(), "_fieldName", null);
        setIntField(term237071, term237071.getClass(), "_index", 0);
        setField(term237071, term237071.getClass(), "_desc", null);
        Object term237077 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference"));
        Object term237078 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference"));
        setField(term237078, term237078.getClass(), "_from", null);
        setField(term237078, term237078.getClass(), "_fieldName", null);
        setIntField(term237078, term237078.getClass(), "_index", 0);
        setField(term237078, term237078.getClass(), "_desc", null);
        setField(term237077, term237077.getClass(), "_from", term237078);
        setField(term237077, term237077.getClass(), "_fieldName", "");
        setIntField(term237077, term237077.getClass(), "_index", -1);
        setField(term237077, term237077.getClass(), "_desc", null);
        LinkedList term237075 = new LinkedList();
        ((LinkedList) term237075).add(term237077);
        term237074 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        setField(term237074, term237074.getClass(), "_path", term237075);
        setField(term237074, term237074.getClass(), "_processor", null);
        setField(term237074, term237074.getClass(), "_location", null);
        setField(term237074, term237074.getClass(), "backtrace", null);
        setField(term237074, term237074.getClass(), "detailMessage", null);
        setField(term237074, term237074.getClass(), "cause", null);
        setField(term237074, term237074.getClass(), "stackTrace", null);
        setIntField(term237074, term237074.getClass(), "depth", 0);
        setField(term237074, term237074.getClass(), "suppressedExceptions", null);
        Object term237066 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference"));
        Object term237049 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference"));
        setField(term237049, term237049.getClass(), "_from", null);
        setField(term237049, term237049.getClass(), "_fieldName", null);
        setIntField(term237049, term237049.getClass(), "_index", 0);
        setField(term237049, term237049.getClass(), "_desc", null);
        setField(term237066, term237066.getClass(), "_from", term237049);
        setField(term237066, term237066.getClass(), "_fieldName", "");
        setIntField(term237066, term237066.getClass(), "_index", -1);
        setField(term237066, term237066.getClass(), "_desc", null);
        LinkedList term237063 = new LinkedList();
        ((LinkedList) term237063).add(term237066);
        term237062 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        setField(term237062, term237062.getClass(), "_path", term237063);
        setField(term237062, term237062.getClass(), "_processor", null);
        setField(term237062, term237062.getClass(), "_location", null);
        setField(term237062, term237062.getClass(), "backtrace", null);
        setField(term237062, term237062.getClass(), "detailMessage", null);
        setField(term237062, term237062.getClass(), "cause", null);
        setField(term237062, term237062.getClass(), "stackTrace", null);
        setIntField(term237062, term237062.getClass(), "depth", 0);
        setField(term237062, term237062.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Throwable");
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term231220;
        args[1] = term231348;
        args[2] = "";
        Object retValue = callMethod(klass, "wrapWithPath", argTypes, null, args);
        assertTrue(recursiveEquals(term231220, term237071));
        assertTrue(recursiveEquals(term231348, ""));
        assertTrue(recursiveEquals(retValue, term237062));
    }

};


