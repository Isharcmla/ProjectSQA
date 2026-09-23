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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CharacterReader_consumeToAny_1422703610276 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64099;
     Object term63005;

    public CharacterReader_consumeToAny_1422703610276() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64099 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term63009 = (char[]) newCharArray(490);
        setIntField(term64099, term64099.getClass(), "bufPos", 805602303);
        setIntField(term64099, term64099.getClass(), "bufSplitPoint", 805602304);
        setIntField(term64099, term64099.getClass(), "bufLength", 805602304);
        setField(term64099, term64099.getClass(), "charBuf", term63009);
        setField(term64099, term64099.getClass(), "stringCache", null);
        term63005 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term63005;
        try {
            callMethod(klass, "consumeToAny", argTypes, term64099, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


