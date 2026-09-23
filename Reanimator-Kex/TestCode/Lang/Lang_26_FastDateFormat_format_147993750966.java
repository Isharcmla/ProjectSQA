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

public class FastDateFormat_format_147993750966 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10618;

    public FastDateFormat_format_147993750966() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10618 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateFormat"));
        setField(term10618, term10618.getClass(), "mPattern", null);
        setField(term10618, term10618.getClass(), "mTimeZone", null);
        setBooleanField(term10618, term10618.getClass(), "mTimeZoneForced", false);
        setField(term10618, term10618.getClass(), "mLocale", null);
        setBooleanField(term10618, term10618.getClass(), "mLocaleForced", false);
        setField(term10618, term10618.getClass(), "mRules", null);
        setIntField(term10618, term10618.getClass(), "mMaxLengthEstimate", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("java.lang.StringBuffer");
        argTypes[2] = Class.forName("java.text.FieldPosition");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "format", argTypes, term10618, args);
    }

};


