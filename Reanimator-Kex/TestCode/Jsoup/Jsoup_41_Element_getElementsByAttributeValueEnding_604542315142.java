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

public class Element_getElementsByAttributeValueEnding_604542315142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3960;
     Object term25540;
     Object term25536;

    public Element_getElementsByAttributeValueEnding_604542315142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3983 = new ArrayList();
        ((ArrayList) term3983).add((Object)null);
        LinkedHashMap term3988 = new LinkedHashMap();
        term3960 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3961 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3987 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3961, term3961.getClass(), "tagName", "ywmcuThdfL");
        setBooleanField(term3961, term3961.getClass(), "isBlock", false);
        setBooleanField(term3961, term3961.getClass(), "formatAsBlock", false);
        setBooleanField(term3961, term3961.getClass(), "canContainBlock", true);
        setBooleanField(term3961, term3961.getClass(), "canContainInline", false);
        setBooleanField(term3961, term3961.getClass(), "empty", false);
        setBooleanField(term3961, term3961.getClass(), "selfClosing", true);
        setBooleanField(term3961, term3961.getClass(), "preserveWhitespace", true);
        setBooleanField(term3961, term3961.getClass(), "formList", false);
        setBooleanField(term3961, term3961.getClass(), "formSubmit", false);
        setField(term3960, term3960.getClass(), "tag", term3961);
        setField(term3960, term3960.getClass(), "parentNode", null);
        setField(term3960, term3960.getClass(), "childNodes", term3983);
        setField(term3987, term3987.getClass(), "attributes", term3988);
        setField(term3960, term3960.getClass(), "attributes", term3987);
        setField(term3960, term3960.getClass(), "baseUri", "vvoLrMGCoN");
        setIntField(term3960, term3960.getClass(), "siblingIndex", 1632125673);
        ArrayList term25544 = new ArrayList();
        ((ArrayList) term25544).add((Object)null);
        LinkedHashMap term25547 = new LinkedHashMap();
        term25540 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term25541 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term25546 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term25541, term25541.getClass(), "tagName", "ywmcuThdfL");
        setBooleanField(term25541, term25541.getClass(), "isBlock", false);
        setBooleanField(term25541, term25541.getClass(), "formatAsBlock", false);
        setBooleanField(term25541, term25541.getClass(), "canContainBlock", true);
        setBooleanField(term25541, term25541.getClass(), "canContainInline", false);
        setBooleanField(term25541, term25541.getClass(), "empty", false);
        setBooleanField(term25541, term25541.getClass(), "selfClosing", true);
        setBooleanField(term25541, term25541.getClass(), "preserveWhitespace", true);
        setBooleanField(term25541, term25541.getClass(), "formList", false);
        setBooleanField(term25541, term25541.getClass(), "formSubmit", false);
        setField(term25540, term25540.getClass(), "tag", term25541);
        setField(term25540, term25540.getClass(), "parentNode", null);
        setField(term25540, term25540.getClass(), "childNodes", term25544);
        setField(term25546, term25546.getClass(), "attributes", term25547);
        setField(term25540, term25540.getClass(), "attributes", term25546);
        setField(term25540, term25540.getClass(), "baseUri", "vvoLrMGCoN");
        setIntField(term25540, term25540.getClass(), "siblingIndex", 1632125673);
        term25536 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term25537 = (Object[]) newArray("java.lang.Object", 0);
        setField(term25536, term25536.getClass(), "elementData", term25537);
        setIntField(term25536, term25536.getClass(), "size", 0);
        setIntField(term25536, term25536.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "pXdglvyrQe";
        args[1] = "OcfNzHYdki";
        Object retValue = callMethod(klass, "getElementsByAttributeValueEnding", argTypes, term3960, args);
        assertTrue(recursiveEquals(term3960, term25540));
        assertTrue(recursiveEquals(retValue, term25536));
    }

};


