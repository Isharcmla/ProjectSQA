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

public class FastDateFormat_format_34535029673 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10458;

    public FastDateFormat_format_34535029673() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10458 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateFormat"));
        setField(term10458, term10458.getClass(), "mPattern", null);
        setField(term10458, term10458.getClass(), "mTimeZone", null);
        setBooleanField(term10458, term10458.getClass(), "mTimeZoneForced", false);
        setField(term10458, term10458.getClass(), "mLocale", null);
        setBooleanField(term10458, term10458.getClass(), "mLocaleForced", false);
        setField(term10458, term10458.getClass(), "mRules", null);
        setIntField(term10458, term10458.getClass(), "mMaxLengthEstimate", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.util.Calendar");
        argTypes[1] = Class.forName("java.lang.StringBuffer");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "format", argTypes, term10458, args);
    }

};


