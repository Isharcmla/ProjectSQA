package org.apache.commons.lang.text;

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
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.text.EqualityUtils.*;
import java.lang.Object;

public class StrBuilder_asTokenizer_2111342368269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11734;
     Object term81544;
     Object term81473;

    public StrBuilder_asTokenizer_2111342368269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11734 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term11735 = (char[]) newCharArray(32);
        setField(term11734, term11734.getClass(), "buffer", term11735);
        setIntField(term11734, term11734.getClass(), "size", 628918458);
        setField(term11734, term11734.getClass(), "newLine", "qCpEbQDHdF");
        setField(term11734, term11734.getClass(), "nullText", "AHbZyFOmlo");
        term81544 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term81545 = (char[]) newCharArray(32);
        setField(term81544, term81544.getClass(), "buffer", term81545);
        setIntField(term81544, term81544.getClass(), "size", 628918458);
        setField(term81544, term81544.getClass(), "newLine", "qCpEbQDHdF");
        setField(term81544, term81544.getClass(), "nullText", "AHbZyFOmlo");
        term81473 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder$StrBuilderTokenizer"));
        Object term81474 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term81475 = (char[]) newCharArray(32);
        Object term81534 = newInstance(Class.forName("org.apache.commons.lang.text.StrMatcher$CharSetMatcher"));
        char[] term81535 = (char[]) newCharArray(5);
        Object term81541 = newInstance(Class.forName("org.apache.commons.lang.text.StrMatcher$NoMatcher"));
        setField(term81474, term81474.getClass(), "buffer", term81475);
        setIntField(term81474, term81474.getClass(), "size", 628918458);
        setField(term81474, term81474.getClass(), "newLine", "qCpEbQDHdF");
        setField(term81474, term81474.getClass(), "nullText", "AHbZyFOmlo");
        setField(term81473, term81473.getClass(), "this$0", term81474);
        setField(term81473, term81473.getClass(), "chars", null);
        setField(term81473, term81473.getClass(), "tokens", null);
        setIntField(term81473, term81473.getClass(), "tokenPos", 0);
        setCharElement(term81535, 0, (char) 9);
        setCharElement(term81535, 1, (char) 10);
        setCharElement(term81535, 2, (char) 12);
        setCharElement(term81535, 3, (char) 13);
        setCharElement(term81535, 4, (char) 32);
        setField(term81534, term81534.getClass(), "chars", term81535);
        setField(term81473, term81473.getClass(), "delimMatcher", term81534);
        setField(term81473, term81473.getClass(), "quoteMatcher", term81541);
        setField(term81473, term81473.getClass(), "ignoredMatcher", term81541);
        setField(term81473, term81473.getClass(), "trimmerMatcher", term81541);
        setBooleanField(term81473, term81473.getClass(), "emptyAsNull", false);
        setBooleanField(term81473, term81473.getClass(), "ignoreEmptyTokens", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asTokenizer", argTypes, term11734, args);
        assertTrue(recursiveEquals(term11734, term81544));
        assertTrue(recursiveEquals(retValue, term81473));
    }

};


