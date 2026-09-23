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
import java.lang.Character;

public class StrBuilder_replaceFirst_1815609019299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10731;
     Object term10790;
     Object term10792;
     Object term87868;
     Object term87807;

    public StrBuilder_replaceFirst_1815609019299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10731 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term10732 = (char[]) newCharArray(32);
        setField(term10731, term10731.getClass(), "buffer", term10732);
        setIntField(term10731, term10731.getClass(), "size", -227365013);
        setField(term10731, term10731.getClass(), "newLine", "ZkMALXpEAZ");
        setField(term10731, term10731.getClass(), "nullText", "tXfQjSqDzN");
        term10790 = new Character('m');
        term10792 = new Character('a');
        term87868 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term87869 = (char[]) newCharArray(32);
        setField(term87868, term87868.getClass(), "buffer", term87869);
        setIntField(term87868, term87868.getClass(), "size", -227365013);
        setField(term87868, term87868.getClass(), "newLine", "ZkMALXpEAZ");
        setField(term87868, term87868.getClass(), "nullText", "tXfQjSqDzN");
        term87807 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term87808 = (char[]) newCharArray(32);
        setField(term87807, term87807.getClass(), "buffer", term87808);
        setIntField(term87807, term87807.getClass(), "size", -227365013);
        setField(term87807, term87807.getClass(), "newLine", "ZkMALXpEAZ");
        setField(term87807, term87807.getClass(), "nullText", "tXfQjSqDzN");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = char.class;
        argTypes[1] = char.class;
        Object[] args = new Object[2];
        args[0] = term10790;
        args[1] = term10792;
        Object retValue = callMethod(klass, "replaceFirst", argTypes, term10731, args);
        assertTrue(recursiveEquals(term10731, term87868));
        assertTrue(recursiveEquals(term10790, 'm'));
        assertTrue(recursiveEquals(term10792, 'a'));
        assertTrue(recursiveEquals(retValue, term87807));
    }

};


