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
import java.lang.Character;

public class CharacterReader_matches_201433289559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2349;
     Object term2457;
     Object term11189;

    public CharacterReader_matches_201433289559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2349 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term2350 = (char[]) newCharArray(6);
        Object[] term2360 = (Object[]) newArray("java.lang.String", 8);
        setCharElement(term2350, 0, 'l');
        setCharElement(term2350, 1, 'h');
        setCharElement(term2350, 2, 'k');
        setCharElement(term2350, 3, 'X');
        setCharElement(term2350, 4, 'u');
        setCharElement(term2350, 5, 'u');
        setField(term2349, term2349.getClass(), "input", term2350);
        setIntField(term2349, term2349.getClass(), "length", -1588772968);
        setIntField(term2349, term2349.getClass(), "pos", -93135961);
        setIntField(term2349, term2349.getClass(), "mark", -112921587);
        setElement(term2360, 0, "xOcJIiQQDu");
        setElement(term2360, 1, "GVizqqzXpy");
        setElement(term2360, 2, "JqXGgAhZPl");
        setElement(term2360, 3, "jiKYgYHqIS");
        setElement(term2360, 4, "DfISiziTgG");
        setElement(term2360, 5, "XqgfKFvPSD");
        setElement(term2360, 6, "JiVRgTZvKc");
        setElement(term2360, 7, "XPKmummaqg");
        setField(term2349, term2349.getClass(), "stringCache", term2360);
        term2457 = new Character('a');
        term11189 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term11190 = (char[]) newCharArray(6);
        Object[] term11191 = (Object[]) newArray("java.lang.String", 8);
        setCharElement(term11190, 0, 'l');
        setCharElement(term11190, 1, 'h');
        setCharElement(term11190, 2, 'k');
        setCharElement(term11190, 3, 'X');
        setCharElement(term11190, 4, 'u');
        setCharElement(term11190, 5, 'u');
        setField(term11189, term11189.getClass(), "input", term11190);
        setIntField(term11189, term11189.getClass(), "length", -1588772968);
        setIntField(term11189, term11189.getClass(), "pos", -93135961);
        setIntField(term11189, term11189.getClass(), "mark", -112921587);
        setElement(term11191, 0, "xOcJIiQQDu");
        setElement(term11191, 1, "GVizqqzXpy");
        setElement(term11191, 2, "JqXGgAhZPl");
        setElement(term11191, 3, "jiKYgYHqIS");
        setElement(term11191, 4, "DfISiziTgG");
        setElement(term11191, 5, "XqgfKFvPSD");
        setElement(term11191, 6, "JiVRgTZvKc");
        setElement(term11191, 7, "XPKmummaqg");
        setField(term11189, term11189.getClass(), "stringCache", term11191);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term2457;
        Object retValue = callMethod(klass, "matches", argTypes, term2349, args);
        assertTrue(recursiveEquals(term2349, term11189));
        assertTrue(recursiveEquals(term2457, 'a'));
        assertTrue(recursiveEquals(retValue, false));
    }

};


