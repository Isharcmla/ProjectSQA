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
import static org.joda.time.format.EqualityUtils.*;
import java.lang.Object;

public class DateTimeFormatterBuilder_canBuildFormatter_730919527200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22518;
     Object term23044;

    public DateTimeFormatterBuilder_canBuildFormatter_730919527200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22518 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term22644 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$MatchingParser"));
        setField(term22518, term22518.getClass(), "iFormatter", term22644);
        term23044 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term23045 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder$MatchingParser"));
        setField(term23044, term23044.getClass(), "iElementPairs", null);
        setField(term23045, term23045.getClass(), "iParsers", null);
        setIntField(term23045, term23045.getClass(), "iParsedLengthEstimate", 0);
        setField(term23044, term23044.getClass(), "iFormatter", term23045);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "canBuildFormatter", argTypes, term22518, args);
        assertTrue(recursiveEquals(term22518, term23044));
    }

};


