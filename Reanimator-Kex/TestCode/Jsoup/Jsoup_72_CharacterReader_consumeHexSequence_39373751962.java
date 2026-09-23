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

public class CharacterReader_consumeHexSequence_39373751962 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2241;

    public CharacterReader_consumeHexSequence_39373751962() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2241 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term2242 = (char[]) newCharArray(6);
        Object[] term2254 = (Object[]) newArray("java.lang.String", 2);
        setCharElement(term2242, 0, 'F');
        setCharElement(term2242, 1, 'I');
        setCharElement(term2242, 2, 's');
        setCharElement(term2242, 3, 'Y');
        setCharElement(term2242, 4, 'G');
        setCharElement(term2242, 5, 'g');
        setField(term2241, term2241.getClass(), "charBuf", term2242);
        setField(term2241, term2241.getClass(), "reader", null);
        setIntField(term2241, term2241.getClass(), "bufLength", -1888585309);
        setIntField(term2241, term2241.getClass(), "bufSplitPoint", 683666002);
        setIntField(term2241, term2241.getClass(), "bufPos", 1596213415);
        setIntField(term2241, term2241.getClass(), "readerPos", -268815336);
        setIntField(term2241, term2241.getClass(), "bufMark", -1210583429);
        setElement(term2254, 0, "PHvxnGHptP");
        setElement(term2254, 1, "TimdotUuNC");
        setField(term2241, term2241.getClass(), "stringCache", term2254);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeHexSequence", argTypes, term2241, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


