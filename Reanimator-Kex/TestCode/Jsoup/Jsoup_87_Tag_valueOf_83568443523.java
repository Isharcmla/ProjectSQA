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

public class Tag_valueOf_83568443523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66;
     Object term868;
     Object term845;

    public Tag_valueOf_83568443523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term66, term66.getClass(), "preserveTagCase", false);
        setBooleanField(term66, term66.getClass(), "preserveAttributeCase", true);
        term868 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term868, term868.getClass(), "preserveTagCase", false);
        setBooleanField(term868, term868.getClass(), "preserveAttributeCase", true);
        term845 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term845, term845.getClass(), "tagName", "mulcgqhgqz");
        setBooleanField(term845, term845.getClass(), "isBlock", false);
        setBooleanField(term845, term845.getClass(), "formatAsBlock", true);
        setBooleanField(term845, term845.getClass(), "canContainInline", true);
        setBooleanField(term845, term845.getClass(), "empty", false);
        setBooleanField(term845, term845.getClass(), "selfClosing", false);
        setBooleanField(term845, term845.getClass(), "preserveWhitespace", false);
        setBooleanField(term845, term845.getClass(), "formList", false);
        setBooleanField(term845, term845.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("org.jsoup.parser.ParseSettings");
        Object[] args = new Object[2];
        args[0] = "MuLcgQHgqz";
        args[1] = term66;
        Object retValue = callMethod(klass, "valueOf", argTypes, null, args);
        assertTrue(recursiveEquals(term66, term868));
        assertTrue(recursiveEquals(retValue, term845));
    }

};


