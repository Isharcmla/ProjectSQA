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

public class DurationFormatUtils_format_1779347976119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87650;
     Object term88682;

    public DurationFormatUtils_format_1779347976119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term87985 = new StringBuilder();
        StringBuffer term88271 = new StringBuffer();
        StringBuffer term88443 = new StringBuffer();
        term87650 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term87925 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term88099 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term88213 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term88385 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term87925, term87925.getClass(), "value", term87985);
        setIntField(term87925, term87925.getClass(), "count", 0);
        setElement(term87650, 0, term87925);
        setField(term88099, term88099.getClass(), "value", null);
        setIntField(term88099, term88099.getClass(), "count", 0);
        setElement(term87650, 1, term88099);
        setField(term88213, term88213.getClass(), "value", term88271);
        setIntField(term88213, term88213.getClass(), "count", 0);
        setElement(term87650, 2, term88213);
        setField(term88385, term88385.getClass(), "value", term88443);
        setIntField(term88385, term88385.getClass(), "count", 0);
        setElement(term87650, 3, term88385);
        term88682 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 4);
        Object term88683 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term88684 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term88685 = (byte[]) newByteArray(16);
        Object term88686 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term88687 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term88688 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term88691 = (byte[]) newByteArray(16);
        Object term88692 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term88693 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term88696 = (byte[]) newByteArray(16);
        setField(term88684, term88684.getClass(), "value", term88685);
        setByteField(term88684, term88684.getClass(), "coder", (byte) 0);
        setIntField(term88684, term88684.getClass(), "count", 0);
        setField(term88683, term88683.getClass(), "value", term88684);
        setIntField(term88683, term88683.getClass(), "count", 0);
        setElement(term88682, 0, term88683);
        setField(term88686, term88686.getClass(), "value", null);
        setIntField(term88686, term88686.getClass(), "count", 0);
        setElement(term88682, 1, term88686);
        setField(term88688, term88688.getClass(), "toStringCache", "");
        setField(term88688, term88688.getClass(), "value", term88691);
        setByteField(term88688, term88688.getClass(), "coder", (byte) 0);
        setIntField(term88688, term88688.getClass(), "count", 0);
        setField(term88687, term88687.getClass(), "value", term88688);
        setIntField(term88687, term88687.getClass(), "count", 0);
        setElement(term88682, 2, term88687);
        setField(term88693, term88693.getClass(), "toStringCache", "");
        setField(term88693, term88693.getClass(), "value", term88696);
        setByteField(term88693, term88693.getClass(), "coder", (byte) 0);
        setIntField(term88693, term88693.getClass(), "count", 0);
        setField(term88692, term88692.getClass(), "value", term88693);
        setIntField(term88692, term88692.getClass(), "count", 0);
        setElement(term88682, 3, term88692);
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
        args[0] = term87650;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term87650, term88682));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


