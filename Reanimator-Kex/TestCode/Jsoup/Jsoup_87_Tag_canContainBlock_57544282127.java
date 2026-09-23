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

public class Tag_canContainBlock_57544282127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163;
     Object term1151;

    public Tag_canContainBlock_57544282127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term163 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term163, term163.getClass(), "tagName", "SzjVpOQTyS");
        setBooleanField(term163, term163.getClass(), "isBlock", false);
        setBooleanField(term163, term163.getClass(), "formatAsBlock", false);
        setBooleanField(term163, term163.getClass(), "canContainInline", true);
        setBooleanField(term163, term163.getClass(), "empty", true);
        setBooleanField(term163, term163.getClass(), "selfClosing", true);
        setBooleanField(term163, term163.getClass(), "preserveWhitespace", true);
        setBooleanField(term163, term163.getClass(), "formList", true);
        setBooleanField(term163, term163.getClass(), "formSubmit", true);
        term1151 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1151, term1151.getClass(), "tagName", "SzjVpOQTyS");
        setBooleanField(term1151, term1151.getClass(), "isBlock", false);
        setBooleanField(term1151, term1151.getClass(), "formatAsBlock", false);
        setBooleanField(term1151, term1151.getClass(), "canContainInline", true);
        setBooleanField(term1151, term1151.getClass(), "empty", true);
        setBooleanField(term1151, term1151.getClass(), "selfClosing", true);
        setBooleanField(term1151, term1151.getClass(), "preserveWhitespace", true);
        setBooleanField(term1151, term1151.getClass(), "formList", true);
        setBooleanField(term1151, term1151.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "canContainBlock", argTypes, term163, args);
        assertTrue(recursiveEquals(term163, term1151));
    }

};


