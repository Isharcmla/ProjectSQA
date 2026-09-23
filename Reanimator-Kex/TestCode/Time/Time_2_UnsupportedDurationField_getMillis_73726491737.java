package org.joda.time.field;

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
import java.lang.UnsupportedOperationException;
import static org.joda.time.field.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Long;

public class UnsupportedDurationField_getMillis_73726491737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27;
     Object term28;
     Object term30;

    public UnsupportedDurationField_getMillis_73726491737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        setField(term27, term27.getClass(), "iType", null);
        term28 = new Integer(1162663216);
        term30 = new Long(6811161968424632369L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.field.UnsupportedDurationField");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = term28;
        args[1] = term30;
        try {
            callMethod(klass, "getMillis", argTypes, term27, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


