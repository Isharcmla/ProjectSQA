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
     Object term25932;
     Object term25928;

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
        ArrayList term25936 = new ArrayList();
        ((ArrayList) term25936).add((Object)null);
        ((ArrayList) term25936).add((Object)null);
        ((ArrayList) term25936).add((Object)null);
        ((ArrayList) term25936).add((Object)null);
        ((ArrayList) term25936).add((Object)null);
        ((ArrayList) term25936).add((Object)null);
        LinkedHashMap term25939 = new LinkedHashMap();
        term25932 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term25933 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term25938 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term25933, term25933.getClass(), "tagName", "uPuCVuZYOI");
        setBooleanField(term25933, term25933.getClass(), "isBlock", false);
        setBooleanField(term25933, term25933.getClass(), "formatAsBlock", false);
        setBooleanField(term25933, term25933.getClass(), "canContainBlock", false);
        setBooleanField(term25933, term25933.getClass(), "canContainInline", true);
        setBooleanField(term25933, term25933.getClass(), "empty", false);
        setBooleanField(term25933, term25933.getClass(), "selfClosing", true);
        setBooleanField(term25933, term25933.getClass(), "preserveWhitespace", false);
        setBooleanField(term25933, term25933.getClass(), "formList", false);
        setBooleanField(term25933, term25933.getClass(), "formSubmit", true);
        setField(term25932, term25932.getClass(), "tag", term25933);
        setField(term25932, term25932.getClass(), "parentNode", null);
        setField(term25932, term25932.getClass(), "childNodes", term25936);
        setField(term25938, term25938.getClass(), "attributes", term25939);
        setField(term25932, term25932.getClass(), "attributes", term25938);
        setField(term25932, term25932.getClass(), "baseUri", "iCCsaLHohG");
        setIntField(term25932, term25932.getClass(), "siblingIndex", 454281060);
        term25928 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term25929 = (Object[]) newArray("java.lang.Object", 0);
        setField(term25928, term25928.getClass(), "elementData", term25929);
        setIntField(term25928, term25928.getClass(), "size", 0);
        setIntField(term25928, term25928.getClass(), "modCount", 0);
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
        assertTrue(recursiveEquals(term4076, term25932));
        assertTrue(recursiveEquals(retValue, term25928));
    }

};


