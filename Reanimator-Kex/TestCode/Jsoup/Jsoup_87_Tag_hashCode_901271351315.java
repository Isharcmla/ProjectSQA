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

public class Tag_hashCode_901271351315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27432;
     Object term27514;

    public Tag_hashCode_901271351315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27432 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term27432, term27432.getClass(), "tagName", "");
        setBooleanField(term27432, term27432.getClass(), "isBlock", false);
        setBooleanField(term27432, term27432.getClass(), "formatAsBlock", true);
        setBooleanField(term27432, term27432.getClass(), "canContainInline", false);
        setBooleanField(term27432, term27432.getClass(), "empty", false);
        setBooleanField(term27432, term27432.getClass(), "selfClosing", false);
        setBooleanField(term27432, term27432.getClass(), "preserveWhitespace", true);
        setBooleanField(term27432, term27432.getClass(), "formList", true);
        term27514 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term27514, term27514.getClass(), "tagName", "");
        setBooleanField(term27514, term27514.getClass(), "isBlock", false);
        setBooleanField(term27514, term27514.getClass(), "formatAsBlock", true);
        setBooleanField(term27514, term27514.getClass(), "canContainInline", false);
        setBooleanField(term27514, term27514.getClass(), "empty", false);
        setBooleanField(term27514, term27514.getClass(), "selfClosing", false);
        setBooleanField(term27514, term27514.getClass(), "preserveWhitespace", true);
        setBooleanField(term27514, term27514.getClass(), "formList", true);
        setBooleanField(term27514, term27514.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term27432, args);
        assertTrue(recursiveEquals(term27432, term27514));
        assertTrue(recursiveEquals(retValue, 887504673));
    }

};


