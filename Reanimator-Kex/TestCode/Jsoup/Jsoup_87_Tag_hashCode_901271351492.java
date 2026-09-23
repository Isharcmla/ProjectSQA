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

public class Tag_hashCode_901271351492 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42531;
     Object term42596;

    public Tag_hashCode_901271351492() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42531 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term42531, term42531.getClass(), "tagName", "");
        setBooleanField(term42531, term42531.getClass(), "isBlock", true);
        setBooleanField(term42531, term42531.getClass(), "formatAsBlock", true);
        setBooleanField(term42531, term42531.getClass(), "canContainInline", false);
        setBooleanField(term42531, term42531.getClass(), "empty", true);
        setBooleanField(term42531, term42531.getClass(), "selfClosing", true);
        setBooleanField(term42531, term42531.getClass(), "preserveWhitespace", true);
        setBooleanField(term42531, term42531.getClass(), "formList", false);
        setBooleanField(term42531, term42531.getClass(), "formSubmit", true);
        term42596 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term42596, term42596.getClass(), "tagName", "");
        setBooleanField(term42596, term42596.getClass(), "isBlock", true);
        setBooleanField(term42596, term42596.getClass(), "formatAsBlock", true);
        setBooleanField(term42596, term42596.getClass(), "canContainInline", false);
        setBooleanField(term42596, term42596.getClass(), "empty", true);
        setBooleanField(term42596, term42596.getClass(), "selfClosing", true);
        setBooleanField(term42596, term42596.getClass(), "preserveWhitespace", true);
        setBooleanField(term42596, term42596.getClass(), "formList", false);
        setBooleanField(term42596, term42596.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term42531, args);
        assertTrue(recursiveEquals(term42531, term42596));
        assertTrue(recursiveEquals(retValue, -1663699006));
    }

};


