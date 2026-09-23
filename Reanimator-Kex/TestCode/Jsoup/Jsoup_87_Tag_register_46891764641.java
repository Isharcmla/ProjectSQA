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

public class Tag_register_46891764641 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term589;
     Object term1822;

    public Tag_register_46891764641() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term589 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term589, term589.getClass(), "tagName", "hNxWaHcfhY");
        setBooleanField(term589, term589.getClass(), "isBlock", true);
        setBooleanField(term589, term589.getClass(), "formatAsBlock", false);
        setBooleanField(term589, term589.getClass(), "canContainInline", false);
        setBooleanField(term589, term589.getClass(), "empty", true);
        setBooleanField(term589, term589.getClass(), "selfClosing", false);
        setBooleanField(term589, term589.getClass(), "preserveWhitespace", true);
        setBooleanField(term589, term589.getClass(), "formList", false);
        setBooleanField(term589, term589.getClass(), "formSubmit", false);
        term1822 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1822, term1822.getClass(), "tagName", "hNxWaHcfhY");
        setBooleanField(term1822, term1822.getClass(), "isBlock", true);
        setBooleanField(term1822, term1822.getClass(), "formatAsBlock", false);
        setBooleanField(term1822, term1822.getClass(), "canContainInline", false);
        setBooleanField(term1822, term1822.getClass(), "empty", true);
        setBooleanField(term1822, term1822.getClass(), "selfClosing", false);
        setBooleanField(term1822, term1822.getClass(), "preserveWhitespace", true);
        setBooleanField(term1822, term1822.getClass(), "formList", false);
        setBooleanField(term1822, term1822.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        Object[] args = new Object[1];
        args[0] = term589;
        callMethod(klass, "register", argTypes, null, args);
        assertTrue(recursiveEquals(term589, term1822));
    }

};


