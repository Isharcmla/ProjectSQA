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

public class DurationFormatUtils_format_177934797681 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46686;
     Object term47635;

    public DurationFormatUtils_format_177934797681() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term47159 = new StringBuffer();
        StringBuffer term47331 = new StringBuffer();
        term46686 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term46987 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term46774 = (char[]) newCharArray(0);
        Object term47101 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term47273 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term46987, term46987.getClass(), "value", term46774);
        setIntField(term46987, term46987.getClass(), "count", 0);
        setElement(term46686, 0, term46987);
        setElement(term46686, 1, term46987);
        setField(term47101, term47101.getClass(), "value", term47159);
        setIntField(term47101, term47101.getClass(), "count", 0);
        setElement(term46686, 2, term47101);
        setField(term47273, term47273.getClass(), "value", term47331);
        setIntField(term47273, term47273.getClass(), "count", 0);
        setElement(term46686, 3, term47273);
        term47635 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term47636 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term47637 = (char[]) newCharArray(0);
        Object term47638 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term47639 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term47642 = (byte[]) newByteArray(16);
        Object term47643 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term47644 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term47647 = (byte[]) newByteArray(16);
        setField(term47636, term47636.getClass(), "value", term47637);
        setIntField(term47636, term47636.getClass(), "count", 0);
        setElement(term47635, 0, term47636);
        setElement(term47635, 1, term47636);
        setField(term47639, term47639.getClass(), "toStringCache", "");
        setField(term47639, term47639.getClass(), "value", term47642);
        setByteField(term47639, term47639.getClass(), "coder", (byte) 0);
        setIntField(term47639, term47639.getClass(), "count", 0);
        setField(term47638, term47638.getClass(), "value", term47639);
        setIntField(term47638, term47638.getClass(), "count", 0);
        setElement(term47635, 2, term47638);
        setField(term47644, term47644.getClass(), "toStringCache", "");
        setField(term47644, term47644.getClass(), "value", term47647);
        setByteField(term47644, term47644.getClass(), "coder", (byte) 0);
        setIntField(term47644, term47644.getClass(), "count", 0);
        setField(term47643, term47643.getClass(), "value", term47644);
        setIntField(term47643, term47643.getClass(), "count", 0);
        setElement(term47635, 3, term47643);
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
        args[0] = term46686;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term46686, term47635));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


