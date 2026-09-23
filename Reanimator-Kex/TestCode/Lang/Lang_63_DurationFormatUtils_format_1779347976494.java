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

public class DurationFormatUtils_format_1779347976494 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term416780;
     Object term419595;

    public DurationFormatUtils_format_1779347976494() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term417557 = new StringBuffer();
        StringBuffer term417729 = new StringBuffer();
        term416780 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term417499 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term417671 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term417843 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term417499, term417499.getClass(), "value", term417557);
        setIntField(term417499, term417499.getClass(), "count", 0);
        setElement(term416780, 0, term417499);
        setField(term417671, term417671.getClass(), "value", term417729);
        setIntField(term417671, term417671.getClass(), "count", 0);
        setElement(term416780, 1, term417671);
        setField(term417843, term417843.getClass(), "value", null);
        setIntField(term417843, term417843.getClass(), "count", 0);
        setElement(term416780, 2, term417843);
        setElement(term416780, 3, term417499);
        setElement(term416780, 4, term417499);
        setElement(term416780, 5, term417843);
        term419595 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term419596 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term419597 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term419600 = (byte[]) newByteArray(16);
        Object term419601 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term419602 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term419605 = (byte[]) newByteArray(16);
        Object term419606 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term419597, term419597.getClass(), "toStringCache", "");
        setField(term419597, term419597.getClass(), "value", term419600);
        setByteField(term419597, term419597.getClass(), "coder", (byte) 0);
        setIntField(term419597, term419597.getClass(), "count", 0);
        setField(term419596, term419596.getClass(), "value", term419597);
        setIntField(term419596, term419596.getClass(), "count", 0);
        setElement(term419595, 0, term419596);
        setField(term419602, term419602.getClass(), "toStringCache", "");
        setField(term419602, term419602.getClass(), "value", term419605);
        setByteField(term419602, term419602.getClass(), "coder", (byte) 0);
        setIntField(term419602, term419602.getClass(), "count", 0);
        setField(term419601, term419601.getClass(), "value", term419602);
        setIntField(term419601, term419601.getClass(), "count", 0);
        setElement(term419595, 1, term419601);
        setField(term419606, term419606.getClass(), "value", null);
        setIntField(term419606, term419606.getClass(), "count", 0);
        setElement(term419595, 2, term419606);
        setElement(term419595, 3, term419596);
        setElement(term419595, 4, term419596);
        setElement(term419595, 5, term419606);
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
        args[0] = term416780;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term416780, term419595));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


