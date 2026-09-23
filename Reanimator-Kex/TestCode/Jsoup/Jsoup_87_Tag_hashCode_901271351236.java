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

public class Tag_hashCode_901271351236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20845;
     Object term21048;

    public Tag_hashCode_901271351236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20845 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term20845, term20845.getClass(), "tagName", "");
        setBooleanField(term20845, term20845.getClass(), "isBlock", true);
        setBooleanField(term20845, term20845.getClass(), "formatAsBlock", false);
        setBooleanField(term20845, term20845.getClass(), "canContainInline", false);
        setBooleanField(term20845, term20845.getClass(), "empty", false);
        setBooleanField(term20845, term20845.getClass(), "selfClosing", false);
        setBooleanField(term20845, term20845.getClass(), "preserveWhitespace", true);
        setBooleanField(term20845, term20845.getClass(), "formList", false);
        setBooleanField(term20845, term20845.getClass(), "formSubmit", true);
        term21048 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term21048, term21048.getClass(), "tagName", "");
        setBooleanField(term21048, term21048.getClass(), "isBlock", true);
        setBooleanField(term21048, term21048.getClass(), "formatAsBlock", false);
        setBooleanField(term21048, term21048.getClass(), "canContainInline", false);
        setBooleanField(term21048, term21048.getClass(), "empty", false);
        setBooleanField(term21048, term21048.getClass(), "selfClosing", false);
        setBooleanField(term21048, term21048.getClass(), "preserveWhitespace", true);
        setBooleanField(term21048, term21048.getClass(), "formList", false);
        setBooleanField(term21048, term21048.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term20845, args);
        assertTrue(recursiveEquals(term20845, term21048));
        assertTrue(recursiveEquals(retValue, 1742811297));
    }

};


