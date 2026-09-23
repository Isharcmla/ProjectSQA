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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CharacterReader_init_2130144751704 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3120378;

    public CharacterReader_init_2130144751704() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term3120276 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object[] term3120164 = (Object[]) newArray("java.lang.String", 0);
        Object term3120326 = newInstance(Class.forName("java.io.PushbackReader"));
        char[] term3120176 = (char[]) newCharArray(0);
        setField(term3120276, term3120276.getClass(), "stringCache", term3120164);
        setField(term3120276, term3120276.getClass(), "reader", term3120326);
        setField(term3120276, term3120276.getClass(), "charBuf", term3120176);
        setIntField(term3120276, term3120276.getClass(), "bufPos", -2147483648);
        setIntField(term3120276, term3120276.getClass(), "bufSplitPoint", -2147483647);
        term3120378 = newInstance(Class.forName("java.io.CharArrayReader"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.Reader");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term3120378;
        args[1] = 9;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


