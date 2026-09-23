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

public class Tag_hashCode_901271351375 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32447;
     Object term32552;

    public Tag_hashCode_901271351375() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32447 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term32447, term32447.getClass(), "tagName", "");
        setBooleanField(term32447, term32447.getClass(), "isBlock", true);
        setBooleanField(term32447, term32447.getClass(), "formatAsBlock", false);
        setBooleanField(term32447, term32447.getClass(), "canContainInline", true);
        setBooleanField(term32447, term32447.getClass(), "empty", false);
        setBooleanField(term32447, term32447.getClass(), "selfClosing", false);
        setBooleanField(term32447, term32447.getClass(), "preserveWhitespace", true);
        setBooleanField(term32447, term32447.getClass(), "formList", true);
        term32552 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term32552, term32552.getClass(), "tagName", "");
        setBooleanField(term32552, term32552.getClass(), "isBlock", true);
        setBooleanField(term32552, term32552.getClass(), "formatAsBlock", false);
        setBooleanField(term32552, term32552.getClass(), "canContainInline", true);
        setBooleanField(term32552, term32552.getClass(), "empty", false);
        setBooleanField(term32552, term32552.getClass(), "selfClosing", false);
        setBooleanField(term32552, term32552.getClass(), "preserveWhitespace", true);
        setBooleanField(term32552, term32552.getClass(), "formList", true);
        setBooleanField(term32552, term32552.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term32447, args);
        assertTrue(recursiveEquals(term32447, term32552));
        assertTrue(recursiveEquals(retValue, 1771440478));
    }

};


