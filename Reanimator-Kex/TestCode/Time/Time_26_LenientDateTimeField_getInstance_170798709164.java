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
import java.lang.Object;

public class LenientDateTimeField_getInstance_170798709164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11843;
     Object term12337;
     Object term12330;

    public LenientDateTimeField_getInstance_170798709164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11843 = newInstance(Class.forName("org.joda.time.field.StrictDateTimeField"));
        Object term11929 = newInstance(Class.forName("org.joda.time.field.DividedDateTimeField"));
        Object term12031 = newInstance(Class.forName("org.joda.time.chrono.BasicSingleEraDateTimeField"));
        setField(term11929, term11929.getClass(), "iField", term12031);
        setField(term11843, term11843.getClass(), "iField", term11929);
        term12337 = newInstance(Class.forName("org.joda.time.field.StrictDateTimeField"));
        Object term12338 = newInstance(Class.forName("org.joda.time.field.DividedDateTimeField"));
        Object term12339 = newInstance(Class.forName("org.joda.time.chrono.BasicSingleEraDateTimeField"));
        setIntField(term12338, term12338.getClass(), "iDivisor", 0);
        setField(term12338, term12338.getClass(), "iDurationField", null);
        setIntField(term12338, term12338.getClass(), "iMin", 0);
        setIntField(term12338, term12338.getClass(), "iMax", 0);
        setField(term12339, term12339.getClass(), "iEraText", null);
        setField(term12339, term12339.getClass(), "iType", null);
        setField(term12338, term12338.getClass(), "iField", term12339);
        setField(term12338, term12338.getClass(), "iType", null);
        setField(term12337, term12337.getClass(), "iField", term12338);
        setField(term12337, term12337.getClass(), "iType", null);
        term12330 = newInstance(Class.forName("org.joda.time.field.LenientDateTimeField"));
        Object term12331 = newInstance(Class.forName("org.joda.time.field.DividedDateTimeField"));
        Object term12335 = newInstance(Class.forName("org.joda.time.chrono.BasicSingleEraDateTimeField"));
        setField(term12330, term12330.getClass(), "iBase", null);
        setIntField(term12331, term12331.getClass(), "iDivisor", 0);
        setField(term12331, term12331.getClass(), "iDurationField", null);
        setIntField(term12331, term12331.getClass(), "iMin", 0);
        setIntField(term12331, term12331.getClass(), "iMax", 0);
        setField(term12335, term12335.getClass(), "iEraText", null);
        setField(term12335, term12335.getClass(), "iType", null);
        setField(term12331, term12331.getClass(), "iField", term12335);
        setField(term12331, term12331.getClass(), "iType", null);
        setField(term12330, term12330.getClass(), "iField", term12331);
        setField(term12330, term12330.getClass(), "iType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.field.LenientDateTimeField");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.DateTimeField");
        argTypes[1] = Class.forName("org.joda.time.Chronology");
        Object[] args = new Object[2];
        args[0] = term11843;
        args[1] = null;
        Object retValue = callMethod(klass, "getInstance", argTypes, null, args);
        assertTrue(recursiveEquals(term11843, null));
        assertTrue(recursiveEquals(retValue, term12330));
    }

};


