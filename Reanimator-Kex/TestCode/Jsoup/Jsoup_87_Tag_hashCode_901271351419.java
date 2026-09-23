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

public class Tag_hashCode_901271351419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36371;
     Object term36460;

    public Tag_hashCode_901271351419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36371 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term36371, term36371.getClass(), "tagName", "");
        setBooleanField(term36371, term36371.getClass(), "isBlock", false);
        setBooleanField(term36371, term36371.getClass(), "formatAsBlock", true);
        setBooleanField(term36371, term36371.getClass(), "canContainInline", true);
        setBooleanField(term36371, term36371.getClass(), "empty", false);
        setBooleanField(term36371, term36371.getClass(), "selfClosing", true);
        setBooleanField(term36371, term36371.getClass(), "preserveWhitespace", true);
        setBooleanField(term36371, term36371.getClass(), "formList", true);
        term36460 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term36460, term36460.getClass(), "tagName", "");
        setBooleanField(term36460, term36460.getClass(), "isBlock", false);
        setBooleanField(term36460, term36460.getClass(), "formatAsBlock", true);
        setBooleanField(term36460, term36460.getClass(), "canContainInline", true);
        setBooleanField(term36460, term36460.getClass(), "empty", false);
        setBooleanField(term36460, term36460.getClass(), "selfClosing", true);
        setBooleanField(term36460, term36460.getClass(), "preserveWhitespace", true);
        setBooleanField(term36460, term36460.getClass(), "formList", true);
        setBooleanField(term36460, term36460.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term36371, args);
        assertTrue(recursiveEquals(term36371, term36460));
        assertTrue(recursiveEquals(retValue, 916163615));
    }

};


