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

public class DurationFormatUtils_format_1779347976500 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term421586;
     Object term425259;

    public DurationFormatUtils_format_1779347976500() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term422658 = new StringBuffer();
        StringBuffer term422944 = new StringBuffer();
        term421586 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term422600 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term422772 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term422886 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term423058 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term423172 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term423286 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term422126 = (char[]) newCharArray(0);
        setField(term422600, term422600.getClass(), "value", term422658);
        setIntField(term422600, term422600.getClass(), "count", 0);
        setElement(term421586, 0, term422600);
        setField(term422886, term422886.getClass(), "value", term422944);
        setIntField(term422886, term422886.getClass(), "count", 0);
        setField(term422772, term422772.getClass(), "value", term422886);
        setIntField(term422772, term422772.getClass(), "count", 0);
        setElement(term421586, 1, term422772);
        setElement(term421586, 2, term422886);
        setField(term423058, term423058.getClass(), "value", term422944);
        setIntField(term423058, term423058.getClass(), "count", 0);
        setElement(term421586, 3, term423058);
        setField(term423172, term423172.getClass(), "value", term422944);
        setIntField(term423172, term423172.getClass(), "count", 0);
        setElement(term421586, 4, term423172);
        setField(term423286, term423286.getClass(), "value", term422126);
        setIntField(term423286, term423286.getClass(), "count", 0);
        setElement(term421586, 5, term423286);
        term425259 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term425260 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term425261 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term425264 = (byte[]) newByteArray(16);
        Object term425265 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term425266 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term425267 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term425269 = (byte[]) newByteArray(16);
        Object term425270 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term425271 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term425272 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term425273 = (char[]) newCharArray(0);
        setField(term425261, term425261.getClass(), "toStringCache", "");
        setField(term425261, term425261.getClass(), "value", term425264);
        setByteField(term425261, term425261.getClass(), "coder", (byte) 0);
        setIntField(term425261, term425261.getClass(), "count", 0);
        setField(term425260, term425260.getClass(), "value", term425261);
        setIntField(term425260, term425260.getClass(), "count", 0);
        setElement(term425259, 0, term425260);
        setField(term425267, term425267.getClass(), "toStringCache", "");
        setField(term425267, term425267.getClass(), "value", term425269);
        setByteField(term425267, term425267.getClass(), "coder", (byte) 0);
        setIntField(term425267, term425267.getClass(), "count", 0);
        setField(term425266, term425266.getClass(), "value", term425267);
        setIntField(term425266, term425266.getClass(), "count", 0);
        setField(term425265, term425265.getClass(), "value", term425266);
        setIntField(term425265, term425265.getClass(), "count", 0);
        setElement(term425259, 1, term425265);
        setElement(term425259, 2, term425266);
        setField(term425270, term425270.getClass(), "value", term425267);
        setIntField(term425270, term425270.getClass(), "count", 0);
        setElement(term425259, 3, term425270);
        setField(term425271, term425271.getClass(), "value", term425267);
        setIntField(term425271, term425271.getClass(), "count", 0);
        setElement(term425259, 4, term425271);
        setField(term425272, term425272.getClass(), "value", term425273);
        setIntField(term425272, term425272.getClass(), "count", 0);
        setElement(term425259, 5, term425272);
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
        args[0] = term421586;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term421586, term425259));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


