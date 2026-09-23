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

public class Tag_isFormListed_63516277735 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term402;
     Object term1532;

    public Tag_isFormListed_63516277735() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term402 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term402, term402.getClass(), "tagName", "oVcInYnLWB");
        setBooleanField(term402, term402.getClass(), "isBlock", true);
        setBooleanField(term402, term402.getClass(), "formatAsBlock", false);
        setBooleanField(term402, term402.getClass(), "canContainInline", true);
        setBooleanField(term402, term402.getClass(), "empty", false);
        setBooleanField(term402, term402.getClass(), "selfClosing", true);
        setBooleanField(term402, term402.getClass(), "preserveWhitespace", false);
        setBooleanField(term402, term402.getClass(), "formList", false);
        setBooleanField(term402, term402.getClass(), "formSubmit", true);
        term1532 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1532, term1532.getClass(), "tagName", "oVcInYnLWB");
        setBooleanField(term1532, term1532.getClass(), "isBlock", true);
        setBooleanField(term1532, term1532.getClass(), "formatAsBlock", false);
        setBooleanField(term1532, term1532.getClass(), "canContainInline", true);
        setBooleanField(term1532, term1532.getClass(), "empty", false);
        setBooleanField(term1532, term1532.getClass(), "selfClosing", true);
        setBooleanField(term1532, term1532.getClass(), "preserveWhitespace", false);
        setBooleanField(term1532, term1532.getClass(), "formList", false);
        setBooleanField(term1532, term1532.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isFormListed", argTypes, term402, args);
        assertTrue(recursiveEquals(term402, term1532));
    }

};


