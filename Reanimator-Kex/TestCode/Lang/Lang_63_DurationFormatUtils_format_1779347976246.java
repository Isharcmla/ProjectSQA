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

public class DurationFormatUtils_format_1779347976246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166930;
     Object term168810;

    public DurationFormatUtils_format_1779347976246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term167707 = new StringBuffer();
        StringBuffer term167879 = new StringBuffer();
        term166930 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term167421 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term167535 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term167649 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term167821 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term167993 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term167421, term167421.getClass(), "value", null);
        setIntField(term167421, term167421.getClass(), "count", 0);
        setElement(term166930, 0, term167421);
        setField(term167535, term167535.getClass(), "value", null);
        setIntField(term167535, term167535.getClass(), "count", 0);
        setElement(term166930, 1, term167535);
        setField(term167649, term167649.getClass(), "value", term167707);
        setIntField(term167649, term167649.getClass(), "count", 0);
        setElement(term166930, 2, term167649);
        setField(term167821, term167821.getClass(), "value", term167879);
        setIntField(term167821, term167821.getClass(), "count", 0);
        setElement(term166930, 3, term167821);
        setElement(term166930, 4, term167993);
        term168810 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term168811 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term168812 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term168813 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term168814 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term168817 = (byte[]) newByteArray(16);
        Object term168818 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term168819 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term168822 = (byte[]) newByteArray(16);
        Object term168823 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term168811, term168811.getClass(), "value", null);
        setIntField(term168811, term168811.getClass(), "count", 0);
        setElement(term168810, 0, term168811);
        setField(term168812, term168812.getClass(), "value", null);
        setIntField(term168812, term168812.getClass(), "count", 0);
        setElement(term168810, 1, term168812);
        setField(term168814, term168814.getClass(), "toStringCache", "");
        setField(term168814, term168814.getClass(), "value", term168817);
        setByteField(term168814, term168814.getClass(), "coder", (byte) 0);
        setIntField(term168814, term168814.getClass(), "count", 0);
        setField(term168813, term168813.getClass(), "value", term168814);
        setIntField(term168813, term168813.getClass(), "count", 0);
        setElement(term168810, 2, term168813);
        setField(term168819, term168819.getClass(), "toStringCache", "");
        setField(term168819, term168819.getClass(), "value", term168822);
        setByteField(term168819, term168819.getClass(), "coder", (byte) 0);
        setIntField(term168819, term168819.getClass(), "count", 0);
        setField(term168818, term168818.getClass(), "value", term168819);
        setIntField(term168818, term168818.getClass(), "count", 0);
        setElement(term168810, 3, term168818);
        setField(term168823, term168823.getClass(), "value", null);
        setIntField(term168823, term168823.getClass(), "count", 0);
        setElement(term168810, 4, term168823);
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
        args[0] = term166930;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term166930, term168810));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


