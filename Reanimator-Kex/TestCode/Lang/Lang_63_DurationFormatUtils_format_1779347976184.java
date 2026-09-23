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

public class DurationFormatUtils_format_1779347976184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128648;
     Object term130396;

    public DurationFormatUtils_format_1779347976184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term128902 = new StringBuffer();
        term128648 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 2);
        Object term128844 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term129016 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term129054 = newInstance(Class.forName("java.lang.Object"));
        setField(term128844, term128844.getClass(), "value", term128902);
        setIntField(term128844, term128844.getClass(), "count", 0);
        setElement(term128648, 0, term128844);
        setField(term129016, term129016.getClass(), "value", term129054);
        setIntField(term129016, term129016.getClass(), "count", 0);
        setElement(term128648, 1, term129016);
        term130396 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 2);
        Object term130397 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term130398 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term130401 = (byte[]) newByteArray(16);
        Object term130402 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term130403 = newInstance(Class.forName("java.lang.Object"));
        setField(term130398, term130398.getClass(), "toStringCache", "");
        setField(term130398, term130398.getClass(), "value", term130401);
        setByteField(term130398, term130398.getClass(), "coder", (byte) 0);
        setIntField(term130398, term130398.getClass(), "count", 0);
        setField(term130397, term130397.getClass(), "value", term130398);
        setIntField(term130397, term130397.getClass(), "count", 0);
        setElement(term130396, 0, term130397);
        setField(term130402, term130402.getClass(), "value", term130403);
        setIntField(term130402, term130402.getClass(), "count", 0);
        setElement(term130396, 1, term130402);
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
        args[0] = term128648;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term128648, term130396));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


