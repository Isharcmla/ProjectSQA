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

public class Tag_isData_3380753651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7057;
     Object term7069;

    public Tag_isData_3380753651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7057 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setBooleanField(term7057, term7057.getClass(), "canContainInline", false);
        term7069 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term7069, term7069.getClass(), "tagName", null);
        setBooleanField(term7069, term7069.getClass(), "isBlock", false);
        setBooleanField(term7069, term7069.getClass(), "canContainBlock", false);
        setBooleanField(term7069, term7069.getClass(), "canContainInline", false);
        setBooleanField(term7069, term7069.getClass(), "optionalClosing", false);
        setBooleanField(term7069, term7069.getClass(), "empty", false);
        setBooleanField(term7069, term7069.getClass(), "preserveWhitespace", false);
        setField(term7069, term7069.getClass(), "ancestors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tag");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isData", argTypes, term7057, args);
        assertTrue(recursiveEquals(term7057, term7069));
        assertTrue(recursiveEquals(retValue, true));
    }

};


