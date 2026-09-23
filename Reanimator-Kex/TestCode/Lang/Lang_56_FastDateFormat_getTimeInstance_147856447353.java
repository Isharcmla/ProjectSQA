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

public class FastDateFormat_getTimeInstance_147856447353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8506;
     Object term8510;

    public FastDateFormat_getTimeInstance_147856447353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8506 = newInstance(Class.forName("org.apache.commons.lang.time.FastDateFormat"));
        setField(term8506, term8506.getClass(), "mPattern", null);
        setField(term8506, term8506.getClass(), "mTimeZone", null);
        setBooleanField(term8506, term8506.getClass(), "mTimeZoneForced", false);
        setField(term8506, term8506.getClass(), "mLocale", null);
        setBooleanField(term8506, term8506.getClass(), "mLocaleForced", false);
        setField(term8506, term8506.getClass(), "mRules", null);
        setIntField(term8506, term8506.getClass(), "mMaxLengthEstimate", 0);
        term8510 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term8510;
        callMethod(klass, "getTimeInstance", argTypes, term8506, args);
    }

};


