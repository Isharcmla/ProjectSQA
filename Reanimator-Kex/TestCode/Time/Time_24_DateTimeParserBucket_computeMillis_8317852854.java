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

public class DateTimeParserBucket_computeMillis_8317852854 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20150;

    public DateTimeParserBucket_computeMillis_8317852854() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20150 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket"));
        setField(term20150, term20150.getClass(), "iChrono", null);
        setLongField(term20150, term20150.getClass(), "iMillis", 0L);
        setField(term20150, term20150.getClass(), "iZone", null);
        setIntField(term20150, term20150.getClass(), "iOffset", 0);
        setField(term20150, term20150.getClass(), "iLocale", null);
        setField(term20150, term20150.getClass(), "iPivotYear", null);
        setIntField(term20150, term20150.getClass(), "iDefaultYear", 0);
        setField(term20150, term20150.getClass(), "iSavedFields", null);
        setIntField(term20150, term20150.getClass(), "iSavedFieldsCount", 0);
        setBooleanField(term20150, term20150.getClass(), "iSavedFieldsShared", false);
        setField(term20150, term20150.getClass(), "iSavedState", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeParserBucket");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "computeMillis", argTypes, term20150, args);
    }

};


