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

public class CharacterReader_toString_109161529159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term543;

    public CharacterReader_toString_109161529159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term543 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term544 = (char[]) newCharArray(6);
        setCharElement(term544, 0, 's');
        setCharElement(term544, 1, 'z');
        setCharElement(term544, 2, 'Y');
        setCharElement(term544, 3, 'V');
        setCharElement(term544, 4, 'z');
        setCharElement(term544, 5, 'R');
        setField(term543, term543.getClass(), "input", term544);
        setIntField(term543, term543.getClass(), "length", -1465035361);
        setIntField(term543, term543.getClass(), "pos", 1090617576);
        setIntField(term543, term543.getClass(), "mark", -1547384488);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toString", argTypes, term543, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


