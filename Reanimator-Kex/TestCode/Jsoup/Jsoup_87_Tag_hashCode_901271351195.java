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
     Object term17372;
     Object term17431;

    public Tag_hashCode_901271351195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17372 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term17372, term17372.getClass(), "tagName", "");
        setBooleanField(term17372, term17372.getClass(), "isBlock", false);
        setBooleanField(term17372, term17372.getClass(), "formatAsBlock", false);
        setBooleanField(term17372, term17372.getClass(), "canContainInline", false);
        setBooleanField(term17372, term17372.getClass(), "empty", false);
        setBooleanField(term17372, term17372.getClass(), "selfClosing", false);
        setBooleanField(term17372, term17372.getClass(), "preserveWhitespace", true);
        term17431 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term17431, term17431.getClass(), "tagName", "");
        setBooleanField(term17431, term17431.getClass(), "isBlock", false);
        setBooleanField(term17431, term17431.getClass(), "formatAsBlock", false);
        setBooleanField(term17431, term17431.getClass(), "canContainInline", false);
        setBooleanField(term17431, term17431.getClass(), "empty", false);
        setBooleanField(term17431, term17431.getClass(), "selfClosing", false);
        setBooleanField(term17431, term17431.getClass(), "preserveWhitespace", true);
        setBooleanField(term17431, term17431.getClass(), "formList", false);
        setBooleanField(term17431, term17431.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term17372, args);
        assertTrue(recursiveEquals(term17372, term17431));
        assertTrue(recursiveEquals(retValue, 961));
    }

};


