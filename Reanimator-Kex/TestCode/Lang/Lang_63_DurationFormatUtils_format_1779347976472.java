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

public class DurationFormatUtils_format_1779347976472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term399477;
     Object term402840;

    public DurationFormatUtils_format_1779347976472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term399975 = new StringBuffer();
        StringBuffer term400147 = new StringBuffer();
        StringBuffer term400433 = new StringBuffer();
        term399477 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 8);
        Object term399803 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term399917 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term400089 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term400261 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term399545 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 0);
        Object term400375 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term400547 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term400661 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term400775 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term399917, term399917.getClass(), "value", term399975);
        setIntField(term399917, term399917.getClass(), "count", 0);
        setField(term399803, term399803.getClass(), "value", term399917);
        setIntField(term399803, term399803.getClass(), "count", 0);
        setElement(term399477, 0, term399803);
        setField(term400089, term400089.getClass(), "value", term400147);
        setIntField(term400089, term400089.getClass(), "count", 0);
        setElement(term399477, 1, term400089);
        setField(term400261, term400261.getClass(), "value", term399545);
        setIntField(term400261, term400261.getClass(), "count", 0);
        setElement(term399477, 2, term400261);
        setField(term400375, term400375.getClass(), "value", term400433);
        setIntField(term400375, term400375.getClass(), "count", 0);
        setElement(term399477, 3, term400375);
        setElement(term399477, 4, term399917);
        setField(term400547, term400547.getClass(), "value", null);
        setIntField(term400547, term400547.getClass(), "count", 0);
        setElement(term399477, 5, term400547);
        setElement(term399477, 6, term399917);
        setField(term400661, term400661.getClass(), "value", term400775);
        setIntField(term400661, term400661.getClass(), "count", 0);
        setElement(term399477, 7, term400661);
        term402840 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 8);
        Object term402841 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term402842 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term402843 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term402845 = (byte[]) newByteArray(16);
        Object term402846 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term402847 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term402850 = (byte[]) newByteArray(16);
        Object term402851 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term402852 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 0);
        Object term402853 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term402854 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term402857 = (byte[]) newByteArray(16);
        Object term402858 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term402859 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term402860 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term402843, term402843.getClass(), "toStringCache", "");
        setField(term402843, term402843.getClass(), "value", term402845);
        setByteField(term402843, term402843.getClass(), "coder", (byte) 0);
        setIntField(term402843, term402843.getClass(), "count", 0);
        setField(term402842, term402842.getClass(), "value", term402843);
        setIntField(term402842, term402842.getClass(), "count", 0);
        setField(term402841, term402841.getClass(), "value", term402842);
        setIntField(term402841, term402841.getClass(), "count", 0);
        setElement(term402840, 0, term402841);
        setField(term402847, term402847.getClass(), "toStringCache", "");
        setField(term402847, term402847.getClass(), "value", term402850);
        setByteField(term402847, term402847.getClass(), "coder", (byte) 0);
        setIntField(term402847, term402847.getClass(), "count", 0);
        setField(term402846, term402846.getClass(), "value", term402847);
        setIntField(term402846, term402846.getClass(), "count", 0);
        setElement(term402840, 1, term402846);
        setField(term402851, term402851.getClass(), "value", term402852);
        setIntField(term402851, term402851.getClass(), "count", 0);
        setElement(term402840, 2, term402851);
        setField(term402854, term402854.getClass(), "toStringCache", "");
        setField(term402854, term402854.getClass(), "value", term402857);
        setByteField(term402854, term402854.getClass(), "coder", (byte) 0);
        setIntField(term402854, term402854.getClass(), "count", 0);
        setField(term402853, term402853.getClass(), "value", term402854);
        setIntField(term402853, term402853.getClass(), "count", 0);
        setElement(term402840, 3, term402853);
        setElement(term402840, 4, term402842);
        setField(term402858, term402858.getClass(), "value", null);
        setIntField(term402858, term402858.getClass(), "count", 0);
        setElement(term402840, 5, term402858);
        setElement(term402840, 6, term402842);
        setField(term402860, term402860.getClass(), "value", null);
        setIntField(term402860, term402860.getClass(), "count", 0);
        setField(term402859, term402859.getClass(), "value", term402860);
        setIntField(term402859, term402859.getClass(), "count", 0);
        setElement(term402840, 7, term402859);
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
        args[0] = term399477;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term399477, term402840));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


