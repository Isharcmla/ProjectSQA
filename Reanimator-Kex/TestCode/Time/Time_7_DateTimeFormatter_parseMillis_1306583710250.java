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

public class DateTimeFormatter_parseMillis_1306583710250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84585;

    public DateTimeFormatter_parseMillis_1306583710250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84585 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatter"));
        Object term84691 = newInstance(Class.forName("org.joda.time.format.DateTimeFormat$StyleFormatter"));
        Object term84771 = newInstance(Class.forName("org.joda.time.chrono.CopticChronology"));
        setField(term84585, term84585.getClass(), "iParser", term84691);
        setField(term84771, term84771.getClass(), "iBase", null);
        setField(term84585, term84585.getClass(), "iChrono", term84771);
        setField(term84585, term84585.getClass(), "iZone", null);
        setField(term84585, term84585.getClass(), "iLocale", null);
        setField(term84585, term84585.getClass(), "iPivotYear", null);
        setIntField(term84585, term84585.getClass(), "iDefaultYear", 0);
        setField(null, Class.forName("java.util.Locale"), "defaultLocale", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "parseMillis", argTypes, term84585, args);
    }

};


