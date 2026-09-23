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

public class DateTimeFormatter_print_1772950357200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41436;
     Object term41612;

    public DateTimeFormatter_print_1772950357200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41436 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term41552 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TextField"));
        setBooleanField(term41552, term41552.getClass(), "iShort", false);
        setField(term41436, term41436.getClass(), "iPrinter", term41552);
        term41612 = newInstance(Class.forName("org.joda.time.LocalDateTime"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.ReadablePartial");
        Object[] args = new Object[1];
        args[0] = term41612;
        callMethod(klass, "print", argTypes, term41436, args);
    }

};


