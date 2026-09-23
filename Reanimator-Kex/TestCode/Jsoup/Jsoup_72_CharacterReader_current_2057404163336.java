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

public class CharacterReader_current_2057404163336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96663;

    public CharacterReader_current_2057404163336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96663 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term96713 = newInstance(Class.forName("java.io.BufferedReader"));
        setIntField(term96663, term96663.getClass(), "bufPos", -2147483648);
        setIntField(term96663, term96663.getClass(), "bufSplitPoint", -2147483648);
        setIntField(term96663, term96663.getClass(), "readerPos", 0);
        setField(term96663, term96663.getClass(), "reader", term96713);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "current", argTypes, term96663, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


