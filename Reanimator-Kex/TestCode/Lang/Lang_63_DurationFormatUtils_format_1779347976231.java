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
import java.lang.StringBuilder;
import java.lang.StringBuffer;

public class DurationFormatUtils_format_1779347976231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term157208;
     Object term159465;

    public DurationFormatUtils_format_1779347976231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term157726 = new StringBuilder();
        StringBuffer term157898 = new StringBuffer();
        StringBuffer term158070 = new StringBuffer();
        StringBuffer term158242 = new StringBuffer();
        term157208 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term157666 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term157840 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term158012 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term158184 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term157666, term157666.getClass(), "value", term157726);
        setIntField(term157666, term157666.getClass(), "count", 0);
        setElement(term157208, 0, term157666);
        setField(term157840, term157840.getClass(), "value", term157898);
        setIntField(term157840, term157840.getClass(), "count", 0);
        setElement(term157208, 1, term157840);
        setField(term158012, term158012.getClass(), "value", term158070);
        setIntField(term158012, term158012.getClass(), "count", 0);
        setElement(term157208, 2, term158012);
        setField(term158184, term158184.getClass(), "value", term158242);
        setIntField(term158184, term158184.getClass(), "count", 0);
        setElement(term157208, 3, term158184);
        term159465 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term159466 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term159467 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term159468 = (byte[]) newByteArray(16);
        Object term159469 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term159470 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term159473 = (byte[]) newByteArray(16);
        Object term159474 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term159475 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term159478 = (byte[]) newByteArray(16);
        Object term159479 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term159480 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term159483 = (byte[]) newByteArray(16);
        setField(term159467, term159467.getClass(), "value", term159468);
        setByteField(term159467, term159467.getClass(), "coder", (byte) 0);
        setIntField(term159467, term159467.getClass(), "count", 0);
        setField(term159466, term159466.getClass(), "value", term159467);
        setIntField(term159466, term159466.getClass(), "count", 0);
        setElement(term159465, 0, term159466);
        setField(term159470, term159470.getClass(), "toStringCache", "");
        setField(term159470, term159470.getClass(), "value", term159473);
        setByteField(term159470, term159470.getClass(), "coder", (byte) 0);
        setIntField(term159470, term159470.getClass(), "count", 0);
        setField(term159469, term159469.getClass(), "value", term159470);
        setIntField(term159469, term159469.getClass(), "count", 0);
        setElement(term159465, 1, term159469);
        setField(term159475, term159475.getClass(), "toStringCache", "");
        setField(term159475, term159475.getClass(), "value", term159478);
        setByteField(term159475, term159475.getClass(), "coder", (byte) 0);
        setIntField(term159475, term159475.getClass(), "count", 0);
        setField(term159474, term159474.getClass(), "value", term159475);
        setIntField(term159474, term159474.getClass(), "count", 0);
        setElement(term159465, 2, term159474);
        setField(term159480, term159480.getClass(), "toStringCache", "");
        setField(term159480, term159480.getClass(), "value", term159483);
        setByteField(term159480, term159480.getClass(), "coder", (byte) 0);
        setIntField(term159480, term159480.getClass(), "count", 0);
        setField(term159479, term159479.getClass(), "value", term159480);
        setIntField(term159479, term159479.getClass(), "count", 0);
        setElement(term159465, 3, term159479);
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
        args[0] = term157208;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term157208, term159465));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


