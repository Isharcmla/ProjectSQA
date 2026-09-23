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

public class DurationFormatUtils_format_1779347976247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167994;
     Object term168954;

    public DurationFormatUtils_format_1779347976247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term168497 = new StringBuffer();
        term167994 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 2);
        Object term168439 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term168611 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term168267 = (char[]) newCharArray(0);
        setField(term168439, term168439.getClass(), "value", term168497);
        setIntField(term168439, term168439.getClass(), "count", 0);
        setElement(term167994, 0, term168439);
        setField(term168611, term168611.getClass(), "value", term168267);
        setIntField(term168611, term168611.getClass(), "count", 0);
        setElement(term167994, 1, term168611);
        term168954 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 2);
        Object term168955 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term168956 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term168959 = (byte[]) newByteArray(16);
        Object term168960 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term168961 = (char[]) newCharArray(0);
        setField(term168956, term168956.getClass(), "toStringCache", "");
        setField(term168956, term168956.getClass(), "value", term168959);
        setByteField(term168956, term168956.getClass(), "coder", (byte) 0);
        setIntField(term168956, term168956.getClass(), "count", 0);
        setField(term168955, term168955.getClass(), "value", term168956);
        setIntField(term168955, term168955.getClass(), "count", 0);
        setElement(term168954, 0, term168955);
        setField(term168960, term168960.getClass(), "value", term168961);
        setIntField(term168960, term168960.getClass(), "count", 0);
        setElement(term168954, 1, term168960);
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
        args[0] = term167994;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term167994, term168954));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


