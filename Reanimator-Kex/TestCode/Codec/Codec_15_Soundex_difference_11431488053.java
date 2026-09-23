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

public class Soundex_difference_11431488053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34;

    public Soundex_difference_11431488053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34 = newInstance(Class.forName("org.apache.commons.codec.language.Soundex"));
        char[] term36 = (char[]) newCharArray(26);
        setIntField(term34, term34.getClass(), "maxLength", 4);
        setCharElement(term36, 0, (char) 48);
        setCharElement(term36, 1, (char) 49);
        setCharElement(term36, 2, (char) 50);
        setCharElement(term36, 3, (char) 51);
        setCharElement(term36, 4, (char) 48);
        setCharElement(term36, 5, (char) 49);
        setCharElement(term36, 6, (char) 50);
        setCharElement(term36, 7, (char) 48);
        setCharElement(term36, 8, (char) 48);
        setCharElement(term36, 9, (char) 50);
        setCharElement(term36, 10, (char) 50);
        setCharElement(term36, 11, (char) 52);
        setCharElement(term36, 12, (char) 53);
        setCharElement(term36, 13, (char) 53);
        setCharElement(term36, 14, (char) 48);
        setCharElement(term36, 15, (char) 49);
        setCharElement(term36, 16, (char) 50);
        setCharElement(term36, 17, (char) 54);
        setCharElement(term36, 18, (char) 50);
        setCharElement(term36, 19, (char) 51);
        setCharElement(term36, 20, (char) 48);
        setCharElement(term36, 21, (char) 49);
        setCharElement(term36, 22, (char) 48);
        setCharElement(term36, 23, (char) 50);
        setCharElement(term36, 24, (char) 48);
        setCharElement(term36, 25, (char) 50);
        setField(term34, term34.getClass(), "soundexMapping", term36);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.codec.language.Soundex");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "sjlJAEtRrb";
        args[1] = "MuLcgQHgqz";
        callMethod(klass, "difference", argTypes, term34, args);
    }

};


