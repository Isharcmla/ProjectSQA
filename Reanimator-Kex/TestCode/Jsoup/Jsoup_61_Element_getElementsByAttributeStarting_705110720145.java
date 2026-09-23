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

public class Element_getElementsByAttributeStarting_705110720145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3709;
     Object term24502;
     Object term24498;

    public Element_getElementsByAttributeStarting_705110720145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3731 = new ArrayList();
        ((ArrayList) term3731).add((Object)null);
        ((ArrayList) term3731).add((Object)null);
        ((ArrayList) term3731).add((Object)null);
        ((ArrayList) term3731).add((Object)null);
        ((ArrayList) term3731).add((Object)null);
        ((ArrayList) term3731).add((Object)null);
        ((ArrayList) term3731).add((Object)null);
        LinkedHashMap term3736 = new LinkedHashMap();
        term3709 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3710 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3735 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3710, term3710.getClass(), "tagName", "CGOpQSZZwI");
        setBooleanField(term3710, term3710.getClass(), "isBlock", true);
        setBooleanField(term3710, term3710.getClass(), "formatAsBlock", false);
        setBooleanField(term3710, term3710.getClass(), "canContainInline", false);
        setBooleanField(term3710, term3710.getClass(), "empty", false);
        setBooleanField(term3710, term3710.getClass(), "selfClosing", false);
        setBooleanField(term3710, term3710.getClass(), "preserveWhitespace", true);
        setBooleanField(term3710, term3710.getClass(), "formList", true);
        setBooleanField(term3710, term3710.getClass(), "formSubmit", false);
        setField(term3709, term3709.getClass(), "tag", term3710);
        setField(term3709, term3709.getClass(), "parentNode", null);
        setField(term3709, term3709.getClass(), "childNodes", term3731);
        setField(term3735, term3735.getClass(), "attributes", term3736);
        setField(term3709, term3709.getClass(), "attributes", term3735);
        setField(term3709, term3709.getClass(), "baseUri", "WVbxuoDBcn");
        setIntField(term3709, term3709.getClass(), "siblingIndex", 579005622);
        ArrayList term24506 = new ArrayList();
        ((ArrayList) term24506).add((Object)null);
        ((ArrayList) term24506).add((Object)null);
        ((ArrayList) term24506).add((Object)null);
        ((ArrayList) term24506).add((Object)null);
        ((ArrayList) term24506).add((Object)null);
        ((ArrayList) term24506).add((Object)null);
        ((ArrayList) term24506).add((Object)null);
        LinkedHashMap term24509 = new LinkedHashMap();
        term24502 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term24503 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term24508 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term24503, term24503.getClass(), "tagName", "CGOpQSZZwI");
        setBooleanField(term24503, term24503.getClass(), "isBlock", true);
        setBooleanField(term24503, term24503.getClass(), "formatAsBlock", false);
        setBooleanField(term24503, term24503.getClass(), "canContainInline", false);
        setBooleanField(term24503, term24503.getClass(), "empty", false);
        setBooleanField(term24503, term24503.getClass(), "selfClosing", false);
        setBooleanField(term24503, term24503.getClass(), "preserveWhitespace", true);
        setBooleanField(term24503, term24503.getClass(), "formList", true);
        setBooleanField(term24503, term24503.getClass(), "formSubmit", false);
        setField(term24502, term24502.getClass(), "tag", term24503);
        setField(term24502, term24502.getClass(), "parentNode", null);
        setField(term24502, term24502.getClass(), "childNodes", term24506);
        setField(term24508, term24508.getClass(), "attributes", term24509);
        setField(term24502, term24502.getClass(), "attributes", term24508);
        setField(term24502, term24502.getClass(), "baseUri", "WVbxuoDBcn");
        setIntField(term24502, term24502.getClass(), "siblingIndex", 579005622);
        term24498 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term24499 = (Object[]) newArray("java.lang.Object", 0);
        setField(term24498, term24498.getClass(), "elementData", term24499);
        setIntField(term24498, term24498.getClass(), "size", 0);
        setIntField(term24498, term24498.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "pvDEABOxLt";
        Object retValue = callMethod(klass, "getElementsByAttributeStarting", argTypes, term3709, args);
        assertTrue(recursiveEquals(term3709, term24502));
        assertTrue(recursiveEquals(retValue, term24498));
    }

};


