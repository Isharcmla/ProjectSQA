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

public class CharacterReader_consumeHexSequence_393737519565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5180683;

    public CharacterReader_consumeHexSequence_393737519565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5180683 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term5180294 = (char[]) newCharArray(8);
        setIntField(term5180683, term5180683.getClass(), "pos", -2147467268);
        setIntField(term5180683, term5180683.getClass(), "length", 32765);
        setCharElement(term5180294, 0, 'b');
        setCharElement(term5180294, 1, 'b');
        setCharElement(term5180294, 2, 'b');
        setCharElement(term5180294, 3, 'b');
        setCharElement(term5180294, 4, 'b');
        setCharElement(term5180294, 5, 'b');
        setCharElement(term5180294, 6, 'b');
        setCharElement(term5180294, 7, 'b');
        setCharElement(term5180294, -2147467268, 'b');
        setCharElement(term5180294, -2147467267, (char) 48);
        setCharElement(term5180294, -2147467266, (char) 48);
        setCharElement(term5180294, -2147467265, (char) 48);
        setCharElement(term5180294, -2147467264, 'b');
        setCharElement(term5180294, -2147467263, 'b');
        setCharElement(term5180294, -2147467262, 'b');
        setCharElement(term5180294, -2147467261, 'b');
        setCharElement(term5180294, -2147467260, 'b');
        setCharElement(term5180294, -2147467259, 'b');
        setCharElement(term5180294, -2147467258, 'b');
        setCharElement(term5180294, -2147467257, 'b');
        setField(term5180683, term5180683.getClass(), "input", term5180294);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "consumeHexSequence", argTypes, term5180683, args);
    }

};


