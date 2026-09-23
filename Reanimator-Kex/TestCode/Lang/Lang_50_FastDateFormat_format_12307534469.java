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

public class FastDateFormat_format_12307534469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10370;

    public FastDateFormat_format_12307534469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10370 = newInstance(Class.forName("org.apache.commons.lang.time.FastDateFormat"));
        setField(term10370, term10370.getClass(), "mPattern", null);
        setField(term10370, term10370.getClass(), "mTimeZone", null);
        setBooleanField(term10370, term10370.getClass(), "mTimeZoneForced", false);
        setField(term10370, term10370.getClass(), "mLocale", null);
        setBooleanField(term10370, term10370.getClass(), "mLocaleForced", false);
        setField(term10370, term10370.getClass(), "mRules", null);
        setIntField(term10370, term10370.getClass(), "mMaxLengthEstimate", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "format", argTypes, term10370, args);
    }

};


