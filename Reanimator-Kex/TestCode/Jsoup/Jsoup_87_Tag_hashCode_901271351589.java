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

public class Tag_hashCode_901271351589 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50882;
     Object term50964;

    public Tag_hashCode_901271351589() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50882 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term50882, term50882.getClass(), "tagName", "");
        setBooleanField(term50882, term50882.getClass(), "isBlock", true);
        setBooleanField(term50882, term50882.getClass(), "formatAsBlock", true);
        setBooleanField(term50882, term50882.getClass(), "canContainInline", false);
        setBooleanField(term50882, term50882.getClass(), "empty", false);
        setBooleanField(term50882, term50882.getClass(), "selfClosing", true);
        setBooleanField(term50882, term50882.getClass(), "preserveWhitespace", true);
        setBooleanField(term50882, term50882.getClass(), "formList", false);
        setBooleanField(term50882, term50882.getClass(), "formSubmit", true);
        term50964 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term50964, term50964.getClass(), "tagName", "");
        setBooleanField(term50964, term50964.getClass(), "isBlock", true);
        setBooleanField(term50964, term50964.getClass(), "formatAsBlock", true);
        setBooleanField(term50964, term50964.getClass(), "canContainInline", false);
        setBooleanField(term50964, term50964.getClass(), "empty", false);
        setBooleanField(term50964, term50964.getClass(), "selfClosing", true);
        setBooleanField(term50964, term50964.getClass(), "preserveWhitespace", true);
        setBooleanField(term50964, term50964.getClass(), "formList", false);
        setBooleanField(term50964, term50964.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term50882, args);
        assertTrue(recursiveEquals(term50882, term50964));
        assertTrue(recursiveEquals(retValue, -1664622527));
    }

};


