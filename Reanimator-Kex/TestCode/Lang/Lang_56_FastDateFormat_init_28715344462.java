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

public class FastDateFormat_init_28715344462 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8558;

    public FastDateFormat_init_28715344462() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8558 = newInstance(Class.forName("org.apache.commons.lang.time.FastDateFormat"));
        setField(term8558, term8558.getClass(), "mPattern", null);
        setField(term8558, term8558.getClass(), "mTimeZone", null);
        setBooleanField(term8558, term8558.getClass(), "mTimeZoneForced", false);
        setField(term8558, term8558.getClass(), "mLocale", null);
        setBooleanField(term8558, term8558.getClass(), "mLocaleForced", false);
        setField(term8558, term8558.getClass(), "mRules", null);
        setIntField(term8558, term8558.getClass(), "mMaxLengthEstimate", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "init", argTypes, term8558, args);
    }

};


