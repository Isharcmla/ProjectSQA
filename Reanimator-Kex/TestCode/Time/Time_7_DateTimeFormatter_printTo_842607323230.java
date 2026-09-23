package org.joda.time.format;

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
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.StringBuilder;

public class DateTimeFormatter_printTo_842607323230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77552;
     Object term77728;
     Object term77776;

    public DateTimeFormatter_printTo_842607323230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77552 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term77668 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TextField"));
        setBooleanField(term77668, term77668.getClass(), "iShort", false);
        setField(term77668, term77668.getClass(), "iFieldType", null);
        setField(term77552, term77552.getClass(), "iPrinter", term77668);
        setField(term77552, term77552.getClass(), "iLocale", null);
        term77728 = new StringBuilder();
        term77776 = newInstance(Class.forName("org.joda.time.Partial"));
        setField(term77776, term77776.getClass(), "iTypes", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = Class.forName("org.joda.time.ReadablePartial");
        Object[] args = new Object[2];
        args[0] = term77728;
        args[1] = term77776;
        callMethod(klass, "printTo", argTypes, term77552, args);
    }

};


