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

public class CharacterReader_consumeToAny_1422703610674 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term172905;
     Object term172787;

    public CharacterReader_consumeToAny_1422703610674() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term172905 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term172905, term172905.getClass(), "bufPos", 1887701810);
        setIntField(term172905, term172905.getClass(), "bufSplitPoint", 1887701811);
        setIntField(term172905, term172905.getClass(), "bufLength", 1887701813);
        setField(term172905, term172905.getClass(), "charBuf", null);
        setField(term172905, term172905.getClass(), "stringCache", null);
        term172787 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term172787;
        try {
            callMethod(klass, "consumeToAny", argTypes, term172905, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


