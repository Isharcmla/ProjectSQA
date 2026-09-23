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

public class Tag_hashCode_901271351195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15258;
     Object term15336;

    public Tag_hashCode_901271351195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15258 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term15258, term15258.getClass(), "tagName", "");
        setBooleanField(term15258, term15258.getClass(), "isBlock", true);
        setBooleanField(term15258, term15258.getClass(), "formatAsBlock", false);
        setBooleanField(term15258, term15258.getClass(), "canContainBlock", true);
        setBooleanField(term15258, term15258.getClass(), "canContainInline", true);
        setBooleanField(term15258, term15258.getClass(), "empty", true);
        setBooleanField(term15258, term15258.getClass(), "selfClosing", true);
        setBooleanField(term15258, term15258.getClass(), "preserveWhitespace", true);
        term15336 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term15336, term15336.getClass(), "tagName", "");
        setBooleanField(term15336, term15336.getClass(), "isBlock", true);
        setBooleanField(term15336, term15336.getClass(), "formatAsBlock", false);
        setBooleanField(term15336, term15336.getClass(), "canContainBlock", true);
        setBooleanField(term15336, term15336.getClass(), "canContainInline", true);
        setBooleanField(term15336, term15336.getClass(), "empty", true);
        setBooleanField(term15336, term15336.getClass(), "selfClosing", true);
        setBooleanField(term15336, term15336.getClass(), "preserveWhitespace", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term15258, args);
        assertTrue(recursiveEquals(term15258, term15336));
        assertTrue(recursiveEquals(retValue, 888457986));
    }

};


