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

public class StrBuilder_asTokenizer_2111342368270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11734;
     Object term84043;
     Object term83972;

    public StrBuilder_asTokenizer_2111342368270() {
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
        term84043 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term84044 = (char[]) newCharArray(32);
        setField(term84043, term84043.getClass(), "buffer", term84044);
        setIntField(term84043, term84043.getClass(), "size", 628918458);
        setField(term84043, term84043.getClass(), "newLine", "qCpEbQDHdF");
        setField(term84043, term84043.getClass(), "nullText", "AHbZyFOmlo");
        term83972 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder$StrBuilderTokenizer"));
        Object term83973 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term83974 = (char[]) newCharArray(32);
        Object term84033 = newInstance(Class.forName("org.apache.commons.lang.text.StrMatcher$CharSetMatcher"));
        char[] term84034 = (char[]) newCharArray(5);
        Object term84040 = newInstance(Class.forName("org.apache.commons.lang.text.StrMatcher$NoMatcher"));
        setField(term83973, term83973.getClass(), "buffer", term83974);
        setIntField(term83973, term83973.getClass(), "size", 628918458);
        setField(term83973, term83973.getClass(), "newLine", "qCpEbQDHdF");
        setField(term83973, term83973.getClass(), "nullText", "AHbZyFOmlo");
        setField(term83972, term83972.getClass(), "this$0", term83973);
        setField(term83972, term83972.getClass(), "chars", null);
        setField(term83972, term83972.getClass(), "tokens", null);
        setIntField(term83972, term83972.getClass(), "tokenPos", 0);
        setCharElement(term84034, 0, (char) 9);
        setCharElement(term84034, 1, (char) 10);
        setCharElement(term84034, 2, (char) 12);
        setCharElement(term84034, 3, (char) 13);
        setCharElement(term84034, 4, (char) 32);
        setField(term84033, term84033.getClass(), "chars", term84034);
        setField(term83972, term83972.getClass(), "delimMatcher", term84033);
        setField(term83972, term83972.getClass(), "quoteMatcher", term84040);
        setField(term83972, term83972.getClass(), "ignoredMatcher", term84040);
        setField(term83972, term83972.getClass(), "trimmerMatcher", term84040);
        setBooleanField(term83972, term83972.getClass(), "emptyAsNull", false);
        setBooleanField(term83972, term83972.getClass(), "ignoreEmptyTokens", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asTokenizer", argTypes, term11734, args);
        assertTrue(recursiveEquals(term11734, term84043));
        assertTrue(recursiveEquals(retValue, term83972));
    }

};


