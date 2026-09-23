package org.apache.commons.lang.time;

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
import static org.apache.commons.lang.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Long;

public class FastDateFormat_format_14143408267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8582;
     Object term8586;

    public FastDateFormat_format_14143408267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8582 = newInstance(Class.forName("org.apache.commons.lang.time.FastDateFormat"));
        setField(term8582, term8582.getClass(), "mPattern", null);
        setField(term8582, term8582.getClass(), "mTimeZone", null);
        setBooleanField(term8582, term8582.getClass(), "mTimeZoneForced", false);
        setField(term8582, term8582.getClass(), "mLocale", null);
        setBooleanField(term8582, term8582.getClass(), "mLocaleForced", false);
        setField(term8582, term8582.getClass(), "mRules", null);
        setIntField(term8582, term8582.getClass(), "mMaxLengthEstimate", 0);
        term8586 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term8586;
        callMethod(klass, "format", argTypes, term8582, args);
    }

};


