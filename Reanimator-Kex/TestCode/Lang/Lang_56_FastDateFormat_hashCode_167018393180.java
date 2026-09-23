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

public class FastDateFormat_hashCode_167018393180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8638;

    public FastDateFormat_hashCode_167018393180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8638 = newInstance(Class.forName("org.apache.commons.lang.time.FastDateFormat"));
        setField(term8638, term8638.getClass(), "mPattern", null);
        setField(term8638, term8638.getClass(), "mTimeZone", null);
        setBooleanField(term8638, term8638.getClass(), "mTimeZoneForced", false);
        setField(term8638, term8638.getClass(), "mLocale", null);
        setBooleanField(term8638, term8638.getClass(), "mLocaleForced", false);
        setField(term8638, term8638.getClass(), "mRules", null);
        setIntField(term8638, term8638.getClass(), "mMaxLengthEstimate", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term8638, args);
    }

};


