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
import java.util.ArrayList;

public class Tag_getImplicitParent_1971289308133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27167;
     Object term27232;

    public Tag_getImplicitParent_1971289308133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term27219 = new ArrayList();
        term27167 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term27167, term27167.getClass(), "ancestors", term27219);
        ArrayList term27233 = new ArrayList();
        term27232 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term27232, term27232.getClass(), "tagName", null);
        setBooleanField(term27232, term27232.getClass(), "isBlock", false);
        setBooleanField(term27232, term27232.getClass(), "canContainBlock", false);
        setBooleanField(term27232, term27232.getClass(), "canContainInline", false);
        setBooleanField(term27232, term27232.getClass(), "optionalClosing", false);
        setBooleanField(term27232, term27232.getClass(), "empty", false);
        setBooleanField(term27232, term27232.getClass(), "preserveWhitespace", false);
        setField(term27232, term27232.getClass(), "ancestors", term27233);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getImplicitParent", argTypes, term27167, args);
        assertTrue(recursiveEquals(term27167, term27232));
        assertTrue(recursiveEquals(retValue, null));
    }

};


