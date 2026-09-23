package org.apache.commons.lang.text;

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
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.text.EqualityUtils.*;
import java.lang.Integer;
import java.lang.Character;

public class StrBuilder_appendFixedWidthPadLeft_900329775259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7855;
     Object term7914;
     Object term7916;
     Object term7918;
     Object term77148;
     Object term77073;

    public StrBuilder_appendFixedWidthPadLeft_900329775259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7855 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term7856 = (char[]) newCharArray(32);
        setField(term7855, term7855.getClass(), "buffer", term7856);
        setIntField(term7855, term7855.getClass(), "size", -268815336);
        setField(term7855, term7855.getClass(), "newLine", "HzqpegHiRq");
        setField(term7855, term7855.getClass(), "nullText", "jwsfVjMoJT");
        term7914 = new Integer(-1210583429);
        term7916 = new Integer(-663691365);
        term7918 = new Character('x');
        term77148 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term77149 = (char[]) newCharArray(32);
        setField(term77148, term77148.getClass(), "buffer", term77149);
        setIntField(term77148, term77148.getClass(), "size", -268815336);
        setField(term77148, term77148.getClass(), "newLine", "HzqpegHiRq");
        setField(term77148, term77148.getClass(), "nullText", "jwsfVjMoJT");
        term77073 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term77074 = (char[]) newCharArray(32);
        setField(term77073, term77073.getClass(), "buffer", term77074);
        setIntField(term77073, term77073.getClass(), "size", -268815336);
        setField(term77073, term77073.getClass(), "newLine", "HzqpegHiRq");
        setField(term77073, term77073.getClass(), "nullText", "jwsfVjMoJT");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = char.class;
        Object[] args = new Object[3];
        args[0] = term7914;
        args[1] = term7916;
        args[2] = term7918;
        Object retValue = callMethod(klass, "appendFixedWidthPadLeft", argTypes, term7855, args);
        assertTrue(recursiveEquals(term7855, term77148));
        assertTrue(recursiveEquals(term7914, -663691365));
        assertTrue(recursiveEquals(term7916, 'x'));
        assertTrue(recursiveEquals(term7918, -1210583429));
        assertTrue(recursiveEquals(retValue, term77073));
    }

};


