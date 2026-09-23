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

public class DurationFormatUtils_format_177934797641 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20484;
     Object term21959;

    public DurationFormatUtils_format_177934797641() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term21639 = new StringBuffer();
        term20484 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term21239 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term21353 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term20716 = (char[]) newCharArray(0);
        Object term21467 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term21581 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term21239, term21239.getClass(), "value", null);
        setIntField(term21239, term21239.getClass(), "count", 0);
        setElement(term20484, 0, term21239);
        setField(term21353, term21353.getClass(), "value", term20716);
        setIntField(term21353, term21353.getClass(), "count", 0);
        setElement(term20484, 1, term21353);
        setField(term21467, term21467.getClass(), "value", null);
        setIntField(term21467, term21467.getClass(), "count", 0);
        setElement(term20484, 2, term21467);
        setField(term21581, term21581.getClass(), "value", term21639);
        setIntField(term21581, term21581.getClass(), "count", 0);
        setElement(term20484, 3, term21581);
        term21959 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term21960 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term21961 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term21962 = (char[]) newCharArray(0);
        Object term21963 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term21964 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term21965 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term21968 = (byte[]) newByteArray(16);
        setField(term21960, term21960.getClass(), "value", null);
        setIntField(term21960, term21960.getClass(), "count", 0);
        setElement(term21959, 0, term21960);
        setField(term21961, term21961.getClass(), "value", term21962);
        setIntField(term21961, term21961.getClass(), "count", 0);
        setElement(term21959, 1, term21961);
        setField(term21963, term21963.getClass(), "value", null);
        setIntField(term21963, term21963.getClass(), "count", 0);
        setElement(term21959, 2, term21963);
        setField(term21965, term21965.getClass(), "toStringCache", "");
        setField(term21965, term21965.getClass(), "value", term21968);
        setByteField(term21965, term21965.getClass(), "coder", (byte) 0);
        setIntField(term21965, term21965.getClass(), "count", 0);
        setField(term21964, term21964.getClass(), "value", term21965);
        setIntField(term21964, term21964.getClass(), "count", 0);
        setElement(term21959, 3, term21964);
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
        args[0] = term20484;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term20484, term21959));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


