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

public class FastDateFormat_format_209009356967 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10622;
     Object term10626;

    public FastDateFormat_format_209009356967() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10622 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateFormat"));
        setField(term10622, term10622.getClass(), "mPattern", null);
        setField(term10622, term10622.getClass(), "mTimeZone", null);
        setBooleanField(term10622, term10622.getClass(), "mTimeZoneForced", false);
        setField(term10622, term10622.getClass(), "mLocale", null);
        setBooleanField(term10622, term10622.getClass(), "mLocaleForced", false);
        setField(term10622, term10622.getClass(), "mRules", null);
        setIntField(term10622, term10622.getClass(), "mMaxLengthEstimate", 0);
        term10626 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term10626;
        callMethod(klass, "format", argTypes, term10622, args);
    }

};


