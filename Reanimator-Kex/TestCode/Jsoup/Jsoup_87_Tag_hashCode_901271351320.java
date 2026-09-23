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

public class Tag_hashCode_901271351320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27764;
     Object term27975;

    public Tag_hashCode_901271351320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27764 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term27764, term27764.getClass(), "tagName", "");
        setBooleanField(term27764, term27764.getClass(), "isBlock", false);
        setBooleanField(term27764, term27764.getClass(), "formatAsBlock", true);
        setBooleanField(term27764, term27764.getClass(), "canContainInline", false);
        setBooleanField(term27764, term27764.getClass(), "empty", true);
        setBooleanField(term27764, term27764.getClass(), "selfClosing", false);
        setBooleanField(term27764, term27764.getClass(), "preserveWhitespace", true);
        setBooleanField(term27764, term27764.getClass(), "formList", true);
        setBooleanField(term27764, term27764.getClass(), "formSubmit", true);
        term27975 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term27975, term27975.getClass(), "tagName", "");
        setBooleanField(term27975, term27975.getClass(), "isBlock", false);
        setBooleanField(term27975, term27975.getClass(), "formatAsBlock", true);
        setBooleanField(term27975, term27975.getClass(), "canContainInline", false);
        setBooleanField(term27975, term27975.getClass(), "empty", true);
        setBooleanField(term27975, term27975.getClass(), "selfClosing", false);
        setBooleanField(term27975, term27975.getClass(), "preserveWhitespace", true);
        setBooleanField(term27975, term27975.getClass(), "formList", true);
        setBooleanField(term27975, term27975.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term27764, args);
        assertTrue(recursiveEquals(term27764, term27975));
        assertTrue(recursiveEquals(retValue, 888428195));
    }

};


