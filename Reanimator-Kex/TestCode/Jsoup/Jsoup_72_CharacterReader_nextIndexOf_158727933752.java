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

public class CharacterReader_nextIndexOf_158727933752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1001;

    public CharacterReader_nextIndexOf_158727933752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1001 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term1002 = (char[]) newCharArray(2);
        Object[] term1010 = (Object[]) newArray("java.lang.String", 1);
        setCharElement(term1002, 0, 'J');
        setCharElement(term1002, 1, 'C');
        setField(term1001, term1001.getClass(), "charBuf", term1002);
        setField(term1001, term1001.getClass(), "reader", null);
        setIntField(term1001, term1001.getClass(), "bufLength", 454281060);
        setIntField(term1001, term1001.getClass(), "bufSplitPoint", -1786399638);
        setIntField(term1001, term1001.getClass(), "bufPos", 2055867847);
        setIntField(term1001, term1001.getClass(), "readerPos", -1048298087);
        setIntField(term1001, term1001.getClass(), "bufMark", 292681826);
        setElement(term1010, 0, "nyiiPDVjAc");
        setField(term1001, term1001.getClass(), "stringCache", term1010);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.CharSequence");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "nextIndexOf", argTypes, term1001, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


