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
import java.lang.Object;

public class CharacterReader_consumeToAny_1422703610543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1147921;
     Object term1147280;

    public CharacterReader_consumeToAny_1422703610543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1147921 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term1147284 = (char[]) newCharArray(246);
        Object[] term1147777 = (Object[]) newArray("java.lang.String", 4);
        setIntField(term1147921, term1147921.getClass(), "bufPos", -239759233);
        setIntField(term1147921, term1147921.getClass(), "bufSplitPoint", -239759232);
        setIntField(term1147921, term1147921.getClass(), "bufLength", -239759232);
        setField(term1147921, term1147921.getClass(), "charBuf", term1147284);
        setElement(term1147777, 0, " ");
        setElement(term1147777, 1, " ");
        setElement(term1147777, 2, " ");
        setElement(term1147777, 3, " ");
        setField(term1147921, term1147921.getClass(), "stringCache", term1147777);
        term1147280 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1147280;
        try {
            callMethod(klass, "consumeToAny", argTypes, term1147921, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


