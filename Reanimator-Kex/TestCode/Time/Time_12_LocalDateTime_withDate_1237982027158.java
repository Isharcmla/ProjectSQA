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
import java.lang.Integer;

public class LocalDateTime_withDate_1237982027158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38324;
     Object term38326;
     Object term38328;
     Object term38330;

    public LocalDateTime_withDate_1237982027158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38324 = newInstance(Class.forName("org.joda.time.LocalDateTime"));
        setLongField(term38324, term38324.getClass(), "iLocalMillis", 0L);
        setField(term38324, term38324.getClass(), "iChronology", null);
        term38326 = new Integer(0);
        term38328 = new Integer(0);
        term38330 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.LocalDateTime");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term38326;
        args[1] = term38328;
        args[2] = term38330;
        callMethod(klass, "withDate", argTypes, term38324, args);
    }

};


