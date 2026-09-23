package org.joda.time;

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
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class LocalDate_toString_1687987170346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177106;

    public LocalDate_toString_1687987170346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177106 = newInstance(Class.forName("org.joda.time.LocalDate"));
        Object term177188 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term177304 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$Composite"));
        Object[] term177053 = (Object[]) newArray("org.joda.time.format.DateTimePrinter", 9);
        Object term177342 = newInstance(Class.forName("java.util.Locale"));
        setIntField(term177304, term177304.getClass(), "iPrintedLengthEstimate", 488);
        setField(term177304, term177304.getClass(), "iPrinters", term177053);
        setField(term177188, term177188.getClass(), "iPrinter", term177304);
        setField(term177188, term177188.getClass(), "iLocale", term177342);
        setField(null, Class.forName("org.joda.time.format.ISODateTimeFormat"), "ymd", term177188);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.LocalDate");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.util.Locale");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "toString", argTypes, term177106, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


