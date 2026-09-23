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
import java.lang.StringBuilder;
import java.lang.StringBuffer;

public class DurationFormatUtils_format_1779347976336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251929;
     Object term258438;

    public DurationFormatUtils_format_1779347976336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term255150 = new StringBuilder();
        StringBuffer term255322 = new StringBuffer();
        term251929 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term255090 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term255264 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term255436 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term255550 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term255664 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term255816 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term251945 = (char[]) newCharArray(264);
        setField(term255090, term255090.getClass(), "value", term255150);
        setIntField(term255090, term255090.getClass(), "count", 0);
        setElement(term251929, 0, term255090);
        setField(term255264, term255264.getClass(), "value", term255322);
        setIntField(term255264, term255264.getClass(), "count", 0);
        setElement(term251929, 1, term255264);
        setField(term255436, term255436.getClass(), "value", null);
        setIntField(term255436, term255436.getClass(), "count", 0);
        setElement(term251929, 2, term255436);
        setField(term255550, term255550.getClass(), "value", null);
        setIntField(term255550, term255550.getClass(), "count", 0);
        setElement(term251929, 3, term255550);
        setField(term255664, term255664.getClass(), "value", "");
        setIntField(term255664, term255664.getClass(), "count", 0);
        setElement(term251929, 4, term255664);
        setField(term255816, term255816.getClass(), "value", term251945);
        setIntField(term255816, term255816.getClass(), "count", 0);
        setElement(term251929, 5, term255816);
        term258438 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term258439 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term258440 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term258441 = (byte[]) newByteArray(16);
        Object term258442 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term258443 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term258446 = (byte[]) newByteArray(16);
        Object term258447 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term258448 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term258449 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term258452 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term258453 = (char[]) newCharArray(264);
        setField(term258440, term258440.getClass(), "value", term258441);
        setByteField(term258440, term258440.getClass(), "coder", (byte) 0);
        setIntField(term258440, term258440.getClass(), "count", 0);
        setField(term258439, term258439.getClass(), "value", term258440);
        setIntField(term258439, term258439.getClass(), "count", 0);
        setElement(term258438, 0, term258439);
        setField(term258443, term258443.getClass(), "toStringCache", "");
        setField(term258443, term258443.getClass(), "value", term258446);
        setByteField(term258443, term258443.getClass(), "coder", (byte) 0);
        setIntField(term258443, term258443.getClass(), "count", 0);
        setField(term258442, term258442.getClass(), "value", term258443);
        setIntField(term258442, term258442.getClass(), "count", 0);
        setElement(term258438, 1, term258442);
        setField(term258447, term258447.getClass(), "value", null);
        setIntField(term258447, term258447.getClass(), "count", 0);
        setElement(term258438, 2, term258447);
        setField(term258448, term258448.getClass(), "value", null);
        setIntField(term258448, term258448.getClass(), "count", 0);
        setElement(term258438, 3, term258448);
        setField(term258449, term258449.getClass(), "value", "");
        setIntField(term258449, term258449.getClass(), "count", 0);
        setElement(term258438, 4, term258449);
        setField(term258452, term258452.getClass(), "value", term258453);
        setIntField(term258452, term258452.getClass(), "count", 0);
        setElement(term258438, 5, term258452);
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
        args[0] = term251929;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term251929, term258438));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


