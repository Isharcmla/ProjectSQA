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

public class Tag_hashCode_901271351158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12328;
     Object term12529;

    public Tag_hashCode_901271351158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12328 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term12328, term12328.getClass(), "tagName", "");
        setBooleanField(term12328, term12328.getClass(), "isBlock", true);
        setBooleanField(term12328, term12328.getClass(), "formatAsBlock", true);
        setBooleanField(term12328, term12328.getClass(), "canContainBlock", false);
        setBooleanField(term12328, term12328.getClass(), "canContainInline", false);
        setBooleanField(term12328, term12328.getClass(), "empty", false);
        setBooleanField(term12328, term12328.getClass(), "selfClosing", true);
        term12529 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term12529, term12529.getClass(), "tagName", "");
        setBooleanField(term12529, term12529.getClass(), "isBlock", true);
        setBooleanField(term12529, term12529.getClass(), "formatAsBlock", true);
        setBooleanField(term12529, term12529.getClass(), "canContainBlock", false);
        setBooleanField(term12529, term12529.getClass(), "canContainInline", false);
        setBooleanField(term12529, term12529.getClass(), "empty", false);
        setBooleanField(term12529, term12529.getClass(), "selfClosing", true);
        setBooleanField(term12529, term12529.getClass(), "preserveWhitespace", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term12328, args);
        assertTrue(recursiveEquals(term12328, term12529));
        assertTrue(recursiveEquals(retValue, 916132863));
    }

};


