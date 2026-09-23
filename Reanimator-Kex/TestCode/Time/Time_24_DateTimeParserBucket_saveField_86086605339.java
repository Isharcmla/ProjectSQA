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
import java.lang.Object;

public class DateTimeParserBucket_saveField_86086605339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11693;

    public DateTimeParserBucket_saveField_86086605339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11693 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket"));
        Object[] term11591 = (Object[]) newArray("org.joda.time.format.DateTimeParserBucket$SavedField", 41);
        setField(term11693, term11693.getClass(), "iSavedFields", term11591);
        setIntField(term11693, term11693.getClass(), "iSavedFieldsCount", 41);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeParserBucket");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.format.DateTimeParserBucket$SavedField");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "saveField", argTypes, term11693, args);
    }

};


