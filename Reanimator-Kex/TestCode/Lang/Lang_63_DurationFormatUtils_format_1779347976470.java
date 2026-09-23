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

public class DurationFormatUtils_format_1779347976470 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term397979;
     Object term400980;

    public DurationFormatUtils_format_1779347976470() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term398974 = new StringBuffer();
        StringBuffer term399476 = new StringBuffer();
        term397979 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term398700 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term398802 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        Object term398916 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term399088 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term399202 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term399304 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        Object term399418 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term398700, term398700.getClass(), "value", term398802);
        setIntField(term398700, term398700.getClass(), "count", 0);
        setElement(term397979, 0, term398700);
        setField(term398916, term398916.getClass(), "value", term398974);
        setIntField(term398916, term398916.getClass(), "count", 0);
        setElement(term397979, 1, term398916);
        setField(term399202, term399202.getClass(), "value", term399304);
        setIntField(term399202, term399202.getClass(), "count", 0);
        setField(term399088, term399088.getClass(), "value", term399202);
        setIntField(term399088, term399088.getClass(), "count", 0);
        setElement(term397979, 2, term399088);
        setField(term399418, term399418.getClass(), "value", term399476);
        setIntField(term399418, term399418.getClass(), "count", 0);
        setElement(term397979, 3, term399418);
        setElement(term397979, 4, term399202);
        term400980 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 5);
        Object term400981 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term400982 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        Object term400983 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term400984 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term400987 = (byte[]) newByteArray(16);
        Object term400988 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term400989 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term400990 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        Object term400991 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term400992 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term400995 = (byte[]) newByteArray(16);
        setField(term400981, term400981.getClass(), "value", term400982);
        setIntField(term400981, term400981.getClass(), "count", 0);
        setElement(term400980, 0, term400981);
        setField(term400984, term400984.getClass(), "toStringCache", "");
        setField(term400984, term400984.getClass(), "value", term400987);
        setByteField(term400984, term400984.getClass(), "coder", (byte) 0);
        setIntField(term400984, term400984.getClass(), "count", 0);
        setField(term400983, term400983.getClass(), "value", term400984);
        setIntField(term400983, term400983.getClass(), "count", 0);
        setElement(term400980, 1, term400983);
        setField(term400989, term400989.getClass(), "value", term400990);
        setIntField(term400989, term400989.getClass(), "count", 0);
        setField(term400988, term400988.getClass(), "value", term400989);
        setIntField(term400988, term400988.getClass(), "count", 0);
        setElement(term400980, 2, term400988);
        setField(term400992, term400992.getClass(), "toStringCache", "");
        setField(term400992, term400992.getClass(), "value", term400995);
        setByteField(term400992, term400992.getClass(), "coder", (byte) 0);
        setIntField(term400992, term400992.getClass(), "count", 0);
        setField(term400991, term400991.getClass(), "value", term400992);
        setIntField(term400991, term400991.getClass(), "count", 0);
        setElement(term400980, 3, term400991);
        setElement(term400980, 4, term400989);
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
        args[0] = term397979;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term397979, term400980));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


