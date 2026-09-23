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

public class DurationFormatUtils_format_1779347976465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term395063;
     Object term396773;

    public DurationFormatUtils_format_1779347976465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term395707 = new StringBuffer();
        StringBuffer term396031 = new StringBuffer();
        StringBuffer term396203 = new StringBuffer();
        term395063 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term395421 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term395535 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term395649 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term395821 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term395859 = newInstance(Class.forName("java.lang.Object"));
        Object term395973 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term396145 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term395535, term395535.getClass(), "value", null);
        setIntField(term395535, term395535.getClass(), "count", 0);
        setField(term395421, term395421.getClass(), "value", term395535);
        setIntField(term395421, term395421.getClass(), "count", 0);
        setElement(term395063, 0, term395421);
        setField(term395649, term395649.getClass(), "value", term395707);
        setIntField(term395649, term395649.getClass(), "count", 0);
        setElement(term395063, 1, term395649);
        setField(term395821, term395821.getClass(), "value", term395859);
        setIntField(term395821, term395821.getClass(), "count", 0);
        setElement(term395063, 2, term395821);
        setField(term395973, term395973.getClass(), "value", term396031);
        setIntField(term395973, term395973.getClass(), "count", 0);
        setElement(term395063, 3, term395973);
        setField(term396145, term396145.getClass(), "value", term396203);
        setIntField(term396145, term396145.getClass(), "count", 0);
        setElement(term395063, 4, term396145);
        setElement(term395063, 5, term395535);
        term396773 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term396774 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term396775 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term396776 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term396777 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term396780 = (byte[]) newByteArray(16);
        Object term396781 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term396782 = newInstance(Class.forName("java.lang.Object"));
        Object term396783 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term396784 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term396787 = (byte[]) newByteArray(16);
        Object term396788 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term396789 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term396792 = (byte[]) newByteArray(16);
        setField(term396775, term396775.getClass(), "value", null);
        setIntField(term396775, term396775.getClass(), "count", 0);
        setField(term396774, term396774.getClass(), "value", term396775);
        setIntField(term396774, term396774.getClass(), "count", 0);
        setElement(term396773, 0, term396774);
        setField(term396777, term396777.getClass(), "toStringCache", "");
        setField(term396777, term396777.getClass(), "value", term396780);
        setByteField(term396777, term396777.getClass(), "coder", (byte) 0);
        setIntField(term396777, term396777.getClass(), "count", 0);
        setField(term396776, term396776.getClass(), "value", term396777);
        setIntField(term396776, term396776.getClass(), "count", 0);
        setElement(term396773, 1, term396776);
        setField(term396781, term396781.getClass(), "value", term396782);
        setIntField(term396781, term396781.getClass(), "count", 0);
        setElement(term396773, 2, term396781);
        setField(term396784, term396784.getClass(), "toStringCache", "");
        setField(term396784, term396784.getClass(), "value", term396787);
        setByteField(term396784, term396784.getClass(), "coder", (byte) 0);
        setIntField(term396784, term396784.getClass(), "count", 0);
        setField(term396783, term396783.getClass(), "value", term396784);
        setIntField(term396783, term396783.getClass(), "count", 0);
        setElement(term396773, 3, term396783);
        setField(term396789, term396789.getClass(), "toStringCache", "");
        setField(term396789, term396789.getClass(), "value", term396792);
        setByteField(term396789, term396789.getClass(), "coder", (byte) 0);
        setIntField(term396789, term396789.getClass(), "count", 0);
        setField(term396788, term396788.getClass(), "value", term396789);
        setIntField(term396788, term396788.getClass(), "count", 0);
        setElement(term396773, 4, term396788);
        setElement(term396773, 5, term396775);
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
        args[0] = term395063;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term395063, term396773));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


