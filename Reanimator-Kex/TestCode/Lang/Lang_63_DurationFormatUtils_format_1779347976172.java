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

public class DurationFormatUtils_format_1779347976172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123421;
     Object term125855;

    public DurationFormatUtils_format_1779347976172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term124171 = new StringBuilder();
        StringBuffer term124343 = new StringBuffer();
        term123421 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 3);
        Object term124111 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term124285 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term124457 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term124111, term124111.getClass(), "value", term124171);
        setIntField(term124111, term124111.getClass(), "count", 0);
        setElement(term123421, 0, term124111);
        setField(term124285, term124285.getClass(), "value", term124343);
        setIntField(term124285, term124285.getClass(), "count", 0);
        setElement(term123421, 1, term124285);
        setElement(term123421, 2, term124457);
        term125855 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 3);
        Object term125856 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term125857 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term125858 = (byte[]) newByteArray(16);
        Object term125859 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term125860 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term125863 = (byte[]) newByteArray(16);
        Object term125864 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term125857, term125857.getClass(), "value", term125858);
        setByteField(term125857, term125857.getClass(), "coder", (byte) 0);
        setIntField(term125857, term125857.getClass(), "count", 0);
        setField(term125856, term125856.getClass(), "value", term125857);
        setIntField(term125856, term125856.getClass(), "count", 0);
        setElement(term125855, 0, term125856);
        setField(term125860, term125860.getClass(), "toStringCache", "");
        setField(term125860, term125860.getClass(), "value", term125863);
        setByteField(term125860, term125860.getClass(), "coder", (byte) 0);
        setIntField(term125860, term125860.getClass(), "count", 0);
        setField(term125859, term125859.getClass(), "value", term125860);
        setIntField(term125859, term125859.getClass(), "count", 0);
        setElement(term125855, 1, term125859);
        setField(term125864, term125864.getClass(), "value", null);
        setIntField(term125864, term125864.getClass(), "count", 0);
        setElement(term125855, 2, term125864);
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
        args[0] = term123421;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term123421, term125855));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


