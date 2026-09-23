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
import java.util.LinkedHashMap;

public class Element_siblingElements_1319765476134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2837;
     Object term20979;
     Object term20929;

    public Element_siblingElements_1319765476134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2859 = new ArrayList();
        ((ArrayList) term2859).add((Object)null);
        ((ArrayList) term2859).add((Object)null);
        ((ArrayList) term2859).add((Object)null);
        ((ArrayList) term2859).add((Object)null);
        ((ArrayList) term2859).add((Object)null);
        LinkedHashMap term2864 = new LinkedHashMap();
        term2837 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2838 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2863 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2838, term2838.getClass(), "tagName", "XJJNClzHRf");
        setBooleanField(term2838, term2838.getClass(), "isBlock", false);
        setBooleanField(term2838, term2838.getClass(), "formatAsBlock", false);
        setBooleanField(term2838, term2838.getClass(), "canContainInline", false);
        setBooleanField(term2838, term2838.getClass(), "empty", true);
        setBooleanField(term2838, term2838.getClass(), "selfClosing", true);
        setBooleanField(term2838, term2838.getClass(), "preserveWhitespace", true);
        setBooleanField(term2838, term2838.getClass(), "formList", true);
        setBooleanField(term2838, term2838.getClass(), "formSubmit", false);
        setField(term2837, term2837.getClass(), "tag", term2838);
        setField(term2837, term2837.getClass(), "parentNode", null);
        setField(term2837, term2837.getClass(), "childNodes", term2859);
        setField(term2863, term2863.getClass(), "attributes", term2864);
        setField(term2837, term2837.getClass(), "attributes", term2863);
        setField(term2837, term2837.getClass(), "baseUri", "ZkMALXpEAZ");
        setIntField(term2837, term2837.getClass(), "siblingIndex", -469968304);
        ArrayList term20983 = new ArrayList();
        ((ArrayList) term20983).add((Object)null);
        ((ArrayList) term20983).add((Object)null);
        ((ArrayList) term20983).add((Object)null);
        ((ArrayList) term20983).add((Object)null);
        ((ArrayList) term20983).add((Object)null);
        LinkedHashMap term20986 = new LinkedHashMap();
        term20979 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term20980 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term20985 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term20980, term20980.getClass(), "tagName", "XJJNClzHRf");
        setBooleanField(term20980, term20980.getClass(), "isBlock", false);
        setBooleanField(term20980, term20980.getClass(), "formatAsBlock", false);
        setBooleanField(term20980, term20980.getClass(), "canContainInline", false);
        setBooleanField(term20980, term20980.getClass(), "empty", true);
        setBooleanField(term20980, term20980.getClass(), "selfClosing", true);
        setBooleanField(term20980, term20980.getClass(), "preserveWhitespace", true);
        setBooleanField(term20980, term20980.getClass(), "formList", true);
        setBooleanField(term20980, term20980.getClass(), "formSubmit", false);
        setField(term20979, term20979.getClass(), "tag", term20980);
        setField(term20979, term20979.getClass(), "parentNode", null);
        setField(term20979, term20979.getClass(), "childNodes", term20983);
        setField(term20985, term20985.getClass(), "attributes", term20986);
        setField(term20979, term20979.getClass(), "attributes", term20985);
        setField(term20979, term20979.getClass(), "baseUri", "ZkMALXpEAZ");
        setIntField(term20979, term20979.getClass(), "siblingIndex", -469968304);
        term20929 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term20930 = (Object[]) newArray("java.lang.Object", 0);
        setField(term20929, term20929.getClass(), "elementData", term20930);
        setIntField(term20929, term20929.getClass(), "size", 0);
        setIntField(term20929, term20929.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "siblingElements", argTypes, term2837, args);
        assertTrue(recursiveEquals(term2837, term20979));
        assertTrue(recursiveEquals(retValue, term20929));
    }

};


