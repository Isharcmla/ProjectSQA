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

public class CharacterReader_containsIgnoreCase_201681704868 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3879;
     Object term14862;

    public CharacterReader_containsIgnoreCase_201681704868() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3879 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term3880 = (char[]) newCharArray(0);
        Object[] term3884 = (Object[]) newArray("java.lang.String", 6);
        setField(term3879, term3879.getClass(), "input", term3880);
        setIntField(term3879, term3879.getClass(), "length", -344842608);
        setIntField(term3879, term3879.getClass(), "pos", 941650513);
        setIntField(term3879, term3879.getClass(), "mark", 444029505);
        setElement(term3884, 0, "VYkqXKVlAJ");
        setElement(term3884, 1, "XkIoWJRNwN");
        setElement(term3884, 2, "aNWLJdrZMq");
        setElement(term3884, 3, "HHmNoYxIGj");
        setElement(term3884, 4, "PtirvZmsGt");
        setElement(term3884, 5, "HWkpTmtlrc");
        setField(term3879, term3879.getClass(), "stringCache", term3884);
        term14862 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term14863 = (char[]) newCharArray(0);
        Object[] term14864 = (Object[]) newArray("java.lang.String", 6);
        setField(term14862, term14862.getClass(), "input", term14863);
        setIntField(term14862, term14862.getClass(), "length", -344842608);
        setIntField(term14862, term14862.getClass(), "pos", 941650513);
        setIntField(term14862, term14862.getClass(), "mark", 444029505);
        setElement(term14864, 0, "VYkqXKVlAJ");
        setElement(term14864, 1, "XkIoWJRNwN");
        setElement(term14864, 2, "aNWLJdrZMq");
        setElement(term14864, 3, "HHmNoYxIGj");
        setElement(term14864, 4, "PtirvZmsGt");
        setElement(term14864, 5, "HWkpTmtlrc");
        setField(term14862, term14862.getClass(), "stringCache", term14864);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "hMmaoREuCK";
        Object retValue = callMethod(klass, "containsIgnoreCase", argTypes, term3879, args);
        assertTrue(recursiveEquals(term3879, term14862));
        assertTrue(recursiveEquals(retValue, false));
    }

};


