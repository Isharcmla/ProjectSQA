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

public class DurationFormatUtils_format_1779347976173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124458;
     Object term126057;

    public DurationFormatUtils_format_1779347976173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term125009 = new StringBuffer();
        term124458 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term124799 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term124951 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term125123 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term125237 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term125339 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        Object term125453 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term125567 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term124799, term124799.getClass(), "value", "");
        setIntField(term124799, term124799.getClass(), "count", 0);
        setElement(term124458, 0, term124799);
        setField(term124951, term124951.getClass(), "value", term125009);
        setIntField(term124951, term124951.getClass(), "count", 0);
        setElement(term124458, 1, term124951);
        setField(term125123, term125123.getClass(), "value", null);
        setIntField(term125123, term125123.getClass(), "count", 0);
        setElement(term124458, 2, term125123);
        setField(term125237, term125237.getClass(), "value", term125339);
        setIntField(term125237, term125237.getClass(), "count", 0);
        setElement(term124458, 3, term125237);
        setElement(term124458, 4, term125453);
        setElement(term124458, 5, term125567);
        term126057 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term126058 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term126061 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term126062 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term126065 = (byte[]) newByteArray(16);
        Object term126066 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term126067 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term126068 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        Object term126069 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term126070 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term126058, term126058.getClass(), "value", "");
        setIntField(term126058, term126058.getClass(), "count", 0);
        setElement(term126057, 0, term126058);
        setField(term126062, term126062.getClass(), "toStringCache", "");
        setField(term126062, term126062.getClass(), "value", term126065);
        setByteField(term126062, term126062.getClass(), "coder", (byte) 0);
        setIntField(term126062, term126062.getClass(), "count", 0);
        setField(term126061, term126061.getClass(), "value", term126062);
        setIntField(term126061, term126061.getClass(), "count", 0);
        setElement(term126057, 1, term126061);
        setField(term126066, term126066.getClass(), "value", null);
        setIntField(term126066, term126066.getClass(), "count", 0);
        setElement(term126057, 2, term126066);
        setField(term126067, term126067.getClass(), "value", term126068);
        setIntField(term126067, term126067.getClass(), "count", 0);
        setElement(term126057, 3, term126067);
        setField(term126069, term126069.getClass(), "value", null);
        setIntField(term126069, term126069.getClass(), "count", 0);
        setElement(term126057, 4, term126069);
        setField(term126070, term126070.getClass(), "value", null);
        setIntField(term126070, term126070.getClass(), "count", 0);
        setElement(term126057, 5, term126070);
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
        args[0] = term124458;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term124458, term126057));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


