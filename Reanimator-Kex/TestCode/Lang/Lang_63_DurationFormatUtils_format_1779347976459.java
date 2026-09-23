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

public class DurationFormatUtils_format_1779347976459 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term388809;
     Object term391310;

    public DurationFormatUtils_format_1779347976459() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term390005 = new StringBuffer();
        StringBuffer term390401 = new StringBuffer();
        StringBuffer term390789 = new StringBuffer();
        term388809 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 8);
        Object term389609 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term389340 = (char[]) newCharArray(0);
        Object term389723 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term389833 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        Object term389947 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term390119 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term390229 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        Object term390343 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term390515 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term390617 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        Object term390731 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term390903 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term391005 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        setField(term389609, term389609.getClass(), "value", term389340);
        setIntField(term389609, term389609.getClass(), "count", 0);
        setElement(term388809, 0, term389609);
        setField(term389723, term389723.getClass(), "value", term389833);
        setIntField(term389723, term389723.getClass(), "count", 0);
        setElement(term388809, 1, term389723);
        setField(term389947, term389947.getClass(), "value", term390005);
        setIntField(term389947, term389947.getClass(), "count", 0);
        setElement(term388809, 2, term389947);
        setField(term390119, term390119.getClass(), "value", term390229);
        setIntField(term390119, term390119.getClass(), "count", 0);
        setElement(term388809, 3, term390119);
        setField(term390343, term390343.getClass(), "value", term390401);
        setIntField(term390343, term390343.getClass(), "count", 0);
        setElement(term388809, 4, term390343);
        setField(term390515, term390515.getClass(), "value", term390617);
        setIntField(term390515, term390515.getClass(), "count", 0);
        setElement(term388809, 5, term390515);
        setField(term390731, term390731.getClass(), "value", term390789);
        setIntField(term390731, term390731.getClass(), "count", 0);
        setElement(term388809, 6, term390731);
        setField(term390903, term390903.getClass(), "value", term391005);
        setIntField(term390903, term390903.getClass(), "count", 0);
        setElement(term388809, 7, term390903);
        term391310 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 8);
        Object term391311 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term391312 = (char[]) newCharArray(0);
        Object term391313 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term391314 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        Object term391315 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term391316 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term391319 = (byte[]) newByteArray(16);
        Object term391320 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term391321 = newInstance(Class.forName("org.vorpal.research.kex.intrinsics.UnknownIntrinsics"));
        Object term391322 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term391323 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term391326 = (byte[]) newByteArray(16);
        Object term391327 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term391328 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        Object term391329 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term391330 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term391333 = (byte[]) newByteArray(16);
        Object term391334 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term391335 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        setField(term391311, term391311.getClass(), "value", term391312);
        setIntField(term391311, term391311.getClass(), "count", 0);
        setElement(term391310, 0, term391311);
        setField(term391313, term391313.getClass(), "value", term391314);
        setIntField(term391313, term391313.getClass(), "count", 0);
        setElement(term391310, 1, term391313);
        setField(term391316, term391316.getClass(), "toStringCache", "");
        setField(term391316, term391316.getClass(), "value", term391319);
        setByteField(term391316, term391316.getClass(), "coder", (byte) 0);
        setIntField(term391316, term391316.getClass(), "count", 0);
        setField(term391315, term391315.getClass(), "value", term391316);
        setIntField(term391315, term391315.getClass(), "count", 0);
        setElement(term391310, 2, term391315);
        setField(term391320, term391320.getClass(), "value", term391321);
        setIntField(term391320, term391320.getClass(), "count", 0);
        setElement(term391310, 3, term391320);
        setField(term391323, term391323.getClass(), "toStringCache", "");
        setField(term391323, term391323.getClass(), "value", term391326);
        setByteField(term391323, term391323.getClass(), "coder", (byte) 0);
        setIntField(term391323, term391323.getClass(), "count", 0);
        setField(term391322, term391322.getClass(), "value", term391323);
        setIntField(term391322, term391322.getClass(), "count", 0);
        setElement(term391310, 4, term391322);
        setField(term391327, term391327.getClass(), "value", term391328);
        setIntField(term391327, term391327.getClass(), "count", 0);
        setElement(term391310, 5, term391327);
        setField(term391330, term391330.getClass(), "toStringCache", "");
        setField(term391330, term391330.getClass(), "value", term391333);
        setByteField(term391330, term391330.getClass(), "coder", (byte) 0);
        setIntField(term391330, term391330.getClass(), "count", 0);
        setField(term391329, term391329.getClass(), "value", term391330);
        setIntField(term391329, term391329.getClass(), "count", 0);
        setElement(term391310, 6, term391329);
        setField(term391334, term391334.getClass(), "value", term391335);
        setIntField(term391334, term391334.getClass(), "count", 0);
        setElement(term391310, 7, term391334);
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
        args[0] = term388809;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term388809, term391310));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


