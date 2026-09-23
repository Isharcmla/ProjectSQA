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
import java.lang.String;
import java.lang.Object;

public class DateTimeFormatter_printTo_421596020253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85952;

    public DateTimeFormatter_printTo_421596020253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term86148 = Class.forName((String) "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneId");
        Field term86147 = ((Class) term86148).getDeclaredField((String) "INSTANCE");
        ((Field) term86147).setAccessible(true);
        Object enum19 = ((Field) term86147).get((Object) null);
        term85952 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        setField(term85952, term85952.getClass(), "iPrinter", enum19);
        Object term86146 = newInstance(Class.forName("org.joda.time.tz.CachedDateTimeZone"));
        setField(null, Class.forName("org.joda.time.DateTimeZone"), "cDefault", term86146);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = 0L;
        callMethod(klass, "printTo", argTypes, term85952, args);
    }

};


