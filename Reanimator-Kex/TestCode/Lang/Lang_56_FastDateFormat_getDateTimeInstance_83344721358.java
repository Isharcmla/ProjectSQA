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
import java.lang.Integer;

public class FastDateFormat_getDateTimeInstance_83344721358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8538;
     Object term8542;
     Object term8544;

    public FastDateFormat_getDateTimeInstance_83344721358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8538 = newInstance(Class.forName("org.apache.commons.lang.time.FastDateFormat"));
        setField(term8538, term8538.getClass(), "mPattern", null);
        setField(term8538, term8538.getClass(), "mTimeZone", null);
        setBooleanField(term8538, term8538.getClass(), "mTimeZoneForced", false);
        setField(term8538, term8538.getClass(), "mLocale", null);
        setBooleanField(term8538, term8538.getClass(), "mLocaleForced", false);
        setField(term8538, term8538.getClass(), "mRules", null);
        setIntField(term8538, term8538.getClass(), "mMaxLengthEstimate", 0);
        term8542 = new Integer(0);
        term8544 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.util.Locale");
        Object[] args = new Object[3];
        args[0] = term8542;
        args[1] = term8544;
        args[2] = null;
        callMethod(klass, "getDateTimeInstance", argTypes, term8538, args);
    }

};


