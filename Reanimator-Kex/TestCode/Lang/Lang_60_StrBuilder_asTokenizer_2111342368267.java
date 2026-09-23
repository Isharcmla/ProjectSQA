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

public class StrBuilder_asTokenizer_2111342368267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11734;
     Object term82439;
     Object term82368;

    public StrBuilder_asTokenizer_2111342368267() {
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
        term82439 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term82440 = (char[]) newCharArray(32);
        setField(term82439, term82439.getClass(), "buffer", term82440);
        setIntField(term82439, term82439.getClass(), "size", 628918458);
        setField(term82439, term82439.getClass(), "newLine", "qCpEbQDHdF");
        setField(term82439, term82439.getClass(), "nullText", "AHbZyFOmlo");
        term82368 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder$StrBuilderTokenizer"));
        Object term82369 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term82370 = (char[]) newCharArray(32);
        Object term82429 = newInstance(Class.forName("org.apache.commons.lang.text.StrMatcher$CharSetMatcher"));
        char[] term82430 = (char[]) newCharArray(5);
        Object term82436 = newInstance(Class.forName("org.apache.commons.lang.text.StrMatcher$NoMatcher"));
        setField(term82369, term82369.getClass(), "buffer", term82370);
        setIntField(term82369, term82369.getClass(), "size", 628918458);
        setField(term82369, term82369.getClass(), "newLine", "qCpEbQDHdF");
        setField(term82369, term82369.getClass(), "nullText", "AHbZyFOmlo");
        setField(term82368, term82368.getClass(), "this$0", term82369);
        setField(term82368, term82368.getClass(), "chars", null);
        setField(term82368, term82368.getClass(), "tokens", null);
        setIntField(term82368, term82368.getClass(), "tokenPos", 0);
        setCharElement(term82430, 0, (char) 9);
        setCharElement(term82430, 1, (char) 10);
        setCharElement(term82430, 2, (char) 12);
        setCharElement(term82430, 3, (char) 13);
        setCharElement(term82430, 4, (char) 32);
        setField(term82429, term82429.getClass(), "chars", term82430);
        setField(term82368, term82368.getClass(), "delimMatcher", term82429);
        setField(term82368, term82368.getClass(), "quoteMatcher", term82436);
        setField(term82368, term82368.getClass(), "ignoredMatcher", term82436);
        setField(term82368, term82368.getClass(), "trimmerMatcher", term82436);
        setBooleanField(term82368, term82368.getClass(), "emptyAsNull", false);
        setBooleanField(term82368, term82368.getClass(), "ignoreEmptyTokens", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asTokenizer", argTypes, term11734, args);
        assertTrue(recursiveEquals(term11734, term82439));
        assertTrue(recursiveEquals(retValue, term82368));
    }

};


