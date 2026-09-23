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

public class Element_init_1390623358113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80;
     Object term56287;
     Object term56294;

    public Element_init_1390623358113() {
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
        term56287 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term56288 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term56291 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term56288, term56288.getClass(), "tagName", "xxtlPwDYFs");
        setBooleanField(term56288, term56288.getClass(), "isBlock", false);
        setBooleanField(term56288, term56288.getClass(), "formatAsBlock", true);
        setBooleanField(term56288, term56288.getClass(), "canContainInline", false);
        setBooleanField(term56288, term56288.getClass(), "empty", true);
        setBooleanField(term56288, term56288.getClass(), "selfClosing", false);
        setBooleanField(term56288, term56288.getClass(), "preserveWhitespace", true);
        setBooleanField(term56288, term56288.getClass(), "formList", false);
        setBooleanField(term56288, term56288.getClass(), "formSubmit", false);
        setField(term56287, term56287.getClass(), "tag", term56288);
        setField(term56287, term56287.getClass(), "shadowChildrenRef", null);
        setIntField(term56291, term56291.getClass(), "modCount", 0);
        setField(term56287, term56287.getClass(), "childNodes", term56291);
        setField(term56287, term56287.getClass(), "attributes", null);
        setField(term56287, term56287.getClass(), "baseUri", "jJCZpVmanW");
        setField(term56287, term56287.getClass(), "parentNode", null);
        setIntField(term56287, term56287.getClass(), "siblingIndex", 0);
        term56294 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term56294, term56294.getClass(), "tagName", "xxtlPwDYFs");
        setBooleanField(term56294, term56294.getClass(), "isBlock", false);
        setBooleanField(term56294, term56294.getClass(), "formatAsBlock", true);
        setBooleanField(term56294, term56294.getClass(), "canContainInline", false);
        setBooleanField(term56294, term56294.getClass(), "empty", true);
        setBooleanField(term56294, term56294.getClass(), "selfClosing", false);
        setBooleanField(term56294, term56294.getClass(), "preserveWhitespace", true);
        setBooleanField(term56294, term56294.getClass(), "formList", false);
        setBooleanField(term56294, term56294.getClass(), "formSubmit", false);
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
        assertTrue(recursiveEquals(instance, term56287));
        assertTrue(recursiveEquals(term80, term56294));
    }

};


