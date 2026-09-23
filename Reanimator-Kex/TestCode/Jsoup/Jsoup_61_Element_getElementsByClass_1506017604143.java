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

public class Element_getElementsByClass_1506017604143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3523;
     Object term23469;
     Object term23465;

    public Element_getElementsByClass_1506017604143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3545 = new ArrayList();
        ((ArrayList) term3545).add((Object)null);
        ((ArrayList) term3545).add((Object)null);
        ((ArrayList) term3545).add((Object)null);
        ((ArrayList) term3545).add((Object)null);
        LinkedHashMap term3550 = new LinkedHashMap();
        term3523 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3524 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3549 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3524, term3524.getClass(), "tagName", "UKAReurpHG");
        setBooleanField(term3524, term3524.getClass(), "isBlock", false);
        setBooleanField(term3524, term3524.getClass(), "formatAsBlock", true);
        setBooleanField(term3524, term3524.getClass(), "canContainInline", false);
        setBooleanField(term3524, term3524.getClass(), "empty", false);
        setBooleanField(term3524, term3524.getClass(), "selfClosing", true);
        setBooleanField(term3524, term3524.getClass(), "preserveWhitespace", false);
        setBooleanField(term3524, term3524.getClass(), "formList", false);
        setBooleanField(term3524, term3524.getClass(), "formSubmit", true);
        setField(term3523, term3523.getClass(), "tag", term3524);
        setField(term3523, term3523.getClass(), "parentNode", null);
        setField(term3523, term3523.getClass(), "childNodes", term3545);
        setField(term3549, term3549.getClass(), "attributes", term3550);
        setField(term3523, term3523.getClass(), "attributes", term3549);
        setField(term3523, term3523.getClass(), "baseUri", "SIODFGaQhr");
        setIntField(term3523, term3523.getClass(), "siblingIndex", -1016503459);
        ArrayList term23473 = new ArrayList();
        ((ArrayList) term23473).add((Object)null);
        ((ArrayList) term23473).add((Object)null);
        ((ArrayList) term23473).add((Object)null);
        ((ArrayList) term23473).add((Object)null);
        LinkedHashMap term23476 = new LinkedHashMap();
        term23469 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term23470 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term23475 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term23470, term23470.getClass(), "tagName", "UKAReurpHG");
        setBooleanField(term23470, term23470.getClass(), "isBlock", false);
        setBooleanField(term23470, term23470.getClass(), "formatAsBlock", true);
        setBooleanField(term23470, term23470.getClass(), "canContainInline", false);
        setBooleanField(term23470, term23470.getClass(), "empty", false);
        setBooleanField(term23470, term23470.getClass(), "selfClosing", true);
        setBooleanField(term23470, term23470.getClass(), "preserveWhitespace", false);
        setBooleanField(term23470, term23470.getClass(), "formList", false);
        setBooleanField(term23470, term23470.getClass(), "formSubmit", true);
        setField(term23469, term23469.getClass(), "tag", term23470);
        setField(term23469, term23469.getClass(), "parentNode", null);
        setField(term23469, term23469.getClass(), "childNodes", term23473);
        setField(term23475, term23475.getClass(), "attributes", term23476);
        setField(term23469, term23469.getClass(), "attributes", term23475);
        setField(term23469, term23469.getClass(), "baseUri", "SIODFGaQhr");
        setIntField(term23469, term23469.getClass(), "siblingIndex", -1016503459);
        term23465 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term23466 = (Object[]) newArray("java.lang.Object", 0);
        setField(term23465, term23465.getClass(), "elementData", term23466);
        setIntField(term23465, term23465.getClass(), "size", 0);
        setIntField(term23465, term23465.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "qYzsiuXOgS";
        Object retValue = callMethod(klass, "getElementsByClass", argTypes, term3523, args);
        assertTrue(recursiveEquals(term3523, term23469));
        assertTrue(recursiveEquals(retValue, term23465));
    }

};


