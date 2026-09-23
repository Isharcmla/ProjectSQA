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

public class DurationFormatUtils_format_1779347976270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196069;
     Object term198537;

    public DurationFormatUtils_format_1779347976270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term196888 = new StringBuffer();
        term196069 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term196830 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term197002 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term197116 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term197230 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term197344 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term197454 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        setField(term196830, term196830.getClass(), "value", term196888);
        setIntField(term196830, term196830.getClass(), "count", 0);
        setElement(term196069, 0, term196830);
        setField(term197002, term197002.getClass(), "value", null);
        setIntField(term197002, term197002.getClass(), "count", 0);
        setElement(term196069, 1, term197002);
        setField(term197116, term197116.getClass(), "value", null);
        setIntField(term197116, term197116.getClass(), "count", 0);
        setElement(term196069, 2, term197116);
        setField(term197230, term197230.getClass(), "value", null);
        setIntField(term197230, term197230.getClass(), "count", 0);
        setElement(term196069, 3, term197230);
        setElement(term196069, 4, term197230);
        setField(term197344, term197344.getClass(), "value", term197454);
        setIntField(term197344, term197344.getClass(), "count", 0);
        setElement(term196069, 5, term197344);
        term198537 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term198538 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term198539 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term198542 = (byte[]) newByteArray(16);
        Object term198543 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term198544 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term198545 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term198546 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term198547 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        setField(term198539, term198539.getClass(), "toStringCache", "");
        setField(term198539, term198539.getClass(), "value", term198542);
        setByteField(term198539, term198539.getClass(), "coder", (byte) 0);
        setIntField(term198539, term198539.getClass(), "count", 0);
        setField(term198538, term198538.getClass(), "value", term198539);
        setIntField(term198538, term198538.getClass(), "count", 0);
        setElement(term198537, 0, term198538);
        setField(term198543, term198543.getClass(), "value", null);
        setIntField(term198543, term198543.getClass(), "count", 0);
        setElement(term198537, 1, term198543);
        setField(term198544, term198544.getClass(), "value", null);
        setIntField(term198544, term198544.getClass(), "count", 0);
        setElement(term198537, 2, term198544);
        setField(term198545, term198545.getClass(), "value", null);
        setIntField(term198545, term198545.getClass(), "count", 0);
        setElement(term198537, 3, term198545);
        setElement(term198537, 4, term198545);
        setField(term198546, term198546.getClass(), "value", term198547);
        setIntField(term198546, term198546.getClass(), "count", 0);
        setElement(term198537, 5, term198546);
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
        args[0] = term196069;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term196069, term198537));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


