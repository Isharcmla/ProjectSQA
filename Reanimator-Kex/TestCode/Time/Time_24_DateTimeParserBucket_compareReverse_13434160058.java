package org.joda.time.format;

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
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class DateTimeParserBucket_compareReverse_13434160058 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20180;

    public DateTimeParserBucket_compareReverse_13434160058() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20180 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket"));
        setField(term20180, term20180.getClass(), "iChrono", null);
        setLongField(term20180, term20180.getClass(), "iMillis", 0L);
        setField(term20180, term20180.getClass(), "iZone", null);
        setIntField(term20180, term20180.getClass(), "iOffset", 0);
        setField(term20180, term20180.getClass(), "iLocale", null);
        setField(term20180, term20180.getClass(), "iPivotYear", null);
        setIntField(term20180, term20180.getClass(), "iDefaultYear", 0);
        setField(term20180, term20180.getClass(), "iSavedFields", null);
        setIntField(term20180, term20180.getClass(), "iSavedFieldsCount", 0);
        setBooleanField(term20180, term20180.getClass(), "iSavedFieldsShared", false);
        setField(term20180, term20180.getClass(), "iSavedState", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeParserBucket");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.DurationField");
        argTypes[1] = Class.forName("org.joda.time.DurationField");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "compareReverse", argTypes, term20180, args);
    }

};


