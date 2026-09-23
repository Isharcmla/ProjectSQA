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

public class DateTimeParserBucket_computeMillis_8317759855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20156;
     Object term20162;

    public DateTimeParserBucket_computeMillis_8317759855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20156 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket"));
        setField(term20156, term20156.getClass(), "iChrono", null);
        setLongField(term20156, term20156.getClass(), "iMillis", 0L);
        setField(term20156, term20156.getClass(), "iZone", null);
        setIntField(term20156, term20156.getClass(), "iOffset", 0);
        setField(term20156, term20156.getClass(), "iLocale", null);
        setField(term20156, term20156.getClass(), "iPivotYear", null);
        setIntField(term20156, term20156.getClass(), "iDefaultYear", 0);
        setField(term20156, term20156.getClass(), "iSavedFields", null);
        setIntField(term20156, term20156.getClass(), "iSavedFieldsCount", 0);
        setBooleanField(term20156, term20156.getClass(), "iSavedFieldsShared", false);
        setField(term20156, term20156.getClass(), "iSavedState", null);
        term20162 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeParserBucket");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term20162;
        callMethod(klass, "computeMillis", argTypes, term20156, args);
    }

};


