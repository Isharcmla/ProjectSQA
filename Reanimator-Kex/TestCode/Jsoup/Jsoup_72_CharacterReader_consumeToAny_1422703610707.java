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

public class CharacterReader_consumeToAny_1422703610707 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3121058;
     Object term3120953;

    public CharacterReader_consumeToAny_1422703610707() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3121058 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term3120958 = (char[]) newCharArray(1);
        setIntField(term3121058, term3121058.getClass(), "bufPos", 1023);
        setIntField(term3121058, term3121058.getClass(), "bufSplitPoint", 1024);
        setIntField(term3121058, term3121058.getClass(), "bufLength", 1024);
        setField(term3121058, term3121058.getClass(), "charBuf", term3120958);
        term3120953 = (char[]) newCharArray(1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3120953;
        callMethod(klass, "consumeToAny", argTypes, term3121058, args);
    }

};


