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
import java.lang.StringBuilder;

public class DurationFormatUtils_format_1779347976480 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term406697;
     Object term410255;

    public DurationFormatUtils_format_1779347976480() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term407301 = new StringBuffer();
        StringBuilder term407931 = new StringBuilder();
        term406697 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 7);
        Object term407243 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term407415 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term407529 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term407643 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term407757 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term407871 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term407243, term407243.getClass(), "value", term407301);
        setIntField(term407243, term407243.getClass(), "count", 0);
        setElement(term406697, 0, term407243);
        setField(term407415, term407415.getClass(), "value", null);
        setIntField(term407415, term407415.getClass(), "count", 0);
        setElement(term406697, 1, term407415);
        setField(term407529, term407529.getClass(), "value", null);
        setIntField(term407529, term407529.getClass(), "count", 0);
        setElement(term406697, 2, term407529);
        setField(term407643, term407643.getClass(), "value", null);
        setIntField(term407643, term407643.getClass(), "count", 0);
        setElement(term406697, 3, term407643);
        setElement(term406697, 4, term407415);
        setField(term407757, term407757.getClass(), "value", null);
        setIntField(term407757, term407757.getClass(), "count", 0);
        setElement(term406697, 5, term407757);
        setField(term407871, term407871.getClass(), "value", term407931);
        setIntField(term407871, term407871.getClass(), "count", 0);
        setElement(term406697, 6, term407871);
        term410255 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 7);
        Object term410256 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term410257 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term410260 = (byte[]) newByteArray(16);
        Object term410261 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term410262 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term410263 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term410264 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term410265 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term410266 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term410267 = (byte[]) newByteArray(16);
        setField(term410257, term410257.getClass(), "toStringCache", "");
        setField(term410257, term410257.getClass(), "value", term410260);
        setByteField(term410257, term410257.getClass(), "coder", (byte) 0);
        setIntField(term410257, term410257.getClass(), "count", 0);
        setField(term410256, term410256.getClass(), "value", term410257);
        setIntField(term410256, term410256.getClass(), "count", 0);
        setElement(term410255, 0, term410256);
        setField(term410261, term410261.getClass(), "value", null);
        setIntField(term410261, term410261.getClass(), "count", 0);
        setElement(term410255, 1, term410261);
        setField(term410262, term410262.getClass(), "value", null);
        setIntField(term410262, term410262.getClass(), "count", 0);
        setElement(term410255, 2, term410262);
        setField(term410263, term410263.getClass(), "value", null);
        setIntField(term410263, term410263.getClass(), "count", 0);
        setElement(term410255, 3, term410263);
        setElement(term410255, 4, term410261);
        setField(term410264, term410264.getClass(), "value", null);
        setIntField(term410264, term410264.getClass(), "count", 0);
        setElement(term410255, 5, term410264);
        setField(term410266, term410266.getClass(), "value", term410267);
        setByteField(term410266, term410266.getClass(), "coder", (byte) 0);
        setIntField(term410266, term410266.getClass(), "count", 0);
        setField(term410265, term410265.getClass(), "value", term410266);
        setIntField(term410265, term410265.getClass(), "count", 0);
        setElement(term410255, 6, term410265);
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
        args[0] = term406697;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term406697, term410255));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


