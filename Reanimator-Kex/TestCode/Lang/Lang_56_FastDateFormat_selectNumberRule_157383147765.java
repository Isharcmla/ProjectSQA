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
import java.lang.Integer;

public class FastDateFormat_selectNumberRule_157383147765 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8570;
     Object term8574;
     Object term8576;

    public FastDateFormat_selectNumberRule_157383147765() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8570 = newInstance(Class.forName("org.apache.commons.lang.time.FastDateFormat"));
        setField(term8570, term8570.getClass(), "mPattern", null);
        setField(term8570, term8570.getClass(), "mTimeZone", null);
        setBooleanField(term8570, term8570.getClass(), "mTimeZoneForced", false);
        setField(term8570, term8570.getClass(), "mLocale", null);
        setBooleanField(term8570, term8570.getClass(), "mLocaleForced", false);
        setField(term8570, term8570.getClass(), "mRules", null);
        setIntField(term8570, term8570.getClass(), "mMaxLengthEstimate", 0);
        term8574 = new Integer(0);
        term8576 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term8574;
        args[1] = term8576;
        callMethod(klass, "selectNumberRule", argTypes, term8570, args);
    }

};


