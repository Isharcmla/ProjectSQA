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

public class FastDateFormat_getMaxLengthEstimate_35310294878 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8630;

    public FastDateFormat_getMaxLengthEstimate_35310294878() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8630 = newInstance(Class.forName("org.apache.commons.lang.time.FastDateFormat"));
        setField(term8630, term8630.getClass(), "mPattern", null);
        setField(term8630, term8630.getClass(), "mTimeZone", null);
        setBooleanField(term8630, term8630.getClass(), "mTimeZoneForced", false);
        setField(term8630, term8630.getClass(), "mLocale", null);
        setBooleanField(term8630, term8630.getClass(), "mLocaleForced", false);
        setField(term8630, term8630.getClass(), "mRules", null);
        setIntField(term8630, term8630.getClass(), "mMaxLengthEstimate", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getMaxLengthEstimate", argTypes, term8630, args);
    }

};


