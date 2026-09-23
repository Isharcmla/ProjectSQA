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

public class CharacterReader_matchConsumeIgnoreCase_134760256687 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3112958;

    public CharacterReader_matchConsumeIgnoreCase_134760256687() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3112958 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term3112841 = (char[]) newCharArray(8);
        setIntField(term3112958, term3112958.getClass(), "bufPos", 912);
        setIntField(term3112958, term3112958.getClass(), "bufSplitPoint", 913);
        setIntField(term3112958, term3112958.getClass(), "bufLength", 913);
        setCharElement(term3112841, 0, (char) 32);
        setCharElement(term3112841, 1, (char) 32);
        setCharElement(term3112841, 2, (char) 32);
        setCharElement(term3112841, 3, (char) 32);
        setCharElement(term3112841, 4, (char) 32);
        setCharElement(term3112841, 5, (char) 32);
        setCharElement(term3112841, 6, (char) 32);
        setCharElement(term3112841, 7, (char) 32);
        setField(term3112958, term3112958.getClass(), "charBuf", term3112841);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = " ";
        callMethod(klass, "matchConsumeIgnoreCase", argTypes, term3112958, args);
    }

};


