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

public class Element_getElementsByAttributeValueStarting_1936272380141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3844;
     Object term24798;
     Object term24794;

    public Element_getElementsByAttributeValueStarting_1936272380141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3867 = new ArrayList();
        ((ArrayList) term3867).add((Object)null);
        ((ArrayList) term3867).add((Object)null);
        LinkedHashMap term3872 = new LinkedHashMap();
        term3844 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3845 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3871 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3845, term3845.getClass(), "tagName", "uSUvKAyuvd");
        setBooleanField(term3845, term3845.getClass(), "isBlock", false);
        setBooleanField(term3845, term3845.getClass(), "formatAsBlock", false);
        setBooleanField(term3845, term3845.getClass(), "canContainBlock", false);
        setBooleanField(term3845, term3845.getClass(), "canContainInline", true);
        setBooleanField(term3845, term3845.getClass(), "empty", true);
        setBooleanField(term3845, term3845.getClass(), "selfClosing", false);
        setBooleanField(term3845, term3845.getClass(), "preserveWhitespace", true);
        setBooleanField(term3845, term3845.getClass(), "formList", true);
        setBooleanField(term3845, term3845.getClass(), "formSubmit", false);
        setField(term3844, term3844.getClass(), "tag", term3845);
        setField(term3844, term3844.getClass(), "parentNode", null);
        setField(term3844, term3844.getClass(), "childNodes", term3867);
        setField(term3871, term3871.getClass(), "attributes", term3872);
        setField(term3844, term3844.getClass(), "attributes", term3871);
        setField(term3844, term3844.getClass(), "baseUri", "BwtdjiefJn");
        setIntField(term3844, term3844.getClass(), "siblingIndex", -14890619);
        ArrayList term24802 = new ArrayList();
        ((ArrayList) term24802).add((Object)null);
        ((ArrayList) term24802).add((Object)null);
        LinkedHashMap term24805 = new LinkedHashMap();
        term24798 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term24799 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term24804 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term24799, term24799.getClass(), "tagName", "uSUvKAyuvd");
        setBooleanField(term24799, term24799.getClass(), "isBlock", false);
        setBooleanField(term24799, term24799.getClass(), "formatAsBlock", false);
        setBooleanField(term24799, term24799.getClass(), "canContainBlock", false);
        setBooleanField(term24799, term24799.getClass(), "canContainInline", true);
        setBooleanField(term24799, term24799.getClass(), "empty", true);
        setBooleanField(term24799, term24799.getClass(), "selfClosing", false);
        setBooleanField(term24799, term24799.getClass(), "preserveWhitespace", true);
        setBooleanField(term24799, term24799.getClass(), "formList", true);
        setBooleanField(term24799, term24799.getClass(), "formSubmit", false);
        setField(term24798, term24798.getClass(), "tag", term24799);
        setField(term24798, term24798.getClass(), "parentNode", null);
        setField(term24798, term24798.getClass(), "childNodes", term24802);
        setField(term24804, term24804.getClass(), "attributes", term24805);
        setField(term24798, term24798.getClass(), "attributes", term24804);
        setField(term24798, term24798.getClass(), "baseUri", "BwtdjiefJn");
        setIntField(term24798, term24798.getClass(), "siblingIndex", -14890619);
        term24794 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term24795 = (Object[]) newArray("java.lang.Object", 0);
        setField(term24794, term24794.getClass(), "elementData", term24795);
        setIntField(term24794, term24794.getClass(), "size", 0);
        setIntField(term24794, term24794.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "jDmhBrIoDa";
        args[1] = "SPtPatHeOm";
        Object retValue = callMethod(klass, "getElementsByAttributeValueStarting", argTypes, term3844, args);
        assertTrue(recursiveEquals(term3844, term24798));
        assertTrue(recursiveEquals(retValue, term24794));
    }

};


