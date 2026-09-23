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

public class Parser_settings_21251845325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113;
     Object term1170;
     Object term1157;

    public Parser_settings_21251845325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term115 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term119 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setField(term113, term113.getClass(), "treeBuilder", null);
        setIntField(term113, term113.getClass(), "maxErrors", -1685132342);
        setIntField(term115, term115.getClass(), "maxSize", 0);
        setField(term115, term115.getClass(), "elementData", null);
        setIntField(term115, term115.getClass(), "size", 0);
        setIntField(term115, term115.getClass(), "modCount", 0);
        setField(term113, term113.getClass(), "errors", term115);
        setBooleanField(term119, term119.getClass(), "preserveTagCase", true);
        setBooleanField(term119, term119.getClass(), "preserveAttributeCase", true);
        setField(term113, term113.getClass(), "settings", term119);
        term1170 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term1171 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term1172 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setField(term1170, term1170.getClass(), "treeBuilder", null);
        setIntField(term1170, term1170.getClass(), "maxErrors", -1685132342);
        setIntField(term1171, term1171.getClass(), "maxSize", 0);
        setField(term1171, term1171.getClass(), "elementData", null);
        setIntField(term1171, term1171.getClass(), "size", 0);
        setIntField(term1171, term1171.getClass(), "modCount", 0);
        setField(term1170, term1170.getClass(), "errors", term1171);
        setBooleanField(term1172, term1172.getClass(), "preserveTagCase", true);
        setBooleanField(term1172, term1172.getClass(), "preserveAttributeCase", true);
        setField(term1170, term1170.getClass(), "settings", term1172);
        term1157 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term1157, term1157.getClass(), "preserveTagCase", true);
        setBooleanField(term1157, term1157.getClass(), "preserveAttributeCase", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "settings", argTypes, term113, args);
        assertTrue(recursiveEquals(term113, term1170));
        assertTrue(recursiveEquals(retValue, term1157));
    }

};


