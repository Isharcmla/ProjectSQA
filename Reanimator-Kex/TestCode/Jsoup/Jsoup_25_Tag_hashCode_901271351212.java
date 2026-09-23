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

public class Tag_hashCode_901271351212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16467;
     Object term16690;

    public Tag_hashCode_901271351212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16467 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term16467, term16467.getClass(), "tagName", "");
        setBooleanField(term16467, term16467.getClass(), "isBlock", true);
        setBooleanField(term16467, term16467.getClass(), "formatAsBlock", false);
        setBooleanField(term16467, term16467.getClass(), "canContainBlock", false);
        setBooleanField(term16467, term16467.getClass(), "canContainInline", false);
        setBooleanField(term16467, term16467.getClass(), "empty", true);
        setBooleanField(term16467, term16467.getClass(), "selfClosing", true);
        term16690 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term16690, term16690.getClass(), "tagName", "");
        setBooleanField(term16690, term16690.getClass(), "isBlock", true);
        setBooleanField(term16690, term16690.getClass(), "formatAsBlock", false);
        setBooleanField(term16690, term16690.getClass(), "canContainBlock", false);
        setBooleanField(term16690, term16690.getClass(), "canContainInline", false);
        setBooleanField(term16690, term16690.getClass(), "empty", true);
        setBooleanField(term16690, term16690.getClass(), "selfClosing", true);
        setBooleanField(term16690, term16690.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term16467, args);
        assertTrue(recursiveEquals(term16467, term16690));
        assertTrue(recursiveEquals(retValue, 887504673));
    }

};


