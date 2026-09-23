package com.fasterxml.jackson.core.util;

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
import static com.fasterxml.jackson.core.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.core.util.EqualityUtils.*;
import java.lang.Object;

public class JsonParserSequence_createFlattened_142082991425 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3765;
     Object term3791;
     Object term3783;

    public JsonParserSequence_createFlattened_142082991425() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3765 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object[] term3628 = (Object[]) newArray("com.fasterxml.jackson.core.JsonParser", 114);
        setIntField(term3765, term3765.getClass(), "_nextParser", 115);
        setField(term3765, term3765.getClass(), "_parsers", term3628);
        term3791 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object[] term3792 = (Object[]) newArray("com.fasterxml.jackson.core.JsonParser", 114);
        setField(term3791, term3791.getClass(), "_parsers", term3792);
        setIntField(term3791, term3791.getClass(), "_nextParser", 115);
        setField(term3791, term3791.getClass(), "delegate", null);
        setIntField(term3791, term3791.getClass(), "_features", 0);
        setField(term3791, term3791.getClass(), "_requestPayload", null);
        term3783 = newInstance(Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence"));
        Object[] term3784 = (Object[]) newArray("com.fasterxml.jackson.core.JsonParser", 1);
        setField(term3783, term3783.getClass(), "_parsers", term3784);
        setIntField(term3783, term3783.getClass(), "_nextParser", 1);
        setField(term3783, term3783.getClass(), "delegate", null);
        setIntField(term3783, term3783.getClass(), "_features", 0);
        setField(term3783, term3783.getClass(), "_requestPayload", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.util.JsonParserSequence");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        Object[] args = new Object[2];
        args[0] = term3765;
        args[1] = null;
        Object retValue = callMethod(klass, "createFlattened", argTypes, null, args);
        assertTrue(recursiveEquals(term3765, term3791));
        assertTrue(recursiveEquals(retValue, term3783));
    }

};


