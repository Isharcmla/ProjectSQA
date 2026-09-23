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
import java.lang.Boolean;

public class DateTimeParserBucket_computeMillis_23540282156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20164;
     Object term20170;

    public DateTimeParserBucket_computeMillis_23540282156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20164 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket"));
        setField(term20164, term20164.getClass(), "iChrono", null);
        setLongField(term20164, term20164.getClass(), "iMillis", 0L);
        setField(term20164, term20164.getClass(), "iZone", null);
        setIntField(term20164, term20164.getClass(), "iOffset", 0);
        setField(term20164, term20164.getClass(), "iLocale", null);
        setField(term20164, term20164.getClass(), "iPivotYear", null);
        setIntField(term20164, term20164.getClass(), "iDefaultYear", 0);
        setField(term20164, term20164.getClass(), "iSavedFields", null);
        setIntField(term20164, term20164.getClass(), "iSavedFieldsCount", 0);
        setBooleanField(term20164, term20164.getClass(), "iSavedFieldsShared", false);
        setField(term20164, term20164.getClass(), "iSavedState", null);
        term20170 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeParserBucket");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = boolean.class;
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term20170;
        args[1] = null;
        callMethod(klass, "computeMillis", argTypes, term20164, args);
    }

};


