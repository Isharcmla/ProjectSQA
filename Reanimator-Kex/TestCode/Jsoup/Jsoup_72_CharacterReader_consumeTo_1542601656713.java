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

public class CharacterReader_consumeTo_1542601656713 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3123451;

    public CharacterReader_consumeTo_1542601656713() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3123451 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object[] term3123343 = (Object[]) newArray("java.lang.String", 1);
        setIntField(term3123451, term3123451.getClass(), "bufPos", 2147483637);
        setIntField(term3123451, term3123451.getClass(), "bufSplitPoint", 2147483638);
        setIntField(term3123451, term3123451.getClass(), "bufLength", -2147483648);
        setField(term3123451, term3123451.getClass(), "charBuf", null);
        setField(term3123451, term3123451.getClass(), "stringCache", term3123343);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 0;
        callMethod(klass, "consumeTo", argTypes, term3123451, args);
    }

};


