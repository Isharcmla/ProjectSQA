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

public class FastDateFormat_hashCode_167018393181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10420;

    public FastDateFormat_hashCode_167018393181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10420 = newInstance(Class.forName("org.apache.commons.lang.time.FastDateFormat"));
        setField(term10420, term10420.getClass(), "mPattern", null);
        setField(term10420, term10420.getClass(), "mTimeZone", null);
        setBooleanField(term10420, term10420.getClass(), "mTimeZoneForced", false);
        setField(term10420, term10420.getClass(), "mLocale", null);
        setBooleanField(term10420, term10420.getClass(), "mLocaleForced", false);
        setField(term10420, term10420.getClass(), "mRules", null);
        setIntField(term10420, term10420.getClass(), "mMaxLengthEstimate", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hashCode", argTypes, term10420, args);
    }

};


