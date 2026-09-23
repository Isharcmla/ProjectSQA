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

public class JsonMappingException_wrapWithPath_481861005114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term215277;
     Object term218612;
     Object term218606;

    public JsonMappingException_wrapWithPath_481861005114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term215277 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        LinkedList term218613 = new LinkedList();
        ((LinkedList) term218613).add((Object)null);
        term218612 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        setField(term218612, term218612.getClass(), "_path", term218613);
        setField(term218612, term218612.getClass(), "_processor", null);
        setField(term218612, term218612.getClass(), "_location", null);
        setField(term218612, term218612.getClass(), "backtrace", null);
        setField(term218612, term218612.getClass(), "detailMessage", null);
        setField(term218612, term218612.getClass(), "cause", null);
        setField(term218612, term218612.getClass(), "stackTrace", null);
        setIntField(term218612, term218612.getClass(), "depth", 0);
        setField(term218612, term218612.getClass(), "suppressedExceptions", null);
        LinkedList term218607 = new LinkedList();
        ((LinkedList) term218607).add((Object)null);
        term218606 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        setField(term218606, term218606.getClass(), "_path", term218607);
        setField(term218606, term218606.getClass(), "_processor", null);
        setField(term218606, term218606.getClass(), "_location", null);
        setField(term218606, term218606.getClass(), "backtrace", null);
        setField(term218606, term218606.getClass(), "detailMessage", null);
        setField(term218606, term218606.getClass(), "cause", null);
        setField(term218606, term218606.getClass(), "stackTrace", null);
        setIntField(term218606, term218606.getClass(), "depth", 0);
        setField(term218606, term218606.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Throwable");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference");
        Object[] args = new Object[2];
        args[0] = term215277;
        args[1] = null;
        Object retValue = callMethod(klass, "wrapWithPath", argTypes, null, args);
        assertTrue(recursiveEquals(term215277, null));
        assertTrue(recursiveEquals(retValue, term218606));
    }

};


