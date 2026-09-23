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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.parser.EqualityUtils.*;
import java.lang.Object;

public class CharacterReader_cacheString_1100983166226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75680;
     Object term78004;

    public CharacterReader_cacheString_1100983166226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75680 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term75094 = (char[]) newCharArray(489);
        Object[] term75584 = (Object[]) newArray("java.lang.String", 492);
        setField(term75680, term75680.getClass(), "input", term75094);
        setField(term75680, term75680.getClass(), "stringCache", term75584);
        term78004 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term78005 = (char[]) newCharArray(489);
        Object[] term78006 = (Object[]) newArray("java.lang.String", 492);
        setField(term78004, term78004.getClass(), "input", term78005);
        setIntField(term78004, term78004.getClass(), "length", 0);
        setIntField(term78004, term78004.getClass(), "pos", 0);
        setIntField(term78004, term78004.getClass(), "mark", 0);
        setElement(term78006, 0, " ");
        setField(term78004, term78004.getClass(), "stringCache", term78006);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = 0;
        args[1] = 1;
        Object retValue = callMethod(klass, "cacheString", argTypes, term75680, args);
        assertTrue(recursiveEquals(term75680, term78004));
        assertTrue(recursiveEquals(retValue, " "));
    }

};


