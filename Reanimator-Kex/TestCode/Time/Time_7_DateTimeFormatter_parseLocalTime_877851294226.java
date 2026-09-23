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

public class DateTimeFormatter_parseLocalTime_877851294226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74423;

    public DateTimeFormatter_parseLocalTime_877851294226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74423 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term74539 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TextField"));
        setField(term74423, term74423.getClass(), "iParser", term74539);
        Object term74601 = newInstance(Class.forName("org.joda.time.tz.UTCProvider"));
        setField(null, Class.forName("org.joda.time.DateTimeZone"), "cDefault", null);
        setField(null, Class.forName("org.joda.time.DateTimeZone"), "cProvider", term74601);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "parseLocalTime", argTypes, term74423, args);
    }

};


