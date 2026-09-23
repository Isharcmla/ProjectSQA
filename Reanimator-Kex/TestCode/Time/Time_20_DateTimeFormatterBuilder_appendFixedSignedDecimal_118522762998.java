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
import java.lang.IllegalArgumentException;
import static org.joda.time.format.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.Integer;

public class DateTimeFormatterBuilder_appendFixedSignedDecimal_118522762998 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194;
     Object term200;

    public DateTimeFormatterBuilder_appendFixedSignedDecimal_118522762998() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term195 = new ArrayList();
        term194 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term199 = newInstance(Class.forName("java.lang.Object"));
        setField(term194, term194.getClass(), "iElementPairs", term195);
        setField(term194, term194.getClass(), "iFormatter", term199);
        term200 = new Integer(-1955890973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.DateTimeFieldType");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term200;
        try {
            callMethod(klass, "appendFixedSignedDecimal", argTypes, term194, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


