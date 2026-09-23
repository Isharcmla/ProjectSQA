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
import org.jsoup.UncheckedIOException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CharacterReader_unconsume_105085539349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term693;

    public CharacterReader_unconsume_105085539349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term693 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term694 = (char[]) newCharArray(5);
        Object[] term705 = (Object[]) newArray("java.lang.String", 2);
        setCharElement(term694, 0, 'g');
        setCharElement(term694, 1, 'Q');
        setCharElement(term694, 2, 'H');
        setCharElement(term694, 3, 'g');
        setCharElement(term694, 4, 'q');
        setField(term693, term693.getClass(), "charBuf", term694);
        setField(term693, term693.getClass(), "reader", null);
        setIntField(term693, term693.getClass(), "bufLength", -1179120542);
        setIntField(term693, term693.getClass(), "bufSplitPoint", -73683645);
        setIntField(term693, term693.getClass(), "bufPos", -226514366);
        setIntField(term693, term693.getClass(), "readerPos", 1193880199);
        setIntField(term693, term693.getClass(), "bufMark", -1087774327);
        setElement(term705, 0, "OclPbYPkcH");
        setElement(term705, 1, "IoAlmYsBwc");
        setField(term693, term693.getClass(), "stringCache", term705);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "unconsume", argTypes, term693, args);
            assertTrue(false);
        }
        catch (UncheckedIOException e) {
        }

    }

};


