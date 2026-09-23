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

public class StdDateFormat_format_4263584762 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8580;

    public StdDateFormat_format_4263584762() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8580 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(term8580, term8580.getClass(), "_timezone", null);
        setField(term8580, term8580.getClass(), "_locale", null);
        setField(term8580, term8580.getClass(), "_lenient", null);
        setField(term8580, term8580.getClass(), "_calendar", null);
        setField(term8580, term8580.getClass(), "_formatRFC1123", null);
        setBooleanField(term8580, term8580.getClass(), "_tzSerializedWithColon", false);
        setField(term8580, term8580.getClass(), "calendar", null);
        setField(term8580, term8580.getClass(), "numberFormat", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.util.TimeZone");
        argTypes[1] = Class.forName("java.util.Locale");
        argTypes[2] = Class.forName("java.util.Date");
        argTypes[3] = Class.forName("java.lang.StringBuffer");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "_format", argTypes, term8580, args);
    }

};


