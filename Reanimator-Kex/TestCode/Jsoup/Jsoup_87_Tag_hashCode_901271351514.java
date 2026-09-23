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

public class Tag_hashCode_901271351514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44267;
     Object term44475;

    public Tag_hashCode_901271351514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44267 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term44267, term44267.getClass(), "tagName", "");
        setBooleanField(term44267, term44267.getClass(), "isBlock", true);
        setBooleanField(term44267, term44267.getClass(), "formatAsBlock", true);
        setBooleanField(term44267, term44267.getClass(), "canContainInline", false);
        setBooleanField(term44267, term44267.getClass(), "empty", true);
        setBooleanField(term44267, term44267.getClass(), "selfClosing", true);
        setBooleanField(term44267, term44267.getClass(), "preserveWhitespace", false);
        setBooleanField(term44267, term44267.getClass(), "formList", true);
        term44475 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term44475, term44475.getClass(), "tagName", "");
        setBooleanField(term44475, term44475.getClass(), "isBlock", true);
        setBooleanField(term44475, term44475.getClass(), "formatAsBlock", true);
        setBooleanField(term44475, term44475.getClass(), "canContainInline", false);
        setBooleanField(term44475, term44475.getClass(), "empty", true);
        setBooleanField(term44475, term44475.getClass(), "selfClosing", true);
        setBooleanField(term44475, term44475.getClass(), "preserveWhitespace", false);
        setBooleanField(term44475, term44475.getClass(), "formList", true);
        setBooleanField(term44475, term44475.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term44267, args);
        assertTrue(recursiveEquals(term44267, term44475));
        assertTrue(recursiveEquals(retValue, -1663699937));
    }

};


