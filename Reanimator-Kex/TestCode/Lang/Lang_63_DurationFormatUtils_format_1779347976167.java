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

public class DurationFormatUtils_format_1779347976167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121099;
     Object term122790;

    public DurationFormatUtils_format_1779347976167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term121829 = new StringBuffer();
        StringBuffer term122225 = new StringBuffer();
        term121099 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 7);
        Object term121467 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term121505 = newInstance(Class.forName("java.lang.Object"));
        Object term121619 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term121657 = newInstance(Class.forName("java.lang.Object"));
        Object term121771 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term121943 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term122053 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        Object term122167 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term122339 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term121467, term121467.getClass(), "value", term121505);
        setIntField(term121467, term121467.getClass(), "count", 0);
        setElement(term121099, 0, term121467);
        setField(term121619, term121619.getClass(), "value", term121657);
        setIntField(term121619, term121619.getClass(), "count", 0);
        setElement(term121099, 1, term121619);
        setField(term121771, term121771.getClass(), "value", term121829);
        setIntField(term121771, term121771.getClass(), "count", 0);
        setElement(term121099, 2, term121771);
        setField(term121943, term121943.getClass(), "value", term122053);
        setIntField(term121943, term121943.getClass(), "count", 0);
        setElement(term121099, 3, term121943);
        setField(term122167, term122167.getClass(), "value", term122225);
        setIntField(term122167, term122167.getClass(), "count", 0);
        setElement(term121099, 4, term122167);
        setField(term122339, term122339.getClass(), "value", null);
        setIntField(term122339, term122339.getClass(), "count", 0);
        setElement(term121099, 5, term122339);
        setElement(term121099, 6, term122167);
        term122790 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 7);
        Object term122791 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term122792 = newInstance(Class.forName("java.lang.Object"));
        Object term122793 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term122794 = newInstance(Class.forName("java.lang.Object"));
        Object term122795 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term122796 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term122799 = (byte[]) newByteArray(16);
        Object term122800 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term122801 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        Object term122802 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term122803 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term122806 = (byte[]) newByteArray(16);
        Object term122807 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term122791, term122791.getClass(), "value", term122792);
        setIntField(term122791, term122791.getClass(), "count", 0);
        setElement(term122790, 0, term122791);
        setField(term122793, term122793.getClass(), "value", term122794);
        setIntField(term122793, term122793.getClass(), "count", 0);
        setElement(term122790, 1, term122793);
        setField(term122796, term122796.getClass(), "toStringCache", "");
        setField(term122796, term122796.getClass(), "value", term122799);
        setByteField(term122796, term122796.getClass(), "coder", (byte) 0);
        setIntField(term122796, term122796.getClass(), "count", 0);
        setField(term122795, term122795.getClass(), "value", term122796);
        setIntField(term122795, term122795.getClass(), "count", 0);
        setElement(term122790, 2, term122795);
        setField(term122800, term122800.getClass(), "value", term122801);
        setIntField(term122800, term122800.getClass(), "count", 0);
        setElement(term122790, 3, term122800);
        setField(term122803, term122803.getClass(), "toStringCache", "");
        setField(term122803, term122803.getClass(), "value", term122806);
        setByteField(term122803, term122803.getClass(), "coder", (byte) 0);
        setIntField(term122803, term122803.getClass(), "count", 0);
        setField(term122802, term122802.getClass(), "value", term122803);
        setIntField(term122802, term122802.getClass(), "count", 0);
        setElement(term122790, 4, term122802);
        setField(term122807, term122807.getClass(), "value", null);
        setIntField(term122807, term122807.getClass(), "count", 0);
        setElement(term122790, 5, term122807);
        setElement(term122790, 6, term122802);
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
        args[0] = term121099;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term121099, term122790));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


