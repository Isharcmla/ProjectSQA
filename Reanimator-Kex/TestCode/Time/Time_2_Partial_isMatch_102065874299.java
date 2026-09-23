package org.joda.time;

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
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Partial_isMatch_102065874299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30457;
     Object term30509;

    public Partial_isMatch_102065874299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30457 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term30396 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 489);
        setField(term30457, term30457.getClass(), "iTypes", term30396);
        term30509 = newInstance(Class.forName("org.joda.time.TimeOfDay"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.ReadablePartial");
        Object[] args = new Object[1];
        args[0] = term30509;
        callMethod(klass, "isMatch", argTypes, term30457, args);
    }

};


