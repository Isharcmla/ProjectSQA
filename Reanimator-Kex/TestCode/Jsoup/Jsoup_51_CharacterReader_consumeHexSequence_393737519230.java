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

public class CharacterReader_consumeHexSequence_393737519230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79835;

    public CharacterReader_consumeHexSequence_393737519230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term79835 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object[] term79736 = (Object[]) newArray("java.lang.String", 489);
        setIntField(term79835, term79835.getClass(), "pos", -2147483648);
        setIntField(term79835, term79835.getClass(), "length", -2147483648);
        setField(term79835, term79835.getClass(), "input", null);
        setField(term79835, term79835.getClass(), "stringCache", term79736);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeHexSequence", argTypes, term79835, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


