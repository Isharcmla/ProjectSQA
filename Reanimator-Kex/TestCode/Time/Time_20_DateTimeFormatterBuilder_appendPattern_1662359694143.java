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

public class DateTimeFormatterBuilder_appendPattern_1662359694143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term668;

    public DateTimeFormatterBuilder_appendPattern_1662359694143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term669 = new ArrayList();
        term668 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term673 = newInstance(Class.forName("java.lang.Object"));
        setField(term668, term668.getClass(), "iElementPairs", term669);
        setField(term668, term668.getClass(), "iFormatter", term673);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "SzjVpOQTyS";
        try {
            callMethod(klass, "appendPattern", argTypes, term668, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


