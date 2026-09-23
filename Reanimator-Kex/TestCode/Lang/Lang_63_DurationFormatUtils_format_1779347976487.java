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

public class DurationFormatUtils_format_1779347976487 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term413099;
     Object term415034;

    public DurationFormatUtils_format_1779347976487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term413547 = new StringBuilder();
        StringBuffer term413719 = new StringBuffer();
        StringBuffer term414005 = new StringBuffer();
        StringBuilder term414179 = new StringBuilder();
        term413099 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term413487 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term413661 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term413833 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term413947 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term414119 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term414293 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term413487, term413487.getClass(), "value", term413547);
        setIntField(term413487, term413487.getClass(), "count", 0);
        setElement(term413099, 0, term413487);
        setField(term413661, term413661.getClass(), "value", term413719);
        setIntField(term413661, term413661.getClass(), "count", 0);
        setElement(term413099, 1, term413661);
        setField(term413833, term413833.getClass(), "value", null);
        setIntField(term413833, term413833.getClass(), "count", 0);
        setElement(term413099, 2, term413833);
        setField(term413947, term413947.getClass(), "value", term414005);
        setIntField(term413947, term413947.getClass(), "count", 0);
        setElement(term413099, 3, term413947);
        setField(term414119, term414119.getClass(), "value", term414179);
        setIntField(term414119, term414119.getClass(), "count", 0);
        setElement(term413099, 4, term414119);
        setElement(term413099, 5, term414293);
        term415034 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term415035 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term415036 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term415037 = (byte[]) newByteArray(16);
        Object term415038 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term415039 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term415042 = (byte[]) newByteArray(16);
        Object term415043 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term415044 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term415045 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term415048 = (byte[]) newByteArray(16);
        Object term415049 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term415050 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term415051 = (byte[]) newByteArray(16);
        Object term415052 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term415036, term415036.getClass(), "value", term415037);
        setByteField(term415036, term415036.getClass(), "coder", (byte) 0);
        setIntField(term415036, term415036.getClass(), "count", 0);
        setField(term415035, term415035.getClass(), "value", term415036);
        setIntField(term415035, term415035.getClass(), "count", 0);
        setElement(term415034, 0, term415035);
        setField(term415039, term415039.getClass(), "toStringCache", "");
        setField(term415039, term415039.getClass(), "value", term415042);
        setByteField(term415039, term415039.getClass(), "coder", (byte) 0);
        setIntField(term415039, term415039.getClass(), "count", 0);
        setField(term415038, term415038.getClass(), "value", term415039);
        setIntField(term415038, term415038.getClass(), "count", 0);
        setElement(term415034, 1, term415038);
        setField(term415043, term415043.getClass(), "value", null);
        setIntField(term415043, term415043.getClass(), "count", 0);
        setElement(term415034, 2, term415043);
        setField(term415045, term415045.getClass(), "toStringCache", "");
        setField(term415045, term415045.getClass(), "value", term415048);
        setByteField(term415045, term415045.getClass(), "coder", (byte) 0);
        setIntField(term415045, term415045.getClass(), "count", 0);
        setField(term415044, term415044.getClass(), "value", term415045);
        setIntField(term415044, term415044.getClass(), "count", 0);
        setElement(term415034, 3, term415044);
        setField(term415050, term415050.getClass(), "value", term415051);
        setByteField(term415050, term415050.getClass(), "coder", (byte) 0);
        setIntField(term415050, term415050.getClass(), "count", 0);
        setField(term415049, term415049.getClass(), "value", term415050);
        setIntField(term415049, term415049.getClass(), "count", 0);
        setElement(term415034, 4, term415049);
        setField(term415052, term415052.getClass(), "value", null);
        setIntField(term415052, term415052.getClass(), "count", 0);
        setElement(term415034, 5, term415052);
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
        args[0] = term413099;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term413099, term415034));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


