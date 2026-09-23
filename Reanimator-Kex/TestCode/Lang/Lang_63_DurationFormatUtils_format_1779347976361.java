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

public class DurationFormatUtils_format_1779347976361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term279745;
     Object term284851;

    public DurationFormatUtils_format_1779347976361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term281237 = new StringBuffer();
        StringBuffer term281739 = new StringBuffer();
        StringBuffer term281911 = new StringBuffer();
        StringBuffer term282083 = new StringBuffer();
        term279745 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 7);
        Object term281065 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term279762 = (char[]) newCharArray(522);
        Object term281179 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term281351 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term281453 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        Object term281567 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term280816 = (char[]) newCharArray(0);
        Object term281681 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term281853 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term282025 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term281065, term281065.getClass(), "value", term279762);
        setIntField(term281065, term281065.getClass(), "count", 0);
        setElement(term279745, 0, term281065);
        setField(term281179, term281179.getClass(), "value", term281237);
        setIntField(term281179, term281179.getClass(), "count", 0);
        setElement(term279745, 1, term281179);
        setField(term281351, term281351.getClass(), "value", term281453);
        setIntField(term281351, term281351.getClass(), "count", 0);
        setElement(term279745, 2, term281351);
        setField(term281567, term281567.getClass(), "value", term280816);
        setIntField(term281567, term281567.getClass(), "count", 0);
        setElement(term279745, 3, term281567);
        setField(term281681, term281681.getClass(), "value", term281739);
        setIntField(term281681, term281681.getClass(), "count", 0);
        setElement(term279745, 4, term281681);
        setField(term281853, term281853.getClass(), "value", term281911);
        setIntField(term281853, term281853.getClass(), "count", 0);
        setElement(term279745, 5, term281853);
        setField(term282025, term282025.getClass(), "value", term282083);
        setIntField(term282025, term282025.getClass(), "count", 0);
        setElement(term279745, 6, term282025);
        term284851 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 7);
        Object term284852 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term284853 = (char[]) newCharArray(522);
        Object term284854 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term284855 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term284858 = (byte[]) newByteArray(16);
        Object term284859 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term284860 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        Object term284861 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term284862 = (char[]) newCharArray(0);
        Object term284863 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term284864 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term284867 = (byte[]) newByteArray(16);
        Object term284868 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term284869 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term284872 = (byte[]) newByteArray(16);
        Object term284873 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term284874 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term284877 = (byte[]) newByteArray(16);
        setField(term284852, term284852.getClass(), "value", term284853);
        setIntField(term284852, term284852.getClass(), "count", 0);
        setElement(term284851, 0, term284852);
        setField(term284855, term284855.getClass(), "toStringCache", "");
        setField(term284855, term284855.getClass(), "value", term284858);
        setByteField(term284855, term284855.getClass(), "coder", (byte) 0);
        setIntField(term284855, term284855.getClass(), "count", 0);
        setField(term284854, term284854.getClass(), "value", term284855);
        setIntField(term284854, term284854.getClass(), "count", 0);
        setElement(term284851, 1, term284854);
        setField(term284859, term284859.getClass(), "value", term284860);
        setIntField(term284859, term284859.getClass(), "count", 0);
        setElement(term284851, 2, term284859);
        setField(term284861, term284861.getClass(), "value", term284862);
        setIntField(term284861, term284861.getClass(), "count", 0);
        setElement(term284851, 3, term284861);
        setField(term284864, term284864.getClass(), "toStringCache", "");
        setField(term284864, term284864.getClass(), "value", term284867);
        setByteField(term284864, term284864.getClass(), "coder", (byte) 0);
        setIntField(term284864, term284864.getClass(), "count", 0);
        setField(term284863, term284863.getClass(), "value", term284864);
        setIntField(term284863, term284863.getClass(), "count", 0);
        setElement(term284851, 4, term284863);
        setField(term284869, term284869.getClass(), "toStringCache", "");
        setField(term284869, term284869.getClass(), "value", term284872);
        setByteField(term284869, term284869.getClass(), "coder", (byte) 0);
        setIntField(term284869, term284869.getClass(), "count", 0);
        setField(term284868, term284868.getClass(), "value", term284869);
        setIntField(term284868, term284868.getClass(), "count", 0);
        setElement(term284851, 5, term284868);
        setField(term284874, term284874.getClass(), "toStringCache", "");
        setField(term284874, term284874.getClass(), "value", term284877);
        setByteField(term284874, term284874.getClass(), "coder", (byte) 0);
        setIntField(term284874, term284874.getClass(), "count", 0);
        setField(term284873, term284873.getClass(), "value", term284874);
        setIntField(term284873, term284873.getClass(), "count", 0);
        setElement(term284851, 6, term284873);
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
        args[0] = term279745;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term279745, term284851));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


