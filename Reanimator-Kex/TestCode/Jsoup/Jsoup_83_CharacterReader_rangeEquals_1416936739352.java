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

public class CharacterReader_rangeEquals_1416936739352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78916;
     Object term79214;

    public CharacterReader_rangeEquals_1416936739352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78916 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term78916, term78916.getClass(), "charBuf", null);
        term79214 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term79214, term79214.getClass(), "charBuf", null);
        setField(term79214, term79214.getClass(), "reader", null);
        setIntField(term79214, term79214.getClass(), "bufLength", 0);
        setIntField(term79214, term79214.getClass(), "bufSplitPoint", 0);
        setIntField(term79214, term79214.getClass(), "bufPos", 0);
        setIntField(term79214, term79214.getClass(), "readerPos", 0);
        setIntField(term79214, term79214.getClass(), "bufMark", 0);
        setField(term79214, term79214.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = 0;
        args[1] = 0;
        args[2] = "";
        callMethod(klass, "rangeEquals", argTypes, term78916, args);
        assertTrue(recursiveEquals(term78916, term79214));
    }

};


