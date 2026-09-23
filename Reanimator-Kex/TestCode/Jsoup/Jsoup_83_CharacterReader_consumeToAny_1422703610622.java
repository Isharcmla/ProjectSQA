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

public class CharacterReader_consumeToAny_1422703610622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176421;
     Object term176183;

    public CharacterReader_consumeToAny_1422703610622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176421 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        term176183 = (char[]) newCharArray(0);
        setIntField(term176421, term176421.getClass(), "bufPos", -4);
        setIntField(term176421, term176421.getClass(), "bufSplitPoint", -3);
        setIntField(term176421, term176421.getClass(), "bufLength", 15);
        setField(term176421, term176421.getClass(), "charBuf", term176183);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term176183;
        callMethod(klass, "consumeToAny", argTypes, term176421, args);
    }

};


