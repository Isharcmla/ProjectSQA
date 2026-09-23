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

public class DateTimeFormatterBuilder_canBuildFormatter_730919527172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17092;
     Object term17586;

    public DateTimeFormatterBuilder_canBuildFormatter_730919527172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17092 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term17198 = newInstance(Class.forName("org.joda.time.format.DateTimeFormat$StyleFormatter"));
        setField(term17092, term17092.getClass(), "iFormatter", term17198);
        term17586 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term17587 = newInstance(Class.forName("org.joda.time.format.DateTimeFormat$StyleFormatter"));
        setField(term17586, term17586.getClass(), "iElementPairs", null);
        setIntField(term17587, term17587.getClass(), "iDateStyle", 0);
        setIntField(term17587, term17587.getClass(), "iTimeStyle", 0);
        setIntField(term17587, term17587.getClass(), "iType", 0);
        setField(term17586, term17586.getClass(), "iFormatter", term17587);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "canBuildFormatter", argTypes, term17092, args);
        assertTrue(recursiveEquals(term17092, term17586));
    }

};


