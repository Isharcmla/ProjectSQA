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

public class DateTimeParserBucket_setZone_13610137643 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12582;
     Object term12656;

    public DateTimeParserBucket_setZone_13610137643() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12582 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket"));
        setField(term12582, term12582.getClass(), "iSavedState", null);
        term12656 = newInstance(Class.forName("org.joda.time.tz.FixedDateTimeZone"));
        setField(term12656, term12656.getClass(), "iNameKey", "UTC");
        setIntField(term12656, term12656.getClass(), "iWallOffset", 0);
        setIntField(term12656, term12656.getClass(), "iStandardOffset", 0);
        setField(term12656, term12656.getClass(), "iID", "UTC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeParserBucket");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.DateTimeZone");
        Object[] args = new Object[1];
        args[0] = term12656;
        callMethod(klass, "setZone", argTypes, term12582, args);
    }

};


