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

public class Tag_hashCode_901271351529 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45669;
     Object term45728;

    public Tag_hashCode_901271351529() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45669 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term45669, term45669.getClass(), "tagName", "");
        setBooleanField(term45669, term45669.getClass(), "isBlock", true);
        setBooleanField(term45669, term45669.getClass(), "formatAsBlock", true);
        setBooleanField(term45669, term45669.getClass(), "canContainInline", true);
        setBooleanField(term45669, term45669.getClass(), "empty", true);
        setBooleanField(term45669, term45669.getClass(), "selfClosing", false);
        setBooleanField(term45669, term45669.getClass(), "preserveWhitespace", false);
        setBooleanField(term45669, term45669.getClass(), "formList", false);
        setBooleanField(term45669, term45669.getClass(), "formSubmit", true);
        term45728 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term45728, term45728.getClass(), "tagName", "");
        setBooleanField(term45728, term45728.getClass(), "isBlock", true);
        setBooleanField(term45728, term45728.getClass(), "formatAsBlock", true);
        setBooleanField(term45728, term45728.getClass(), "canContainInline", true);
        setBooleanField(term45728, term45728.getClass(), "empty", true);
        setBooleanField(term45728, term45728.getClass(), "selfClosing", false);
        setBooleanField(term45728, term45728.getClass(), "preserveWhitespace", false);
        setBooleanField(term45728, term45728.getClass(), "formList", false);
        setBooleanField(term45728, term45728.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term45669, args);
        assertTrue(recursiveEquals(term45669, term45728));
        assertTrue(recursiveEquals(retValue, -1635100607));
    }

};


