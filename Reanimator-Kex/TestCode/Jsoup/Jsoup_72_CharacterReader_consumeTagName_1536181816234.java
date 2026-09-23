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

public class CharacterReader_consumeTagName_1536181816234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50700;
     Object term50805;

    public CharacterReader_consumeTagName_1536181816234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50700 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term50700, term50700.getClass(), "bufPos", -2147483648);
        setIntField(term50700, term50700.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term50700, term50700.getClass(), "bufLength", -2147483648);
        setField(term50700, term50700.getClass(), "charBuf", null);
        term50805 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term50805, term50805.getClass(), "charBuf", null);
        setField(term50805, term50805.getClass(), "reader", null);
        setIntField(term50805, term50805.getClass(), "bufLength", -2147483648);
        setIntField(term50805, term50805.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term50805, term50805.getClass(), "bufPos", -2147483648);
        setIntField(term50805, term50805.getClass(), "readerPos", 0);
        setIntField(term50805, term50805.getClass(), "bufMark", 0);
        setField(term50805, term50805.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "consumeTagName", argTypes, term50700, args);
        assertTrue(recursiveEquals(term50700, term50805));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


