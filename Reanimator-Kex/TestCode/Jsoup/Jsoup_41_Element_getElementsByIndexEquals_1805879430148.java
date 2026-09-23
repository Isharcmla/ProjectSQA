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
import java.lang.Integer;

public class Element_getElementsByIndexEquals_1805879430148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4695;
     Object term4747;
     Object term28920;
     Object term28916;

    public Element_getElementsByIndexEquals_1805879430148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4718 = new ArrayList();
        ((ArrayList) term4718).add((Object)null);
        ((ArrayList) term4718).add((Object)null);
        ((ArrayList) term4718).add((Object)null);
        ((ArrayList) term4718).add((Object)null);
        LinkedHashMap term4723 = new LinkedHashMap();
        term4695 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4696 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4722 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term4696, term4696.getClass(), "tagName", "OeQLvhVERT");
        setBooleanField(term4696, term4696.getClass(), "isBlock", true);
        setBooleanField(term4696, term4696.getClass(), "formatAsBlock", false);
        setBooleanField(term4696, term4696.getClass(), "canContainBlock", true);
        setBooleanField(term4696, term4696.getClass(), "canContainInline", true);
        setBooleanField(term4696, term4696.getClass(), "empty", false);
        setBooleanField(term4696, term4696.getClass(), "selfClosing", false);
        setBooleanField(term4696, term4696.getClass(), "preserveWhitespace", true);
        setBooleanField(term4696, term4696.getClass(), "formList", false);
        setBooleanField(term4696, term4696.getClass(), "formSubmit", true);
        setField(term4695, term4695.getClass(), "tag", term4696);
        setField(term4695, term4695.getClass(), "parentNode", null);
        setField(term4695, term4695.getClass(), "childNodes", term4718);
        setField(term4722, term4722.getClass(), "attributes", term4723);
        setField(term4695, term4695.getClass(), "attributes", term4722);
        setField(term4695, term4695.getClass(), "baseUri", "zNFLXMifnS");
        setIntField(term4695, term4695.getClass(), "siblingIndex", -894662986);
        term4747 = new Integer(304775596);
        ArrayList term28924 = new ArrayList();
        ((ArrayList) term28924).add((Object)null);
        ((ArrayList) term28924).add((Object)null);
        ((ArrayList) term28924).add((Object)null);
        ((ArrayList) term28924).add((Object)null);
        LinkedHashMap term28927 = new LinkedHashMap();
        term28920 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term28921 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term28926 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term28921, term28921.getClass(), "tagName", "OeQLvhVERT");
        setBooleanField(term28921, term28921.getClass(), "isBlock", true);
        setBooleanField(term28921, term28921.getClass(), "formatAsBlock", false);
        setBooleanField(term28921, term28921.getClass(), "canContainBlock", true);
        setBooleanField(term28921, term28921.getClass(), "canContainInline", true);
        setBooleanField(term28921, term28921.getClass(), "empty", false);
        setBooleanField(term28921, term28921.getClass(), "selfClosing", false);
        setBooleanField(term28921, term28921.getClass(), "preserveWhitespace", true);
        setBooleanField(term28921, term28921.getClass(), "formList", false);
        setBooleanField(term28921, term28921.getClass(), "formSubmit", true);
        setField(term28920, term28920.getClass(), "tag", term28921);
        setField(term28920, term28920.getClass(), "parentNode", null);
        setField(term28920, term28920.getClass(), "childNodes", term28924);
        setField(term28926, term28926.getClass(), "attributes", term28927);
        setField(term28920, term28920.getClass(), "attributes", term28926);
        setField(term28920, term28920.getClass(), "baseUri", "zNFLXMifnS");
        setIntField(term28920, term28920.getClass(), "siblingIndex", -894662986);
        term28916 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term28917 = (Object[]) newArray("java.lang.Object", 0);
        setField(term28916, term28916.getClass(), "elementData", term28917);
        setIntField(term28916, term28916.getClass(), "size", 0);
        setIntField(term28916, term28916.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term4747;
        Object retValue = callMethod(klass, "getElementsByIndexEquals", argTypes, term4695, args);
        assertTrue(recursiveEquals(term4695, term28920));
        assertTrue(recursiveEquals(term4747, 304775596));
        assertTrue(recursiveEquals(retValue, term28916));
    }

};


