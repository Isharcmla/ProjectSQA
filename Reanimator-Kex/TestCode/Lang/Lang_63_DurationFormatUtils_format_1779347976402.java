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

public class DurationFormatUtils_format_1779347976402 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term332032;
     Object term334453;

    public DurationFormatUtils_format_1779347976402() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term332467 = new StringBuffer();
        StringBuffer term332639 = new StringBuffer();
        StringBuffer term333153 = new StringBuffer();
        StringBuffer term333325 = new StringBuffer();
        term332032 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 7);
        Object term332409 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term332581 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term332753 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term332867 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term332981 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term332169 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 0);
        Object term333095 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term333267 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term332409, term332409.getClass(), "value", term332467);
        setIntField(term332409, term332409.getClass(), "count", 0);
        setElement(term332032, 0, term332409);
        setField(term332581, term332581.getClass(), "value", term332639);
        setIntField(term332581, term332581.getClass(), "count", 0);
        setElement(term332032, 1, term332581);
        setField(term332753, term332753.getClass(), "value", term332467);
        setIntField(term332753, term332753.getClass(), "count", 0);
        setElement(term332032, 2, term332753);
        setField(term332981, term332981.getClass(), "value", term332169);
        setIntField(term332981, term332981.getClass(), "count", 0);
        setField(term332867, term332867.getClass(), "value", term332981);
        setIntField(term332867, term332867.getClass(), "count", 0);
        setElement(term332032, 3, term332867);
        setField(term333095, term333095.getClass(), "value", term333153);
        setIntField(term333095, term333095.getClass(), "count", 0);
        setElement(term332032, 4, term333095);
        setElement(term332032, 5, term332981);
        setField(term333267, term333267.getClass(), "value", term333325);
        setIntField(term333267, term333267.getClass(), "count", 0);
        setElement(term332032, 6, term333267);
        term334453 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 7);
        Object term334454 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term334455 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term334458 = (byte[]) newByteArray(16);
        Object term334459 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term334460 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term334463 = (byte[]) newByteArray(16);
        Object term334464 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term334465 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term334466 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object[] term334467 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 0);
        Object term334468 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term334469 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term334472 = (byte[]) newByteArray(16);
        Object term334473 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term334474 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term334477 = (byte[]) newByteArray(16);
        setField(term334455, term334455.getClass(), "toStringCache", "");
        setField(term334455, term334455.getClass(), "value", term334458);
        setByteField(term334455, term334455.getClass(), "coder", (byte) 0);
        setIntField(term334455, term334455.getClass(), "count", 0);
        setField(term334454, term334454.getClass(), "value", term334455);
        setIntField(term334454, term334454.getClass(), "count", 0);
        setElement(term334453, 0, term334454);
        setField(term334460, term334460.getClass(), "toStringCache", "");
        setField(term334460, term334460.getClass(), "value", term334463);
        setByteField(term334460, term334460.getClass(), "coder", (byte) 0);
        setIntField(term334460, term334460.getClass(), "count", 0);
        setField(term334459, term334459.getClass(), "value", term334460);
        setIntField(term334459, term334459.getClass(), "count", 0);
        setElement(term334453, 1, term334459);
        setField(term334464, term334464.getClass(), "value", term334455);
        setIntField(term334464, term334464.getClass(), "count", 0);
        setElement(term334453, 2, term334464);
        setField(term334466, term334466.getClass(), "value", term334467);
        setIntField(term334466, term334466.getClass(), "count", 0);
        setField(term334465, term334465.getClass(), "value", term334466);
        setIntField(term334465, term334465.getClass(), "count", 0);
        setElement(term334453, 3, term334465);
        setField(term334469, term334469.getClass(), "toStringCache", "");
        setField(term334469, term334469.getClass(), "value", term334472);
        setByteField(term334469, term334469.getClass(), "coder", (byte) 0);
        setIntField(term334469, term334469.getClass(), "count", 0);
        setField(term334468, term334468.getClass(), "value", term334469);
        setIntField(term334468, term334468.getClass(), "count", 0);
        setElement(term334453, 4, term334468);
        setElement(term334453, 5, term334466);
        setField(term334474, term334474.getClass(), "toStringCache", "");
        setField(term334474, term334474.getClass(), "value", term334477);
        setByteField(term334474, term334474.getClass(), "coder", (byte) 0);
        setIntField(term334474, term334474.getClass(), "count", 0);
        setField(term334473, term334473.getClass(), "value", term334474);
        setIntField(term334473, term334473.getClass(), "count", 0);
        setElement(term334453, 6, term334473);
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
        args[0] = term332032;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term332032, term334453));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


