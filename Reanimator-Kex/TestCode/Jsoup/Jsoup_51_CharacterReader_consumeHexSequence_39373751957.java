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

public class CharacterReader_consumeHexSequence_39373751957 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2199;

    public CharacterReader_consumeHexSequence_39373751957() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2199 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term2200 = (char[]) newCharArray(6);
        Object[] term2210 = (Object[]) newArray("java.lang.String", 2);
        setCharElement(term2200, 0, 'F');
        setCharElement(term2200, 1, 'I');
        setCharElement(term2200, 2, 's');
        setCharElement(term2200, 3, 'Y');
        setCharElement(term2200, 4, 'G');
        setCharElement(term2200, 5, 'g');
        setField(term2199, term2199.getClass(), "input", term2200);
        setIntField(term2199, term2199.getClass(), "length", 1596070772);
        setIntField(term2199, term2199.getClass(), "pos", 97029295);
        setIntField(term2199, term2199.getClass(), "mark", -1371869594);
        setElement(term2210, 0, "PHvxnGHptP");
        setElement(term2210, 1, "TimdotUuNC");
        setField(term2199, term2199.getClass(), "stringCache", term2210);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeHexSequence", argTypes, term2199, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


