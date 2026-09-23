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

public class CharacterReader_unconsume_1050855393101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19239;
     Object term19616;

    public CharacterReader_unconsume_1050855393101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19239 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term19239, term19239.getClass(), "bufPos", 1);
        term19616 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term19616, term19616.getClass(), "charBuf", null);
        setField(term19616, term19616.getClass(), "reader", null);
        setIntField(term19616, term19616.getClass(), "bufLength", 0);
        setIntField(term19616, term19616.getClass(), "bufSplitPoint", 0);
        setIntField(term19616, term19616.getClass(), "bufPos", 0);
        setIntField(term19616, term19616.getClass(), "readerPos", 0);
        setIntField(term19616, term19616.getClass(), "bufMark", 0);
        setField(term19616, term19616.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "unconsume", argTypes, term19239, args);
        assertTrue(recursiveEquals(term19239, term19616));
    }

};


