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
import static org.joda.time.field.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.joda.time.field.EqualityUtils.*;

public class UnsupportedDurationField_compareTo_213153975568 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12690;
     Object term12820;
     Object term13042;
     Object term13043;

    public UnsupportedDurationField_compareTo_213153975568() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12690 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        term12820 = newInstance(Class.forName("org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField"));
        term13042 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        setField(term13042, term13042.getClass(), "iType", null);
        term13043 = newInstance(Class.forName("org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField"));
        setField(term13043, term13043.getClass(), "this$0", null);
        setField(term13043, term13043.getClass(), "iType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.field.UnsupportedDurationField");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.joda.time.DurationField");
        Object[] args = new Object[1];
        args[0] = term12820;
        Object retValue = callMethod(klass, "compareTo", argTypes, term12690, args);
        assertTrue(recursiveEquals(term12690, term13042));
        assertTrue(recursiveEquals(term12820, term13043));
        assertTrue(recursiveEquals(retValue, 1));
    }

};
