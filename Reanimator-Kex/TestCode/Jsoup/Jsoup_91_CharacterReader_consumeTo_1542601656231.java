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
import org.jsoup.UncheckedIOException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CharacterReader_consumeTo_1542601656231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48725;

    public CharacterReader_consumeTo_1542601656231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48725 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term48763 = newInstance(Class.forName("java.io.Reader$1"));
        setIntField(term48725, term48725.getClass(), "bufPos", -2147483648);
        setIntField(term48725, term48725.getClass(), "bufSplitPoint", -2147483648);
        setField(term48725, term48725.getClass(), "reader", term48763);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 0;
        try {
            callMethod(klass, "consumeTo", argTypes, term48725, args);
            assertTrue(false);
        }
        catch (UncheckedIOException e) {
        }

    }

};


