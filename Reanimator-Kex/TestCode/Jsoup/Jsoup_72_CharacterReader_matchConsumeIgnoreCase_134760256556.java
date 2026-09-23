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

public class CharacterReader_matchConsumeIgnoreCase_134760256556 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1151538;

    public CharacterReader_matchConsumeIgnoreCase_134760256556() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1151538 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term1151588 = newInstance(Class.forName("java.io.BufferedReader"));
        setIntField(term1151538, term1151538.getClass(), "bufPos", -2147483648);
        setIntField(term1151538, term1151538.getClass(), "bufSplitPoint", -2147483648);
        setIntField(term1151538, term1151538.getClass(), "readerPos", 0);
        setField(term1151538, term1151538.getClass(), "reader", term1151588);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "matchConsumeIgnoreCase", argTypes, term1151538, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


