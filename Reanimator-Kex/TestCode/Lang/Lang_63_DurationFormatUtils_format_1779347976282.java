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

public class DurationFormatUtils_format_1779347976282 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term204872;
     Object term207269;

    public DurationFormatUtils_format_1779347976282() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term205447 = new StringBuffer();
        term204872 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term205237 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term205389 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term205561 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term205675 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term205789 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term204997 = (char[]) newCharArray(0);
        setField(term205237, term205237.getClass(), "value", "");
        setIntField(term205237, term205237.getClass(), "count", 0);
        setElement(term204872, 0, term205237);
        setField(term205389, term205389.getClass(), "value", term205447);
        setIntField(term205389, term205389.getClass(), "count", 0);
        setElement(term204872, 1, term205389);
        setField(term205561, term205561.getClass(), "value", null);
        setIntField(term205561, term205561.getClass(), "count", 0);
        setElement(term204872, 2, term205561);
        setField(term205675, term205675.getClass(), "value", null);
        setIntField(term205675, term205675.getClass(), "count", 0);
        setElement(term204872, 3, term205675);
        setElement(term204872, 4, term205675);
        setField(term205789, term205789.getClass(), "value", term204997);
        setIntField(term205789, term205789.getClass(), "count", 0);
        setElement(term204872, 5, term205789);
        term207269 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term207270 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term207273 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term207274 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term207277 = (byte[]) newByteArray(16);
        Object term207278 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term207279 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term207280 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term207281 = (char[]) newCharArray(0);
        setField(term207270, term207270.getClass(), "value", "");
        setIntField(term207270, term207270.getClass(), "count", 0);
        setElement(term207269, 0, term207270);
        setField(term207274, term207274.getClass(), "toStringCache", "");
        setField(term207274, term207274.getClass(), "value", term207277);
        setByteField(term207274, term207274.getClass(), "coder", (byte) 0);
        setIntField(term207274, term207274.getClass(), "count", 0);
        setField(term207273, term207273.getClass(), "value", term207274);
        setIntField(term207273, term207273.getClass(), "count", 0);
        setElement(term207269, 1, term207273);
        setField(term207278, term207278.getClass(), "value", null);
        setIntField(term207278, term207278.getClass(), "count", 0);
        setElement(term207269, 2, term207278);
        setField(term207279, term207279.getClass(), "value", null);
        setIntField(term207279, term207279.getClass(), "count", 0);
        setElement(term207269, 3, term207279);
        setElement(term207269, 4, term207279);
        setField(term207280, term207280.getClass(), "value", term207281);
        setIntField(term207280, term207280.getClass(), "count", 0);
        setElement(term207269, 5, term207280);
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
        args[0] = term204872;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term204872, term207269));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


