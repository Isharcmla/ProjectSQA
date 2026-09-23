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

public class FastDateFormat_parsePattern_149347030964 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10344;

    public FastDateFormat_parsePattern_149347030964() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10344 = newInstance(Class.forName("org.apache.commons.lang.time.FastDateFormat"));
        setField(term10344, term10344.getClass(), "mPattern", null);
        setField(term10344, term10344.getClass(), "mTimeZone", null);
        setBooleanField(term10344, term10344.getClass(), "mTimeZoneForced", false);
        setField(term10344, term10344.getClass(), "mLocale", null);
        setBooleanField(term10344, term10344.getClass(), "mLocaleForced", false);
        setField(term10344, term10344.getClass(), "mRules", null);
        setIntField(term10344, term10344.getClass(), "mMaxLengthEstimate", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "parsePattern", argTypes, term10344, args);
    }

};


