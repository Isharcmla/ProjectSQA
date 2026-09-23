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
import java.lang.Object;

public class CharacterReader_consumeDigitSequence_24483334365 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2255;

    public CharacterReader_consumeDigitSequence_24483334365() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2255 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term2256 = (char[]) newCharArray(6);
        Object[] term2268 = (Object[]) newArray("java.lang.String", 8);
        setCharElement(term2256, 0, 'P');
        setCharElement(term2256, 1, 'i');
        setCharElement(term2256, 2, 'g');
        setCharElement(term2256, 3, 'E');
        setCharElement(term2256, 4, 'T');
        setCharElement(term2256, 5, 'm');
        setField(term2255, term2255.getClass(), "charBuf", term2256);
        setField(term2255, term2255.getClass(), "reader", null);
        setIntField(term2255, term2255.getClass(), "bufLength", 1532716628);
        setIntField(term2255, term2255.getClass(), "bufSplitPoint", -1801760683);
        setIntField(term2255, term2255.getClass(), "bufPos", 1141317871);
        setIntField(term2255, term2255.getClass(), "readerPos", 890669485);
        setIntField(term2255, term2255.getClass(), "bufMark", 691577392);
        setElement(term2268, 0, "cAPeiZHKGJ");
        setElement(term2268, 1, "LvJFtLBaxj");
        setElement(term2268, 2, "PHvxnGHptP");
        setElement(term2268, 3, "TimdotUuNC");
        setElement(term2268, 4, "PkWMRdJcBb");
        setElement(term2268, 5, "jSpAteRute");
        setElement(term2268, 6, "swZVeJAxjt");
        setElement(term2268, 7, "xOcJIiQQDu");
        setField(term2255, term2255.getClass(), "stringCache", term2268);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeDigitSequence", argTypes, term2255, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


