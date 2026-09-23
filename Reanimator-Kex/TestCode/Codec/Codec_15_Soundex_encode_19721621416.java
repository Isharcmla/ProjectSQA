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
import org.apache.commons.codec.EncoderException;
import static org.apache.commons.codec.language.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Soundex_encode_19721621416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133;
     Object term162;

    public Soundex_encode_19721621416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133 = newInstance(Class.forName("org.apache.commons.codec.language.Soundex"));
        char[] term135 = (char[]) newCharArray(26);
        setIntField(term133, term133.getClass(), "maxLength", 4);
        setCharElement(term135, 0, (char) 48);
        setCharElement(term135, 1, (char) 49);
        setCharElement(term135, 2, (char) 50);
        setCharElement(term135, 3, (char) 51);
        setCharElement(term135, 4, (char) 48);
        setCharElement(term135, 5, (char) 49);
        setCharElement(term135, 6, (char) 50);
        setCharElement(term135, 7, (char) 48);
        setCharElement(term135, 8, (char) 48);
        setCharElement(term135, 9, (char) 50);
        setCharElement(term135, 10, (char) 50);
        setCharElement(term135, 11, (char) 52);
        setCharElement(term135, 12, (char) 53);
        setCharElement(term135, 13, (char) 53);
        setCharElement(term135, 14, (char) 48);
        setCharElement(term135, 15, (char) 49);
        setCharElement(term135, 16, (char) 50);
        setCharElement(term135, 17, (char) 54);
        setCharElement(term135, 18, (char) 50);
        setCharElement(term135, 19, (char) 51);
        setCharElement(term135, 20, (char) 48);
        setCharElement(term135, 21, (char) 49);
        setCharElement(term135, 22, (char) 48);
        setCharElement(term135, 23, (char) 50);
        setCharElement(term135, 24, (char) 48);
        setCharElement(term135, 25, (char) 50);
        setField(term133, term133.getClass(), "soundexMapping", term135);
        term162 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.Soundex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term162;
        try {
            callMethod(klass, "encode", argTypes, term133, args);
            assertTrue(false);
        }
        catch (EncoderException e) {
        }

    }

};


