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

public class Element_init_977934890112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;
     Object term56;
     Object term56158;
     Object term56168;
     Object term56173;

    public Element_init_977934890112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term23, term23.getClass(), "tagName", "sjlJAEtRrb");
        setBooleanField(term23, term23.getClass(), "isBlock", false);
        setBooleanField(term23, term23.getClass(), "formatAsBlock", false);
        setBooleanField(term23, term23.getClass(), "canContainInline", false);
        setBooleanField(term23, term23.getClass(), "empty", false);
        setBooleanField(term23, term23.getClass(), "selfClosing", true);
        setBooleanField(term23, term23.getClass(), "preserveWhitespace", true);
        setBooleanField(term23, term23.getClass(), "formList", true);
        setBooleanField(term23, term23.getClass(), "formSubmit", true);
        term56 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term58 = (Object[]) newArray("java.lang.String", 0);
        Object[] term59 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term56, term56.getClass(), "size", 568599855);
        setField(term56, term56.getClass(), "keys", term58);
        setField(term56, term56.getClass(), "vals", term59);
        term56158 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term56159 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term56162 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term56163 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term56164 = (Object[]) newArray("java.lang.String", 0);
        Object[] term56165 = (Object[]) newArray("java.lang.String", 0);
        setField(term56159, term56159.getClass(), "tagName", "sjlJAEtRrb");
        setBooleanField(term56159, term56159.getClass(), "isBlock", false);
        setBooleanField(term56159, term56159.getClass(), "formatAsBlock", false);
        setBooleanField(term56159, term56159.getClass(), "canContainInline", false);
        setBooleanField(term56159, term56159.getClass(), "empty", false);
        setBooleanField(term56159, term56159.getClass(), "selfClosing", true);
        setBooleanField(term56159, term56159.getClass(), "preserveWhitespace", true);
        setBooleanField(term56159, term56159.getClass(), "formList", true);
        setBooleanField(term56159, term56159.getClass(), "formSubmit", true);
        setField(term56158, term56158.getClass(), "tag", term56159);
        setField(term56158, term56158.getClass(), "shadowChildrenRef", null);
        setIntField(term56162, term56162.getClass(), "modCount", 0);
        setField(term56158, term56158.getClass(), "childNodes", term56162);
        setIntField(term56163, term56163.getClass(), "size", 568599855);
        setField(term56163, term56163.getClass(), "keys", term56164);
        setField(term56163, term56163.getClass(), "vals", term56165);
        setField(term56158, term56158.getClass(), "attributes", term56163);
        setField(term56158, term56158.getClass(), "baseUri", "MuLcgQHgqz");
        setField(term56158, term56158.getClass(), "parentNode", null);
        setIntField(term56158, term56158.getClass(), "siblingIndex", 0);
        term56168 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term56168, term56168.getClass(), "tagName", "sjlJAEtRrb");
        setBooleanField(term56168, term56168.getClass(), "isBlock", false);
        setBooleanField(term56168, term56168.getClass(), "formatAsBlock", false);
        setBooleanField(term56168, term56168.getClass(), "canContainInline", false);
        setBooleanField(term56168, term56168.getClass(), "empty", false);
        setBooleanField(term56168, term56168.getClass(), "selfClosing", true);
        setBooleanField(term56168, term56168.getClass(), "preserveWhitespace", true);
        setBooleanField(term56168, term56168.getClass(), "formList", true);
        setBooleanField(term56168, term56168.getClass(), "formSubmit", true);
        term56173 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term56174 = (Object[]) newArray("java.lang.String", 0);
        Object[] term56175 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term56173, term56173.getClass(), "size", 568599855);
        setField(term56173, term56173.getClass(), "keys", term56174);
        setField(term56173, term56173.getClass(), "vals", term56175);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("org.jsoup.nodes.Attributes");
        Object[] args = new Object[3];
        args[0] = term23;
        args[1] = "MuLcgQHgqz";
        args[2] = term56;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term56158));
        assertTrue(recursiveEquals(term23, term56168));
        assertTrue(recursiveEquals(term56, term56173));
    }

};


