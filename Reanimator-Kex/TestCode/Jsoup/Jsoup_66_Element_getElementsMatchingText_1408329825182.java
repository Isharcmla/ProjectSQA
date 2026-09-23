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

public class Element_getElementsMatchingText_1408329825182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5868;
     Object term35556;
     Object term35540;

    public Element_getElementsMatchingText_1408329825182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5894 = new ArrayList();
        ((ArrayList) term5894).add((Object)null);
        ((ArrayList) term5894).add((Object)null);
        term5868 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5869 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5890 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term5891 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term5892 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term5898 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term5900 = (Object[]) newArray("java.lang.String", 0);
        Object[] term5901 = (Object[]) newArray("java.lang.String", 0);
        setField(term5869, term5869.getClass(), "tagName", "OqbwYQfvAe");
        setBooleanField(term5869, term5869.getClass(), "isBlock", true);
        setBooleanField(term5869, term5869.getClass(), "formatAsBlock", true);
        setBooleanField(term5869, term5869.getClass(), "canContainInline", true);
        setBooleanField(term5869, term5869.getClass(), "empty", true);
        setBooleanField(term5869, term5869.getClass(), "selfClosing", true);
        setBooleanField(term5869, term5869.getClass(), "preserveWhitespace", true);
        setBooleanField(term5869, term5869.getClass(), "formList", true);
        setBooleanField(term5869, term5869.getClass(), "formSubmit", true);
        setField(term5868, term5868.getClass(), "tag", term5869);
        setField(term5890, term5890.getClass(), "referent", null);
        setField(term5891, term5891.getClass(), "lock", term5892);
        setField(term5891, term5891.getClass(), "head", null);
        setLongField(term5891, term5891.getClass(), "queueLength", 41775768178052008L);
        setField(term5890, term5890.getClass(), "queue", term5891);
        setField(term5890, term5890.getClass(), "next", null);
        setField(term5890, term5890.getClass(), "discovered", null);
        setField(term5868, term5868.getClass(), "shadowChildrenRef", term5890);
        setField(term5868, term5868.getClass(), "childNodes", term5894);
        setIntField(term5898, term5898.getClass(), "size", -1896376975);
        setField(term5898, term5898.getClass(), "keys", term5900);
        setField(term5898, term5898.getClass(), "vals", term5901);
        setField(term5868, term5868.getClass(), "attributes", term5898);
        setField(term5868, term5868.getClass(), "baseUri", "tRxZafjqIx");
        setField(term5868, term5868.getClass(), "parentNode", null);
        setIntField(term5868, term5868.getClass(), "siblingIndex", 729658803);
        ArrayList term35563 = new ArrayList();
        ((ArrayList) term35563).add((Object)null);
        ((ArrayList) term35563).add((Object)null);
        term35556 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term35557 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term35560 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term35561 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term35562 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term35565 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term35566 = (Object[]) newArray("java.lang.String", 0);
        Object[] term35567 = (Object[]) newArray("java.lang.String", 0);
        setField(term35557, term35557.getClass(), "tagName", "OqbwYQfvAe");
        setBooleanField(term35557, term35557.getClass(), "isBlock", true);
        setBooleanField(term35557, term35557.getClass(), "formatAsBlock", true);
        setBooleanField(term35557, term35557.getClass(), "canContainInline", true);
        setBooleanField(term35557, term35557.getClass(), "empty", true);
        setBooleanField(term35557, term35557.getClass(), "selfClosing", true);
        setBooleanField(term35557, term35557.getClass(), "preserveWhitespace", true);
        setBooleanField(term35557, term35557.getClass(), "formList", true);
        setBooleanField(term35557, term35557.getClass(), "formSubmit", true);
        setField(term35556, term35556.getClass(), "tag", term35557);
        setField(term35560, term35560.getClass(), "referent", null);
        setField(term35561, term35561.getClass(), "lock", term35562);
        setField(term35561, term35561.getClass(), "head", null);
        setLongField(term35561, term35561.getClass(), "queueLength", 41775768178052008L);
        setField(term35560, term35560.getClass(), "queue", term35561);
        setField(term35560, term35560.getClass(), "next", null);
        setField(term35560, term35560.getClass(), "discovered", null);
        setField(term35556, term35556.getClass(), "shadowChildrenRef", term35560);
        setField(term35556, term35556.getClass(), "childNodes", term35563);
        setIntField(term35565, term35565.getClass(), "size", -1896376975);
        setField(term35565, term35565.getClass(), "keys", term35566);
        setField(term35565, term35565.getClass(), "vals", term35567);
        setField(term35556, term35556.getClass(), "attributes", term35565);
        setField(term35556, term35556.getClass(), "baseUri", "tRxZafjqIx");
        setField(term35556, term35556.getClass(), "parentNode", null);
        setIntField(term35556, term35556.getClass(), "siblingIndex", 729658803);
        term35540 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term35541 = (Object[]) newArray("java.lang.Object", 0);
        setField(term35540, term35540.getClass(), "elementData", term35541);
        setIntField(term35540, term35540.getClass(), "size", 0);
        setIntField(term35540, term35540.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "DhjNLmRMCu";
        Object retValue = callMethod(klass, "getElementsMatchingText", argTypes, term5868, args);
        assertTrue(recursiveEquals(term5868, term35556));
        assertTrue(recursiveEquals(retValue, term35540));
    }

};


