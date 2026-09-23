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

public class FastDateFormat_format_106030032970 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8596;
     Object term8600;

    public FastDateFormat_format_106030032970() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8596 = newInstance(Class.forName("org.apache.commons.lang.time.FastDateFormat"));
        setField(term8596, term8596.getClass(), "mPattern", null);
        setField(term8596, term8596.getClass(), "mTimeZone", null);
        setBooleanField(term8596, term8596.getClass(), "mTimeZoneForced", false);
        setField(term8596, term8596.getClass(), "mLocale", null);
        setBooleanField(term8596, term8596.getClass(), "mLocaleForced", false);
        setField(term8596, term8596.getClass(), "mRules", null);
        setIntField(term8596, term8596.getClass(), "mMaxLengthEstimate", 0);
        term8600 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = Class.forName("java.lang.StringBuffer");
        Object[] args = new Object[2];
        args[0] = term8600;
        args[1] = null;
        callMethod(klass, "format", argTypes, term8596, args);
    }

};


