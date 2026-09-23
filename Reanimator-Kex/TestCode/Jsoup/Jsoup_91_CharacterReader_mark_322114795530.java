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
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CharacterReader_mark_322114795530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133816;

    public CharacterReader_mark_322114795530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term133816 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term133870 = newInstance(Class.forName("java.io.LineNumberReader"));
        setIntField(term133816, term133816.getClass(), "bufSplitPoint", 0);
        setIntField(term133816, term133816.getClass(), "bufPos", 0);
        setField(term133816, term133816.getClass(), "reader", term133870);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "mark", argTypes, term133816, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


