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
import java.lang.Boolean;

public class StdDateFormat_setLenient_122336312255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8564;
     Object term8566;

    public StdDateFormat_setLenient_122336312255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8564 = newInstance(Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat"));
        setField(term8564, term8564.getClass(), "_timezone", null);
        setField(term8564, term8564.getClass(), "_locale", null);
        setField(term8564, term8564.getClass(), "_lenient", null);
        setField(term8564, term8564.getClass(), "_calendar", null);
        setField(term8564, term8564.getClass(), "_formatRFC1123", null);
        setBooleanField(term8564, term8564.getClass(), "_tzSerializedWithColon", false);
        setField(term8564, term8564.getClass(), "calendar", null);
        setField(term8564, term8564.getClass(), "numberFormat", null);
        term8566 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.util.StdDateFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term8566;
        callMethod(klass, "setLenient", argTypes, term8564, args);
    }

};


