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
import java.lang.StringIndexOutOfBoundsException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CharacterReader_consumeDigitSequence_24483334363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2305;

    public CharacterReader_consumeDigitSequence_24483334363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2305 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term2306 = (char[]) newCharArray(8);
        Object[] term2320 = (Object[]) newArray("java.lang.String", 3);
        setCharElement(term2306, 0, 'n');
        setCharElement(term2306, 1, 'e');
        setCharElement(term2306, 2, 'N');
        setCharElement(term2306, 3, 'R');
        setCharElement(term2306, 4, 'd');
        setCharElement(term2306, 5, 'v');
        setCharElement(term2306, 6, 'g');
        setCharElement(term2306, 7, 'J');
        setField(term2305, term2305.getClass(), "charBuf", term2306);
        setField(term2305, term2305.getClass(), "reader", null);
        setIntField(term2305, term2305.getClass(), "bufLength", -663691365);
        setIntField(term2305, term2305.getClass(), "bufSplitPoint", 339854490);
        setIntField(term2305, term2305.getClass(), "bufPos", -615654495);
        setIntField(term2305, term2305.getClass(), "readerPos", -1476117762);
        setIntField(term2305, term2305.getClass(), "bufMark", -341962980);
        setElement(term2320, 0, "PkWMRdJcBb");
        setElement(term2320, 1, "jSpAteRute");
        setElement(term2320, 2, "swZVeJAxjt");
        setField(term2305, term2305.getClass(), "stringCache", term2320);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeDigitSequence", argTypes, term2305, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


