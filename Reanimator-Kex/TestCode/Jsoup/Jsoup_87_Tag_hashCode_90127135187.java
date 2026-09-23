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

public class Tag_hashCode_90127135187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5909;
     Object term6001;

    public Tag_hashCode_90127135187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5909 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term5909, term5909.getClass(), "tagName", "");
        setBooleanField(term5909, term5909.getClass(), "isBlock", false);
        setBooleanField(term5909, term5909.getClass(), "formatAsBlock", false);
        setBooleanField(term5909, term5909.getClass(), "canContainInline", true);
        setBooleanField(term5909, term5909.getClass(), "empty", true);
        setBooleanField(term5909, term5909.getClass(), "selfClosing", true);
        setBooleanField(term5909, term5909.getClass(), "preserveWhitespace", false);
        setBooleanField(term5909, term5909.getClass(), "formList", true);
        term6001 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term6001, term6001.getClass(), "tagName", "");
        setBooleanField(term6001, term6001.getClass(), "isBlock", false);
        setBooleanField(term6001, term6001.getClass(), "formatAsBlock", false);
        setBooleanField(term6001, term6001.getClass(), "canContainInline", true);
        setBooleanField(term6001, term6001.getClass(), "empty", true);
        setBooleanField(term6001, term6001.getClass(), "selfClosing", true);
        setBooleanField(term6001, term6001.getClass(), "preserveWhitespace", false);
        setBooleanField(term6001, term6001.getClass(), "formList", true);
        setBooleanField(term6001, term6001.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term5909, args);
        assertTrue(recursiveEquals(term5909, term6001));
        assertTrue(recursiveEquals(retValue, 29582494));
    }

};


