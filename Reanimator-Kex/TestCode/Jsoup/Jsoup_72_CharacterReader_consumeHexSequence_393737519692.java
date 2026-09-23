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
import java.lang.Object;

public class CharacterReader_consumeHexSequence_393737519692 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3114507;

    public CharacterReader_consumeHexSequence_393737519692() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3114507 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object[] term3114407 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term3114507, term3114507.getClass(), "bufPos", -2147483648);
        setIntField(term3114507, term3114507.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term3114507, term3114507.getClass(), "bufLength", -2147483648);
        setField(term3114507, term3114507.getClass(), "charBuf", null);
        setField(term3114507, term3114507.getClass(), "stringCache", term3114407);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "consumeHexSequence", argTypes, term3114507, args);
    }

};


