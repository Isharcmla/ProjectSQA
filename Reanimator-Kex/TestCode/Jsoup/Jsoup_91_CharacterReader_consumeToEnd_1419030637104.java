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
import static org.jsoup.parser.EqualityUtils.*;

public class CharacterReader_consumeToEnd_1419030637104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19699;
     Object term19797;

    public CharacterReader_consumeToEnd_1419030637104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19699 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term19699, term19699.getClass(), "bufPos", -2147483648);
        setIntField(term19699, term19699.getClass(), "bufSplitPoint", -2147483647);
        term19797 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term19797, term19797.getClass(), "charBuf", null);
        setField(term19797, term19797.getClass(), "reader", null);
        setIntField(term19797, term19797.getClass(), "bufLength", 0);
        setIntField(term19797, term19797.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term19797, term19797.getClass(), "bufPos", 0);
        setIntField(term19797, term19797.getClass(), "readerPos", 0);
        setIntField(term19797, term19797.getClass(), "bufMark", 0);
        setField(term19797, term19797.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "consumeToEnd", argTypes, term19699, args);
        assertTrue(recursiveEquals(term19699, term19797));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


