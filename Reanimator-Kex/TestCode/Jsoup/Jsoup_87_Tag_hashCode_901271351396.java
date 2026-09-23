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

public class Tag_hashCode_901271351396 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34335;
     Object term34546;

    public Tag_hashCode_901271351396() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34335 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term34335, term34335.getClass(), "tagName", "");
        setBooleanField(term34335, term34335.getClass(), "isBlock", true);
        setBooleanField(term34335, term34335.getClass(), "formatAsBlock", false);
        setBooleanField(term34335, term34335.getClass(), "canContainInline", true);
        setBooleanField(term34335, term34335.getClass(), "empty", true);
        setBooleanField(term34335, term34335.getClass(), "selfClosing", false);
        setBooleanField(term34335, term34335.getClass(), "preserveWhitespace", true);
        setBooleanField(term34335, term34335.getClass(), "formList", true);
        setBooleanField(term34335, term34335.getClass(), "formSubmit", true);
        term34546 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term34546, term34546.getClass(), "tagName", "");
        setBooleanField(term34546, term34546.getClass(), "isBlock", true);
        setBooleanField(term34546, term34546.getClass(), "formatAsBlock", false);
        setBooleanField(term34546, term34546.getClass(), "canContainInline", true);
        setBooleanField(term34546, term34546.getClass(), "empty", true);
        setBooleanField(term34546, term34546.getClass(), "selfClosing", false);
        setBooleanField(term34546, term34546.getClass(), "preserveWhitespace", true);
        setBooleanField(term34546, term34546.getClass(), "formList", true);
        setBooleanField(term34546, term34546.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term34335, args);
        assertTrue(recursiveEquals(term34335, term34546));
        assertTrue(recursiveEquals(retValue, 1772364000));
    }

};


