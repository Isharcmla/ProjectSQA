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
import java.lang.StringBuilder;

public class DurationFormatUtils_format_1779347976293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term217196;
     Object term218877;

    public DurationFormatUtils_format_1779347976293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term217810 = new StringBuffer();
        StringBuilder term217984 = new StringBuilder();
        StringBuffer term218384 = new StringBuffer();
        term217196 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term217752 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term217924 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term218098 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term218212 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term218326 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term218498 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term217752, term217752.getClass(), "value", term217810);
        setIntField(term217752, term217752.getClass(), "count", 0);
        setElement(term217196, 0, term217752);
        setField(term217924, term217924.getClass(), "value", term217984);
        setIntField(term217924, term217924.getClass(), "count", 0);
        setElement(term217196, 1, term217924);
        setField(term218098, term218098.getClass(), "value", null);
        setIntField(term218098, term218098.getClass(), "count", 0);
        setElement(term217196, 2, term218098);
        setField(term218212, term218212.getClass(), "value", null);
        setIntField(term218212, term218212.getClass(), "count", 0);
        setElement(term217196, 3, term218212);
        setField(term218326, term218326.getClass(), "value", term218384);
        setIntField(term218326, term218326.getClass(), "count", 0);
        setElement(term217196, 4, term218326);
        setField(term218498, term218498.getClass(), "value", term217752);
        setIntField(term218498, term218498.getClass(), "count", 0);
        setElement(term217196, 5, term218498);
        term218877 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term218878 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term218879 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term218882 = (byte[]) newByteArray(16);
        Object term218883 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term218884 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term218885 = (byte[]) newByteArray(16);
        Object term218886 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term218887 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term218888 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term218889 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term218892 = (byte[]) newByteArray(16);
        Object term218893 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term218879, term218879.getClass(), "toStringCache", "");
        setField(term218879, term218879.getClass(), "value", term218882);
        setByteField(term218879, term218879.getClass(), "coder", (byte) 0);
        setIntField(term218879, term218879.getClass(), "count", 0);
        setField(term218878, term218878.getClass(), "value", term218879);
        setIntField(term218878, term218878.getClass(), "count", 0);
        setElement(term218877, 0, term218878);
        setField(term218884, term218884.getClass(), "value", term218885);
        setByteField(term218884, term218884.getClass(), "coder", (byte) 0);
        setIntField(term218884, term218884.getClass(), "count", 0);
        setField(term218883, term218883.getClass(), "value", term218884);
        setIntField(term218883, term218883.getClass(), "count", 0);
        setElement(term218877, 1, term218883);
        setField(term218886, term218886.getClass(), "value", null);
        setIntField(term218886, term218886.getClass(), "count", 0);
        setElement(term218877, 2, term218886);
        setField(term218887, term218887.getClass(), "value", null);
        setIntField(term218887, term218887.getClass(), "count", 0);
        setElement(term218877, 3, term218887);
        setField(term218889, term218889.getClass(), "toStringCache", "");
        setField(term218889, term218889.getClass(), "value", term218892);
        setByteField(term218889, term218889.getClass(), "coder", (byte) 0);
        setIntField(term218889, term218889.getClass(), "count", 0);
        setField(term218888, term218888.getClass(), "value", term218889);
        setIntField(term218888, term218888.getClass(), "count", 0);
        setElement(term218877, 4, term218888);
        setField(term218893, term218893.getClass(), "value", term218878);
        setIntField(term218893, term218893.getClass(), "count", 0);
        setElement(term218877, 5, term218893);
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
        args[0] = term217196;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term217196, term218877));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


