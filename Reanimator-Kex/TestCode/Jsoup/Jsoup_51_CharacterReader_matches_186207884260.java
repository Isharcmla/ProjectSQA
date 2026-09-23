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

public class CharacterReader_matches_186207884260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2545;

    public CharacterReader_matches_186207884260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2545 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term2546 = (char[]) newCharArray(9);
        Object[] term2559 = (Object[]) newArray("java.lang.String", 7);
        setCharElement(term2546, 0, 'P');
        setCharElement(term2546, 1, 'i');
        setCharElement(term2546, 2, 'g');
        setCharElement(term2546, 3, 'E');
        setCharElement(term2546, 4, 'T');
        setCharElement(term2546, 5, 'm');
        setCharElement(term2546, 6, 'J');
        setCharElement(term2546, 7, 'M');
        setCharElement(term2546, 8, 'x');
        setField(term2545, term2545.getClass(), "input", term2546);
        setIntField(term2545, term2545.getClass(), "length", 933028652);
        setIntField(term2545, term2545.getClass(), "pos", 287287233);
        setIntField(term2545, term2545.getClass(), "mark", 962840079);
        setElement(term2559, 0, "BKLfkLiZTH");
        setElement(term2559, 1, "SPpkrGcPRr");
        setElement(term2559, 2, "sEccwbJKYE");
        setElement(term2559, 3, "AWRooQKkdW");
        setElement(term2559, 4, "vjxIhXHxGR");
        setElement(term2559, 5, "QXzGXbEXMu");
        setElement(term2559, 6, "qxSDVejjiY");
        setField(term2545, term2545.getClass(), "stringCache", term2559);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xBsXSDjXYK";
        try {
            callMethod(klass, "matches", argTypes, term2545, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


