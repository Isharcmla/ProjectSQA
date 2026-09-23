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

public class Element_getElementsByAttributeValueContaining_46475118143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4076;
     Object term26107;
     Object term26103;

    public Element_getElementsByAttributeValueContaining_46475118143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4099 = new ArrayList();
        ((ArrayList) term4099).add((Object)null);
        ((ArrayList) term4099).add((Object)null);
        ((ArrayList) term4099).add((Object)null);
        ((ArrayList) term4099).add((Object)null);
        ((ArrayList) term4099).add((Object)null);
        ((ArrayList) term4099).add((Object)null);
        LinkedHashMap term4104 = new LinkedHashMap();
        term4076 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4077 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4103 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term4077, term4077.getClass(), "tagName", "uPuCVuZYOI");
        setBooleanField(term4077, term4077.getClass(), "isBlock", false);
        setBooleanField(term4077, term4077.getClass(), "formatAsBlock", false);
        setBooleanField(term4077, term4077.getClass(), "canContainBlock", false);
        setBooleanField(term4077, term4077.getClass(), "canContainInline", true);
        setBooleanField(term4077, term4077.getClass(), "empty", false);
        setBooleanField(term4077, term4077.getClass(), "selfClosing", true);
        setBooleanField(term4077, term4077.getClass(), "preserveWhitespace", false);
        setBooleanField(term4077, term4077.getClass(), "formList", false);
        setBooleanField(term4077, term4077.getClass(), "formSubmit", true);
        setField(term4076, term4076.getClass(), "tag", term4077);
        setField(term4076, term4076.getClass(), "parentNode", null);
        setField(term4076, term4076.getClass(), "childNodes", term4099);
        setField(term4103, term4103.getClass(), "attributes", term4104);
        setField(term4076, term4076.getClass(), "attributes", term4103);
        setField(term4076, term4076.getClass(), "baseUri", "iCCsaLHohG");
        setIntField(term4076, term4076.getClass(), "siblingIndex", 454281060);
        ArrayList term26111 = new ArrayList();
        ((ArrayList) term26111).add((Object)null);
        ((ArrayList) term26111).add((Object)null);
        ((ArrayList) term26111).add((Object)null);
        ((ArrayList) term26111).add((Object)null);
        ((ArrayList) term26111).add((Object)null);
        ((ArrayList) term26111).add((Object)null);
        LinkedHashMap term26114 = new LinkedHashMap();
        term26107 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term26108 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term26113 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term26108, term26108.getClass(), "tagName", "uPuCVuZYOI");
        setBooleanField(term26108, term26108.getClass(), "isBlock", false);
        setBooleanField(term26108, term26108.getClass(), "formatAsBlock", false);
        setBooleanField(term26108, term26108.getClass(), "canContainBlock", false);
        setBooleanField(term26108, term26108.getClass(), "canContainInline", true);
        setBooleanField(term26108, term26108.getClass(), "empty", false);
        setBooleanField(term26108, term26108.getClass(), "selfClosing", true);
        setBooleanField(term26108, term26108.getClass(), "preserveWhitespace", false);
        setBooleanField(term26108, term26108.getClass(), "formList", false);
        setBooleanField(term26108, term26108.getClass(), "formSubmit", true);
        setField(term26107, term26107.getClass(), "tag", term26108);
        setField(term26107, term26107.getClass(), "parentNode", null);
        setField(term26107, term26107.getClass(), "childNodes", term26111);
        setField(term26113, term26113.getClass(), "attributes", term26114);
        setField(term26107, term26107.getClass(), "attributes", term26113);
        setField(term26107, term26107.getClass(), "baseUri", "iCCsaLHohG");
        setIntField(term26107, term26107.getClass(), "siblingIndex", 454281060);
        term26103 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term26104 = (Object[]) newArray("java.lang.Object", 0);
        setField(term26103, term26103.getClass(), "elementData", term26104);
        setIntField(term26103, term26103.getClass(), "size", 0);
        setIntField(term26103, term26103.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "NJhGgctbdj";
        args[1] = "MYWYUeLGOp";
        Object retValue = callMethod(klass, "getElementsByAttributeValueContaining", argTypes, term4076, args);
        assertTrue(recursiveEquals(term4076, term26107));
        assertTrue(recursiveEquals(retValue, term26103));
    }

};


