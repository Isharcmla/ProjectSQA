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

public class FastDateFormat_getLocale_100271322677 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8626;

    public FastDateFormat_getLocale_100271322677() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8626 = newInstance(Class.forName("org.apache.commons.lang.time.FastDateFormat"));
        setField(term8626, term8626.getClass(), "mPattern", null);
        setField(term8626, term8626.getClass(), "mTimeZone", null);
        setBooleanField(term8626, term8626.getClass(), "mTimeZoneForced", false);
        setField(term8626, term8626.getClass(), "mLocale", null);
        setBooleanField(term8626, term8626.getClass(), "mLocaleForced", false);
        setField(term8626, term8626.getClass(), "mRules", null);
        setIntField(term8626, term8626.getClass(), "mMaxLengthEstimate", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLocale", argTypes, term8626, args);
    }

};


