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
import java.lang.StringBuilder;

public class DurationFormatUtils_format_1779347976289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term211683;
     Object term212883;

    public DurationFormatUtils_format_1779347976289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term212044 = new StringBuffer();
        StringBuilder term212332 = new StringBuilder();
        term211683 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term211986 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term212158 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term212272 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term212446 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term212560 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term212670 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        setField(term211986, term211986.getClass(), "value", term212044);
        setIntField(term211986, term211986.getClass(), "count", 0);
        setElement(term211683, 0, term211986);
        setField(term212158, term212158.getClass(), "value", null);
        setIntField(term212158, term212158.getClass(), "count", 0);
        setElement(term211683, 1, term212158);
        setField(term212272, term212272.getClass(), "value", term212332);
        setIntField(term212272, term212272.getClass(), "count", 0);
        setElement(term211683, 2, term212272);
        setElement(term211683, 3, term212158);
        setField(term212446, term212446.getClass(), "value", null);
        setIntField(term212446, term212446.getClass(), "count", 0);
        setElement(term211683, 4, term212446);
        setField(term212560, term212560.getClass(), "value", term212670);
        setIntField(term212560, term212560.getClass(), "count", 0);
        setElement(term211683, 5, term212560);
        term212883 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term212884 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term212885 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term212888 = (byte[]) newByteArray(16);
        Object term212889 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term212890 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term212891 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term212892 = (byte[]) newByteArray(16);
        Object term212893 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term212894 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term212895 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        setField(term212885, term212885.getClass(), "toStringCache", "");
        setField(term212885, term212885.getClass(), "value", term212888);
        setByteField(term212885, term212885.getClass(), "coder", (byte) 0);
        setIntField(term212885, term212885.getClass(), "count", 0);
        setField(term212884, term212884.getClass(), "value", term212885);
        setIntField(term212884, term212884.getClass(), "count", 0);
        setElement(term212883, 0, term212884);
        setField(term212889, term212889.getClass(), "value", null);
        setIntField(term212889, term212889.getClass(), "count", 0);
        setElement(term212883, 1, term212889);
        setField(term212891, term212891.getClass(), "value", term212892);
        setByteField(term212891, term212891.getClass(), "coder", (byte) 0);
        setIntField(term212891, term212891.getClass(), "count", 0);
        setField(term212890, term212890.getClass(), "value", term212891);
        setIntField(term212890, term212890.getClass(), "count", 0);
        setElement(term212883, 2, term212890);
        setElement(term212883, 3, term212889);
        setField(term212893, term212893.getClass(), "value", null);
        setIntField(term212893, term212893.getClass(), "count", 0);
        setElement(term212883, 4, term212893);
        setField(term212894, term212894.getClass(), "value", term212895);
        setIntField(term212894, term212894.getClass(), "count", 0);
        setElement(term212883, 5, term212894);
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
        args[0] = term211683;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term211683, term212883));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


