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

public class Tag_hashCode_90127135183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5591;
     Object term5660;

    public Tag_hashCode_90127135183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5591 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term5591, term5591.getClass(), "tagName", "");
        setBooleanField(term5591, term5591.getClass(), "isBlock", false);
        setBooleanField(term5591, term5591.getClass(), "formatAsBlock", false);
        setBooleanField(term5591, term5591.getClass(), "canContainInline", true);
        setBooleanField(term5591, term5591.getClass(), "empty", true);
        setBooleanField(term5591, term5591.getClass(), "selfClosing", true);
        setBooleanField(term5591, term5591.getClass(), "preserveWhitespace", true);
        term5660 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term5660, term5660.getClass(), "tagName", "");
        setBooleanField(term5660, term5660.getClass(), "isBlock", false);
        setBooleanField(term5660, term5660.getClass(), "formatAsBlock", false);
        setBooleanField(term5660, term5660.getClass(), "canContainInline", true);
        setBooleanField(term5660, term5660.getClass(), "empty", true);
        setBooleanField(term5660, term5660.getClass(), "selfClosing", true);
        setBooleanField(term5660, term5660.getClass(), "preserveWhitespace", true);
        setBooleanField(term5660, term5660.getClass(), "formList", false);
        setBooleanField(term5660, term5660.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term5591, args);
        assertTrue(recursiveEquals(term5591, term5660));
        assertTrue(recursiveEquals(retValue, 29583424));
    }

};


