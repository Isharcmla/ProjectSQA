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
import java.lang.Long;

public class FastDateFormat_format_117122732243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10298;
     Object term10302;

    public FastDateFormat_format_117122732243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10298 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateFormat"));
        setField(term10298, term10298.getClass(), "mPattern", null);
        setField(term10298, term10298.getClass(), "mTimeZone", null);
        setBooleanField(term10298, term10298.getClass(), "mTimeZoneForced", false);
        setField(term10298, term10298.getClass(), "mLocale", null);
        setBooleanField(term10298, term10298.getClass(), "mLocaleForced", false);
        setField(term10298, term10298.getClass(), "mRules", null);
        setIntField(term10298, term10298.getClass(), "mMaxLengthEstimate", 0);
        term10302 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("java.lang.StringBuffer");
        Object[] args = new Object[2];
        args[0] = term10302;
        args[1] = null;
        callMethod(klass, "format", argTypes, term10298, args);
    }

};


