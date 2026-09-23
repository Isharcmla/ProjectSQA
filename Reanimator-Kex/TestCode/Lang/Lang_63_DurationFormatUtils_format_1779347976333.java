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
import java.lang.StringBuilder;
import java.lang.StringBuffer;

public class DurationFormatUtils_format_1779347976333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term250101;
     Object term251883;

    public DurationFormatUtils_format_1779347976333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term250537 = new StringBuilder();
        StringBuffer term250709 = new StringBuffer();
        term250101 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term250477 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term250651 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term250823 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term250937 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term251051 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term251165 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term250477, term250477.getClass(), "value", term250537);
        setIntField(term250477, term250477.getClass(), "count", 0);
        setElement(term250101, 0, term250477);
        setField(term250651, term250651.getClass(), "value", term250709);
        setIntField(term250651, term250651.getClass(), "count", 0);
        setElement(term250101, 1, term250651);
        setField(term250937, term250937.getClass(), "value", term250651);
        setIntField(term250937, term250937.getClass(), "count", 0);
        setField(term250823, term250823.getClass(), "value", term250937);
        setIntField(term250823, term250823.getClass(), "count", 0);
        setElement(term250101, 2, term250823);
        setField(term251051, term251051.getClass(), "value", term250101);
        setIntField(term251051, term251051.getClass(), "count", 0);
        setElement(term250101, 3, term251051);
        setElement(term250101, 4, term250937);
        setField(term251165, term251165.getClass(), "value", null);
        setIntField(term251165, term251165.getClass(), "count", 0);
        setElement(term250101, 5, term251165);
        term251883 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term251884 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term251885 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term251886 = (byte[]) newByteArray(16);
        Object term251887 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term251888 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term251891 = (byte[]) newByteArray(16);
        Object term251892 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term251893 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term251894 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term251895 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term251896 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term251885, term251885.getClass(), "value", term251886);
        setByteField(term251885, term251885.getClass(), "coder", (byte) 0);
        setIntField(term251885, term251885.getClass(), "count", 0);
        setField(term251884, term251884.getClass(), "value", term251885);
        setIntField(term251884, term251884.getClass(), "count", 0);
        setElement(term251883, 0, term251884);
        setField(term251888, term251888.getClass(), "toStringCache", "");
        setField(term251888, term251888.getClass(), "value", term251891);
        setByteField(term251888, term251888.getClass(), "coder", (byte) 0);
        setIntField(term251888, term251888.getClass(), "count", 0);
        setField(term251887, term251887.getClass(), "value", term251888);
        setIntField(term251887, term251887.getClass(), "count", 0);
        setElement(term251883, 1, term251887);
        setField(term251893, term251893.getClass(), "value", term251887);
        setIntField(term251893, term251893.getClass(), "count", 0);
        setField(term251892, term251892.getClass(), "value", term251893);
        setIntField(term251892, term251892.getClass(), "count", 0);
        setElement(term251883, 2, term251892);
        setElement(term251895, 0, term251884);
        setElement(term251895, 1, term251887);
        setElement(term251895, 2, term251892);
        setElement(term251895, 3, term251894);
        setElement(term251895, 4, term251893);
        setField(term251896, term251896.getClass(), "value", null);
        setIntField(term251896, term251896.getClass(), "count", 0);
        setElement(term251895, 5, term251896);
        setField(term251894, term251894.getClass(), "value", term251895);
        setIntField(term251894, term251894.getClass(), "count", 0);
        setElement(term251883, 3, term251894);
        setElement(term251883, 4, term251893);
        setElement(term251883, 5, term251896);
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
        args[0] = term250101;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term250101, term251883));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


