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

public class DateTimeParserBucket_saveState_147274040652 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20138;

    public DateTimeParserBucket_saveState_147274040652() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20138 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket"));
        setField(term20138, term20138.getClass(), "iChrono", null);
        setLongField(term20138, term20138.getClass(), "iMillis", 0L);
        setField(term20138, term20138.getClass(), "iZone", null);
        setIntField(term20138, term20138.getClass(), "iOffset", 0);
        setField(term20138, term20138.getClass(), "iLocale", null);
        setField(term20138, term20138.getClass(), "iPivotYear", null);
        setIntField(term20138, term20138.getClass(), "iDefaultYear", 0);
        setField(term20138, term20138.getClass(), "iSavedFields", null);
        setIntField(term20138, term20138.getClass(), "iSavedFieldsCount", 0);
        setBooleanField(term20138, term20138.getClass(), "iSavedFieldsShared", false);
        setField(term20138, term20138.getClass(), "iSavedState", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeParserBucket");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "saveState", argTypes, term20138, args);
    }

};


