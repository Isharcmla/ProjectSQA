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

public class UnsupportedDurationField_getValueAsLong_102473373034 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16;
     Object term17;
     Object term19;

    public UnsupportedDurationField_getValueAsLong_102473373034() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        setField(term16, term16.getClass(), "iType", null);
        term17 = new Long(5270370404989704783L);
        term19 = new Long(7411271909051562686L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.field.UnsupportedDurationField");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = long.class;
        argTypes[1] = long.class;
        Object[] args = new Object[2];
        args[0] = term17;
        args[1] = term19;
        try {
            callMethod(klass, "getValueAsLong", argTypes, term16, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


