package com.fasterxml.jackson.databind.util;

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
import static com.fasterxml.jackson.databind.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class StdDateFormat_cloneFormat_63753880047 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6536;

    public StdDateFormat_cloneFormat_63753880047() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6536 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(term6536, term6536.getClass(), "_timezone", null);
        setField(term6536, term6536.getClass(), "_locale", null);
        setField(term6536, term6536.getClass(), "_lenient", null);
        setField(term6536, term6536.getClass(), "_formatRFC1123", null);
        setField(term6536, term6536.getClass(), "_formatISO8601", null);
        setField(term6536, term6536.getClass(), "_formatISO8601_z", null);
        setField(term6536, term6536.getClass(), "_formatPlain", null);
        setField(term6536, term6536.getClass(), "calendar", null);
        setField(term6536, term6536.getClass(), "numberFormat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.text.DateFormat");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.util.TimeZone");
        argTypes[3] = Class.forName("java.util.Locale");
        argTypes[4] = Class.forName("java.lang.Boolean");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        callMethod(klass, "_cloneFormat", argTypes, term6536, args);
    }

};


