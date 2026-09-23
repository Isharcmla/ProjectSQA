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

public class Element_init_1390623358111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80;
     Object term56098;
     Object term56105;

    public Element_init_1390623358111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term80, term80.getClass(), "tagName", "xxtlPwDYFs");
        setBooleanField(term80, term80.getClass(), "isBlock", false);
        setBooleanField(term80, term80.getClass(), "formatAsBlock", true);
        setBooleanField(term80, term80.getClass(), "canContainInline", false);
        setBooleanField(term80, term80.getClass(), "empty", true);
        setBooleanField(term80, term80.getClass(), "selfClosing", false);
        setBooleanField(term80, term80.getClass(), "preserveWhitespace", true);
        setBooleanField(term80, term80.getClass(), "formList", false);
        setBooleanField(term80, term80.getClass(), "formSubmit", false);
        term56098 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term56099 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term56102 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term56099, term56099.getClass(), "tagName", "xxtlPwDYFs");
        setBooleanField(term56099, term56099.getClass(), "isBlock", false);
        setBooleanField(term56099, term56099.getClass(), "formatAsBlock", true);
        setBooleanField(term56099, term56099.getClass(), "canContainInline", false);
        setBooleanField(term56099, term56099.getClass(), "empty", true);
        setBooleanField(term56099, term56099.getClass(), "selfClosing", false);
        setBooleanField(term56099, term56099.getClass(), "preserveWhitespace", true);
        setBooleanField(term56099, term56099.getClass(), "formList", false);
        setBooleanField(term56099, term56099.getClass(), "formSubmit", false);
        setField(term56098, term56098.getClass(), "tag", term56099);
        setField(term56098, term56098.getClass(), "shadowChildrenRef", null);
        setIntField(term56102, term56102.getClass(), "modCount", 0);
        setField(term56098, term56098.getClass(), "childNodes", term56102);
        setField(term56098, term56098.getClass(), "attributes", null);
        setField(term56098, term56098.getClass(), "baseUri", "jJCZpVmanW");
        setField(term56098, term56098.getClass(), "parentNode", null);
        setIntField(term56098, term56098.getClass(), "siblingIndex", 0);
        term56105 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term56105, term56105.getClass(), "tagName", "xxtlPwDYFs");
        setBooleanField(term56105, term56105.getClass(), "isBlock", false);
        setBooleanField(term56105, term56105.getClass(), "formatAsBlock", true);
        setBooleanField(term56105, term56105.getClass(), "canContainInline", false);
        setBooleanField(term56105, term56105.getClass(), "empty", true);
        setBooleanField(term56105, term56105.getClass(), "selfClosing", false);
        setBooleanField(term56105, term56105.getClass(), "preserveWhitespace", true);
        setBooleanField(term56105, term56105.getClass(), "formList", false);
        setBooleanField(term56105, term56105.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term80;
        args[1] = "jJCZpVmanW";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term56098));
        assertTrue(recursiveEquals(term80, term56105));
    }

};


