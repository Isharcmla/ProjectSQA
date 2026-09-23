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

public class Tag_hashCode_901271351163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14679;
     Object term14738;

    public Tag_hashCode_901271351163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14679 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term14679, term14679.getClass(), "tagName", "");
        setBooleanField(term14679, term14679.getClass(), "isBlock", false);
        setBooleanField(term14679, term14679.getClass(), "formatAsBlock", false);
        setBooleanField(term14679, term14679.getClass(), "canContainInline", false);
        setBooleanField(term14679, term14679.getClass(), "empty", false);
        setBooleanField(term14679, term14679.getClass(), "selfClosing", false);
        setBooleanField(term14679, term14679.getClass(), "preserveWhitespace", false);
        setBooleanField(term14679, term14679.getClass(), "formList", true);
        term14738 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term14738, term14738.getClass(), "tagName", "");
        setBooleanField(term14738, term14738.getClass(), "isBlock", false);
        setBooleanField(term14738, term14738.getClass(), "formatAsBlock", false);
        setBooleanField(term14738, term14738.getClass(), "canContainInline", false);
        setBooleanField(term14738, term14738.getClass(), "empty", false);
        setBooleanField(term14738, term14738.getClass(), "selfClosing", false);
        setBooleanField(term14738, term14738.getClass(), "preserveWhitespace", false);
        setBooleanField(term14738, term14738.getClass(), "formList", true);
        setBooleanField(term14738, term14738.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term14679, args);
        assertTrue(recursiveEquals(term14679, term14738));
        assertTrue(recursiveEquals(retValue, 31));
    }

};


