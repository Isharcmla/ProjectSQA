package com.fasterxml.jackson.core;

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
import static com.fasterxml.jackson.core.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.core.EqualityUtils.*;
import java.lang.Object;

public class JsonPointer_parseQuotedTail_953707440107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1303481;

    public JsonPointer_parseQuotedTail_953707440107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1303481 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term1303482 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term1303483 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        setField(term1303483, term1303483.getClass(), "_nextSegment", null);
        setField(term1303483, term1303483.getClass(), "_asString", "");
        setField(term1303483, term1303483.getClass(), "_matchingPropertyName", "");
        setIntField(term1303483, term1303483.getClass(), "_matchingElementIndex", -1);
        setField(term1303482, term1303482.getClass(), "_nextSegment", term1303483);
        setField(term1303482, term1303482.getClass(), "_asString", "/                                                                                                ");
        setField(term1303482, term1303482.getClass(), "_matchingPropertyName", "                                                                                                ");
        setIntField(term1303482, term1303482.getClass(), "_matchingElementIndex", -1);
        setField(term1303481, term1303481.getClass(), "_nextSegment", term1303482);
        setField(term1303481, term1303481.getClass(), "_asString", "                  /                                                                                                ");
        setField(term1303481, term1303481.getClass(), "_matchingPropertyName", "~                 ");
        setIntField(term1303481, term1303481.getClass(), "_matchingElementIndex", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.JsonPointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = "                  /                                                                                                ";
        args[1] = 1;
        Object retValue = callMethod(klass, "_parseQuotedTail", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term1303481));
    }

};


