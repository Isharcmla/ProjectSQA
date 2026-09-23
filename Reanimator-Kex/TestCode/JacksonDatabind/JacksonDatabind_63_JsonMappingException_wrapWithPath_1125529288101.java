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

public class JsonMappingException_wrapWithPath_1125529288101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194497;
     Object term194625;
     Object term201454;
     Object term201457;
     Object term201445;

    public JsonMappingException_wrapWithPath_1125529288101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term194497 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        term194625 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference"));
        term201454 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference"));
        setField(term201454, term201454.getClass(), "_from", null);
        setField(term201454, term201454.getClass(), "_fieldName", null);
        setIntField(term201454, term201454.getClass(), "_index", 0);
        setField(term201454, term201454.getClass(), "_desc", null);
        Object term201460 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference"));
        Object term201461 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference"));
        setField(term201461, term201461.getClass(), "_from", null);
        setField(term201461, term201461.getClass(), "_fieldName", null);
        setIntField(term201461, term201461.getClass(), "_index", 0);
        setField(term201461, term201461.getClass(), "_desc", null);
        setField(term201460, term201460.getClass(), "_from", term201461);
        setField(term201460, term201460.getClass(), "_fieldName", "");
        setIntField(term201460, term201460.getClass(), "_index", -1);
        setField(term201460, term201460.getClass(), "_desc", null);
        LinkedList term201458 = new LinkedList();
        ((LinkedList) term201458).add(term201460);
        term201457 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        setField(term201457, term201457.getClass(), "_path", term201458);
        setField(term201457, term201457.getClass(), "_processor", null);
        setField(term201457, term201457.getClass(), "_location", null);
        setField(term201457, term201457.getClass(), "backtrace", null);
        setField(term201457, term201457.getClass(), "detailMessage", null);
        setField(term201457, term201457.getClass(), "cause", null);
        setField(term201457, term201457.getClass(), "stackTrace", null);
        setIntField(term201457, term201457.getClass(), "depth", 0);
        setField(term201457, term201457.getClass(), "suppressedExceptions", null);
        Object term201449 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference"));
        Object term201432 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference"));
        setField(term201432, term201432.getClass(), "_from", null);
        setField(term201432, term201432.getClass(), "_fieldName", null);
        setIntField(term201432, term201432.getClass(), "_index", 0);
        setField(term201432, term201432.getClass(), "_desc", null);
        setField(term201449, term201449.getClass(), "_from", term201432);
        setField(term201449, term201449.getClass(), "_fieldName", "");
        setIntField(term201449, term201449.getClass(), "_index", -1);
        setField(term201449, term201449.getClass(), "_desc", null);
        LinkedList term201446 = new LinkedList();
        ((LinkedList) term201446).add(term201449);
        term201445 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        setField(term201445, term201445.getClass(), "_path", term201446);
        setField(term201445, term201445.getClass(), "_processor", null);
        setField(term201445, term201445.getClass(), "_location", null);
        setField(term201445, term201445.getClass(), "backtrace", null);
        setField(term201445, term201445.getClass(), "detailMessage", null);
        setField(term201445, term201445.getClass(), "cause", null);
        setField(term201445, term201445.getClass(), "stackTrace", null);
        setIntField(term201445, term201445.getClass(), "depth", 0);
        setField(term201445, term201445.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Throwable");
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term194497;
        args[1] = term194625;
        args[2] = "";
        Object retValue = callMethod(klass, "wrapWithPath", argTypes, null, args);
        assertTrue(recursiveEquals(term194497, term201454));
        assertTrue(recursiveEquals(term194625, ""));
        assertTrue(recursiveEquals(retValue, term201445));
    }

};


