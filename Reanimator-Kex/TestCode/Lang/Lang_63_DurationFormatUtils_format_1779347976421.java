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

public class DurationFormatUtils_format_1779347976421 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term352124;
     Object term353565;

    public DurationFormatUtils_format_1779347976421() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term353048 = new StringBuffer();
        StringBuilder term353222 = new StringBuilder();
        term352124 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 7);
        Object term352534 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term352648 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term352762 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term352876 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term352990 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term353162 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term353336 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term352275 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 0);
        setField(term352534, term352534.getClass(), "value", null);
        setIntField(term352534, term352534.getClass(), "count", 0);
        setElement(term352124, 0, term352534);
        setField(term352648, term352648.getClass(), "value", null);
        setIntField(term352648, term352648.getClass(), "count", 0);
        setElement(term352124, 1, term352648);
        setField(term352762, term352762.getClass(), "value", null);
        setIntField(term352762, term352762.getClass(), "count", 0);
        setElement(term352124, 2, term352762);
        setField(term352876, term352876.getClass(), "value", null);
        setIntField(term352876, term352876.getClass(), "count", 0);
        setElement(term352124, 3, term352876);
        setField(term352990, term352990.getClass(), "value", term353048);
        setIntField(term352990, term352990.getClass(), "count", 0);
        setElement(term352124, 4, term352990);
        setField(term353162, term353162.getClass(), "value", term353222);
        setIntField(term353162, term353162.getClass(), "count", 0);
        setElement(term352124, 5, term353162);
        setField(term353336, term353336.getClass(), "value", term352275);
        setIntField(term353336, term353336.getClass(), "count", 0);
        setElement(term352124, 6, term353336);
        term353565 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 7);
        Object term353566 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term353567 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term353568 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term353569 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term353570 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term353571 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term353574 = (byte[]) newByteArray(16);
        Object term353575 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term353576 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term353577 = (byte[]) newByteArray(16);
        Object term353578 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term353579 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 0);
        setField(term353566, term353566.getClass(), "value", null);
        setIntField(term353566, term353566.getClass(), "count", 0);
        setElement(term353565, 0, term353566);
        setField(term353567, term353567.getClass(), "value", null);
        setIntField(term353567, term353567.getClass(), "count", 0);
        setElement(term353565, 1, term353567);
        setField(term353568, term353568.getClass(), "value", null);
        setIntField(term353568, term353568.getClass(), "count", 0);
        setElement(term353565, 2, term353568);
        setField(term353569, term353569.getClass(), "value", null);
        setIntField(term353569, term353569.getClass(), "count", 0);
        setElement(term353565, 3, term353569);
        setField(term353571, term353571.getClass(), "toStringCache", "");
        setField(term353571, term353571.getClass(), "value", term353574);
        setByteField(term353571, term353571.getClass(), "coder", (byte) 0);
        setIntField(term353571, term353571.getClass(), "count", 0);
        setField(term353570, term353570.getClass(), "value", term353571);
        setIntField(term353570, term353570.getClass(), "count", 0);
        setElement(term353565, 4, term353570);
        setField(term353576, term353576.getClass(), "value", term353577);
        setByteField(term353576, term353576.getClass(), "coder", (byte) 0);
        setIntField(term353576, term353576.getClass(), "count", 0);
        setField(term353575, term353575.getClass(), "value", term353576);
        setIntField(term353575, term353575.getClass(), "count", 0);
        setElement(term353565, 5, term353575);
        setField(term353578, term353578.getClass(), "value", term353579);
        setIntField(term353578, term353578.getClass(), "count", 0);
        setElement(term353565, 6, term353578);
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
        args[0] = term352124;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term352124, term353565));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


