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

public class Element_getElementsByClass_1506017604169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4185;
     Object term245529;
     Object term245525;

    public Element_getElementsByClass_1506017604169() {
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
        setBooleanField(term4186, term4186.getClass(), "isBlock", true);
        setBooleanField(term4186, term4186.getClass(), "formatAsBlock", true);
        setBooleanField(term4186, term4186.getClass(), "canContainInline", false);
        setBooleanField(term4186, term4186.getClass(), "empty", false);
        setBooleanField(term4186, term4186.getClass(), "selfClosing", true);
        setBooleanField(term4186, term4186.getClass(), "preserveWhitespace", true);
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
        ArrayList term245536 = new ArrayList();
        term245529 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term245530 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term245533 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term245534 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term245535 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term245538 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term245539 = (Object[]) newArray("java.lang.String", 0);
        Object[] term245540 = (Object[]) newArray("java.lang.String", 0);
        setField(term245530, term245530.getClass(), "tagName", "wfaXBpWAUH");
        setBooleanField(term245530, term245530.getClass(), "isBlock", true);
        setBooleanField(term245530, term245530.getClass(), "formatAsBlock", true);
        setBooleanField(term245530, term245530.getClass(), "canContainInline", false);
        setBooleanField(term245530, term245530.getClass(), "empty", false);
        setBooleanField(term245530, term245530.getClass(), "selfClosing", true);
        setBooleanField(term245530, term245530.getClass(), "preserveWhitespace", true);
        setBooleanField(term245530, term245530.getClass(), "formList", false);
        setBooleanField(term245530, term245530.getClass(), "formSubmit", true);
        setField(term245529, term245529.getClass(), "tag", term245530);
        setField(term245533, term245533.getClass(), "referent", null);
        setField(term245534, term245534.getClass(), "lock", term245535);
        setField(term245534, term245534.getClass(), "head", null);
        setLongField(term245534, term245534.getClass(), "queueLength", -7738503207562305297L);
        setField(term245533, term245533.getClass(), "queue", term245534);
        setField(term245533, term245533.getClass(), "next", null);
        setField(term245533, term245533.getClass(), "discovered", null);
        setField(term245529, term245529.getClass(), "shadowChildrenRef", term245533);
        setField(term245529, term245529.getClass(), "childNodes", term245536);
        setIntField(term245538, term245538.getClass(), "size", -893623680);
        setField(term245538, term245538.getClass(), "keys", term245539);
        setField(term245538, term245538.getClass(), "vals", term245540);
        setField(term245529, term245529.getClass(), "attributes", term245538);
        setField(term245529, term245529.getClass(), "baseUri", "VMeAzAHwZj");
        setField(term245529, term245529.getClass(), "parentNode", null);
        setIntField(term245529, term245529.getClass(), "siblingIndex", -1963434938);
        term245525 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term245526 = (Object[]) newArray("java.lang.Object", 0);
        setField(term245525, term245525.getClass(), "elementData", term245526);
        setIntField(term245525, term245525.getClass(), "size", 0);
        setIntField(term245525, term245525.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PznxWXsZME";
        Object retValue = callMethod(klass, "getElementsByClass", argTypes, term4185, args);
        assertTrue(recursiveEquals(term4185, term245529));
        assertTrue(recursiveEquals(retValue, term245525));
    }

};


