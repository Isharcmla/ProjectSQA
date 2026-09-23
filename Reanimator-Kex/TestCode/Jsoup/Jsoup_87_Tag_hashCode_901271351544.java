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

public class Tag_hashCode_901271351544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46856;
     Object term47059;

    public Tag_hashCode_901271351544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46856 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term46856, term46856.getClass(), "tagName", "");
        setBooleanField(term46856, term46856.getClass(), "isBlock", true);
        setBooleanField(term46856, term46856.getClass(), "formatAsBlock", true);
        setBooleanField(term46856, term46856.getClass(), "canContainInline", false);
        setBooleanField(term46856, term46856.getClass(), "empty", true);
        setBooleanField(term46856, term46856.getClass(), "selfClosing", true);
        setBooleanField(term46856, term46856.getClass(), "preserveWhitespace", false);
        setBooleanField(term46856, term46856.getClass(), "formList", true);
        setBooleanField(term46856, term46856.getClass(), "formSubmit", true);
        term47059 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term47059, term47059.getClass(), "tagName", "");
        setBooleanField(term47059, term47059.getClass(), "isBlock", true);
        setBooleanField(term47059, term47059.getClass(), "formatAsBlock", true);
        setBooleanField(term47059, term47059.getClass(), "canContainInline", false);
        setBooleanField(term47059, term47059.getClass(), "empty", true);
        setBooleanField(term47059, term47059.getClass(), "selfClosing", true);
        setBooleanField(term47059, term47059.getClass(), "preserveWhitespace", false);
        setBooleanField(term47059, term47059.getClass(), "formList", true);
        setBooleanField(term47059, term47059.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term46856, args);
        assertTrue(recursiveEquals(term46856, term47059));
        assertTrue(recursiveEquals(retValue, -1663699936));
    }

};


