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

public class DateTimeFormatterBuilder_appendSignedDecimal_83624559797 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184;
     Object term190;
     Object term192;

    public DateTimeFormatterBuilder_appendSignedDecimal_83624559797() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term185 = new ArrayList();
        term184 = newInstance(Class.forName("org.joda.time.format.DateTimeFormatterBuilder"));
        Object term189 = newInstance(Class.forName("java.lang.Object"));
        setField(term184, term184.getClass(), "iElementPairs", term185);
        setField(term184, term184.getClass(), "iFormatter", term189);
        term190 = new Integer(-1922583790);
        term192 = new Integer(-616727354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.format.DateTimeFormatterBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.joda.time.DateTimeFieldType");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term190;
        args[2] = term192;
        try {
            callMethod(klass, "appendSignedDecimal", argTypes, term184, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


