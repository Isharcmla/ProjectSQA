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

public class Tag_hashCode_90127135195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6575;
     Object term6634;

    public Tag_hashCode_90127135195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6575 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term6575, term6575.getClass(), "tagName", "");
        setBooleanField(term6575, term6575.getClass(), "isBlock", false);
        setBooleanField(term6575, term6575.getClass(), "formatAsBlock", true);
        setBooleanField(term6575, term6575.getClass(), "canContainInline", false);
        setBooleanField(term6575, term6575.getClass(), "empty", true);
        term6634 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term6634, term6634.getClass(), "tagName", "");
        setBooleanField(term6634, term6634.getClass(), "isBlock", false);
        setBooleanField(term6634, term6634.getClass(), "formatAsBlock", true);
        setBooleanField(term6634, term6634.getClass(), "canContainInline", false);
        setBooleanField(term6634, term6634.getClass(), "empty", true);
        setBooleanField(term6634, term6634.getClass(), "selfClosing", false);
        setBooleanField(term6634, term6634.getClass(), "preserveWhitespace", false);
        setBooleanField(term6634, term6634.getClass(), "formList", false);
        setBooleanField(term6634, term6634.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term6575, args);
        assertTrue(recursiveEquals(term6575, term6634));
        assertTrue(recursiveEquals(retValue, 888427202));
    }

};


