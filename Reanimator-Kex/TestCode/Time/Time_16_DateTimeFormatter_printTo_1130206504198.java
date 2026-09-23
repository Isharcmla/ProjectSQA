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

public class DateTimeFormatter_printTo_1130206504198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40752;
     Object term40918;

    public DateTimeFormatter_printTo_1130206504198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40752 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term40866 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$Fraction"));
        setField(term40752, term40752.getClass(), "iPrinter", term40866);
        setField(term40752, term40752.getClass(), "iLocale", null);
        term40918 = newInstance(Class.forName("org.joda.time.LocalTime"));
        Object term40990 = newInstance(Class.forName("org.joda.time.chrono.GJChronology"));
        setField(term40918, term40918.getClass(), "iChronology", term40990);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = Class.forName("org.joda.time.ReadablePartial");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term40918;
        callMethod(klass, "printTo", argTypes, term40752, args);
    }

};


