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

public class Element_init_977934890109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;
     Object term56;
     Object term9545;
     Object term9555;
     Object term9560;

    public Element_init_977934890109() {
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
        term9545 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term9546 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term9549 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term9550 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term9551 = (Object[]) newArray("java.lang.String", 0);
        Object[] term9552 = (Object[]) newArray("java.lang.String", 0);
        setField(term9546, term9546.getClass(), "tagName", "sjlJAEtRrb");
        setBooleanField(term9546, term9546.getClass(), "isBlock", false);
        setBooleanField(term9546, term9546.getClass(), "formatAsBlock", false);
        setBooleanField(term9546, term9546.getClass(), "canContainInline", false);
        setBooleanField(term9546, term9546.getClass(), "empty", false);
        setBooleanField(term9546, term9546.getClass(), "selfClosing", true);
        setBooleanField(term9546, term9546.getClass(), "preserveWhitespace", true);
        setBooleanField(term9546, term9546.getClass(), "formList", true);
        setBooleanField(term9546, term9546.getClass(), "formSubmit", true);
        setField(term9545, term9545.getClass(), "tag", term9546);
        setField(term9545, term9545.getClass(), "shadowChildrenRef", null);
        setIntField(term9549, term9549.getClass(), "modCount", 0);
        setField(term9545, term9545.getClass(), "childNodes", term9549);
        setIntField(term9550, term9550.getClass(), "size", 568599855);
        setField(term9550, term9550.getClass(), "keys", term9551);
        setField(term9550, term9550.getClass(), "vals", term9552);
        setField(term9545, term9545.getClass(), "attributes", term9550);
        setField(term9545, term9545.getClass(), "baseUri", "MuLcgQHgqz");
        setField(term9545, term9545.getClass(), "parentNode", null);
        setIntField(term9545, term9545.getClass(), "siblingIndex", 0);
        term9555 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term9555, term9555.getClass(), "tagName", "sjlJAEtRrb");
        setBooleanField(term9555, term9555.getClass(), "isBlock", false);
        setBooleanField(term9555, term9555.getClass(), "formatAsBlock", false);
        setBooleanField(term9555, term9555.getClass(), "canContainInline", false);
        setBooleanField(term9555, term9555.getClass(), "empty", false);
        setBooleanField(term9555, term9555.getClass(), "selfClosing", true);
        setBooleanField(term9555, term9555.getClass(), "preserveWhitespace", true);
        setBooleanField(term9555, term9555.getClass(), "formList", true);
        setBooleanField(term9555, term9555.getClass(), "formSubmit", true);
        term9560 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term9561 = (Object[]) newArray("java.lang.String", 0);
        Object[] term9562 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term9560, term9560.getClass(), "size", 568599855);
        setField(term9560, term9560.getClass(), "keys", term9561);
        setField(term9560, term9560.getClass(), "vals", term9562);
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
        assertTrue(recursiveEquals(instance, term9545));
        assertTrue(recursiveEquals(term23, term9555));
        assertTrue(recursiveEquals(term56, term9560));
    }

};


