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
import java.lang.Long;

public class UnsupportedDurationField_getMillis_73720533536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24;
     Object term25;

    public UnsupportedDurationField_getMillis_73720533536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        setField(term24, term24.getClass(), "iType", null);
        term25 = new Long(4872422362414183754L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.field.UnsupportedDurationField");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term25;
        try {
            callMethod(klass, "getMillis", argTypes, term24, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


