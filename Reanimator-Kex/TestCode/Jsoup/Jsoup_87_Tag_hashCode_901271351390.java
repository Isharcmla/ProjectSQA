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

public class Tag_hashCode_901271351390 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33675;
     Object term33782;

    public Tag_hashCode_901271351390() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33675 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term33675, term33675.getClass(), "tagName", "");
        setBooleanField(term33675, term33675.getClass(), "isBlock", false);
        setBooleanField(term33675, term33675.getClass(), "formatAsBlock", false);
        setBooleanField(term33675, term33675.getClass(), "canContainInline", false);
        setBooleanField(term33675, term33675.getClass(), "empty", false);
        setBooleanField(term33675, term33675.getClass(), "selfClosing", true);
        setBooleanField(term33675, term33675.getClass(), "preserveWhitespace", true);
        setBooleanField(term33675, term33675.getClass(), "formList", false);
        setBooleanField(term33675, term33675.getClass(), "formSubmit", true);
        term33782 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term33782, term33782.getClass(), "tagName", "");
        setBooleanField(term33782, term33782.getClass(), "isBlock", false);
        setBooleanField(term33782, term33782.getClass(), "formatAsBlock", false);
        setBooleanField(term33782, term33782.getClass(), "canContainInline", false);
        setBooleanField(term33782, term33782.getClass(), "empty", false);
        setBooleanField(term33782, term33782.getClass(), "selfClosing", true);
        setBooleanField(term33782, term33782.getClass(), "preserveWhitespace", true);
        setBooleanField(term33782, term33782.getClass(), "formList", false);
        setBooleanField(term33782, term33782.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term33675, args);
        assertTrue(recursiveEquals(term33675, term33782));
        assertTrue(recursiveEquals(retValue, 30753));
    }

};


