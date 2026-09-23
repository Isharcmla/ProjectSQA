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

public class DurationFormatUtils_format_1779347976431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term360421;
     Object term363145;

    public DurationFormatUtils_format_1779347976431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term361702 = new StringBuilder();
        StringBuffer term361874 = new StringBuffer();
        StringBuilder term362276 = new StringBuilder();
        term360421 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 9);
        Object term361224 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term361376 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term361528 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term361642 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term361816 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term361988 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term362102 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term362216 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term362390 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term361224, term361224.getClass(), "value", "");
        setIntField(term361224, term361224.getClass(), "count", 0);
        setElement(term360421, 0, term361224);
        setField(term361376, term361376.getClass(), "value", "");
        setIntField(term361376, term361376.getClass(), "count", 0);
        setElement(term360421, 1, term361376);
        setField(term361528, term361528.getClass(), "value", term361376);
        setIntField(term361528, term361528.getClass(), "count", 0);
        setElement(term360421, 2, term361528);
        setField(term361642, term361642.getClass(), "value", term361702);
        setIntField(term361642, term361642.getClass(), "count", 0);
        setElement(term360421, 3, term361642);
        setField(term361816, term361816.getClass(), "value", term361874);
        setIntField(term361816, term361816.getClass(), "count", 0);
        setElement(term360421, 4, term361816);
        setField(term362102, term362102.getClass(), "value", term361816);
        setIntField(term362102, term362102.getClass(), "count", 0);
        setField(term361988, term361988.getClass(), "value", term362102);
        setIntField(term361988, term361988.getClass(), "count", 0);
        setElement(term360421, 5, term361988);
        setField(term362216, term362216.getClass(), "value", term362276);
        setIntField(term362216, term362216.getClass(), "count", 0);
        setElement(term360421, 6, term362216);
        setElement(term360421, 7, term362102);
        setField(term362390, term362390.getClass(), "value", term361528);
        setIntField(term362390, term362390.getClass(), "count", 0);
        setElement(term360421, 8, term362390);
        term363145 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 9);
        Object term363146 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term363149 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term363152 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term363153 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term363154 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term363155 = (byte[]) newByteArray(16);
        Object term363156 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term363157 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term363160 = (byte[]) newByteArray(16);
        Object term363161 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term363162 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term363163 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term363164 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term363165 = (byte[]) newByteArray(16);
        Object term363166 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term363146, term363146.getClass(), "value", "");
        setIntField(term363146, term363146.getClass(), "count", 0);
        setElement(term363145, 0, term363146);
        setField(term363149, term363149.getClass(), "value", "");
        setIntField(term363149, term363149.getClass(), "count", 0);
        setElement(term363145, 1, term363149);
        setField(term363152, term363152.getClass(), "value", term363149);
        setIntField(term363152, term363152.getClass(), "count", 0);
        setElement(term363145, 2, term363152);
        setField(term363154, term363154.getClass(), "value", term363155);
        setByteField(term363154, term363154.getClass(), "coder", (byte) 0);
        setIntField(term363154, term363154.getClass(), "count", 0);
        setField(term363153, term363153.getClass(), "value", term363154);
        setIntField(term363153, term363153.getClass(), "count", 0);
        setElement(term363145, 3, term363153);
        setField(term363157, term363157.getClass(), "toStringCache", "");
        setField(term363157, term363157.getClass(), "value", term363160);
        setByteField(term363157, term363157.getClass(), "coder", (byte) 0);
        setIntField(term363157, term363157.getClass(), "count", 0);
        setField(term363156, term363156.getClass(), "value", term363157);
        setIntField(term363156, term363156.getClass(), "count", 0);
        setElement(term363145, 4, term363156);
        setField(term363162, term363162.getClass(), "value", term363156);
        setIntField(term363162, term363162.getClass(), "count", 0);
        setField(term363161, term363161.getClass(), "value", term363162);
        setIntField(term363161, term363161.getClass(), "count", 0);
        setElement(term363145, 5, term363161);
        setField(term363164, term363164.getClass(), "value", term363165);
        setByteField(term363164, term363164.getClass(), "coder", (byte) 0);
        setIntField(term363164, term363164.getClass(), "count", 0);
        setField(term363163, term363163.getClass(), "value", term363164);
        setIntField(term363163, term363163.getClass(), "count", 0);
        setElement(term363145, 6, term363163);
        setElement(term363145, 7, term363162);
        setField(term363166, term363166.getClass(), "value", term363152);
        setIntField(term363166, term363166.getClass(), "count", 0);
        setElement(term363145, 8, term363166);
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
        args[0] = term360421;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term360421, term363145));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


