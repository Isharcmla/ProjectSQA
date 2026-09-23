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
import java.lang.IllegalArgumentException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CharacterReader_matchConsume_2104464962458 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1112114;

    public CharacterReader_matchConsume_2104464962458() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1112114 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term1112156 = newInstance(Class.forName("java.io.FileReader"));
        setIntField(term1112114, term1112114.getClass(), "bufPos", -2147483648);
        setIntField(term1112114, term1112114.getClass(), "bufSplitPoint", -2147483648);
        setIntField(term1112114, term1112114.getClass(), "readerPos", 0);
        setField(term1112114, term1112114.getClass(), "reader", term1112156);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "matchConsume", argTypes, term1112114, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


