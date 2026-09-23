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

public class CharacterReader_unconsume_105085539332 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127;
     Object term1394;

    public CharacterReader_unconsume_105085539332() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term127, term127.getClass(), "input", "EGtDIRbSSb");
        setIntField(term127, term127.getClass(), "length", 1134449235);
        setIntField(term127, term127.getClass(), "pos", -883034806);
        setIntField(term127, term127.getClass(), "mark", 1585847225);
        term1394 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term1394, term1394.getClass(), "input", "EGtDIRbSSb");
        setIntField(term1394, term1394.getClass(), "length", 1134449235);
        setIntField(term1394, term1394.getClass(), "pos", -883034807);
        setIntField(term1394, term1394.getClass(), "mark", 1585847225);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "unconsume", argTypes, term127, args);
        assertTrue(recursiveEquals(term127, term1394));
    }

};


