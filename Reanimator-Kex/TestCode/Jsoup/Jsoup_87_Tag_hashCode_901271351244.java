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

public class Tag_hashCode_901271351244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21511;
     Object term21707;

    public Tag_hashCode_901271351244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21511 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term21511, term21511.getClass(), "tagName", "");
        setBooleanField(term21511, term21511.getClass(), "isBlock", true);
        setBooleanField(term21511, term21511.getClass(), "formatAsBlock", true);
        setBooleanField(term21511, term21511.getClass(), "canContainInline", false);
        setBooleanField(term21511, term21511.getClass(), "empty", true);
        setBooleanField(term21511, term21511.getClass(), "selfClosing", false);
        setBooleanField(term21511, term21511.getClass(), "preserveWhitespace", false);
        setBooleanField(term21511, term21511.getClass(), "formList", true);
        term21707 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term21707, term21707.getClass(), "tagName", "");
        setBooleanField(term21707, term21707.getClass(), "isBlock", true);
        setBooleanField(term21707, term21707.getClass(), "formatAsBlock", true);
        setBooleanField(term21707, term21707.getClass(), "canContainInline", false);
        setBooleanField(term21707, term21707.getClass(), "empty", true);
        setBooleanField(term21707, term21707.getClass(), "selfClosing", false);
        setBooleanField(term21707, term21707.getClass(), "preserveWhitespace", false);
        setBooleanField(term21707, term21707.getClass(), "formList", true);
        setBooleanField(term21707, term21707.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term21511, args);
        assertTrue(recursiveEquals(term21511, term21707));
        assertTrue(recursiveEquals(retValue, -1663729728));
    }

};


