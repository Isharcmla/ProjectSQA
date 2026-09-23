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

public class CharacterReader_rangeEquals_1416936739323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90037;
     Object term90365;

    public CharacterReader_rangeEquals_1416936739323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90037 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term90037, term90037.getClass(), "charBuf", null);
        term90365 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term90365, term90365.getClass(), "charBuf", null);
        setField(term90365, term90365.getClass(), "reader", null);
        setIntField(term90365, term90365.getClass(), "bufLength", 0);
        setIntField(term90365, term90365.getClass(), "bufSplitPoint", 0);
        setIntField(term90365, term90365.getClass(), "bufPos", 0);
        setIntField(term90365, term90365.getClass(), "readerPos", 0);
        setIntField(term90365, term90365.getClass(), "bufMark", 0);
        setField(term90365, term90365.getClass(), "stringCache", null);
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
        callMethod(klass, "rangeEquals", argTypes, term90037, args);
        assertTrue(recursiveEquals(term90037, term90365));
    }

};


