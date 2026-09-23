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

public class Element_init_1205883869108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9448;

    public Element_init_1205883869108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9448 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term9449 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term9452 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term9453 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term9454 = (Object[]) newArray("java.lang.String", 0);
        Object[] term9455 = (Object[]) newArray("java.lang.String", 0);
        setField(term9449, term9449.getClass(), "tagName", "PAEBtnZtTD");
        setBooleanField(term9449, term9449.getClass(), "isBlock", false);
        setBooleanField(term9449, term9449.getClass(), "formatAsBlock", true);
        setBooleanField(term9449, term9449.getClass(), "canContainInline", true);
        setBooleanField(term9449, term9449.getClass(), "empty", false);
        setBooleanField(term9449, term9449.getClass(), "selfClosing", false);
        setBooleanField(term9449, term9449.getClass(), "preserveWhitespace", false);
        setBooleanField(term9449, term9449.getClass(), "formList", false);
        setBooleanField(term9449, term9449.getClass(), "formSubmit", false);
        setField(term9448, term9448.getClass(), "tag", term9449);
        setField(term9448, term9448.getClass(), "shadowChildrenRef", null);
        setIntField(term9452, term9452.getClass(), "modCount", 0);
        setField(term9448, term9448.getClass(), "childNodes", term9452);
        setIntField(term9453, term9453.getClass(), "size", 0);
        setField(term9453, term9453.getClass(), "keys", term9454);
        setField(term9453, term9453.getClass(), "vals", term9455);
        setField(term9448, term9448.getClass(), "attributes", term9453);
        setField(term9448, term9448.getClass(), "baseUri", "");
        setField(term9448, term9448.getClass(), "parentNode", null);
        setIntField(term9448, term9448.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PAEBtnZtTD";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term9448));
    }

};


