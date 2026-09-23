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

public class Tag_hashCode_901271351321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27916;
     Object term27998;

    public Tag_hashCode_901271351321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27916 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term27916, term27916.getClass(), "tagName", "");
        setBooleanField(term27916, term27916.getClass(), "isBlock", true);
        setBooleanField(term27916, term27916.getClass(), "formatAsBlock", false);
        setBooleanField(term27916, term27916.getClass(), "canContainInline", true);
        setBooleanField(term27916, term27916.getClass(), "empty", false);
        setBooleanField(term27916, term27916.getClass(), "selfClosing", true);
        term27998 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term27998, term27998.getClass(), "tagName", "");
        setBooleanField(term27998, term27998.getClass(), "isBlock", true);
        setBooleanField(term27998, term27998.getClass(), "formatAsBlock", false);
        setBooleanField(term27998, term27998.getClass(), "canContainInline", true);
        setBooleanField(term27998, term27998.getClass(), "empty", false);
        setBooleanField(term27998, term27998.getClass(), "selfClosing", true);
        setBooleanField(term27998, term27998.getClass(), "preserveWhitespace", false);
        setBooleanField(term27998, term27998.getClass(), "formList", false);
        setBooleanField(term27998, term27998.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term27916, args);
        assertTrue(recursiveEquals(term27916, term27998));
        assertTrue(recursiveEquals(retValue, 1771469277));
    }

};


