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

public class CharacterReader_consumeToAny_1422703610589 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165244;
     Object term164966;

    public CharacterReader_consumeToAny_1422703610589() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term165244 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        term164966 = (char[]) newCharArray(0);
        setIntField(term165244, term165244.getClass(), "bufPos", -4);
        setIntField(term165244, term165244.getClass(), "bufSplitPoint", -3);
        setIntField(term165244, term165244.getClass(), "bufLength", 20);
        setField(term165244, term165244.getClass(), "charBuf", term164966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term164966;
        callMethod(klass, "consumeToAny", argTypes, term165244, args);
    }

};


