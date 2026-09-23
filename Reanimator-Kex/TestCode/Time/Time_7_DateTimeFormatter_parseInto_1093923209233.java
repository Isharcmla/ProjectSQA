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

public class DateTimeFormatter_parseInto_1093923209233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78423;
     Object term78613;

    public DateTimeFormatter_parseInto_1093923209233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78423 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term78549 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber"));
        setField(term78423, term78423.getClass(), "iParser", term78549);
        term78613 = newInstance(Class.forName("org.joda.time.MutableDateTime"));
        Object term78685 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        setLongField(term78613, term78613.getClass(), "iMillis", 0L);
        setField(term78613, term78613.getClass(), "iChronology", term78685);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.joda.time.ReadWritableInstant");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term78613;
        args[1] = null;
        args[2] = 0;
        callMethod(klass, "parseInto", argTypes, term78423, args);
    }

};


