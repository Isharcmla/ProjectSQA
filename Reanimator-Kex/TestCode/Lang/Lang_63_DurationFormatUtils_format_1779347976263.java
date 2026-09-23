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

public class DurationFormatUtils_format_1779347976263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term190374;
     Object term191974;

    public DurationFormatUtils_format_1779347976263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term191161 = new StringBuffer();
        term190374 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term191103 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term191275 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term191427 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term190886 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 0);
        Object term191541 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term191655 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term191693 = newInstance(Class.forName("java.lang.Object"));
        Object term191807 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term191103, term191103.getClass(), "value", term191161);
        setIntField(term191103, term191103.getClass(), "count", 0);
        setElement(term190374, 0, term191103);
        setField(term191275, term191275.getClass(), "value", "");
        setIntField(term191275, term191275.getClass(), "count", 0);
        setElement(term190374, 1, term191275);
        setField(term191427, term191427.getClass(), "value", term190886);
        setIntField(term191427, term191427.getClass(), "count", 0);
        setElement(term190374, 2, term191427);
        setField(term191541, term191541.getClass(), "value", term190886);
        setIntField(term191541, term191541.getClass(), "count", 0);
        setElement(term190374, 3, term191541);
        setField(term191655, term191655.getClass(), "value", term191693);
        setIntField(term191655, term191655.getClass(), "count", 0);
        setElement(term190374, 4, term191655);
        setElement(term190374, 5, term191807);
        term191974 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term191975 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term191976 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term191979 = (byte[]) newByteArray(16);
        Object term191980 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term191983 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term191984 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 0);
        Object term191985 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term191986 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 0);
        Object term191987 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term191988 = newInstance(Class.forName("java.lang.Object"));
        Object term191989 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term191976, term191976.getClass(), "toStringCache", "");
        setField(term191976, term191976.getClass(), "value", term191979);
        setByteField(term191976, term191976.getClass(), "coder", (byte) 0);
        setIntField(term191976, term191976.getClass(), "count", 0);
        setField(term191975, term191975.getClass(), "value", term191976);
        setIntField(term191975, term191975.getClass(), "count", 0);
        setElement(term191974, 0, term191975);
        setField(term191980, term191980.getClass(), "value", "");
        setIntField(term191980, term191980.getClass(), "count", 0);
        setElement(term191974, 1, term191980);
        setField(term191983, term191983.getClass(), "value", term191984);
        setIntField(term191983, term191983.getClass(), "count", 0);
        setElement(term191974, 2, term191983);
        setField(term191985, term191985.getClass(), "value", term191986);
        setIntField(term191985, term191985.getClass(), "count", 0);
        setElement(term191974, 3, term191985);
        setField(term191987, term191987.getClass(), "value", term191988);
        setIntField(term191987, term191987.getClass(), "count", 0);
        setElement(term191974, 4, term191987);
        setField(term191989, term191989.getClass(), "value", null);
        setIntField(term191989, term191989.getClass(), "count", 0);
        setElement(term191974, 5, term191989);
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
        args[0] = term190374;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term190374, term191974));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


