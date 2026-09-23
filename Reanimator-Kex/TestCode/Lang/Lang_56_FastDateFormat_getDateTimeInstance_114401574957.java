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

public class FastDateFormat_getDateTimeInstance_114401574957 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8530;
     Object term8534;
     Object term8536;

    public FastDateFormat_getDateTimeInstance_114401574957() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8530 = newInstance(Class.forName("org.apache.commons.lang.time.FastDateFormat"));
        setField(term8530, term8530.getClass(), "mPattern", null);
        setField(term8530, term8530.getClass(), "mTimeZone", null);
        setBooleanField(term8530, term8530.getClass(), "mTimeZoneForced", false);
        setField(term8530, term8530.getClass(), "mLocale", null);
        setBooleanField(term8530, term8530.getClass(), "mLocaleForced", false);
        setField(term8530, term8530.getClass(), "mRules", null);
        setIntField(term8530, term8530.getClass(), "mMaxLengthEstimate", 0);
        term8534 = new Integer(0);
        term8536 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term8534;
        args[1] = term8536;
        callMethod(klass, "getDateTimeInstance", argTypes, term8530, args);
    }

};


