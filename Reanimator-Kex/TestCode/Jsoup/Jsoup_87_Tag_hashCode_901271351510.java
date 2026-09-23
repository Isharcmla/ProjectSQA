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

public class Tag_hashCode_901271351510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43901;
     Object term44135;

    public Tag_hashCode_901271351510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43901 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term43901, term43901.getClass(), "tagName", "");
        setBooleanField(term43901, term43901.getClass(), "isBlock", true);
        setBooleanField(term43901, term43901.getClass(), "formatAsBlock", true);
        setBooleanField(term43901, term43901.getClass(), "canContainInline", true);
        setBooleanField(term43901, term43901.getClass(), "empty", true);
        setBooleanField(term43901, term43901.getClass(), "selfClosing", false);
        setBooleanField(term43901, term43901.getClass(), "preserveWhitespace", true);
        term44135 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term44135, term44135.getClass(), "tagName", "");
        setBooleanField(term44135, term44135.getClass(), "isBlock", true);
        setBooleanField(term44135, term44135.getClass(), "formatAsBlock", true);
        setBooleanField(term44135, term44135.getClass(), "canContainInline", true);
        setBooleanField(term44135, term44135.getClass(), "empty", true);
        setBooleanField(term44135, term44135.getClass(), "selfClosing", false);
        setBooleanField(term44135, term44135.getClass(), "preserveWhitespace", true);
        setBooleanField(term44135, term44135.getClass(), "formList", false);
        setBooleanField(term44135, term44135.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term43901, args);
        assertTrue(recursiveEquals(term43901, term44135));
        assertTrue(recursiveEquals(retValue, -1635099647));
    }

};


