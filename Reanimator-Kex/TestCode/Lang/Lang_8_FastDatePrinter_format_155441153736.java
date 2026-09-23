package org.apache.commons.lang3.time;

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
import static org.apache.commons.lang3.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class FastDatePrinter_format_155441153736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18966;

    public FastDatePrinter_format_155441153736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18966 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDatePrinter"));
        Object[] term18823 = (Object[]) newArray("org.apache.commons.lang3.time.FastDatePrinter$Rule", 0);
        setField(term18966, term18966.getClass(), "mTimeZone", null);
        setField(term18966, term18966.getClass(), "mLocale", null);
        setField(term18966, term18966.getClass(), "mRules", term18823);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDatePrinter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Date");
        argTypes[1] = Class.forName("java.lang.StringBuffer");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "format", argTypes, term18966, args);
    }

};


