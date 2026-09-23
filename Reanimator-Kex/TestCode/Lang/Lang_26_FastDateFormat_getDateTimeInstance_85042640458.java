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

public class FastDateFormat_getDateTimeInstance_85042640458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10578;
     Object term10582;
     Object term10584;

    public FastDateFormat_getDateTimeInstance_85042640458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10578 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateFormat"));
        setField(term10578, term10578.getClass(), "mPattern", null);
        setField(term10578, term10578.getClass(), "mTimeZone", null);
        setBooleanField(term10578, term10578.getClass(), "mTimeZoneForced", false);
        setField(term10578, term10578.getClass(), "mLocale", null);
        setBooleanField(term10578, term10578.getClass(), "mLocaleForced", false);
        setField(term10578, term10578.getClass(), "mRules", null);
        setIntField(term10578, term10578.getClass(), "mMaxLengthEstimate", 0);
        term10582 = new Integer(0);
        term10584 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDateFormat");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.util.TimeZone");
        argTypes[3] = Class.forName("java.util.Locale");
        Object[] args = new Object[4];
        args[0] = term10582;
        args[1] = term10584;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "getDateTimeInstance", argTypes, term10578, args);
    }

};


