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

public class CharacterReader_consumeLetterThenDigitSequence_176975235456 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2009;

    public CharacterReader_consumeLetterThenDigitSequence_176975235456() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2009 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term2010 = (char[]) newCharArray(4);
        Object[] term2018 = (Object[]) newArray("java.lang.String", 8);
        setCharElement(term2010, 0, 'r');
        setCharElement(term2010, 1, 'c');
        setCharElement(term2010, 2, 'R');
        setCharElement(term2010, 3, 'M');
        setField(term2009, term2009.getClass(), "input", term2010);
        setIntField(term2009, term2009.getClass(), "length", -184153539);
        setIntField(term2009, term2009.getClass(), "pos", 493620644);
        setIntField(term2009, term2009.getClass(), "mark", 1328271830);
        setElement(term2018, 0, "OWKQODBLzb");
        setElement(term2018, 1, "wGmYcqUkgE");
        setElement(term2018, 2, "idgaQsnJpQ");
        setElement(term2018, 3, "VgZnGoIFwQ");
        setElement(term2018, 4, "jUbSRrkrYZ");
        setElement(term2018, 5, "bWWfajKbEX");
        setElement(term2018, 6, "cAPeiZHKGJ");
        setElement(term2018, 7, "LvJFtLBaxj");
        setField(term2009, term2009.getClass(), "stringCache", term2018);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeLetterThenDigitSequence", argTypes, term2009, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


