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

public class DateTimeFormatter_printTo_563897694190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38545;
     Object term38723;

    public DateTimeFormatter_printTo_563897694190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38545 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term38671 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset"));
        setField(term38545, term38545.getClass(), "iPrinter", term38671);
        setField(term38545, term38545.getClass(), "iLocale", null);
        term38723 = newInstance(Class.forName("org.joda.time.LocalDate"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.Writer");
        argTypes[1] = Class.forName("org.joda.time.ReadablePartial");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term38723;
        callMethod(klass, "printTo", argTypes, term38545, args);
    }

};


