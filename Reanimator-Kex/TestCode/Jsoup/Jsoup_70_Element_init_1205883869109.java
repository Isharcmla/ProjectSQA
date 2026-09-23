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

public class Element_init_1205883869109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55872;

    public Element_init_1205883869109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55872 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term55873 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term55876 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term55877 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term55878 = (Object[]) newArray("java.lang.String", 0);
        Object[] term55879 = (Object[]) newArray("java.lang.String", 0);
        setField(term55873, term55873.getClass(), "tagName", "PAEBtnZtTD");
        setBooleanField(term55873, term55873.getClass(), "isBlock", false);
        setBooleanField(term55873, term55873.getClass(), "formatAsBlock", true);
        setBooleanField(term55873, term55873.getClass(), "canContainInline", true);
        setBooleanField(term55873, term55873.getClass(), "empty", false);
        setBooleanField(term55873, term55873.getClass(), "selfClosing", false);
        setBooleanField(term55873, term55873.getClass(), "preserveWhitespace", false);
        setBooleanField(term55873, term55873.getClass(), "formList", false);
        setBooleanField(term55873, term55873.getClass(), "formSubmit", false);
        setField(term55872, term55872.getClass(), "tag", term55873);
        setField(term55872, term55872.getClass(), "shadowChildrenRef", null);
        setIntField(term55876, term55876.getClass(), "modCount", 0);
        setField(term55872, term55872.getClass(), "childNodes", term55876);
        setIntField(term55877, term55877.getClass(), "size", 0);
        setField(term55877, term55877.getClass(), "keys", term55878);
        setField(term55877, term55877.getClass(), "vals", term55879);
        setField(term55872, term55872.getClass(), "attributes", term55877);
        setField(term55872, term55872.getClass(), "baseUri", "");
        setField(term55872, term55872.getClass(), "parentNode", null);
        setIntField(term55872, term55872.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PAEBtnZtTD";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term55872));
    }

};


