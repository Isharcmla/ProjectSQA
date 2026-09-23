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
import java.util.ArrayList;

public class Element_getElementsByClass_1506017604166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4185;
     Object term26894;
     Object term26890;

    public Element_getElementsByClass_1506017604166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4211 = new ArrayList();
        term4185 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4186 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4207 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term4208 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term4209 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term4215 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term4217 = (Object[]) newArray("java.lang.String", 0);
        Object[] term4218 = (Object[]) newArray("java.lang.String", 0);
        setField(term4186, term4186.getClass(), "tagName", "wfaXBpWAUH");
        setBooleanField(term4186, term4186.getClass(), "isBlock", false);
        setBooleanField(term4186, term4186.getClass(), "formatAsBlock", false);
        setBooleanField(term4186, term4186.getClass(), "canContainInline", true);
        setBooleanField(term4186, term4186.getClass(), "empty", true);
        setBooleanField(term4186, term4186.getClass(), "selfClosing", true);
        setBooleanField(term4186, term4186.getClass(), "preserveWhitespace", false);
        setBooleanField(term4186, term4186.getClass(), "formList", false);
        setBooleanField(term4186, term4186.getClass(), "formSubmit", true);
        setField(term4185, term4185.getClass(), "tag", term4186);
        setField(term4207, term4207.getClass(), "referent", null);
        setField(term4208, term4208.getClass(), "lock", term4209);
        setField(term4208, term4208.getClass(), "head", null);
        setLongField(term4208, term4208.getClass(), "queueLength", -7738503207562305297L);
        setField(term4207, term4207.getClass(), "queue", term4208);
        setField(term4207, term4207.getClass(), "next", null);
        setField(term4207, term4207.getClass(), "discovered", null);
        setField(term4185, term4185.getClass(), "shadowChildrenRef", term4207);
        setField(term4185, term4185.getClass(), "childNodes", term4211);
        setIntField(term4215, term4215.getClass(), "size", -893623680);
        setField(term4215, term4215.getClass(), "keys", term4217);
        setField(term4215, term4215.getClass(), "vals", term4218);
        setField(term4185, term4185.getClass(), "attributes", term4215);
        setField(term4185, term4185.getClass(), "baseUri", "VMeAzAHwZj");
        setField(term4185, term4185.getClass(), "parentNode", null);
        setIntField(term4185, term4185.getClass(), "siblingIndex", -1963434938);
        ArrayList term26901 = new ArrayList();
        term26894 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term26895 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term26898 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term26899 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term26900 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term26903 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term26904 = (Object[]) newArray("java.lang.String", 0);
        Object[] term26905 = (Object[]) newArray("java.lang.String", 0);
        setField(term26895, term26895.getClass(), "tagName", "wfaXBpWAUH");
        setBooleanField(term26895, term26895.getClass(), "isBlock", false);
        setBooleanField(term26895, term26895.getClass(), "formatAsBlock", false);
        setBooleanField(term26895, term26895.getClass(), "canContainInline", true);
        setBooleanField(term26895, term26895.getClass(), "empty", true);
        setBooleanField(term26895, term26895.getClass(), "selfClosing", true);
        setBooleanField(term26895, term26895.getClass(), "preserveWhitespace", false);
        setBooleanField(term26895, term26895.getClass(), "formList", false);
        setBooleanField(term26895, term26895.getClass(), "formSubmit", true);
        setField(term26894, term26894.getClass(), "tag", term26895);
        setField(term26898, term26898.getClass(), "referent", null);
        setField(term26899, term26899.getClass(), "lock", term26900);
        setField(term26899, term26899.getClass(), "head", null);
        setLongField(term26899, term26899.getClass(), "queueLength", -7738503207562305297L);
        setField(term26898, term26898.getClass(), "queue", term26899);
        setField(term26898, term26898.getClass(), "next", null);
        setField(term26898, term26898.getClass(), "discovered", null);
        setField(term26894, term26894.getClass(), "shadowChildrenRef", term26898);
        setField(term26894, term26894.getClass(), "childNodes", term26901);
        setIntField(term26903, term26903.getClass(), "size", -893623680);
        setField(term26903, term26903.getClass(), "keys", term26904);
        setField(term26903, term26903.getClass(), "vals", term26905);
        setField(term26894, term26894.getClass(), "attributes", term26903);
        setField(term26894, term26894.getClass(), "baseUri", "VMeAzAHwZj");
        setField(term26894, term26894.getClass(), "parentNode", null);
        setIntField(term26894, term26894.getClass(), "siblingIndex", -1963434938);
        term26890 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term26891 = (Object[]) newArray("java.lang.Object", 0);
        setField(term26890, term26890.getClass(), "elementData", term26891);
        setIntField(term26890, term26890.getClass(), "size", 0);
        setIntField(term26890, term26890.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PznxWXsZME";
        Object retValue = callMethod(klass, "getElementsByClass", argTypes, term4185, args);
        assertTrue(recursiveEquals(term4185, term26894));
        assertTrue(recursiveEquals(retValue, term26890));
    }

};


