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

public class DateTimeParserBucket_saveField_169698827538 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11479;

    public DateTimeParserBucket_saveField_169698827538() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11479 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket"));
        Object[] term11370 = (Object[]) newArray("org.joda.time.format.DateTimeParserBucket$SavedField", 9);
        Object term11589 = newInstance(Class.forName("org.joda.time.format.DateTimeParserBucket$SavedField"));
        setElement(term11370, 0, term11589);
        setElement(term11370, 1, term11589);
        setElement(term11370, 2, term11589);
        setElement(term11370, 3, term11589);
        setElement(term11370, 4, term11589);
        setElement(term11370, 5, term11589);
        setElement(term11370, 6, term11589);
        setElement(term11370, 7, term11589);
        setElement(term11370, 8, term11589);
        setField(term11479, term11479.getClass(), "iSavedFields", term11370);
        setIntField(term11479, term11479.getClass(), "iSavedFieldsCount", 9);
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
        callMethod(klass, "saveField", argTypes, term11479, args);
    }

};


