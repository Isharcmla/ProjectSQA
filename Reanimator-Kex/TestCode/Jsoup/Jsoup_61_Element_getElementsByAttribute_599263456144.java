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

public class Element_getElementsByAttribute_599263456144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3616;
     Object term24017;
     Object term24013;

    public Element_getElementsByAttribute_599263456144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3638 = new ArrayList();
        LinkedHashMap term3643 = new LinkedHashMap();
        term3616 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3617 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3642 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3617, term3617.getClass(), "tagName", "bxrCBbrrct");
        setBooleanField(term3617, term3617.getClass(), "isBlock", true);
        setBooleanField(term3617, term3617.getClass(), "formatAsBlock", true);
        setBooleanField(term3617, term3617.getClass(), "canContainInline", false);
        setBooleanField(term3617, term3617.getClass(), "empty", true);
        setBooleanField(term3617, term3617.getClass(), "selfClosing", true);
        setBooleanField(term3617, term3617.getClass(), "preserveWhitespace", true);
        setBooleanField(term3617, term3617.getClass(), "formList", false);
        setBooleanField(term3617, term3617.getClass(), "formSubmit", false);
        setField(term3616, term3616.getClass(), "tag", term3617);
        setField(term3616, term3616.getClass(), "parentNode", null);
        setField(term3616, term3616.getClass(), "childNodes", term3638);
        setField(term3642, term3642.getClass(), "attributes", term3643);
        setField(term3616, term3616.getClass(), "attributes", term3642);
        setField(term3616, term3616.getClass(), "baseUri", "doQLHkjpNm");
        setIntField(term3616, term3616.getClass(), "siblingIndex", -1968847291);
        ArrayList term24021 = new ArrayList();
        LinkedHashMap term24024 = new LinkedHashMap();
        term24017 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term24018 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term24023 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term24018, term24018.getClass(), "tagName", "bxrCBbrrct");
        setBooleanField(term24018, term24018.getClass(), "isBlock", true);
        setBooleanField(term24018, term24018.getClass(), "formatAsBlock", true);
        setBooleanField(term24018, term24018.getClass(), "canContainInline", false);
        setBooleanField(term24018, term24018.getClass(), "empty", true);
        setBooleanField(term24018, term24018.getClass(), "selfClosing", true);
        setBooleanField(term24018, term24018.getClass(), "preserveWhitespace", true);
        setBooleanField(term24018, term24018.getClass(), "formList", false);
        setBooleanField(term24018, term24018.getClass(), "formSubmit", false);
        setField(term24017, term24017.getClass(), "tag", term24018);
        setField(term24017, term24017.getClass(), "parentNode", null);
        setField(term24017, term24017.getClass(), "childNodes", term24021);
        setField(term24023, term24023.getClass(), "attributes", term24024);
        setField(term24017, term24017.getClass(), "attributes", term24023);
        setField(term24017, term24017.getClass(), "baseUri", "doQLHkjpNm");
        setIntField(term24017, term24017.getClass(), "siblingIndex", -1968847291);
        term24013 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term24014 = (Object[]) newArray("java.lang.Object", 0);
        setField(term24013, term24013.getClass(), "elementData", term24014);
        setIntField(term24013, term24013.getClass(), "size", 0);
        setIntField(term24013, term24013.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "lCyLIcSuom";
        Object retValue = callMethod(klass, "getElementsByAttribute", argTypes, term3616, args);
        assertTrue(recursiveEquals(term3616, term24017));
        assertTrue(recursiveEquals(retValue, term24013));
    }

};


