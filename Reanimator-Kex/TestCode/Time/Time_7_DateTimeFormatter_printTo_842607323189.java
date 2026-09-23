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
import java.lang.NullPointerException;
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class DateTimeFormatter_printTo_842607323189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52112;
     Object term52276;

    public DateTimeFormatter_printTo_842607323189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52112 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term52228 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TextField"));
        setBooleanField(term52228, term52228.getClass(), "iShort", false);
        setField(term52112, term52112.getClass(), "iPrinter", term52228);
        term52276 = newInstance(Class.forName("org.joda.time.Partial"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = Class.forName("org.joda.time.ReadablePartial");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term52276;
        try {
            callMethod(klass, "printTo", argTypes, term52112, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


