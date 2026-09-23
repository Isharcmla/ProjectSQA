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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CharacterReader_consumeToAny_1422703610225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46068;
     Object term44964;

    public CharacterReader_consumeToAny_1422703610225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46068 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term44968 = (char[]) newCharArray(498);
        setIntField(term46068, term46068.getClass(), "bufPos", 553264608);
        setIntField(term46068, term46068.getClass(), "bufSplitPoint", 553264609);
        setIntField(term46068, term46068.getClass(), "bufLength", 553264609);
        setField(term46068, term46068.getClass(), "charBuf", term44968);
        setField(term46068, term46068.getClass(), "stringCache", null);
        term44964 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term44964;
        try {
            callMethod(klass, "consumeToAny", argTypes, term46068, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


