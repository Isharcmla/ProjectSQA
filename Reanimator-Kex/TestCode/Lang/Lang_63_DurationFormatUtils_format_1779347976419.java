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

public class DurationFormatUtils_format_1779347976419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term350010;
     Object term352019;

    public DurationFormatUtils_format_1779347976419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term351043 = new StringBuffer();
        StringBuffer term351329 = new StringBuffer();
        term350010 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 8);
        Object term350541 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term350643 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        Object term350757 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term350871 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term350985 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term351157 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term351271 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term350541, term350541.getClass(), "value", term350643);
        setIntField(term350541, term350541.getClass(), "count", 0);
        setElement(term350010, 0, term350541);
        setField(term350757, term350757.getClass(), "value", null);
        setIntField(term350757, term350757.getClass(), "count", 0);
        setElement(term350010, 1, term350757);
        setField(term350871, term350871.getClass(), "value", null);
        setIntField(term350871, term350871.getClass(), "count", 0);
        setElement(term350010, 2, term350871);
        setElement(term350010, 3, term350871);
        setField(term350985, term350985.getClass(), "value", term351043);
        setIntField(term350985, term350985.getClass(), "count", 0);
        setElement(term350010, 4, term350985);
        setElement(term350010, 5, term350757);
        setField(term351157, term351157.getClass(), "value", null);
        setIntField(term351157, term351157.getClass(), "count", 0);
        setElement(term350010, 6, term351157);
        setField(term351271, term351271.getClass(), "value", term351329);
        setIntField(term351271, term351271.getClass(), "count", 0);
        setElement(term350010, 7, term351271);
        term352019 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 8);
        Object term352020 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term352021 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        Object term352022 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term352023 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term352024 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term352025 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term352028 = (byte[]) newByteArray(16);
        Object term352029 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term352030 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term352031 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term352034 = (byte[]) newByteArray(16);
        setField(term352020, term352020.getClass(), "value", term352021);
        setIntField(term352020, term352020.getClass(), "count", 0);
        setElement(term352019, 0, term352020);
        setField(term352022, term352022.getClass(), "value", null);
        setIntField(term352022, term352022.getClass(), "count", 0);
        setElement(term352019, 1, term352022);
        setField(term352023, term352023.getClass(), "value", null);
        setIntField(term352023, term352023.getClass(), "count", 0);
        setElement(term352019, 2, term352023);
        setElement(term352019, 3, term352023);
        setField(term352025, term352025.getClass(), "toStringCache", "");
        setField(term352025, term352025.getClass(), "value", term352028);
        setByteField(term352025, term352025.getClass(), "coder", (byte) 0);
        setIntField(term352025, term352025.getClass(), "count", 0);
        setField(term352024, term352024.getClass(), "value", term352025);
        setIntField(term352024, term352024.getClass(), "count", 0);
        setElement(term352019, 4, term352024);
        setElement(term352019, 5, term352022);
        setField(term352029, term352029.getClass(), "value", null);
        setIntField(term352029, term352029.getClass(), "count", 0);
        setElement(term352019, 6, term352029);
        setField(term352031, term352031.getClass(), "toStringCache", "");
        setField(term352031, term352031.getClass(), "value", term352034);
        setByteField(term352031, term352031.getClass(), "coder", (byte) 0);
        setIntField(term352031, term352031.getClass(), "count", 0);
        setField(term352030, term352030.getClass(), "value", term352031);
        setIntField(term352030, term352030.getClass(), "count", 0);
        setElement(term352019, 7, term352030);
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
        args[0] = term350010;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term350010, term352019));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


