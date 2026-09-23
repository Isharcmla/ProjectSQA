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
import java.lang.Integer;

public class Parser_setTrackErrors_74869549922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81;
     Object term90;
     Object term1133;
     Object term1123;

    public Parser_setTrackErrors_74869549922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term83 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term87 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setField(term81, term81.getClass(), "treeBuilder", null);
        setIntField(term81, term81.getClass(), "maxErrors", -1339778481);
        setIntField(term83, term83.getClass(), "maxSize", 0);
        setField(term83, term83.getClass(), "elementData", null);
        setIntField(term83, term83.getClass(), "size", 0);
        setIntField(term83, term83.getClass(), "modCount", 0);
        setField(term81, term81.getClass(), "errors", term83);
        setBooleanField(term87, term87.getClass(), "preserveTagCase", false);
        setBooleanField(term87, term87.getClass(), "preserveAttributeCase", true);
        setField(term81, term81.getClass(), "settings", term87);
        term90 = new Integer(1725571209);
        term1133 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term1134 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term1135 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setField(term1133, term1133.getClass(), "treeBuilder", null);
        setIntField(term1133, term1133.getClass(), "maxErrors", 1725571209);
        setIntField(term1134, term1134.getClass(), "maxSize", 0);
        setField(term1134, term1134.getClass(), "elementData", null);
        setIntField(term1134, term1134.getClass(), "size", 0);
        setIntField(term1134, term1134.getClass(), "modCount", 0);
        setField(term1133, term1133.getClass(), "errors", term1134);
        setBooleanField(term1135, term1135.getClass(), "preserveTagCase", false);
        setBooleanField(term1135, term1135.getClass(), "preserveAttributeCase", true);
        setField(term1133, term1133.getClass(), "settings", term1135);
        term1123 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term1125 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term1129 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setField(term1123, term1123.getClass(), "treeBuilder", null);
        setIntField(term1123, term1123.getClass(), "maxErrors", 1725571209);
        setIntField(term1125, term1125.getClass(), "maxSize", 0);
        setField(term1125, term1125.getClass(), "elementData", null);
        setIntField(term1125, term1125.getClass(), "size", 0);
        setIntField(term1125, term1125.getClass(), "modCount", 0);
        setField(term1123, term1123.getClass(), "errors", term1125);
        setBooleanField(term1129, term1129.getClass(), "preserveTagCase", false);
        setBooleanField(term1129, term1129.getClass(), "preserveAttributeCase", true);
        setField(term1123, term1123.getClass(), "settings", term1129);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term90;
        Object retValue = callMethod(klass, "setTrackErrors", argTypes, term81, args);
        assertTrue(recursiveEquals(term81, term1133));
        assertTrue(recursiveEquals(term90, 1725571209));
        assertTrue(recursiveEquals(retValue, term1123));
    }

};


