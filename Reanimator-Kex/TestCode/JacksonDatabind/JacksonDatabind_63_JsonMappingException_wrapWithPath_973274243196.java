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

public class JsonMappingException_wrapWithPath_973274243196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term325496;
     Object term325624;
     Object term329007;
     Object term329008;
     Object term328999;

    public JsonMappingException_wrapWithPath_973274243196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term325496 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        setField(term325496, term325496.getClass(), "_path", null);
        term325624 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference"));
        term329007 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference"));
        setField(term329007, term329007.getClass(), "_from", null);
        setField(term329007, term329007.getClass(), "_fieldName", null);
        setIntField(term329007, term329007.getClass(), "_index", 0);
        setField(term329007, term329007.getClass(), "_desc", null);
        Object term329011 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference"));
        Object term329012 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference"));
        setField(term329012, term329012.getClass(), "_from", null);
        setField(term329012, term329012.getClass(), "_fieldName", null);
        setIntField(term329012, term329012.getClass(), "_index", 0);
        setField(term329012, term329012.getClass(), "_desc", null);
        setField(term329011, term329011.getClass(), "_from", term329012);
        setField(term329011, term329011.getClass(), "_fieldName", null);
        setIntField(term329011, term329011.getClass(), "_index", 0);
        setField(term329011, term329011.getClass(), "_desc", null);
        LinkedList term329009 = new LinkedList();
        ((LinkedList) term329009).add(term329011);
        term329008 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        setField(term329008, term329008.getClass(), "_path", term329009);
        setField(term329008, term329008.getClass(), "_processor", null);
        setField(term329008, term329008.getClass(), "_location", null);
        setField(term329008, term329008.getClass(), "backtrace", null);
        setField(term329008, term329008.getClass(), "detailMessage", null);
        setField(term329008, term329008.getClass(), "cause", null);
        setField(term329008, term329008.getClass(), "stackTrace", null);
        setIntField(term329008, term329008.getClass(), "depth", 0);
        setField(term329008, term329008.getClass(), "suppressedExceptions", null);
        Object term329003 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference"));
        Object term328987 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference"));
        setField(term328987, term328987.getClass(), "_from", null);
        setField(term328987, term328987.getClass(), "_fieldName", null);
        setIntField(term328987, term328987.getClass(), "_index", 0);
        setField(term328987, term328987.getClass(), "_desc", null);
        setField(term329003, term329003.getClass(), "_from", term328987);
        setField(term329003, term329003.getClass(), "_fieldName", null);
        setIntField(term329003, term329003.getClass(), "_index", 0);
        setField(term329003, term329003.getClass(), "_desc", null);
        LinkedList term329000 = new LinkedList();
        ((LinkedList) term329000).add(term329003);
        term328999 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        setField(term328999, term328999.getClass(), "_path", term329000);
        setField(term328999, term328999.getClass(), "_processor", null);
        setField(term328999, term328999.getClass(), "_location", null);
        setField(term328999, term328999.getClass(), "backtrace", null);
        setField(term328999, term328999.getClass(), "detailMessage", null);
        setField(term328999, term328999.getClass(), "cause", null);
        setField(term328999, term328999.getClass(), "stackTrace", null);
        setIntField(term328999, term328999.getClass(), "depth", 0);
        setField(term328999, term328999.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Throwable");
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term325496;
        args[1] = term325624;
        args[2] = 0;
        Object retValue = callMethod(klass, "wrapWithPath", argTypes, null, args);
        assertTrue(recursiveEquals(term325496, term329007));
        assertTrue(recursiveEquals(term325624, 0));
        assertTrue(recursiveEquals(retValue, term328999));
    }

};


