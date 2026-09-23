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

public class CharacterReader_toString_109161529169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4039;

    public CharacterReader_toString_109161529169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4039 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term4040 = (char[]) newCharArray(5);
        Object[] term4049 = (Object[]) newArray("java.lang.String", 1);
        setCharElement(term4040, 0, 'i');
        setCharElement(term4040, 1, 'a');
        setCharElement(term4040, 2, 'G');
        setCharElement(term4040, 3, 'I');
        setCharElement(term4040, 4, 'b');
        setField(term4039, term4039.getClass(), "input", term4040);
        setIntField(term4039, term4039.getClass(), "length", -1034506028);
        setIntField(term4039, term4039.getClass(), "pos", -1263114719);
        setIntField(term4039, term4039.getClass(), "mark", -894662986);
        setElement(term4049, 0, "VeDtgDzGAN");
        setField(term4039, term4039.getClass(), "stringCache", term4049);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toString", argTypes, term4039, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


