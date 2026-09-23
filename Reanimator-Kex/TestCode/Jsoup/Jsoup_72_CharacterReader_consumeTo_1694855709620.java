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

public class CharacterReader_consumeTo_1694855709620 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1403443;

    public CharacterReader_consumeTo_1694855709620() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1403443 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term1403290 = (char[]) newCharArray(42);
        Object[] term1403333 = (Object[]) newArray("java.lang.String", 496);
        setIntField(term1403443, term1403443.getClass(), "bufPos", 1478230036);
        setIntField(term1403443, term1403443.getClass(), "bufSplitPoint", 1478230037);
        setIntField(term1403443, term1403443.getClass(), "bufLength", -1875378027);
        setField(term1403443, term1403443.getClass(), "charBuf", term1403290);
        setField(term1403443, term1403443.getClass(), "stringCache", term1403333);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                  ";
        try {
            callMethod(klass, "consumeTo", argTypes, term1403443, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


