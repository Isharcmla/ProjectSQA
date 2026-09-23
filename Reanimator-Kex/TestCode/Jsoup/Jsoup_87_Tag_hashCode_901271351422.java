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

public class Tag_hashCode_901271351422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36576;
     Object term36783;

    public Tag_hashCode_901271351422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36576 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term36576, term36576.getClass(), "tagName", "");
        setBooleanField(term36576, term36576.getClass(), "isBlock", true);
        setBooleanField(term36576, term36576.getClass(), "formatAsBlock", true);
        setBooleanField(term36576, term36576.getClass(), "canContainInline", false);
        setBooleanField(term36576, term36576.getClass(), "empty", true);
        setBooleanField(term36576, term36576.getClass(), "selfClosing", false);
        setBooleanField(term36576, term36576.getClass(), "preserveWhitespace", false);
        setBooleanField(term36576, term36576.getClass(), "formList", true);
        setBooleanField(term36576, term36576.getClass(), "formSubmit", true);
        term36783 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term36783, term36783.getClass(), "tagName", "");
        setBooleanField(term36783, term36783.getClass(), "isBlock", true);
        setBooleanField(term36783, term36783.getClass(), "formatAsBlock", true);
        setBooleanField(term36783, term36783.getClass(), "canContainInline", false);
        setBooleanField(term36783, term36783.getClass(), "empty", true);
        setBooleanField(term36783, term36783.getClass(), "selfClosing", false);
        setBooleanField(term36783, term36783.getClass(), "preserveWhitespace", false);
        setBooleanField(term36783, term36783.getClass(), "formList", true);
        setBooleanField(term36783, term36783.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term36576, args);
        assertTrue(recursiveEquals(term36576, term36783));
        assertTrue(recursiveEquals(retValue, -1663729727));
    }

};


