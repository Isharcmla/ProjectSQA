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

public class Element_getElementsByAttributeValueNot_1833376123140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3728;
     Object term24232;
     Object term24228;

    public Element_getElementsByAttributeValueNot_1833376123140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3751 = new ArrayList();
        ((ArrayList) term3751).add((Object)null);
        ((ArrayList) term3751).add((Object)null);
        ((ArrayList) term3751).add((Object)null);
        ((ArrayList) term3751).add((Object)null);
        ((ArrayList) term3751).add((Object)null);
        ((ArrayList) term3751).add((Object)null);
        ((ArrayList) term3751).add((Object)null);
        LinkedHashMap term3756 = new LinkedHashMap();
        term3728 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3729 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3755 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3729, term3729.getClass(), "tagName", "CGOpQSZZwI");
        setBooleanField(term3729, term3729.getClass(), "isBlock", false);
        setBooleanField(term3729, term3729.getClass(), "formatAsBlock", true);
        setBooleanField(term3729, term3729.getClass(), "canContainBlock", true);
        setBooleanField(term3729, term3729.getClass(), "canContainInline", false);
        setBooleanField(term3729, term3729.getClass(), "empty", false);
        setBooleanField(term3729, term3729.getClass(), "selfClosing", true);
        setBooleanField(term3729, term3729.getClass(), "preserveWhitespace", true);
        setBooleanField(term3729, term3729.getClass(), "formList", true);
        setBooleanField(term3729, term3729.getClass(), "formSubmit", true);
        setField(term3728, term3728.getClass(), "tag", term3729);
        setField(term3728, term3728.getClass(), "parentNode", null);
        setField(term3728, term3728.getClass(), "childNodes", term3751);
        setField(term3755, term3755.getClass(), "attributes", term3756);
        setField(term3728, term3728.getClass(), "attributes", term3755);
        setField(term3728, term3728.getClass(), "baseUri", "WVbxuoDBcn");
        setIntField(term3728, term3728.getClass(), "siblingIndex", 579005622);
        ArrayList term24235 = new ArrayList();
        ((ArrayList) term24235).add((Object)null);
        ((ArrayList) term24235).add((Object)null);
        ((ArrayList) term24235).add((Object)null);
        ((ArrayList) term24235).add((Object)null);
        ((ArrayList) term24235).add((Object)null);
        ((ArrayList) term24235).add((Object)null);
        ((ArrayList) term24235).add((Object)null);
        LinkedHashMap term24238 = new LinkedHashMap();
        term24232 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term24233 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term24237 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term24233, term24233.getClass(), "tagName", "");
        setBooleanField(term24233, term24233.getClass(), "isBlock", false);
        setBooleanField(term24233, term24233.getClass(), "formatAsBlock", true);
        setBooleanField(term24233, term24233.getClass(), "canContainBlock", true);
        setBooleanField(term24233, term24233.getClass(), "canContainInline", false);
        setBooleanField(term24233, term24233.getClass(), "empty", false);
        setBooleanField(term24233, term24233.getClass(), "selfClosing", true);
        setBooleanField(term24233, term24233.getClass(), "preserveWhitespace", true);
        setBooleanField(term24233, term24233.getClass(), "formList", true);
        setBooleanField(term24233, term24233.getClass(), "formSubmit", true);
        setField(term24232, term24232.getClass(), "tag", term24233);
        setField(term24232, term24232.getClass(), "parentNode", null);
        setField(term24232, term24232.getClass(), "childNodes", term24235);
        setField(term24237, term24237.getClass(), "attributes", term24238);
        setField(term24232, term24232.getClass(), "attributes", term24237);
        setField(term24232, term24232.getClass(), "baseUri", "WVbxuoDBcn");
        setIntField(term24232, term24232.getClass(), "siblingIndex", 579005622);
        ArrayList term23904 = new ArrayList();
        ((ArrayList) term23904).add((Object)null);
        ((ArrayList) term23904).add((Object)null);
        ((ArrayList) term23904).add((Object)null);
        ((ArrayList) term23904).add((Object)null);
        ((ArrayList) term23904).add((Object)null);
        ((ArrayList) term23904).add((Object)null);
        ((ArrayList) term23904).add((Object)null);
        LinkedHashMap term23909 = new LinkedHashMap();
        term24228 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term24229 = (Object[]) newArray("java.lang.Object", 10);
        Object term23892 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term23893 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term23908 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term23893, term23893.getClass(), "tagName", "");
        setBooleanField(term23893, term23893.getClass(), "isBlock", false);
        setBooleanField(term23893, term23893.getClass(), "formatAsBlock", true);
        setBooleanField(term23893, term23893.getClass(), "canContainBlock", true);
        setBooleanField(term23893, term23893.getClass(), "canContainInline", false);
        setBooleanField(term23893, term23893.getClass(), "empty", false);
        setBooleanField(term23893, term23893.getClass(), "selfClosing", true);
        setBooleanField(term23893, term23893.getClass(), "preserveWhitespace", true);
        setBooleanField(term23893, term23893.getClass(), "formList", true);
        setBooleanField(term23893, term23893.getClass(), "formSubmit", true);
        setField(term23892, term23892.getClass(), "tag", term23893);
        setField(term23892, term23892.getClass(), "parentNode", null);
        setField(term23892, term23892.getClass(), "childNodes", term23904);
        setField(term23908, term23908.getClass(), "attributes", term23909);
        setField(term23892, term23892.getClass(), "attributes", term23908);
        setField(term23892, term23892.getClass(), "baseUri", "WVbxuoDBcn");
        setIntField(term23892, term23892.getClass(), "siblingIndex", 579005622);
        setElement(term24229, 0, term23892);
        setField(term24228, term24228.getClass(), "elementData", term24229);
        setIntField(term24228, term24228.getClass(), "size", 1);
        setIntField(term24228, term24228.getClass(), "modCount", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "pvDEABOxLt";
        args[1] = "beAMpkroCQ";
        Object retValue = callMethod(klass, "getElementsByAttributeValueNot", argTypes, term3728, args);
        assertTrue(recursiveEquals(term3728, term24232));
        assertTrue(recursiveEquals(retValue, term24228));
    }

};


