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

public class Tag_hashCode_901271351185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16487;
     Object term16546;

    public Tag_hashCode_901271351185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16487 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term16487, term16487.getClass(), "tagName", "");
        setBooleanField(term16487, term16487.getClass(), "isBlock", false);
        setBooleanField(term16487, term16487.getClass(), "formatAsBlock", true);
        setBooleanField(term16487, term16487.getClass(), "canContainInline", true);
        setBooleanField(term16487, term16487.getClass(), "empty", false);
        setBooleanField(term16487, term16487.getClass(), "selfClosing", false);
        setBooleanField(term16487, term16487.getClass(), "preserveWhitespace", false);
        setBooleanField(term16487, term16487.getClass(), "formList", true);
        term16546 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term16546, term16546.getClass(), "tagName", "");
        setBooleanField(term16546, term16546.getClass(), "isBlock", false);
        setBooleanField(term16546, term16546.getClass(), "formatAsBlock", true);
        setBooleanField(term16546, term16546.getClass(), "canContainInline", true);
        setBooleanField(term16546, term16546.getClass(), "empty", false);
        setBooleanField(term16546, term16546.getClass(), "selfClosing", false);
        setBooleanField(term16546, term16546.getClass(), "preserveWhitespace", false);
        setBooleanField(term16546, term16546.getClass(), "formList", true);
        setBooleanField(term16546, term16546.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term16487, args);
        assertTrue(recursiveEquals(term16487, term16546));
        assertTrue(recursiveEquals(retValue, 916132863));
    }

};


