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

public class Element_getElementById_402338892142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3430;
     Object term22996;

    public Element_getElementById_402338892142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3452 = new ArrayList();
        ((ArrayList) term3452).add((Object)null);
        ((ArrayList) term3452).add((Object)null);
        ((ArrayList) term3452).add((Object)null);
        ((ArrayList) term3452).add((Object)null);
        LinkedHashMap term3457 = new LinkedHashMap();
        term3430 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3431 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3456 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3431, term3431.getClass(), "tagName", "pJbnHTYrxn");
        setBooleanField(term3431, term3431.getClass(), "isBlock", true);
        setBooleanField(term3431, term3431.getClass(), "formatAsBlock", true);
        setBooleanField(term3431, term3431.getClass(), "canContainInline", true);
        setBooleanField(term3431, term3431.getClass(), "empty", false);
        setBooleanField(term3431, term3431.getClass(), "selfClosing", true);
        setBooleanField(term3431, term3431.getClass(), "preserveWhitespace", true);
        setBooleanField(term3431, term3431.getClass(), "formList", false);
        setBooleanField(term3431, term3431.getClass(), "formSubmit", true);
        setField(term3430, term3430.getClass(), "tag", term3431);
        setField(term3430, term3430.getClass(), "parentNode", null);
        setField(term3430, term3430.getClass(), "childNodes", term3452);
        setField(term3456, term3456.getClass(), "attributes", term3457);
        setField(term3430, term3430.getClass(), "attributes", term3456);
        setField(term3430, term3430.getClass(), "baseUri", "PqtVXXZMqK");
        setIntField(term3430, term3430.getClass(), "siblingIndex", -817164822);
        ArrayList term23000 = new ArrayList();
        ((ArrayList) term23000).add((Object)null);
        ((ArrayList) term23000).add((Object)null);
        ((ArrayList) term23000).add((Object)null);
        ((ArrayList) term23000).add((Object)null);
        LinkedHashMap term23003 = new LinkedHashMap();
        term22996 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term22997 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term23002 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term22997, term22997.getClass(), "tagName", "pJbnHTYrxn");
        setBooleanField(term22997, term22997.getClass(), "isBlock", true);
        setBooleanField(term22997, term22997.getClass(), "formatAsBlock", true);
        setBooleanField(term22997, term22997.getClass(), "canContainInline", true);
        setBooleanField(term22997, term22997.getClass(), "empty", false);
        setBooleanField(term22997, term22997.getClass(), "selfClosing", true);
        setBooleanField(term22997, term22997.getClass(), "preserveWhitespace", true);
        setBooleanField(term22997, term22997.getClass(), "formList", false);
        setBooleanField(term22997, term22997.getClass(), "formSubmit", true);
        setField(term22996, term22996.getClass(), "tag", term22997);
        setField(term22996, term22996.getClass(), "parentNode", null);
        setField(term22996, term22996.getClass(), "childNodes", term23000);
        setField(term23002, term23002.getClass(), "attributes", term23003);
        setField(term22996, term22996.getClass(), "attributes", term23002);
        setField(term22996, term22996.getClass(), "baseUri", "PqtVXXZMqK");
        setIntField(term22996, term22996.getClass(), "siblingIndex", -817164822);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "rYbtIDVdnd";
        Object retValue = callMethod(klass, "getElementById", argTypes, term3430, args);
        assertTrue(recursiveEquals(term3430, term22996));
        assertTrue(recursiveEquals(retValue, null));
    }

};


