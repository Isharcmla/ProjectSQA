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

public class DurationFormatUtils_format_1779347976149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106000;
     Object term107595;

    public DurationFormatUtils_format_1779347976149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term106470 = new StringBuilder();
        StringBuffer term106642 = new StringBuffer();
        StringBuilder term106816 = new StringBuilder();
        term106000 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term106296 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term106060 = (char[]) newCharArray(0);
        Object term106410 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term106584 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term106756 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term106930 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term106296, term106296.getClass(), "value", term106060);
        setIntField(term106296, term106296.getClass(), "count", 0);
        setElement(term106000, 0, term106296);
        setField(term106410, term106410.getClass(), "value", term106470);
        setIntField(term106410, term106410.getClass(), "count", 0);
        setElement(term106000, 1, term106410);
        setField(term106584, term106584.getClass(), "value", term106642);
        setIntField(term106584, term106584.getClass(), "count", 0);
        setElement(term106000, 2, term106584);
        setField(term106756, term106756.getClass(), "value", term106816);
        setIntField(term106756, term106756.getClass(), "count", 0);
        setElement(term106000, 3, term106756);
        setElement(term106000, 4, term106410);
        setElement(term106000, 5, term106930);
        term107595 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term107596 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term107597 = (char[]) newCharArray(0);
        Object term107598 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term107599 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term107600 = (byte[]) newByteArray(16);
        Object term107601 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term107602 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term107605 = (byte[]) newByteArray(16);
        Object term107606 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term107607 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term107608 = (byte[]) newByteArray(16);
        Object term107609 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term107596, term107596.getClass(), "value", term107597);
        setIntField(term107596, term107596.getClass(), "count", 0);
        setElement(term107595, 0, term107596);
        setField(term107599, term107599.getClass(), "value", term107600);
        setByteField(term107599, term107599.getClass(), "coder", (byte) 0);
        setIntField(term107599, term107599.getClass(), "count", 0);
        setField(term107598, term107598.getClass(), "value", term107599);
        setIntField(term107598, term107598.getClass(), "count", 0);
        setElement(term107595, 1, term107598);
        setField(term107602, term107602.getClass(), "toStringCache", "");
        setField(term107602, term107602.getClass(), "value", term107605);
        setByteField(term107602, term107602.getClass(), "coder", (byte) 0);
        setIntField(term107602, term107602.getClass(), "count", 0);
        setField(term107601, term107601.getClass(), "value", term107602);
        setIntField(term107601, term107601.getClass(), "count", 0);
        setElement(term107595, 2, term107601);
        setField(term107607, term107607.getClass(), "value", term107608);
        setByteField(term107607, term107607.getClass(), "coder", (byte) 0);
        setIntField(term107607, term107607.getClass(), "count", 0);
        setField(term107606, term107606.getClass(), "value", term107607);
        setIntField(term107606, term107606.getClass(), "count", 0);
        setElement(term107595, 3, term107606);
        setElement(term107595, 4, term107598);
        setField(term107609, term107609.getClass(), "value", null);
        setIntField(term107609, term107609.getClass(), "count", 0);
        setElement(term107595, 5, term107609);
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
        args[0] = term106000;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term106000, term107595));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


