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

public class CharacterReader_consumeTagName_153618181653 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1645;

    public CharacterReader_consumeTagName_153618181653() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1645 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term1646 = (char[]) newCharArray(3);
        Object[] term1653 = (Object[]) newArray("java.lang.String", 5);
        setCharElement(term1646, 0, 'h');
        setCharElement(term1646, 1, 'R');
        setCharElement(term1646, 2, 'N');
        setField(term1645, term1645.getClass(), "input", term1646);
        setIntField(term1645, term1645.getClass(), "length", 579005622);
        setIntField(term1645, term1645.getClass(), "pos", -14890619);
        setIntField(term1645, term1645.getClass(), "mark", 1632125673);
        setElement(term1653, 0, "eqJfYWRaEL");
        setElement(term1653, 1, "fhkbdRViHi");
        setElement(term1653, 2, "uWHnvSvaPl");
        setElement(term1653, 3, "kBdSllIBVz");
        setElement(term1653, 4, "TJmVBGfTML");
        setField(term1645, term1645.getClass(), "stringCache", term1653);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeTagName", argTypes, term1645, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


