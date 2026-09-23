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

public class DurationFormatUtils_format_1779347976343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term263482;
     Object term265008;

    public DurationFormatUtils_format_1779347976343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term264278 = new StringBuffer();
        StringBuffer term264450 = new StringBuffer();
        StringBuffer term264622 = new StringBuffer();
        term263482 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term263882 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term263992 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        Object term264106 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term263645 = (char[]) newCharArray(0);
        Object term264220 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term264392 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term264564 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term264736 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term263644 = (char[]) newCharArray(0);
        setField(term263882, term263882.getClass(), "value", term263992);
        setIntField(term263882, term263882.getClass(), "count", 0);
        setElement(term263482, 0, term263882);
        setField(term264106, term264106.getClass(), "value", term263645);
        setIntField(term264106, term264106.getClass(), "count", 0);
        setElement(term263482, 1, term264106);
        setField(term264220, term264220.getClass(), "value", term264278);
        setIntField(term264220, term264220.getClass(), "count", 0);
        setElement(term263482, 2, term264220);
        setField(term264392, term264392.getClass(), "value", term264450);
        setIntField(term264392, term264392.getClass(), "count", 0);
        setElement(term263482, 3, term264392);
        setField(term264564, term264564.getClass(), "value", term264622);
        setIntField(term264564, term264564.getClass(), "count", 0);
        setElement(term263482, 4, term264564);
        setField(term264736, term264736.getClass(), "value", term263644);
        setIntField(term264736, term264736.getClass(), "count", 0);
        setElement(term263482, 5, term264736);
        term265008 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term265009 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term265010 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        Object term265011 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term265012 = (char[]) newCharArray(0);
        Object term265013 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term265014 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term265017 = (byte[]) newByteArray(16);
        Object term265018 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term265019 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term265022 = (byte[]) newByteArray(16);
        Object term265023 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term265024 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term265027 = (byte[]) newByteArray(16);
        Object term265028 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term265029 = (char[]) newCharArray(0);
        setField(term265009, term265009.getClass(), "value", term265010);
        setIntField(term265009, term265009.getClass(), "count", 0);
        setElement(term265008, 0, term265009);
        setField(term265011, term265011.getClass(), "value", term265012);
        setIntField(term265011, term265011.getClass(), "count", 0);
        setElement(term265008, 1, term265011);
        setField(term265014, term265014.getClass(), "toStringCache", "");
        setField(term265014, term265014.getClass(), "value", term265017);
        setByteField(term265014, term265014.getClass(), "coder", (byte) 0);
        setIntField(term265014, term265014.getClass(), "count", 0);
        setField(term265013, term265013.getClass(), "value", term265014);
        setIntField(term265013, term265013.getClass(), "count", 0);
        setElement(term265008, 2, term265013);
        setField(term265019, term265019.getClass(), "toStringCache", "");
        setField(term265019, term265019.getClass(), "value", term265022);
        setByteField(term265019, term265019.getClass(), "coder", (byte) 0);
        setIntField(term265019, term265019.getClass(), "count", 0);
        setField(term265018, term265018.getClass(), "value", term265019);
        setIntField(term265018, term265018.getClass(), "count", 0);
        setElement(term265008, 3, term265018);
        setField(term265024, term265024.getClass(), "toStringCache", "");
        setField(term265024, term265024.getClass(), "value", term265027);
        setByteField(term265024, term265024.getClass(), "coder", (byte) 0);
        setIntField(term265024, term265024.getClass(), "count", 0);
        setField(term265023, term265023.getClass(), "value", term265024);
        setIntField(term265023, term265023.getClass(), "count", 0);
        setElement(term265008, 4, term265023);
        setField(term265028, term265028.getClass(), "value", term265029);
        setIntField(term265028, term265028.getClass(), "count", 0);
        setElement(term265008, 5, term265028);
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
        args[0] = term263482;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term263482, term265008));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


