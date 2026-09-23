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

public class Tag_hashCode_901271351318 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27613;
     Object term27823;

    public Tag_hashCode_901271351318() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27613 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term27613, term27613.getClass(), "tagName", "");
        setBooleanField(term27613, term27613.getClass(), "isBlock", false);
        setBooleanField(term27613, term27613.getClass(), "formatAsBlock", true);
        setBooleanField(term27613, term27613.getClass(), "canContainInline", false);
        setBooleanField(term27613, term27613.getClass(), "empty", false);
        setBooleanField(term27613, term27613.getClass(), "selfClosing", true);
        setBooleanField(term27613, term27613.getClass(), "preserveWhitespace", true);
        term27823 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term27823, term27823.getClass(), "tagName", "");
        setBooleanField(term27823, term27823.getClass(), "isBlock", false);
        setBooleanField(term27823, term27823.getClass(), "formatAsBlock", true);
        setBooleanField(term27823, term27823.getClass(), "canContainInline", false);
        setBooleanField(term27823, term27823.getClass(), "empty", false);
        setBooleanField(term27823, term27823.getClass(), "selfClosing", true);
        setBooleanField(term27823, term27823.getClass(), "preserveWhitespace", true);
        setBooleanField(term27823, term27823.getClass(), "formList", false);
        setBooleanField(term27823, term27823.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term27613, args);
        assertTrue(recursiveEquals(term27613, term27823));
        assertTrue(recursiveEquals(retValue, 887534433));
    }

};


