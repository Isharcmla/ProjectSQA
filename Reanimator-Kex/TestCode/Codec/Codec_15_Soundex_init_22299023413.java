package org.apache.commons.codec.language;

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
import static org.apache.commons.codec.language.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.codec.language.EqualityUtils.*;

public class Soundex_init_22299023413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term717;
     Object term719;

    public Soundex_init_22299023413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = (char[]) newCharArray(5);
        setCharElement(term1, 0, 'P');
        setCharElement(term1, 1, 'A');
        setCharElement(term1, 2, 'E');
        setCharElement(term1, 3, 'B');
        setCharElement(term1, 4, 't');
        term717 = newInstance(Class.forName("org.apache.commons.codec.language.Soundex"));
        char[] term718 = (char[]) newCharArray(5);
        setIntField(term717, term717.getClass(), "maxLength", 4);
        setCharElement(term718, 0, 'P');
        setCharElement(term718, 1, 'A');
        setCharElement(term718, 2, 'E');
        setCharElement(term718, 3, 'B');
        setCharElement(term718, 4, 't');
        setField(term717, term717.getClass(), "soundexMapping", term718);
        term719 = (char[]) newCharArray(5);
        setCharElement(term719, 0, 'P');
        setCharElement(term719, 1, 'A');
        setCharElement(term719, 2, 'E');
        setCharElement(term719, 3, 'B');
        setCharElement(term719, 4, 't');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.Soundex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term717));
        assertTrue(recursiveEquals(term1, term719));
    }

};


