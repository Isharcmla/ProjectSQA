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

public class DurationFormatUtils_format_1779347976451 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term380912;
     Object term383079;

    public DurationFormatUtils_format_1779347976451() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term381642 = new StringBuffer();
        StringBuffer term381928 = new StringBuffer();
        StringBuffer term382100 = new StringBuffer();
        StringBuffer term382272 = new StringBuffer();
        term380912 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 8);
        Object term381470 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term381584 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term381756 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term381870 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term382042 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term382214 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term382386 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term381470, term381470.getClass(), "value", null);
        setIntField(term381470, term381470.getClass(), "count", 0);
        setElement(term380912, 0, term381470);
        setField(term381584, term381584.getClass(), "value", term381642);
        setIntField(term381584, term381584.getClass(), "count", 0);
        setElement(term380912, 1, term381584);
        setField(term381756, term381756.getClass(), "value", null);
        setIntField(term381756, term381756.getClass(), "count", 0);
        setElement(term380912, 2, term381756);
        setField(term381870, term381870.getClass(), "value", term381928);
        setIntField(term381870, term381870.getClass(), "count", 0);
        setElement(term380912, 3, term381870);
        setField(term382042, term382042.getClass(), "value", term382100);
        setIntField(term382042, term382042.getClass(), "count", 0);
        setElement(term380912, 4, term382042);
        setElement(term380912, 5, term381756);
        setField(term382214, term382214.getClass(), "value", term382272);
        setIntField(term382214, term382214.getClass(), "count", 0);
        setElement(term380912, 6, term382214);
        setField(term382386, term382386.getClass(), "value", "");
        setIntField(term382386, term382386.getClass(), "count", 0);
        setElement(term380912, 7, term382386);
        term383079 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 8);
        Object term383080 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term383081 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term383082 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term383085 = (byte[]) newByteArray(16);
        Object term383086 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term383087 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term383088 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term383091 = (byte[]) newByteArray(16);
        Object term383092 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term383093 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term383096 = (byte[]) newByteArray(16);
        Object term383097 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term383098 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term383101 = (byte[]) newByteArray(16);
        Object term383102 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term383080, term383080.getClass(), "value", null);
        setIntField(term383080, term383080.getClass(), "count", 0);
        setElement(term383079, 0, term383080);
        setField(term383082, term383082.getClass(), "toStringCache", "");
        setField(term383082, term383082.getClass(), "value", term383085);
        setByteField(term383082, term383082.getClass(), "coder", (byte) 0);
        setIntField(term383082, term383082.getClass(), "count", 0);
        setField(term383081, term383081.getClass(), "value", term383082);
        setIntField(term383081, term383081.getClass(), "count", 0);
        setElement(term383079, 1, term383081);
        setField(term383086, term383086.getClass(), "value", null);
        setIntField(term383086, term383086.getClass(), "count", 0);
        setElement(term383079, 2, term383086);
        setField(term383088, term383088.getClass(), "toStringCache", "");
        setField(term383088, term383088.getClass(), "value", term383091);
        setByteField(term383088, term383088.getClass(), "coder", (byte) 0);
        setIntField(term383088, term383088.getClass(), "count", 0);
        setField(term383087, term383087.getClass(), "value", term383088);
        setIntField(term383087, term383087.getClass(), "count", 0);
        setElement(term383079, 3, term383087);
        setField(term383093, term383093.getClass(), "toStringCache", "");
        setField(term383093, term383093.getClass(), "value", term383096);
        setByteField(term383093, term383093.getClass(), "coder", (byte) 0);
        setIntField(term383093, term383093.getClass(), "count", 0);
        setField(term383092, term383092.getClass(), "value", term383093);
        setIntField(term383092, term383092.getClass(), "count", 0);
        setElement(term383079, 4, term383092);
        setElement(term383079, 5, term383086);
        setField(term383098, term383098.getClass(), "toStringCache", "");
        setField(term383098, term383098.getClass(), "value", term383101);
        setByteField(term383098, term383098.getClass(), "coder", (byte) 0);
        setIntField(term383098, term383098.getClass(), "count", 0);
        setField(term383097, term383097.getClass(), "value", term383098);
        setIntField(term383097, term383097.getClass(), "count", 0);
        setElement(term383079, 6, term383097);
        setField(term383102, term383102.getClass(), "value", "");
        setIntField(term383102, term383102.getClass(), "count", 0);
        setElement(term383079, 7, term383102);
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
        args[0] = term380912;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term380912, term383079));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


