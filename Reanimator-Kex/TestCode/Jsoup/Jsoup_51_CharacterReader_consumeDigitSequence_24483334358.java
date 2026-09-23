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

public class CharacterReader_consumeDigitSequence_24483334358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2261;

    public CharacterReader_consumeDigitSequence_24483334358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2261 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term2262 = (char[]) newCharArray(8);
        Object[] term2274 = (Object[]) newArray("java.lang.String", 3);
        setCharElement(term2262, 0, 'n');
        setCharElement(term2262, 1, 'e');
        setCharElement(term2262, 2, 'N');
        setCharElement(term2262, 3, 'R');
        setCharElement(term2262, 4, 'd');
        setCharElement(term2262, 5, 'v');
        setCharElement(term2262, 6, 'g');
        setCharElement(term2262, 7, 'J');
        setField(term2261, term2261.getClass(), "input", term2262);
        setIntField(term2261, term2261.getClass(), "length", -2095575670);
        setIntField(term2261, term2261.getClass(), "pos", 1225272962);
        setIntField(term2261, term2261.getClass(), "mark", 1324040357);
        setElement(term2274, 0, "PkWMRdJcBb");
        setElement(term2274, 1, "jSpAteRute");
        setElement(term2274, 2, "swZVeJAxjt");
        setField(term2261, term2261.getClass(), "stringCache", term2274);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeDigitSequence", argTypes, term2261, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


