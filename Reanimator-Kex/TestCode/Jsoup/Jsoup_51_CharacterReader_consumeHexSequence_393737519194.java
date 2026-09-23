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

public class CharacterReader_consumeHexSequence_393737519194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57418;

    public CharacterReader_consumeHexSequence_393737519194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57418 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term57318 = (char[]) newCharArray(8);
        setIntField(term57418, term57418.getClass(), "pos", 6);
        setIntField(term57418, term57418.getClass(), "length", 7);
        setCharElement(term57318, 0, (char) 48);
        setCharElement(term57318, 1, (char) 48);
        setCharElement(term57318, 2, (char) 48);
        setCharElement(term57318, 3, (char) 48);
        setCharElement(term57318, 4, (char) 48);
        setCharElement(term57318, 5, (char) 48);
        setCharElement(term57318, 6, (char) 48);
        setCharElement(term57318, 7, (char) 48);
        setField(term57418, term57418.getClass(), "input", term57318);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeHexSequence", argTypes, term57418, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


