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

public class Parser_init_174200682745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17704;
     Object term17714;
     Object term17717;

    public Parser_init_174200682745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term17568 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term17636 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setIntField(term17568, term17568.getClass(), "maxErrors", 0);
        setField(term17568, term17568.getClass(), "treeBuilder", term17636);
        term17704 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        term17714 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term17715 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term17716 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setField(term17715, term17715.getClass(), "reader", null);
        setField(term17715, term17715.getClass(), "tokeniser", null);
        setField(term17715, term17715.getClass(), "doc", null);
        setField(term17715, term17715.getClass(), "stack", null);
        setField(term17715, term17715.getClass(), "baseUri", null);
        setField(term17715, term17715.getClass(), "currentToken", null);
        setField(term17715, term17715.getClass(), "errors", null);
        setField(term17715, term17715.getClass(), "settings", null);
        setField(term17715, term17715.getClass(), "start", null);
        setField(term17715, term17715.getClass(), "end", null);
        setField(term17714, term17714.getClass(), "treeBuilder", term17715);
        setIntField(term17714, term17714.getClass(), "maxErrors", 0);
        setField(term17714, term17714.getClass(), "errors", null);
        setBooleanField(term17716, term17716.getClass(), "preserveTagCase", true);
        setBooleanField(term17716, term17716.getClass(), "preserveAttributeCase", true);
        setField(term17714, term17714.getClass(), "settings", term17716);
        term17717 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term17717, term17717.getClass(), "reader", null);
        setField(term17717, term17717.getClass(), "tokeniser", null);
        setField(term17717, term17717.getClass(), "doc", null);
        setField(term17717, term17717.getClass(), "stack", null);
        setField(term17717, term17717.getClass(), "baseUri", null);
        setField(term17717, term17717.getClass(), "currentToken", null);
        setField(term17717, term17717.getClass(), "errors", null);
        setField(term17717, term17717.getClass(), "settings", null);
        setField(term17717, term17717.getClass(), "start", null);
        setField(term17717, term17717.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.TreeBuilder");
        Object[] args = new Object[1];
        args[0] = term17704;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term17714));
        assertTrue(recursiveEquals(term17704, term17717));
    }

};


