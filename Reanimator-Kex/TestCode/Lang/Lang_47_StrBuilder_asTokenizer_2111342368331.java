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

public class StrBuilder_asTokenizer_2111342368331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14554;
     Object term96743;
     Object term96672;

    public StrBuilder_asTokenizer_2111342368331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14554 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term14555 = (char[]) newCharArray(32);
        setField(term14554, term14554.getClass(), "buffer", term14555);
        setIntField(term14554, term14554.getClass(), "size", -571169753);
        setField(term14554, term14554.getClass(), "newLine", "TweMFhxNdj");
        setField(term14554, term14554.getClass(), "nullText", "NBrvVzvQHe");
        term96743 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term96744 = (char[]) newCharArray(32);
        setField(term96743, term96743.getClass(), "buffer", term96744);
        setIntField(term96743, term96743.getClass(), "size", -571169753);
        setField(term96743, term96743.getClass(), "newLine", "TweMFhxNdj");
        setField(term96743, term96743.getClass(), "nullText", "NBrvVzvQHe");
        term96672 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder$StrBuilderTokenizer"));
        Object term96673 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        char[] term96674 = (char[]) newCharArray(32);
        Object term96733 = newInstance(Class.forName("org.apache.commons.lang.text.StrMatcher$CharSetMatcher"));
        char[] term96734 = (char[]) newCharArray(5);
        Object term96740 = newInstance(Class.forName("org.apache.commons.lang.text.StrMatcher$NoMatcher"));
        setField(term96673, term96673.getClass(), "buffer", term96674);
        setIntField(term96673, term96673.getClass(), "size", -571169753);
        setField(term96673, term96673.getClass(), "newLine", "TweMFhxNdj");
        setField(term96673, term96673.getClass(), "nullText", "NBrvVzvQHe");
        setField(term96672, term96672.getClass(), "this$0", term96673);
        setField(term96672, term96672.getClass(), "chars", null);
        setField(term96672, term96672.getClass(), "tokens", null);
        setIntField(term96672, term96672.getClass(), "tokenPos", 0);
        setCharElement(term96734, 0, (char) 9);
        setCharElement(term96734, 1, (char) 10);
        setCharElement(term96734, 2, (char) 12);
        setCharElement(term96734, 3, (char) 13);
        setCharElement(term96734, 4, (char) 32);
        setField(term96733, term96733.getClass(), "chars", term96734);
        setField(term96672, term96672.getClass(), "delimMatcher", term96733);
        setField(term96672, term96672.getClass(), "quoteMatcher", term96740);
        setField(term96672, term96672.getClass(), "ignoredMatcher", term96740);
        setField(term96672, term96672.getClass(), "trimmerMatcher", term96740);
        setBooleanField(term96672, term96672.getClass(), "emptyAsNull", false);
        setBooleanField(term96672, term96672.getClass(), "ignoreEmptyTokens", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asTokenizer", argTypes, term14554, args);
        assertTrue(recursiveEquals(term14554, term96743));
        assertTrue(recursiveEquals(retValue, term96672));
    }

};


