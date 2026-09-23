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

public class DateTimeFormatter_printTo_208886395255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88418;

    public DateTimeFormatter_printTo_208886395255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88418 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term88540 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$TimeZoneName"));
        setIntField(term88540, term88540.getClass(), "iType", -2);
        setField(term88418, term88418.getClass(), "iPrinter", term88540);
        Object term88642 = newInstance(Class.forName("org.joda.time.DateTimeUtils$SystemMillisProvider"));
        setField(null, Class.forName("org.joda.time.DateTimeUtils"), "cMillisProvider", term88642);
        Object term88704 = newInstance(Class.forName("org.joda.time.tz.UTCProvider"));
        setField(null, Class.forName("org.joda.time.DateTimeZone"), "cDefault", null);
        setField(null, Class.forName("org.joda.time.DateTimeZone"), "cProvider", term88704);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = Class.forName("org.joda.time.ReadableInstant");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "printTo", argTypes, term88418, args);
    }

};


