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

public class LenientDateTimeField_getInstance_170798709172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13466;
     Object term13860;
     Object term13856;

    public LenientDateTimeField_getInstance_170798709172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13466 = newInstance(Class.forName("org.joda.time.field.StrictDateTimeField"));
        Object term13556 = newInstance(Class.forName("org.joda.time.field.ZeroIsMaxDateTimeField"));
        Object term13658 = newInstance(Class.forName("org.joda.time.chrono.BasicSingleEraDateTimeField"));
        setField(term13556, term13556.getClass(), "iField", term13658);
        setField(term13466, term13466.getClass(), "iField", term13556);
        term13860 = newInstance(Class.forName("org.joda.time.field.StrictDateTimeField"));
        Object term13861 = newInstance(Class.forName("org.joda.time.field.ZeroIsMaxDateTimeField"));
        Object term13862 = newInstance(Class.forName("org.joda.time.chrono.BasicSingleEraDateTimeField"));
        setField(term13862, term13862.getClass(), "iEraText", null);
        setField(term13862, term13862.getClass(), "iType", null);
        setField(term13861, term13861.getClass(), "iField", term13862);
        setField(term13861, term13861.getClass(), "iType", null);
        setField(term13860, term13860.getClass(), "iField", term13861);
        setField(term13860, term13860.getClass(), "iType", null);
        term13856 = newInstance(Class.forName("org.joda.time.field.LenientDateTimeField"));
        Object term13857 = newInstance(Class.forName("org.joda.time.field.ZeroIsMaxDateTimeField"));
        Object term13858 = newInstance(Class.forName("org.joda.time.chrono.BasicSingleEraDateTimeField"));
        setField(term13856, term13856.getClass(), "iBase", null);
        setField(term13858, term13858.getClass(), "iEraText", null);
        setField(term13858, term13858.getClass(), "iType", null);
        setField(term13857, term13857.getClass(), "iField", term13858);
        setField(term13857, term13857.getClass(), "iType", null);
        setField(term13856, term13856.getClass(), "iField", term13857);
        setField(term13856, term13856.getClass(), "iType", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.field.LenientDateTimeField");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.DateTimeField");
        argTypes[1] = Class.forName("org.joda.time.Chronology");
        Object[] args = new Object[2];
        args[0] = term13466;
        args[1] = null;
        Object retValue = callMethod(klass, "getInstance", argTypes, null, args);
        assertTrue(recursiveEquals(term13466, null));
        assertTrue(recursiveEquals(retValue, term13856));
    }

};


