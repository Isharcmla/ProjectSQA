package org.apache.commons.lang3.time;

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
import static org.apache.commons.lang3.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class FastDateFormat_getDateInstance_15364989049 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10518;
     Object term10522;

    public FastDateFormat_getDateInstance_15364989049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10518 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateFormat"));
        setField(term10518, term10518.getClass(), "mPattern", null);
        setField(term10518, term10518.getClass(), "mTimeZone", null);
        setBooleanField(term10518, term10518.getClass(), "mTimeZoneForced", false);
        setField(term10518, term10518.getClass(), "mLocale", null);
        setBooleanField(term10518, term10518.getClass(), "mLocaleForced", false);
        setField(term10518, term10518.getClass(), "mRules", null);
        setIntField(term10518, term10518.getClass(), "mMaxLengthEstimate", 0);
        term10522 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.util.Locale");
        Object[] args = new Object[2];
        args[0] = term10522;
        args[1] = null;
        callMethod(klass, "getDateInstance", argTypes, term10518, args);
    }

};


