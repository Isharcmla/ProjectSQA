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

public class DurationFormatUtils_format_1779347976130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94186;
     Object term96778;

    public DurationFormatUtils_format_1779347976130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term94911 = new StringBuffer();
        term94186 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term94625 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term94739 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term94853 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term95025 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term95139 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term94254 = (char[]) newCharArray(0);
        Object term95253 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term94625, term94625.getClass(), "value", null);
        setIntField(term94625, term94625.getClass(), "count", 0);
        setElement(term94186, 0, term94625);
        setField(term94739, term94739.getClass(), "value", null);
        setIntField(term94739, term94739.getClass(), "count", 0);
        setElement(term94186, 1, term94739);
        setField(term94853, term94853.getClass(), "value", term94911);
        setIntField(term94853, term94853.getClass(), "count", 0);
        setElement(term94186, 2, term94853);
        setField(term95025, term95025.getClass(), "value", null);
        setIntField(term95025, term95025.getClass(), "count", 0);
        setElement(term94186, 3, term95025);
        setField(term95139, term95139.getClass(), "value", term94254);
        setIntField(term95139, term95139.getClass(), "count", 0);
        setElement(term94186, 4, term95139);
        setElement(term94186, 5, term95253);
        term96778 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term96779 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term96780 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term96781 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term96782 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term96785 = (byte[]) newByteArray(16);
        Object term96786 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term96787 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term96788 = (char[]) newCharArray(0);
        Object term96789 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term96779, term96779.getClass(), "value", null);
        setIntField(term96779, term96779.getClass(), "count", 0);
        setElement(term96778, 0, term96779);
        setField(term96780, term96780.getClass(), "value", null);
        setIntField(term96780, term96780.getClass(), "count", 0);
        setElement(term96778, 1, term96780);
        setField(term96782, term96782.getClass(), "toStringCache", "");
        setField(term96782, term96782.getClass(), "value", term96785);
        setByteField(term96782, term96782.getClass(), "coder", (byte) 0);
        setIntField(term96782, term96782.getClass(), "count", 0);
        setField(term96781, term96781.getClass(), "value", term96782);
        setIntField(term96781, term96781.getClass(), "count", 0);
        setElement(term96778, 2, term96781);
        setField(term96786, term96786.getClass(), "value", null);
        setIntField(term96786, term96786.getClass(), "count", 0);
        setElement(term96778, 3, term96786);
        setField(term96787, term96787.getClass(), "value", term96788);
        setIntField(term96787, term96787.getClass(), "count", 0);
        setElement(term96778, 4, term96787);
        setField(term96789, term96789.getClass(), "value", null);
        setIntField(term96789, term96789.getClass(), "count", 0);
        setElement(term96778, 5, term96789);
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
        args[0] = term94186;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term94186, term96778));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


