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

public class StrBuilder_appendPadding_798852950257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7624;
     Object term7683;
     Object term7685;
     Object term76493;

    public StrBuilder_appendPadding_798852950257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7624 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term7625 = (char[]) newCharArray(32);
        setField(term7624, term7624.getClass(), "buffer", term7625);
        setIntField(term7624, term7624.getClass(), "size", -1347665717);
        setField(term7624, term7624.getClass(), "newLine", "EeBVbzjcCI");
        setField(term7624, term7624.getClass(), "nullText", "UfQtPRyWRC");
        term7683 = new Integer(-1888585309);
        term7685 = new Character('q');
        term76493 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term76494 = (char[]) newCharArray(32);
        setField(term76493, term76493.getClass(), "buffer", term76494);
        setIntField(term76493, term76493.getClass(), "size", -1347665717);
        setField(term76493, term76493.getClass(), "newLine", "EeBVbzjcCI");
        setField(term76493, term76493.getClass(), "nullText", "UfQtPRyWRC");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = char.class;
        Object[] args = new Object[2];
        args[0] = term7683;
        args[1] = term7685;
        callMethod(klass, "appendPadding", argTypes, term7624, args);
        assertTrue(recursiveEquals(term7624, term76493));
        assertTrue(recursiveEquals(term7683, -1888585309));
        assertTrue(recursiveEquals(term7685, 'q'));
    }

};


