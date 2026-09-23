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

public class CharacterReader_consumeHexSequence_393737519197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57968;
     Object term58367;

    public CharacterReader_consumeHexSequence_393737519197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57968 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term57785 = (char[]) newCharArray(41);
        Object[] term57869 = (Object[]) newArray("java.lang.String", 20);
        setIntField(term57968, term57968.getClass(), "pos", 0);
        setIntField(term57968, term57968.getClass(), "length", 1);
        setField(term57968, term57968.getClass(), "input", term57785);
        setField(term57968, term57968.getClass(), "stringCache", term57869);
        term58367 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term58368 = (char[]) newCharArray(41);
        Object[] term58369 = (Object[]) newArray("java.lang.String", 20);
        setField(term58367, term58367.getClass(), "input", term58368);
        setIntField(term58367, term58367.getClass(), "length", 1);
        setIntField(term58367, term58367.getClass(), "pos", 0);
        setIntField(term58367, term58367.getClass(), "mark", 0);
        setElement(term58369, 0, "");
        setField(term58367, term58367.getClass(), "stringCache", term58369);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "consumeHexSequence", argTypes, term57968, args);
        assertTrue(recursiveEquals(term57968, term58367));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


