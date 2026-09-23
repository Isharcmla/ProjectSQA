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

public class DateTimeParserBucket_restoreState_21009940353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20144;

    public DateTimeParserBucket_restoreState_21009940353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20144 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket"));
        setField(term20144, term20144.getClass(), "iChrono", null);
        setLongField(term20144, term20144.getClass(), "iMillis", 0L);
        setField(term20144, term20144.getClass(), "iZone", null);
        setIntField(term20144, term20144.getClass(), "iOffset", 0);
        setField(term20144, term20144.getClass(), "iLocale", null);
        setField(term20144, term20144.getClass(), "iPivotYear", null);
        setIntField(term20144, term20144.getClass(), "iDefaultYear", 0);
        setField(term20144, term20144.getClass(), "iSavedFields", null);
        setIntField(term20144, term20144.getClass(), "iSavedFieldsCount", 0);
        setBooleanField(term20144, term20144.getClass(), "iSavedFieldsShared", false);
        setField(term20144, term20144.getClass(), "iSavedState", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeParserBucket");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "restoreState", argTypes, term20144, args);
    }

};


