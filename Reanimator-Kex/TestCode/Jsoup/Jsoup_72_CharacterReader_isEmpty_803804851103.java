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

public class CharacterReader_isEmpty_803804851103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20957;
     Object term21223;

    public CharacterReader_isEmpty_803804851103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20957 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term20957, term20957.getClass(), "bufPos", -2147483648);
        setIntField(term20957, term20957.getClass(), "bufLength", -2147483648);
        term21223 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term21223, term21223.getClass(), "charBuf", null);
        setField(term21223, term21223.getClass(), "reader", null);
        setIntField(term21223, term21223.getClass(), "bufLength", -2147483648);
        setIntField(term21223, term21223.getClass(), "bufSplitPoint", 0);
        setIntField(term21223, term21223.getClass(), "bufPos", -2147483648);
        setIntField(term21223, term21223.getClass(), "readerPos", 0);
        setIntField(term21223, term21223.getClass(), "bufMark", 0);
        setField(term21223, term21223.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isEmpty", argTypes, term20957, args);
        assertTrue(recursiveEquals(term20957, term21223));
        assertTrue(recursiveEquals(retValue, true));
    }

};


