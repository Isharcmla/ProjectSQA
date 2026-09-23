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

public class Element_getElementsByAttributeValue_1832587100146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3802;
     Object term25048;
     Object term25044;

    public Element_getElementsByAttributeValue_1832587100146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3824 = new ArrayList();
        ((ArrayList) term3824).add((Object)null);
        ((ArrayList) term3824).add((Object)null);
        LinkedHashMap term3829 = new LinkedHashMap();
        term3802 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3803 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3828 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3803, term3803.getClass(), "tagName", "beAMpkroCQ");
        setBooleanField(term3803, term3803.getClass(), "isBlock", false);
        setBooleanField(term3803, term3803.getClass(), "formatAsBlock", false);
        setBooleanField(term3803, term3803.getClass(), "canContainInline", false);
        setBooleanField(term3803, term3803.getClass(), "empty", false);
        setBooleanField(term3803, term3803.getClass(), "selfClosing", false);
        setBooleanField(term3803, term3803.getClass(), "preserveWhitespace", false);
        setBooleanField(term3803, term3803.getClass(), "formList", false);
        setBooleanField(term3803, term3803.getClass(), "formSubmit", true);
        setField(term3802, term3802.getClass(), "tag", term3803);
        setField(term3802, term3802.getClass(), "parentNode", null);
        setField(term3802, term3802.getClass(), "childNodes", term3824);
        setField(term3828, term3828.getClass(), "attributes", term3829);
        setField(term3802, term3802.getClass(), "attributes", term3828);
        setField(term3802, term3802.getClass(), "baseUri", "bnsyeQXFdu");
        setIntField(term3802, term3802.getClass(), "siblingIndex", -14890619);
        ArrayList term25052 = new ArrayList();
        ((ArrayList) term25052).add((Object)null);
        ((ArrayList) term25052).add((Object)null);
        LinkedHashMap term25055 = new LinkedHashMap();
        term25048 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term25049 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term25054 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term25049, term25049.getClass(), "tagName", "beAMpkroCQ");
        setBooleanField(term25049, term25049.getClass(), "isBlock", false);
        setBooleanField(term25049, term25049.getClass(), "formatAsBlock", false);
        setBooleanField(term25049, term25049.getClass(), "canContainInline", false);
        setBooleanField(term25049, term25049.getClass(), "empty", false);
        setBooleanField(term25049, term25049.getClass(), "selfClosing", false);
        setBooleanField(term25049, term25049.getClass(), "preserveWhitespace", false);
        setBooleanField(term25049, term25049.getClass(), "formList", false);
        setBooleanField(term25049, term25049.getClass(), "formSubmit", true);
        setField(term25048, term25048.getClass(), "tag", term25049);
        setField(term25048, term25048.getClass(), "parentNode", null);
        setField(term25048, term25048.getClass(), "childNodes", term25052);
        setField(term25054, term25054.getClass(), "attributes", term25055);
        setField(term25048, term25048.getClass(), "attributes", term25054);
        setField(term25048, term25048.getClass(), "baseUri", "bnsyeQXFdu");
        setIntField(term25048, term25048.getClass(), "siblingIndex", -14890619);
        term25044 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term25045 = (Object[]) newArray("java.lang.Object", 0);
        setField(term25044, term25044.getClass(), "elementData", term25045);
        setIntField(term25044, term25044.getClass(), "size", 0);
        setIntField(term25044, term25044.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "BwtdjiefJn";
        args[1] = "jDmhBrIoDa";
        Object retValue = callMethod(klass, "getElementsByAttributeValue", argTypes, term3802, args);
        assertTrue(recursiveEquals(term3802, term25048));
        assertTrue(recursiveEquals(retValue, term25044));
    }

};


