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

public class JsonPointer_parseQuotedTail_953707440113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1531989;

    public JsonPointer_parseQuotedTail_953707440113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1531989 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term1531990 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        Object term1531991 = newInstance(Class.forName("com.fasterxml.jackson.core.JsonPointer"));
        setField(term1531991, term1531991.getClass(), "_nextSegment", null);
        setField(term1531991, term1531991.getClass(), "_asString", "");
        setField(term1531991, term1531991.getClass(), "_matchingPropertyName", "");
        setIntField(term1531991, term1531991.getClass(), "_matchingElementIndex", -1);
        setField(term1531990, term1531990.getClass(), "_nextSegment", term1531991);
        setField(term1531990, term1531990.getClass(), "_asString", "/                                                                                                                                                                                                                                                                                                                                                      ");
        setField(term1531990, term1531990.getClass(), "_matchingPropertyName", "                                                                                                                                                                                                                                                                                                                                                      ");
        setIntField(term1531990, term1531990.getClass(), "_matchingElementIndex", -1);
        setField(term1531989, term1531989.getClass(), "_nextSegment", term1531990);
        setField(term1531989, term1531989.getClass(), "_asString", "                                                                                                                                                    /                                                                                                                                                                                                                                                                                                                                                      ");
        setField(term1531989, term1531989.getClass(), "_matchingPropertyName", "~                                                                                                                                                  ");
        setIntField(term1531989, term1531989.getClass(), "_matchingElementIndex", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.core.JsonPointer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = "                                                                                                                                                    /                                                                                                                                                                                                                                                                                                                                                      ";
        args[1] = 2;
        Object retValue = callMethod(klass, "_parseQuotedTail", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term1531989));
    }

};


