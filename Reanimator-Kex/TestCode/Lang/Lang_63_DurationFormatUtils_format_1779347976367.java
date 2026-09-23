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

public class DurationFormatUtils_format_1779347976367 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289704;
     Object term291289;

    public DurationFormatUtils_format_1779347976367() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term290144 = new StringBuffer();
        StringBuilder term290318 = new StringBuilder();
        StringBuffer term290490 = new StringBuffer();
        term289704 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term290086 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term290258 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term290432 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term290604 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term290706 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        Object term290820 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term290934 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term290086, term290086.getClass(), "value", term290144);
        setIntField(term290086, term290086.getClass(), "count", 0);
        setElement(term289704, 0, term290086);
        setField(term290258, term290258.getClass(), "value", term290318);
        setIntField(term290258, term290258.getClass(), "count", 0);
        setElement(term289704, 1, term290258);
        setField(term290432, term290432.getClass(), "value", term290490);
        setIntField(term290432, term290432.getClass(), "count", 0);
        setElement(term289704, 2, term290432);
        setField(term290604, term290604.getClass(), "value", term290706);
        setIntField(term290604, term290604.getClass(), "count", 0);
        setElement(term289704, 3, term290604);
        setField(term290820, term290820.getClass(), "value", term290490);
        setIntField(term290820, term290820.getClass(), "count", 0);
        setElement(term289704, 4, term290820);
        setField(term290934, term290934.getClass(), "value", term290820);
        setIntField(term290934, term290934.getClass(), "count", 0);
        setElement(term289704, 5, term290934);
        term291289 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term291290 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term291291 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term291294 = (byte[]) newByteArray(16);
        Object term291295 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term291296 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term291297 = (byte[]) newByteArray(16);
        Object term291298 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term291299 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term291302 = (byte[]) newByteArray(16);
        Object term291303 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term291304 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils"));
        Object term291305 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term291306 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term291291, term291291.getClass(), "toStringCache", "");
        setField(term291291, term291291.getClass(), "value", term291294);
        setByteField(term291291, term291291.getClass(), "coder", (byte) 0);
        setIntField(term291291, term291291.getClass(), "count", 0);
        setField(term291290, term291290.getClass(), "value", term291291);
        setIntField(term291290, term291290.getClass(), "count", 0);
        setElement(term291289, 0, term291290);
        setField(term291296, term291296.getClass(), "value", term291297);
        setByteField(term291296, term291296.getClass(), "coder", (byte) 0);
        setIntField(term291296, term291296.getClass(), "count", 0);
        setField(term291295, term291295.getClass(), "value", term291296);
        setIntField(term291295, term291295.getClass(), "count", 0);
        setElement(term291289, 1, term291295);
        setField(term291299, term291299.getClass(), "toStringCache", "");
        setField(term291299, term291299.getClass(), "value", term291302);
        setByteField(term291299, term291299.getClass(), "coder", (byte) 0);
        setIntField(term291299, term291299.getClass(), "count", 0);
        setField(term291298, term291298.getClass(), "value", term291299);
        setIntField(term291298, term291298.getClass(), "count", 0);
        setElement(term291289, 2, term291298);
        setField(term291303, term291303.getClass(), "value", term291304);
        setIntField(term291303, term291303.getClass(), "count", 0);
        setElement(term291289, 3, term291303);
        setField(term291305, term291305.getClass(), "value", term291299);
        setIntField(term291305, term291305.getClass(), "count", 0);
        setElement(term291289, 4, term291305);
        setField(term291306, term291306.getClass(), "value", term291305);
        setIntField(term291306, term291306.getClass(), "count", 0);
        setElement(term291289, 5, term291306);
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
        args[0] = term289704;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term289704, term291289));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


