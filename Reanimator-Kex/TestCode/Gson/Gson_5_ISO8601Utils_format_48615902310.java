package com.google.gson.internal.bind.util;

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
import static com.google.gson.internal.bind.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.gson.internal.bind.util.EqualityUtils.*;

public class ISO8601Utils_format_48615902310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term287;

    public ISO8601Utils_format_48615902310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("java.util.Date"));
        setLongField(term1, term1.getClass(), "fastTime", 1345889412244L);
        setField(term1, term1.getClass(), "cdate", null);
        term287 = newInstance(Class.forName("java.util.Date"));
        setLongField(term287, term287.getClass(), "fastTime", 1345889412244L);
        setField(term287, term287.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.util.ISO8601Utils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term1;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term1, term287));
        assertTrue(recursiveEquals(retValue, "2012-08-25T10:10:12Z"));
    }

};


