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

public class DurationFormatUtils_format_1779347976353 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term272429;
     Object term274430;

    public DurationFormatUtils_format_1779347976353() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuffer term273253 = new StringBuffer();
        StringBuffer term273425 = new StringBuffer();
        StringBuffer term273597 = new StringBuffer();
        StringBuffer term273769 = new StringBuffer();
        StringBuffer term274055 = new StringBuffer();
        term272429 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term273195 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term273367 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term273539 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term273711 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term273883 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term272974 = (char[]) newCharArray(0);
        Object term273997 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        setField(term273195, term273195.getClass(), "value", term273253);
        setIntField(term273195, term273195.getClass(), "count", 0);
        setElement(term272429, 0, term273195);
        setField(term273367, term273367.getClass(), "value", term273425);
        setIntField(term273367, term273367.getClass(), "count", 0);
        setElement(term272429, 1, term273367);
        setField(term273539, term273539.getClass(), "value", term273597);
        setIntField(term273539, term273539.getClass(), "count", 0);
        setElement(term272429, 2, term273539);
        setField(term273711, term273711.getClass(), "value", term273769);
        setIntField(term273711, term273711.getClass(), "count", 0);
        setElement(term272429, 3, term273711);
        setField(term273883, term273883.getClass(), "value", term272974);
        setIntField(term273883, term273883.getClass(), "count", 0);
        setElement(term272429, 4, term273883);
        setField(term273997, term273997.getClass(), "value", term274055);
        setIntField(term273997, term273997.getClass(), "count", 0);
        setElement(term272429, 5, term273997);
        term274430 = (Object[]) newArray("org.apache.commons.lang.time.DurationFormatUtils$Token", 6);
        Object term274431 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term274432 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term274435 = (byte[]) newByteArray(16);
        Object term274436 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term274437 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term274440 = (byte[]) newByteArray(16);
        Object term274441 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term274442 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term274445 = (byte[]) newByteArray(16);
        Object term274446 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term274447 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term274450 = (byte[]) newByteArray(16);
        Object term274451 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        char[] term274452 = (char[]) newCharArray(0);
        Object term274453 = newInstance(Class.forName("org.apache.commons.lang.time.DurationFormatUtils$Token"));
        Object term274454 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term274457 = (byte[]) newByteArray(16);
        setField(term274432, term274432.getClass(), "toStringCache", "");
        setField(term274432, term274432.getClass(), "value", term274435);
        setByteField(term274432, term274432.getClass(), "coder", (byte) 0);
        setIntField(term274432, term274432.getClass(), "count", 0);
        setField(term274431, term274431.getClass(), "value", term274432);
        setIntField(term274431, term274431.getClass(), "count", 0);
        setElement(term274430, 0, term274431);
        setField(term274437, term274437.getClass(), "toStringCache", "");
        setField(term274437, term274437.getClass(), "value", term274440);
        setByteField(term274437, term274437.getClass(), "coder", (byte) 0);
        setIntField(term274437, term274437.getClass(), "count", 0);
        setField(term274436, term274436.getClass(), "value", term274437);
        setIntField(term274436, term274436.getClass(), "count", 0);
        setElement(term274430, 1, term274436);
        setField(term274442, term274442.getClass(), "toStringCache", "");
        setField(term274442, term274442.getClass(), "value", term274445);
        setByteField(term274442, term274442.getClass(), "coder", (byte) 0);
        setIntField(term274442, term274442.getClass(), "count", 0);
        setField(term274441, term274441.getClass(), "value", term274442);
        setIntField(term274441, term274441.getClass(), "count", 0);
        setElement(term274430, 2, term274441);
        setField(term274447, term274447.getClass(), "toStringCache", "");
        setField(term274447, term274447.getClass(), "value", term274450);
        setByteField(term274447, term274447.getClass(), "coder", (byte) 0);
        setIntField(term274447, term274447.getClass(), "count", 0);
        setField(term274446, term274446.getClass(), "value", term274447);
        setIntField(term274446, term274446.getClass(), "count", 0);
        setElement(term274430, 3, term274446);
        setField(term274451, term274451.getClass(), "value", term274452);
        setIntField(term274451, term274451.getClass(), "count", 0);
        setElement(term274430, 4, term274451);
        setField(term274454, term274454.getClass(), "toStringCache", "");
        setField(term274454, term274454.getClass(), "value", term274457);
        setByteField(term274454, term274454.getClass(), "coder", (byte) 0);
        setIntField(term274454, term274454.getClass(), "count", 0);
        setField(term274453, term274453.getClass(), "value", term274454);
        setIntField(term274453, term274453.getClass(), "count", 0);
        setElement(term274430, 5, term274453);
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
        args[0] = term272429;
        args[1] = 0;
        args[2] = 0;
        args[3] = 0;
        args[4] = 0;
        args[5] = 0;
        args[6] = 0;
        args[7] = 0;
        args[8] = false;
        Object retValue = callMethod(klass, "format", argTypes, null, args);
        assertTrue(recursiveEquals(term272429, term274430));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


