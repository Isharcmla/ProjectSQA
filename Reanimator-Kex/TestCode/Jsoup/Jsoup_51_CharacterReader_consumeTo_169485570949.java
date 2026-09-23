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

public class CharacterReader_consumeTo_169485570949 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1103;

    public CharacterReader_consumeTo_169485570949() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1103 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term1104 = (char[]) newCharArray(5);
        Object[] term1113 = (Object[]) newArray("java.lang.String", 6);
        setCharElement(term1104, 0, 'D');
        setCharElement(term1104, 1, 'I');
        setCharElement(term1104, 2, 'R');
        setCharElement(term1104, 3, 'b');
        setCharElement(term1104, 4, 'S');
        setField(term1103, term1103.getClass(), "input", term1104);
        setIntField(term1103, term1103.getClass(), "length", -1530420153);
        setIntField(term1103, term1103.getClass(), "pos", -469968304);
        setIntField(term1103, term1103.getClass(), "mark", -1145578966);
        setElement(term1113, 0, "gGSMzuGICf");
        setElement(term1113, 1, "hxCBltsObl");
        setElement(term1113, 2, "BndsHwAFMv");
        setElement(term1113, 3, "GzFkzHGYFt");
        setElement(term1113, 4, "tShwQLRGNe");
        setElement(term1113, 5, "LvtrsXUliU");
        setField(term1103, term1103.getClass(), "stringCache", term1113);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xLbjWUgOIL";
        try {
            callMethod(klass, "consumeTo", argTypes, term1103, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


