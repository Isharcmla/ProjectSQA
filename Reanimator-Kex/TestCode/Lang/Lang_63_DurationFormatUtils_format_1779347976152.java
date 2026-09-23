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

public class DurationFormatUtils_format_1779347976152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107658;
     Object term109229;

    public DurationFormatUtils_format_1779347976152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term108136 = new StringBuffer();
        StringBuilder term108310 = new StringBuilder();
        term107658 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 2);
        Object term108078 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term108250 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term108078, term108078.getClass(), "value", term108136);
        setIntField(term108078, term108078.getClass(), "count", 0);
        setElement(term107658, 0, term108078);
        setField(term108250, term108250.getClass(), "value", term108310);
        setIntField(term108250, term108250.getClass(), "count", 0);
        setElement(term107658, 1, term108250);
        term109229 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 2);
        Object term109230 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term109231 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term109234 = (byte[]) newByteArray(16);
        Object term109235 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term109236 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term109237 = (byte[]) newByteArray(16);
        setField(term109231, term109231.getClass(), "toStringCache", "");
        setField(term109231, term109231.getClass(), "value", term109234);
        setByteField(term109231, term109231.getClass(), "coder", (byte) 0);
        setIntField(term109231, term109231.getClass(), "count", 0);
        setField(term109230, term109230.getClass(), "value", term109231);
        setIntField(term109230, term109230.getClass(), "count", 0);
        setElement(term109229, 0, term109230);
        setField(term109236, term109236.getClass(), "value", term109237);
        setByteField(term109236, term109236.getClass(), "coder", (byte) 0);
        setIntField(term109236, term109236.getClass(), "count", 0);
        setField(term109235, term109235.getClass(), "value", term109236);
        setIntField(term109235, term109235.getClass(), "count", 0);
        setElement(term109229, 1, term109235);
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
        args[0] = term107658;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term107658, term109229));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


