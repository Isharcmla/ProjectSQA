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

public class DateTimeFormatter_printTo_208886395218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68569;
     Object term68755;

    public DateTimeFormatter_printTo_208886395218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68569 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term68691 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneName"));
        setIntField(term68691, term68691.getClass(), "iType", -2);
        setField(term68569, term68569.getClass(), "iPrinter", term68691);
        term68755 = newInstance(Class.forName("org.joda.time.MutableDateTime"));
        Object term68817 = newInstance(Class.forName("org.joda.time.DateTimeZone$1"));
        setLongField(term68755, term68755.getClass(), "iMillis", 0L);
        setField(term68755, term68755.getClass(), "iChronology", term68817);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = Class.forName("org.joda.time.ReadableInstant");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term68755;
        callMethod(klass, "printTo", argTypes, term68569, args);
    }

};


