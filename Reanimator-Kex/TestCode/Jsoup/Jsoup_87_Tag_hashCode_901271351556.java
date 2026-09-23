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

public class Tag_hashCode_901271351556 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47880;
     Object term48089;

    public Tag_hashCode_901271351556() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47880 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term47880, term47880.getClass(), "tagName", "");
        setBooleanField(term47880, term47880.getClass(), "isBlock", false);
        setBooleanField(term47880, term47880.getClass(), "formatAsBlock", true);
        setBooleanField(term47880, term47880.getClass(), "canContainInline", false);
        setBooleanField(term47880, term47880.getClass(), "empty", false);
        setBooleanField(term47880, term47880.getClass(), "selfClosing", true);
        setBooleanField(term47880, term47880.getClass(), "preserveWhitespace", true);
        setBooleanField(term47880, term47880.getClass(), "formList", true);
        term48089 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term48089, term48089.getClass(), "tagName", "");
        setBooleanField(term48089, term48089.getClass(), "isBlock", false);
        setBooleanField(term48089, term48089.getClass(), "formatAsBlock", true);
        setBooleanField(term48089, term48089.getClass(), "canContainInline", false);
        setBooleanField(term48089, term48089.getClass(), "empty", false);
        setBooleanField(term48089, term48089.getClass(), "selfClosing", true);
        setBooleanField(term48089, term48089.getClass(), "preserveWhitespace", true);
        setBooleanField(term48089, term48089.getClass(), "formList", true);
        setBooleanField(term48089, term48089.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term47880, args);
        assertTrue(recursiveEquals(term47880, term48089));
        assertTrue(recursiveEquals(retValue, 887534464));
    }

};


