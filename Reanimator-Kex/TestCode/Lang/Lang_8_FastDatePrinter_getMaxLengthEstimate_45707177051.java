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

public class FastDatePrinter_getMaxLengthEstimate_45707177051 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27466;

    public FastDatePrinter_getMaxLengthEstimate_45707177051() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27466 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDatePrinter"));
        setField(term27466, term27466.getClass(), "mPattern", null);
        setField(term27466, term27466.getClass(), "mTimeZone", null);
        setField(term27466, term27466.getClass(), "mLocale", null);
        setField(term27466, term27466.getClass(), "mRules", null);
        setIntField(term27466, term27466.getClass(), "mMaxLengthEstimate", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDatePrinter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxLengthEstimate", argTypes, term27466, args);
    }

};


