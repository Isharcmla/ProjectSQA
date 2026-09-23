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

public class CharacterReader_consumeToAny_1422703610446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109166;
     Object term108041;

    public CharacterReader_consumeToAny_1422703610446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109166 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term108045 = (char[]) newCharArray(502);
        setIntField(term109166, term109166.getClass(), "bufPos", 116);
        setIntField(term109166, term109166.getClass(), "bufSplitPoint", 117);
        setIntField(term109166, term109166.getClass(), "bufLength", 119);
        setField(term109166, term109166.getClass(), "charBuf", term108045);
        setField(term109166, term109166.getClass(), "stringCache", null);
        term108041 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term108041;
        try {
            callMethod(klass, "consumeToAny", argTypes, term109166, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


