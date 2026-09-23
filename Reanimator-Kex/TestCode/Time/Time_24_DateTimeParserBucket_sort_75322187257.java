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
import java.lang.Integer;

public class DateTimeParserBucket_sort_75322187257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20172;
     Object term20178;

    public DateTimeParserBucket_sort_75322187257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20172 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket"));
        setField(term20172, term20172.getClass(), "iChrono", null);
        setLongField(term20172, term20172.getClass(), "iMillis", 0L);
        setField(term20172, term20172.getClass(), "iZone", null);
        setIntField(term20172, term20172.getClass(), "iOffset", 0);
        setField(term20172, term20172.getClass(), "iLocale", null);
        setField(term20172, term20172.getClass(), "iPivotYear", null);
        setIntField(term20172, term20172.getClass(), "iDefaultYear", 0);
        setField(term20172, term20172.getClass(), "iSavedFields", null);
        setIntField(term20172, term20172.getClass(), "iSavedFieldsCount", 0);
        setBooleanField(term20172, term20172.getClass(), "iSavedFieldsShared", false);
        setField(term20172, term20172.getClass(), "iSavedState", null);
        term20178 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeParserBucket");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket$SavedField"), 0).getClass();
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term20178;
        callMethod(klass, "sort", argTypes, term20172, args);
    }

};


