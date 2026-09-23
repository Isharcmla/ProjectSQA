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

public class CharacterReader_isEmpty_803804851666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170398;

    public CharacterReader_isEmpty_803804851666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term170398 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term170440 = newInstance(Class.forName("java.io.FileReader"));
        setIntField(term170398, term170398.getClass(), "bufPos", -2147483648);
        setIntField(term170398, term170398.getClass(), "bufSplitPoint", -2147483648);
        setField(term170398, term170398.getClass(), "reader", term170440);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "isEmpty", argTypes, term170398, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


