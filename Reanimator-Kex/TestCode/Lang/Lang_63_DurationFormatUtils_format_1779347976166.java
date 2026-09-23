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

public class DurationFormatUtils_format_1779347976166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119422;
     Object term122497;

    public DurationFormatUtils_format_1779347976166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term120682 = new StringBuffer();
        term119422 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term120168 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term120282 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term120396 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term120510 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term120624 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term120796 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term120168, term120168.getClass(), "value", null);
        setIntField(term120168, term120168.getClass(), "count", 0);
        setElement(term119422, 0, term120168);
        setField(term120282, term120282.getClass(), "value", null);
        setIntField(term120282, term120282.getClass(), "count", 0);
        setElement(term119422, 1, term120282);
        setField(term120396, term120396.getClass(), "value", null);
        setIntField(term120396, term120396.getClass(), "count", 0);
        setElement(term119422, 2, term120396);
        setField(term120510, term120510.getClass(), "value", null);
        setIntField(term120510, term120510.getClass(), "count", 0);
        setElement(term119422, 3, term120510);
        setField(term120624, term120624.getClass(), "value", term120682);
        setIntField(term120624, term120624.getClass(), "count", 0);
        setElement(term119422, 4, term120624);
        setField(term120796, term120796.getClass(), "value", "");
        setIntField(term120796, term120796.getClass(), "count", 0);
        setElement(term119422, 5, term120796);
        term122497 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term122498 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term122499 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term122500 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term122501 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term122502 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term122503 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term122506 = (byte[]) newByteArray(16);
        Object term122507 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term122498, term122498.getClass(), "value", null);
        setIntField(term122498, term122498.getClass(), "count", 0);
        setElement(term122497, 0, term122498);
        setField(term122499, term122499.getClass(), "value", null);
        setIntField(term122499, term122499.getClass(), "count", 0);
        setElement(term122497, 1, term122499);
        setField(term122500, term122500.getClass(), "value", null);
        setIntField(term122500, term122500.getClass(), "count", 0);
        setElement(term122497, 2, term122500);
        setField(term122501, term122501.getClass(), "value", null);
        setIntField(term122501, term122501.getClass(), "count", 0);
        setElement(term122497, 3, term122501);
        setField(term122503, term122503.getClass(), "toStringCache", "");
        setField(term122503, term122503.getClass(), "value", term122506);
        setByteField(term122503, term122503.getClass(), "coder", (byte) 0);
        setIntField(term122503, term122503.getClass(), "count", 0);
        setField(term122502, term122502.getClass(), "value", term122503);
        setIntField(term122502, term122502.getClass(), "count", 0);
        setElement(term122497, 4, term122502);
        setField(term122507, term122507.getClass(), "value", "");
        setIntField(term122507, term122507.getClass(), "count", 0);
        setElement(term122497, 5, term122507);
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
        args[0] = term119422;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term119422, term122497));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


