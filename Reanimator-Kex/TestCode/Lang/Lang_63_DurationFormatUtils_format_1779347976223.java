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

public class DurationFormatUtils_format_1779347976223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152452;
     Object term154885;

    public DurationFormatUtils_format_1779347976223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term152735 = new StringBuffer();
        term152452 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 2);
        Object term152677 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term152849 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term152510 = (char[]) newCharArray(0);
        setField(term152677, term152677.getClass(), "value", term152735);
        setIntField(term152677, term152677.getClass(), "count", 0);
        setElement(term152452, 0, term152677);
        setField(term152849, term152849.getClass(), "value", term152510);
        setIntField(term152849, term152849.getClass(), "count", 0);
        setElement(term152452, 1, term152849);
        term154885 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 2);
        Object term154886 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term154887 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term154890 = (byte[]) newByteArray(16);
        Object term154891 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term154892 = (char[]) newCharArray(0);
        setField(term154887, term154887.getClass(), "toStringCache", "");
        setField(term154887, term154887.getClass(), "value", term154890);
        setByteField(term154887, term154887.getClass(), "coder", (byte) 0);
        setIntField(term154887, term154887.getClass(), "count", 0);
        setField(term154886, term154886.getClass(), "value", term154887);
        setIntField(term154886, term154886.getClass(), "count", 0);
        setElement(term154885, 0, term154886);
        setField(term154891, term154891.getClass(), "value", term154892);
        setIntField(term154891, term154891.getClass(), "count", 0);
        setElement(term154885, 1, term154891);
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
        args[0] = term152452;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term152452, term154885));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


