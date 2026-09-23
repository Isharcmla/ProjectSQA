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

public class Tag_hashCode_901271351444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38401;
     Object term38580;

    public Tag_hashCode_901271351444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38401 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term38401, term38401.getClass(), "tagName", "");
        setBooleanField(term38401, term38401.getClass(), "isBlock", true);
        setBooleanField(term38401, term38401.getClass(), "formatAsBlock", false);
        setBooleanField(term38401, term38401.getClass(), "canContainInline", false);
        setBooleanField(term38401, term38401.getClass(), "empty", true);
        setBooleanField(term38401, term38401.getClass(), "selfClosing", false);
        setBooleanField(term38401, term38401.getClass(), "preserveWhitespace", true);
        setBooleanField(term38401, term38401.getClass(), "formList", true);
        setBooleanField(term38401, term38401.getClass(), "formSubmit", true);
        term38580 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term38580, term38580.getClass(), "tagName", "");
        setBooleanField(term38580, term38580.getClass(), "isBlock", true);
        setBooleanField(term38580, term38580.getClass(), "formatAsBlock", false);
        setBooleanField(term38580, term38580.getClass(), "canContainInline", false);
        setBooleanField(term38580, term38580.getClass(), "empty", true);
        setBooleanField(term38580, term38580.getClass(), "selfClosing", false);
        setBooleanField(term38580, term38580.getClass(), "preserveWhitespace", true);
        setBooleanField(term38580, term38580.getClass(), "formList", true);
        setBooleanField(term38580, term38580.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term38401, args);
        assertTrue(recursiveEquals(term38401, term38580));
        assertTrue(recursiveEquals(retValue, 1743734849));
    }

};


