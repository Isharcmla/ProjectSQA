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

public class CharacterReader_consumeToAny_1422703610796 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term226471;
     Object term226343;

    public CharacterReader_consumeToAny_1422703610796() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term226471 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term226471, term226471.getClass(), "bufPos", 686766080);
        setIntField(term226471, term226471.getClass(), "bufSplitPoint", 686766081);
        setIntField(term226471, term226471.getClass(), "bufLength", 686766085);
        setField(term226471, term226471.getClass(), "charBuf", null);
        setField(term226471, term226471.getClass(), "stringCache", null);
        term226343 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term226343;
        try {
            callMethod(klass, "consumeToAny", argTypes, term226471, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


