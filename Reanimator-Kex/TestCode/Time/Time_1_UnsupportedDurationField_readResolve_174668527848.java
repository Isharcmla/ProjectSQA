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

public class UnsupportedDurationField_readResolve_174668527848 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63;
     Object term6906;
     Object term6904;

    public UnsupportedDurationField_readResolve_174668527848() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        setField(term63, term63.getClass(), "iType", null);
        term6906 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        setField(term6906, term6906.getClass(), "iType", null);
        term6904 = newInstance(Class.forName("org.joda.time.field.UnsupportedDurationField"));
        setField(term6904, term6904.getClass(), "iType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.field.UnsupportedDurationField");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "readResolve", argTypes, term63, args);
        assertTrue(recursiveEquals(term63, term6906));
        assertTrue(recursiveEquals(retValue, term6904));
    }

};
