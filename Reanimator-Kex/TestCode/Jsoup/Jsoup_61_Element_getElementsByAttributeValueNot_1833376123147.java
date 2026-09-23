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

public class Element_getElementsByAttributeValueNot_1833376123147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3917;
     Object term25659;
     Object term25655;

    public Element_getElementsByAttributeValueNot_1833376123147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3939 = new ArrayList();
        ((ArrayList) term3939).add((Object)null);
        LinkedHashMap term3944 = new LinkedHashMap();
        term3917 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3918 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3943 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3918, term3918.getClass(), "tagName", "SPtPatHeOm");
        setBooleanField(term3918, term3918.getClass(), "isBlock", true);
        setBooleanField(term3918, term3918.getClass(), "formatAsBlock", true);
        setBooleanField(term3918, term3918.getClass(), "canContainInline", true);
        setBooleanField(term3918, term3918.getClass(), "empty", false);
        setBooleanField(term3918, term3918.getClass(), "selfClosing", false);
        setBooleanField(term3918, term3918.getClass(), "preserveWhitespace", false);
        setBooleanField(term3918, term3918.getClass(), "formList", true);
        setBooleanField(term3918, term3918.getClass(), "formSubmit", false);
        setField(term3917, term3917.getClass(), "tag", term3918);
        setField(term3917, term3917.getClass(), "parentNode", null);
        setField(term3917, term3917.getClass(), "childNodes", term3939);
        setField(term3943, term3943.getClass(), "attributes", term3944);
        setField(term3917, term3917.getClass(), "attributes", term3943);
        setField(term3917, term3917.getClass(), "baseUri", "zaloBqlrSo");
        setIntField(term3917, term3917.getClass(), "siblingIndex", 1632125673);
        ArrayList term25662 = new ArrayList();
        ((ArrayList) term25662).add((Object)null);
        LinkedHashMap term25665 = new LinkedHashMap();
        term25659 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term25660 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term25664 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term25660, term25660.getClass(), "tagName", "");
        setBooleanField(term25660, term25660.getClass(), "isBlock", true);
        setBooleanField(term25660, term25660.getClass(), "formatAsBlock", true);
        setBooleanField(term25660, term25660.getClass(), "canContainInline", true);
        setBooleanField(term25660, term25660.getClass(), "empty", false);
        setBooleanField(term25660, term25660.getClass(), "selfClosing", false);
        setBooleanField(term25660, term25660.getClass(), "preserveWhitespace", false);
        setBooleanField(term25660, term25660.getClass(), "formList", true);
        setBooleanField(term25660, term25660.getClass(), "formSubmit", false);
        setField(term25659, term25659.getClass(), "tag", term25660);
        setField(term25659, term25659.getClass(), "parentNode", null);
        setField(term25659, term25659.getClass(), "childNodes", term25662);
        setField(term25664, term25664.getClass(), "attributes", term25665);
        setField(term25659, term25659.getClass(), "attributes", term25664);
        setField(term25659, term25659.getClass(), "baseUri", "zaloBqlrSo");
        setIntField(term25659, term25659.getClass(), "siblingIndex", 1632125673);
        ArrayList term25327 = new ArrayList();
        ((ArrayList) term25327).add((Object)null);
        LinkedHashMap term25332 = new LinkedHashMap();
        term25655 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term25656 = (Object[]) newArray("java.lang.Object", 10);
        Object term25316 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term25317 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term25331 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term25317, term25317.getClass(), "tagName", "");
        setBooleanField(term25317, term25317.getClass(), "isBlock", true);
        setBooleanField(term25317, term25317.getClass(), "formatAsBlock", true);
        setBooleanField(term25317, term25317.getClass(), "canContainInline", true);
        setBooleanField(term25317, term25317.getClass(), "empty", false);
        setBooleanField(term25317, term25317.getClass(), "selfClosing", false);
        setBooleanField(term25317, term25317.getClass(), "preserveWhitespace", false);
        setBooleanField(term25317, term25317.getClass(), "formList", true);
        setBooleanField(term25317, term25317.getClass(), "formSubmit", false);
        setField(term25316, term25316.getClass(), "tag", term25317);
        setField(term25316, term25316.getClass(), "parentNode", null);
        setField(term25316, term25316.getClass(), "childNodes", term25327);
        setField(term25331, term25331.getClass(), "attributes", term25332);
        setField(term25316, term25316.getClass(), "attributes", term25331);
        setField(term25316, term25316.getClass(), "baseUri", "zaloBqlrSo");
        setIntField(term25316, term25316.getClass(), "siblingIndex", 1632125673);
        setElement(term25656, 0, term25316);
        setField(term25655, term25655.getClass(), "elementData", term25656);
        setIntField(term25655, term25655.getClass(), "size", 1);
        setIntField(term25655, term25655.getClass(), "modCount", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "vvoLrMGCoN";
        args[1] = "pXdglvyrQe";
        Object retValue = callMethod(klass, "getElementsByAttributeValueNot", argTypes, term3917, args);
        assertTrue(recursiveEquals(term3917, term25659));
        assertTrue(recursiveEquals(retValue, term25655));
    }

};


