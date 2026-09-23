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

public class FastDateFormat_getPattern_65367388974 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8614;

    public FastDateFormat_getPattern_65367388974() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8614 = newInstance(Class.forName("org.apache.commons.lang.time.FastDateFormat"));
        setField(term8614, term8614.getClass(), "mPattern", null);
        setField(term8614, term8614.getClass(), "mTimeZone", null);
        setBooleanField(term8614, term8614.getClass(), "mTimeZoneForced", false);
        setField(term8614, term8614.getClass(), "mLocale", null);
        setBooleanField(term8614, term8614.getClass(), "mLocaleForced", false);
        setField(term8614, term8614.getClass(), "mRules", null);
        setIntField(term8614, term8614.getClass(), "mMaxLengthEstimate", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPattern", argTypes, term8614, args);
    }

};


