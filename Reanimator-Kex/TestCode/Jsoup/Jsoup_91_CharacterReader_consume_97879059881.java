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

public class CharacterReader_consume_97879059881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16281;
     Object term16293;

    public CharacterReader_consume_97879059881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16281 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term16281, term16281.getClass(), "bufPos", -2147483648);
        setIntField(term16281, term16281.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term16281, term16281.getClass(), "bufLength", -2147483648);
        term16293 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term16293, term16293.getClass(), "charBuf", null);
        setField(term16293, term16293.getClass(), "reader", null);
        setIntField(term16293, term16293.getClass(), "bufLength", -2147483648);
        setIntField(term16293, term16293.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term16293, term16293.getClass(), "bufPos", -2147483647);
        setIntField(term16293, term16293.getClass(), "readerPos", 0);
        setIntField(term16293, term16293.getClass(), "bufMark", 0);
        setField(term16293, term16293.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "consume", argTypes, term16281, args);
        assertTrue(recursiveEquals(term16281, term16293));
        assertTrue(recursiveEquals(retValue, 65535));
    }

};


