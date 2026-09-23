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

public class JsonMappingException_wrapWithPath_1125529288203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term333411;
     Object term333503;
     Object term333877;
     Object term333880;
     Object term333868;

    public JsonMappingException_wrapWithPath_1125529288203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term333465 = new LinkedList();
        term333411 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        setField(term333411, term333411.getClass(), "_path", term333465);
        term333503 = newInstance(Class.forName("java.lang.Object"));
        term333877 = newInstance(Class.forName("java.lang.Object"));
        Object term333883 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference"));
        Object term333884 = newInstance(Class.forName("java.lang.Object"));
        setField(term333883, term333883.getClass(), "_from", term333884);
        setField(term333883, term333883.getClass(), "_fieldName", "");
        setIntField(term333883, term333883.getClass(), "_index", -1);
        setField(term333883, term333883.getClass(), "_desc", null);
        LinkedList term333881 = new LinkedList();
        ((LinkedList) term333881).add(term333883);
        term333880 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        setField(term333880, term333880.getClass(), "_path", term333881);
        setField(term333880, term333880.getClass(), "_processor", null);
        setField(term333880, term333880.getClass(), "_location", null);
        setField(term333880, term333880.getClass(), "backtrace", null);
        setField(term333880, term333880.getClass(), "detailMessage", null);
        setField(term333880, term333880.getClass(), "cause", null);
        setField(term333880, term333880.getClass(), "stackTrace", null);
        setIntField(term333880, term333880.getClass(), "depth", 0);
        setField(term333880, term333880.getClass(), "suppressedExceptions", null);
        Object term333872 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference"));
        Object term333856 = newInstance(Class.forName("java.lang.Object"));
        setField(term333872, term333872.getClass(), "_from", term333856);
        setField(term333872, term333872.getClass(), "_fieldName", "");
        setIntField(term333872, term333872.getClass(), "_index", -1);
        setField(term333872, term333872.getClass(), "_desc", null);
        LinkedList term333869 = new LinkedList();
        ((LinkedList) term333869).add(term333872);
        term333868 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        setField(term333868, term333868.getClass(), "_path", term333869);
        setField(term333868, term333868.getClass(), "_processor", null);
        setField(term333868, term333868.getClass(), "_location", null);
        setField(term333868, term333868.getClass(), "backtrace", null);
        setField(term333868, term333868.getClass(), "detailMessage", null);
        setField(term333868, term333868.getClass(), "cause", null);
        setField(term333868, term333868.getClass(), "stackTrace", null);
        setIntField(term333868, term333868.getClass(), "depth", 0);
        setField(term333868, term333868.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Throwable");
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term333411;
        args[1] = term333503;
        args[2] = "";
        Object retValue = callMethod(klass, "wrapWithPath", argTypes, null, args);
        assertTrue(recursiveEquals(term333411, term333877));
        assertTrue(recursiveEquals(term333503, ""));
        assertTrue(recursiveEquals(retValue, term333868));
    }

};


