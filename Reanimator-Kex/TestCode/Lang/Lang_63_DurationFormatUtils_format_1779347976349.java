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

public class DurationFormatUtils_format_1779347976349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term268793;
     Object term270462;

    public DurationFormatUtils_format_1779347976349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term269409 = new StringBuffer();
        StringBuffer term269797 = new StringBuffer();
        StringBuffer term269969 = new StringBuffer();
        term268793 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term269351 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term269523 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term269625 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        Object term269739 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term269911 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term270083 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term270197 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term269351, term269351.getClass(), "value", term269409);
        setIntField(term269351, term269351.getClass(), "count", 0);
        setElement(term268793, 0, term269351);
        setField(term269523, term269523.getClass(), "value", term269625);
        setIntField(term269523, term269523.getClass(), "count", 0);
        setElement(term268793, 1, term269523);
        setField(term269739, term269739.getClass(), "value", term269797);
        setIntField(term269739, term269739.getClass(), "count", 0);
        setElement(term268793, 2, term269739);
        setField(term269911, term269911.getClass(), "value", term269969);
        setIntField(term269911, term269911.getClass(), "count", 0);
        setElement(term268793, 3, term269911);
        setField(term270083, term270083.getClass(), "value", null);
        setIntField(term270083, term270083.getClass(), "count", 0);
        setElement(term268793, 4, term270083);
        setElement(term268793, 5, term270197);
        term270462 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term270463 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term270464 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term270467 = (byte[]) newByteArray(16);
        Object term270468 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term270469 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        Object term270470 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term270471 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term270474 = (byte[]) newByteArray(16);
        Object term270475 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term270476 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term270479 = (byte[]) newByteArray(16);
        Object term270480 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term270481 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term270464, term270464.getClass(), "toStringCache", "");
        setField(term270464, term270464.getClass(), "value", term270467);
        setByteField(term270464, term270464.getClass(), "coder", (byte) 0);
        setIntField(term270464, term270464.getClass(), "count", 0);
        setField(term270463, term270463.getClass(), "value", term270464);
        setIntField(term270463, term270463.getClass(), "count", 0);
        setElement(term270462, 0, term270463);
        setField(term270468, term270468.getClass(), "value", term270469);
        setIntField(term270468, term270468.getClass(), "count", 0);
        setElement(term270462, 1, term270468);
        setField(term270471, term270471.getClass(), "toStringCache", "");
        setField(term270471, term270471.getClass(), "value", term270474);
        setByteField(term270471, term270471.getClass(), "coder", (byte) 0);
        setIntField(term270471, term270471.getClass(), "count", 0);
        setField(term270470, term270470.getClass(), "value", term270471);
        setIntField(term270470, term270470.getClass(), "count", 0);
        setElement(term270462, 2, term270470);
        setField(term270476, term270476.getClass(), "toStringCache", "");
        setField(term270476, term270476.getClass(), "value", term270479);
        setByteField(term270476, term270476.getClass(), "coder", (byte) 0);
        setIntField(term270476, term270476.getClass(), "count", 0);
        setField(term270475, term270475.getClass(), "value", term270476);
        setIntField(term270475, term270475.getClass(), "count", 0);
        setElement(term270462, 3, term270475);
        setField(term270480, term270480.getClass(), "value", null);
        setIntField(term270480, term270480.getClass(), "count", 0);
        setElement(term270462, 4, term270480);
        setField(term270481, term270481.getClass(), "value", null);
        setIntField(term270481, term270481.getClass(), "count", 0);
        setElement(term270462, 5, term270481);
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
        args[0] = term268793;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term268793, term270462));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


