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

public class CharacterReader_consumeToAny_1422703610708 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3122256;
     Object term3121062;

    public CharacterReader_consumeToAny_1422703610708() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3122256 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term3121066 = (char[]) newCharArray(508);
        setIntField(term3122256, term3122256.getClass(), "bufPos", 504);
        setIntField(term3122256, term3122256.getClass(), "bufSplitPoint", 505);
        setIntField(term3122256, term3122256.getClass(), "bufLength", 509);
        setField(term3122256, term3122256.getClass(), "charBuf", term3121066);
        setField(term3122256, term3122256.getClass(), "stringCache", null);
        term3121062 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3121062;
        callMethod(klass, "consumeToAny", argTypes, term3122256, args);
    }

};


