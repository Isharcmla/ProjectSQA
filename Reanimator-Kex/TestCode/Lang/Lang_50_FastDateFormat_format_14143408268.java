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

public class FastDateFormat_format_14143408268 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10364;
     Object term10368;

    public FastDateFormat_format_14143408268() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10364 = newInstance(Class.forName("org.apache.commons.lang.time.FastDateFormat"));
        setField(term10364, term10364.getClass(), "mPattern", null);
        setField(term10364, term10364.getClass(), "mTimeZone", null);
        setBooleanField(term10364, term10364.getClass(), "mTimeZoneForced", false);
        setField(term10364, term10364.getClass(), "mLocale", null);
        setBooleanField(term10364, term10364.getClass(), "mLocaleForced", false);
        setField(term10364, term10364.getClass(), "mRules", null);
        setIntField(term10364, term10364.getClass(), "mMaxLengthEstimate", 0);
        term10368 = new Long(0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term10368;
        callMethod(klass, "format", argTypes, term10364, args);
    }

};


