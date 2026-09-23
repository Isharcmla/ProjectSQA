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
     Object term24407;
     Object term24403;

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
        ArrayList term24410 = new ArrayList();
        ((ArrayList) term24410).add((Object)null);
        ((ArrayList) term24410).add((Object)null);
        ((ArrayList) term24410).add((Object)null);
        ((ArrayList) term24410).add((Object)null);
        ((ArrayList) term24410).add((Object)null);
        ((ArrayList) term24410).add((Object)null);
        ((ArrayList) term24410).add((Object)null);
        LinkedHashMap term24413 = new LinkedHashMap();
        term24407 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term24408 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term24412 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term24408, term24408.getClass(), "tagName", "");
        setBooleanField(term24408, term24408.getClass(), "isBlock", false);
        setBooleanField(term24408, term24408.getClass(), "formatAsBlock", true);
        setBooleanField(term24408, term24408.getClass(), "canContainBlock", true);
        setBooleanField(term24408, term24408.getClass(), "canContainInline", false);
        setBooleanField(term24408, term24408.getClass(), "empty", false);
        setBooleanField(term24408, term24408.getClass(), "selfClosing", true);
        setBooleanField(term24408, term24408.getClass(), "preserveWhitespace", true);
        setBooleanField(term24408, term24408.getClass(), "formList", true);
        setBooleanField(term24408, term24408.getClass(), "formSubmit", true);
        setField(term24407, term24407.getClass(), "tag", term24408);
        setField(term24407, term24407.getClass(), "parentNode", null);
        setField(term24407, term24407.getClass(), "childNodes", term24410);
        setField(term24412, term24412.getClass(), "attributes", term24413);
        setField(term24407, term24407.getClass(), "attributes", term24412);
        setField(term24407, term24407.getClass(), "baseUri", "WVbxuoDBcn");
        setIntField(term24407, term24407.getClass(), "siblingIndex", 579005622);
        ArrayList term24079 = new ArrayList();
        ((ArrayList) term24079).add((Object)null);
        ((ArrayList) term24079).add((Object)null);
        ((ArrayList) term24079).add((Object)null);
        ((ArrayList) term24079).add((Object)null);
        ((ArrayList) term24079).add((Object)null);
        ((ArrayList) term24079).add((Object)null);
        ((ArrayList) term24079).add((Object)null);
        LinkedHashMap term24084 = new LinkedHashMap();
        term24403 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term24404 = (Object[]) newArray("java.lang.Object", 10);
        Object term24067 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term24068 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term24083 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term24068, term24068.getClass(), "tagName", "");
        setBooleanField(term24068, term24068.getClass(), "isBlock", false);
        setBooleanField(term24068, term24068.getClass(), "formatAsBlock", true);
        setBooleanField(term24068, term24068.getClass(), "canContainBlock", true);
        setBooleanField(term24068, term24068.getClass(), "canContainInline", false);
        setBooleanField(term24068, term24068.getClass(), "empty", false);
        setBooleanField(term24068, term24068.getClass(), "selfClosing", true);
        setBooleanField(term24068, term24068.getClass(), "preserveWhitespace", true);
        setBooleanField(term24068, term24068.getClass(), "formList", true);
        setBooleanField(term24068, term24068.getClass(), "formSubmit", true);
        setField(term24067, term24067.getClass(), "tag", term24068);
        setField(term24067, term24067.getClass(), "parentNode", null);
        setField(term24067, term24067.getClass(), "childNodes", term24079);
        setField(term24083, term24083.getClass(), "attributes", term24084);
        setField(term24067, term24067.getClass(), "attributes", term24083);
        setField(term24067, term24067.getClass(), "baseUri", "WVbxuoDBcn");
        setIntField(term24067, term24067.getClass(), "siblingIndex", 579005622);
        setElement(term24404, 0, term24067);
        setField(term24403, term24403.getClass(), "elementData", term24404);
        setIntField(term24403, term24403.getClass(), "size", 1);
        setIntField(term24403, term24403.getClass(), "modCount", 1);
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
        assertTrue(recursiveEquals(term3728, term24407));
        assertTrue(recursiveEquals(retValue, term24403));
    }

};


