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
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_ownText_186502842968 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5721;
     Object term5773;

    public Element_ownText_186502842968() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5744 = new ArrayList();
        ((ArrayList) term5744).add((Object)null);
        ((ArrayList) term5744).add((Object)null);
        ((ArrayList) term5744).add((Object)null);
        ((ArrayList) term5744).add((Object)null);
        ((ArrayList) term5744).add((Object)null);
        ((ArrayList) term5744).add((Object)null);
        ((ArrayList) term5744).add((Object)null);
        ((ArrayList) term5744).add((Object)null);
        LinkedHashMap term5749 = new LinkedHashMap();
        term5721 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5722 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5748 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5722, term5722.getClass(), "tagName", "FbSIUZyBXZ");
        setBooleanField(term5722, term5722.getClass(), "isBlock", false);
        setBooleanField(term5722, term5722.getClass(), "formatAsBlock", false);
        setBooleanField(term5722, term5722.getClass(), "canContainBlock", false);
        setBooleanField(term5722, term5722.getClass(), "canContainInline", false);
        setBooleanField(term5722, term5722.getClass(), "empty", true);
        setBooleanField(term5722, term5722.getClass(), "selfClosing", true);
        setBooleanField(term5722, term5722.getClass(), "preserveWhitespace", true);
        setBooleanField(term5722, term5722.getClass(), "formList", true);
        setBooleanField(term5722, term5722.getClass(), "formSubmit", true);
        setField(term5721, term5721.getClass(), "tag", term5722);
        setField(term5721, term5721.getClass(), "parentNode", null);
        setField(term5721, term5721.getClass(), "childNodes", term5744);
        setField(term5748, term5748.getClass(), "attributes", term5749);
        setField(term5721, term5721.getClass(), "attributes", term5748);
        setField(term5721, term5721.getClass(), "baseUri", "dtGZCsKXbW");
        setIntField(term5721, term5721.getClass(), "siblingIndex", 1555897383);
        term5773 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term5774 = (byte[]) newByteArray(16);
        setField(term5773, term5773.getClass(), "value", term5774);
        setByteField(term5773, term5773.getClass(), "coder", (byte) 47);
        setIntField(term5773, term5773.getClass(), "count", 202001407);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        Object[] args = new Object[1];
        args[0] = term5773;
        callMethod(klass, "ownText", argTypes, term5721, args);
    }

};


