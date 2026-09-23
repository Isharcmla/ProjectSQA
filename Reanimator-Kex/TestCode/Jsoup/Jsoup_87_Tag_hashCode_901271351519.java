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

public class Tag_hashCode_901271351519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44768;
     Object term44850;

    public Tag_hashCode_901271351519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44768 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term44768, term44768.getClass(), "tagName", "");
        setBooleanField(term44768, term44768.getClass(), "isBlock", true);
        setBooleanField(term44768, term44768.getClass(), "formatAsBlock", false);
        setBooleanField(term44768, term44768.getClass(), "canContainInline", true);
        setBooleanField(term44768, term44768.getClass(), "empty", false);
        setBooleanField(term44768, term44768.getClass(), "selfClosing", true);
        setBooleanField(term44768, term44768.getClass(), "preserveWhitespace", true);
        setBooleanField(term44768, term44768.getClass(), "formList", true);
        setBooleanField(term44768, term44768.getClass(), "formSubmit", true);
        term44850 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term44850, term44850.getClass(), "tagName", "");
        setBooleanField(term44850, term44850.getClass(), "isBlock", true);
        setBooleanField(term44850, term44850.getClass(), "formatAsBlock", false);
        setBooleanField(term44850, term44850.getClass(), "canContainInline", true);
        setBooleanField(term44850, term44850.getClass(), "empty", false);
        setBooleanField(term44850, term44850.getClass(), "selfClosing", true);
        setBooleanField(term44850, term44850.getClass(), "preserveWhitespace", true);
        setBooleanField(term44850, term44850.getClass(), "formList", true);
        setBooleanField(term44850, term44850.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term44768, args);
        assertTrue(recursiveEquals(term44768, term44850));
        assertTrue(recursiveEquals(retValue, 1771470270));
    }

};


