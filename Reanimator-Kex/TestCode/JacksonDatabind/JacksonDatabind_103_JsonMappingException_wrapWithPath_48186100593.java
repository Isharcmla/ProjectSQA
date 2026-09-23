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

public class JsonMappingException_wrapWithPath_48186100593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207828;
     Object term207866;
     Object term207860;

    public JsonMappingException_wrapWithPath_48186100593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term207828 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        LinkedList term207867 = new LinkedList();
        ((LinkedList) term207867).add((Object)null);
        term207866 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        setField(term207866, term207866.getClass(), "_path", term207867);
        setField(term207866, term207866.getClass(), "_processor", null);
        setField(term207866, term207866.getClass(), "_location", null);
        setField(term207866, term207866.getClass(), "backtrace", null);
        setField(term207866, term207866.getClass(), "detailMessage", null);
        setField(term207866, term207866.getClass(), "cause", null);
        setField(term207866, term207866.getClass(), "stackTrace", null);
        setIntField(term207866, term207866.getClass(), "depth", 0);
        setField(term207866, term207866.getClass(), "suppressedExceptions", null);
        LinkedList term207861 = new LinkedList();
        ((LinkedList) term207861).add((Object)null);
        term207860 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        setField(term207860, term207860.getClass(), "_path", term207861);
        setField(term207860, term207860.getClass(), "_processor", null);
        setField(term207860, term207860.getClass(), "_location", null);
        setField(term207860, term207860.getClass(), "backtrace", null);
        setField(term207860, term207860.getClass(), "detailMessage", null);
        setField(term207860, term207860.getClass(), "cause", null);
        setField(term207860, term207860.getClass(), "stackTrace", null);
        setIntField(term207860, term207860.getClass(), "depth", 0);
        setField(term207860, term207860.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Throwable");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference");
        Object[] args = new Object[2];
        args[0] = term207828;
        args[1] = null;
        Object retValue = callMethod(klass, "wrapWithPath", argTypes, null, args);
        assertTrue(recursiveEquals(term207828, null));
        assertTrue(recursiveEquals(retValue, term207860));
    }

};


