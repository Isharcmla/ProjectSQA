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

public class Tag_hashCode_901271351423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36724;
     Object term36806;

    public Tag_hashCode_901271351423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36724 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term36724, term36724.getClass(), "tagName", "");
        setBooleanField(term36724, term36724.getClass(), "isBlock", false);
        setBooleanField(term36724, term36724.getClass(), "formatAsBlock", false);
        setBooleanField(term36724, term36724.getClass(), "canContainInline", false);
        setBooleanField(term36724, term36724.getClass(), "empty", true);
        setBooleanField(term36724, term36724.getClass(), "selfClosing", true);
        setBooleanField(term36724, term36724.getClass(), "preserveWhitespace", false);
        setBooleanField(term36724, term36724.getClass(), "formList", true);
        setBooleanField(term36724, term36724.getClass(), "formSubmit", true);
        term36806 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term36806, term36806.getClass(), "tagName", "");
        setBooleanField(term36806, term36806.getClass(), "isBlock", false);
        setBooleanField(term36806, term36806.getClass(), "formatAsBlock", false);
        setBooleanField(term36806, term36806.getClass(), "canContainInline", false);
        setBooleanField(term36806, term36806.getClass(), "empty", true);
        setBooleanField(term36806, term36806.getClass(), "selfClosing", true);
        setBooleanField(term36806, term36806.getClass(), "preserveWhitespace", false);
        setBooleanField(term36806, term36806.getClass(), "formList", true);
        setBooleanField(term36806, term36806.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term36724, args);
        assertTrue(recursiveEquals(term36724, term36806));
        assertTrue(recursiveEquals(retValue, 953344));
    }

};


