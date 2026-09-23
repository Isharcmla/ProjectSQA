package org.jsoup.parser;

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
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CharacterReader_init_2130144751816 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term242524;

    public CharacterReader_init_2130144751816() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term242434 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object[] term242345 = (Object[]) newArray("java.lang.String", 0);
        Object term242478 = newInstance(Class.forName("java.io.PipedReader"));
        setIntField(term242434, term242434.getClass(), "bufMark", 0);
        setField(term242434, term242434.getClass(), "stringCache", term242345);
        setField(term242434, term242434.getClass(), "reader", term242478);
        term242524 = newInstance(Class.forName("java.io.StringReader"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.Reader");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term242524;
        args[1] = 32769;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


