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

public class DateTimeParserBucket_saveField_169698827542 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12254;

    public DateTimeParserBucket_saveField_169698827542() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12254 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket"));
        Object[] term12141 = (Object[]) newArray("org.joda.time.format.DateTimeParserBucket$SavedField", 9);
        Object term12364 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket$SavedField"));
        setElement(term12141, 0, term12364);
        setElement(term12141, 1, term12364);
        setElement(term12141, 2, term12364);
        setElement(term12141, 3, term12364);
        setElement(term12141, 4, term12364);
        setElement(term12141, 5, term12364);
        setElement(term12141, 6, term12364);
        setElement(term12141, 7, term12364);
        setElement(term12141, 8, term12364);
        setField(term12254, term12254.getClass(), "iSavedFields", term12141);
        setIntField(term12254, term12254.getClass(), "iSavedFieldsCount", -10);
        setBooleanField(term12254, term12254.getClass(), "iSavedFieldsShared", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeParserBucket");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.DateTimeField");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = 0;
        callMethod(klass, "saveField", argTypes, term12254, args);
    }

};


