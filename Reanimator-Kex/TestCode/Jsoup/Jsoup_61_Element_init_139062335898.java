package org.jsoup.nodes;

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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.EqualityUtils.*;
import java.lang.Object;

public class Element_init_139062335898 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101;
     Object term8777;
     Object term8787;

    public Element_init_139062335898() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term101, term101.getClass(), "tagName", "SzjVpOQTyS");
        setBooleanField(term101, term101.getClass(), "isBlock", false);
        setBooleanField(term101, term101.getClass(), "formatAsBlock", true);
        setBooleanField(term101, term101.getClass(), "canContainInline", false);
        setBooleanField(term101, term101.getClass(), "empty", true);
        setBooleanField(term101, term101.getClass(), "selfClosing", false);
        setBooleanField(term101, term101.getClass(), "preserveWhitespace", true);
        setBooleanField(term101, term101.getClass(), "formList", false);
        setBooleanField(term101, term101.getClass(), "formSubmit", false);
        term8777 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term8778 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term8781 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term8782 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term8778, term8778.getClass(), "tagName", "SzjVpOQTyS");
        setBooleanField(term8778, term8778.getClass(), "isBlock", false);
        setBooleanField(term8778, term8778.getClass(), "formatAsBlock", true);
        setBooleanField(term8778, term8778.getClass(), "canContainInline", false);
        setBooleanField(term8778, term8778.getClass(), "empty", true);
        setBooleanField(term8778, term8778.getClass(), "selfClosing", false);
        setBooleanField(term8778, term8778.getClass(), "preserveWhitespace", true);
        setBooleanField(term8778, term8778.getClass(), "formList", false);
        setBooleanField(term8778, term8778.getClass(), "formSubmit", false);
        setField(term8777, term8777.getClass(), "tag", term8778);
        setField(term8777, term8777.getClass(), "parentNode", null);
        setIntField(term8781, term8781.getClass(), "modCount", 0);
        setField(term8777, term8777.getClass(), "childNodes", term8781);
        setField(term8782, term8782.getClass(), "attributes", null);
        setField(term8777, term8777.getClass(), "attributes", term8782);
        setField(term8777, term8777.getClass(), "baseUri", "MjGYSRKTNF");
        setIntField(term8777, term8777.getClass(), "siblingIndex", 0);
        term8787 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term8787, term8787.getClass(), "tagName", "SzjVpOQTyS");
        setBooleanField(term8787, term8787.getClass(), "isBlock", false);
        setBooleanField(term8787, term8787.getClass(), "formatAsBlock", true);
        setBooleanField(term8787, term8787.getClass(), "canContainInline", false);
        setBooleanField(term8787, term8787.getClass(), "empty", true);
        setBooleanField(term8787, term8787.getClass(), "selfClosing", false);
        setBooleanField(term8787, term8787.getClass(), "preserveWhitespace", true);
        setBooleanField(term8787, term8787.getClass(), "formList", false);
        setBooleanField(term8787, term8787.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term101;
        args[1] = "MjGYSRKTNF";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term8777));
        assertTrue(recursiveEquals(term101, "MjGYSRKTNF"));
    }

};


