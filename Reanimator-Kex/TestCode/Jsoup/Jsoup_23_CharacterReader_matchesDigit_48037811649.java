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

public class CharacterReader_matchesDigit_48037811649 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term659;
     Object term4703;

    public CharacterReader_matchesDigit_48037811649() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term659 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term659, term659.getClass(), "input", "vrQLuWIDJX");
        setIntField(term659, term659.getClass(), "length", -2095575670);
        setIntField(term659, term659.getClass(), "pos", 1225272962);
        setIntField(term659, term659.getClass(), "mark", 1324040357);
        term4703 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term4703, term4703.getClass(), "input", "vrQLuWIDJX");
        setIntField(term4703, term4703.getClass(), "length", -2095575670);
        setIntField(term4703, term4703.getClass(), "pos", 1225272962);
        setIntField(term4703, term4703.getClass(), "mark", 1324040357);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "matchesDigit", argTypes, term659, args);
        assertTrue(recursiveEquals(term659, term4703));
        assertTrue(recursiveEquals(retValue, false));
    }

};


