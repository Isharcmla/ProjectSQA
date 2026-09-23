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

public class CharacterReader_consumeToEnd_1419030637291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78555;

    public CharacterReader_consumeToEnd_1419030637291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78555 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term78555, term78555.getClass(), "bufPos", -2147483648);
        setIntField(term78555, term78555.getClass(), "bufSplitPoint", -2147483647);
        setField(term78555, term78555.getClass(), "charBuf", null);
        setField(term78555, term78555.getClass(), "stringCache", null);
        setIntField(term78555, term78555.getClass(), "bufLength", 13);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeToEnd", argTypes, term78555, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


