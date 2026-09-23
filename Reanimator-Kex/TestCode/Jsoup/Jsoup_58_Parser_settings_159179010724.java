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

public class Parser_settings_159179010724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101;
     Object term110;
     Object term1158;
     Object term1163;
     Object term1148;

    public Parser_settings_159179010724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term103 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term107 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setField(term101, term101.getClass(), "treeBuilder", null);
        setIntField(term101, term101.getClass(), "maxErrors", 1585847225);
        setIntField(term103, term103.getClass(), "maxSize", 0);
        setField(term103, term103.getClass(), "elementData", null);
        setIntField(term103, term103.getClass(), "size", 0);
        setIntField(term103, term103.getClass(), "modCount", 0);
        setField(term101, term101.getClass(), "errors", term103);
        setBooleanField(term107, term107.getClass(), "preserveTagCase", false);
        setBooleanField(term107, term107.getClass(), "preserveAttributeCase", true);
        setField(term101, term101.getClass(), "settings", term107);
        term110 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term110, term110.getClass(), "preserveTagCase", false);
        setBooleanField(term110, term110.getClass(), "preserveAttributeCase", false);
        term1158 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term1160 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term1161 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setField(term1158, term1158.getClass(), "treeBuilder", null);
        setIntField(term1158, term1158.getClass(), "maxErrors", 1585847225);
        setIntField(term1160, term1160.getClass(), "maxSize", 0);
        setField(term1160, term1160.getClass(), "elementData", null);
        setIntField(term1160, term1160.getClass(), "size", 0);
        setIntField(term1160, term1160.getClass(), "modCount", 0);
        setField(term1158, term1158.getClass(), "errors", term1160);
        setBooleanField(term1161, term1161.getClass(), "preserveTagCase", false);
        setBooleanField(term1161, term1161.getClass(), "preserveAttributeCase", false);
        setField(term1158, term1158.getClass(), "settings", term1161);
        term1163 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term1163, term1163.getClass(), "preserveTagCase", false);
        setBooleanField(term1163, term1163.getClass(), "preserveAttributeCase", false);
        term1148 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term1150 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term1154 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setField(term1148, term1148.getClass(), "treeBuilder", null);
        setIntField(term1148, term1148.getClass(), "maxErrors", 1585847225);
        setIntField(term1150, term1150.getClass(), "maxSize", 0);
        setField(term1150, term1150.getClass(), "elementData", null);
        setIntField(term1150, term1150.getClass(), "size", 0);
        setIntField(term1150, term1150.getClass(), "modCount", 0);
        setField(term1148, term1148.getClass(), "errors", term1150);
        setBooleanField(term1154, term1154.getClass(), "preserveTagCase", false);
        setBooleanField(term1154, term1154.getClass(), "preserveAttributeCase", false);
        setField(term1148, term1148.getClass(), "settings", term1154);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.ParseSettings");
        Object[] args = new Object[1];
        args[0] = term110;
        Object retValue = callMethod(klass, "settings", argTypes, term101, args);
        assertTrue(recursiveEquals(term101, term1158));
        assertTrue(recursiveEquals(term110, term1163));
        assertTrue(recursiveEquals(retValue, term1148));
    }

};


