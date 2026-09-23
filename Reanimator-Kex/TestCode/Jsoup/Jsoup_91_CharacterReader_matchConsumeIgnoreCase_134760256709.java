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

public class CharacterReader_matchConsumeIgnoreCase_134760256709 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term190237;

    public CharacterReader_matchConsumeIgnoreCase_134760256709() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term190237 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term190120 = (char[]) newCharArray(8);
        setIntField(term190237, term190237.getClass(), "bufPos", 912);
        setIntField(term190237, term190237.getClass(), "bufSplitPoint", 913);
        setIntField(term190237, term190237.getClass(), "bufLength", 913);
        setCharElement(term190120, 0, (char) 32);
        setCharElement(term190120, 1, (char) 32);
        setCharElement(term190120, 2, (char) 32);
        setCharElement(term190120, 3, (char) 32);
        setCharElement(term190120, 4, (char) 32);
        setCharElement(term190120, 5, (char) 32);
        setCharElement(term190120, 6, (char) 32);
        setCharElement(term190120, 7, (char) 32);
        setField(term190237, term190237.getClass(), "charBuf", term190120);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = " ";
        try {
            callMethod(klass, "matchConsumeIgnoreCase", argTypes, term190237, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


