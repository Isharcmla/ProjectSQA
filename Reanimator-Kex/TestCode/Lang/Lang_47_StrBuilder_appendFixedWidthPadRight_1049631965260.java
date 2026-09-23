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

public class StrBuilder_appendFixedWidthPadRight_1049631965260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7972;
     Object term8031;
     Object term8032;
     Object term8034;
     Object term77373;
     Object term77379;

    public StrBuilder_appendFixedWidthPadRight_1049631965260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7972 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term7973 = (char[]) newCharArray(32);
        setField(term7972, term7972.getClass(), "buffer", term7973);
        setIntField(term7972, term7972.getClass(), "size", 339854490);
        setField(term7972, term7972.getClass(), "newLine", "ZfdXfCCFDf");
        setField(term7972, term7972.getClass(), "nullText", "MwwjNtdOFT");
        term8031 = newInstance(Class.forName("java.lang.Object"));
        term8032 = new Integer(-615654495);
        term8034 = new Character('x');
        term77373 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term77374 = (char[]) newCharArray(32);
        setField(term77373, term77373.getClass(), "buffer", term77374);
        setIntField(term77373, term77373.getClass(), "size", 339854490);
        setField(term77373, term77373.getClass(), "newLine", "ZfdXfCCFDf");
        setField(term77373, term77373.getClass(), "nullText", "MwwjNtdOFT");
        term77379 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = int.class;
        argTypes[2] = char.class;
        Object[] args = new Object[3];
        args[0] = term8031;
        args[1] = term8032;
        args[2] = term8034;
        callMethod(klass, "appendFixedWidthPadRight", argTypes, term7972, args);
        assertTrue(recursiveEquals(term7972, term77373));
        assertTrue(recursiveEquals(term8031, term77379));
        assertTrue(recursiveEquals(term8032, -615654495));
        assertTrue(recursiveEquals(term8034, 'x'));
    }

};


