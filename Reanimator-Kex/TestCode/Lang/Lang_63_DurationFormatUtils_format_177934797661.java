package org.apache.commons.lang.time;

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
import static org.apache.commons.lang.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.time.EqualityUtils.*;
import java.lang.Object;
import java.lang.StringBuffer;

public class DurationFormatUtils_format_177934797661 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33219;
     Object term34615;

    public DurationFormatUtils_format_177934797661() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term34480 = new StringBuffer();
        term33219 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term33970 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term34084 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term34198 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term34308 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        Object term34422 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term33970, term33970.getClass(), "value", null);
        setIntField(term33970, term33970.getClass(), "count", 0);
        setElement(term33219, 0, term33970);
        setField(term34084, term34084.getClass(), "value", null);
        setIntField(term34084, term34084.getClass(), "count", 0);
        setElement(term33219, 1, term34084);
        setField(term34198, term34198.getClass(), "value", term34308);
        setIntField(term34198, term34198.getClass(), "count", 0);
        setElement(term33219, 2, term34198);
        setField(term34422, term34422.getClass(), "value", term34480);
        setIntField(term34422, term34422.getClass(), "count", 0);
        setElement(term33219, 3, term34422);
        term34615 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term34616 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term34617 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term34618 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term34619 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        Object term34620 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term34621 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term34624 = (byte[]) newByteArray(16);
        setField(term34616, term34616.getClass(), "value", null);
        setIntField(term34616, term34616.getClass(), "count", 0);
        setElement(term34615, 0, term34616);
        setField(term34617, term34617.getClass(), "value", null);
        setIntField(term34617, term34617.getClass(), "count", 0);
        setElement(term34615, 1, term34617);
        setField(term34618, term34618.getClass(), "value", term34619);
        setIntField(term34618, term34618.getClass(), "count", 0);
        setElement(term34615, 2, term34618);
        setField(term34621, term34621.getClass(), "toStringCache", "");
        setField(term34621, term34621.getClass(), "value", term34624);
        setByteField(term34621, term34621.getClass(), "coder", (byte) 0);
        setIntField(term34621, term34621.getClass(), "count", 0);
        setField(term34620, term34620.getClass(), "value", term34621);
        setIntField(term34620, term34620.getClass(), "count", 0);
        setElement(term34615, 3, term34620);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.time.DurationFormatUtils");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"), 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = int.class;
        argTypes[8] = boolean.class;
        Object[] args = new Object[9];
        args[0] = term33219;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term33219, term34615));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


