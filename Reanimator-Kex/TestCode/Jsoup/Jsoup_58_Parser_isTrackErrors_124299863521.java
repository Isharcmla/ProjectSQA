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
import java.lang.Object;

public class Parser_isTrackErrors_124299863521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72;
     Object term1119;

    public Parser_isTrackErrors_124299863521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term74 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term78 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setField(term72, term72.getClass(), "treeBuilder", null);
        setIntField(term72, term72.getClass(), "maxErrors", -2038273078);
        setIntField(term74, term74.getClass(), "maxSize", 0);
        setField(term74, term74.getClass(), "elementData", null);
        setIntField(term74, term74.getClass(), "size", 0);
        setIntField(term74, term74.getClass(), "modCount", 0);
        setField(term72, term72.getClass(), "errors", term74);
        setBooleanField(term78, term78.getClass(), "preserveTagCase", true);
        setBooleanField(term78, term78.getClass(), "preserveAttributeCase", true);
        setField(term72, term72.getClass(), "settings", term78);
        term1119 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term1120 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term1121 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setField(term1119, term1119.getClass(), "treeBuilder", null);
        setIntField(term1119, term1119.getClass(), "maxErrors", -2038273078);
        setIntField(term1120, term1120.getClass(), "maxSize", 0);
        setField(term1120, term1120.getClass(), "elementData", null);
        setIntField(term1120, term1120.getClass(), "size", 0);
        setIntField(term1120, term1120.getClass(), "modCount", 0);
        setField(term1119, term1119.getClass(), "errors", term1120);
        setBooleanField(term1121, term1121.getClass(), "preserveTagCase", true);
        setBooleanField(term1121, term1121.getClass(), "preserveAttributeCase", true);
        setField(term1119, term1119.getClass(), "settings", term1121);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isTrackErrors", argTypes, term72, args);
        assertTrue(recursiveEquals(term72, term1119));
        assertTrue(recursiveEquals(retValue, false));
    }

};


