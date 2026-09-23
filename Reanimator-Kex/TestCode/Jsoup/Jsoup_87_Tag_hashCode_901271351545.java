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

public class Tag_hashCode_901271351545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47000;
     Object term47082;

    public Tag_hashCode_901271351545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47000 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term47000, term47000.getClass(), "tagName", "");
        setBooleanField(term47000, term47000.getClass(), "isBlock", true);
        setBooleanField(term47000, term47000.getClass(), "formatAsBlock", false);
        setBooleanField(term47000, term47000.getClass(), "canContainInline", false);
        setBooleanField(term47000, term47000.getClass(), "empty", false);
        setBooleanField(term47000, term47000.getClass(), "selfClosing", true);
        setBooleanField(term47000, term47000.getClass(), "preserveWhitespace", true);
        setBooleanField(term47000, term47000.getClass(), "formList", true);
        term47082 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term47082, term47082.getClass(), "tagName", "");
        setBooleanField(term47082, term47082.getClass(), "isBlock", true);
        setBooleanField(term47082, term47082.getClass(), "formatAsBlock", false);
        setBooleanField(term47082, term47082.getClass(), "canContainInline", false);
        setBooleanField(term47082, term47082.getClass(), "empty", false);
        setBooleanField(term47082, term47082.getClass(), "selfClosing", true);
        setBooleanField(term47082, term47082.getClass(), "preserveWhitespace", true);
        setBooleanField(term47082, term47082.getClass(), "formList", true);
        setBooleanField(term47082, term47082.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term47000, args);
        assertTrue(recursiveEquals(term47000, term47082));
        assertTrue(recursiveEquals(retValue, 1742841118));
    }

};


