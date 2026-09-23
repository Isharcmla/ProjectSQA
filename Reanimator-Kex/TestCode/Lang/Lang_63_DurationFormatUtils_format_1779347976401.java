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

public class DurationFormatUtils_format_1779347976401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term330853;
     Object term334049;

    public DurationFormatUtils_format_1779347976401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term331651 = new StringBuffer();
        term330853 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term331365 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term331479 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term331593 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term331765 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term331879 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term331993 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term332031 = newInstance(Class.forName("java.lang.Object"));
        setField(term331365, term331365.getClass(), "value", null);
        setIntField(term331365, term331365.getClass(), "count", 0);
        setElement(term330853, 0, term331365);
        setField(term331479, term331479.getClass(), "value", null);
        setIntField(term331479, term331479.getClass(), "count", 0);
        setElement(term330853, 1, term331479);
        setField(term331593, term331593.getClass(), "value", term331651);
        setIntField(term331593, term331593.getClass(), "count", 0);
        setElement(term330853, 2, term331593);
        setField(term331765, term331765.getClass(), "value", null);
        setIntField(term331765, term331765.getClass(), "count", 0);
        setElement(term330853, 3, term331765);
        setField(term331879, term331879.getClass(), "value", null);
        setIntField(term331879, term331879.getClass(), "count", 0);
        setElement(term330853, 4, term331879);
        setField(term331993, term331993.getClass(), "value", term332031);
        setIntField(term331993, term331993.getClass(), "count", 0);
        setElement(term330853, 5, term331993);
        term334049 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term334050 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term334051 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term334052 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term334053 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term334056 = (byte[]) newByteArray(16);
        Object term334057 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term334058 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term334059 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term334060 = newInstance(Class.forName("java.lang.Object"));
        setField(term334050, term334050.getClass(), "value", null);
        setIntField(term334050, term334050.getClass(), "count", 0);
        setElement(term334049, 0, term334050);
        setField(term334051, term334051.getClass(), "value", null);
        setIntField(term334051, term334051.getClass(), "count", 0);
        setElement(term334049, 1, term334051);
        setField(term334053, term334053.getClass(), "toStringCache", "");
        setField(term334053, term334053.getClass(), "value", term334056);
        setByteField(term334053, term334053.getClass(), "coder", (byte) 0);
        setIntField(term334053, term334053.getClass(), "count", 0);
        setField(term334052, term334052.getClass(), "value", term334053);
        setIntField(term334052, term334052.getClass(), "count", 0);
        setElement(term334049, 2, term334052);
        setField(term334057, term334057.getClass(), "value", null);
        setIntField(term334057, term334057.getClass(), "count", 0);
        setElement(term334049, 3, term334057);
        setField(term334058, term334058.getClass(), "value", null);
        setIntField(term334058, term334058.getClass(), "count", 0);
        setElement(term334049, 4, term334058);
        setField(term334059, term334059.getClass(), "value", term334060);
        setIntField(term334059, term334059.getClass(), "count", 0);
        setElement(term334049, 5, term334059);
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
        args[0] = term330853;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term330853, term334049));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


