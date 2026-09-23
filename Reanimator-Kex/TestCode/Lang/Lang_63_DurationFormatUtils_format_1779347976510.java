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

public class DurationFormatUtils_format_1779347976510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term430636;
     Object term433269;

    public DurationFormatUtils_format_1779347976510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term431006 = new StringBuffer();
        StringBuffer term431178 = new StringBuffer();
        StringBuffer term431464 = new StringBuffer();
        term430636 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 7);
        Object term430948 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term431120 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term431292 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term431406 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term431578 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term430704 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 0);
        setField(term430948, term430948.getClass(), "value", term431006);
        setIntField(term430948, term430948.getClass(), "count", 0);
        setElement(term430636, 0, term430948);
        setField(term431120, term431120.getClass(), "value", term431178);
        setIntField(term431120, term431120.getClass(), "count", 0);
        setElement(term430636, 1, term431120);
        setField(term431292, term431292.getClass(), "value", null);
        setIntField(term431292, term431292.getClass(), "count", 0);
        setElement(term430636, 2, term431292);
        setElement(term430636, 3, term431120);
        setField(term431406, term431406.getClass(), "value", term431464);
        setIntField(term431406, term431406.getClass(), "count", 0);
        setElement(term430636, 4, term431406);
        setElement(term430636, 5, term431292);
        setField(term431578, term431578.getClass(), "value", term430704);
        setIntField(term431578, term431578.getClass(), "count", 0);
        setElement(term430636, 6, term431578);
        term433269 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 7);
        Object term433270 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term433271 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term433274 = (byte[]) newByteArray(16);
        Object term433275 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term433276 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term433279 = (byte[]) newByteArray(16);
        Object term433280 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term433281 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term433282 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term433285 = (byte[]) newByteArray(16);
        Object term433286 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term433287 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 0);
        setField(term433271, term433271.getClass(), "toStringCache", "");
        setField(term433271, term433271.getClass(), "value", term433274);
        setByteField(term433271, term433271.getClass(), "coder", (byte) 0);
        setIntField(term433271, term433271.getClass(), "count", 0);
        setField(term433270, term433270.getClass(), "value", term433271);
        setIntField(term433270, term433270.getClass(), "count", 0);
        setElement(term433269, 0, term433270);
        setField(term433276, term433276.getClass(), "toStringCache", "");
        setField(term433276, term433276.getClass(), "value", term433279);
        setByteField(term433276, term433276.getClass(), "coder", (byte) 0);
        setIntField(term433276, term433276.getClass(), "count", 0);
        setField(term433275, term433275.getClass(), "value", term433276);
        setIntField(term433275, term433275.getClass(), "count", 0);
        setElement(term433269, 1, term433275);
        setField(term433280, term433280.getClass(), "value", null);
        setIntField(term433280, term433280.getClass(), "count", 0);
        setElement(term433269, 2, term433280);
        setElement(term433269, 3, term433275);
        setField(term433282, term433282.getClass(), "toStringCache", "");
        setField(term433282, term433282.getClass(), "value", term433285);
        setByteField(term433282, term433282.getClass(), "coder", (byte) 0);
        setIntField(term433282, term433282.getClass(), "count", 0);
        setField(term433281, term433281.getClass(), "value", term433282);
        setIntField(term433281, term433281.getClass(), "count", 0);
        setElement(term433269, 4, term433281);
        setElement(term433269, 5, term433280);
        setField(term433286, term433286.getClass(), "value", term433287);
        setIntField(term433286, term433286.getClass(), "count", 0);
        setElement(term433269, 6, term433286);
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
        args[0] = term430636;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term430636, term433269));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


