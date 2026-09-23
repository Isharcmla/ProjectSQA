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

public class CharacterReader_consumeToAny_1422703610705 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3120591;
     Object term3120380;

    public CharacterReader_consumeToAny_1422703610705() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3120591 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        term3120380 = (char[]) newCharArray(0);
        setIntField(term3120591, term3120591.getClass(), "bufPos", -805306373);
        setIntField(term3120591, term3120591.getClass(), "bufSplitPoint", -805306372);
        setIntField(term3120591, term3120591.getClass(), "bufLength", -805306358);
        setField(term3120591, term3120591.getClass(), "charBuf", term3120380);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3120380;
        callMethod(klass, "consumeToAny", argTypes, term3120591, args);
    }

};


