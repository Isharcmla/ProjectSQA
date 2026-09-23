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

public class CharacterReader_rewindToMark_40992284935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205;
     Object term1511;

    public CharacterReader_rewindToMark_40992284935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term205 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term205, term205.getClass(), "input", "hRNSzYYIrc");
        setIntField(term205, term205.getClass(), "length", -6029667);
        setIntField(term205, term205.getClass(), "pos", -2068769794);
        setIntField(term205, term205.getClass(), "mark", -117576464);
        term1511 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term1511, term1511.getClass(), "input", "hRNSzYYIrc");
        setIntField(term1511, term1511.getClass(), "length", -6029667);
        setIntField(term1511, term1511.getClass(), "pos", -117576464);
        setIntField(term1511, term1511.getClass(), "mark", -117576464);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "rewindToMark", argTypes, term205, args);
        assertTrue(recursiveEquals(term205, term1511));
    }

};


