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

public class Tag_isKnownTag_581658083205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15864;
     Object term16187;

    public Tag_isKnownTag_581658083205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15864 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term15864, term15864.getClass(), "tagName", "");
        term16187 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term16187, term16187.getClass(), "tagName", "");
        setBooleanField(term16187, term16187.getClass(), "isBlock", false);
        setBooleanField(term16187, term16187.getClass(), "formatAsBlock", false);
        setBooleanField(term16187, term16187.getClass(), "canContainBlock", false);
        setBooleanField(term16187, term16187.getClass(), "canContainInline", false);
        setBooleanField(term16187, term16187.getClass(), "empty", false);
        setBooleanField(term16187, term16187.getClass(), "selfClosing", false);
        setBooleanField(term16187, term16187.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isKnownTag", argTypes, term15864, args);
        assertTrue(recursiveEquals(term15864, term16187));
    }

};


