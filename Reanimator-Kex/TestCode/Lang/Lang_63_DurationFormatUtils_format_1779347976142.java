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

public class DurationFormatUtils_format_1779347976142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100953;
     Object term103893;

    public DurationFormatUtils_format_1779347976142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term102147 = new StringBuffer();
        term100953 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 3);
        Object term101937 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term101975 = newInstance(Class.forName("java.lang.Object"));
        Object term102089 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term102261 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term101937, term101937.getClass(), "value", term101975);
        setIntField(term101937, term101937.getClass(), "count", 0);
        setElement(term100953, 0, term101937);
        setField(term102089, term102089.getClass(), "value", term102147);
        setIntField(term102089, term102089.getClass(), "count", 0);
        setElement(term100953, 1, term102089);
        setField(term102261, term102261.getClass(), "value", "");
        setIntField(term102261, term102261.getClass(), "count", 0);
        setElement(term100953, 2, term102261);
        term103893 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 3);
        Object term103894 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term103895 = newInstance(Class.forName("java.lang.Object"));
        Object term103896 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term103897 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term103900 = (byte[]) newByteArray(16);
        Object term103901 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term103894, term103894.getClass(), "value", term103895);
        setIntField(term103894, term103894.getClass(), "count", 0);
        setElement(term103893, 0, term103894);
        setField(term103897, term103897.getClass(), "toStringCache", "");
        setField(term103897, term103897.getClass(), "value", term103900);
        setByteField(term103897, term103897.getClass(), "coder", (byte) 0);
        setIntField(term103897, term103897.getClass(), "count", 0);
        setField(term103896, term103896.getClass(), "value", term103897);
        setIntField(term103896, term103896.getClass(), "count", 0);
        setElement(term103893, 1, term103896);
        setField(term103901, term103901.getClass(), "value", "");
        setIntField(term103901, term103901.getClass(), "count", 0);
        setElement(term103893, 2, term103901);
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
        args[0] = term100953;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term100953, term103893));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


