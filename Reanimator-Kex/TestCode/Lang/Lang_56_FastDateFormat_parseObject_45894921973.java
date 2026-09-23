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

public class FastDateFormat_parseObject_45894921973 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8610;

    public FastDateFormat_parseObject_45894921973() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8610 = newInstance(Class.forName("org.apache.commons.lang.time.FastDateFormat"));
        setField(term8610, term8610.getClass(), "mPattern", null);
        setField(term8610, term8610.getClass(), "mTimeZone", null);
        setBooleanField(term8610, term8610.getClass(), "mTimeZoneForced", false);
        setField(term8610, term8610.getClass(), "mLocale", null);
        setBooleanField(term8610, term8610.getClass(), "mLocaleForced", false);
        setField(term8610, term8610.getClass(), "mRules", null);
        setIntField(term8610, term8610.getClass(), "mMaxLengthEstimate", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.text.ParsePosition");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "parseObject", argTypes, term8610, args);
    }

};


