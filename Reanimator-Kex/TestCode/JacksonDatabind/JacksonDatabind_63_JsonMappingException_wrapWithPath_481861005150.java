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

public class JsonMappingException_wrapWithPath_481861005150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term267592;
     Object term270997;
     Object term270991;

    public JsonMappingException_wrapWithPath_481861005150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term267592 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        setField(term267592, term267592.getClass(), "_path", null);
        LinkedList term270998 = new LinkedList();
        ((LinkedList) term270998).add((Object)null);
        term270997 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        setField(term270997, term270997.getClass(), "_path", term270998);
        setField(term270997, term270997.getClass(), "_processor", null);
        setField(term270997, term270997.getClass(), "_location", null);
        setField(term270997, term270997.getClass(), "backtrace", null);
        setField(term270997, term270997.getClass(), "detailMessage", null);
        setField(term270997, term270997.getClass(), "cause", null);
        setField(term270997, term270997.getClass(), "stackTrace", null);
        setIntField(term270997, term270997.getClass(), "depth", 0);
        setField(term270997, term270997.getClass(), "suppressedExceptions", null);
        LinkedList term270992 = new LinkedList();
        ((LinkedList) term270992).add((Object)null);
        term270991 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        setField(term270991, term270991.getClass(), "_path", term270992);
        setField(term270991, term270991.getClass(), "_processor", null);
        setField(term270991, term270991.getClass(), "_location", null);
        setField(term270991, term270991.getClass(), "backtrace", null);
        setField(term270991, term270991.getClass(), "detailMessage", null);
        setField(term270991, term270991.getClass(), "cause", null);
        setField(term270991, term270991.getClass(), "stackTrace", null);
        setIntField(term270991, term270991.getClass(), "depth", 0);
        setField(term270991, term270991.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Throwable");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference");
        Object[] args = new Object[2];
        args[0] = term267592;
        args[1] = null;
        Object retValue = callMethod(klass, "wrapWithPath", argTypes, null, args);
        assertTrue(recursiveEquals(term267592, null));
        assertTrue(recursiveEquals(retValue, term270991));
    }

};


