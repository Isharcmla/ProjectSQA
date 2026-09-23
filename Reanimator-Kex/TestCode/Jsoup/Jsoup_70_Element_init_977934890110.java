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

public class Element_init_977934890110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;
     Object term56;
     Object term55969;
     Object term55979;
     Object term55984;

    public Element_init_977934890110() {
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
        term55969 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term55970 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term55973 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term55974 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term55975 = (Object[]) newArray("java.lang.String", 0);
        Object[] term55976 = (Object[]) newArray("java.lang.String", 0);
        setField(term55970, term55970.getClass(), "tagName", "sjlJAEtRrb");
        setBooleanField(term55970, term55970.getClass(), "isBlock", false);
        setBooleanField(term55970, term55970.getClass(), "formatAsBlock", false);
        setBooleanField(term55970, term55970.getClass(), "canContainInline", false);
        setBooleanField(term55970, term55970.getClass(), "empty", false);
        setBooleanField(term55970, term55970.getClass(), "selfClosing", true);
        setBooleanField(term55970, term55970.getClass(), "preserveWhitespace", true);
        setBooleanField(term55970, term55970.getClass(), "formList", true);
        setBooleanField(term55970, term55970.getClass(), "formSubmit", true);
        setField(term55969, term55969.getClass(), "tag", term55970);
        setField(term55969, term55969.getClass(), "shadowChildrenRef", null);
        setIntField(term55973, term55973.getClass(), "modCount", 0);
        setField(term55969, term55969.getClass(), "childNodes", term55973);
        setIntField(term55974, term55974.getClass(), "size", 568599855);
        setField(term55974, term55974.getClass(), "keys", term55975);
        setField(term55974, term55974.getClass(), "vals", term55976);
        setField(term55969, term55969.getClass(), "attributes", term55974);
        setField(term55969, term55969.getClass(), "baseUri", "MuLcgQHgqz");
        setField(term55969, term55969.getClass(), "parentNode", null);
        setIntField(term55969, term55969.getClass(), "siblingIndex", 0);
        term55979 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term55979, term55979.getClass(), "tagName", "sjlJAEtRrb");
        setBooleanField(term55979, term55979.getClass(), "isBlock", false);
        setBooleanField(term55979, term55979.getClass(), "formatAsBlock", false);
        setBooleanField(term55979, term55979.getClass(), "canContainInline", false);
        setBooleanField(term55979, term55979.getClass(), "empty", false);
        setBooleanField(term55979, term55979.getClass(), "selfClosing", true);
        setBooleanField(term55979, term55979.getClass(), "preserveWhitespace", true);
        setBooleanField(term55979, term55979.getClass(), "formList", true);
        setBooleanField(term55979, term55979.getClass(), "formSubmit", true);
        term55984 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term55985 = (Object[]) newArray("java.lang.String", 0);
        Object[] term55986 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term55984, term55984.getClass(), "size", 568599855);
        setField(term55984, term55984.getClass(), "keys", term55985);
        setField(term55984, term55984.getClass(), "vals", term55986);
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
        assertTrue(recursiveEquals(instance, term55969));
        assertTrue(recursiveEquals(term23, term55979));
        assertTrue(recursiveEquals(term56, term55984));
    }

};


