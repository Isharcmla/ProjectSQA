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

public class Tag_register_468917646445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38521;
     Object term38594;

    public Tag_register_468917646445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38521 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term38521, term38521.getClass(), "tagName", "");
        term38594 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term38594, term38594.getClass(), "tagName", "");
        setBooleanField(term38594, term38594.getClass(), "isBlock", false);
        setBooleanField(term38594, term38594.getClass(), "formatAsBlock", false);
        setBooleanField(term38594, term38594.getClass(), "canContainInline", false);
        setBooleanField(term38594, term38594.getClass(), "empty", false);
        setBooleanField(term38594, term38594.getClass(), "selfClosing", false);
        setBooleanField(term38594, term38594.getClass(), "preserveWhitespace", false);
        setBooleanField(term38594, term38594.getClass(), "formList", false);
        setBooleanField(term38594, term38594.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        Object[] args = new Object[1];
        args[0] = term38521;
        callMethod(klass, "register", argTypes, null, args);
        assertTrue(recursiveEquals(term38521, term38594));
    }

};


