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

public class Tag_hashCode_901271351137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12579;
     Object term12638;

    public Tag_hashCode_901271351137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12579 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term12579, term12579.getClass(), "tagName", "");
        setBooleanField(term12579, term12579.getClass(), "isBlock", true);
        setBooleanField(term12579, term12579.getClass(), "formatAsBlock", false);
        setBooleanField(term12579, term12579.getClass(), "canContainInline", false);
        setBooleanField(term12579, term12579.getClass(), "empty", false);
        setBooleanField(term12579, term12579.getClass(), "selfClosing", false);
        setBooleanField(term12579, term12579.getClass(), "preserveWhitespace", false);
        setBooleanField(term12579, term12579.getClass(), "formList", true);
        term12638 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term12638, term12638.getClass(), "tagName", "");
        setBooleanField(term12638, term12638.getClass(), "isBlock", true);
        setBooleanField(term12638, term12638.getClass(), "formatAsBlock", false);
        setBooleanField(term12638, term12638.getClass(), "canContainInline", false);
        setBooleanField(term12638, term12638.getClass(), "empty", false);
        setBooleanField(term12638, term12638.getClass(), "selfClosing", false);
        setBooleanField(term12638, term12638.getClass(), "preserveWhitespace", false);
        setBooleanField(term12638, term12638.getClass(), "formList", true);
        setBooleanField(term12638, term12638.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term12579, args);
        assertTrue(recursiveEquals(term12579, term12638));
        assertTrue(recursiveEquals(retValue, 1742810366));
    }

};


